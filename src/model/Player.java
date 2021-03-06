
package model;

/**
 *
 * @author Krist 
 */
public class Player {
    private boolean turn; 
    private PieceValueEnum circleColor;
    
    public Player(PieceValueEnum cirleColor, boolean turn){
        this.turn = turn;
        this.circleColor=cirleColor;
        
    }
    
    public boolean getPlayerTurn(){
        return this.turn;
    }

    public PieceValueEnum getCircleColor(){
        return this.circleColor; 
    }
    public void setPlayerTurn(){
        this.turn = !this.turn;
    }
    
    @Override
    public String toString(){
        String info="Tysk   " +circleColor+"   "+ turn; 
        
        return info;
    }
}
