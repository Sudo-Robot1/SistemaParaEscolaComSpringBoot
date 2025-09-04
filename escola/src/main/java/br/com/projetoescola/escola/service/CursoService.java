package br.com.projetoescola.escola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoescola.escola.entity.Curso;
import br.com.projetoescola.escola.repository.CursoRepository;

@Service
public class CursoService {
    // injecçâo do repositório do curso

    @Autowired
    private CursoRepository cursoRepository;

    //método para salvar um curso

    public Curso save(Curso curso){
        return cursoRepository.save(curso);
    }

    //método para listar

    public List<Curso> findAll(){
        return cursoRepository.findAll();
    }
}
