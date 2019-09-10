import java.util.*;
public class Dog extends Animal
{
    public Dog(String name, int numberLegs)
    {
        this.numberLegs = numberLegs;
        this.name = name;
    }

    //  public int compareTo(Dog inDog)
    //  {
    //      if(this.numberLegs > inDog.numberLegs)
    //      {
    //          return -1;
    //      }
    //      else if(this.numberLegs < inDog.numberLegs)
    //      {
    //          return 1;
    //      }
    //      else
    //      {
    //          return this.name.compareTo(inDog.name);
    //      }
    //  }
}
