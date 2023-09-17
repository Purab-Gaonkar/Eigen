package eigen;



import java.util.Scanner;

public class Eigen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

				System.out.println("Enter The Number Of Rows");
				int rows = s.nextInt();
				System.out.println("Enter The Number Of Columns");
				int cols = s.nextInt();
				System.out.println("Enter The Elements OF The Matrix:");
				int[][] arr = new int[rows][cols];
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						arr[i][j] = s.nextInt();
					}
				}
				Matrix M1 = new Matrix(arr);
				int trace = M1.trace();
				double dis = M1.discriminant(trace);
				double[] v;
				v = M1.eigenValue(dis, trace);
				System.out.println("Eigen Value:" + v[0]);
				System.out.println("Eigen Value:" + v[1]);
				M1.eigenVectors(v[0], v[1]);

		

			
			}
		}
 


