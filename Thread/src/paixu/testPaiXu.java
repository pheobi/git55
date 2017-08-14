package paixu;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class testPaiXu {

	
	/**
	 * 冒泡排序:相邻数据比较将最大的放最后
	 * @throws Exception
	 */
	@Test
	public void testMaoPao() throws Exception {
		Integer[] arr= {1,5,2,10,18,7};//每次都将最大一个放最后
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]){
					//当前一个元素大于后一个时 交换
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * 选择排序 每次拿一个元素与其他元素比较,将最大的放在最后
	 * @throws Exception
	 */
	@Test
	public void testXuanZe() throws Exception {
		Integer[] arr = {1,5,2,10,18,7};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
		
	
}
