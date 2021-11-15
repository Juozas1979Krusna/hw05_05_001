
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import  java.util.*;

public class hw05_05_001 extends JPanel {
    int arrayDim_genArrayDim;
    int arraySize_genArrayDim;
    static int raw2dArray_genArrayDim[][] = new int[6][6];
    static int ord2dArray_genArrayDim[][] = new int[6][6];

    int arrayDim ;
    int arraySize ;
    int arraySize_Prob2;
    int X_double_out ;
    int X_int_out;
    int arrayDim_1_Prob2 ;
    int arrayDim_2_Prob2 ;
    static int raw2dArray[][] = new int[6][6];
    static int ord2dArray[][] = new int[6][6];
    static int raw2dArray_Prob2[][] = new int[16][16];
    static int ord2dArray_Prob2[][] = new int[16][16];
    static int swt2dArray_Prob2[][]= new int[16][16];
    static JTextArea g;
    static JTextArea g_02;
    static JTextArea g_genArrayDim_arrDim_arrRaw ;
    static JTextArea g_genArrayDim_arrDim_arrSort;
    static JTextField tcw05_01_001_res_Prob2 ;
    static JButton bcw05_01_001_gene_Prob2 ;
    static JLabel lcw04_01_001_res_Prob2;
    static JTextArea g_Prob2 ;
    static JTextArea g_02_Prob2 ;
    static JTextArea g_03_Prob2 ;
    static JButton bcw04_01_001_sbmt_Prob2;

    // JTextField
    static JTextField thw05_05_001_genArrayDim_inpuArr ;
    static JTextField thw05_05_001_genArrayDim_arrDim ;
    static JButton bhw05_05_001_genArrayDim_gene;
    static JButton bhw05_05_001_genArrayDim_sbmt;
    static JTextField thw05_05_001_Prob2_inpuArr;
    static JTextField tcw04_01_001_res;
    static JTextField tcw05_01_001_res;
    // JButton
    static JButton bcw04_01_001_sbmt;
    static JButton bcw05_01_001_gene;
    public hw05_05_001() {
        initializeUI();
    }

    public static void showFrame() {
        JPanel panel = new hw05_05_001();
        panel.setOpaque(true);

        JFrame frame = new JFrame("hw05_05_001");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(hw05_05_001::showFrame);
    }

    private void initializeUI() {
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel genArrayDimPanel = new JPanel();
        /*V*/
        thw05_05_001_genArrayDim_inpuArr = new JTextField(10);
        thw05_05_001_genArrayDim_arrDim = new JTextField(10);
        bhw05_05_001_genArrayDim_gene = new JButton();
        bhw05_05_001_genArrayDim_sbmt = new JButton("Get the Array Dimension");

        g_genArrayDim_arrDim_arrRaw = new JTextArea(10, 10);
        g_genArrayDim_arrDim_arrSort = new JTextArea(10, 10);
        bhw05_05_001_genArrayDim_sbmt.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Random rand = new Random();
                    arrayDim_genArrayDim = rand.nextInt(4)+3;
                    arraySize_genArrayDim = arrayDim_genArrayDim*arrayDim_genArrayDim;
                    String outStrPrint_01="The Array is ";
                    String outStrPrint_02="";
                    outStrPrint_02=String.valueOf(arrayDim_genArrayDim);
                    outStrPrint_01=outStrPrint_01+outStrPrint_02+ " x "+outStrPrint_02;
                    String rawButtInput="Input the Array element ";
                    String addButtInput_01="0";
                    String addButtInput_02="0";
                    String ButtInput=rawButtInput + addButtInput_01 + "x" + addButtInput_02;
                    bhw05_05_001_genArrayDim_gene.setText(ButtInput);
                    for(int z=0;z<arrayDim_genArrayDim;z++) {
                        for (int k = 0; k < arrayDim_genArrayDim; k++) {
                            raw2dArray_genArrayDim[z][k]=0;
                            ord2dArray_genArrayDim[z][k]=0;
                        }
                    }
                    bhw05_05_001_genArrayDim_gene.addActionListener(
                        new ActionListener() {
                            int fineIndex_genArrayDim=0;
                            int xIndex_genArrayDim=0;
                            int yIndex_genArrayDim=0;
                            public void actionPerformed(ActionEvent e) {
                                String rawButtInput="Input the Array element ";
                                String addButtInput_01=String.valueOf(xIndex_genArrayDim);
                                String addButtInput_02=String.valueOf(yIndex_genArrayDim);
                                String ButtInput=rawButtInput + addButtInput_01 + "x" + addButtInput_02;
                                bhw05_05_001_genArrayDim_gene.setText(ButtInput);
                                String X_double  = thw05_05_001_genArrayDim_inpuArr.getText();
                                try {
                                    X_double_out = Integer.parseInt(X_double);
                                } catch(NumberFormatException ev){}
                                raw2dArray_genArrayDim[xIndex_genArrayDim][yIndex_genArrayDim]=X_double_out;
                                String i_outStrPrint ="";
                                for(int z=0;z<arrayDim_genArrayDim;z++) {
                                    for (int k = 0; k < arrayDim_genArrayDim; k++) {
                                        String comm_outStrPrint = "   ";
                                        if (raw2dArray_genArrayDim[z][k] == 100) {
                                        }else{
                                            if (raw2dArray_genArrayDim[z][k] > 9) {
                                                comm_outStrPrint = comm_outStrPrint + "  ";
                                            } else {
                                                comm_outStrPrint = comm_outStrPrint + "    ";
                                            }
                                        }
                                        i_outStrPrint = i_outStrPrint +comm_outStrPrint+ String.valueOf(raw2dArray_genArrayDim[z][k]);
                                    }
                                    i_outStrPrint = i_outStrPrint +"\n";
                                }
                                ord2dArray_genArrayDim[xIndex_genArrayDim][yIndex_genArrayDim]=raw2dArray_genArrayDim[xIndex_genArrayDim][yIndex_genArrayDim];
                                String i_outOrdPrint ="";
                                for(int z=0;z<arrayDim_genArrayDim;z++) {
                                    for (int k = 0; k < arrayDim_genArrayDim; k++) {
                                        String comm_outStrPrint = "       ";
                                        if(z==k) {
                                            comm_outStrPrint = "   ";
                                            if (ord2dArray_genArrayDim[z][k] == 100) {
                                            }else{
                                                if (ord2dArray_genArrayDim[z][k] > 9) {
                                                    comm_outStrPrint = comm_outStrPrint + "  ";
                                                } else {
                                                    comm_outStrPrint = comm_outStrPrint + "    ";
                                                }
                                            }
                                            i_outOrdPrint = i_outOrdPrint +comm_outStrPrint+ String.valueOf(raw2dArray_genArrayDim[z][k]);
                                        }else{
                                            if(z+k==arrayDim_genArrayDim-1) {
                                                comm_outStrPrint = "   ";
                                                if (ord2dArray_genArrayDim[z][k] == 100) {
                                                }else{
                                                    if (ord2dArray_genArrayDim[z][k] > 9) {
                                                        comm_outStrPrint = comm_outStrPrint + "  ";
                                                    } else {
                                                        comm_outStrPrint = comm_outStrPrint + "    ";
                                                    }
                                                }
                                                i_outOrdPrint = i_outOrdPrint +comm_outStrPrint+ String.valueOf(raw2dArray_genArrayDim[z][k]);
                                            }else{
                                                i_outOrdPrint = i_outOrdPrint +comm_outStrPrint+ String.valueOf(0);
                                            }
                                        }
                                    }
                                    i_outOrdPrint = i_outOrdPrint +"\n";
                                }
                                fineIndex_genArrayDim++;
                                yIndex_genArrayDim ++;
                                if (fineIndex_genArrayDim == arrayDim_genArrayDim){
                                    xIndex_genArrayDim ++;
                                    yIndex_genArrayDim = 0;
                                    fineIndex_genArrayDim = 0;
                                }
                                g_genArrayDim_arrDim_arrRaw.setText(i_outStrPrint);
                                g_genArrayDim_arrDim_arrSort.setText(i_outOrdPrint);
                            }
                        }
                    );
                    thw05_05_001_genArrayDim_arrDim.setText(outStrPrint_01);
                }
            }
        );
        genArrayDimPanel.add(bhw05_05_001_genArrayDim_sbmt);
        genArrayDimPanel.add(thw05_05_001_genArrayDim_arrDim);
        genArrayDimPanel.add(bhw05_05_001_genArrayDim_gene);
        genArrayDimPanel.add(thw05_05_001_genArrayDim_inpuArr);
        genArrayDimPanel.add(g_genArrayDim_arrDim_arrRaw);
        genArrayDimPanel.add(g_genArrayDim_arrDim_arrSort);
/*A*/
        tabbedPane.addTab("intenArrayFill", genArrayDimPanel);
        /*Prob#1 intenArrayFill*/
        /* V Prob#1 randArrayFill*/
        JPanel randArrayFillPanel= new JPanel();

        /*V*/
        tcw04_01_001_res = new JTextField(10);
        tcw05_01_001_res = new JTextField(10);
        bcw05_01_001_gene = new JButton();

        g = new JTextArea(10, 10);
        g_02 = new JTextArea(10, 10);
        bcw04_01_001_sbmt = new JButton("Get the Array Dimension");
        bcw04_01_001_sbmt.addActionListener (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int i = 0;
                    int j = 0;
                    int recomb;
                    boolean uniqueFill = true;
                    boolean uniqueNum ;
                    int rawArray[] = new int[65];
                    Random rand = new Random();
                    arrayDim = rand.nextInt(4)+3;
                    arraySize = arrayDim*arrayDim;
                    String outStrPrint_01="The Array is ";
                    String outStrPrint_02="";
                    outStrPrint_02=String.valueOf(arrayDim);
                    outStrPrint_01=outStrPrint_01+outStrPrint_02+ " x "+outStrPrint_02;
                    String rawButtInput="Input the Array element ";
                    String addButtInput_01="0";
                    String addButtInput_02="0";
                    String ButtInput=rawButtInput + addButtInput_01 + "x" + addButtInput_02;
                    bcw05_01_001_gene.setText(ButtInput);
                    for(int z=0;z<arrayDim;z++) {
                        for (int k = 0; k < arrayDim; k++) {
                            raw2dArray[z][k]=0;
                            ord2dArray[z][k]=0;
                        }
                    }
                    while (uniqueFill == true) {
                        int int_random03 = (rand.nextInt(100) + 1);

                        if (i > 0) {
                            uniqueNum = true;
                            for (j = 0; j < i ; j++) {
                                if (rawArray[j] == int_random03) {
                                    uniqueNum = false;
                                }
                            }
                            if (uniqueNum == false) {
                            }else {
                                rawArray[i] = int_random03;
                                i++;
                            }
                        }else {
                            rawArray[i] = int_random03;
                            i++;
                        }
                        if (i == 64) {
                            uniqueFill = false;
                        }
                    }
                    recomb = 0;
                    for(int z=0;z<arrayDim;z++) {
                        for (int k = 0; k < arrayDim; k++) {
                            raw2dArray[z][k] = rawArray[recomb];
                            recomb ++;
                        }
                    }
                    String i_outStrPrint ="";
                    for(int z=0;z<arrayDim;z++) {
                        for (int k = 0; k < arrayDim; k++) {
                            String comm_outStrPrint = "   ";
                            if (raw2dArray[z][k] == 100) {
                            }else{
                                if (raw2dArray[z][k] > 9) {
                                    comm_outStrPrint = comm_outStrPrint + "  ";
                                } else {
                                    comm_outStrPrint = comm_outStrPrint + "    ";
                                }
                            }
                            i_outStrPrint = i_outStrPrint +comm_outStrPrint+ String.valueOf(raw2dArray[z][k]);
                        }
                        i_outStrPrint = i_outStrPrint +"\n";
                    }
                    String i_outOrdPrint ="";
                    for(int z=0;z<arrayDim;z++) {
                        for (int k = 0; k < arrayDim; k++) {
                            ord2dArray[z][k]=raw2dArray[z][k];
                            String comm_outStrPrint = "       ";
                            if(z==k) {
                                comm_outStrPrint = "   ";
                                if (ord2dArray[z][k] == 100) {
                                }else{
                                    if (ord2dArray[z][k] > 9) {
                                        comm_outStrPrint = comm_outStrPrint + "  ";
                                    } else {
                                        comm_outStrPrint = comm_outStrPrint + "    ";
                                    }
                                }
                                i_outOrdPrint = i_outOrdPrint +comm_outStrPrint+ String.valueOf(raw2dArray[z][k]);
                            }else{
                                if(z+k==arrayDim-1) {
                                    comm_outStrPrint = "   ";
                                    if (ord2dArray[z][k] == 100) {
                                    }else{
                                        if (ord2dArray[z][k] > 9) {
                                            comm_outStrPrint = comm_outStrPrint + "  ";
                                        } else {
                                            comm_outStrPrint = comm_outStrPrint + "    ";
                                        }
                                    }
                                    i_outOrdPrint = i_outOrdPrint +comm_outStrPrint+ String.valueOf(raw2dArray[z][k]);
                                }else{
                                    i_outOrdPrint = i_outOrdPrint +comm_outStrPrint+ String.valueOf(0);
                                }
                            }
                        }
                        i_outOrdPrint = i_outOrdPrint +"\n";
                    }
                    g.setText(i_outStrPrint);
                    g_02.setText(i_outOrdPrint);
                    tcw04_01_001_res.setText(outStrPrint_01);
                }
            }
        );
        randArrayFillPanel.add(bcw04_01_001_sbmt);
        randArrayFillPanel.add(tcw04_01_001_res);
        randArrayFillPanel.add(g);
        randArrayFillPanel.add(g_02);
        /*A*/
        tabbedPane.addTab("randArrayFill", randArrayFillPanel);

        /*A Prob#2 randArrayFill*/

        JPanel hw05_05_001_Prob1Panel = new JPanel();
/*V*/
        lcw04_01_001_res_Prob2 = new JLabel();
        tcw05_01_001_res_Prob2 = new JTextField(10);
        bcw05_01_001_gene_Prob2 = new JButton();
        thw05_05_001_Prob2_inpuArr = new JTextField(10);

        g_Prob2 = new JTextArea(10, 10);
        g_02_Prob2 = new JTextArea(10, 10);
        g_03_Prob2 = new JTextArea(10, 10);
        bcw04_01_001_sbmt_Prob2 = new JButton("Get the Array Dimension");
        bcw04_01_001_sbmt_Prob2.addActionListener (
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int i = 0;
                        int j = 0;
                        int recomb;
                        boolean uniqueFill = true;
                        boolean uniqueNum;
                        int iniSort;
                        boolean startSort = true;
                        boolean innertSort;
                        int rawArray_Prob2[] = new int[300];
                        Random rand = new Random();
                        arrayDim_2_Prob2 = rand.nextInt(11) + 5;
                        String X_int = thw05_05_001_Prob2_inpuArr.getText();
                        try {
                            X_int_out = Integer.parseInt(X_int);
                        } catch (NumberFormatException ev) {
                        }
                        String i_outStrPrint="";
                        String i_outOrdPrint="";
                        String i_outSwtPrint="";
                        String outStrPrint_01="";
                        if(X_int_out<5 || X_int_out>15){
                            outStrPrint_01 = "The amount ot rows must be between 5 and 15 ";
                        }else {
                            arrayDim_1_Prob2 = X_int_out;
                            arraySize_Prob2 = arrayDim_1_Prob2 * arrayDim_2_Prob2;
                            outStrPrint_01 = "The Array is ";
                            String outStrPrint_02 = "";
                            outStrPrint_02 = String.valueOf(arrayDim_1_Prob2);
                            String outStrPrint_03 = "";
                            outStrPrint_03 = String.valueOf(arrayDim_2_Prob2);
                            outStrPrint_01 = outStrPrint_01 + outStrPrint_02 + " x " + outStrPrint_03;
                            for (int z = 0; z < arrayDim_1_Prob2; z++) {
                                for (int k = 0; k < arrayDim_2_Prob2; k++) {
                                    raw2dArray_Prob2[z][k] = 0;
                                    ord2dArray_Prob2[z][k] = 0;
                                    swt2dArray_Prob2[z][k] = 0;
                                }
                            }
                            while (uniqueFill == true) {
                                int int_random00 = (rand.nextInt(9) + 1);
                                int int_random01 = (rand.nextInt(10));
                                int int_random02 = (rand.nextInt(10));
                                int int_random03 = (100 * int_random00) + (10 * int_random01) + int_random02;

                                if (i > 0) {
                                    uniqueNum = true;
                                    for (j = 0; j < i; j++) {
                                        if (rawArray_Prob2[j] == int_random03) {
                                            uniqueNum = false;
                                        }
                                    }
                                    if (uniqueNum == false) {
                                    } else {
                                        rawArray_Prob2[i] = int_random03;
                                        i++;
                                    }
                                } else {
                                    rawArray_Prob2[i] = int_random03;
                                    i++;
                                }
                                if (i == 299) {
                                    uniqueFill = false;
                                }
                            }
                            recomb = 0;
                            for (int z = 0; z < arrayDim_1_Prob2; z++) {
                                for (int k = 0; k < arrayDim_2_Prob2; k++) {
                                    raw2dArray_Prob2[z][k] = rawArray_Prob2[recomb];
                                    recomb++;
                                }
                            }
                            i_outStrPrint = "";
                            for (int z = 0; z < arrayDim_1_Prob2; z++) {
                                for (int k = 0; k < arrayDim_2_Prob2; k++) {
                                    String comm_outStrPrint = "   ";
                                    i_outStrPrint = i_outStrPrint + comm_outStrPrint + String.valueOf(raw2dArray_Prob2[z][k]);
                                }
                                i_outStrPrint = i_outStrPrint + "\n";
                            }
                            i = 0;
                            while (startSort == true) {
                                j = i;
                                innertSort = true;
                                while (innertSort == true) {
                                    if (rawArray_Prob2[i] < rawArray_Prob2[j + 1]) {
                                        iniSort = rawArray_Prob2[i];
                                        rawArray_Prob2[i] = rawArray_Prob2[j + 1];
                                        rawArray_Prob2[j + 1] = iniSort;
                                    }
                                    j++;
                                    if (j == arraySize_Prob2 - 1) {
                                        innertSort = false;
                                    }
                                }
                                i++;
                                if (i == arraySize_Prob2 - 1) {
                                    startSort = false;
                                }
                            }
                            recomb = 0;
                            for (int z = 0; z < arrayDim_1_Prob2; z++) {
                                for (int k = 0; k < arrayDim_2_Prob2; k++) {
                                    ord2dArray_Prob2[z][k] = rawArray_Prob2[recomb];
                                    recomb++;
                                }
                            }
                            i_outOrdPrint = "";
                            for (int z = 0; z < arrayDim_1_Prob2; z++) {
                                for (int k = 0; k < arrayDim_2_Prob2; k++) {
                                    String comm_outStrPrint = "   ";
                                    i_outOrdPrint = i_outOrdPrint + comm_outStrPrint + String.valueOf(ord2dArray_Prob2[z][k]);
                                }
                                i_outOrdPrint = i_outOrdPrint + "\n";
                            }
                            for (int z = 0; z < arrayDim_1_Prob2; z++) {
                                for (int k = 0; k < arrayDim_2_Prob2; k++) {
                                    swt2dArray_Prob2[z][k] = ord2dArray_Prob2[z][k];
                                }
                            }
                            for (int k = 0; k < arrayDim_2_Prob2; k++) {
                                swt2dArray_Prob2[0][k] = ord2dArray_Prob2[arrayDim_1_Prob2 - 1][k];
                                swt2dArray_Prob2[arrayDim_1_Prob2 - 1][k] = ord2dArray_Prob2[0][k];
                            }
                            i_outSwtPrint = "";
                            for (int z = 0; z < arrayDim_1_Prob2; z++) {
                                for (int k = 0; k < arrayDim_2_Prob2; k++) {
                                    String comm_outStrPrint = "   ";
                                    i_outSwtPrint = i_outSwtPrint + comm_outStrPrint + String.valueOf(swt2dArray_Prob2[z][k]);
                                }
                                i_outSwtPrint = i_outSwtPrint + "\n";
                            }
                        }
                        g_Prob2.setText(i_outStrPrint);
                        g_02_Prob2.setText(i_outOrdPrint);
                        g_03_Prob2.setText(i_outSwtPrint);
                        lcw04_01_001_res_Prob2.setText(outStrPrint_01);

                    }
                }
        );
/**/
        hw05_05_001_Prob1Panel.add(bcw04_01_001_sbmt_Prob2);
        hw05_05_001_Prob1Panel.add(thw05_05_001_Prob2_inpuArr);
        hw05_05_001_Prob1Panel.add(lcw04_01_001_res_Prob2);
        hw05_05_001_Prob1Panel.add(g_Prob2);
        hw05_05_001_Prob1Panel.add(g_02_Prob2);
        hw05_05_001_Prob1Panel.add(g_03_Prob2);
/*A*/
        // Add Account Tab
        tabbedPane.addTab("Prob #2", hw05_05_001_Prob1Panel);
        /*Prob#1 step6*/

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 200));
        this.add(tabbedPane, BorderLayout.CENTER);
    }
}




