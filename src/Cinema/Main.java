package Cinema;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    private static ArrayList<FilmActiune> filmActiune = new ArrayList<>();
    private static ArrayList<FilmComedie> filmComedie = new ArrayList<>();
    
    
    public static void main(String[] args) {
       JFrame frame = new JFrame("Cinema");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(700, 500);

       JPanel panel = new JPanel();
       panel.setLayout(null);
       panel.setBackground(Color.red);

       JButton butonFilm = new JButton("Adauga Film");
       butonFilm.setBounds(150,100,150,100);
       butonFilm.setBackground(Color.black);
       butonFilm.setForeground(Color.white);

       JButton casaBilete = new JButton("Casa de Bilete");
       casaBilete.setBounds(350,100,150,100);
       casaBilete.setBackground(Color.black);
       casaBilete.setForeground(Color.white);

       JButton informatii = new JButton("Informatii");
       informatii.setBounds(250,220,150,100);
       informatii.setBackground(Color.black);
       informatii.setForeground(Color.white);

       panel.add(butonFilm);
       panel.add(casaBilete);
       panel.add(informatii);
    
       butonFilm.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            JFrame frameFilm = new JFrame("Adauga Film");
            frameFilm.setSize(500, 400);
             
            JPanel panelFilm = new JPanel();
            panelFilm.setLayout(null);
            panelFilm.setBackground(Color.red);

            JLabel numeFilm = new JLabel("Introdu numele filmului: ");
            numeFilm.setBounds(1,0,200,100);
            numeFilm.setBackground(Color.black);
            numeFilm.setForeground(Color.white);
            JTextField textNumeFilm = new JTextField();
            textNumeFilm.setBounds(220,20,200,50);
            textNumeFilm.setBackground(Color.white);
            textNumeFilm.setForeground(Color.black);

            JLabel genFilm = new JLabel("Genul filmului(actiune/comedie): ");
            genFilm.setBounds(1,50,200,100);
            genFilm.setBackground(Color.black);
            genFilm.setForeground(Color.white);
            JTextField textGenFilm = new JTextField();
            textGenFilm.setBounds(220,70,200,50);
            textGenFilm.setBackground(Color.white);
            textGenFilm.setForeground(Color.black);

            JLabel durataFilm = new JLabel("Introdu durata filmului: ");
            durataFilm.setBounds(1,100,200,100);
            durataFilm.setBackground(Color.black);
            durataFilm.setForeground(Color.white);
            JTextField textDurataFilm = new JTextField();
            textDurataFilm.setBounds(220,120,200,50);
            textDurataFilm.setBackground(Color.white);
            textDurataFilm.setForeground(Color.black);

            JLabel numeRegizor = new JLabel("Introdu numele regizorului: ");
            numeRegizor.setBounds(1,150,200,100);
            numeRegizor.setBackground(Color.black);
            numeRegizor.setForeground(Color.white);
            JTextField textNumeRegizor = new JTextField();
            textNumeRegizor.setBounds(220,170,200,50);
            textNumeRegizor.setBackground(Color.white);
            textNumeRegizor.setForeground(Color.black);

            JLabel prenumeRegizor = new JLabel("Introdu prenumele regizorului: ");
            prenumeRegizor.setBounds(1,200,200,100);
            prenumeRegizor.setBackground(Color.black);
            prenumeRegizor.setForeground(Color.white);
            JTextField textPrenumeRegizor = new JTextField();
            textPrenumeRegizor.setBounds(220,220,200,50);
            textPrenumeRegizor.setBackground(Color.white);
            textPrenumeRegizor.setForeground(Color.black);

            JLabel varstaRegizor = new JLabel("Introdu varsta regizorului: ");
            varstaRegizor.setBounds(1,250,200,100);
            varstaRegizor.setBackground(Color.black);
            varstaRegizor.setForeground(Color.white);
            JTextField textVarstaRegizor = new JTextField();
            textVarstaRegizor.setBounds(220,270,200,50);
            textVarstaRegizor.setBackground(Color.white);
            textVarstaRegizor.setForeground(Color.black);

            JLabel pretBilet = new JLabel("Adauga pretul biletului la acest film");
            pretBilet.setBounds(1,300,200,100);
            pretBilet.setBackground(Color.black);
            pretBilet.setForeground(Color.white);

            JTextField textPretBilet = new JTextField();
            textPretBilet.setBounds(220,320,200,50);
            textPretBilet.setBackground(Color.white);
            textPretBilet.setForeground(Color.black);



            JButton adaugaFilm = new JButton("Adauga Film");
            adaugaFilm.setBounds(1,400,200,100);
            adaugaFilm.setBackground(Color.black);
            adaugaFilm.setForeground(Color.white);

            panelFilm.add(numeFilm);
            panelFilm.add(textNumeFilm);
            panelFilm.add(genFilm);
            panelFilm.add(textGenFilm);
            panelFilm.add(durataFilm);
            panelFilm.add(textDurataFilm);
            panelFilm.add(numeRegizor);
            panelFilm.add(textNumeRegizor);
            panelFilm.add(adaugaFilm);
            panelFilm.add(prenumeRegizor);
            panelFilm.add(textPrenumeRegizor);
            panelFilm.add(varstaRegizor);
            panelFilm.add(textVarstaRegizor);
            panelFilm.add(pretBilet);
            panelFilm.add(textPretBilet);

            adaugaFilm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    String nume = textNumeFilm.getText();
                    String gen = textGenFilm.getText();                    
                    String nregizor = textNumeRegizor.getText();
                    String pregizor = textPrenumeRegizor.getText();
                    System.out.println(gen);
                    if(nume.isEmpty() || gen.isEmpty()  || nregizor.isEmpty() || pregizor.isEmpty()){
                        JOptionPane.showMessageDialog(frame, "Toate câmpurile trebuie completate.");
                        return;
                    }
                    int durata;
                    try {
                        durata = Integer.parseInt(textDurataFilm.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Durata trebuie să fie un număr valid.");
                        return;
                    }
                    int vregizor;
                    try {
                        vregizor = Integer.parseInt(textVarstaRegizor.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Vârsta regizorului trebuie să fie un număr valid.");
                        return;
                    }
                    int pret;
                    try {
                        pret = Integer.parseInt(textPretBilet.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Vârsta regizorului trebuie să fie un număr valid.");
                        return;
                    }

                    if(gen.equals("actiune")){
                        FilmActiune filmaActiune = new FilmActiune(nume,durata,nregizor,pregizor,vregizor,pret);
                        filmActiune.add(filmaActiune);
                        JOptionPane.showMessageDialog(frame,"Film de actiune adaugat cu succes!");

                    }else{
                        FilmComedie filmaComedie = new FilmComedie(nume,durata,nregizor,pregizor,vregizor,pret);
                        filmComedie.add(filmaComedie);
                        JOptionPane.showMessageDialog(frame,"Film de comedie adaugat cu succes!");
                    }
                    textNumeFilm.setText("");
                    textGenFilm.setText("");
                    textDurataFilm.setText("");
                    textNumeRegizor.setText("");
                    textPrenumeRegizor.setText("");
                    textVarstaRegizor.setText("");
                    textPretBilet.setText("");
                }
            });

            frameFilm.add(panelFilm);
            frameFilm.setVisible(true);
           }
       });

     
    casaBilete.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             
            JFrame frameBilete = new JFrame("Casa de Bilete");
            frameBilete.setSize(600, 400);

            JPanel panelBilete = new JPanel();
            panelBilete.setLayout(null);
            panelBilete.setBackground(Color.red);
            
            JLabel numeFilm = new JLabel("Introdu numele filmului:");
            numeFilm.setBounds(1,0,200,100);
            numeFilm.setBackground(Color.black);
            numeFilm.setForeground(Color.white);
            JTextField textNumeFilm = new JTextField();
            textNumeFilm.setBounds(220,20,200,50);
            textNumeFilm.setBackground(Color.white);
            textNumeFilm.setForeground(Color.black);

            JLabel nrBilete = new JLabel("Introdu nr de bilete:");
            nrBilete.setBounds(1,50,200,100);
             
            nrBilete.setForeground(Color.white);
            JTextField textNrBilete = new JTextField();
            textNrBilete.setBounds(220,70,200,50);
            textNrBilete.setBackground(Color.white);
            textNrBilete.setForeground(Color.black);

            JButton cumparaBilet = new JButton("Cumpara Bilete!");
            cumparaBilet.setBounds(1,150,170,50);
            cumparaBilet.setBackground(Color.black);
            cumparaBilet.setForeground(Color.white);

            panelBilete.add(numeFilm);
            panelBilete.add(textNumeFilm);
            panelBilete.add(nrBilete);
            panelBilete.add(textNrBilete);
            panelBilete.add(cumparaBilet);


            cumparaBilet.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    String nume = textNumeFilm.getText();
                    if(nume.isEmpty()){
                        JOptionPane.showMessageDialog(frame, "Toate câmpurile trebuie completate.");
                        return;
                    }
                    int nrbilete;
                    try {
                        nrbilete = Integer.parseInt(textNrBilete.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Numarul de bilete trebuie să fie un număr valid.");
                        return;
                    }
                    boolean ok = false;
                    for(FilmActiune fa: filmActiune){
                        if(fa.getTitlu().equals(nume)){
                              ok = true;
                              break;
                        }
                    }
                    for(FilmComedie fc: filmComedie){
                        if(fc.getTitlu().equals(nume)){
                            ok = true;
                            break;
                        }
                    }

                    if(!ok){
                        JOptionPane.showMessageDialog(frame,"Filmul nu se afla in grila noastra!");
                    }else{  
                        int totalBileteCumparate = 0;

                        for (FilmActiune fa : filmActiune) {
                            if (fa.getTitlu().equals(nume)) {
                                while (totalBileteCumparate < nrbilete) {
                                    Bilet bilet = new Bilet(Spectator.getInstance());
                                    boolean cumparat = bilet.cumparaBilete(1);
                                    if (cumparat) {
                                        fa.addBilet(bilet);
                                        totalBileteCumparate++;
                                    } else {
                                        break; 
                                    }
                                }
                                if (totalBileteCumparate > 0) {
                                    JOptionPane.showMessageDialog(frame, "Ati cumparat " + totalBileteCumparate + " bilete, la filmul " + fa.afiseazaInformatii());
                                    textNrBilete.setText("");
                                    textNumeFilm.setText("");
                                    int rating = Integer.parseInt(JOptionPane.showInputDialog("Acordați un rating filmului (0-5):"));
                                    fa.setRating(rating);

                                }
                                break;
                            }
                        } 
                            for(FilmComedie fc: filmComedie){
                             if (fc.getTitlu().equals(nume)) {
                                while (totalBileteCumparate < nrbilete) {
                                    Bilet bilet = new Bilet(Spectator.getInstance());
                                    boolean cumparat = bilet.cumparaBilete(1); 
                                    if (cumparat) {
                                        fc.addBilet(bilet);
                                        totalBileteCumparate++;
                                    } else {
                                        break;
                                    }
                                }
                                if (totalBileteCumparate > 0) {
                                    JOptionPane.showMessageDialog(frame, "Ati cumparat " + totalBileteCumparate + " bilete, la filmul " + fc.afiseazaInformatii());
                                    textNrBilete.setText("");
                                    textNumeFilm.setText("");
                                    int rating = Integer.parseInt(JOptionPane.showInputDialog("Acordați un rating filmului (0-5):"));
                                    fc.setRating(rating);

                                }
                                break;
                            }
                            }

                       }
                    }
                }
            );


            frameBilete.add(panelBilete);
            frameBilete.setVisible(true);
        }
    });

     
    informatii.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            JFrame frameInformatii = new JFrame("Informatii");
            frameInformatii.setSize(700, 500);

            JPanel panelInformatii = new JPanel();
            panelInformatii.setLayout(null);
            panelInformatii.setBackground(Color.red);

            JButton urmaritFilm = new JButton("Cele mai urmarite filme!");
            urmaritFilm.setBounds(100,50,200,50);
            urmaritFilm.setBackground(Color.black);
            urmaritFilm.setForeground(Color.white);

            JButton incasariFilm = new JButton("Cele mai mari incasari!");
            incasariFilm.setBounds(400,50,200,50);
            incasariFilm.setBackground(Color.black);
            incasariFilm.setForeground(Color.white);

            JButton ratingFilm = new JButton("Cele mai bune rating-uri!");
            ratingFilm.setBounds(100,150,200,50);
            ratingFilm.setBackground(Color.black);
            ratingFilm.setForeground(Color.white);

            JTextArea textArea = new JTextArea();
            textArea.setBounds(1,300,600,400);
            textArea.setEditable(false);
            
            panelInformatii.add(urmaritFilm);
            panelInformatii.add(incasariFilm);
            panelInformatii.add(ratingFilm);
            panelInformatii.add(textArea);

            urmaritFilm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setText("");
                    int n = filmActiune.size();
                    int m = filmComedie.size();
                    
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            FilmActiune fa1 = filmActiune.get(j);
                            FilmActiune fa2 = filmActiune.get(j + 1);
                            
                            if (fa2.getNrSpectatori() > fa1.getNrSpectatori()) {
                                filmActiune.set(j, fa2);
                                filmActiune.set(j + 1, fa1);
                            }
                        }
                    }
                    textArea.append("Cele mai urmarite filme de actiune: \n");
                    for (FilmActiune fa : filmActiune) {
                        textArea.append(fa.getTitlu() + " : " + fa.getNrSpectatori() + " vizionari\n");
                    }

                    for (int i = 0; i < m - 1; i++) {
                        for (int j = 0; j < m - i - 1; j++) {
                            FilmComedie fc1 = filmComedie.get(j);
                            FilmComedie fc2 = filmComedie.get(j + 1);
                            
                            if (fc2.getNrSpectatori() > fc1.getNrSpectatori()) {
                                filmComedie.set(j, fc2);
                                filmComedie.set(j + 1, fc1);
                            }
                        }
                    }
                    textArea.append("Cele mai urmarite filme de comedie: \n");
                    for (FilmComedie fc : filmComedie) {
                        textArea.append(fc.getTitlu() + " : " + fc.getNrSpectatori() + " vizionari\n");
                    }
                }
            });
            

            incasariFilm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   textArea.setText("");
                   int n = filmActiune.size();
                    int m = filmComedie.size();
                    
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            FilmActiune fa1 = filmActiune.get(j);
                            FilmActiune fa2 = filmActiune.get(j + 1);
                            
                            if (fa2.getNrSpectatori()*fa2.getPret() > fa1.getNrSpectatori()*fa1.getPret()) {
                                filmActiune.set(j, fa2);
                                filmActiune.set(j + 1, fa1);
                            }
                        }
                    }
                    textArea.append("Filmele de actiune cu cele mai mari incasari: \n");
                    for (FilmActiune fa : filmActiune) {
                        textArea.append(fa.getTitlu() + " : " + fa.getNrSpectatori()*fa.getPret() + " lei\n");
                    }

                    for (int i = 0; i < m - 1; i++) {
                        for (int j = 0; j < m - i - 1; j++) {
                            FilmComedie fc1 = filmComedie.get(j);
                            FilmComedie fc2 = filmComedie.get(j + 1);
                            
                            if (fc2.getNrSpectatori()*fc2.getPret() > fc1.getNrSpectatori()*fc1.getPret()) {
                                filmComedie.set(j, fc2);
                                filmComedie.set(j + 1, fc1);
                            }
                        }
                    }
                    textArea.append("Filmele de comedie cu cele mai mari incasari: \n");
                    for (FilmComedie fc : filmComedie) {
                        textArea.append(fc.getTitlu() + " : " + fc.getNrSpectatori()*fc.getPret() + " lei\n");
                    }

                }     
            });

            ratingFilm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  textArea.setText("");
                   int n = filmActiune.size();
                    int m = filmComedie.size();
                    
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            FilmActiune fa1 = filmActiune.get(j);
                            FilmActiune fa2 = filmActiune.get(j + 1);
                            
                            if (fa2.getRating() > fa1.getRating()) {
                                filmActiune.set(j, fa2);
                                filmActiune.set(j + 1, fa1);
                            }
                        }
                    }
                    textArea.append("Filmele de actiune cu cele mai mari rating-uri: \n");
                    for (FilmActiune fa : filmActiune) {
                        textArea.append(fa.getTitlu() + " : " + fa.getRating() + " stele\n");
                    }

                    for (int i = 0; i < m - 1; i++) {
                        for (int j = 0; j < m - i - 1; j++) {
                            FilmComedie fc1 = filmComedie.get(j);
                            FilmComedie fc2 = filmComedie.get(j + 1);
                            
                            if (fc2.getRating() > fc1.getRating()) {
                                filmComedie.set(j, fc2);
                                filmComedie.set(j + 1, fc1);
                            }
                        }
                    }
                    textArea.append("Filmele de comedie cu cele mai mari rating-uri: \n");
                    for (FilmComedie fc : filmComedie) {
                        textArea.append(fc.getTitlu() + " : " + fc.getRating() + " stele\n");
                    }

                }     
            });

            frameInformatii.add(panelInformatii);
            frameInformatii.setVisible(true);
        }
    });

    frame.add(panel);
    frame.setVisible(true);
 
    }
}
