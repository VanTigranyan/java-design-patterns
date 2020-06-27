package com.van_tigranyan;

import com.van_tigranyan.memento.Editor;
import com.van_tigranyan.memento.History;
import com.van_tigranyan.state.Canvas;
import com.van_tigranyan.state.SelectionTool;

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

    public void callState() {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
