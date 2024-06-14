
package edu.unisabana.consoleview;

import edu.unisabana.model.ExcepcionParametrosInvalidos;

import edu.unisabana.model.Ingrediente;
import edu.unisabana.model.Tamano;
import edu.unisabana.model.Tipo;
import edu.unisabana.model.amasador.Amasador;
import edu.unisabana.model.moldeador.Moldeador;
import edu.unisabana.model.horneador.Horneador;

import edu.unisabana.model.fabrica.FabricaPizza;
import edu.unisabana.model.fabrica.FabricaPizzaDelgada;
import edu.unisabana.model.fabrica.FabricaPizzaGruesa;
import edu.unisabana.model.fabrica.FabricaPizzaIntegral;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreparadorPizza {

  public static void main(String args[]){
    try {
      Ingrediente[] ingredientes = new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
      PreparadorPizza pp = new PreparadorPizza();            
      pp.prepararPizza(ingredientes, Tamano.PEQUENO, Tipo.INTEGRAL);
    } catch (ExcepcionParametrosInvalidos ex) {
      Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
    }
  }
    
    
  public void prepararPizza(Ingrediente[] ingredientes, Tamano tam, Tipo tipo) throws ExcepcionParametrosInvalidos {

    try {
      FabricaPizza fabricaPizza = null;
      switch (tipo) {
        case DELGADA:
          fabricaPizza = new FabricaPizzaDelgada();
        break;
        case GRUESA:
          fabricaPizza = new FabricaPizzaGruesa();
        break;
        case INTEGRAL:
          fabricaPizza = new FabricaPizzaIntegral();
        break;
      }

      Amasador amasador = fabricaPizza.crearAmasador();
      Moldeador moldeador = fabricaPizza.crearMoldeador();
      Horneador horneador = fabricaPizza.crearHorneador();

      amasador.amasar();
      if (tam == Tamano.PEQUENO) {
        moldeador.moldearPizzaPequeña();
      } else if (tam == Tamano.MEDIANO) {
        moldeador.moldearPizzaMediana();
      } else {
        throw new ExcepcionParametrosInvalidos("Tamano de pizza invalido : " + tam);
      }
      aplicarIngredientes(ingredientes);
      horneador.hornear();
    } catch (ExcepcionParametrosInvalidos ex) {
      Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
    }

  }

  private void aplicarIngredientes(Ingrediente[] ingredientes) {
    Logger
      .getLogger(PreparadorPizza.class.getName())
      .log(Level.INFO, "APLICANDO INGREDIENTES!: {0}", Arrays.toString(ingredientes));
  }

}
