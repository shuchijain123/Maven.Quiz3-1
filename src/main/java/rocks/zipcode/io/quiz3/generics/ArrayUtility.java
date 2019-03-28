package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType > {

    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {


        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType value=null;

        for (int i=0;i<array.length;i++)

       if (getNumberOfOccurrences(array[i])%2!=0){

         value =  array[i];
       }
        return value;
    }

    public SomeType findEvenOccurringValue(){

        SomeType value=null;

        for (int i=0;i<array.length;i++)

            if (getNumberOfOccurrences(array[i])%2==0){

                value =  array[i];
            }
        return value;
    }


    public Integer getNumberOfOccurrences(SomeType valueToEvaluate)

    {
        int maxOccurredElement=0;

        List<SomeType> mylist = Arrays.asList(array);

        maxOccurredElement =    Collections.frequency(mylist, valueToEvaluate);


        return maxOccurredElement;
    }


    public SomeType[] filter(Function<SomeType, Boolean> predicate){

//    {
//        for (SomeType type: array)
//       SomeType[]  numberArray = Arrays.stream(array).filter(c->predicate.apply(type).t(Object[]::new));
//
//      return null;
//    }

        List<SomeType> list = new ArrayList<>();
        for (SomeType type : array) {
            if (predicate.apply(type)) {
                list.add(type);
            }
        }
        SomeType[] newArray = Arrays.copyOf(array, list.size());

        return list.toArray(newArray);
    }



}
