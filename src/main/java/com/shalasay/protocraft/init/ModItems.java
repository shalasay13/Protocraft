package com.shalasay.protocraft.init;

import com.shalasay.protocraft.item.ItemProtocraft;
import com.shalasay.protocraft.item.ItemPsyCrystal;
import com.shalasay.protocraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemProtocraft psyCrystal = new ItemPsyCrystal();
    public static void init()
    {
        GameRegistry.registerItem(psyCrystal, "psyCrystal");
    }
}