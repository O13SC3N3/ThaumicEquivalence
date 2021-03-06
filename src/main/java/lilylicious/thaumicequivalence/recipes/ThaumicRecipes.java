package lilylicious.thaumicequivalence.recipes;

// Examples from: Thaumic Tinkerer

import cpw.mods.fml.common.registry.GameRegistry;
import lilylicious.thaumicequivalence.config.TEConfig;
import lilylicious.thaumicequivalence.utils.AspectLists;
import lilylicious.thaumicequivalence.utils.RecipeHelper;
import lilylicious.thaumicequivalence.utils.RecipeLists;
import moze_intel.projecte.gameObjs.ObjHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.common.config.ConfigBlocks;

public class ThaumicRecipes {
    public static void registerRecipes() {
        registerTableRecipes();
        registerInfusionRecipes();
        registerCrucibleRecipes();
        removeNormalRecipes();

        if (TEConfig.removeRecipes) RecipeHelper.removeRecipes();
        registerNormalRecipes();
    }

    private static void registerTableRecipes() {

        if (TEConfig.mode == 1) {
            transTable = addShapedArcane("TRANSTABLE", new ItemStack(ObjHandler.transmuteStone), AspectLists.transTableCrafting, "DSD", "STS", "DSD", Character.valueOf('D'), Blocks.obsidian, Character.valueOf('S'), Blocks.stone, Character.valueOf('T'), ObjHandler.philosStone);
            ironBand = addShapedArcane("RINGS", new ItemStack(ObjHandler.ironBand), AspectLists.ironBandCrafting, "XXX", "X X", "XXX", 'X', new ItemStack(Items.iron_ingot));
        }
    }

    private static void registerInfusionRecipes() {
        //Research, output, instability, aspects, foci, recipelist

        if (TEConfig.mode == 1) {
            philoStone = addInfusion("PHILOSTONE", new ItemStack(ObjHandler.philosStone), 3, AspectLists.philoStoneCrafting, new ItemStack(Items.diamond, 1, OreDictionary.WILDCARD_VALUE), RecipeLists.philoStone);
            darkMatter = addInfusion("DARKMATTER", new ItemStack(ObjHandler.matter, 1, 0), 5, AspectLists.darkMatterCrafting, new ItemStack(ObjHandler.fuelBlock, 1, 2), RecipeLists.darkMatter);
            darkMatterAxe = addInfusion("DMAXE", new ItemStack(ObjHandler.dmAxe, 1), 2, AspectLists.dmAxeCrafting, new ItemStack(Items.diamond_axe, 1), RecipeLists.dmAxe);
            //TODO: Add diamond hammer for foci purposes
            darkMatterHammer = addInfusion("DMHAMMER", new ItemStack(ObjHandler.dmHammer, 1), 2, AspectLists.dmHammerCrafting, new ItemStack(Items.diamond_pickaxe, 1), RecipeLists.dmHammer);
            darkMatterHoe = addInfusion("DMHOE", new ItemStack(ObjHandler.dmHoe, 1), 2, AspectLists.dmHoeCrafting, new ItemStack(Items.diamond_hoe, 1), RecipeLists.dmHoe);
            //TODO: Add diamond shears for foci purposes
            darkMatterShears = addInfusion("DMSHEARS", new ItemStack(ObjHandler.dmShears, 1), 2, AspectLists.dmShearsCrafting, new ItemStack(Items.shears, 1), RecipeLists.dmShears);
            darkMatterShovel = addInfusion("DMSHOVEL", new ItemStack(ObjHandler.dmShovel, 1), 2, AspectLists.dmShovelCrafting, new ItemStack(Items.diamond_shovel, 1), RecipeLists.dmShovel);
            darkMatterSword = addInfusion("DMSWORD", new ItemStack(ObjHandler.dmSword, 1), 2, AspectLists.dmSwordCrafting, new ItemStack(Items.diamond_sword, 1), RecipeLists.dmSword);
            darkMatterPick = addInfusion("DMPICK", new ItemStack(ObjHandler.dmPick, 1), 2, AspectLists.dmPickCrafting, new ItemStack(Items.diamond_pickaxe, 1), RecipeLists.dmPick);
            darkMatterHelm = addInfusion("DMPICK", new ItemStack(ObjHandler.dmHelmet, 1), 3, AspectLists.dmHelmCrafting, new ItemStack(Items.diamond_helmet, 1), RecipeLists.dmHelm);
            darkMatterChest = addInfusion("DMPICK", new ItemStack(ObjHandler.dmChest, 1), 3, AspectLists.dmChestCrafting, new ItemStack(Items.diamond_chestplate, 1), RecipeLists.dmChest);
            darkMatterLegs = addInfusion("DMPICK", new ItemStack(ObjHandler.dmLegs, 1), 3, AspectLists.dmLegsCrafting, new ItemStack(Items.diamond_leggings, 1), RecipeLists.dmLegs);
            darkMatterBoots = addInfusion("DMPICK", new ItemStack(ObjHandler.dmFeet, 1), 3, AspectLists.dmFeetCrafting, new ItemStack(Items.diamond_boots, 1), RecipeLists.dmFeet);
            repairTalisman = addInfusion("REPAIRTALISMAN", new ItemStack(ObjHandler.repairTalisman, 1), 0, AspectLists.repairTalismanCrafting, new ItemStack(Items.paper), RecipeLists.repairTalisman);
            alchemicalChest = addInfusion("ALCHEMICALCHEST", new ItemStack(ObjHandler.alchChest, 1), 2, AspectLists.alchemicalChestCrafting, new ItemStack(Blocks.chest), RecipeLists.alchemicalChest);
            energyCondenser = addInfusion("ENERGYCONDENSER", new ItemStack(ObjHandler.condenser), 3, AspectLists.energyCondenserCrafting, new ItemStack(ObjHandler.alchChest), RecipeLists.energyCondenser);
            collectorMk1 = addInfusion("POWERFLOWERS", new ItemStack(ObjHandler.energyCollector), 3, AspectLists.collectorMk1Crafting, new ItemStack(Blocks.diamond_block), RecipeLists.collectorMk1);
            relayMk1 = addInfusion("POWERFLOWERS", new ItemStack(ObjHandler.relay), 3, AspectLists.relayMk1Crafting, new ItemStack(Blocks.diamond_block), RecipeLists.relayMk1);
            collectorMk2 = addInfusion("MK2", new ItemStack(ObjHandler.collectorMK2), 4, AspectLists.collectorMk2Crafting, new ItemStack(ObjHandler.energyCollector), RecipeLists.collectorMk2);
            relayMk2 = addInfusion("MK2", new ItemStack(ObjHandler.relayMK2), 4, AspectLists.relayMk2Crafting, new ItemStack(ObjHandler.relay), RecipeLists.relayMk2);
            collectorMk3 = addInfusion("MK3", new ItemStack(ObjHandler.collectorMK3), 5, AspectLists.collectorMk3Crafting, new ItemStack(ObjHandler.collectorMK2), RecipeLists.collectorMk3);
            relayMk3 = addInfusion("MK3", new ItemStack(ObjHandler.relayMK3), 5, AspectLists.relayMk3Crafting, new ItemStack(ObjHandler.relayMK2), RecipeLists.relayMk3);
            swiftWolf = addInfusion("RINGS", new ItemStack(ObjHandler.swrg), 5, AspectLists.swiftWolfRingCrafting, new ItemStack(ObjHandler.ironBand), RecipeLists.swiftWolfRing);
            harvestGoddess = addInfusion("RINGS", new ItemStack(ObjHandler.harvestGod), 5, AspectLists.harvestGoddessRingCrafting, new ItemStack(ObjHandler.ironBand), RecipeLists.harvestGoddessRing);
            zeroRing = addInfusion("RINGS", new ItemStack(ObjHandler.zero), 5, AspectLists.zeroRingCrafting, new ItemStack(ObjHandler.ironBand), RecipeLists.zeroRing);
            ignitionRing = addInfusion("RINGS", new ItemStack(ObjHandler.ignition), 5, AspectLists.ignitionRingCrafting, new ItemStack(ObjHandler.ironBand), RecipeLists.ignitionRing);
            blackHoleBand = addInfusion("RINGS", new ItemStack(ObjHandler.blackHole), 5, AspectLists.blackHoleCrafting, new ItemStack(ObjHandler.ironBand), RecipeLists.blackHole);
            voidRing = addInfusion("RINGS", new ItemStack(ObjHandler.voidRing), 5, AspectLists.voidRingCrafting, new ItemStack(ObjHandler.ironBand), RecipeLists.voidRing);
            arcanaRing = addInfusion("ARCANARING", new ItemStack(ObjHandler.arcana), 5, AspectLists.arcanaRingCrafting, new ItemStack(ObjHandler.matterBlock, 1, 1), RecipeLists.arcanaRing);
            timeWatch = addInfusion("TIMEWATCH", new ItemStack(ObjHandler.timeWatch), 8, AspectLists.timeWatchCrafting, new ItemStack(Items.clock), RecipeLists.timeWatch);
            kleinStarEin = addInfusion("KLEINSTARS", new ItemStack(ObjHandler.kleinStars, 1, 0), 1, AspectLists.kleinStarEin, new ItemStack(ObjHandler.fuelBlock, 1, 1), RecipeLists.kleinStarEin);
            kleinStarZwei = addInfusion("KLEINSTARS", new ItemStack(ObjHandler.kleinStars, 1, 1), 3, AspectLists.kleinStarZwei, new ItemStack(ObjHandler.kleinStars, 1, 0), RecipeLists.kleinStarZwei);
            kleinStarDrei = addInfusion("KLEINSTARS", new ItemStack(ObjHandler.kleinStars, 1, 2), 5, AspectLists.kleinStarDrei, new ItemStack(ObjHandler.kleinStars, 1, 1), RecipeLists.kleinStarDrei);
            kleinStarVier = addInfusion("KLEINSTARS", new ItemStack(ObjHandler.kleinStars, 1, 3), 7, AspectLists.kleinStarVier, new ItemStack(ObjHandler.kleinStars, 1, 2), RecipeLists.kleinStarVier);
            kleinStarSphere = addInfusion("KLEINSPHERE", new ItemStack(ObjHandler.kleinStars, 1, 4), 9, AspectLists.kleinStarSphereCrafting, new ItemStack(ObjHandler.kleinStars, 1, 3), RecipeLists.kleinStarSphere);
            kleinStarOmega = addInfusion("KLEINOMEGA", new ItemStack(ObjHandler.kleinStars, 1, 5), 11, AspectLists.kleinStarOmegaCrafting, new ItemStack(ObjHandler.kleinStars, 1, 4), RecipeLists.kleinStarOmega);
            redMatter = addInfusion("REDMATTER", new ItemStack(ObjHandler.matter, 1, 1), 9, AspectLists.redMatterCrafting, new ItemStack(ObjHandler.matterBlock, 1, 0), RecipeLists.redMatter);
            redMatterAxe = addInfusion("RMAXE", new ItemStack(ObjHandler.rmAxe), 5, AspectLists.rmAxeCrafting, new ItemStack(ObjHandler.dmAxe), RecipeLists.rmAxe);
            redMatterHammer = addInfusion("RMHAMMER", new ItemStack(ObjHandler.rmHammer), 5, AspectLists.rmHammerCrafting, new ItemStack(ObjHandler.dmHammer), RecipeLists.rmHammer);
            redMatterHoe = addInfusion("RMHOE", new ItemStack(ObjHandler.rmHoe), 5, AspectLists.rmHoeCrafting, new ItemStack(ObjHandler.dmHoe), RecipeLists.rmHoe);
            redMatterShears = addInfusion("RMSHEARS", new ItemStack(ObjHandler.rmShears), 5, AspectLists.rmShearsCrafting, new ItemStack(ObjHandler.dmShears), RecipeLists.rmShears);
            redMatterShovel = addInfusion("RMSHOVEL", new ItemStack(ObjHandler.rmShovel), 5, AspectLists.rmShovelCrafting, new ItemStack(ObjHandler.dmShovel), RecipeLists.rmShovel);
            redMatterSword = addInfusion("RMSWORD", new ItemStack(ObjHandler.rmSword), 5, AspectLists.rmSwordCrafting, new ItemStack(ObjHandler.dmSword), RecipeLists.rmSword);
            redMatterPick = addInfusion("RMPICK", new ItemStack(ObjHandler.rmPick), 5, AspectLists.rmPickCrafting, new ItemStack(ObjHandler.dmPick), RecipeLists.rmPick);
            redMatterHelm = addInfusion("RMHELM", new ItemStack(ObjHandler.rmHelmet), 7, AspectLists.rmHelmCrafting, new ItemStack(ObjHandler.dmHelmet), RecipeLists.rmHelm);
            redMatterChest = addInfusion("RMCHEST", new ItemStack(ObjHandler.rmChest), 7, AspectLists.rmChestCrafting, new ItemStack(ObjHandler.dmChest), RecipeLists.rmChest);
            redMatterLegs = addInfusion("RMLEGS", new ItemStack(ObjHandler.rmLegs), 7, AspectLists.rmLegsCrafting, new ItemStack(ObjHandler.dmLegs), RecipeLists.rmLegs);
            redMatterBoots = addInfusion("RMBOOTS", new ItemStack(ObjHandler.rmFeet), 7, AspectLists.rmBootsCrafting, new ItemStack(ObjHandler.dmFeet), RecipeLists.rmBoots);
            gemHead = addInfusion("GEMHEAD", new ItemStack(ObjHandler.gemHelmet), 11, AspectLists.gemHelmCrafting, new ItemStack(ObjHandler.rmHelmet), RecipeLists.gemHelm);
            gemChest = addInfusion("GEMCHEST", new ItemStack(ObjHandler.gemChest), 11, AspectLists.gemChestCrafting, new ItemStack(ObjHandler.rmChest), RecipeLists.gemChest);
            gemLegs = addInfusion("GEMLEGS", new ItemStack(ObjHandler.gemLegs), 11, AspectLists.gemLegsCrafting, new ItemStack(ObjHandler.rmLegs), RecipeLists.gemLegs);
            gemBoots = addInfusion("GEMBOOTS", new ItemStack(ObjHandler.gemFeet), 11, AspectLists.gemBootsCrafting, new ItemStack(ObjHandler.rmFeet), RecipeLists.gemBoots);
            morningStar = addInfusion("MORNINGSTAR", new ItemStack(ObjHandler.rmStar), 13, AspectLists.morningstarCrafting, new ItemStack(ObjHandler.matterBlock, 1, 1), RecipeLists.morningstar);
            katar = addInfusion("KATAR", new ItemStack(ObjHandler.rmKatar), 13, AspectLists.katarCrafting, new ItemStack(ObjHandler.matterBlock, 1, 1), RecipeLists.katar);
            interdictionTorch = addInfusion("INTERDICTION", new ItemStack(ObjHandler.confuseTorch), 3, AspectLists.interdictionTorchCrafting, new ItemStack(Blocks.redstone_torch), RecipeLists.interdictionTorch);
            energCondenserMk2 = addInfusion("CONDENSERMK2", new ItemStack(ObjHandler.condenserMk2), 7, AspectLists.energCondenserMk2Crafting, new ItemStack(ObjHandler.condenser), RecipeLists.energCondenserMk2);
            dmPedestal = addInfusion("DMPEDESTAL", new ItemStack(ObjHandler.dmPedestal), 5, AspectLists.dmPedestalCrafting, new ItemStack(ConfigBlocks.blockStoneDevice, 1, 1), RecipeLists.dmPedestal);
            novaCatalyst = addInfusion("EXPLOSIVES", new ItemStack(ObjHandler.novaCatalyst), 2, AspectLists.novaCatalystCrafting, new ItemStack(Blocks.tnt), RecipeLists.novaCatalyst);
            novaCataclysm = addInfusion("EXPLOSIVES", new ItemStack(ObjHandler.novaCataclysm), 4, AspectLists.novaCataclysmCrafting, new ItemStack(ObjHandler.novaCatalyst), RecipeLists.novaCataclysm);
            dmFurnace = addInfusion("DMFURNACE", new ItemStack(ObjHandler.dmFurnaceOff), 5, AspectLists.dmFurnaceCrafting, new ItemStack(Blocks.furnace), RecipeLists.dmFurnace);
            rmFurnace = addInfusion("RMFURNACE", new ItemStack(ObjHandler.rmFurnaceOff), 7, AspectLists.rmFurnaceCrafting, new ItemStack(ObjHandler.dmFurnaceOff), RecipeLists.rmFurnace);
            whiteAlchBag = addInfusion("ALCHEMYBAG", new ItemStack(ObjHandler.alchBag, 1, 0), 1, AspectLists.whiteAlchBagCrafting, new ItemStack(ObjHandler.alchChest), RecipeLists.whiteAlchBag);
            lowDiviner = addInfusion("DIVININERS", new ItemStack(ObjHandler.dRod1), 1, AspectLists.lowDivinerCrafting, new ItemStack(Items.stick), RecipeLists.lowDiviner);
            medDiviner = addInfusion("DIVININERS", new ItemStack(ObjHandler.dRod2), 3, AspectLists.medDivinerCrafting, new ItemStack(ObjHandler.dRod1), RecipeLists.medDiviner);
            highDiviner = addInfusion("DIVININERS", new ItemStack(ObjHandler.dRod3), 5, AspectLists.highDivinerCrafting, new ItemStack(ObjHandler.dRod2), RecipeLists.highDiviner);
            mercurialEye = addInfusion("MERCURIALEYE", new ItemStack(ObjHandler.mercEye), 5, AspectLists.mercurialEyeCrafting, new ItemStack(ObjHandler.matter, 1, 1), RecipeLists.mercurialEye);
            densityGem = addInfusion("DENSITYGEM", new ItemStack(ObjHandler.eternalDensity), 6, AspectLists.densityGemCrafting, new ItemStack(ObjHandler.matterBlock, 1, 0), RecipeLists.densityGem);
            bodyStone = addInfusion("STONES", new ItemStack(ObjHandler.bodyStone), 5, AspectLists.bodyStoneCrafting, new ItemStack(ObjHandler.matterBlock, 1, 1), RecipeLists.bodyStone);
            soulStone = addInfusion("STONES", new ItemStack(ObjHandler.soulStone), 5, AspectLists.soulStoneCrafting, new ItemStack(ObjHandler.matterBlock, 1, 1), RecipeLists.soulStone);
            mindStone = addInfusion("STONES", new ItemStack(ObjHandler.mindStone), 5, AspectLists.mindStoneCrafting, new ItemStack(ObjHandler.matterBlock, 1, 1), RecipeLists.mindStone);
            lifeStone = addInfusion("STONES", new ItemStack(ObjHandler.lifeStone), 7, AspectLists.lifeStoneCrafting, new ItemStack(ObjHandler.matterBlock, 1, 1), RecipeLists.lifeStone);
            evertide = addInfusion("AMULETS", new ItemStack(ObjHandler.everTide), 5, AspectLists.evertideAmuletCrafting, new ItemStack(ObjHandler.matterBlock, 1, 0), RecipeLists.evertide);
            volcanite = addInfusion("AMULETS", new ItemStack(ObjHandler.volcanite), 5, AspectLists.volcaniteAmuletCrafting, new ItemStack(ObjHandler.matterBlock, 1, 0), RecipeLists.volcanite);
            destructionCatalyst = addInfusion("LENSES", new ItemStack(ObjHandler.dCatalyst), 5, AspectLists.destructionCatalystCrafting, new ItemStack(Items.flint_and_steel), RecipeLists.destructionCatalyst);
            hyperkineticLens = addInfusion("LENSES", new ItemStack(ObjHandler.hyperLens), 6, AspectLists.hyperkineticLensCrafting, new ItemStack(ObjHandler.matterBlock, 1, 0), RecipeLists.hyperkineticLens);
            catalyticLens = addInfusion("LENSES", new ItemStack(ObjHandler.cataliticLens), 8, AspectLists.catalyticLensCrafting, new ItemStack(ObjHandler.matterBlock, 1, 1), RecipeLists.catalyticLens);
            transmutationTablet = addInfusion("TRANSMUTATIONTABLET", new ItemStack(ObjHandler.transmutationTablet), 3, AspectLists.transmutationTabletCrafting, new ItemStack(ObjHandler.transmuteStone), RecipeLists.transmutationTablet);
        }
    }

    private static void registerNormalRecipes() {

        if (TEConfig.mode == 1) {
            addNormalRecipe(new ItemStack(ObjHandler.matterBlock, 1, 0), "XXX", "XXX", "XXX", 'X', new ItemStack(ObjHandler.matter, 1, 0));
            addNormalRecipe(new ItemStack(ObjHandler.matterBlock, 1, 1), "XXX", "XXX", "XXX", 'X', new ItemStack(ObjHandler.matter, 1, 1));
        }

    }

    private static void removeNormalRecipes() {

        if (TEConfig.mode == 1) {
            RecipeHelper.items.add(new ItemStack(ObjHandler.matterBlock, 1, 0).getItem());
            RecipeHelper.items.add(new ItemStack(ObjHandler.matterBlock, 1, 1).getItem());
        }
    }

    private static void registerCrucibleRecipes() {

        if (TEConfig.mode == 1) {
            covalenceLow = addCrucible("COVALENCE", new ItemStack(ObjHandler.covalence, 1, 0), new ItemStack(Items.coal), AspectLists.covalenceLowCrafting);
            covalenceMed = addCrucible("COVALENCE", new ItemStack(ObjHandler.covalence, 1, 1), new ItemStack(ObjHandler.covalence, 1, 0), AspectLists.covalenceMedCrafting);
            covalenceHigh = addCrucible("COVALENCE", new ItemStack(ObjHandler.covalence, 1, 2), new ItemStack(ObjHandler.covalence, 1, 1), AspectLists.covalenceHighCrafting);

            alchCoal = addCrucible("FUELS", new ItemStack(ObjHandler.fuels, 1, 0), new ItemStack(Items.coal), AspectLists.alchCoal);
            mobiusFuel = addCrucible("FUELS", new ItemStack(ObjHandler.fuels, 1, 1), new ItemStack(ObjHandler.fuels, 1, 0), AspectLists.mobiusFuel);
            aeternalisFuel = addCrucible("FUELS", new ItemStack(ObjHandler.fuels, 1, 2), new ItemStack(ObjHandler.fuels, 1, 1), AspectLists.aeternalistFuel);
        }
    }

    private static ShapedArcaneRecipe addShapedArcane(String research, ItemStack output, AspectList aspectList, Object... recipe) {
        RecipeHelper.items.add(output.getItem());
        return ThaumcraftApi.addArcaneCraftingRecipe(research, output, aspectList, recipe);

    }

    private static InfusionRecipe addInfusion(String research, ItemStack output, int instability, AspectList aspectList, ItemStack focus, ItemStack[] ingredients) {
        RecipeHelper.items.add(output.getItem());
        return ThaumcraftApi.addInfusionCraftingRecipe(research, output, instability, aspectList, focus, ingredients);

    }

    private static CrucibleRecipe addCrucible(String key, ItemStack result, Object catalyst, AspectList aspectList) {
        RecipeHelper.items.add(result.getItem());
        return ThaumcraftApi.addCrucibleRecipe(key, result, catalyst, aspectList);
    }

    private static void addNormalRecipe(ItemStack output, Object... params) {
        RecipeHelper.items.add(output.getItem());
        GameRegistry.addRecipe(output, params);
    }

    //InfusionRecipes
    public static InfusionRecipe philoStone;
    public static InfusionRecipe darkMatter;
    public static InfusionRecipe darkMatterAxe;
    public static InfusionRecipe darkMatterHammer;
    public static InfusionRecipe darkMatterHoe;
    public static InfusionRecipe darkMatterShears;
    public static InfusionRecipe darkMatterShovel;
    public static InfusionRecipe darkMatterSword;
    public static InfusionRecipe darkMatterPick;
    public static InfusionRecipe darkMatterHelm;
    public static InfusionRecipe darkMatterChest;
    public static InfusionRecipe darkMatterLegs;
    public static InfusionRecipe darkMatterBoots;
    public static InfusionRecipe repairTalisman;
    public static InfusionRecipe alchemicalChest;
    public static InfusionRecipe energyCondenser;
    public static InfusionRecipe collectorMk1;
    public static InfusionRecipe relayMk1;
    public static InfusionRecipe collectorMk2;
    public static InfusionRecipe relayMk2;
    public static InfusionRecipe collectorMk3;
    public static InfusionRecipe relayMk3;
    public static InfusionRecipe swiftWolf;
    public static InfusionRecipe harvestGoddess;
    public static InfusionRecipe zeroRing;
    public static InfusionRecipe ignitionRing;
    public static InfusionRecipe blackHoleBand;
    public static InfusionRecipe voidRing;
    public static InfusionRecipe arcanaRing;
    public static InfusionRecipe timeWatch;
    public static InfusionRecipe kleinStarEin;
    public static InfusionRecipe kleinStarZwei;
    public static InfusionRecipe kleinStarDrei;
    public static InfusionRecipe kleinStarVier;
    public static InfusionRecipe kleinStarSphere;
    public static InfusionRecipe kleinStarOmega;

    public static InfusionRecipe redMatter;
    public static InfusionRecipe redMatterAxe;
    public static InfusionRecipe redMatterHammer;
    public static InfusionRecipe redMatterHoe;
    public static InfusionRecipe redMatterShears;
    public static InfusionRecipe redMatterShovel;
    public static InfusionRecipe redMatterSword;
    public static InfusionRecipe redMatterPick;
    public static InfusionRecipe redMatterHelm;
    public static InfusionRecipe redMatterChest;
    public static InfusionRecipe redMatterLegs;
    public static InfusionRecipe redMatterBoots;

    public static InfusionRecipe gemHead;
    public static InfusionRecipe gemChest;
    public static InfusionRecipe gemLegs;
    public static InfusionRecipe gemBoots;

    public static InfusionRecipe morningStar;
    public static InfusionRecipe katar;

    public static InfusionRecipe interdictionTorch;
    public static InfusionRecipe energCondenserMk2;
    public static InfusionRecipe dmPedestal;
    public static InfusionRecipe novaCatalyst;
    public static InfusionRecipe novaCataclysm;
    public static InfusionRecipe dmFurnace;
    public static InfusionRecipe rmFurnace;
    public static InfusionRecipe whiteAlchBag;
    public static InfusionRecipe lowDiviner;
    public static InfusionRecipe medDiviner;
    public static InfusionRecipe highDiviner;
    public static InfusionRecipe mercurialEye;
    public static InfusionRecipe densityGem;
    public static InfusionRecipe bodyStone;
    public static InfusionRecipe soulStone;
    public static InfusionRecipe mindStone;
    public static InfusionRecipe lifeStone;
    public static InfusionRecipe evertide;
    public static InfusionRecipe volcanite;
    public static InfusionRecipe destructionCatalyst;
    public static InfusionRecipe hyperkineticLens;
    public static InfusionRecipe catalyticLens;
    public static InfusionRecipe transmutationTablet;

    //Tome of Knowledge?


    //Crucible recipes?
//Fuels, dusts, etc
    public static CrucibleRecipe alchCoal;
    public static CrucibleRecipe mobiusFuel;
    public static CrucibleRecipe aeternalisFuel;
    public static CrucibleRecipe covalenceLow;
    public static CrucibleRecipe covalenceMed;
    public static CrucibleRecipe covalenceHigh;
    //ShapelessArcane

    //ShapedArcane
    public static ShapedArcaneRecipe transTable;
    public static ShapedArcaneRecipe ironBand;


}
