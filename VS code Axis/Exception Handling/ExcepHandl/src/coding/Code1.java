package coding;

public class Code1 {
    public void isExists(){
        int[] arr={10,20,30,50};
        int key=10;
        int c2=0;
        int c1=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                c1++;
                ans=i;
            }
            else{
                c2++;
            }
        }
        if(c1==1){
            System.out.println(ans);
        }
        else{
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        
        Code1 c1=new Code1();
        c1.isExists();
    }
}
