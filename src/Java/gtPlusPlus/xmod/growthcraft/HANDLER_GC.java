package gtPlusPlus.xmod.growthcraft;

import gtPlusPlus.core.lib.LoadedMods;
import gtPlusPlus.xmod.growthcraft.booze.Register_Booze;

public class HANDLER_GC {


	//Run me during Pre-Init
	public static void preInit(){
		if (LoadedMods.Growthcraft){
			Register_Booze.preInit();			
		}
	}

	public static void init(){
		if (LoadedMods.Growthcraft){

		}
	}

	public static void postInit(){
		if (LoadedMods.Growthcraft){

		}
	}

}