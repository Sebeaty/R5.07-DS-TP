public class Q5
{
  public String triangle(int n)
  {
    String s = "";
    for(int i =0;i<=n;i++)
      {
        for(int j=0;j<=i;j++)
        {
          s+=""+j+" ";
        }
        s+="\n";
      }
    System.out.println(s);
    return s
  }
}
