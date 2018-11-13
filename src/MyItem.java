public class MyItem {
    int value;
    MyItem nextItem;

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
}
