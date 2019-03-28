package rocks.zipcode.io.quiz3.collections;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {



    Map<Lab,LabStatus> student ;



    public Student() {


       this.student =new HashMap<>();

    }

    public Student(Map<Lab,LabStatus> map) {


        this.student=map;

    }

    public Lab getLab(String labName) {

       Lab mylab=null;
        for (Lab lab : student.keySet())
            if (lab.getName().equals(labName)) {

                mylab= lab;

            }
        return mylab;

    }

    public void setLabStatus(String labName, LabStatus labStatus) {

        Lab lab = getLab(labName);

        if (labName == null) {
            throw new UnsupportedOperationException("Invalid operation for sorted list.");

        }

       student.put(lab,labStatus);




    }

    public void forkLab(Lab lab) {

     student.put(lab, LabStatus.PENDING);
   }




    public LabStatus getLabStatus(String labName) {


        return student.get(getLab(labName));
    }
}
