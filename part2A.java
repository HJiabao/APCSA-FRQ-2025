public class SignedText{
  private String first,last;
  public SignedText(String f,String l){
    first=f;
    last=l;
  }
  public String getSignature(){
    if(first.length()==0){
      return last;
    }
    return first.substring(0,1)+"-"+last;
  }
  public String addSignature(String text){
    
  }
}
