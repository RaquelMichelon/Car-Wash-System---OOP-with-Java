/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author raqueldarellimichelon
 */
public abstract class Cliente implements ICliente {
    
    private int id;
    private String nome;
    private String celular;
    private String email;
    private Date dataCadastro;
//    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Veiculo> veiculos;


    public Cliente() {
    }
    
    public void add(Veiculo veiculo) {
        if (this.veiculos == null) {
            this.veiculos = new ArrayList<>();
        }
        //inserir o veiculo em uma lista de veiculos do cliente
        veiculos.add(veiculo);
        //para amarrar o veiculo ao cliente
        veiculo.setCliente(this);
    }
    
    public void remove(Veiculo veiculo) {
        
        veiculos.remove(veiculo);
        //para desvincular o veiculo do cliente
        veiculo.setCliente(null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

}
