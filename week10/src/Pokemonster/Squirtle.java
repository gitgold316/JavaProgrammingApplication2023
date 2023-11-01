package Pokemonster;

import java.util.ArrayList;
import java.util.Arrays;

public class Squirtle extends Pokemon{
    public Squirtle(Flyable f) {
        super();  // 부모 클래스의 기본 생성자 호출 (생략 가능)
        System.out.println("꼬북꼬북..");
        //this.setLevel(1);
        this.level = 1;
       // this.attackRate = 48;
        this.attackRate = (int)(Math.random() * 4) + 45; // 45 ~ 48
        this.defenceRate = 50;
        this.setHp(44);
        this.name = "꼬부기";
        this.flyable = f; // Association, has-a (Aggregation)
        this.skills = new ArrayList<>(Arrays.asList("물싸대기", "물대포", "물고문"));
        this.specialAttackRate = new ArrayList<>(Arrays.asList(100, 80, 40));
//        this.skills = new String[]{"물싸대기", "물대포", "물고문"};
//        this.specialAttackRate = new int[]{100, 80, 40};
//        this.skills = new ArrayList<>();
//        this.skills.add("물싸대기");
//        this.skills.add("물대포");
//        this.skills.add("물고문");
//
//        this.specialAttackRate = new ArrayList<>();
//        this.specialAttackRate.add(100);
//        this.specialAttackRate.add(80);
//        this.specialAttackRate.add(40);
    }

    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 광역 물대포 공격을 시전합니다");
    }
}
