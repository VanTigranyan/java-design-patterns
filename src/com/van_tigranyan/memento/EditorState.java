package com.van_tigranyan.memento;

public class EditorState {
    public EditorState(String content) {
        this.content = content;
    }

    private final String content;

    public String getContent() {
        return content;
    }
}
