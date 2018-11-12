public class Task1 {
    MyItem item1, item2, item3, item4, item5, item6,item7, item8, item9, item10, currentItem;

    Task1 (){
        item1 = new MyItem(1);
        item2 = new MyItem(2);
        item3 = new MyItem(3);
        item4 = new MyItem(4);
        item5 = new MyItem(5);
        item6 = new MyItem(6);
        item7 = new MyItem(7);
        item8 = new MyItem(8);
        item9 = new MyItem(9);
        item10 = new MyItem(10);

        item1.nextItem = item2;
        item2.nextItem = item3;
        item3.nextItem = item4;
        item4.nextItem = item5;
        item5.nextItem = item6;
        item6.nextItem = item7;
        item7.nextItem = item8;
        item8.nextItem = item9;
        item9.nextItem = item10;

    }

    void printValues(){
        currentItem = item1;
        for (int i = 0; i < 10 ; i++) {
            System.out.print(currentItem.value + " ");
            currentItem = currentItem.nextItem;
        }
        System.out.println();
    }

    void printValuesRevers (){
        int j=10;
        do {
            currentItem = item1;
            for (int i = 1; i <= 10; i++) {
                if (i == j) {
                    System.out.print(currentItem.value + " ");
                } else
                    currentItem = currentItem.nextItem;
            }
            j--;
        }while (j!=0);
    }
}
