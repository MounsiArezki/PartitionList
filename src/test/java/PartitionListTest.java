import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PartitionListTest {

    List<Integer> l;

    @Before
    public void setUp() throws Exception {
        l = Arrays.asList(1, 2, 3, 4,5);
    }

    @Test(expected = NullPointerException.class)
    public void listNullTest() {
        PartitionList.partition(null, 1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void sublistSizeNegativeTest() {
        PartitionList.partition(l, -1);
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void OutOfboundsExceptionTest() {
        PartitionList<Integer> res =PartitionList.partition(l, 2);
        res.get(3);

    }


    @Test
    public void listSizeZeroTest() {
    Assert.assertTrue(PartitionList.partition(new ArrayList<>(), 1).size() == 0);
    }

    @Test
    public void PartitionSizeUnTest() {
        PartitionList<Integer> res =PartitionList.partition(l, 1);
        List<Integer> expectedLastSubList = List.of(5);

        Assert.assertTrue(res.size() == 5);
        Assert.assertEquals(expectedLastSubList,res.get(res.size()-1));

    }

    @Test
    public void PartitionSizeDeuxTest() {
        PartitionList<Integer> res =PartitionList.partition(l, 2);
        List<Integer> expectedLastSubList = List.of(5);

        Assert.assertTrue(res.size() == 3);
        Assert.assertEquals(expectedLastSubList,res.get(res.size()-1));
    }
   @Test
    public void PartitionSizeTroisTest() {
        PartitionList<Integer> res =PartitionList.partition(l, 3);
        List<Integer> expectedLastSubList = List.of(4,5);

        Assert.assertTrue(res.size() == 2);
        Assert.assertEquals(expectedLastSubList,res.get(res.size()-1));
    }

    @Test
    public void PartitionSizeCinqTest() {
        PartitionList<Integer> res =PartitionList.partition(l, 5);
        List<Integer> expectedLastSubList = List.of(1,2,3,4,5);

        Assert.assertTrue(res.size() == 1);
        Assert.assertEquals(expectedLastSubList,res.get(res.size()-1));
    }




}
