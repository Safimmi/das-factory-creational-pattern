package edu.unisabana.model.horneador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaGruesa implements Horneador {
  
  public void hornear() {
    Logger
      .getLogger(HorneadorPizzaGruesa.class.getName())
      .log(Level.INFO, "[~~] Horneando la pizza gruesa de masa convencional.");
  }

}