package com.shalasay.protocraft.creativetab;

import com.shalasay.protocraft.init.ModItems;
import com.shalasay.protocraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabProtocraft {
    public static final CreativeTabs PROTOCRAFT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.psyCrystal;
        }
    };
}