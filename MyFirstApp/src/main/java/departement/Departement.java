package departement;

public class Departement {
    int depId;
    String depName;

    Departement(int depId,String depName){
        int dname=(Integer.parseInt(depName))+100;
        this.depId=depId+100;
        this.depName="departement_"+(Integer.toString(dname));
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
    public void print(){
        System.out.println(getDepId()+" "+getDepName());
    }

}
