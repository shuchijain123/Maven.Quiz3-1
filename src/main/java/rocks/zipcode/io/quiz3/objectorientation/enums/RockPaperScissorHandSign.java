package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

    ROCK("PAPER"),
    PAPER("SCISSOR"),
    SCISSOR("ROCK");


    private String catchPhrase="";

    RockPaperScissorHandSign(String s) {

        this.catchPhrase= s;

    }
    public RockPaperScissorHandSign getWinner() {



       RockPaperScissorHandSign myString= null;

        if (this.name().equalsIgnoreCase("PAPER"))

            myString = SCISSOR;

        else
        if (this.name().equalsIgnoreCase("ROCK")) {


            myString= PAPER;
        }

        else
        if (this.name().equalsIgnoreCase("SCISSOR")) {


            myString= ROCK;
        }


        return myString;
    }


    public RockPaperScissorHandSign getLoser() {



        RockPaperScissorHandSign myString= null;

        if (this.name().equalsIgnoreCase("PAPER"))

            myString = ROCK;

        else
        if (this.name().equalsIgnoreCase("ROCK")) {


            myString= SCISSOR;
        }

        else
        if (this.name().equalsIgnoreCase("SCISSOR")) {


            myString= PAPER;
        }


        return myString;
    }



}

