package edu.unisabana.model.fabrica;

import edu.unisabana.model.amasador.Amasador;
import edu.unisabana.model.horneador.Horneador;
import edu.unisabana.model.moldeador.Moldeador;

import edu.unisabana.model.amasador.AmasadorPizzaGruesa;
import edu.unisabana.model.moldeador.MoldeadorPizzaGruesa;
import edu.unisabana.model.horneador.HorneadorPizzaGruesa;

public class FabricaPizzaGruesa extends FabricaPizza{
  @Override
  public Amasador crearAmasador() {
    return new AmasadorPizzaGruesa();
  }

  @Override
  public Moldeador crearMoldeador() {
    return new MoldeadorPizzaGruesa();
  }

  @Override
  public Horneador crearHorneador() {
    return new HorneadorPizzaGruesa();
  }
}
