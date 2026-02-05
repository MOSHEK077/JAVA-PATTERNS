//Programm 9 - Incremental Numbers
class pat9{
    public static void main(String[] args) {
        int i , j , n = 5;
        for(i = 1; i <= n ; i++){
            for(j = 1; j <= n ; j++){
                System.out.print(i+j-1+" ");
            }
            System.out.println();
        }
    }
}

/*

1 2 3 4 5 
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9 

*/