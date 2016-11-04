package Left1;
//EM MEMORIA DE JOSE PINTO DE CARVALHO\\s
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class AI {
    Game fmr;
    int type;
    int steep;
    final int delay=500;
    Timer t;
    public AI(Game fmr,int type){
        this.fmr=fmr;
        this.type=type;
        this.steep=0;
        this.t=new Timer(delay,new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exec();
            }
        });
        t.setRepeats(true);
        t.start();
    }
    
    public void exec(){
        switch(type){
            case Board.BANQUINHO:
                switch(steep){
                    case 0: fmr.selected.set(3,2); break;
                    case 1: fmr.brd.performPlay(fmr.selected,new Coord(5,2));fmr.selected.set(-1,-1);break;
                    case 2: fmr.selected.set(4,0); break;
                    case 3: fmr.brd.performPlay(fmr.selected,new Coord(4,2));fmr.selected.set(-1,-1);break;
                    case 4: fmr.selected.set(4,3); break;
                    case 5: fmr.brd.performPlay(fmr.selected,new Coord(4,1));fmr.selected.set(-1,-1);break;
                    case 6: fmr.selected.set(2,0); break;
                    case 7: fmr.brd.performPlay(fmr.selected,new Coord(4,0));fmr.selected.set(-1,-1);break;
                    case 8: fmr.selected.set(4,0); break;
                    case 9: fmr.brd.performPlay(fmr.selected,new Coord(4,2));fmr.selected.set(-1,-1);break;
                    case 10: fmr.selected.set(5,2); break;
                    case 11: fmr.brd.performPlay(fmr.selected,new Coord(3,2));fmr.selected.set(-1,-1);break;
                    case 12: fmr.selected.set(3,1); break;
                    case 13: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                    case 14: fmr.selected.set(3,3); break;
                    case 15: fmr.brd.performPlay(fmr.selected,new Coord(1,3));fmr.selected.set(-1,-1);break;
                    case 16: fmr.selected.set(2,1); break;
                    case 17: fmr.brd.performPlay(fmr.selected,new Coord(2,3));fmr.selected.set(-1,-1);break;
                    case 18: fmr.selected.set(1,3); break;
                    case 19: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                }
            break;
            case Board.CRUZ:
                switch(steep){
                    case 0: fmr.selected.set(3,2); break;
                    case 1: fmr.brd.performPlay(fmr.selected,new Coord(5,2));fmr.selected.set(-1,-1);break;
                    case 2: fmr.selected.set(3,4); break;
                    case 3: fmr.brd.performPlay(fmr.selected,new Coord(3,2));fmr.selected.set(-1,-1);break;
                    case 4: fmr.selected.set(2,2); break;
                    case 5: fmr.brd.performPlay(fmr.selected,new Coord(4,2));fmr.selected.set(-1,-1);break;
                    case 6: fmr.selected.set(5,2); break;
                    case 7: fmr.brd.performPlay(fmr.selected,new Coord(3,2));fmr.selected.set(-1,-1);break;
                    case 8: fmr.selected.set(3,1); break;
                    case 9: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                }
            break;
            case Board.FLECHA:
                switch(steep){
                    case 0: fmr.selected.set(4,6); break;
                    case 1: fmr.brd.performPlay(fmr.selected,new Coord(4,4));fmr.selected.set(-1,-1);break;
                    case 2: fmr.selected.set(3,4); break;
                    case 3: fmr.brd.performPlay(fmr.selected,new Coord(5,4));fmr.selected.set(-1,-1);break;
                    case 4: fmr.selected.set(3,6); break;
                    case 5: fmr.brd.performPlay(fmr.selected,new Coord(3,4));fmr.selected.set(-1,-1);break;
                    case 6: fmr.selected.set(2,6); break;
                    case 7: fmr.brd.performPlay(fmr.selected,new Coord(2,4));fmr.selected.set(-1,-1);break;
                    case 8: fmr.selected.set(2,4); break;
                    case 9: fmr.brd.performPlay(fmr.selected,new Coord(4,4));fmr.selected.set(-1,-1);break;
                    case 10: fmr.selected.set(5,4); break;
                    case 11: fmr.brd.performPlay(fmr.selected,new Coord(3,4));fmr.selected.set(-1,-1);break;
                    case 12: fmr.selected.set(4,2); break;
                    case 13: fmr.brd.performPlay(fmr.selected,new Coord(4,0));fmr.selected.set(-1,-1);break;
                    case 14: fmr.selected.set(4,0); break;
                    case 15: fmr.brd.performPlay(fmr.selected,new Coord(2,0));fmr.selected.set(-1,-1);break;
                    case 16: fmr.selected.set(2,2); break;
                    case 17: fmr.brd.performPlay(fmr.selected,new Coord(4,2));fmr.selected.set(-1,-1);break;
                    case 18: fmr.selected.set(2,0); break;
                    case 19: fmr.brd.performPlay(fmr.selected,new Coord(2,2));fmr.selected.set(-1,-1);break;
                    case 20: fmr.selected.set(1,2); break;
                    case 21: fmr.brd.performPlay(fmr.selected,new Coord(3,2));fmr.selected.set(-1,-1);break;
                    case 22: fmr.selected.set(4,2); break;
                    case 23: fmr.brd.performPlay(fmr.selected,new Coord(2,2));fmr.selected.set(-1,-1);break;
                    case 24: fmr.selected.set(3,4); break;
                    case 25: fmr.brd.performPlay(fmr.selected,new Coord(3,2));fmr.selected.set(-1,-1);break;
                    case 26: fmr.selected.set(2,2); break;
                    case 27: fmr.brd.performPlay(fmr.selected,new Coord(4,2));fmr.selected.set(-1,-1);break;
                    case 28: fmr.selected.set(5,2); break;
                    case 29: fmr.brd.performPlay(fmr.selected,new Coord(3,2));fmr.selected.set(-1,-1);break;
                    case 30: fmr.selected.set(3,1); break;
                    case 31: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                }
            break;
            case Board.LOSANGO:
                switch(steep){
                    case 0: fmr.selected.set(2,4); break;
                    case 1: fmr.brd.performPlay(fmr.selected,new Coord(2,6));fmr.selected.set(-1,-1);break;
                    case 2: fmr.selected.set(2,6); break;
                    case 3: fmr.brd.performPlay(fmr.selected,new Coord(4,6));fmr.selected.set(-1,-1);break;
                    case 4: fmr.selected.set(4,4); break;
                    case 5: fmr.brd.performPlay(fmr.selected,new Coord(6,4));fmr.selected.set(-1,-1);break;
                    case 6: fmr.selected.set(6,4); break;
                    case 7: fmr.brd.performPlay(fmr.selected,new Coord(6,2));fmr.selected.set(-1,-1);break;
                    case 8: fmr.selected.set(4,2); break;
                    case 9: fmr.brd.performPlay(fmr.selected,new Coord(4,0));fmr.selected.set(-1,-1);break;
                    case 10: fmr.selected.set(4,0); break;
                    case 11: fmr.brd.performPlay(fmr.selected,new Coord(2,0));fmr.selected.set(-1,-1);break;
                    case 12: fmr.selected.set(2,2); break;
                    case 13: fmr.brd.performPlay(fmr.selected,new Coord(0,2));fmr.selected.set(-1,-1);break;
                    case 14: fmr.selected.set(0,2); break;
                    case 15: fmr.brd.performPlay(fmr.selected,new Coord(0,4));fmr.selected.set(-1,-1);break;
                    case 16: fmr.selected.set(4,6); break;
                    case 17: fmr.brd.performPlay(fmr.selected,new Coord(4,4));fmr.selected.set(-1,-1);break;
                    case 18: fmr.selected.set(6,2); break;
                    case 19: fmr.brd.performPlay(fmr.selected,new Coord(4,2));fmr.selected.set(-1,-1);break;
                    case 20: fmr.selected.set(2,0); break;
                    case 21: fmr.brd.performPlay(fmr.selected,new Coord(2,2));fmr.selected.set(-1,-1);break;
                    case 22: fmr.selected.set(0,4); break;
                    case 23: fmr.brd.performPlay(fmr.selected,new Coord(2,4));fmr.selected.set(-1,-1);break;
                    case 24: fmr.selected.set(3,5); break;
                    case 25: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                    case 26: fmr.selected.set(3,2); break;
                    case 27: fmr.brd.performPlay(fmr.selected,new Coord(1,2));fmr.selected.set(-1,-1);break;
                    case 28: fmr.selected.set(1,2); break;
                    case 29: fmr.brd.performPlay(fmr.selected,new Coord(1,4));fmr.selected.set(-1,-1);break;
                    case 30: fmr.selected.set(1,4); break;
                    case 31: fmr.brd.performPlay(fmr.selected,new Coord(3,4));fmr.selected.set(-1,-1);break;
                    case 32: fmr.selected.set(3,4); break;
                    case 33: fmr.brd.performPlay(fmr.selected,new Coord(5,4));fmr.selected.set(-1,-1);break;
                    case 34: fmr.selected.set(5,4); break;
                    case 35: fmr.brd.performPlay(fmr.selected,new Coord(5,2));fmr.selected.set(-1,-1);break;
                    case 36: fmr.selected.set(5,2); break;
                    case 37: fmr.brd.performPlay(fmr.selected,new Coord(3,2));fmr.selected.set(-1,-1);break;
                    case 38: fmr.selected.set(3,3); break;
                    case 39: fmr.brd.performPlay(fmr.selected,new Coord(1,3));fmr.selected.set(-1,-1);break;
                    case 40: fmr.selected.set(3,1); break;
                    case 41: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                    case 42: fmr.selected.set(4,3); break;
                    case 43: fmr.brd.performPlay(fmr.selected,new Coord(2,3));fmr.selected.set(-1,-1);break;
                    case 44: fmr.selected.set(1,3); break;
                    case 45: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                }
            break;
            case Board.MAIS:
                switch(steep){
                    case 0: fmr.selected.set(2,3); break;
                    case 1: fmr.brd.performPlay(fmr.selected,new Coord(0,3));fmr.selected.set(-1,-1);break;
                    case 2: fmr.selected.set(4,3); break;
                    case 3: fmr.brd.performPlay(fmr.selected,new Coord(2,3));fmr.selected.set(-1,-1);break;
                    case 4: fmr.selected.set(3,1); break;
                    case 5: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                    case 6: fmr.selected.set(3,3); break;
                    case 7: fmr.brd.performPlay(fmr.selected,new Coord(1,3));fmr.selected.set(-1,-1);break;
                    case 8: fmr.selected.set(3,5); break;
                    case 9: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                    case 10: fmr.selected.set(0,3); break;
                    case 11: fmr.brd.performPlay(fmr.selected,new Coord(2,3));fmr.selected.set(-1,-1);break;
                    case 12: fmr.selected.set(2,3); break;
                    case 13: fmr.brd.performPlay(fmr.selected,new Coord(4,3));fmr.selected.set(-1,-1);break;
                    case 14: fmr.selected.set(5,3); break;
                    case 15: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                }

            break;
            case Board.PIRAMIDE:
                switch(steep){
                    case 0: fmr.selected.set(2,3); break;
                    case 1: fmr.brd.performPlay(fmr.selected,new Coord(2,5));fmr.selected.set(-1,-1);break;
                    case 2: fmr.selected.set(4,3); break;
                    case 3: fmr.brd.performPlay(fmr.selected,new Coord(4,5));fmr.selected.set(-1,-1);break;
                    case 4: fmr.selected.set(0,4); break;
                    case 5: fmr.brd.performPlay(fmr.selected,new Coord(2,4));fmr.selected.set(-1,-1);break;
                    case 6: fmr.selected.set(6,4); break;
                    case 7: fmr.brd.performPlay(fmr.selected,new Coord(4,4));fmr.selected.set(-1,-1);break;
                    case 8: fmr.selected.set(2,5); break;
                    case 9: fmr.brd.performPlay(fmr.selected,new Coord(2,3));fmr.selected.set(-1,-1);break;
                    case 10: fmr.selected.set(4,5); break;
                    case 11: fmr.brd.performPlay(fmr.selected,new Coord(4,3));fmr.selected.set(-1,-1);break;
                    case 12: fmr.selected.set(2,2); break;
                    case 13: fmr.brd.performPlay(fmr.selected,new Coord(2,4));fmr.selected.set(-1,-1);break;
                    case 14: fmr.selected.set(4,2); break;
                    case 15: fmr.brd.performPlay(fmr.selected,new Coord(2,2));fmr.selected.set(-1,-1);break;
                    case 16: fmr.selected.set(3,4); break;
                    case 17: fmr.brd.performPlay(fmr.selected,new Coord(1,4));fmr.selected.set(-1,-1);break;
                    case 18: fmr.selected.set(1,4); break;
                    case 19: fmr.brd.performPlay(fmr.selected,new Coord(1,2));fmr.selected.set(-1,-1);break;
                    case 20: fmr.selected.set(1,2); break;
                    case 21: fmr.brd.performPlay(fmr.selected,new Coord(3,2));fmr.selected.set(-1,-1);break;
                    case 22: fmr.selected.set(4,3); break;
                    case 23: fmr.brd.performPlay(fmr.selected,new Coord(2,3));fmr.selected.set(-1,-1);break;
                    case 24: fmr.selected.set(3,1); break;
                    case 25: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                    case 26: fmr.selected.set(2,3); break;
                    case 27: fmr.brd.performPlay(fmr.selected,new Coord(4,3));fmr.selected.set(-1,-1);break;
                    case 28: fmr.selected.set(5,3); break;
                    case 29: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                }
            break;
            case Board.TRADICIONAL:
                switch(steep){
                    case 0: fmr.selected.set(3,5); break;
                    case 1: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                    case 2: fmr.selected.set(1,4); break;
                    case 3: fmr.brd.performPlay(fmr.selected,new Coord(3,4));fmr.selected.set(-1,-1);break;
                    case 4: fmr.selected.set(3,3); break;
                    case 5: fmr.brd.performPlay(fmr.selected,new Coord(3,5));fmr.selected.set(-1,-1);break;
                    case 6: fmr.selected.set(2,6); break;
                    case 7: fmr.brd.performPlay(fmr.selected,new Coord(2,4));fmr.selected.set(-1,-1);break;
                    case 8: fmr.selected.set(4,6); break;
                    case 9: fmr.brd.performPlay(fmr.selected,new Coord(2,6));fmr.selected.set(-1,-1);break;
                    case 10: fmr.selected.set(2,3); break;
                    case 11: fmr.brd.performPlay(fmr.selected,new Coord(2,5));fmr.selected.set(-1,-1);break;
                    case 12: fmr.selected.set(2,6); break;
                    case 13: fmr.brd.performPlay(fmr.selected,new Coord(2,4));fmr.selected.set(-1,-1);break;
                    case 14: fmr.selected.set(4,4); break;
                    case 15: fmr.brd.performPlay(fmr.selected,new Coord(4,6));fmr.selected.set(-1,-1);break;
                    case 16: fmr.selected.set(6,4); break;
                    case 17: fmr.brd.performPlay(fmr.selected,new Coord(4,4));fmr.selected.set(-1,-1);break;
                    case 18: fmr.selected.set(4,3); break;
                    case 19: fmr.brd.performPlay(fmr.selected,new Coord(4,5));fmr.selected.set(-1,-1);break;
                    case 20: fmr.selected.set(4,6); break;
                    case 21: fmr.brd.performPlay(fmr.selected,new Coord(4,4));fmr.selected.set(-1,-1);break;
                    case 22: fmr.selected.set(2,1); break;
                    case 23: fmr.brd.performPlay(fmr.selected,new Coord(2,3));fmr.selected.set(-1,-1);break;
                    case 24: fmr.selected.set(0,2); break;
                    case 25: fmr.brd.performPlay(fmr.selected,new Coord(2,2));fmr.selected.set(-1,-1);break;
                    case 26: fmr.selected.set(0,4); break;
                    case 27: fmr.brd.performPlay(fmr.selected,new Coord(0,2));fmr.selected.set(-1,-1);break;
                    case 28: fmr.selected.set(3,2); break;
                    case 29: fmr.brd.performPlay(fmr.selected,new Coord(1,2));fmr.selected.set(-1,-1);break;
                    case 30: fmr.selected.set(0,2); break;
                    case 31: fmr.brd.performPlay(fmr.selected,new Coord(2,2));fmr.selected.set(-1,-1);break;
                    case 32: fmr.selected.set(2,3); break;
                    case 33: fmr.brd.performPlay(fmr.selected,new Coord(2,1));fmr.selected.set(-1,-1);break;
                    case 34: fmr.selected.set(2,0); break;
                    case 35: fmr.brd.performPlay(fmr.selected,new Coord(2,2));fmr.selected.set(-1,-1);break;
                    case 36: fmr.selected.set(5,2); break;
                    case 37: fmr.brd.performPlay(fmr.selected,new Coord(3,2));fmr.selected.set(-1,-1);break;
                    case 38: fmr.selected.set(4,0); break;
                    case 39: fmr.brd.performPlay(fmr.selected,new Coord(4,2));fmr.selected.set(-1,-1);break;
                    case 40: fmr.selected.set(3,2); break;
                    case 41: fmr.brd.performPlay(fmr.selected,new Coord(5,2));fmr.selected.set(-1,-1);break;
                    case 42: fmr.selected.set(6,2); break;
                    case 43: fmr.brd.performPlay(fmr.selected,new Coord(4,2));fmr.selected.set(-1,-1);break;
                    case 44: fmr.selected.set(6,3); break;
                    case 45: fmr.brd.performPlay(fmr.selected,new Coord(4,3));fmr.selected.set(-1,-1);break;
                    case 46: fmr.selected.set(4,3); break;
                    case 47: fmr.brd.performPlay(fmr.selected,new Coord(4,1));fmr.selected.set(-1,-1);break;
                    case 48: fmr.selected.set(3,0); break;
                    case 49: fmr.brd.performPlay(fmr.selected,new Coord(3,2));fmr.selected.set(-1,-1);break;
                    case 50: fmr.selected.set(2,2); break;
                    case 51: fmr.brd.performPlay(fmr.selected,new Coord(4,2));fmr.selected.set(-1,-1);break;
                    case 52: fmr.selected.set(4,1); break;
                    case 53: fmr.brd.performPlay(fmr.selected,new Coord(4,3));fmr.selected.set(-1,-1);break;
                    case 54: fmr.selected.set(4,3); break;
                    case 55: fmr.brd.performPlay(fmr.selected,new Coord(4,5));fmr.selected.set(-1,-1);break;
                    case 56: fmr.selected.set(4,5); break;
                    case 57: fmr.brd.performPlay(fmr.selected,new Coord(2,5));fmr.selected.set(-1,-1);break;
                    case 58: fmr.selected.set(2,5); break;
                    case 59: fmr.brd.performPlay(fmr.selected,new Coord(2,3));fmr.selected.set(-1,-1);break;
                    case 60: fmr.selected.set(1,3); break;
                    case 61: fmr.brd.performPlay(fmr.selected,new Coord(3,3));fmr.selected.set(-1,-1);break;
                }
            break;
        }
        steep++;
        fmr.updateButtons();
        if(fmr.brd.checkGG()){
            t.stop();
            t=null;
        }
    }
    
    public void destroy(){
        if(t!=null)
            t.stop();
        t=null;
    }
}
