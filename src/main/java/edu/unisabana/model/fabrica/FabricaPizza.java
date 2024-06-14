package edu.unisabana.model.fabrica;

import edu.unisabana.model.amasador.Amasador;
import edu.unisabana.model.horneador.Horneador;
import edu.unisabana.model.moldeador.Moldeador;

public abstract class FabricaPizza {
  abstract public Amasador crearAmasador();
  abstract public Moldeador crearMoldeador();
  abstract public Horneador crearHorneador();
}
