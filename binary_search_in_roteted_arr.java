public class binary_search_in_roteted_arr {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        int ans=search(arr,7,0,arr.length-1);
        System.out.println(ans);

    }
    public static int search(int arr[],int key,int s,int e){


        int m=s+(e-s)/2;

        if(arr[m]==key){
            return m;

        }
        if(arr[s]<=arr[m]){
            if(arr[s]>=key&&arr[m]<=key){
                return search(arr,key,s,m-1);
            }else{
               return search(arr,key,m+1,arr.length-1);
            }
        }
        if(arr[s]<=key&&arr[m]>=key){
            return search(arr,key,m+1,arr.length-1);
        }else{
            return search(arr,key,s,m-1);
        }

    }
}
