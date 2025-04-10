package org.example.quest.dao;

import org.example.quest.model.RadioButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValueBase {

    public static HashMap<String, RadioButton> codeRadioButtonMap = new HashMap<>();


    public void initValueBase() {

        RadioButton option1 = new RadioButton();
        option1.setName("Взять AR-15, проверить дверь.");
        option1.setCode("AR15_CHECK_DOOR");
        option1.setResultDescription("Ты хватаешь AR-15, привычным движением проверяешь магазин — полный, 30 патронов. Палец ложится на скобу спускового крючка.\n\nПодходишь к двери, прислушиваешься. Скребущий звук — будто кто-то царапает дверь ногтями. За дверью слышно хриплое дыхание...");
        option1.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option2 = new RadioButton();
        option2.setName("Резко распахнуть дверь и открыть огонь!");
        option2.setCode("OPEN_DOOR_SHOOT");
        option2.setResultDescription("Ты резко дергаешь ручку на себя, дверь распахивается — перед тобой два зомби в рваной одежде. Один уже тянет к тебе окровавленные руки. Рефлекторно вскидываешь AR-15: -Короткая очередь (5 патронов). \n-Глухие хлопки выстрелов," +
                " гильзы звенят об пол. -Первый зомби падает с простреленной головой. -Второй получает очередь в грудь, но продолжает идти! Шум привлекает остальных — из темноты коридора появляются еще пять мертвецов...");
        option2.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option3 = new RadioButton();
        option3.setName("Прорываться через них к лестнице, стреляя на ходу.");
        option3.setCode("PUSH_THROUGH_SHOOTING");
        option3.setResultDescription("Ты вжимаешь приклад в плечо, стреляя короткими очередями: -Три зомби падают, их черепа разлетаются. -Остальные спотыкаются о тела. -Ты прыгаешь через перила, приземляешься на пролет ниже.\nНа улице группа военных прикрывает отход гражданских. Один из солдат замечает тебя:  \n—\"Беги сюда, живенько!\"  \nТы прыгаешь в грузовик, и он с ревом уезжает.  \n✅ Спасение: \"Принят в группу\"");
        option3.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option4 = new RadioButton();
        option4.setName("Отступать на кухню, попытаться запереться.");
        option4.setCode("RETREAT_TO_KITCHEN");
        option4.setResultDescription("Ты отступаешь на кухню, опрокидываешь стол, блокируя дверь. Но зомби бьются в нее, дерево трещит. -Ты стреляешь через дверь (10 патронов). -Один падает, но остальные ломают преграду.\nКогда магазин пуст, ты хватаешь нож... но их слишком много.\n❌ Смерть: \"Последний патрон\"");
        option4.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option5 = new RadioButton();
        option5.setName("Медленно отступить, баррикадировать вход тяжелым шкафом.");
        option5.setCode("SLOWLY_RETREAT_BARRICADE_HEAVY_CABINET");
        option5.setResultDescription("Ты упираешься плечом в шкаф, с грохотом сдвигая его к двери. Снаружи раздаются яростные удары.\"");
        option5.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option6 = new RadioButton();
        option6.setName("Попытаться выбраться через балкон (2 этаж).");
        option6.setCode("TRY_OUT_THE_BALCONY");
        option6.setResultDescription("Ты разбиваешь окно балкона**, осматриваешь двор. Внизу — только один зомби, бредущий вдалеке.\n" +
                "\n" + "-Срываешь шторы, связываешь их узлами.\n" +
                "\n" + "- Привязываешь импровизированную веревку к батарее.\n" +
                "\n" + "- Спускаешься, руки горят от трения.**\n" +
                "\n" + "\n" + "Ты приземляешься в кусты, перебегаешь к забору и исчезаешь в переулке.  \n" +
                "✅ Спасение: \"Свобода\"");
        option6.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option7 = new RadioButton();
        option7.setName("Спуститься в подвал — может, есть выход?");
        option7.setCode("DOWN_TO_BASEMENT");
        option7.setResultDescription("В подвале пахнет плесенью и кровью. Ты спускаешься по шаткой лестнице... \n" +
                "\" + \"Внезапно: " +
                "\"-Из темноты вываливаются 8-10 зомби! " +
                "\"-Ты стреляешь (15 патронов), но они окружают тебя. " +
                "\"- Один вцепляется в руку, ты падаешь... +\n" +
                "\"❌ Смерть: \"Темный тупик\"");
        option7.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option8 = new RadioButton();
        option8.setName("Осторожно выглянуть в разбитое окно, оценить обстановку.");
        option8.setCode("CAREFULLY_LOOK_OUT_BROKEN_WINDOW");
        option8.setResultDescription("Ты пригибаешься к подоконнику, выглядываешь через разбитое стекло. " +
                " Видишь: " +
                " - Военный грузовик (50 метров, дверь открыта, но вокруг 3 зомби). " +
                " -Группу из 4 выживших (бегут к парку, отстреливаются).");
        option8.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option9 = new RadioButton();
        option9.setName("Кричать и махать руками, чтобы привлекли внимание.");
        option9.setCode("SHOUTING_AND_WAVING");
        option9.setResultDescription("Ты распахиваешь окно, кричишь:  \n" +
                "—\"Эй! Здесь! Помогите!\"\n" + "\n" + "Люди оборачиваются, но твой крик будто магнитом притягивает зомби — из-за угла выходит целая стая!");
        option9.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option10 = new RadioButton();
        option10.setName("Открыть огонь из окна, прикрывая их отход.");
        option10.setCode("OPEN_FIRE_FROM_WINDOW");
        option10.setResultDescription("Ты вскидываешь AR-15, стреляешь очередями по 3-4 выстрела: \n" +
                " -Два зомби падают. " +
                " -Выжившие разворачиваются, стреляют в ответ. " +
                " Один из них кричит тебе: " +
                " Спускайся, мы ждем! " +
                " Ты прыгаешь с крыльца, и вы вместе отступаете к грузовику. " +
                " ✅ Спасение: Герой");
        option10.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option11 = new RadioButton();
        option11.setName("Быстро спуститься и бежать к ним.");
        option11.setCode("QUICKLY_GET_DOWN_AND_RUN_TO_THEM");
        option11.setResultDescription("Ты спускаешься по лестнице, но зомби уже перекрывают двор.\n" +
                "\n" + "-Один хватает тебя за ногу.\n" +
                "\n" + "-Ты стреляешь ему в лицо (2 патрона).\n" +
                "\n" + "-Но сзади подходит еще трое...\n" +
                "\n" + "\n" + "❌ Смерть: \"Неудачный зов\"");
        option11.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option12 = new RadioButton();
        option12.setName("Бежать к грузовику — шанс уехать!");
        option12.setCode("RUNNING_TO_TRUCK_CHANCE_GET_AWAY");
        option12.setResultDescription("Ты выпрыгиваешь в окно, приземляешься на газон. Зомби в 10 шагах замечают тебя!");
        option12.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option13 = new RadioButton();
        option13.setName("Стрелять на бегу, не останавливаясь.");
        option13.setCode("SHOOT_THE_RUN_WITHOUT_STOPPING");
        option13.setResultDescription("Ты вскидываешь AR-15 к плечу и бежишь к грузовику высаживая всю обойму в толпу: " +
                "-Выстрелы скашивают большую половину. " +
                " Магазин пустеет как только ты подбегаешь к грузовику. " +
                " Ты залезаешь в грузовик и жмешь тапок в пол " +
                " ✅ Победа: Хаотичная стрельба ");
        option13.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option14 = new RadioButton();
        option14.setName("Бежать зигзагами, не тратя патроны.");
        option14.setCode("RUN_ZIGZAGS_WITHOUT_WASTING_BULLETS");
        option14.setResultDescription("Ты резко меняешь направление, но спотыкаешься о труп. \n" +
                " Падаешь лицом в асфальт. " +
                " -AR-15 выскальзывает из рук. " +
                " -Тень накрывает тебя... " +
                "❌ Смерть: Роковой шаг ");
        option14.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option15 = new RadioButton();
        option15.setName("Резко сорваться с места и бежать к машине — медлить нельзя!");
        option15.setCode("ABRUPTLY_TAKE_OFF_AND_RUN_TO_CAR");
        option15.setResultDescription("Ты хватаешь ключи, выбегаешь во двор. Джип в 20 метрах, но возле него два зомби копошатся в брошенном рюкзаке.");
        option15.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option16 = new RadioButton();
        option16.setName("Сесть в машину и давить их на скорости.");
        option16.setCode("GET_THE_CAR_AND_CRUSH_HIM");
        option16.setResultDescription("Ты впрыгиваешь в салон, ключ в замке — двигатель ревет. Давишь газ в пол.\n" +
                " - Первого зомби колесо переезжает с хрустом. " +
                " -Второй вцепляется в дверь, бьет по стеклу!");
        option16.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option17 = new RadioButton();
        option17.setName("Резко тормозить, чтобы сбросить его.");
        option17.setCode("BRAKE_HARD_TO_RESET");
        option17.setResultDescription("Ты бьешь по тормозам, зомби летит на капот. " +
                " -Рывок вперед — он падает под колеса. " +
                " -Ты мчишься по улице, зомби остаются позади. " +
                "✅ Спасение: Дорога в никуда ");
        option17.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option18 = new RadioButton();
        option18.setName("Разогнаться и трясти руль.");
        option18.setCode("ACCELERATE_SHAKE_STEERING_WHEEL");
        option18.setResultDescription("Разогнаться и трясти руль.\", \"Ты резко дергаешь руль, машина заносит. \n" +
                " -Удар в фонарный столб. " +
                " -Лобовое стекло трескается. " +
                " - Кровь заливает глаза... " +
                "❌ Смерть: Железный гроб ");
        option18.setAvalibleRadioButtons(new ArrayList<>());

        RadioButton option19 = new RadioButton();
        option19.setName("Cтрелять по зомби чтобы расчистить путь к машине.");
        option19.setCode("SHOOT_AT_ZOMBIES_CLEAR_WAT_TO_CAR");
        option19.setResultDescription("Ты резко приподнимаешь ствол, целясь в ближайшего зомби. Палец на спуске.\n" + "\n" +
                "Первый выстрел — пробивает глазницу, зомби падает, хлюпая.\n" +
                "\n" + "Второй выстрел — дрогнула рука, пуля застревает в ключице второго. Он рычит, но продолжает идти.\n" +
                "\n" + "Ты открываешь дверь машины, но слышишь скрежет когтей по крыше — ещё трое выползают из-за соседнего гаража." + " ❌ Смерть: Неудача ");
        option19.setAvalibleRadioButtons(new ArrayList<>());


        RadioButton startRadioButton = new RadioButton();
        startRadioButton.setCode("START");
        startRadioButton.setName("");
        startRadioButton.setResultDescription("Ты вскакиваешь с кровати, и тут замечаешь три предмета, лежащих с убийственной аккуратностью:\n" +
                "\n" + "AR-15 — ствол еще пахнет смазкой, магазин полный. 30 патронов, которые сейчас дороже золота. На прикладе — царапина в форме креста. Ты проводишь пальцем по ней — старая привычка перед боем.\n" +
                "\n" + "Аптечка с перевязочными пакетами, жгутом и ампулами морфина. Кто-то аккуратно подписал фломастером: \"Не умирай, братан.\"\n" +
                "\n" + "Ключи от старого Cherokee. Висят на крючке в крови. Не твоей. Значит, его хозяин уже не вернется.\n" +
                "\n" + "Где-то в коридоре — скрежет когтей по штукатурке. Они уже здесь.");

        startRadioButton.setAvalibleRadioButtons(List.of(option1, option8, option15));

        codeRadioButtonMap.put(option1.getCode(), option1);
        codeRadioButtonMap.put(option2.getCode(), option2);
        codeRadioButtonMap.put(option3.getCode(), option3);
        codeRadioButtonMap.put(option4.getCode(), option4);
        codeRadioButtonMap.put(option5.getCode(), option5);
        codeRadioButtonMap.put(option6.getCode(), option6);
        codeRadioButtonMap.put(option7.getCode(), option7);
        codeRadioButtonMap.put(option8.getCode(), option8);
        codeRadioButtonMap.put(option9.getCode(), option9);
        codeRadioButtonMap.put(option10.getCode(), option10);
        codeRadioButtonMap.put(option11.getCode(), option11);
        codeRadioButtonMap.put(option12.getCode(), option12);
        codeRadioButtonMap.put(option13.getCode(), option13);
        codeRadioButtonMap.put(option14.getCode(), option14);
        codeRadioButtonMap.put(option15.getCode(), option15);
        codeRadioButtonMap.put(option16.getCode(), option16);
        codeRadioButtonMap.put(option17.getCode(), option17);
        codeRadioButtonMap.put(option18.getCode(), option18);
        codeRadioButtonMap.put(option19.getCode(), option19);
        codeRadioButtonMap.put(startRadioButton.getCode(), startRadioButton);

        option1.getAvalibleRadioButtons().add(option2);
        option1.getAvalibleRadioButtons().add(option5);

        option5.getAvalibleRadioButtons().add(option6);
        option5.getAvalibleRadioButtons().add(option7);

        option2.getAvalibleRadioButtons().add(option3);
        option2.getAvalibleRadioButtons().add(option4);

        option8.getAvalibleRadioButtons().add(option9);
        option8.getAvalibleRadioButtons().add(option12);

        option9.getAvalibleRadioButtons().add(option10);
        option9.getAvalibleRadioButtons().add(option11);

        option12.getAvalibleRadioButtons().add(option13);
        option12.getAvalibleRadioButtons().add(option14);

        option15.getAvalibleRadioButtons().add(option16);
        option15.getAvalibleRadioButtons().add(option19);

        option16.getAvalibleRadioButtons().add(option17);
        option16.getAvalibleRadioButtons().add(option18);
    }
}
