## Problem Scenario
Suppose we have three types of characters in a GameApp: <br>
&emsp;1. Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier) <br>
&emsp;2. Wizard: Casts spells; uses magic barrier to defend <br>
&emsp;3. Archer: Shoots arrows; uses dodge to to defend <br>

<br>
Implement two types of Strategy: <br>
&emsp;A. DefenseStrategy <br>
&emsp;&emsp;1. Shield <br>
&emsp;&emsp;2. Dodge <br>
&emsp;&emsp;3. CreateMagic <br>
<br>
&emsp;B.  AttackStrategy <br>
&emsp;&emsp;1.  CastSpell <br>
&emsp;&emsp;2.  ShootArrow <br>
&emsp;&emsp;3.  SwingSword  <br>

<br>
Refactor the existing codes using Strategy Pattern:

    public class Character {
      private String type;

    public Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            System.out.println("Using a shield to defend!");
	        System.out.println("Dodgin to avoid attack!");
            System.out.println("Creating a magic barrier for defense!"");		

        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!"");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!"");
        }
      }
    }

## UML Diagram
![uml](https://github.com/mfulo/strategyPattern/assets/142382665/64b5e3d5-a78b-4d01-9528-fcb66c8ddff6)


## Sample output
![knight](https://github.com/mfulo/strategyPattern/assets/142382665/47a685e9-5c96-4b99-96d7-3832b0f19e03)

![wizard](https://github.com/mfulo/strategyPattern/assets/142382665/234f9ec9-81a9-4eb5-8892-bf353e1509a9)

![archer](https://github.com/mfulo/strategyPattern/assets/142382665/e23c296b-7ec5-44b3-b101-1fc77aec63df)
