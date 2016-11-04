package Left1;
//EM MEMORIA DE JOSE PINTO DE CARVALHO\\
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.util.Map;
import java.net.URI;
import java.net.URISyntaxException;

public class Game extends javax.swing.JFrame {
    
    public Board brd;
    public Coord selected;
    AI ai;

    public Game() {
        initComponents();
        brd=new Board();
        selected=new Coord(3,3);  
        this.setTitle("Left One");
        Font font = url.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        url.setFont(font.deriveFont(attributes));
        url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        url.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
                try{Desktop.getDesktop().browse(new URI(url.getText()));}
                catch (URISyntaxException | IOException ex) {}
            }
        });
    }
    
    public void updateButtons(){
        for(int i=0;i<brd.board.length;i++)
            for(int j=0;j<brd.board[i].length;j++)
                if(brd.board[i][j]>0){
                    getBoardButtons()[i][j].setBackground(new Color(0x90,0x70,0xcd,255));
                }else{
                    getBoardButtons()[i][j].setBackground(new Color(249,249,248,255));
                }
        if(brd.checkGG())
            label_gg.setText("GG");
        if(selected.getI()>=0&&selected.getJ()>=0)
            getBoardButtons()[selected.getI()][selected.getJ()].setBackground(new Color(0x90,0x70,50,255));
    }
    
    public void behaveButton(int i,int j){
        if(!getBoardButtons()[i][j].isEnabled()||brd.checkGG()||ai!=null) return;
        if(selected.getI()==-1&&selected.getJ()==-1&&brd.board[i][j]==1){
            selected.set(i,j);
        }else{
            brd.performPlay(selected,new Coord(i,j));
            selected.set(-1,-1);
        }
        updateButtons();
    }

    public javax.swing.JButton[][] getBoardButtons(){
        javax.swing.JButton[][] out = new javax.swing.JButton[7][7];
        out[0][0]=btn_null;
        out[0][1]=btn_null;
        out[0][2]=btn_02;
        out[0][3]=btn_03;
        out[0][4]=btn_04;
        out[0][5]=btn_null;
        out[0][6]=btn_null;
        
        out[1][0]=btn_null;
        out[1][1]=btn_null;
        out[1][2]=btn_12;
        out[1][3]=btn_13;
        out[1][4]=btn_14;
        out[1][5]=btn_null;
        out[1][6]=btn_null;
        
        out[2][0]=btn_20;
        out[2][1]=btn_21;
        out[2][2]=btn_22;
        out[2][3]=btn_23;
        out[2][4]=btn_24;
        out[2][5]=btn_25;
        out[2][6]=btn_26;
        
        out[3][0]=btn_30;
        out[3][1]=btn_31;
        out[3][2]=btn_32;
        out[3][3]=btn_33;
        out[3][4]=btn_34;
        out[3][5]=btn_35;
        out[3][6]=btn_36;
        
        out[4][0]=btn_40;
        out[4][1]=btn_41;
        out[4][2]=btn_42;
        out[4][3]=btn_43;
        out[4][4]=btn_44;
        out[4][5]=btn_45;
        out[4][6]=btn_46;
        
        out[5][0]=btn_null;
        out[5][1]=btn_null;
        out[5][2]=btn_52;
        out[5][3]=btn_53;
        out[5][4]=btn_54;
        out[5][5]=btn_null;
        out[5][6]=btn_null;
        
        out[6][0]=btn_null;
        out[6][1]=btn_null;
        out[6][2]=btn_62;
        out[6][3]=btn_63;
        out[6][4]=btn_64;
        out[6][5]=btn_null;
        out[6][6]=btn_null;
        
        return out;
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Game = new javax.swing.JPanel();
        btn_02 = new javax.swing.JButton();
        btn_12 = new javax.swing.JButton();
        btn_23 = new javax.swing.JButton();
        btn_13 = new javax.swing.JButton();
        btn_03 = new javax.swing.JButton();
        btn_14 = new javax.swing.JButton();
        btn_04 = new javax.swing.JButton();
        btn_40 = new javax.swing.JButton();
        btn_41 = new javax.swing.JButton();
        btn_42 = new javax.swing.JButton();
        btn_32 = new javax.swing.JButton();
        btn_22 = new javax.swing.JButton();
        btn_21 = new javax.swing.JButton();
        btn_31 = new javax.swing.JButton();
        btn_30 = new javax.swing.JButton();
        btn_20 = new javax.swing.JButton();
        btn_64 = new javax.swing.JButton();
        btn_45 = new javax.swing.JButton();
        btn_46 = new javax.swing.JButton();
        btn_36 = new javax.swing.JButton();
        btn_26 = new javax.swing.JButton();
        btn_25 = new javax.swing.JButton();
        btn_35 = new javax.swing.JButton();
        btn_34 = new javax.swing.JButton();
        btn_24 = new javax.swing.JButton();
        btn_62 = new javax.swing.JButton();
        btn_63 = new javax.swing.JButton();
        btn_54 = new javax.swing.JButton();
        btn_44 = new javax.swing.JButton();
        btn_43 = new javax.swing.JButton();
        btn_53 = new javax.swing.JButton();
        btn_52 = new javax.swing.JButton();
        btn_33 = new javax.swing.JButton();
        pnl_ctrl = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        btn_solve = new javax.swing.JButton();
        cb_gameType = new javax.swing.JComboBox<>();
        label_gg = new javax.swing.JLabel();
        btn_null = new javax.swing.JButton();
        url = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_02.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_02.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_02.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_02MouseReleased(evt);
            }
        });

        btn_12.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_12.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_12.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_12MouseReleased(evt);
            }
        });

        btn_23.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_23.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_23.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_23MouseReleased(evt);
            }
        });

        btn_13.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_13.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_13.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_13MouseReleased(evt);
            }
        });

        btn_03.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_03.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_03.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_03MouseReleased(evt);
            }
        });

        btn_14.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_14.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_14.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_14MouseReleased(evt);
            }
        });

        btn_04.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_04.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_04.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_04MouseReleased(evt);
            }
        });

        btn_40.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_40.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_40.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_40MouseReleased(evt);
            }
        });

        btn_41.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_41.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_41.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_41MouseReleased(evt);
            }
        });

        btn_42.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_42.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_42.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_42MouseReleased(evt);
            }
        });

        btn_32.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_32.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_32.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_32MouseReleased(evt);
            }
        });

        btn_22.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_22.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_22.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_22MouseReleased(evt);
            }
        });

        btn_21.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_21.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_21.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_21MouseReleased(evt);
            }
        });

        btn_31.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_31.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_31.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_31MouseReleased(evt);
            }
        });

        btn_30.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_30.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_30.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_30MouseReleased(evt);
            }
        });

        btn_20.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_20.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_20.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_20MouseReleased(evt);
            }
        });
        btn_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_20ActionPerformed(evt);
            }
        });

        btn_64.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_64.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_64.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_64MouseReleased(evt);
            }
        });

        btn_45.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_45.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_45.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_45MouseReleased(evt);
            }
        });

        btn_46.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_46.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_46.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_46MouseReleased(evt);
            }
        });

        btn_36.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_36.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_36.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_36MouseReleased(evt);
            }
        });

        btn_26.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_26.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_26.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_26MouseReleased(evt);
            }
        });

        btn_25.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_25.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_25.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_25MouseReleased(evt);
            }
        });

        btn_35.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_35.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_35.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_35MouseReleased(evt);
            }
        });

        btn_34.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_34.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_34.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_34MouseReleased(evt);
            }
        });

        btn_24.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_24.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_24.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_24MouseReleased(evt);
            }
        });

        btn_62.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_62.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_62.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_62MouseReleased(evt);
            }
        });

        btn_63.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_63.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_63.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_63MouseReleased(evt);
            }
        });

        btn_54.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_54.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_54.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_54MouseReleased(evt);
            }
        });

        btn_44.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_44.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_44.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_44MouseReleased(evt);
            }
        });

        btn_43.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_43.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_43.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_43MouseReleased(evt);
            }
        });

        btn_53.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_53.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_53.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_53MouseReleased(evt);
            }
        });

        btn_52.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_52.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_52.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_52MouseReleased(evt);
            }
        });

        btn_33.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_33.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_33.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_33MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_GameLayout = new javax.swing.GroupLayout(pnl_Game);
        pnl_Game.setLayout(pnl_GameLayout);
        pnl_GameLayout.setHorizontalGroup(
            pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_GameLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_GameLayout.createSequentialGroup()
                        .addComponent(btn_04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_GameLayout.createSequentialGroup()
                                .addComponent(btn_26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btn_36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btn_46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_GameLayout.createSequentialGroup()
                                .addComponent(btn_25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btn_35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btn_45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_GameLayout.createSequentialGroup()
                                .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_GameLayout.createSequentialGroup()
                                        .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnl_GameLayout.createSequentialGroup()
                                                    .addComponent(btn_24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(20, 20, 20)
                                                    .addComponent(btn_34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(btn_32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_GameLayout.createSequentialGroup()
                                                .addComponent(btn_20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(btn_30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(20, 20, 20)
                                        .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnl_GameLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btn_40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn_42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn_41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(btn_43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_GameLayout.createSequentialGroup()
                                        .addComponent(btn_54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(btn_64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_GameLayout.createSequentialGroup()
                                        .addComponent(btn_53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(btn_63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_GameLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(btn_52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(btn_62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnl_GameLayout.createSequentialGroup()
                        .addComponent(btn_03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_GameLayout.createSequentialGroup()
                        .addComponent(btn_02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btn_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_GameLayout.createSequentialGroup()
                                .addComponent(btn_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btn_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_GameLayout.setVerticalGroup(
            pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_GameLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_GameLayout.createSequentialGroup()
                        .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_GameLayout.createSequentialGroup()
                                .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnl_GameLayout.createSequentialGroup()
                                        .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(pnl_GameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(btn_62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        btn_new.setText("Novo Jogo");
        btn_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_newMouseReleased(evt);
            }
        });

        btn_solve.setText("Resolver");
        btn_solve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_solveMouseReleased(evt);
            }
        });
        btn_solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solveActionPerformed(evt);
            }
        });

        cb_gameType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tradicional", "Cruz", "Mais", "Banquinho", "Flecha", "Piramide", "Losango" }));

        label_gg.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnl_ctrlLayout = new javax.swing.GroupLayout(pnl_ctrl);
        pnl_ctrl.setLayout(pnl_ctrlLayout);
        pnl_ctrlLayout.setHorizontalGroup(
            pnl_ctrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ctrlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ctrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ctrlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnl_ctrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_solve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_new, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnl_ctrlLayout.createSequentialGroup()
                        .addGroup(pnl_ctrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_ctrlLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(label_gg))
                            .addComponent(cb_gameType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_ctrlLayout.setVerticalGroup(
            pnl_ctrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ctrlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_new)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_solve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_gameType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_gg))
        );

        btn_null.setMaximumSize(new java.awt.Dimension(30, 30));
        btn_null.setMinimumSize(new java.awt.Dimension(30, 30));
        btn_null.setPreferredSize(new java.awt.Dimension(30, 30));
        btn_null.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_nullMouseReleased(evt);
            }
        });
        btn_null.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nullActionPerformed(evt);
            }
        });

        url.setForeground(new java.awt.Color(64, 0, 255));
        url.setText("https://github.com/thiagofigcosta/");

        jLabel1.setText("by: nanoTech");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnl_Game, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_ctrl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_null, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(url)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_ctrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(btn_null, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_Game, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(url)
                    .addComponent(jLabel1))
                .addGap(0, 0, 0))
        );

        jLabel1.getAccessibleContext().setAccessibleName("by: nanoTech");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_solveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_solveActionPerformed

    private void btn_nullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nullActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nullActionPerformed

    private void btn_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_20ActionPerformed

    private void btn_nullMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nullMouseReleased
        this.updateButtons();
    }//GEN-LAST:event_btn_nullMouseReleased

    public int getType(String cb){
        if(cb=="Losango"){
            return(Board.LOSANGO);
        }else if(cb=="Cruz"){
            return(Board.CRUZ);
        }else if(cb=="Mais"){
            return(Board.MAIS);
        }else if(cb=="Banquinho"){
            return(Board.BANQUINHO);
        }else if(cb=="Flecha"){
            return(Board.FLECHA);
        }else if(cb=="Piramide"){
            return(Board.PIRAMIDE);
        }else{
            return(Board.TRADICIONAL); 
        }
    }
    
    private void btn_newMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newMouseReleased
        brd.fillBoard(getType(cb_gameType.getSelectedItem().toString()));
        label_gg.setText("");
        selected=new Coord();
        ai=null;
        updateButtons();
    }//GEN-LAST:event_btn_newMouseReleased

    private void btn_20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_20MouseReleased
        behaveButton(2,0);
    }//GEN-LAST:event_btn_20MouseReleased

    private void btn_21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_21MouseReleased
        behaveButton(2,1);
    }//GEN-LAST:event_btn_21MouseReleased

    private void btn_22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_22MouseReleased
        behaveButton(2,2);
    }//GEN-LAST:event_btn_22MouseReleased

    private void btn_23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_23MouseReleased
        behaveButton(2,3);
    }//GEN-LAST:event_btn_23MouseReleased

    private void btn_24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_24MouseReleased
        behaveButton(2,4);
    }//GEN-LAST:event_btn_24MouseReleased

    private void btn_25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_25MouseReleased
        behaveButton(2,5);
    }//GEN-LAST:event_btn_25MouseReleased

    private void btn_26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_26MouseReleased
        behaveButton(2,6);
    }//GEN-LAST:event_btn_26MouseReleased

    private void btn_30MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_30MouseReleased
        behaveButton(3,0);
    }//GEN-LAST:event_btn_30MouseReleased

    private void btn_31MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_31MouseReleased
        behaveButton(3,1);
    }//GEN-LAST:event_btn_31MouseReleased

    private void btn_32MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_32MouseReleased
        behaveButton(3,2);
    }//GEN-LAST:event_btn_32MouseReleased

    private void btn_33MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_33MouseReleased
        behaveButton(3,3);
    }//GEN-LAST:event_btn_33MouseReleased

    private void btn_34MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_34MouseReleased
        behaveButton(3,4);
    }//GEN-LAST:event_btn_34MouseReleased

    private void btn_35MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_35MouseReleased
        behaveButton(3,5);
    }//GEN-LAST:event_btn_35MouseReleased

    private void btn_36MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_36MouseReleased
        behaveButton(3,6);
    }//GEN-LAST:event_btn_36MouseReleased

    private void btn_40MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_40MouseReleased
        behaveButton(4,0);
    }//GEN-LAST:event_btn_40MouseReleased

    private void btn_41MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_41MouseReleased
        behaveButton(4,1);
    }//GEN-LAST:event_btn_41MouseReleased

    private void btn_42MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_42MouseReleased
        behaveButton(4,2);
    }//GEN-LAST:event_btn_42MouseReleased

    private void btn_43MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_43MouseReleased
        behaveButton(4,3);
    }//GEN-LAST:event_btn_43MouseReleased

    private void btn_44MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_44MouseReleased
        behaveButton(4,4);
    }//GEN-LAST:event_btn_44MouseReleased

    private void btn_45MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_45MouseReleased
        behaveButton(4,5);
    }//GEN-LAST:event_btn_45MouseReleased

    private void btn_46MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_46MouseReleased
        behaveButton(4,6);
    }//GEN-LAST:event_btn_46MouseReleased

    private void btn_02MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_02MouseReleased
        behaveButton(0,2);
    }//GEN-LAST:event_btn_02MouseReleased

    private void btn_03MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_03MouseReleased
        behaveButton(0,3);
    }//GEN-LAST:event_btn_03MouseReleased

    private void btn_04MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_04MouseReleased
        behaveButton(0,4);
    }//GEN-LAST:event_btn_04MouseReleased

    private void btn_12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_12MouseReleased
        behaveButton(1,2);
    }//GEN-LAST:event_btn_12MouseReleased

    private void btn_13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_13MouseReleased
        behaveButton(1,3);
    }//GEN-LAST:event_btn_13MouseReleased

    private void btn_14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_14MouseReleased
        behaveButton(1,4);
    }//GEN-LAST:event_btn_14MouseReleased

    private void btn_52MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_52MouseReleased
        behaveButton(5,2);
    }//GEN-LAST:event_btn_52MouseReleased

    private void btn_53MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_53MouseReleased
        behaveButton(5,3);
    }//GEN-LAST:event_btn_53MouseReleased

    private void btn_54MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_54MouseReleased
        behaveButton(5,4);
    }//GEN-LAST:event_btn_54MouseReleased

    private void btn_62MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_62MouseReleased
        behaveButton(6,2);
    }//GEN-LAST:event_btn_62MouseReleased

    private void btn_63MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_63MouseReleased
        behaveButton(6,3);
    }//GEN-LAST:event_btn_63MouseReleased

    private void btn_64MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_64MouseReleased
        behaveButton(6,4);
    }//GEN-LAST:event_btn_64MouseReleased

    private void btn_solveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_solveMouseReleased
        int type=getType(cb_gameType.getSelectedItem().toString());
        brd.fillBoard(type);
        label_gg.setText("");
        ai=new AI(this,type);
        updateButtons();
    }//GEN-LAST:event_btn_solveMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_02;
    private javax.swing.JButton btn_03;
    private javax.swing.JButton btn_04;
    private javax.swing.JButton btn_12;
    private javax.swing.JButton btn_13;
    private javax.swing.JButton btn_14;
    private javax.swing.JButton btn_20;
    private javax.swing.JButton btn_21;
    private javax.swing.JButton btn_22;
    private javax.swing.JButton btn_23;
    private javax.swing.JButton btn_24;
    private javax.swing.JButton btn_25;
    private javax.swing.JButton btn_26;
    private javax.swing.JButton btn_30;
    private javax.swing.JButton btn_31;
    private javax.swing.JButton btn_32;
    private javax.swing.JButton btn_33;
    private javax.swing.JButton btn_34;
    private javax.swing.JButton btn_35;
    private javax.swing.JButton btn_36;
    private javax.swing.JButton btn_40;
    private javax.swing.JButton btn_41;
    private javax.swing.JButton btn_42;
    private javax.swing.JButton btn_43;
    private javax.swing.JButton btn_44;
    private javax.swing.JButton btn_45;
    private javax.swing.JButton btn_46;
    private javax.swing.JButton btn_52;
    private javax.swing.JButton btn_53;
    private javax.swing.JButton btn_54;
    private javax.swing.JButton btn_62;
    private javax.swing.JButton btn_63;
    private javax.swing.JButton btn_64;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_null;
    private javax.swing.JButton btn_solve;
    private javax.swing.JComboBox<String> cb_gameType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_gg;
    private javax.swing.JPanel pnl_Game;
    private javax.swing.JPanel pnl_ctrl;
    private javax.swing.JLabel url;
    // End of variables declaration//GEN-END:variables
}
