package com.van_tigranyan.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private final List<String> urls = new ArrayList<>();

    public void push(String url)  {
        urls.add(url);
    }

    public String pop() {
        var lastUrl = urls.get(urls.size() - 1);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }

    private static class ListIterator implements Iterator<String> {
        private final BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
