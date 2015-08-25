package com.barclays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MaterialLengthTest {
    Trader trader;
    MaterialWithLength material;
    MaterialWithLength otherMaterial;

    @Before
    public void setUp(){
        trader = new Trader();
    }
    @After
    public void tearDown(){
        trader = null;
    }
    @Test
    public void shouldAddTwoLengthsBothInMeters(){
        material = new MaterialWithLength(2,0);
        otherMaterial = new MaterialWithLength(1,0);
        trader.addTwoMaterialLengths(material, otherMaterial);
        assertEquals(3, trader.getTotalLengthOfMaterials(), 0.0001f);
    }

    @Test
    public void shouldAddTwoLengthsBothInCentimeters(){
        material = new MaterialWithLength(0,100);
        otherMaterial = new MaterialWithLength(0,700);
        trader.addTwoMaterialLengths(material,otherMaterial);
        assertEquals(8.0,trader.getTotalLengthOfMaterials(),0.0001f);
    }
    @Test
    public void shouldAddTwoLengthsBothInDifferentCombinations(){
        material = new MaterialWithLength(1,210);
        otherMaterial = new MaterialWithLength(6,900);
        trader.addTwoMaterialLengths(material,otherMaterial);
        assertEquals(18.1,trader.getTotalLengthOfMaterials(),0.0001f);
    }

    @Test
      public void shouldDisplayTrueWhenLengthEqual(){
        material = new MaterialWithLength(1,200);
        otherMaterial = new MaterialWithLength(2,100);
        assertTrue(trader.compareMaterialLengths(material, otherMaterial));
    }
    @Test
    public void shouldDisplayFalseWhenLengthNotEqual(){
        material = new MaterialWithLength(2,200);
        otherMaterial = new MaterialWithLength(2,100);
        assertFalse(trader.compareMaterialLengths(material, otherMaterial));
    }

}
