package task20;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BlockTest {
    private EnergyCollectionPoint ecp;

    @Before
    public void before() {
        this.ecp = new EnergyCollectionPoint();
    }

    @Test
    public void testEnergyGenerationAmountOfOnes() {
        Block b = new Block("");
        b.activate();
        Assert.assertEquals(380, b.generateEnergy().replace("0", "").length());
    }

    @Test
    public void testEnergyGenerationNormalization() {
        BlockAdapter b = new BlockAdapter("", ecp);
        b.activate();
        String expected = "010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101";
        Assert.assertEquals(expected, b.getNormalizedEnergy());
    }
}
