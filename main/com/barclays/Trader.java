package com.barclays;

public class Trader {
   private float totalMeterLength;
   public void addTwoMaterialLengths(MaterialWithLength material, MaterialWithLength otherMaterial){
       this.totalMeterLength = material.getMeterLength()+ otherMaterial.getMeterLength()
               +(material.getCentimeterLength()+ otherMaterial.getCentimeterLength())/100;
   }
    //Answer always returned in meters
    public float getTotalLengthOfMaterials(){
        return this.totalMeterLength;
    }
    public boolean compareMaterialLengths(MaterialWithLength material,MaterialWithLength otherMaterial){
        float materialTotalLength = material.getMeterLength() + material.getCentimeterLength()/100;
        float otherMaterialTotalLength = otherMaterial.getMeterLength() + otherMaterial.getCentimeterLength()/100;
        return (materialTotalLength==otherMaterialTotalLength);
    }
}
