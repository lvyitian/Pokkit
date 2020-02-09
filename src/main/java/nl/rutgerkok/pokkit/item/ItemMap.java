package nl.rutgerkok.pokkit.item;

import org.bukkit.Material;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;

@SuppressWarnings("deprecation")
public class ItemMap {

	private static Material[] nukkitToBukkit = new Material[700];
	private static char[] bukkitToNukkit = new char[Material.values().length];

	static {
		registerTwoWay(ItemID.IRON_SHOVEL, Material.IRON_SHOVEL);
	    registerTwoWay(ItemID.IRON_PICKAXE, Material.IRON_PICKAXE);
	    registerTwoWay(ItemID.IRON_AXE, Material.IRON_AXE);
	    registerTwoWay(ItemID.FLINT_AND_STEEL, Material.FLINT_AND_STEEL);
	    registerTwoWay(ItemID.APPLE, Material.APPLE);
	    registerTwoWay(ItemID.BOW, Material.BOW);
	    registerTwoWay(ItemID.ARROW, Material.ARROW);
	    registerTwoWay(ItemID.COAL, Material.COAL);
	    registerTwoWay(ItemID.DIAMOND, Material.DIAMOND);
	    registerTwoWay(ItemID.IRON_INGOT, Material.IRON_INGOT);
	    registerTwoWay(ItemID.GOLD_INGOT, Material.GOLD_INGOT);
	    registerTwoWay(ItemID.IRON_SWORD, Material.IRON_SWORD);
	    registerTwoWay(ItemID.WOODEN_SWORD, Material.WOODEN_SWORD);
	    registerTwoWay(ItemID.WOODEN_SHOVEL, Material.WOODEN_SHOVEL);
	    registerTwoWay(ItemID.WOODEN_PICKAXE, Material.WOODEN_PICKAXE);
	    registerTwoWay(ItemID.WOODEN_AXE, Material.WOODEN_AXE);
	    registerTwoWay(ItemID.STONE_SWORD, Material.STONE_SWORD);
	    registerTwoWay(ItemID.STONE_SHOVEL, Material.STONE_SHOVEL);
	    registerTwoWay(ItemID.STONE_PICKAXE, Material.STONE_PICKAXE);
	    registerTwoWay(ItemID.STONE_AXE, Material.STONE_AXE);
	    registerTwoWay(ItemID.DIAMOND_SWORD, Material.DIAMOND_SWORD);
	    registerTwoWay(ItemID.DIAMOND_SHOVEL, Material.DIAMOND_SHOVEL);
	    registerTwoWay(ItemID.DIAMOND_PICKAXE, Material.DIAMOND_PICKAXE);
	    registerTwoWay(ItemID.DIAMOND_AXE, Material.DIAMOND_AXE);
	    registerTwoWay(ItemID.STICK, Material.STICK);
	    registerTwoWay(ItemID.BOWL, Material.BOWL);
	    registerTwoWay(ItemID.MUSHROOM_STEW, Material.MUSHROOM_STEW);
	    registerTwoWay(ItemID.GOLDEN_SWORD, Material.GOLDEN_SWORD);
	    registerTwoWay(ItemID.GOLDEN_SHOVEL, Material.GOLDEN_SHOVEL);
	    registerTwoWay(ItemID.GOLDEN_PICKAXE, Material.GOLDEN_PICKAXE);
	    registerTwoWay(ItemID.GOLDEN_AXE, Material.GOLDEN_AXE);
	    registerTwoWay(ItemID.STRING, Material.STRING);
	    registerTwoWay(ItemID.FEATHER, Material.FEATHER);
	    registerTwoWay(ItemID.GUNPOWDER, Material.GUNPOWDER);
	    registerTwoWay(ItemID.WOODEN_HOE, Material.WOODEN_HOE);
	    registerTwoWay(ItemID.STONE_HOE, Material.STONE_HOE);
	    registerTwoWay(ItemID.IRON_HOE, Material.IRON_HOE);
	    registerTwoWay(ItemID.DIAMOND_HOE, Material.DIAMOND_HOE);
	    registerTwoWay(ItemID.GOLDEN_HOE, Material.GOLDEN_HOE);
	    registerTwoWay(ItemID.WHEAT_SEEDS, Material.WHEAT_SEEDS);
	    registerTwoWay(ItemID.WHEAT, Material.WHEAT);
	    registerTwoWay(ItemID.BREAD, Material.BREAD);
		registerTwoWay(ItemID.LEATHER_CAP, Material.LEATHER_HELMET);
		registerTwoWay(ItemID.LEATHER_TUNIC, Material.LEATHER_CHESTPLATE);
		registerTwoWay(ItemID.LEATHER_PANTS, Material.LEATHER_LEGGINGS);
	    registerTwoWay(ItemID.LEATHER_BOOTS, Material.LEATHER_BOOTS);
		registerTwoWay(ItemID.CHAIN_HELMET, Material.CHAINMAIL_HELMET);
		registerTwoWay(ItemID.CHAIN_CHESTPLATE, Material.CHAINMAIL_CHESTPLATE);
		registerTwoWay(ItemID.CHAIN_LEGGINGS, Material.CHAINMAIL_LEGGINGS);
		registerTwoWay(ItemID.CHAIN_BOOTS, Material.CHAINMAIL_BOOTS);
	    registerTwoWay(ItemID.IRON_HELMET, Material.IRON_HELMET);
	    registerTwoWay(ItemID.IRON_CHESTPLATE, Material.IRON_CHESTPLATE);
	    registerTwoWay(ItemID.IRON_LEGGINGS, Material.IRON_LEGGINGS);
	    registerTwoWay(ItemID.IRON_BOOTS, Material.IRON_BOOTS);
	    registerTwoWay(ItemID.DIAMOND_HELMET, Material.DIAMOND_HELMET);
	    registerTwoWay(ItemID.DIAMOND_CHESTPLATE, Material.DIAMOND_CHESTPLATE);
	    registerTwoWay(ItemID.DIAMOND_LEGGINGS, Material.DIAMOND_LEGGINGS);
	    registerTwoWay(ItemID.DIAMOND_BOOTS, Material.DIAMOND_BOOTS);
		registerTwoWay(ItemID.GOLD_HELMET, Material.GOLDEN_HELMET);
		registerTwoWay(ItemID.GOLD_CHESTPLATE, Material.GOLDEN_CHESTPLATE);
		registerTwoWay(ItemID.GOLD_LEGGINGS, Material.GOLDEN_LEGGINGS);
		registerTwoWay(ItemID.GOLD_BOOTS, Material.GOLDEN_BOOTS);
		registerTwoWay(ItemID.RAW_PORKCHOP, Material.PORKCHOP);
	    registerTwoWay(ItemID.COOKED_PORKCHOP, Material.COOKED_PORKCHOP);
	    registerTwoWay(ItemID.PAINTING, Material.PAINTING);
	    registerTwoWay(ItemID.GOLDEN_APPLE, Material.GOLDEN_APPLE);
	    registerTwoWay(ItemID.SIGN, Material.SIGN);
		registerTwoWay(ItemID.WOODEN_DOOR, Material.OAK_DOOR);
	    registerTwoWay(ItemID.BUCKET, Material.BUCKET);
	    registerTwoWay(ItemID.MINECART, Material.MINECART);
	    registerTwoWay(ItemID.SADDLE, Material.SADDLE);
	    registerTwoWay(ItemID.IRON_DOOR, Material.IRON_DOOR);
	    registerTwoWay(ItemID.REDSTONE, Material.REDSTONE);
	    registerTwoWay(ItemID.SNOWBALL, Material.SNOWBALL);
		registerTwoWay(ItemID.BOAT, Material.OAK_BOAT);
	    registerTwoWay(ItemID.LEATHER, Material.LEATHER);
	    registerTwoWay(ItemID.BRICK, Material.BRICK);
	    registerTwoWay(ItemID.CLAY, Material.CLAY);
	    registerTwoWay(ItemID.SUGAR_CANE, Material.SUGAR_CANE);
	    registerTwoWay(ItemID.PAPER, Material.PAPER);
	    registerTwoWay(ItemID.BOOK, Material.BOOK);
		registerTwoWay(ItemID.SLIMEBALL, Material.SLIME_BALL);
		registerTwoWay(ItemID.MINECART_WITH_CHEST, Material.CHEST_MINECART);
	    registerTwoWay(ItemID.EGG, Material.EGG);
	    registerTwoWay(ItemID.COMPASS, Material.COMPASS);
	    registerTwoWay(ItemID.FISHING_ROD, Material.FISHING_ROD);
	    registerTwoWay(ItemID.CLOCK, Material.CLOCK);
	    registerTwoWay(ItemID.GLOWSTONE_DUST, Material.GLOWSTONE_DUST);
		registerTwoWay(ItemID.RAW_FISH, Material.COD);
		registerTwoWay(ItemID.COOKED_FISH, Material.COOKED_COD);
		registerTwoWay(ItemID.DYE, Material.ORANGE_DYE);
	    registerTwoWay(ItemID.BONE, Material.BONE);
	    registerTwoWay(ItemID.SUGAR, Material.SUGAR);
	    registerTwoWay(ItemID.CAKE, Material.CAKE);
		registerTwoWay(ItemID.BED, Material.RED_BED);
	    registerTwoWay(ItemID.REPEATER, Material.REPEATER);
	    registerTwoWay(ItemID.COOKIE, Material.COOKIE);
	    registerTwoWay(ItemID.MAP, Material.MAP);
	    registerTwoWay(ItemID.SHEARS, Material.SHEARS);
	    registerTwoWay(ItemID.MELON, Material.MELON);
	    registerTwoWay(ItemID.MELON_SLICE, Material.MELON_SLICE);
	    registerTwoWay(ItemID.PUMPKIN_SEEDS, Material.PUMPKIN_SEEDS);
	    registerTwoWay(ItemID.MELON_SEEDS, Material.MELON_SEEDS);
		registerTwoWay(ItemID.RAW_BEEF, Material.BEEF);
	    registerTwoWay(ItemID.COOKED_BEEF, Material.COOKED_BEEF);
		registerTwoWay(ItemID.RAW_CHICKEN, Material.CHICKEN);
	    registerTwoWay(ItemID.COOKED_CHICKEN, Material.COOKED_CHICKEN);
	    registerTwoWay(ItemID.ROTTEN_FLESH, Material.ROTTEN_FLESH);
	    registerTwoWay(ItemID.ENDER_PEARL, Material.ENDER_PEARL);
	    registerTwoWay(ItemID.BLAZE_ROD, Material.BLAZE_ROD);
	    registerTwoWay(ItemID.GHAST_TEAR, Material.GHAST_TEAR);
	    registerTwoWay(ItemID.GOLD_NUGGET, Material.GOLD_NUGGET);
	    registerTwoWay(ItemID.NETHER_WART, Material.NETHER_WART);
	    registerTwoWay(ItemID.POTION, Material.POTION);
	    registerTwoWay(ItemID.GLASS_BOTTLE, Material.GLASS_BOTTLE);
	    registerTwoWay(ItemID.SPIDER_EYE, Material.SPIDER_EYE);
	    registerTwoWay(ItemID.FERMENTED_SPIDER_EYE, Material.FERMENTED_SPIDER_EYE);
	    registerTwoWay(ItemID.BLAZE_POWDER, Material.BLAZE_POWDER);
	    registerTwoWay(ItemID.MAGMA_CREAM, Material.MAGMA_CREAM);
	    registerTwoWay(ItemID.BREWING_STAND, Material.BREWING_STAND);
	    registerTwoWay(ItemID.CAULDRON, Material.CAULDRON);
	    registerTwoWay(ItemID.ENDER_EYE, Material.ENDER_EYE);
		registerTwoWay(ItemID.GLISTERING_MELON, Material.GLISTERING_MELON_SLICE);
		registerTwoWay(ItemID.SPAWN_EGG, Material.PIG_SPAWN_EGG);
	    registerTwoWay(ItemID.EXPERIENCE_BOTTLE, Material.EXPERIENCE_BOTTLE);
	    registerTwoWay(ItemID.FIRE_CHARGE, Material.FIRE_CHARGE);
		registerTwoWay(ItemID.BOOK_AND_QUILL, Material.WRITABLE_BOOK);
	    registerTwoWay(ItemID.WRITTEN_BOOK, Material.WRITTEN_BOOK);
	    registerTwoWay(ItemID.EMERALD, Material.EMERALD);
	    registerTwoWay(ItemID.ITEM_FRAME, Material.ITEM_FRAME);
	    registerTwoWay(ItemID.FLOWER_POT, Material.FLOWER_POT);
	    registerTwoWay(ItemID.CARROT, Material.CARROT);
	    registerTwoWay(ItemID.CARROTS, Material.CARROTS);
	    registerTwoWay(ItemID.POTATO, Material.POTATO);
	    registerTwoWay(ItemID.POTATOES, Material.POTATOES);
	    registerTwoWay(ItemID.BAKED_POTATO, Material.BAKED_POTATO);
	    registerTwoWay(ItemID.POISONOUS_POTATO, Material.POISONOUS_POTATO);
		registerTwoWay(ItemID.EMPTY_MAP, Material.MAP);
	    registerTwoWay(ItemID.GOLDEN_CARROT, Material.GOLDEN_CARROT);
		registerTwoWay(ItemID.SKULL, Material.SKELETON_SKULL);
	    registerTwoWay(ItemID.CARROT_ON_A_STICK, Material.CARROT_ON_A_STICK);
	    registerTwoWay(ItemID.NETHER_STAR, Material.NETHER_STAR);
	    registerTwoWay(ItemID.PUMPKIN_PIE, Material.PUMPKIN_PIE);
		registerTwoWay(ItemID.FIREWORKS, Material.FIREWORK_ROCKET);
	    registerTwoWay(ItemID.ENCHANTED_BOOK, Material.ENCHANTED_BOOK);
	    registerTwoWay(ItemID.COMPARATOR, Material.COMPARATOR);
	    registerTwoWay(ItemID.NETHER_BRICK, Material.NETHER_BRICK);
	    registerTwoWay(ItemID.QUARTZ, Material.QUARTZ);
		registerTwoWay(ItemID.MINECART_WITH_TNT, Material.TNT_MINECART);
		registerTwoWay(ItemID.MINECART_WITH_HOPPER, Material.HOPPER_MINECART);
	    registerTwoWay(ItemID.PRISMARINE_SHARD, Material.PRISMARINE_SHARD);
	    registerTwoWay(ItemID.HOPPER, Material.HOPPER);
		registerTwoWay(ItemID.RAW_RABBIT, Material.RABBIT);
	    registerTwoWay(ItemID.COOKED_RABBIT, Material.COOKED_RABBIT);
	    registerTwoWay(ItemID.RABBIT_STEW, Material.RABBIT_STEW);
	    registerTwoWay(ItemID.RABBIT_FOOT, Material.RABBIT_FOOT);
	    registerTwoWay(ItemID.RABBIT_HIDE, Material.RABBIT_HIDE);
	    registerTwoWay(ItemID.IRON_HORSE_ARMOR, Material.IRON_HORSE_ARMOR);
		registerTwoWay(ItemID.GOLD_HORSE_ARMOR, Material.GOLDEN_HORSE_ARMOR);
	    registerTwoWay(ItemID.DIAMOND_HORSE_ARMOR, Material.DIAMOND_HORSE_ARMOR);
	    registerTwoWay(ItemID.LEAD, Material.LEAD);
	    registerTwoWay(ItemID.NAME_TAG, Material.NAME_TAG);
	    registerTwoWay(ItemID.PRISMARINE_CRYSTALS, Material.PRISMARINE_CRYSTALS);
		registerTwoWay(ItemID.RAW_MUTTON, Material.MUTTON);
	    registerTwoWay(ItemID.COOKED_MUTTON, Material.COOKED_MUTTON);
	    registerTwoWay(ItemID.END_CRYSTAL, Material.END_CRYSTAL);
	    registerTwoWay(ItemID.SPRUCE_DOOR, Material.SPRUCE_DOOR);
	    registerTwoWay(ItemID.BIRCH_DOOR, Material.BIRCH_DOOR);
	    registerTwoWay(ItemID.JUNGLE_DOOR, Material.JUNGLE_DOOR);
	    registerTwoWay(ItemID.ACACIA_DOOR, Material.ACACIA_DOOR);
	    registerTwoWay(ItemID.DARK_OAK_DOOR, Material.DARK_OAK_DOOR);
	    registerTwoWay(ItemID.CHORUS_FRUIT, Material.CHORUS_FRUIT);
	    registerTwoWay(ItemID.POPPED_CHORUS_FRUIT, Material.POPPED_CHORUS_FRUIT);
	    registerTwoWay(ItemID.DRAGON_BREATH, Material.DRAGON_BREATH);
	    registerTwoWay(ItemID.SPLASH_POTION, Material.SPLASH_POTION);
	    registerTwoWay(ItemID.LINGERING_POTION, Material.LINGERING_POTION);
	    registerTwoWay(ItemID.ELYTRA, Material.ELYTRA);
	    registerTwoWay(ItemID.SHULKER_SHELL, Material.SHULKER_SHELL);
	    registerTwoWay(ItemID.BEETROOT, Material.BEETROOT);
	    registerTwoWay(ItemID.BEETROOT_SEEDS, Material.BEETROOT_SEEDS);
	    registerTwoWay(ItemID.BEETROOT_SOUP, Material.BEETROOT_SOUP);
		registerTwoWay(ItemID.RAW_SALMON, Material.SALMON);
		registerTwoWay(ItemID.CLOWNFISH, Material.TROPICAL_FISH);
	    registerTwoWay(ItemID.PUFFERFISH, Material.PUFFERFISH);
	    registerTwoWay(ItemID.COOKED_SALMON, Material.COOKED_SALMON);
		registerTwoWay(ItemID.GOLDEN_APPLE_ENCHANTED, Material.ENCHANTED_GOLDEN_APPLE);
		registerTwoWay(ItemID.RECORD_13, Material.MUSIC_DISC_13);
		registerTwoWay(ItemID.RECORD_CAT, Material.MUSIC_DISC_CAT);
		registerTwoWay(ItemID.RECORD_BLOCKS, Material.MUSIC_DISC_BLOCKS);
		registerTwoWay(ItemID.RECORD_CHIRP, Material.MUSIC_DISC_CHIRP);
		registerTwoWay(ItemID.RECORD_FAR, Material.MUSIC_DISC_FAR);
		registerTwoWay(ItemID.RECORD_MALL, Material.MUSIC_DISC_MALL);
		registerTwoWay(ItemID.RECORD_MELLOHI, Material.MUSIC_DISC_MELLOHI);
		registerTwoWay(ItemID.RECORD_STAL, Material.MUSIC_DISC_STAL);
		registerTwoWay(ItemID.RECORD_STRAD, Material.MUSIC_DISC_STRAD);
		registerTwoWay(ItemID.RECORD_WARD, Material.MUSIC_DISC_WARD);
		registerTwoWay(ItemID.RECORD_11, Material.MUSIC_DISC_11);
		registerTwoWay(ItemID.RECORD_WAIT, Material.MUSIC_DISC_WAIT);
		registerTwoWay(ItemID.TRIDENT, Material.TRIDENT);
		registerTwoWay(ItemID.TURTLE_SHELL, Material.TURTLE_HELMET);
		registerTwoWay(ItemID.KELP, Material.KELP);
		registerTwoWay(ItemID.DRIED_KELP, Material.DRIED_KELP);
		registerTwoWay(ItemID.FIREWORKSCHARGE, Material.FIREWORK_STAR);
		registerTwoWay(ItemID.ARMOR_STAND, Material.ARMOR_STAND);
		registerTwoWay(ItemID.COMMAND_BLOCK_MINECART, Material.COMMAND_BLOCK_MINECART);
		registerTwoWay(ItemID.TOTEM, Material.TOTEM_OF_UNDYING);
		registerTwoWay(ItemID.IRON_NUGGET, Material.IRON_NUGGET);
		registerTwoWay(ItemID.NAUTILUS_SHELL, Material.NAUTILUS_SHELL);
		registerTwoWay(ItemID.HEART_OF_THE_SEA, Material.HEART_OF_THE_SEA);
		registerTwoWay(ItemID.SCUTE, Material.SCUTE);
		registerTwoWay(ItemID.PHANTOM_MEMBRANE, Material.PHANTOM_MEMBRANE);
		registerTwoWay(ItemID.SHIELD, Material.SHIELD);

		// Unsupported items
		registerNukkitToBukkit(ItemID.LEATHER_HORSE_ARMOR, Material.LEATHER);
		registerNukkitToBukkit(734, Material.BOWL); //SUSPICIOUS_STEW
		registerNukkitToBukkit(471, Material.BOW); //CROSSBOW
		registerNukkitToBukkit(736, Material.STICK); //HONEYCOMB
		registerNukkitToBukkit(737, Material.GLASS_BOTTLE); //HONEY_BOTTLE

		// Legacy items
		registerBukkitToNukkit(ItemID.IRON_SHOVEL, Material.LEGACY_IRON_SPADE);
		registerBukkitToNukkit(ItemID.IRON_PICKAXE, Material.LEGACY_IRON_PICKAXE);
		registerBukkitToNukkit(ItemID.IRON_AXE, Material.LEGACY_IRON_AXE);
		registerBukkitToNukkit(ItemID.FLINT_AND_STEEL, Material.LEGACY_FLINT_AND_STEEL);
		registerBukkitToNukkit(ItemID.APPLE, Material.LEGACY_APPLE);
		registerBukkitToNukkit(ItemID.BOW, Material.LEGACY_BOW);
		registerBukkitToNukkit(ItemID.ARROW, Material.LEGACY_ARROW);
		registerBukkitToNukkit(ItemID.COAL, Material.LEGACY_COAL);
		registerBukkitToNukkit(ItemID.DIAMOND, Material.LEGACY_DIAMOND);
		registerBukkitToNukkit(ItemID.IRON_INGOT, Material.LEGACY_IRON_INGOT);
		registerBukkitToNukkit(ItemID.GOLD_INGOT, Material.LEGACY_GOLD_INGOT);
		registerBukkitToNukkit(ItemID.IRON_SWORD, Material.LEGACY_IRON_SWORD);
		registerBukkitToNukkit(ItemID.WOODEN_SWORD, Material.LEGACY_WOOD_SWORD);
		registerBukkitToNukkit(ItemID.WOODEN_SHOVEL, Material.LEGACY_WOOD_SPADE);
		registerBukkitToNukkit(ItemID.WOODEN_PICKAXE, Material.LEGACY_WOOD_PICKAXE);
		registerBukkitToNukkit(ItemID.WOODEN_AXE, Material.LEGACY_WOOD_AXE);
		registerBukkitToNukkit(ItemID.STONE_SWORD, Material.LEGACY_STONE_SWORD);
		registerBukkitToNukkit(ItemID.STONE_SHOVEL, Material.LEGACY_STONE_SPADE);
		registerBukkitToNukkit(ItemID.STONE_PICKAXE, Material.LEGACY_STONE_PICKAXE);
		registerBukkitToNukkit(ItemID.STONE_AXE, Material.LEGACY_STONE_AXE);
		registerBukkitToNukkit(ItemID.DIAMOND_SWORD, Material.LEGACY_DIAMOND_SWORD);
		registerBukkitToNukkit(ItemID.DIAMOND_SHOVEL, Material.LEGACY_DIAMOND_SPADE);
		registerBukkitToNukkit(ItemID.DIAMOND_PICKAXE, Material.LEGACY_DIAMOND_PICKAXE);
		registerBukkitToNukkit(ItemID.DIAMOND_AXE, Material.LEGACY_DIAMOND_AXE);
		registerBukkitToNukkit(ItemID.STICK, Material.LEGACY_STICK);
		registerBukkitToNukkit(ItemID.BOWL, Material.LEGACY_BOWL);
		registerBukkitToNukkit(ItemID.MUSHROOM_STEW, Material.LEGACY_MUSHROOM_SOUP);
		registerBukkitToNukkit(ItemID.GOLD_SWORD, Material.LEGACY_GOLD_SWORD);
		registerBukkitToNukkit(ItemID.GOLD_SHOVEL, Material.LEGACY_GOLD_SPADE);
		registerBukkitToNukkit(ItemID.GOLD_PICKAXE, Material.LEGACY_GOLD_PICKAXE);
		registerBukkitToNukkit(ItemID.GOLD_AXE, Material.LEGACY_GOLD_AXE);
		registerBukkitToNukkit(ItemID.STRING, Material.LEGACY_STRING);
		registerBukkitToNukkit(ItemID.FEATHER, Material.LEGACY_FEATHER);
		registerBukkitToNukkit(ItemID.GUNPOWDER, Material.LEGACY_SULPHUR);
		registerBukkitToNukkit(ItemID.WOODEN_HOE, Material.LEGACY_WOOD_HOE);
		registerBukkitToNukkit(ItemID.STONE_HOE, Material.LEGACY_STONE_HOE);
		registerBukkitToNukkit(ItemID.IRON_HOE, Material.LEGACY_IRON_HOE);
		registerBukkitToNukkit(ItemID.DIAMOND_HOE, Material.LEGACY_DIAMOND_HOE);
		registerBukkitToNukkit(ItemID.GOLD_HOE, Material.LEGACY_GOLD_HOE);
		registerBukkitToNukkit(ItemID.SEEDS, Material.LEGACY_SEEDS);
		registerBukkitToNukkit(ItemID.WHEAT, Material.LEGACY_WHEAT);
		registerBukkitToNukkit(ItemID.BREAD, Material.LEGACY_BREAD);
		registerBukkitToNukkit(ItemID.LEATHER_CAP, Material.LEGACY_LEATHER_HELMET);
		registerBukkitToNukkit(ItemID.LEATHER_TUNIC, Material.LEGACY_LEATHER_CHESTPLATE);
		registerBukkitToNukkit(ItemID.LEATHER_PANTS, Material.LEGACY_LEATHER_LEGGINGS);
		registerBukkitToNukkit(ItemID.LEATHER_BOOTS, Material.LEGACY_LEATHER_BOOTS);
		registerBukkitToNukkit(ItemID.CHAIN_HELMET, Material.LEGACY_CHAINMAIL_HELMET);
		registerBukkitToNukkit(ItemID.CHAIN_CHESTPLATE, Material.LEGACY_CHAINMAIL_CHESTPLATE);
		registerBukkitToNukkit(ItemID.CHAIN_LEGGINGS, Material.LEGACY_CHAINMAIL_LEGGINGS);
		registerBukkitToNukkit(ItemID.CHAIN_BOOTS, Material.LEGACY_CHAINMAIL_BOOTS);
		registerBukkitToNukkit(ItemID.IRON_HELMET, Material.LEGACY_IRON_HELMET);
		registerBukkitToNukkit(ItemID.IRON_CHESTPLATE, Material.LEGACY_IRON_CHESTPLATE);
		registerBukkitToNukkit(ItemID.IRON_LEGGINGS, Material.LEGACY_IRON_LEGGINGS);
		registerBukkitToNukkit(ItemID.IRON_BOOTS, Material.LEGACY_IRON_BOOTS);
		registerBukkitToNukkit(ItemID.DIAMOND_HELMET, Material.LEGACY_DIAMOND_HELMET);
		registerBukkitToNukkit(ItemID.DIAMOND_CHESTPLATE, Material.LEGACY_DIAMOND_CHESTPLATE);
		registerBukkitToNukkit(ItemID.DIAMOND_LEGGINGS, Material.LEGACY_DIAMOND_LEGGINGS);
		registerBukkitToNukkit(ItemID.DIAMOND_BOOTS, Material.LEGACY_DIAMOND_BOOTS);
		registerBukkitToNukkit(ItemID.GOLD_HELMET, Material.LEGACY_GOLD_HELMET);
		registerBukkitToNukkit(ItemID.GOLD_CHESTPLATE, Material.LEGACY_GOLD_CHESTPLATE);
		registerBukkitToNukkit(ItemID.GOLD_LEGGINGS, Material.LEGACY_GOLD_LEGGINGS);
		registerBukkitToNukkit(ItemID.GOLD_BOOTS, Material.LEGACY_GOLD_BOOTS);
		registerBukkitToNukkit(ItemID.FLINT, Material.LEGACY_FLINT);
		registerBukkitToNukkit(ItemID.RAW_PORKCHOP, Material.LEGACY_PORK);
		registerBukkitToNukkit(ItemID.COOKED_PORKCHOP, Material.LEGACY_GRILLED_PORK);
		registerBukkitToNukkit(ItemID.PAINTING, Material.LEGACY_PAINTING);
		registerBukkitToNukkit(ItemID.GOLDEN_APPLE, Material.LEGACY_GOLDEN_APPLE);
		registerBukkitToNukkit(ItemID.SIGN, Material.LEGACY_SIGN);
		registerBukkitToNukkit(ItemID.WOODEN_DOOR, Material.LEGACY_WOOD_DOOR);
		registerBukkitToNukkit(ItemID.BUCKET, Material.LEGACY_BUCKET);
		registerBukkitToNukkit(ItemID.MINECART, Material.LEGACY_MINECART);
		registerBukkitToNukkit(ItemID.SADDLE, Material.LEGACY_SADDLE);
		registerBukkitToNukkit(ItemID.IRON_DOOR, Material.LEGACY_IRON_DOOR);
		registerBukkitToNukkit(ItemID.REDSTONE, Material.LEGACY_REDSTONE);
		registerBukkitToNukkit(ItemID.SNOWBALL, Material.LEGACY_SNOW_BALL);
		registerBukkitToNukkit(ItemID.BOAT, Material.LEGACY_BOAT);
		registerBukkitToNukkit(ItemID.LEATHER, Material.LEGACY_LEATHER);
		registerBukkitToNukkit(ItemID.BRICK, Material.LEGACY_CLAY_BRICK);
		registerBukkitToNukkit(ItemID.CLAY, Material.LEGACY_CLAY_BALL);
		registerBukkitToNukkit(ItemID.SUGAR_CANE, Material.LEGACY_SUGAR_CANE);
		registerBukkitToNukkit(ItemID.PAPER, Material.LEGACY_PAPER);
		registerBukkitToNukkit(ItemID.BOOK, Material.LEGACY_BOOK);
		registerBukkitToNukkit(ItemID.SLIMEBALL, Material.LEGACY_SLIME_BALL);
		registerBukkitToNukkit(ItemID.MINECART_WITH_CHEST, Material.LEGACY_STORAGE_MINECART);
		registerBukkitToNukkit(ItemID.EGG, Material.LEGACY_EGG);
		registerBukkitToNukkit(ItemID.COMPASS, Material.LEGACY_COMPASS);
		registerBukkitToNukkit(ItemID.FISHING_ROD, Material.LEGACY_FISHING_ROD);
		registerBukkitToNukkit(ItemID.CLOCK, Material.LEGACY_WATCH);
		registerBukkitToNukkit(ItemID.GLOWSTONE_DUST, Material.LEGACY_GLOWSTONE_DUST);
		registerBukkitToNukkit(ItemID.RAW_FISH, Material.LEGACY_RAW_FISH);
		registerBukkitToNukkit(ItemID.COOKED_FISH, Material.LEGACY_COOKED_FISH);
		registerBukkitToNukkit(ItemID.BONE, Material.LEGACY_BONE);
		registerBukkitToNukkit(ItemID.SUGAR, Material.LEGACY_SUGAR);
		registerBukkitToNukkit(ItemID.CAKE, Material.LEGACY_CAKE);
		registerBukkitToNukkit(ItemID.BED, Material.LEGACY_BED);
		registerBukkitToNukkit(ItemID.REPEATER, Material.LEGACY_DIODE);
		registerBukkitToNukkit(ItemID.COOKIE, Material.LEGACY_COOKIE);
		registerBukkitToNukkit(ItemID.MAP, Material.LEGACY_MAP);
		registerBukkitToNukkit(ItemID.SHEARS, Material.LEGACY_SHEARS);
		registerBukkitToNukkit(ItemID.MELON, Material.LEGACY_MELON);
		registerBukkitToNukkit(ItemID.PUMPKIN_SEEDS, Material.LEGACY_PUMPKIN_SEEDS);
		registerBukkitToNukkit(ItemID.MELON_SEEDS, Material.LEGACY_MELON_SEEDS);
		registerBukkitToNukkit(ItemID.RAW_BEEF, Material.LEGACY_RAW_BEEF);
		registerBukkitToNukkit(ItemID.COOKED_BEEF, Material.LEGACY_COOKED_BEEF);
		registerBukkitToNukkit(ItemID.RAW_CHICKEN, Material.LEGACY_RAW_CHICKEN);
		registerBukkitToNukkit(ItemID.COOKED_CHICKEN, Material.LEGACY_COOKED_CHICKEN);
		registerBukkitToNukkit(ItemID.ROTTEN_FLESH, Material.LEGACY_ROTTEN_FLESH);
		registerBukkitToNukkit(ItemID.ENDER_PEARL, Material.LEGACY_ENDER_PEARL);
		registerBukkitToNukkit(ItemID.BLAZE_ROD, Material.LEGACY_BLAZE_ROD);
		registerBukkitToNukkit(ItemID.GHAST_TEAR, Material.LEGACY_GHAST_TEAR);
		registerBukkitToNukkit(ItemID.GOLD_NUGGET, Material.LEGACY_GOLD_NUGGET);
		registerBukkitToNukkit(ItemID.NETHER_WART, Material.LEGACY_NETHER_STALK);
		registerBukkitToNukkit(ItemID.POTION, Material.LEGACY_POTION);
		registerBukkitToNukkit(ItemID.GLASS_BOTTLE, Material.LEGACY_GLASS_BOTTLE);
		registerBukkitToNukkit(ItemID.SPIDER_EYE, Material.LEGACY_SPIDER_EYE);
		registerBukkitToNukkit(ItemID.FERMENTED_SPIDER_EYE, Material.LEGACY_FERMENTED_SPIDER_EYE);
		registerBukkitToNukkit(ItemID.BLAZE_POWDER, Material.LEGACY_BLAZE_POWDER);
		registerBukkitToNukkit(ItemID.MAGMA_CREAM, Material.LEGACY_MAGMA_CREAM);
		registerBukkitToNukkit(ItemID.BREWING_STAND, Material.LEGACY_BREWING_STAND_ITEM);
		registerBukkitToNukkit(ItemID.CAULDRON, Material.LEGACY_CAULDRON_ITEM);
		registerBukkitToNukkit(ItemID.ENDER_EYE, Material.LEGACY_EYE_OF_ENDER);
		registerBukkitToNukkit(ItemID.GLISTERING_MELON, Material.LEGACY_SPECKLED_MELON);
		registerBukkitToNukkit(ItemID.SPAWN_EGG, Material.LEGACY_MONSTER_EGG);
		registerBukkitToNukkit(ItemID.EXPERIENCE_BOTTLE, Material.LEGACY_EXP_BOTTLE);
		registerBukkitToNukkit(ItemID.FIRE_CHARGE, Material.LEGACY_FIREBALL);
		registerBukkitToNukkit(ItemID.BOOK_AND_QUILL, Material.LEGACY_BOOK_AND_QUILL);
		registerBukkitToNukkit(ItemID.WRITTEN_BOOK, Material.LEGACY_WRITTEN_BOOK);
		registerBukkitToNukkit(ItemID.EMERALD, Material.LEGACY_EMERALD);
		registerBukkitToNukkit(ItemID.ITEM_FRAME, Material.LEGACY_ITEM_FRAME);
		registerBukkitToNukkit(ItemID.FLOWER_POT, Material.LEGACY_FLOWER_POT_ITEM);
		registerBukkitToNukkit(ItemID.CARROT, Material.LEGACY_CARROT_ITEM);
		registerBukkitToNukkit(ItemID.POTATO, Material.LEGACY_POTATO_ITEM);
		registerBukkitToNukkit(ItemID.BAKED_POTATO, Material.LEGACY_BAKED_POTATO);
		registerBukkitToNukkit(ItemID.POISONOUS_POTATO, Material.LEGACY_POISONOUS_POTATO);
		registerBukkitToNukkit(ItemID.EMPTY_MAP, Material.LEGACY_EMPTY_MAP);
		registerBukkitToNukkit(ItemID.GOLDEN_CARROT, Material.LEGACY_GOLDEN_CARROT);
		registerBukkitToNukkit(ItemID.SKULL, Material.LEGACY_SKULL_ITEM);
		registerBukkitToNukkit(ItemID.CARROT_ON_A_STICK, Material.LEGACY_CARROT_STICK);
		registerBukkitToNukkit(ItemID.NETHER_STAR, Material.LEGACY_NETHER_STAR);
		registerBukkitToNukkit(ItemID.PUMPKIN_PIE, Material.LEGACY_PUMPKIN_PIE);
		registerBukkitToNukkit(ItemID.FIREWORKS, Material.LEGACY_FIREWORK);
		registerBukkitToNukkit(ItemID.ENCHANTED_BOOK, Material.LEGACY_ENCHANTED_BOOK);
		registerBukkitToNukkit(ItemID.COMPARATOR, Material.LEGACY_REDSTONE_COMPARATOR);
		registerBukkitToNukkit(ItemID.NETHER_BRICK, Material.LEGACY_NETHER_BRICK_ITEM);
		registerBukkitToNukkit(ItemID.QUARTZ, Material.LEGACY_QUARTZ);
		registerBukkitToNukkit(ItemID.MINECART_WITH_TNT, Material.LEGACY_EXPLOSIVE_MINECART);
		registerBukkitToNukkit(ItemID.MINECART_WITH_HOPPER, Material.LEGACY_HOPPER_MINECART);
		registerBukkitToNukkit(ItemID.PRISMARINE_SHARD, Material.LEGACY_PRISMARINE_SHARD);
		registerBukkitToNukkit(ItemID.PRISMARINE_CRYSTALS, Material.LEGACY_PRISMARINE_CRYSTALS);
		registerBukkitToNukkit(ItemID.RAW_RABBIT, Material.LEGACY_RABBIT);
		registerBukkitToNukkit(ItemID.COOKED_RABBIT, Material.LEGACY_COOKED_RABBIT);
		registerBukkitToNukkit(ItemID.RABBIT_STEW, Material.LEGACY_RABBIT_STEW);
		registerBukkitToNukkit(ItemID.RABBIT_FOOT, Material.LEGACY_RABBIT_FOOT);
		registerBukkitToNukkit(ItemID.RABBIT_HIDE, Material.LEGACY_RABBIT_HIDE);
		registerBukkitToNukkit(ItemID.IRON_HORSE_ARMOR, Material.LEGACY_IRON_BARDING);
		registerBukkitToNukkit(ItemID.GOLD_HORSE_ARMOR, Material.LEGACY_GOLD_BARDING);
		registerBukkitToNukkit(ItemID.DIAMOND_HORSE_ARMOR, Material.LEGACY_DIAMOND_BARDING);
		registerBukkitToNukkit(ItemID.LEAD, Material.LEGACY_LEASH);
		registerBukkitToNukkit(ItemID.NAME_TAG, Material.LEGACY_NAME_TAG);
		registerBukkitToNukkit(ItemID.RAW_MUTTON, Material.LEGACY_MUTTON);
		registerBukkitToNukkit(ItemID.COOKED_MUTTON, Material.LEGACY_COOKED_MUTTON);
		registerBukkitToNukkit(ItemID.END_CRYSTAL, Material.LEGACY_END_CRYSTAL);
		registerBukkitToNukkit(ItemID.SPRUCE_DOOR, Material.LEGACY_SPRUCE_DOOR_ITEM);
		registerBukkitToNukkit(ItemID.BIRCH_DOOR, Material.LEGACY_BIRCH_DOOR_ITEM);
		registerBukkitToNukkit(ItemID.JUNGLE_DOOR, Material.LEGACY_JUNGLE_DOOR_ITEM);
		registerBukkitToNukkit(ItemID.ACACIA_DOOR, Material.LEGACY_ACACIA_DOOR_ITEM);
		registerBukkitToNukkit(ItemID.DARK_OAK_DOOR, Material.LEGACY_DARK_OAK_DOOR_ITEM);
		registerBukkitToNukkit(ItemID.CHORUS_FRUIT, Material.LEGACY_CHORUS_FRUIT);
		registerBukkitToNukkit(ItemID.POPPED_CHORUS_FRUIT, Material.LEGACY_CHORUS_FRUIT_POPPED);
		registerBukkitToNukkit(ItemID.BEETROOT, Material.LEGACY_BEETROOT);
		registerBukkitToNukkit(ItemID.BEETROOT_SEEDS, Material.LEGACY_BEETROOT_SEEDS);
		registerBukkitToNukkit(ItemID.BEETROOT_SOUP, Material.LEGACY_BEETROOT_SOUP);
		registerBukkitToNukkit(ItemID.DRAGON_BREATH, Material.LEGACY_DRAGONS_BREATH);
		registerBukkitToNukkit(ItemID.SPLASH_POTION, Material.LEGACY_SPLASH_POTION);
		registerBukkitToNukkit(ItemID.ARROW, Material.LEGACY_SPECTRAL_ARROW);
		registerBukkitToNukkit(ItemID.ARROW, Material.LEGACY_TIPPED_ARROW);
		registerBukkitToNukkit(ItemID.LINGERING_POTION, Material.LEGACY_LINGERING_POTION);
		registerBukkitToNukkit(ItemID.ELYTRA, Material.LEGACY_ELYTRA);
		registerBukkitToNukkit(ItemID.BOAT, Material.LEGACY_BOAT_SPRUCE);
		registerBukkitToNukkit(ItemID.BOAT, Material.LEGACY_BOAT_BIRCH);
		registerBukkitToNukkit(ItemID.BOAT, Material.LEGACY_BOAT_JUNGLE);
		registerBukkitToNukkit(ItemID.BOAT, Material.LEGACY_BOAT_ACACIA);
		registerBukkitToNukkit(ItemID.BOAT, Material.LEGACY_BOAT_DARK_OAK);
		registerBukkitToNukkit(ItemID.SHULKER_SHELL, Material.LEGACY_SHULKER_SHELL);
		registerBukkitToNukkit(ItemID.WRITTEN_BOOK, Material.LEGACY_KNOWLEDGE_BOOK);
		registerBukkitToNukkit(ItemID.RECORD_13, Material.LEGACY_GOLD_RECORD);
		registerBukkitToNukkit(ItemID.RECORD_CAT, Material.LEGACY_GREEN_RECORD);
		registerBukkitToNukkit(ItemID.RECORD_BLOCKS, Material.LEGACY_RECORD_3);
		registerBukkitToNukkit(ItemID.RECORD_CHIRP, Material.LEGACY_RECORD_4);
		registerBukkitToNukkit(ItemID.RECORD_FAR, Material.LEGACY_RECORD_5);
		registerBukkitToNukkit(ItemID.RECORD_MALL, Material.LEGACY_RECORD_6);
		registerBukkitToNukkit(ItemID.RECORD_MELLOHI, Material.LEGACY_RECORD_7);
		registerBukkitToNukkit(ItemID.RECORD_STAL, Material.LEGACY_RECORD_8);
		registerBukkitToNukkit(ItemID.RECORD_STRAD, Material.LEGACY_RECORD_9);
		registerBukkitToNukkit(ItemID.RECORD_WARD, Material.LEGACY_RECORD_10);
		registerBukkitToNukkit(ItemID.RECORD_11, Material.LEGACY_RECORD_11);
		registerBukkitToNukkit(ItemID.RECORD_WAIT, Material.LEGACY_RECORD_12);
		registerBukkitToNukkit(ItemID.BANNER, Material.LEGACY_BANNER);
		registerBukkitToNukkit(ItemID.ARMOR_STAND, Material.LEGACY_ARMOR_STAND);
		registerBukkitToNukkit(ItemID.COMMAND_BLOCK_MINECART, Material.LEGACY_COMMAND_MINECART);
		registerBukkitToNukkit(ItemID.TOTEM, Material.LEGACY_TOTEM);
		registerBukkitToNukkit(ItemID.IRON_NUGGET, Material.LEGACY_IRON_NUGGET);
	}

	/**
	 * Gets the Nukkit item.
	 * @param type The Bukkit material.
	 * @return The Nukkit item.
	 */
	public static Item fromBukkit(Material type) {
		return Item.get(bukkitToNukkit[type.ordinal()]);
	}

	/**
	 * Gets the material from the Nukkit item, or null if not found.
	 * @param nukkit The Nukkit item, may be null.
	 * @return The material, or null if not found.
	 */
	public static Material fromNukkitOrNull(Item nukkit) {
		if (nukkit == null) {
			return null;
		}
		int nukkitId = nukkit.getId();
		if (nukkitId < 0 || nukkitId >= nukkitToBukkit.length) {
			return null;
		}
		return nukkitToBukkit[nukkitId];
	}

	private static void registerBukkitToNukkit(int nukkitId, Material bukkit) {
		bukkitToNukkit[bukkit.ordinal()] = (char) nukkitId;
	}

	private static void registerNukkitToBukkit(int nukkitId, Material bukkit) {
		nukkitToBukkit[nukkitId] = bukkit;
	}

	private static void registerTwoWay(int nukkitId, Material bukkit) {
		registerBukkitToNukkit(nukkitId, bukkit);
		registerNukkitToBukkit(nukkitId, bukkit);
	}
}
