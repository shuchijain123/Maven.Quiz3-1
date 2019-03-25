package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
Lab lb = new Lab();

    LabStatus labStatus = lb.getStatus();
    String  labName =lb.getName();



    Map<String,LabStatus> map = new HashMap<String ,LabStatus>();
    List<String> labs = new ArrayList<>();




    public Student() {


        this.labName=labName;
        this.labStatus=labStatus;

    }

    public Student(List<String> labs, Map<String,LabStatus> map) {


        for (int i = 0; i < labs.size(); i++)
         labs.add(labName);

        map.put(labName,labStatus);


        this.labs=labs;
        this.map=map;




    }

    public List<String> addLab(String labName){


            labs.add(labName);
      return labs;

    }


    public Map<String,LabStatus> addBoth(String labName,LabStatus labStatus){


        map.put(labName,labStatus);

        return map;

    }






    public Lab getLab(String labName) {


        Lab val = null;


        for (Object o : map.keySet()) {
            if (map.get(o).equals(labName)) {



            }
        }
        return val;
    }


    public void setLabStatus(String labName, LabStatus labStatus) {





       map.put(labName,labStatus);




    }

    public void forkLab(Lab lab) {





        if ( labStatus.equals("PENDING")){




            map.put(labName,labStatus);



        }


    }

    public LabStatus getLabStatus(String labName) {


        return map.get(getLab(labName));
    }
}
