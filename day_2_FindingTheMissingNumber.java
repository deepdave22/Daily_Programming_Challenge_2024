public class day_2_FindingTheMissingNumber{
  public static int findNumber(int[] arr){
    int n = arr.length + 1;
    long Sum_of_all_numbers = (long)n*(n+1)/2;
    long sum_we_got=0;

    for(int num : arr){
        sum_we_got +=num;
     }
    return (int) (Sum_of_all_numbers - sum_we_got);
}
