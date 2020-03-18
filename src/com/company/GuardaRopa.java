package com.company;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

  private Integer identificador;
  private Map<Integer, List<Prenda>> listaDePrendas;

  public GuardaRopa() {
    this.identificador = 0;
    this.listaDePrendas = new HashMap<Integer, List<Prenda>>();
  }


  public void mostrarPrendas(){
    for (Integer integer : listaDePrendas.keySet()) {
      System.out.println(listaDePrendas.get(integer));
    }
  }

  public void mostrarPrendasPorIdentificador(Integer identificador){
    System.out.println(this.listaDePrendas.get(identificador));
  }



  public Integer guardarPrendas(List<Prenda> listaDePrenda){
    this.identificador++;
    this.listaDePrendas.put(this.identificador, listaDePrenda);
    System.out.println("Se han guardado sus prendas. Su número de guardado es " + this.identificador);
    return this.identificador;
  }

  public List<Prenda> devolverPrendas(Integer identificador){

    //se guarda en una variable local lo que devuelve el get de la lista general con el identificador pasado como parametro
    List<Prenda> prendasSolicitadas = this.listaDePrendas.get(identificador);
    //se saca de la lista general las prendas que devuelven el get con el identificador
    this.listaDePrendas.remove(prendasSolicitadas);
    //se devuelven los resultados
    System.out.println("Se devuelve la lista de prendas correspondiente al numero de guardado " + identificador);
    return prendasSolicitadas;

  }

  public Integer getIdentificador() {
    return identificador;
  }



}
