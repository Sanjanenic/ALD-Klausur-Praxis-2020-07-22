package wishlist;

public class PresentSorter {
    public void sortPresentsByDesire(Present[] presents) {
        // TODO

        //insertion sort
        for (int i =1; i<presents.length; i++){
            //
            for(int j=i ; j>0; j--){
                //bedunung pruft ob Vorgeneger grosser ist
                if((presents[j-1].desire > presents[j].desire)){
                    Present temp = presents[j];
                    presents[j]=presents[j-1];
                    presents[j-1]=temp;

                }
                else{
                    break;
                }
            }
        }

    }

}
