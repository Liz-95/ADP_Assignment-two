package za.ac.cput;

import CollectionListMapSet.AppConfig;
import CollectionListMapSet.CollectionInterface;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CollectionTest {
    private CollectionInterface tumi;


   //COLLECTION TEST
    //@Test
    //public void testCollection(){}




    //LIST TEST
    @Test
    public void testList(){
        List<Integer> listone = new ArrayList<Integer>();
        listone.add(0,10);
        listone.add(1,30);
        listone.add(2,40);
        listone.add(3,50);

        List<Integer> isExpected = new ArrayList<>();
        isExpected.add(0,10);
        isExpected.add(1,30);
        isExpected.add(2,40);
        isExpected.add(3,50);

        assertThat(listone, is(isExpected));
    }


    //MAP TEST
    @Test
    public void testMap(){
        TreeMap<Integer, String> treeMapone = new TreeMap();
        treeMapone.put(0, "Colour");
        treeMapone.put(1, "Your");
        treeMapone.put(2, "World");
        treeMapone.put(3, "Tumelo!");

        TreeMap<Integer, String> isExpected = new TreeMap();
        isExpected.put(0,"Colour");
        isExpected.put(1,"Your");
        isExpected.put(2,"World");
        isExpected.put(3,"Tumelo!");

        assertThat(treeMapone, is(isExpected));



    }

    //SET TEST
    @Test
    public void testSet(){
        Set<String> setone = new HashSet<>();
        setone.add("Dream");
        setone.add("Complicated");
        setone.add("Aspirations");
        setone.add("Faith");

        Set<String> isExpected = new HashSet<>();
        isExpected.add("Dream");
        isExpected.add("Complicated");
        isExpected.add("Aspirations");
        isExpected.add("Faith");
        assertThat(setone , is (isExpected));


    }


    //Exeptions
    @Before
    public void setUp() throws Exception {
        ApplicationContext txt = new AnnotationConfigApplicationContext(AppConfig.class);
        tumi = (CollectionInterface) txt.getBean("tumi");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
   public void testDivide() throws Exception{
       int answer = tumi.divide(36,12);
       Assert.assertEquals("Quotient of 36/12 is equals to 3", answer,3);
    }

}
