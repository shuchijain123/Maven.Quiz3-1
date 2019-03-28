package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab> {




    String labName;



    public Lab() {



       this(" ");

    }

    public Lab(String labName) {

        this.labName=labName;


    }

    public String getName() {


        return labName;
    }



    @Override
    public int compareTo(Lab o) {



        int lab = labName.compareTo(o.labName);
        return lab;
    }


}
