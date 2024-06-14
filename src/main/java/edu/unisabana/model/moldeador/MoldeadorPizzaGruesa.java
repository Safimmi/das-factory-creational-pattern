package edu.unisabana.model.moldeador;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoldeadorPizzaGruesa implements Moldeador{

  @Override
  public void moldearPizzaPequeña() {
    Logger
      .getLogger(MoldeadorPizzaGruesa.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza pequena, gruesa de masa convencional.");
  }

  @Override
  public void moldearPizzaMediana() {
    Logger
      .getLogger(MoldeadorPizzaGruesa.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza mediana, gruesa de masa convencional.");
  }
  
}

