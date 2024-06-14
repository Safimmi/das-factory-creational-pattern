package edu.unisabana.model.moldeador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaDelgada implements Moldeador{

  @Override
  public void moldearPizzaPequeña() {
    Logger
      .getLogger(MoldeadorPizzaDelgada.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza pequena, delgada de masa convencional.");
  }

  @Override
  public void moldearPizzaMediana() {
    Logger
      .getLogger(MoldeadorPizzaDelgada.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza mediana, delgada de masa convencional.");
  }
  
}
