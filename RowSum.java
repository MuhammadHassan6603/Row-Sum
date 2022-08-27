class RowSum
{
    public static void main(String[] args) {
        int A[][]={{2,4},
                   {2,6}};
        int Res[][]=new int[1][2];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                Res[0][i]=Res[0][i]+A[i][j];
                System.out.print(Res[0][i] + " ");
            }
            System.out.println();
        }
    }
}