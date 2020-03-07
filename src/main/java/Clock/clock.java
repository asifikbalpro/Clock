/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Asif
 */
public class clock extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form clock
     */
    private final Timer updateTimer;
    private final int DELAY = 100;
    private int hour;
    private int minute;
    private static boolean state = true;
    private static boolean state1 = true;
    private final int time = 0;
    
    private int hour_ = 0;
    private int min_ = 0;
    private int sec_ = 0;
    private int milisec_ = 0;
    
    public clock() {
        initComponents();
        
        updateTimer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Date currentTime = new Date();
               String formatTimStr = "hh:mm:ss";
               DateFormat formatTime = new SimpleDateFormat(formatTimStr);
               String formatedTimeString = formatTime.format(currentTime);
                               
               Clock.setText(formatedTimeString);
               AlarmClock.setText(formatedTimeString);
              
               
               
            }
        });
        updateTimer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Clock = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        AlarmClock = new javax.swing.JLabel();
        jHH = new javax.swing.JSpinner();
        jMM = new javax.swing.JSpinner();
        jset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_hour = new javax.swing.JTextField();
        lbl_min = new javax.swing.JTextField();
        lbl_sec = new javax.swing.JTextField();
        lbl_milisec = new javax.swing.JTextField();
        jStart = new javax.swing.JButton();
        jStop = new javax.swing.JButton();
        jReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clock");

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        Clock.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        Clock.setText("00:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Clock)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Clock)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clock", jPanel1);

        AlarmClock.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        AlarmClock.setText("00:00:00");

        jHH.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jHH.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));

        jMM.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jMM.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jset.setText("Set Alarm");
        jset.setBorder(null);
        jset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsetActionPerformed(evt);
            }
        });

        jLabel1.setText("Note::");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jHH, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMM, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AlarmClock))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlarmClock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMM, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alarm", jPanel2);

        lbl_hour.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_hour.setText("00");

        lbl_min.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_min.setText("00");

        lbl_sec.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_sec.setText("00");

        lbl_milisec.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_milisec.setText("00");

        jStart.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jStart.setText("Start");
        jStart.setBorder(null);
        jStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStartActionPerformed(evt);
            }
        });

        jStop.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jStop.setText("Stop");
        jStop.setBorder(null);
        jStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStopActionPerformed(evt);
            }
        });

        jReset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jReset.setText("Reset");
        jReset.setBorder(null);
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jStart, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jStop, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_milisec, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(lbl_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sec)
                    .addComponent(lbl_milisec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_hour))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jStart, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jStop, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Stopwatch", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        // TODO add your handling code here:
        state = false;
        setHour(0);
        setMin(0);
        setSec(0);
        setMilisec(0);

        lbl_hour.setText("00");
        lbl_min.setText("00");
        lbl_sec.setText("00");
        lbl_milisec.setText("00");
    }//GEN-LAST:event_jResetActionPerformed

    private void jStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStopActionPerformed
        // TODO add your handling code here:
        state = false;
    }//GEN-LAST:event_jStopActionPerformed

    private void jStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartActionPerformed
        // TODO add your handling code here:
        state = true;
        Thread t;
        t = new Thread(){
            @Override
            public void run(){
                for(;;){
                    if (state == true) {
                        try {
                            sleep(1);
                            if (getMilisec() > 1000) {
                                setMilisec(0);
                                setSec(getSec() + 1);
                            }if (getSec() > 60) {
                                setMilisec(0);
                                setSec(0);
                                setMin(getMin() + 1);
                            }if (getMin() > 60) {
                                setMilisec(0);
                                setSec(0);
                                setMin(0);
                                hour++;
                            }
                            lbl_milisec.setText(" " + getMilisec());
                            setMilisec(getMilisec() + 1);
                            lbl_sec.setText(" " + getSec());
                            lbl_min.setText(" " + getMin());
                            lbl_hour.setText(" "+ getHour());

                        } catch (InterruptedException e) {

                        }
                    }
                }

            }
        };
        t.start();
    }//GEN-LAST:event_jStartActionPerformed

    private void jsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsetActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        System.out.println("alarm set clicked");

        int hh = (int) jHH.getValue();
        int mm = (int) jMM.getValue();

        LocalDateTime now = LocalDateTime.now(); //
        int h1 = now.getHour();
        int m1 = now.getMinute();
        int ss = now.getSecond();
        System.out.println("Now full " + now.toString());
        int now_in_seconds = Converter.get_seconds(now);
        System.out.println("Now " + now_in_seconds);
        int target_in_seconds = hh * 3600 + mm * 60;
        if (h1 > 12){
            // pm
            target_in_seconds += 12*3600;
        }
        System.out.println("To " + target_in_seconds);
        int time_remaining = target_in_seconds - now_in_seconds;
        System.out.println("Time to sleep " + time_remaining);
        //        String time1 = hh+":"+mm+":00";
        //        String time2 = h1+":"+m1+":"+ss;
        //
        //        SimpleDateFormat format = new SimpleDateFormat();
        //        /**
        //         * TODO: calculate the time and convert into a sec.
        //         * and use that variable on sleep();
        //         */
        //        Date date1 = format.parse(time1); // this is one of the problem
        //        Date date2 = format.parse(time2); // problem

        //        long diff = date2.getTime() - date1.getTime();

        //        System.out.println(time1 +" "+ time2);

        System.out.println("alarm has set "+ hh + ":"+ mm);

        setState(true);
        Thread t = new Thread(){
            @Override
            public void run(){
                for(;;){
                    if(isState() == true){
                        try {
                            sleep(time_remaining); // sleep for long time for saving processing power
                            // TODO. failsafe. if the program needs to sleep more then it sould not be more than 1 sec
                            if(LocalDateTime.now().getHour() > 12){
                                hour = LocalDateTime.now().getHour() - 12;
                            }else{
                                hour = LocalDateTime.now().getHour();
                            }
                            minute = LocalDateTime.now().getMinute();

                            if(hour == hh && minute == mm){
                                jLabel1.setText("alarm");
                                System.out.println("alarming");
                                //                                alarmTune("music\\alarm_clock.mp3");
                                break;
                            }
                        } catch (InterruptedException e) {
                            System.out.println("Exception " + e.toString());
                        }
                    }
                }
            }
        };
        t.start();
    }//GEN-LAST:event_jsetActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlarmClock;
    private javax.swing.JLabel Clock;
    private javax.swing.JSpinner jHH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jMM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jReset;
    private javax.swing.JButton jStart;
    private javax.swing.JButton jStop;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jset;
    private javax.swing.JTextField lbl_hour;
    private javax.swing.JTextField lbl_milisec;
    private javax.swing.JTextField lbl_min;
    private javax.swing.JTextField lbl_sec;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the state
     */
    public static boolean isState() {
        return state1;
    }

    /**
     * @param aState the state to set
     */
    public static void setState(boolean aState) {
        state1 = aState;
    }

    /**
     * @return the Hour
     */
    public int getHour() {
        return hour_;
    }

    /**
     * @param aHour the Hour to set
     */
    public void setHour(int aHour) {
        hour_ = aHour;
    }

    /**
     * @return the Min
     */
    public int getMin() {
        return min_;
    }

    /**
     * @param aMin the Min to set
     */
    public void setMin(int aMin) {
        min_ = aMin;
    }

    /**
     * @return the Sec
     */
    public int getSec() {
        return sec_;
    }

    /**
     * @param aSec the Sec to set
     */
    public void setSec(int aSec) {
        sec_ = aSec;
    }

    /**
     * @return the Milisec
     */
    public int getMilisec() {
        return milisec_;
    }

    /**
     * @param aMilisec the Milisec to set
     */
    public void setMilisec(int aMilisec) {
        milisec_ = aMilisec;
    }
}
