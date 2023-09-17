/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigen;

/**
 *
 * @author student
 */

public class Matrix {
	private int[][] elements;

	public Matrix(int[][] elements) {
		this.elements = elements;
	}
	public int determinant(int[][] element) {
		if (element.length == 3 && element[0].length == 3) {
			int determinant = 0;
			determinant += element[0][0] * (element[1][1] * element[2][2] - element[1][2] * element[2][1]);
			determinant -= element[0][1] * (element[1][0] * element[2][2] - element[1][2] * element[2][0]);
			determinant += element[0][2] * (element[1][0] * element[2][1] - element[1][1] * element[2][0]);
			return determinant;
		} else {
			int determinant = 0;
			determinant = (element[0][0] * element[1][1] - (element[0][1] * element[1][0]));
			return determinant;
		}
	}
	public int trace() {
		int v = 0;
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[0].length; j++) {
				if (i == j) {
					v += elements[i][j];
				}
			}
		}
		return v;
	}
	public double discriminant(int a) {
		return ((Math.pow(a, 2)) - (4 * this.determinant(elements)));
	}

	public double[] eigenValue(double a, int b) {
		double[] v = new double[elements.length];
		v[0] = ((b + Math.sqrt(a)) / 2);
		v[1] = ((b - Math.sqrt(a)) / 2);
		return v;
	}

	public void eigenVectors(double v1, double v2) {
		double[] x = { elements[0][1],v1 - elements[0][0] };
		double[] y = { elements[0][1], v2 - elements[0][0] };
		System.out.println("The Eigen Vectors using Eigen Value "+v1);
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println("The Eigen Vectors using Eigen Value "+v2);
		System.out.println(y[0]);
		System.out.println(y[1]);
	}

}
