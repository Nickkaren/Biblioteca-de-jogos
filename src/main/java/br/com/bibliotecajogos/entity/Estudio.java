package br.com.bibliotecajogos.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Estudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String pais;
    private String siteUrl;

    @OneToMany(mappedBy = "estudio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Jogo> jogos = new ArrayList<>();


    public Estudio() {}

    public Estudio(String nome, String pais, String siteUrl) {
        this.nome = nome;
        this.pais = pais;
        this.siteUrl = siteUrl;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getSiteUrl() { return siteUrl; }
    public void setSiteUrl(String siteUrl) { this.siteUrl = siteUrl; }

    public List<Jogo> getJogos() { return jogos; }
    public void setJogos(List<Jogo> jogos) { this.jogos = jogos; }
}
