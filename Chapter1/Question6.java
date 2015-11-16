package ctci;

import java.util.Arrays;

/*
 * Given an image represented by an NxN matrix, 
 * where each pixel in the image is 4 bytes, 
 * write a method to rotate the image by 90 degrees.
 * Can you do this in place?
 */

public class Question6 {
	

	public static void main(String[] args){	
		int[][] m1 = null;
		int[][] m2 = {};
		int[][] m3 = {{1}};
		int[][] m4 = {{1,2},{3,4}};
		int[][] m5 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		ptMatrix (rotate(m1));  //null
		ptMatrix (rotate(m2));  //{}
		ptMatrix (rotate(m3));  //{{1}}
		ptMatrix (rotate(m4));  //{{3,1},{4,2}}
		ptMatrix (rotate(m5));  //{{7,4,1},{8,5,2},{9,6,3}}
		
		ptMatrix (rotateInPlace(m1));  //null
		ptMatrix (rotateInPlace(m2));  //{}
		ptMatrix (rotateInPlace(m3));  //{{1}}
		ptMatrix (rotateInPlace(m4));  //{{3,1},{4,2}}
		ptMatrix (rotateInPlace(m5));  //{{7,4,1},{8,5,2},{9,6,3}}

	}
	
	//rotate but not in place
	public static int[][] rotate(int[][] matrix){
		if(matrix == null){
			return null;
		}else if(matrix.length == 0 || matrix.length == 1){
			return matrix;
		}else{
			//make another copy of matrix and just import from old matrix to new matrix with i and j reversed
			int[][] rotatedMatrix = new int[matrix.length][matrix.length]; //nxn matrix
			for(int i = 0; i<matrix.length; i++){
				for(int j=0; j<matrix[i].length;j++){
					rotatedMatrix[i][j]=matrix[matrix.length-1-j][i]; 
				}
			}
			return rotatedMatrix;
		}
	}
	
	//rotateInPlace
	public static int[][] rotateInPlace(int[][] matrix){
		if(matrix == null){
			return null;
		}else if(matrix.length == 0 || matrix.length == 1){
			return matrix;
		}else{
			for(int layer = 0; layer<matrix.length; layer++){
				int last = matrix.length - 1 - layer;
				for(int i = layer; i < last; i++){
					int offset = i - layer;
					//save top left
					int topLeft = matrix[layer][i];
					//bottom left to top left
					matrix[layer][i] = matrix[last-offset][layer];
					//bottom-right to bottom left
					matrix[last-offset][layer] = matrix[last][last - offset];
					//top-right to bottom-right
					matrix[last][last - offset] = matrix[i][last];
					//top-left to top right
					matrix[i][last] = topLeft;
				}
			}
			return matrix;
		}
	}
	
	private static void pt(Object obj){
		System.out.println(obj);
	}
	
	private static void ptMatrix(int[][] matrix){
		System.out.println((Arrays.deepToString(matrix)));
	}
}
