package departement;

public class Departement {
    int depId;
    String depName;

    Departement(int depId){
        this.depId=depId+100;
        this.depName="departement_"+(Integer.toString(depId+100));
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
    public String print(){
        return (getDepId()+" "+getDepName());
    }

}
