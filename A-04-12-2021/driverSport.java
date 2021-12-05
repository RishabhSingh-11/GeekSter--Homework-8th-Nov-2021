/*2. When a subclass inherits from a superclass, it also inherits its methods; however,
        it can also override the superclass methods (as well as declare and implement new ones).
        Consider the following Sports class:*/


class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

/*Next, we create a Soccer class that inherits from the Sports class.
        We can override the getName method and return a different, subclass-specific string:*/

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}



public class driverSport {
    public static void main(String[] args) {
        Sports c = new Sports();
        Soccer sc = new Soccer();
        System.out.println(c.getName());
        c.getNumberOfTeamMembers();
        System.out.println(sc.getName());
        sc.getNumberOfTeamMembers();

    }
}
