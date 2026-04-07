package utils;

public class BMW implements Carro {
    @Override
    public void ligar() {
        System.out.println("Ligando BMW");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando BMW");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando BMW");
    }

    @Override
    public void frear() {
        System.out.println("Freando BMW");
    }
}
