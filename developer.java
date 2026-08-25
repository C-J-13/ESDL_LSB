class developer extends employe{
    String skills;

    public developer(String name, String empID, long salary, String designation, String skills) {
        super(name, empID, salary, designation);
        this.skills = skills;
    }
    @Override
    public void display(){
        super.display();
        System.out.println(super.getName()+" knows "+skills);
    }

    @Override
    public String toString() {
        return "developer [skills=" + skills + "]";
    }
    


public void addskill(String skills,int exp){
    System.out.println(super.getName()+" have "+exp+" years of experience in "+ skills);

}}
