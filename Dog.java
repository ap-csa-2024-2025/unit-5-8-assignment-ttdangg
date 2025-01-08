public class Dog
{
  private String name;
  private int ID;
  private static int numDogs = 0;

  // Non-default Dog constructor
  public Dog(String name)
  {
    this.name = name;
    numDogs++; 
  }

  // Default Dog constructor

  // Setters - instance variables only
  public void setName(String name)
  {
    name = iName
  }
  public void setID(int ID)
  {
    ID = iID
  }

  // Getters - instance variables only
  public String getName()
  {
    return name;
  }
  public int getID()
  {
    return ID;
  }

  // method getNumDogs
  public static int getNumDogs()
  {
    return numDogs;
  }




}
