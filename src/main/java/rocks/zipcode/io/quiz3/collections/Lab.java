package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {

    String labName="duplicate deleter";
    LabStatus labStatus=LabStatus.PENDING;


    public Lab() {



       this.labName=labName;
       this.labStatus=labStatus;
    }

    public Lab(String labName) {

        this.labName=labName;





    }

    public String getName() {


        return labName;
    }

    public void setStatus(LabStatus labStatus) {

        this.labStatus=labStatus;

    }

    public LabStatus getStatus() {

        return  labStatus;
    }
}
