package com.github.ruediste.html5.std;

import java.util.ArrayList;

/**
 * Represents the HTML5 Standard
 */
public class HtmlStandard {

    public ArrayList<HtmlElement> elements = new ArrayList<>();
    public ArrayList<HtmlAttribute> globalAttributes = new ArrayList<>();
    public ArrayList<InputType> inputTypes = new ArrayList<>();

    public void print() {
        elements.forEach(e -> e.print());
        System.out.println("Global Attributes:");
        globalAttributes.forEach(a -> {
            System.out.println("  " + a);
        });
        System.out.println("Input types:");
        inputTypes.forEach(x -> x.print());
    }
}
