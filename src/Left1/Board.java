package Left1;
//EM MEMORIA DE JOSE PINTO DE CARVALHO\\
public class Board {
    int[][] board;
    public static final int TRADICIONAL=-666;
    public static final int CRUZ=44984;
    public static final int MAIS=649;
    public static final int BANQUINHO=7483;
    public static final int FLECHA=651;
    public static final int PIRAMIDE=2121;
    public static final int LOSANGO=2521;

    public Board() {
        this.board=new int[7][7];
    }
    
    public void clearBoard(){
        for(int[] board1:board){
            for(int j=0;j<board1.length;j++){
                board1[j]=0;
            }
        }
    }
    
    public void performPlay(Coord from,Coord to){
        Coord vector=new Coord(to.getI()-from.getI(),to.getJ()-from.getJ());
        if(board[to.getI()][to.getJ()]!=0)
            return;//invalid
        if(!((Math.abs(vector.getI())==2&&vector.getJ()==0)||(Math.abs(vector.getJ())==2&&vector.getI()==0)))
            return;//invalid
        if(vector.getI()>0){//right
            if(board[from.getI()+1][from.getJ()]==1){
                board[from.getI()+1][from.getJ()]=0;
                board[from.getI()][from.getJ()]=0;
                board[from.getI()+2][from.getJ()]=1;
            }else
                return;  
        }else if(vector.getI()<0){//left
            if(board[from.getI()-1][from.getJ()]==1){
                board[from.getI()-1][from.getJ()]=0;
                board[from.getI()][from.getJ()]=0;
                board[from.getI()-2][from.getJ()]=1;
            }else
                return; 
        }else if(vector.getJ()>0){//up
            if(board[from.getI()][from.getJ()+1]==1){
                board[from.getI()][from.getJ()+1]=0;
                board[from.getI()][from.getJ()]=0;
                board[from.getI()][from.getJ()+2]=1;
            }else
                return; 
        }else if(vector.getJ()<0){//down
            if(board[from.getI()][from.getJ()-1]==1){
                board[from.getI()][from.getJ()-1]=0;
                board[from.getI()][from.getJ()]=0;
                board[from.getI()][from.getJ()-2]=1;
            }else
                return;
        }
    }
    
    public boolean checkGG(){
        int numberOne=0;
        for(int[] board1:board){
            for(int j=0;j<board1.length;j++){
                if(board1[j]==1)
                    numberOne++;
            }
        }
        return numberOne==1;
    }
    
    public void fillEdges(){
        board[0][0]=2;
        board[0][1]=2;
        board[1][0]=2;
        board[1][1]=2;
        board[5][5]=2;
        board[5][6]=2;
        board[6][5]=2;
        board[6][6]=2;
        board[0][5]=2;
        board[0][6]=2;
        board[1][5]=2;
        board[1][6]=2;
        board[5][0]=2;
        board[5][1]=2;
        board[6][0]=2;
        board[6][1]=2;
    }
    
    public String toString(){
        String out="";
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
               out+=""+board[i][j];
            }
            out+="\n";
        }
        return out;
    }
    
    public void fillBoard(int types){
        clearBoard();
        fillEdges();
        switch(types){
            case TRADICIONAL:
                for(int i=0;i<board.length;i++)
                    for(int j=0;j<board[i].length;j++)
                        board[i][j]=1;
                board[3][3]=0;
                fillEdges();
            break;
            case CRUZ:
                board[3][1]=1;
                board[3][2]=1;
                board[2][2]=1;
                board[4][2]=1;
                board[3][3]=1;
                board[3][4]=1;
            break;
            case MAIS:
                board[3][1]=1;
                board[3][2]=1;
                board[3][3]=1;
                board[3][4]=1;
                board[3][5]=1;
                board[1][3]=1;
                board[2][3]=1;
                board[3][3]=1;
                board[4][3]=1;
                board[5][3]=1;
            break;
            case BANQUINHO:
                board[2][0]=1;
                board[3][0]=1;
                board[4][0]=1;
                board[2][1]=1;
                board[3][1]=1;
                board[4][1]=1;
                board[2][2]=1;
                board[3][2]=1;
                board[4][2]=1;
                board[2][3]=1;
                board[4][3]=1;
            break;
            case FLECHA:
                board[3][0]=1;
                board[2][1]=1;
                board[3][1]=1;
                board[4][1]=1;
                board[2][2]=1;
                board[1][2]=1;
                board[3][2]=1;
                board[4][2]=1;
                board[5][2]=1;
                board[3][3]=1;
                board[3][4]=1;
                board[3][5]=1;
                board[3][6]=1;
                board[2][5]=1;
                board[2][6]=1;
                board[4][5]=1;
                board[4][6]=1;
            break;
            case PIRAMIDE:
                board[3][1]=1;
                board[3][2]=1;
                board[2][2]=1;
                board[4][2]=1;
                board[1][3]=1;
                board[2][3]=1;
                board[3][3]=1;
                board[4][3]=1;
                board[5][3]=1;
                board[0][4]=1;
                board[1][4]=1;
                board[2][4]=1;
                board[3][4]=1;
                board[4][4]=1;
                board[5][4]=1;
                board[6][4]=1;
            break;
            case LOSANGO:
                for(int i=0;i<board.length;i++)
                    for(int j=0;j<board[i].length;j++)
                        board[i][j]=1;
                board[3][3]=0;
                board[2][0]=0;
                board[4][0]=0;
                board[0][2]=0;
                board[0][4]=0;
                board[6][2]=0;
                board[6][4]=0;
                board[2][6]=0;
                board[4][6]=0;
                fillEdges();
            break;
        }
    }
}
