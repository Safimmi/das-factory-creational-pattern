package edu.unisabana.model.amasador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaDelgada implements Amasador {

  @Override
  public void amasar() {
    Logger
      .getLogger(AmasadorPizzaDelgada.class.getName())
      .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa convencional.");
  }
  
}
