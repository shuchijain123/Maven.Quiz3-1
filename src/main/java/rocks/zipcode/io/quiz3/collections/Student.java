package rocks.zipcode.io.quiz3.collections;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private Map<Lab, LabStatus> student;




    public Student() {

        this.student= new TreeMap<>();
    }

    public Student(Map<Lab, LabStatus> map) {
        this.student = map;



    }

    public Lab getLab(String labName) {

        for(Lab lab: student.keySet()){
            if(labName.equals(lab.getName())){
                return lab;
            }
        }

        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab = getLab(labName);
        if(lab==null){
            throw new UnsupportedOperationException();
        }
        student.put(lab, labStatus);


    }


    public void forkLab(Lab lab) {

        student.put(lab, LabStatus.PENDING);
        // student.put(lab, LabStatus.COMPLETED);



    }



    public LabStatus getLabStatus(String labName) {
        Lab lab = getLab(labName);
        return student.get(lab);




        // throw new UnsupportedOperationException("Method not yet implemented");
    }

    @Override
    public String toString() {
        StringBuilder sn = new StringBuilder();

        for(Map.Entry<Lab, LabStatus> entry: student.entrySet()){
            sn.append(entry.getKey().getName());
            sn.append(" > ");
            sn.append(entry.getValue().toString());
            sn.append(("\n"));
        }
        sn.deleteCharAt(sn.length()-1);
        return sn.toString();
    }

}
