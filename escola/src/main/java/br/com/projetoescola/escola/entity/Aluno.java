package br.com.projetoescola.escola.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Aluno{

    //definição dos atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAluno;
    
    @Column(nullable = false, length = 40)
    private String nomeAluno;
    
    @Column(nullable = false, length = 11)
    private String telefoneAluno;
    
    @Column(nullable = false, length = 40)
    private String enderecoAluno;
    
    @Column(nullable = false)
    private Integer rmAluno;
    
    @Column(nullable = false, length = 11)
    private String cpfAluno;


    //método costrutor
    public Aluno() {
    }


    public Aluno(Integer idAluno, String nomeAluno, String telefoneAluno, String enderecoAluno, Integer rmAluno,
            String cpfAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.telefoneAluno = telefoneAluno;
        this.enderecoAluno = enderecoAluno;
        this.rmAluno = rmAluno;
        this.cpfAluno = cpfAluno;
    }


        //métodos getters e setters
        
    public Integer getIdAluno() {
        return idAluno;
    }


    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }


    public String getNomeAluno() {
        return nomeAluno;
    }


    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }


    public String getTelefoneAluno() {
        return telefoneAluno;
    }


    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }


    public String getEnderecoAluno() {
        return enderecoAluno;
    }


    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }


    public Integer getRmAluno() {
        return rmAluno;
    }


    public void setRmAluno(Integer rmAluno) {
        this.rmAluno = rmAluno;
    }


    public String getCpfAluno() {
        return cpfAluno;
    }


    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }
    


    
    

}

// repository
//service
//controller
//templates ---> alunos ---> criar pasta curso --> formulário e listar --. index gerenciar alunos