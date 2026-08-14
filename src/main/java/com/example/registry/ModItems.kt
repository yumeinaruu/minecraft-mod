package com.example.registry

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.CreativeModeTabs
import net.minecraft.world.item.Item

class ModItems {

    companion object {

        val FIGNYA: Item = registerItem(
            ModItemsId.FIGNYA,
            { props -> Item(props) },
            Item.Properties(),
        )

        @JvmStatic
        fun registerItem(
            itemKey: ResourceKey<Item>,
            itemFactory: (Item.Properties) -> Item,
            settings: Item.Properties,
        ): Item {
            val item: Item = itemFactory(settings.setId(itemKey))

            Registry.register(BuiltInRegistries.ITEM, itemKey, item)

            return item
        }

        @JvmStatic
        fun initialize() {
            CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
                .register { creativeTab -> creativeTab.accept(ModItems.FIGNYA) }
            println("Initializing Items")
        }

    }

}