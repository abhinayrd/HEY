class javexample{  
    public static void main(String args[]){    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(getMaximum(arr));
     }
    int getMaximum(int arr[]){
        int res = arr[0];
        for(int i : arr) res = Math.max(res, i);
        return res;
    }
}  
