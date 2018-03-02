package Superpowers;


import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test
    public void testFields(){
        Human human = new Human("Bob", 36, "Male", "carpenter", "address");

        Assert.assertEquals("Bob", human.getName());
        Assert.assertEquals(36, human.getAge());
        Assert.assertEquals("Male", human.getGender());
        Assert.assertEquals("carpenter", human.getOccupation());
        Assert.assertEquals("address", human.getAddress());

    }


}
