/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package entity;

/**
 *
 * @author raqueldarellimichelon
 */
public enum ECategoria {
    PEQUENO("pequeno"), 
    MEDIO("médio"), 
    GRANDE("grande"), 
    MOTO("moto"), 
    PADRAO("padrão");
    
    private String descricao;
    
    ECategoria(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}
