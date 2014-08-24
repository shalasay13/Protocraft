package com.shalasay.protocraft.block;

import net.minecraft.block.material.Material;

public class BlockPannel extends BlockProtocraft {
    public BlockPannel(){
        super(Material.iron);
        this.setBlockName("pannel");
        this.setBlockTextureName("pannel");
        this.setStepSound(soundTypeMetal);
    }

}
