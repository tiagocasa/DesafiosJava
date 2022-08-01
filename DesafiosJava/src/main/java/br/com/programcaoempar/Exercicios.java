package br.com.programcaoempar;

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
}
