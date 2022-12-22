package org.example;


import java.util.ArrayList;

public class TreeRelations {
    static Relations relation1 = new Relations(new Human("Сергей", "Гусев", "male"), RelationType.SON, new Human("Галина", "Трус", "female"), RelationType.MOTHER);
    static Relations relation2 = new Relations(new Human("Сергей", "Гусев", "male"), RelationType.BROTHER, new Human("Александр", "Трус", "male"), RelationType.BROTHER);
    static Relations relation3 = new Relations(new Human("Сергей", "Гусев", "male"), RelationType.GRANDSON, new Human("Антонина", "Бирюкова", "female"), RelationType.GRANDMOTHER);
    static Relations relation4 = new Relations(new Human("Сергей", "Гусев", "male"), RelationType.NEPHEW, new Human("Владимир", "Бирюков", "male"), RelationType.UNCLE);
    static Relations relation5 = new Relations(new Human("Сергей", "Гусев", "male"), RelationType.GRANDSON, new Human("Наталья", "Петрова", "female"), RelationType.GRANDMOTHER);
    static Relations relation6 = new Relations(new Human("Сергей", "Гусев", "male"), RelationType.GRANDSON, new Human("Клавдия", "Петрова", "female"), RelationType.GRANDMOTHER);
    static Relations relation7 = new Relations(new Human("Сергей", "Гусев", "male"), RelationType.NEPHEW, new Human("Ирина", "Бирюкова", "female"), RelationType.AUNT);
    static Relations relation8 = new Relations(new Human("Сергей", "Гусев", "male"), RelationType.GRANDSON, new Human("Валентин", "Петров", "male"), RelationType.GRANDFATHER);
    static Relations relation9 = new Relations(new Human("Сергей", "Гусев", "male"), RelationType.COUSIN, new Human("Евгений", "Бирюков", "male"), RelationType.COUSIN);
    static Relations relation10 = new Relations(new Human("Сергей", "Гусев", "male"), RelationType.SON, new Human("Николай", "Гусев", "male"), RelationType.FATHER);
    static Relations relation11 = new Relations(new Human("Галина", "Трус", "female"), RelationType.WIFE, new Human("Ярослав", "Трус", "male"), RelationType.HUSBAND);
    static Relations relation12 = new Relations(new Human("Галина", "Трус", "female"), RelationType.MOTHER, new Human("Александр", "Трус", "male"), RelationType.SON);
    static Relations relation13 = new Relations(new Human("Галина", "Трус", "female"), RelationType.DAUGHTER, new Human("Антонина", "Бирюкова", "female"), RelationType.MOTHER);
    static Relations relation14 = new Relations(new Human("Галина", "Трус", "female"), RelationType.SISTER, new Human("Владимир", "Бирюков", "male"), RelationType.BROTHER);
    static Relations relation15 = new Relations(new Human("Галина", "Трус", "female"), RelationType.GRANDDAUGHTER, new Human("Наталья", "Петрова", "female"), RelationType.GRANDMOTHER);
    static Relations relation16 = new Relations(new Human("Галина", "Трус", "female"), RelationType.NIECE, new Human("Клавдия", "Петрова", "female"), RelationType.AUNT);
    static Relations relation17 = new Relations(new Human("Галина", "Трус", "female"), RelationType.SISTERINLAW, new Human("Ирина", "Бирюкова", "female"), RelationType.SISTERINLOW);
    static Relations relation18 = new Relations(new Human("Галина", "Трус", "female"), RelationType.NIECE, new Human("Валентин", "Петров", "male"), RelationType.UNCLE);
    static Relations relation19 = new Relations(new Human("Галина", "Трус", "female"), RelationType.AUNT, new Human("Евгений", "Бирюков", "male"), RelationType.NEPHEW);
    static Relations relation20 = new Relations(new Human("Галина", "Трус", "female"), RelationType.EXWIFE, new Human("Николай", "Гусев", "male"), RelationType.EXHUSBANT);
    static Relations relation21 = new Relations(new Human("Александр", "Трус", "male"), RelationType.SON, new Human("Ярослав", "Трус", "male"), RelationType.FATHER);
    static Relations relation22 = new Relations(new Human("Александр", "Трус", "male"), RelationType.GRANDSON, new Human("Антонина", "Бирюкова", "female"), RelationType.GRANDMOTHER);
    static Relations relation23 = new Relations(new Human("Александр", "Трус", "male"), RelationType.NEPHEW, new Human("Владимир", "Бирюков", "male"), RelationType.UNCLE);
    static Relations relation24 = new Relations(new Human("Александр", "Трус", "male"), RelationType.GRANDSON, new Human("Наталья", "Петрова", "female"), RelationType.GRANDMOTHER);
    static Relations relation25 = new Relations(new Human("Александр", "Трус", "male"), RelationType.GRANDSON, new Human("Клавдия", "Петрова", "female"), RelationType.GRANDMOTHER);
    static Relations relation26 = new Relations(new Human("Александр", "Трус", "male"), RelationType.NEPHEW, new Human("Ирина", "Бирюкова", "female"), RelationType.AUNT);
    static Relations relation27 = new Relations(new Human("Александр", "Трус", "male"), RelationType.GRANDSON, new Human("Валентин", "Петров", "male"), RelationType.GRANDFATHER);
    static Relations relation28 = new Relations(new Human("Александр", "Трус", "male"), RelationType.COUSIN, new Human("Евгений", "Бирюков", "male"), RelationType.COUSIN);
    static Relations relation29 = new Relations(new Human("Ярослав", "Трус", "male"), RelationType.SONINLAW, new Human("Антонина", "Бирюкова", "female"), RelationType.MOTHERINLAW);
    static Relations relation30 = new Relations(new Human("Ярослав", "Трус", "male"), RelationType.BROTHERINLAW, new Human("Владимир", "Бирюков", "male"), RelationType.BROTHERINLAW);
    static Relations relation31 = new Relations(new Human("Ярослав", "Трус", "male"), RelationType.BROTHERINLAW, new Human("Ирина", "Бирюкова", "female"), RelationType.SISTERINLAW);
    static Relations relation32 = new Relations(new Human("Ярослав", "Трус", "male"), RelationType.UNCLE, new Human("Евгений", "Бирюков", "male"), RelationType.NEPHEW);
    static Relations relation33 = new Relations(new Human("Антонина", "Бирюкова", "female"), RelationType.SISTER, new Human("Клавдия", "Петрова", "female"), RelationType.SISTER);
    static Relations relation34 = new Relations(new Human("Антонина", "Бирюкова", "female"), RelationType.MOTHERINLAW, new Human("Ирина", "Бирюкова", "female"), RelationType.DAUGHTERINLAW);
    static Relations relation35 = new Relations(new Human("Антонина", "Бирюкова", "female"), RelationType.SISTER, new Human("Валентин", "Петров", "male"), RelationType.BROTHER);
    static Relations relation36 = new Relations(new Human("Антонина", "Бирюкова", "female"), RelationType.GRANDMOTHER, new Human("Евгений", "Бирюков", "male"), RelationType.GRANDSON);
    static Relations relation37 = new Relations(new Human("Антонина", "Бирюкова", "female"), RelationType.MOTHER, new Human("Владимир", "Бирюков", "male"), RelationType.SON);
    static Relations relation38 = new Relations(new Human("Владимир", "Бирюков", "male"), RelationType.NEPHEW, new Human("Валентин", "Петров", "male"), RelationType.UNCLE);
    static Relations relation39 = new Relations(new Human("Владимир", "Бирюков", "male"), RelationType.FATHER, new Human("Евгений", "Бирюков", "male"), RelationType.SON);
    static Relations relation40 = new Relations(new Human("Владимир", "Бирюков", "male"), RelationType.SON, new Human("Антонина", "Бирюкова", "female"), RelationType.MOTHER);
    static Relations relation41 = new Relations(new Human("Владимир", "Бирюков", "male"), RelationType.HUSBAND, new Human("Ирина", "Бирюкова", "female"), RelationType.WIFE);
    static Relations relation42 = new Relations(new Human("Владимир", "Бирюков", "male"), RelationType.NEPHEW, new Human("Клавдия", "Петрова", "female"), RelationType.AUNT);

    public static void printer(ArrayList<Relations> setRelations){
        for (Relations item : setRelations) {
                System.out.println((String.format("%s %s является %S для %s %s", item.person1.firstName, item.person1.lastName, item.type1, item.person2.firstName, item.person2.lastName)));
        }
    }
}

