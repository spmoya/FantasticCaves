# Apuntes Minecraft Modding
Santiago Pedraza

---

## Añadir objetos

1. Añadir objeto a la clase ModItems
   1. Añadir como "public static final Item"
   2. Añadir a registrerModItems
2. Añadir objeto a la clase ModItemGroups en su correspondiente grupo
3. Añadir a la carpeta resources (json)
   1. Añadir a en_us.json (u otro idioma)
   2. Crear .json en la carpeta items
   3. Crear .json en la carpeta models/item (para que tenga textura)
4. Incorporar textura a la carpeta resources/textures/item

---

## Añadir bloques

1. Añadir objeto a la clase ModBlocks
    1. Añadir como "public static final Block"
    2. Añadir a registrerModBlocks
2. Añadir objeto a la clase ModItemGroups en su correspondiente grupo
3. Añadir a la carpeta resources (json)
    1. Añadir a en_us.json (u otro idioma)
    2. Crear .json en la carpeta blockstates
    3. Crear .json en la carpeta models/block (para que tenga textura)
    4. Crear .json en la carpeta models/item (para que tenga textura cuando sea un item)
4. Incorporar textura a la carpeta resources/textures/block
5. Añadir .json de las loot_tables a resources/data/fantastic-caves/loot_tables/blocks
6. Añadir a los diferentes .json de tags para las diferentes propiedades (minado, necesidad de herramienta, etc.): resources/data/minecraft/tags/blocks/mineable

---

## Loot Tables

https://misode.github.io/loot-table/

---

## Recetas

https://misode.github.io/recipe/?version=1.21.9