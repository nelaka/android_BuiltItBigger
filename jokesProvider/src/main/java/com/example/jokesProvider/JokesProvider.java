package com.example.jokesProvider;

import java.util.ArrayList;

public class JokesProvider {
    private ArrayList<String> jokes = new ArrayList<>();
    private int position = -1;

    private void prepareJokes(){

        //https://www.scandit.com/top-10-geek-jokes-for-developers/
        jokes.add("To understand what recursion is, you must first understand recursion.");
        jokes.add("Q: how many programmers does it take to change a light bulb?\nA: none, that' s a hardware problem");
        jokes.add("Q. How did the programmer die in the shower?\n  A. He read the shampoo bottle instructions: Lather. Rinse. Repeat.");

    }


    public String tellAJoke(){
        prepareJokes();
        if ( position < jokes.size() - 1 )  position = position + 1;
            else position = 0;
            //we use replaceAll for the apostrofe (') character to be recognized correctly inside TextView
        return jokes.get(position).replaceAll("\u2019", "&#39;");

    }
}






