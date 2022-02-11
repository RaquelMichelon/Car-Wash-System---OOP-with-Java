/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp;

import entity.Cor;
import entity.ECategoria;
import entity.Marca;
import entity.Modelo;
import entity.PessoaFisica;
import entity.PessoaJuridica;
import entity.Veiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author raqueldarellimichelon
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        System.out.println("\n************* LAVAÇÃO DE VEÍCULOS **************\n\n");
        System.out.println("--------------------------------------------------\n");
        System.out.println("*** Sistema para Cadastro de Carros e Clientes ***\n");
        System.out.println("*********************** PF ***********************\n");
        System.out.println("--------------------------------------------------\n");

        Scanner entradaC1 = new Scanner(System.in);
        
            
        //DADOS DO CLIENTE pf1

        //classe abstrata usada para declarar variavel e 
        //classe concreta que é subtipo da classe abstrata é usada para instanciar objeto
        //Cliente pf1 = new PessoaFisica();

        PessoaFisica pf1 = new PessoaFisica();

        System.out.print("Digite o nome do(a) cliente: ");
        pf1.setNome(entradaC1.nextLine());
        pf1.setId(1);
        System.out.print("Digite o celular para contato do(a) cliente: ");
        pf1.setCelular(entradaC1.nextLine());
        System.out.print("Informe o email do(a) cliente: ");
        pf1.setEmail(entradaC1.nextLine());
        System.out.print("Informe o cpf do(a) cliente: ");
        pf1.setCpf(entradaC1.nextLine());
        System.out.print("Informe a data de Nasc. do(a) cliente <dd/mm/yyy>: ");
        String dataNasc = entradaC1.next();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        pf1.setDataNascimento(sdf1.parse(dataNasc));
        pf1.setDataCadastro(new Date());
        
        //DADOS DO VEÍCULO 1
        Scanner entradaV1 = new Scanner(System.in);

        System.out.print("Digite a marca do veículo: ");
        Marca marca1 = new Marca(entradaV1.nextLine());
        marca1.setId(1);
        
        System.out.print("Digite o modelo do veículo: ");
        Modelo modelo1 = new Modelo(entradaV1.nextLine(), marca1);
        //ECategoria é PADRAO por enquanto
        modelo1.setId(1);
        
        System.out.print("Digite a cor do veículo: ");
        Cor cor1 = new Cor(entradaV1.nextLine());
        cor1.setId(1);
        
        System.out.print("Digite a placa do veículo: ");
        Veiculo veiculo1 = new Veiculo(entradaV1.nextLine(), modelo1);
        veiculo1.setId(1);
        veiculo1.setCor(cor1);
        System.out.print("Digite as observações sobre o veículo: ");
        veiculo1.setObservacoes(entradaV1.nextLine());
        
        //associando veiculo1 a pf1
        pf1.add(veiculo1);

        System.out.println("--------------------------------------------------\n");
        System.out.println("*** Sistema para Cadastro de Carros e Clientes ***\n");
        System.out.println("*********************** PJ ***********************\n");
        System.out.println("--------------------------------------------------\n");
        
        //DADOS DO CLIENTE pj1
        Scanner entradaC2 = new Scanner(System.in);
        PessoaJuridica pj1 = new PessoaJuridica();

        System.out.print("Digite o nome do(a) cliente: ");
        pj1.setNome(entradaC2.nextLine());
        pj1.setId(2);
        System.out.print("Digite o celular para contato do(a) cliente: ");
        pj1.setCelular(entradaC2.nextLine());
        System.out.print("Informe o email do(a) cliente: ");
        pj1.setEmail(entradaC2.nextLine());
        System.out.print("Informe o cnpj da empresa cliente: ");
        pj1.setCnpj(entradaC2.nextLine());
        System.out.print("Informe a inscrição estadual da empresa cliente: ");
        pj1.setInscricaoEstadual(entradaC2.nextLine());
        pj1.setDataCadastro(new Date());
        
        //DADOS DO VEÍCULO 2
        Scanner entradaV2 = new Scanner(System.in);

        System.out.print("Digite a marca do veículo: ");
        Marca marca2 = new Marca();
        marca2.setNome(entradaV2.nextLine());
        marca2.setId(2);
        
        System.out.print("Digite o modelo do veículo: ");
        Modelo modelo2 = new Modelo();
        modelo2.setDescricao(entradaV2.nextLine());
        modelo2.setMarca(marca2);
        modelo2.seteCategoria(ECategoria.PEQUENO);
        modelo2.setId(2);
        
        System.out.print("Digite a cor do veículo: ");
        Cor cor2 = new Cor();
        cor2.setNome(entradaV2.nextLine());
        cor2.setId(2);
        
        System.out.print("Digite a placa do veículo: ");
        Veiculo veiculo2 = new Veiculo(entradaV2.nextLine());
        veiculo2.setModelo(modelo2);
        veiculo2.setId(2);
        veiculo2.setCor(cor2);
        System.out.print("Digite as observações sobre o veículo: ");
        veiculo2.setObservacoes(entradaV2.nextLine());
        
        
        //DADOS DO VEÍCULO 3
        Scanner entradaV3 = new Scanner(System.in);

        System.out.print("\nDigite a marca do segundo veículo: ");
        Marca marca3 = new Marca();
        marca3.setNome(entradaV3.nextLine());
        marca3.setId(3);
        
        System.out.print("Digite o modelo do veículo: ");
        Modelo modelo3 = new Modelo();
        modelo3.setDescricao(entradaV3.nextLine());
        modelo3.setMarca(marca3);
        modelo3.seteCategoria(ECategoria.GRANDE);
        modelo3.setId(3);
        
        System.out.print("Digite a cor do veículo: ");
        Cor cor3 = new Cor();
        cor3.setNome(entradaV3.nextLine());
        cor3.setId(3);
        
        System.out.print("Digite a placa do veículo: ");
        Veiculo veiculo3 = new Veiculo();
        veiculo3.setPlaca(entradaV3.nextLine());
        veiculo3.setModelo(modelo3);
        veiculo3.setId(3);
        veiculo3.setCor(cor3);
        System.out.print("Digite as observações sobre o veículo: ");
        veiculo3.setObservacoes(entradaV3.nextLine());
        
        //imprimir dados resumidos de pj1
        print(pj1);
        
        //associando veiculo2 e veiculo3 a pj1
        pj1.add(veiculo2);
        pj1.add(veiculo3);


        //imprimir dados resumidos de pf1
        print(pf1);
        
        //remover veiculo 1 de pf1
        pf1.remove(veiculo1);
        
        //imprimir dados completos de pf1
        print(pf1, "dados completos");
        
        //imprimir dados resumidos de pj1
        print(pj1);
        
        //add veiculo 1 a pj1
        pj1.add(veiculo1);
        
        //imprimir dados completos de pj1
        print(pj1, "dados completos");

    }
    
            
    private static void print(PessoaFisica pf) {
        System.out.println("\n\n**** Dados Resumidos do Cliente ****\n" + pf.getDados());
    }
    
    private static void print(PessoaFisica pf, String observacao) {
        System.out.println("\n\n**** Dados Completos do Cliente ****\n" + pf.getDados(observacao));
    }
    
    private static void print(PessoaJuridica pj) {
        System.out.println("\n\n**** Dados Resumidos do Cliente ****\n" + pj.getDados());
    }
    
    private static void print(PessoaJuridica pj, String observacao) {
        System.out.println("\n\n**** Dados Completos do Cliente ****\n" + pj.getDados(observacao));
    }
    
}
