package net.junedev.junetech_geo.api.materials;

import net.junedev.junetech_geo.api.interfaces.IMaterialHandler;
import net.minecraftforge.fluids.FluidType;

import java.util.*;

public class Chemicals {
        public static final List<IMaterialHandler> mMaterialHandlers = new ArrayList<>();
        private static final Map<String, net.junedev.junetech_geo.api.materials.Chemicals> CHEMICALS_MAP = new LinkedHashMap<>();

        public static final Map<FluidType, net.junedev.junetech_geo.api.materials.Chemicals> FLUID_MAP = new LinkedHashMap<>();


        public static Collection<net.junedev.junetech_geo.api.materials.Materials> VALUES = new LinkedHashSet<>();
        //sets defaults... might not need this?
        public static net.junedev.junetech_geo.api.materials.Chemicals _NULL = new net.junedev.junetech_geo.api.materials.Chemicals(-1, "NULL", "NULL", "NULL", 0, 0, 0, 0, "NULL", 255, false, 0, "NULL", 0);

        public Chemicals(int chemicalID, String name, String IUPACName, String formula, int pH, double meltingPoint, double boilingPoint, int meltsInto, String colorName, int transparency, boolean solubility, int dissolvesInto, String mineralAssociate, int enthalpyOfFormation) {
        }
        public static Chemicals Hydrogen;
        public static Chemicals Helium;
        public static Chemicals Lithium;
        public static Chemicals Beryllium;
        public static Chemicals Boron;
        public static Chemicals Carbon;
        public static Chemicals Nitrogen;
        public static Chemicals Oxygen;
        public static Chemicals Fluorine;
        public static Chemicals Neon;
        public static Chemicals Sodium;
        public static Chemicals Magnesium;
        public static Chemicals Aluminium;
        public static Chemicals Silicon;
        public static Chemicals Phosphorus;
        public static Chemicals Sulfur;
        public static Chemicals Chlorine;
        public static Chemicals Argon;
        public static Chemicals Potassium;
        public static Chemicals Calcium;
        public static Chemicals Scandium;
        public static Chemicals Titanium;
        public static Chemicals Vanadium;
        public static Chemicals Chromium;
        public static Chemicals Manganese;
        public static Chemicals Iron;
        public static Chemicals Cobalt;
        public static Chemicals Nickel;
        public static Chemicals Copper;
        public static Chemicals Zinc;
        public static Chemicals Gallium;
        public static Chemicals Germanium;
        public static Chemicals Arsenic;
        public static Chemicals Selenium;
        public static Chemicals Rubidium;
        public static Chemicals Strontium;
        public static Chemicals Yttrium;
        public static Chemicals Zirconium;
        public static Chemicals Niobium;
        public static Chemicals Molybdenum;
        public static Chemicals Ruthenium;
        public static Chemicals Rhodium;
        public static Chemicals Palladium;
        public static Chemicals Silver;
        public static Chemicals Cadmium;
        public static Chemicals Indium;
        public static Chemicals Tin;
        public static Chemicals Antimony;
        public static Chemicals Tellurium;
        public static Chemicals Iodine;
        public static Chemicals Caesium;
        public static Chemicals Barium;
        public static Chemicals Lanthanum;
        public static Chemicals Cerium;
        public static Chemicals Praseodymium;
        public static Chemicals Neodymium;
        public static Chemicals Samarium;
        public static Chemicals Europium;
        public static Chemicals Gadolinium;
        public static Chemicals Terbium;
        public static Chemicals Dysprosium;
        public static Chemicals Holmium;
        public static Chemicals Erbium;
        public static Chemicals Thulium;
        public static Chemicals Ytterbium;
        public static Chemicals Lutetium;
        public static Chemicals Hafnium;
        public static Chemicals Tantalum;
        public static Chemicals Tungsten;
        public static Chemicals Rhenium;
        public static Chemicals Osmium;
        public static Chemicals Iridium;
        public static Chemicals Platinum;
        public static Chemicals Gold;
        public static Chemicals Mercury;
        public static Chemicals Thallium;
        public static Chemicals Lead;
        public static Chemicals Bismuth;
        public static Chemicals Polonium;
        public static Chemicals Astatine;
        public static Chemicals Actinium;
        public static Chemicals Thorium;
        public static Chemicals Uranium;

        public Radioisotopes(int chemicalID, String chemicalName, String decayType, String decayProduct, double halfLife) {
        }

        //Raw Elements
        public static void load() {
                loadElements();
                loadChemicals();
                loadMinerals();
                loadIons();
                loadIsotopes();
        }

        private static void loadIsotopes() {
                Chemicals.Deuterium = loadDeuterium();
                Chemicals.Helium3 = loadHelium3();
        }

        private static void loadIons() {
        }

        private static void loadElements() {
                Chemicals.Hydrogen = loadHydrogen();
                Chemicals.Helium = loadHelium();
                Chemicals.Lithium = loadLithium();
                Chemicals.Beryllium = loadBeryllium();
                Chemicals.Boron = loadBoron();
                Chemicals.Carbon = loadCarbon();
                Chemicals.Nitrogen = loadNitrogen();
                Chemicals.Oxygen = loadOxygen();
                Chemicals.Fluorine = loadFluorine();
                Chemicals.Neon = loadNeon();
                Chemicals.Sodium = loadSodium();
                Chemicals.Magnesium = loadMagnesium();
                Chemicals.Aluminium = loadAluminium();
                Chemicals.Silicon = loadSilicon();
                Chemicals.Phosphorus = loadPhosphorus();
                Chemicals.Sulfur = loadSulfur();
                Chemicals.Chlorine = loadChlorine();
                Chemicals.Argon = loadArgon();
                Chemicals.Potassium = loadPotassium();
                Chemicals.Calcium = loadCalcium();
                Chemicals.Scandium = loadScandium();
                Chemicals.Titanium = loadTitanium();
                Chemicals.Vanadium = loadVanadium();
                Chemicals.Chromium = loadChromium();
                Chemicals.Manganese = loadManganese();
                Chemicals.Iron = loadIron();
                Chemicals.Cobalt = loadCobalt();
                Chemicals.Nickel = loadNickel();
                Chemicals.Copper = loadCopper();
                Chemicals.Zinc = loadZinc();
                Chemicals.Gallium = loadGallium();
                Chemicals.Germanium = loadGermanium();
                Chemicals.Arsenic = loadArsenic();
                Chemicals.Selenium = loadSelenium();
                Chemicals.Bromine = loadBromine();
                Chemicals.Krypton = loadKrypton();
                Chemicals.Rubidium = loadRubidium();
                Chemicals.Strontium = loadStrontium();
                Chemicals.Yttrium = loadYttrium();
                Chemicals.Zirconium = loadZirconium();
                Chemicals.Niobium = loadNiobium();
                Chemicals.Molybdenum = loadMolybdenum();
                Chemicals.Technetium = loadTechnetium();
                Chemicals.Ruthenium = loadRuthenium();
                Chemicals.Rhodium = loadRhodium();
                Chemicals.Palladium = loadPalladium();
                Chemicals.Silver = loadSilver();
                Chemicals.Cadmium = loadCadmium();
                Chemicals.Indium = loadIndium();
                Chemicals.Tin = loadTin();
                Chemicals.Antimony = loadAntimony();
                Chemicals.Tellurium = loadTellurium();
                Chemicals.Iodine = loadIodine();
                Chemicals.Xenon = loadXenon();
                Chemicals.Caesium = loadCaesium();
                Chemicals.Barium = loadBarium();
                Chemicals.Lanthanum = loadLanthanum();
                Chemicals.Cerium = loadCerium();
                Chemicals.Praseodymium = loadPraseodymium();
                Chemicals.Neodymium = loadNeodymium();
                Chemicals.Samarium = loadSamarium();
                Chemicals.Europium = loadEuropium();
                Chemicals.Gadolinium = loadGadolinium();
                Chemicals.Terbium = loadTerbium();
                Chemicals.Dysprosium = loadDysprosium();
                Chemicals.Holmium = loadHolmium();
                Chemicals.Erbium = loadErbium();
                Chemicals.Thulium = loadThulium();
                Chemicals.Ytterbium = loadYtterbium();
                Chemicals.Lutetium = loadLutetium();
                Chemicals.Hafnium = loadHafnium();
                Chemicals.Tantalum = loadTantalum();
                Chemicals.Tungsten = loadTungsten();
                Chemicals.Rhenium = loadRhenium();
                Chemicals.Osmium = loadOsmium();
                Chemicals.Iridium = loadIridium();
                Chemicals.Platinum = loadPlatinum();
                Chemicals.Gold = loadGold();
                Chemicals.Mercury = loadMercury();
                Chemicals.Thallium = loadThallium();
                Chemicals.Lead = loadLead();
                Chemicals.Bismuth = loadBismuth();
                Chemicals.Polonium = loadPolonium();
                Chemicals.Astatine = loadAstatine();
                Chemicals.Radon = loadRadon();
                Chemicals.Francium = loadFrancium();
                Chemicals.Radium = loadRadium();
                Chemicals.Actinium = loadActinium();
                Chemicals.Thorium = loadThorium();
                Chemicals.Protactinium = loadProtactinium();
                Chemicals.Uranium = loadUranium();
                Chemicals.Neptunium = loadNeptunium();
                Chemicals.Plutonium = loadPlutonium();
                Chemicals.Americium = loadAmericium();
                Chemicals.Curium = loadCurium();
                Chemicals.Berkelium = loadBerkelium();
                Chemicals.Californium = loadCalifornium();
                Chemicals.Einsteinium = loadEinsteinium();
                Chemicals.Fermium = loadFermium();
                Chemicals.Nobelium = loadNobelium();
                Chemicals.Lawrencium = loadLawrencium();
                Chemicals.Rutherfordium = loadRutherfordium();
                Chemicals.Dubnium = loadDubnium();
                Chemicals.Seaborgium = loadSeaborgium();
                Chemicals.Bohrium = loadBohrium();
                Chemicals.Hassium = loadHassium();
                Chemicals.Meitnerium = loadMeitnerium();
                Chemicals.Darmstadtium = loadDarmstadtium();
                Chemicals.Roentgenium = loadRoentgenium();
                Chemicals.Copernicium = loadCopernicium();
                Chemicals.Nihonium = loadNihonium();
                Chemicals.Flerovium = loadFlerovium();
                Chemicals.Moscovium = loadMoscovium();
                Chemicals.Livermorium = loadLivermorium();
                Chemicals.Oganesson = loadOganesson();

        }

        private static Chemicals loadHydrogen(){
                return new Chemicals(1,
                        "Dihydrogen", "Hydrogen", "H₂", 0, -259.16, -252.87, 0, "PaleBlue", 50, true, 1, "Null", 0);

        }
        private static Chemicals loadHelium(){
                return new Chemicals(1,
                        "Helium", "Helium", "He", 0, -268.93, -268.93, 0, "CoolGrey10", 50, false, 1, "Null", 0);

        }

        private static void loadChemicals() {
        }

        private static void loadMinerals() {
        }


}
