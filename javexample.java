class javexample{  
 public static void main(String args[])  
 {    
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  int res = 0;
  for(int i = 0 ; i < n ; i++){
   arr[i] = sc.nextInt();
   if(i == 0) res = arr[i];
   res = Math.max(res, arr[i]);
  }
  System.out.println(res);
 }
}  
