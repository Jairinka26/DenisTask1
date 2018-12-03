//изменить порядок следования элементовт.е. сейчас такitem1 -> item2 -> ... -> itemNа должно стать вот так:
//        itemN -> item N-1 -> .... -> item1это все должно быть сделано за 1 проход

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

//        use setter to set nextItem values
        item1.setnextItem(item2);
        item2.setnextItem(item3);
        item3.setnextItem(item4);
        item4.setnextItem(item5);
        item5.setnextItem(item6);
        item6.setnextItem(item7);
        item7.setnextItem(item8);
        item8.setnextItem(item9);
        item9.setnextItem(item10);
    }

    void printValues(){
        currentItem = item1;
        boolean pr = true;

        do {
            System.out.print(currentItem.getValue()+" ");
            if (currentItem.hasNext()) {
                currentItem = currentItem.getNextItem();
            }
            else
                pr = false;
        } while (pr == true);

        System.out.println();
    }

    void revers (){
        currentItem = item1;
        MyItem temp = null;
        MyItem nextTemp;

        while (currentItem.hasNext())
        {
            nextTemp = currentItem.getNextItem();
            currentItem.setnextItem(temp);
            temp = currentItem;
            currentItem =nextTemp;
        }
        currentItem.setnextItem(temp);

    }

    void printRevers(){
        currentItem = item10;
        boolean pr = true;

        do {
            System.out.print(currentItem.getValue()+" ");
            if (currentItem.hasNext()) {
                currentItem = currentItem.getNextItem();
            }
            else
                pr = false;
        } while (pr == true);

        System.out.println();
    }
}
