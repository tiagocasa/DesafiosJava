package br.com.programcaoempar;

import java.util.*;

public class Exercicios {
    public Integer areaRetangulo(int base, int altura) {
        return base*altura;
    }
    public Integer perimetroRetangulo(int base, int altura) {
        return (base*2)+(altura*2);
    }
    public Integer areaQuadrado(int base, int altura) {
        return base*altura;
    }
    public int perimetroQuadrado(int base, int altura) {
        return (base*2)+(altura*2);
    }
    public double areaCirculo(int raio) {
        return Math.PI*Math.pow(raio,2);
    }
    public double perimetroCirculo(int raio) {
        return 2*Math.PI*raio;
    }

    public int perimetroTriangulo(int ladoa, int ladob, int ladoc) {
        return ladoa+ladob+ladoc;
    }

    public int sucessor(int numero) {
        numero++;
        return numero;
    }

    public int quociente(int numeroa, int numerob) {
        return numeroa/numerob;
    }

    public int restoDivisao(int numeroa, int numerob){
        return numeroa%numerob;
    }

    public int idadeAnos(int idade) {
        return idade/365;
    }
    public int idadeMeses(int idade) {
        return (idade%365)/30;
    }
    public int idadeDias(int idade) {
        return (idade%365)%30;
    }

    public int fahrenheitToCelsius(int tempFahr) {
        return (5/9)*(tempFahr-32);
    }

    public double volumeLata(int raio, int altura) {
        return areaCirculo(raio) * altura;
    }

    public int convertToBinary(int inteiro) {
        ArrayList<Integer> binario = new ArrayList<Integer>();
        String binarioFinal = "";
        int i=0;
        while (inteiro>0){
            if(inteiro%2 == 0){
                binario.add(0);
            }else{
                binario.add(1);
            }
            inteiro /= 2;
            i++;
        }
        for (i= binario.size()-1;i>=0;i--){
            binarioFinal = binarioFinal+ binario.get(i).toString();
        }
        return Integer.parseInt(binarioFinal);
    }


    public int notaSemestral(int provaUmPriBi, int provaDoisPriBi, int provaUmSegBi, int provaDoisSegBi) {
        int notaPriBi = (provaUmPriBi + provaDoisPriBi)/2;
        int notaSegBi = (provaUmSegBi + provaDoisSegBi)/2;
        return (notaPriBi+notaSegBi)/2;
    }

    public float velocidadeToKMH(float velocidadeMPS) {
        return velocidadeMPS*3.6f;
    }

    public float circuitoEletrico(float r1, float r2, float r3) {
        return (r1*r2/(r1+r2))+r3;
    }

    public int tempoSemafaro(int acelaracao, int distancia, int velocidadeMax) {
        int tempoVelocidadeMax = velocidadeMax/acelaracao;
        int tempoDistancia = distancia/velocidadeMax;
        return tempoVelocidadeMax+tempoDistancia;
    }

    public int alturaPredio(int sombraPredio, int sombraPessoa, int alturaPessoa) {
        return sombraPredio*alturaPessoa/sombraPessoa;
    }

    public int inverterNumero(int numero) {
        int novoNum = 0;
        while (numero > 0){
            novoNum = novoNum * 10+numero%10;
            numero /= 10;
        }
        return novoNum;
    }

    public String saqueOtimo(int saque) {
        ArrayList<Integer> notas = new ArrayList<>(Arrays.asList(100,50,20,10,5,2,1));
        ArrayList<Integer> notasSaque = new ArrayList<>();

        while (saque>0){
            if(saque>notas(0))
        }

        if(saque>=100){
            notas100 = saque/100;
            saque%=100;
        }
        if(saque>=50){
            notas50 = saque/50;
            saque%=50;
        }
        if(saque>=20){
            notas20 = saque/20;
            saque%=20;
        }
        if(saque>=10){
            notas10 = saque/10;
            saque%=10;
        }
        if(saque>=5){
            notas5 = saque/5;
            saque%=5;
        }
        if(saque>=2){
            notas2 = saque/2;
            saque%=2;
        }
        if(saque==1){
            notas1 = saque;
        }
        return "(100:"+notas100+",50:"+notas50+",20:"+notas20+",10:"+notas10+",5:"+notas5+",2:"+notas2+",1:"+notas1+")";
    }
}
