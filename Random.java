import java.util.Random;
public class Mon10 {
 public static void main(String[] args) {  // 랜덤으로 만들어진 30가지 수를 최소값과 최대값 평균 만들기~~~~  Mon9과 애버노트에 설명되어있는 Random 사용해 완성했다.  
 Random ran = new Random();   
 int sum=0;  
 int[] dong = new int[30];  
 int b = dong[0];   
 int c = dong[0];  
 for(int g = 0;g<dong.length;g++) {  
 dong[g]=ran.nextInt();      
 }  
 for(int d =0 ; d<dong.length-1; d++) {    
 if(b>dong[d+1]) {     
 b=dong[d+1];     
 } else if(c<dong[d+1]) 
 {    c=dong[d+1];   }   
 }  
 for(int f =0 ; f<dong.length; f++) 
 {   sum+=dong[f];  }  
 System.out.println("최소값: "+b);  
 System.out.println("최대값: "+c);  
 System.out.println("평균: "+sum/dong.length); }
}
