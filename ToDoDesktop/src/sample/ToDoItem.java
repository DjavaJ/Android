package sample;

/**
 * Created by dangelojoyce on 2/20/17.
 */
public class ToDoItem {

    String text;
    boolean isDone;

    public ToDoItem(String text){
        this.text = text;
        isDone = false;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString(){
        return text + (isDone ? " (done) " : ""); //concatenating done or not based on the value of isDone variable +
    }


}
