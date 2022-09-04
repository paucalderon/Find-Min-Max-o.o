//Ana Paulina Calderón
//80635513
//Find minimum and maximum value from array

public class calderon_ana_lab1{
	public static void main(String[] args){
		//creating object of the class
		calderon_ana_lab1 findMinMax = new calderon_ana_lab1();

		//declaring intefer array
		int arr[] = {1, 2, 3, 4};

		//calls findMin method and passes array
		findMinMax.findMin(arr);
		
		//calls findMax methos and passes aray
		findMinMax.findMax(arr);

	}

	//method for minimum value
	public void findMin(int[] arr){
		//sets up integer for minimum value
		int minValue = arr[0];

		//for loop gets/"reads" all of array
		for(int i = 1; i < arr.length; i++){
			//if statements checks if value is smaller than current value
			if(arr[i] < minValue){
				minValue = arr[i];
			}
		}
		//prints out minimum value
		System.out.println("The minimum value of the array is: " + minValue);
	}

	//method for max value
	public void findMax(int[] arr){
		//sets up integer for max value
		int maxValue = arr[0];

		//for loop gets/"reads" all of array
		for(int i = 1; i < arr.length; i++){
			//if statement checks if value is bigger than current value
			if(arr[i] > maxValue){
				maxValue = arr[i];
			}
		}
		//prints out maximum value
		System.out.println("The max value of the array is: " + maxValue);
	}
}







