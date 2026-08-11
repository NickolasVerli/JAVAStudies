package com.ncv.funcionario.services;

import com.ncv.funcionario.models.FuncionarioModel;
import com.ncv.funcionario.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class FuncionarioServices {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel> findAll(){
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel buscarPorId (Long id){
        return funcionarioRepository.findById(id).get();
    }

    public FuncionarioModel criarPessoa(FuncionarioModel funcionarioModel){
        return funcionarioRepository.save(funcionarioModel);
    }
    //DELETAR
    public void deletar(Long id){
        funcionarioRepository.deleteById(id);
    }

    //update
    public  FuncionarioModel atualizar(Long id, FuncionarioModel funcionarioModel){
        FuncionarioModel func = funcionarioRepository.findById(id).get();
        func.setNome(funcionarioModel.getNome());
        func.setCpf(funcionarioModel.getCpf());
        return funcionarioRepository.save(func);
    }
}
