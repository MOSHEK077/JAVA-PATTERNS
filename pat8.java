//Multiplication table using Java
class pat8{
    public static void main(String[] args) {
        int i , j , n = 10;
        for(i = 1; i<= n;i++){
            for(j = 1; j<= n; j++){
                if(i*j<10)
                    System.out.print("0"+(i*j)+" ");
                
                else
                    System.out.print(i*j+" ");
            }
            System.out.println();

        }
    }
}

//Output:
/*

01 02 03 04 05 06 07 08 09 10 
02 04 06 08 10 12 14 16 18 20 
03 06 09 12 15 18 21 24 27 30 
04 08 12 16 20 24 28 32 36 40 
05 10 15 20 25 30 35 40 45 50 
06 12 18 24 30 36 42 48 54 60 
07 14 21 28 35 42 49 56 63 70 
08 16 24 32 40 48 56 64 72 80 
09 18 27 36 45 54 63 72 81 90 
10 20 30 40 50 60 70 80 90 100 

 */