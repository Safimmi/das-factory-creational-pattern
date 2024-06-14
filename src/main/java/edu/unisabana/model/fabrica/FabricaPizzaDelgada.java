package edu.unisabana.model.fabrica;

import edu.unisabana.model.amasador.Amasador;
import edu.unisabana.model.horneador.Horneador;
import edu.unisabana.model.moldeador.Moldeador;

import edu.unisabana.model.amasador.AmasadorPizzaDelgada;
import edu.unisabana.model.horneador.HorneadorPizzaDelgada;
import edu.unisabana.model.moldeador.MoldeadorPizzaDelgada;

public class FabricaPizzaDelgada extends FabricaPizza{

  @Override
  public Amasador crearAmasador() {
    return new AmasadorPizzaDelgada();
  }

  @Override
  public Moldeador crearMoldeador() {
    return new MoldeadorPizzaDelgada();
  }

  @Override
  public Horneador crearHorneador() {
    return new HorneadorPizzaDelgada();
  }
  
}
