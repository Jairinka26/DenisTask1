public class MyItem {
    int value;
    MyItem nextItem;
    boolean hasNext;

    MyItem (int a){
        value = a;
    }

    Object setnextItem (MyItem nextItem){
        this.nextItem = nextItem;
        return nextItem;
    }

    int getValue (){
        return value;
    }

    MyItem getNextItem (){
        return nextItem;
    }

    boolean hasNext(){
        if (nextItem != null)
            return true;
        else
            return false;
    }
}
