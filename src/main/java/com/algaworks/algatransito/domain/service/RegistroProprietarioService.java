package com.algaworks.algatransito.domain.service;

import com.algaworks.algatransito.domain.exception.NegocioException;
import com.algaworks.algatransito.domain.model.Proprietario;
import com.algaworks.algatransito.domain.repository.ProprietarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class RegistroProprietarioService {

    private final ProprietarioRepository proprietarioRepository;

    @Transactional
    public Proprietario salvar(Proprietario proprietario) {
        // Se o proprietário retornado pelo FindByEmail, se ele for o mesmo proprietário que estamos recebendo como argumento, quer dizer que podemos ignorar (para atualização)
        boolean emailEmUso = proprietarioRepository.findByEmail(proprietario.getEmail())
                .filter(p -> !p.equals(proprietario)) // Se o p dentro do Optional, for diferente do proprietário recebido como argumento, se ele for diferente, pode verificar se tem algo dentro do Optional ou não.
                .isPresent();

        if (emailEmUso) {
            throw new NegocioException("Já existe um proprietário cadastrado com esse email");
        }

        return proprietarioRepository.save(proprietario);
    }

    @Transactional
    public void exluir(Long proprietarioId) {
        proprietarioRepository.deleteById(proprietarioId);
    }
}
