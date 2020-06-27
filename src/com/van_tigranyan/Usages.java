package com.van_tigranyan;

import com.van_tigranyan.memento.Editor;
import com.van_tigranyan.memento.History;

public class Usages {
    public void callMemento() {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
