package com.rodrigo.pedro;
import com.rodrigo.pedro.models.*;

public class Main {
  public static void main(String[] args) {
    Moto moto = new Moto("Kawasaki", "Ninja", 2024, "Reto");
    Carro carro = new Carro("Fiat", "Uno", 1980, 2);

    moto.setAno(2022);
    carro.setModelo("Mobi");

    System.out.println(moto.exibirDetalhes());
    System.out.println(carro.exibirDetalhes());
  }
}
