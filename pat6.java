//Border numbers
class pat6{
    public static void main(String[] args) {
        int i , j, n = 5;
        for (i = 1; i <= n; i++) {
            for(j = 1; j <= n; j++){
                if(i == 1|| i == n || j == 1|| j == n){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*

Output:

1 2 3 4 5 
1       5 
1       5 
1       5 
1 2 3 4 5 

*/