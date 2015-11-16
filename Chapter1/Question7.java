package ctci;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Write an algorithm such that if an element in an MxN matrix is 0, 
 * its entire row and column is set to 0
 */

public class Question7 {
	

	public static void main(String[] args){	
		int[][] m1 = null;
		int[][] m2 = {};
		int[][] m3 = {{0}};
		int[][] m4 = {{1,0}};
		int[][] m5 = {{1,2,3}, {4,5,0}};
		int[][] m6 = {{1,2,3}, {4,5,0}, {6,0,7}, {8, 9, 10}};
		
		ptMatrix (zero(m1));  //null
		ptMatrix (zero(m2));  //{}
		ptMatrix (zero(m3));  //{{0}}
		ptMatrix (zero(m4));  //{{0,0}}}
		ptMatrix (zero(m5));  //{{1,2,0},{0,0,0}}}
		ptMatrix (zero(m6));  //{{1,0,0},{0,0,0},{0,0,0},{8,0,0}}
		
	}
	
	//rotate but not in place
	public static int[][] zero(int[][] matrix){
		if(matrix == null){
			return null;
		}else if(matrix.length == 0){
			return matrix;
		}else{
			ArrayList<Integer> rowsToZero = new ArrayList<Integer>();
			ArrayList<Integer> colsToZero = new ArrayList<Integer>();
			for(int i = 0; i<matrix.length; i++){
				for(int j = 0; j<matrix[0].length; j++){
					if(matrix[i][j]==0){
						rowsToZero.add(i);
						colsToZero.add(j);
					}
				}
			}
			zeroRows(matrix, rowsToZero);
			zeroCols(matrix, colsToZero);
			return matrix;
		}
	}
	
	private static void zeroRows(int[][] matrix, ArrayList<Integer> rows){
		for(int i = 0; i<rows.size(); i++){
			int row = rows.get(i);
			for(int j = 0; j<matrix[0].length;j++){
				matrix[row][j]=0;
			}
		}
	}
	
	private static void zeroCols(int[][] matrix, ArrayList<Integer> cols){
		for(int c = 0; c<cols.size(); c++){
			int col = cols.get(c);
			for(int i = 0; i<matrix.length;i++){
				matrix[i][col]=0;
			}
		}
	}
		
	private static void pt(Object obj){
		System.out.println(obj);
	}
	
	private static void ptMatrix(int[][] matrix){
		System.out.println((Arrays.deepToString(matrix)));
	}
}
