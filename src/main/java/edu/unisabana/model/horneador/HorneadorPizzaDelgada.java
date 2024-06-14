package edu.unisabana.model.horneador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaDelgada implements Horneador {
  
  public void hornear() {
    Logger
      .getLogger(HorneadorPizzaDelgada.class.getName())
      .log(Level.INFO, "[~~] Horneando la pizza delgada de masa convencional.");
  }

}