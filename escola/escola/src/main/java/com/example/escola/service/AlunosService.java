package com.example.escola.service;

import com.example.escola.DTO.AlunosRequestDTO;
import com.example.escola.DTO.AlunosResponseDTO;
import com.example.escola.model.AlunosModel;
import com.example.escola.repository.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunosService {
    @Autowired
    private AlunosRepository repository;

    public List<AlunosResponseDTO> listarTodos(){
    return repository.findAll().stream()
            .map(aluno -> new AlunosResponseDTO(
                    aluno.getNomeAluno(),
                    aluno.getRa(),
                    aluno.getIdade(),
                    aluno.getCurso(),
                    aluno.getSemestre(),
                    aluno.getTurno()))
            .collect(Collectors.toList());
    }

    public AlunosResponseDTO salvarAlunos(AlunosRequestDTO dto) {
        if (repository.findByRa(dto.getra()).isPresent()) {
            throw new RuntimeException("Número do RA já cadastrado");
        }
        AlunosModel novoAluno = new AlunosModel();
        novoAluno.setNomeAluno(dto.getNomeAluno());
        novoAluno.setRa(dto.getra());
        novoAluno.setIdade(dto.getIdade());
        novoAluno.setCurso(dto.getCurso());
        novoAluno.setSemestre(dto.getSemestre());
        novoAluno.setTurno(dto.getTurno());

        AlunosModel salvo = repository.save(novoAluno);
        return new AlunosResponseDTO(salvo.getNomeAluno(), salvo.getRa(), salvo.getIdade(), salvo.getCurso(), salvo.getSemestre(), salvo.getTurno());
    }

    public void atualizar(Long id,AlunosRequestDTO dto){
        AlunosModel alunos = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Aluno não encontrado"));

        alunos.setNomeAluno(dto.getNomeAluno());
        alunos.setRa(dto.getra());
        alunos.setIdade(dto.getIdade());
        alunos.setCurso(dto.getCurso());
        alunos.setSemestre(dto.getSemestre());
        alunos.setTurno(dto.getTurno());

        repository.save(alunos);
    }

    public void excluir(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Aluno não encontrado");
        }
        repository.deleteById(id);
    }
}

