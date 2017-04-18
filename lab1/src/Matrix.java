


public class Matrix {
    private int dimension;
    private int matrix[][];

   public Matrix(int n){
        this.dimension = n;
       this.matrix = new int[n][n];

    }

  void  create() {
      for (int i = 0; i < dimension; i++) {
          for (int j = 0; j < dimension; j++) {

              if ((i == j) || (i+j==dimension-1)) {

                  matrix[i][j] = 1;

              } else {

                  matrix[i][j] = 0;
              }
          }

      }
  }


  void print() {
      for (int i = 0; i < dimension; i++) {
          for (int j = 0; j < dimension; j++) {

              System.out.print(matrix[i][j]);
          }
          System.out.println();
      }
  }

}
