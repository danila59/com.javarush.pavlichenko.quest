package org.example.quest.service;

import org.example.quest.model.RadioButton;

import static org.example.quest.dao.ValueBase.codeRadioButtonMap;

public class RadioButtonService {

    public RadioButton getNextRadioButton(String code) {
        return codeRadioButtonMap.get(code);
    }
}

