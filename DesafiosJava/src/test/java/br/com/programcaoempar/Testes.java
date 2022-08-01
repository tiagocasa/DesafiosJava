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
    assertEquals(20,exe.areaQuadrado(base,altura));
    assertEquals(18,exe.perimetroQuadrado(base,altura));
}

@Test
    void testeExercicio3(){
        int raio = 2;
        assertEquals(12.566370614359172,exe.areaCirculo(raio));
        assertEquals(12.566370614359172,exe.perimetroCirculo(raio));
}

}
