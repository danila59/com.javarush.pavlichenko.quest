package org.example.quest.model;

import java.util.List;

public class RadioButton {

    private String name;
    private String code;
    private List<RadioButton> avalibleRadioButtons;
    private String resultDescription;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public List<RadioButton> getAvalibleRadioButtons() {
        return avalibleRadioButtons;
    }

    public void setAvalibleRadioButtons(List<RadioButton> avalibleRadioButtons) {
        this.avalibleRadioButtons = avalibleRadioButtons;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResultDescription() {
        return resultDescription;
    }

    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }
}
