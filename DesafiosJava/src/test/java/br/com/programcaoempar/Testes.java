package br.com.programcaoempar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testes {

    Exercicios exe;
    @BeforeEach
    void inicializacao(){ exe = new Exercicios();}
    @Test
    void testeExercicio1(){
            int base = 4;
            int altura = 5;
        assertEquals(20,exe.areaRetangulo(base,altura));
        assertEquals(18,exe.perimetroRetangulo(base,altura));
    }
    @Test
    void testeExercicio2(){
        int base = 5;
        int altura = 5;
        assertEquals(25,exe.areaQuadrado(base,altura));
        assertEquals(20,exe.perimetroQuadrado(base,altura));
    }

    @Test
        void testeExercicio3(){
            int raio = 2;
            assertEquals(12.566370614359172,exe.areaCirculo(raio));
            assertEquals(12.566370614359172,exe.perimetroCirculo(raio));
    }
    @Test
    void testeExercicio4(){
        int ladoa = 2;
        int ladob = 3;
        int ladoc = 5;
        assertEquals(10,exe.perimetroTriangulo(ladoa,ladob,ladoc));
    }
    @Test
    void testeExercicio5(){
        int numero = 25;
        assertEquals(26,exe.sucessor(numero));
    }
    @Test
    void testeExercicio6(){
        int numeroa = 26;
        int numerob = 5;
        assertEquals(5,exe.quociente(numeroa,numerob));
        assertEquals(1,exe.restoDivisao(numeroa,numerob));
    }

    @Test
    void testeExercicio7(){
        int idade = 9256;
        assertEquals(25, exe.idadeAnos(idade));
        assertEquals(4, exe.idadeMeses(idade));
        assertEquals(11, exe.idadeDias(idade));
    }

    @Test
    void testeExercicio8(){
        int tempFahr = 100;
        assertEquals(0, exe.fahrenheitToCelsius(tempFahr));
    }

    @Test
    void testeExercicio9(){
        int raio = 5;
        int altura = 15;
        assertEquals(1178.0972450961724, exe.volumeLata(raio,altura));
    }

    @Test
    void testeExercicio10(){
        int inteiro = 30;
        assertEquals(11110,exe.convertToBinary(inteiro));
    }

    @Test
    void testeExercicio11(){
        int provaUmPriBi = 4;
        int provaDoisPriBi = 10;
        int provaUmSegBi = 6;
        int provaDoisSegBi = 8;
        assertEquals(7,exe.notaSemestral(provaUmPriBi,provaDoisPriBi,provaUmSegBi,provaDoisSegBi));
    }

    @Test
    void testeExercicio12(){
        float velocidadeMPS = 15;
        assertEquals(54,exe.velocidadeToKMH(velocidadeMPS));
    }

    @Test
    void testeExercicio13(){
        float r1 = 10;
        float r2 = 30;
        float r3 = 5;
        assertEquals(12.5,exe.circuitoEletrico(r1,r2,r3));
    }

    @Test
    void testeExercicio14(){
        int acelaracao = 2;      //  m/s²
        int distancia = 500;     //  metros
        int velocidadeMax = 12;  //  m/s
        assertEquals(47,exe.tempoSemafaro(acelaracao,distancia,velocidadeMax));
    }

    @Test
    void testeExercicio15(){
        int sombraPredio = 150;
        int sombraPessoa = 10;
        int alturaPessoa = 180;
        assertEquals(2700,exe.alturaPredio(sombraPredio,sombraPessoa,alturaPessoa));
    }

    @Test
    void testeExercicio16(){
        int numero = 498;
        assertEquals(894,exe.inverterNumero(numero));
    }

    @Test
    void testeExercicio17(){
        int saque = 549;
        assertEquals("(100:5,50:0,20:2,10:0,5:1,2:2,1:1)",exe.saqueOtimo(saque));
    }

}
