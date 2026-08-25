import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class studentmngt {
    ArrayList <student> ls=new ArrayList<student>();
    Map<Integer,student> map=new HashMap<Integer,student>();
    
    public void add(student s)throws studexception{
        if(map.get(s.getRollno())!=null){
            throw new studexception("Student Already exist");
        }
        ls.add(s);
            map.put(s.getRollno(),s);
            System.out.println("Student added successfully"+ ls);
    }

    public void search(int roll) throws studexception{
        if (map.get(roll)==null){
            throw new studexception("Student not found");
        }
        else{
            System.out.println("student found.");
        }
    }

    public void del(int roll) throws studexception{
        student s=map.get(roll);
        if(s==null){
            throw new studexception("student not found");
        }else {
            ls.remove(s);
            map.remove(roll);
        }

    }

    public void update(int roll,String name,int marks) throws studexception{
        student s=map.get(roll);
        if(s==null){
            throw new studexception("not found");
        }else
        {
            s.setName(name);
            s.setMarks(marks);
            System.out.println("record updated");
        }
    }

    public void display() throws studexception{
        System.out.println("List:"+ls);
        if(ls.isEmpty()){
            throw new studexception ("list is empty.");
        }
        else{
            for(student s:ls){
                System.out.println(s);
            }
        }  
    }
};
