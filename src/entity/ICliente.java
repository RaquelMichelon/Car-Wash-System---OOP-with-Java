/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package entity;

/**
 *
 * @author raqueldarellimichelon
 */
public interface ICliente {
    
    //a palavra abstract é opcional em interfaces
    public abstract String getDados();
    
    public abstract String  getDados(String observacao);
    
}
