package edu.unisabana.model.moldeador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaIntegral implements Moldeador{

  @Override
  public void moldearPizzaPequeña() {
    Logger
      .getLogger(MoldeadorPizzaIntegral.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza pequena de masa integral.");
  }

  @Override
  public void moldearPizzaMediana() {
    Logger
      .getLogger(MoldeadorPizzaIntegral.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza mediana de masa integral.");
  }
  
}

