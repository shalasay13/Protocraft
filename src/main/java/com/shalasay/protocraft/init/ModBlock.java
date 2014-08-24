package com.shalasay.protocraft.init;

import com.shalasay.protocraft.block.BlockPannel;
import com.shalasay.protocraft.block.BlockProtocraft;
import com.shalasay.protocraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlock {
    public static final BlockProtocraft pannel = new BlockPannel();

    public static void init()
    {
        GameRegistry.registerBlock(pannel, "pannel");
    }
}
