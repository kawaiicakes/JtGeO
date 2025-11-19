package net.junedev.junetech_geo.api.materials;

public class ChemicalBuilder {
        private final int chemicalID;
        private String name;
        private String IUPACName;
        private String formula;
        private int pH;
        private double meltingPoint;
        private double boilingPoint;
        private int meltsInto; //ID of chemical it alters into, if applicable.
        private String colorName;
        private int transparency;
        private boolean solubility;
        private int dissolvesInto; //ID of chemicals and ions it dissolves into
        private String mineralAssociate;
        private int enthalpyOfFormation;

        public ChemicalBuilder(int chemicalID, String localName) {
            this.chemicalID = chemicalID;
            if (IUPACName.equals("NULL")){
                this.IUPACName = name;
            } else {
                this.name = localName.replace(" ", "")
                        .replace("-", "");
                this.IUPACName = localName;
            }
        }
        public Chemicals constructChemicals(int chemicalID, String name, String localName, String formula, int pH, double meltingPoint, double boilingPoint, int meltsInto, String colorName, int transparency, boolean solubility, int dissolvesInto, String mineralAssociate, int enthalpyOfFormation) {
            return new Chemicals(
                    chemicalID,
                    name,
                    localName,
                    formula,
                    pH,
                    meltingPoint,
                    boilingPoint,
                    meltsInto,
                    colorName,
                    transparency,
                    solubility,
                    dissolvesInto,
                    mineralAssociate,
                    enthalpyOfFormation
            );
        }
    public ChemicalBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public ChemicalBuilder setFormula(String formula) {
        this.formula = formula;
        return this;
    }
    public ChemicalBuilder setpH(int pH) {
        this.pH = pH;
        return this;
    }
    public ChemicalBuilder setMP(double meltingPoint) {
        this.meltingPoint = meltingPoint;
        return this;
    }
    public ChemicalBuilder setBP(double boilingPoint) {
        this.boilingPoint = boilingPoint;
        return this;
    }
    public ChemicalBuilder setMelt(int meltsInto) {
        this.meltsInto = meltsInto;
        return this;
    }
    public ChemicalBuilder setColorName(String colorName) {
        this.colorName = colorName;
        return this;
    }
    public ChemicalBuilder setTransparency(int transparency) {
        this.transparency = transparency;
        return this;
    }
    public ChemicalBuilder setSolubility(boolean solubility) {
        this.solubility = solubility;
        return this;
    }
    public ChemicalBuilder setSolution(int dissolvesInto) {
        this.dissolvesInto = dissolvesInto;
        return this;
    }
    public ChemicalBuilder setMineral(String mineralAssociate) {
        this.mineralAssociate = mineralAssociate;
        return this;
    }
    public ChemicalBuilder setEnthalpy(int enthalpyOfFormation) {
        this.enthalpyOfFormation = enthalpyOfFormation;
        return this;
    }
}

