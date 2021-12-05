/* Add an equals method to this class that returns true if the current Dog and passed Dog have the same name.
The code should print false twice then true twice. */


public class doG
{
    private String name;

    public doG(String name)
    {
        this.name = name;
    }

    public boolean equals(Object other)
    {
        // ADD CODE HERE
        doG d1 = (doG) other;
        return this.name.equals(d1.name);
    }


    public static void main(String[] args)
    {
        doG d1 = new doG("Rufus");
        doG d2 = new doG("Sally");
        doG d3 = new doG("Rufus");
        doG d4 = d3;
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d3.equals(d4));
    }
}
