package br.com.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "User")
@Table(name = "TUSER")
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "SEQ_TUSER", strategy = GenerationType.AUTO)
    @Column(name = "CODUSU", nullable = false, unique = true)
    private int codigo;

    @Column(name = "LOGIN", length = 20, nullable = false, unique = true)
    private String login;

    @Column(name = "SENHA", length = 60, nullable = false)
    private String senha;

    @Column(name = "NOME", length = 80, nullable = false)
    private String nome;

    @Column(name = "ATIVO", nullable = false)
    private Character ativo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getAtivo() {
        return ativo;
    }

    public void setAtivo(Character ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "User{" +
                "codigo=" + codigo +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
