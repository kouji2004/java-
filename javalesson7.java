public class javalesson7 {
  public static void main(String[]ages){
    int num = 3;
    for(int i=1; i<num; i++){
      num = num+i;
      System.out.println("総数は"+num);
    }
    if(num == 0){
      System.out.println(0);
    }
  }
}
