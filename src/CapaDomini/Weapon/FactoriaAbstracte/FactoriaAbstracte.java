package CapaDomini.Weapon.FactoriaAbstracte;

import java.util.List;
import CapaDomini.Weapon.IWeapon;

public abstract class FactoriaAbstracte {

    public static List<IWeapon> createWeapons( String nomClasseCreadora) {
    	// PENDENT IMPLEMENTAR
    	return null;
    }
    
    protected abstract List<IWeapon> FabricaProducteConcret();
}