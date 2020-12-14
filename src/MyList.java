
public class MyList 
{
	int value;
    MyList next;

    public MyList(int value, MyList next) {
        this.value = value;
        this.next = next;
    }

    public static MyList duplicate(MyList list) {
        if (list == null) {
            return null;
        } else {
            return new MyList(list.value,
                     new MyList(list.value,
                       duplicate(list.next)));
        }
    }
}


