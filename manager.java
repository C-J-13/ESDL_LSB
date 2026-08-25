class manager extends employe{
    String bonus;

    public manager(String name, String empID, long salary, String designation, String bonus) {
        super(name, empID, salary, designation="manager");
        this.bonus = bonus;
    }

    @Override
    public String toString() {
                
        return "manager [bonus=" + bonus + "]";
    }

    @Override
    public void display(){
        super.display();
        System.out.println("bonus:"+bonus);
    }
}
