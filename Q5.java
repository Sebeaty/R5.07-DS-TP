public class Q5
{
  public String triangle(int n)
  {
    String s = "";
    for(int i =n;i>=0;i--)
      {
        for(int j=n;j>=i;j--)
        {
          s+="x ";
        }
        s+="\n";
      }
    System.out.println(s);
    return s
  }
}
