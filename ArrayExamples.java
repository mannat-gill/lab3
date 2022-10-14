

public class ArrayExamples {

 
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
      int temp = arr[i]; 
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp; 
    }
    
  
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  /* 
     was originally setting the null array to the passed array,
     rather than the other way around. and returning the wrong array
     */
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
       newArray[arr.length - i- 1] = arr[i];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  //Issue: if duplicates of lowest number present, deletes all of them, instead of just one
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    int indexLow = 0; 
    for(int i=0; i<arr.length; i++) {
      if(arr[i] < lowest) { 
        lowest = arr[i];
        indexLow=i; 
      }
    }
    double sum = 0;
    for(int i=0; i<arr.length; i++){
      if(i!=indexLow){
        sum+=arr[i]; 
      }
    }
    return sum / (arr.length - 1);
  }


}

