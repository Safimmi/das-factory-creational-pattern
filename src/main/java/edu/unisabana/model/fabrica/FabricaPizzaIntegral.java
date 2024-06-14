package edu.unisabana.model.fabrica;

import edu.unisabana.model.amasador.Amasador;
import edu.unisabana.model.amasador.AmasadorPizzaIntegral;
import edu.unisabana.model.horneador.Horneador;
import edu.unisabana.model.horneador.HorneadorPizzaIntegral;
import edu.unisabana.model.moldeador.Moldeador;
import edu.unisabana.model.moldeador.MoldeadorPizzaIntegral;

public class FabricaPizzaIntegral extends FabricaPizza{

  @Override
  public Amasador crearAmasador() {
    return new AmasadorPizzaIntegral();
  }

  @Override
  public Moldeador crearMoldeador() {
    return new MoldeadorPizzaIntegral();
  }

  @Override
  public Horneador crearHorneador() {
    return new HorneadorPizzaIntegral();
  }

  
}