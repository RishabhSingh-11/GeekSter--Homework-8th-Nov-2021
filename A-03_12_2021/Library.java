abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class Book1 extends Book{


    @Override
    void setTitle(String s) {
        System.out.println("The title is : " + s);
    }
}

public class Library
{
    public static void main(String[] args) {

        Book1 MyBook = new Book1();
        MyBook.setTitle("A tale of two cities");

    }
}
