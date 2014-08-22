package com.shalasay.protocraft.creativetab;

import com.shalasay.protocraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab{
    public static final CreativeTabs PROTOCRAFT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
        @Override
        public Item getTabIconItem(){

            //TODO add item texture reference
            return null;
        }
    };
}
