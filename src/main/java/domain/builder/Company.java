package domain.builder;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Build> blocks = new ArrayList<Build>();

    public void addBlock(Build builds)
    {
        blocks.add(builds);
    }

    public void showBlocks()
    {
        for(Build builder : blocks)
        {
            System.out.println("Company name: " + builder.Builder());
            System.out.println("Employee number: " + builder.employeeNumb() + "\n");
        }
    }
}
