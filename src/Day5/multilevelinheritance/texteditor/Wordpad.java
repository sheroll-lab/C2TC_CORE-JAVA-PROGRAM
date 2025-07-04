package C2TC_CORE_JAVA_PROGRAM.src.Day5.multilevelinheritance.texteditor;

//Program to define child class Wordpad with formatting text feature

public class Wordpad extends Notepad {
    private boolean isBold;

    public Wordpad() {
        super();
        this.isBold = false;
    }

    public void formatText(boolean bold) {
        if (bold) {
            content = "<b>" + content + "</b>";
        }
        isBold = bold;
    }

    public boolean isBold() {
        return isBold;
    }
}