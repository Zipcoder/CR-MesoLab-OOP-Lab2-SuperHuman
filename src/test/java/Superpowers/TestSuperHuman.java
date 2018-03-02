package Superpowers;

import org.junit.Assert;
import org.junit.Test;

public class TestSuperHuman {
    @Test
    public void SuperHumanTest(){
        SuperHuman superHuman = new SuperHuman("Bob", 36, "Male", "carpenter",
                "address", "superBeast", "Git What chu Need", true,  false );


        Assert.assertEquals("superBeast", superHuman.getheroName());
        Assert.assertEquals("Git What chu Need", superHuman.getsuperAbility());
        Assert.assertEquals(true, superHuman.getGood());
        Assert.assertEquals(false, superHuman.getBad());

        Assert.assertEquals("Bob", superHuman.getName());
        Assert.assertEquals(36, superHuman.getAge());
        Assert.assertEquals("Male", superHuman.getGender());
        Assert.assertEquals("carpenter", superHuman.getOccupation());
        Assert.assertEquals("address", superHuman.getAddress());

    }

}
