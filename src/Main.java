import com.workintech.company.HRManager;
import com.workintech.company.JuniorDeveloper;
import com.workintech.company.MidDeveloper;
import com.workintech.company.SeniorDeveloper;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Cuboid;

public class Main {
    public static void main(String[] args) {
        Cylinder silindir = new Cylinder(1,3);
        System.out.println("Area:" + silindir.getArea());
        System.out.println("Volume:" + silindir.getVolume());

        Cuboid cuboid = new Cuboid(2,2,2);
        System.out.println("Area:" + cuboid.getArea());
        System.out.println("Volume:" + cuboid.getVolume());

        JuniorDeveloper junior1 = new JuniorDeveloper(1,"Junior1");
        JuniorDeveloper junior2 = new JuniorDeveloper(2,"Junior2");
        junior1.work();
        junior2.work();

        System.out.println(junior1);
        System.out.println(junior2);

        MidDeveloper mid1 = new MidDeveloper(3,"Mid1");
        MidDeveloper mid2 = new MidDeveloper(4,"Mid2");
        mid1.work();
        mid2.work();

        System.out.println(mid1);
        System.out.println(mid2);

        SeniorDeveloper sen1 = new SeniorDeveloper(5,"Senior1");
        SeniorDeveloper sen2 = new SeniorDeveloper(6,"Senior2");
        sen1.work();
        sen2.work();

        System.out.println(sen1);
        System.out.println(sen2);

        System.out.println("--------------------");

        HRManager hrManager = new HRManager(6,"HR Man. 1",
                new JuniorDeveloper[5],new MidDeveloper[2],new SeniorDeveloper[2]);
        hrManager.work();
        hrManager.addEmployee(0, junior1);
        hrManager.addEmployee(1, junior2);
        hrManager.addEmployee(0, mid1);
        hrManager.addEmployee(1, mid2);
        hrManager.addEmployee(0, sen1);
        hrManager.addEmployee(1, sen2);

        System.out.println(hrManager);






    }
}