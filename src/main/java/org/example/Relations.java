package org.example;

import java.util.List;

public class Relations {
    RelationType type1;
    RelationType type2;
    Human person1;
    Human person2;


    Relations(Human person1, RelationType type1,  Human person2, RelationType type2){
        this.type1 = type1;
        this.type2 = type2;
        this.person1 = person1;
        this.person2 = person2;
    }



}
