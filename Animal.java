public class Animal
{
    public int numberLegs;
    public String name;

    public int getLegs()
    {
        return this.numberLegs;
    }

    public String toString()
    {
       String tmp = this.name;
       tmp += " : ";
       tmp += Integer.toString(numberLegs);
       return tmp;
    }

}
