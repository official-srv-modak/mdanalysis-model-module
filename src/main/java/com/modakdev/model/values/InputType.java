package com.modakdev.model.values;

public enum InputType {
    SINGLE_SELECT_CHECK("single_select_checkbox"),
    CHECKBOX("checkbox"),
    RADIO_TWO_VALUE("radio"),
    SINGLE_TEXT("single_text"),
    MULTIPLE_TEXT("multiple_text")
    ;

    private final String stringValue;

    InputType(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
