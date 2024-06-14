package edu.unisabana.model.amasador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaIntegral implements Amasador {

  @Override
  public void amasar() {
    Logger
      .getLogger(AmasadorPizzaGruesa.class.getName())
      .log(Level.INFO, "[@@] Amasando la pizza con masa intergal.");
  }
  
}