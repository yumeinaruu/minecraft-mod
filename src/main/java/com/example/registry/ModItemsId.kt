package com.example.registry

import com.example.ExampleMod
import net.minecraft.core.registries.Registries
import net.minecraft.resources.Identifier
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item

class ModItemsId {

    companion object {

        val FIGNYA: ResourceKey<Item> = create("fignya_kakaya_to")

        @JvmStatic
        fun create(name: String): ResourceKey<Item> =
            ResourceKey.create(
                Registries.ITEM,
                Identifier.fromNamespaceAndPath(ExampleMod.MOD_ID, name),
            )


    }

}