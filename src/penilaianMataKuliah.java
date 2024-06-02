import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class penilaianMataKuliah extends JFrame {

    private JTextField txtNama, txtNIM, txtMataKuliah, txtNilai;
    private JTextArea txtHasil;

    public penilaianMataKuliah() {
        setTitle("Aplikasi Penilaian Mata Kuliah");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNama = new JLabel("Nama:");
        lblNama.setBounds(10, 10, 100, 25);
        add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(120, 10, 250, 25);
        add(txtNama);

        JLabel lblNIM = new JLabel("NIM:");
        lblNIM.setBounds(10, 45, 100, 25);
        add(lblNIM);

        txtNIM = new JTextField();
        txtNIM.setBounds(120, 45, 250, 25);
        add(txtNIM);

        JLabel lblMataKuliah = new JLabel("Mata Kuliah:");
        lblMataKuliah.setBounds(10, 80, 100, 25);
        add(lblMataKuliah);

        txtMataKuliah = new JTextField();
        txtMataKuliah.setBounds(120, 80, 250, 25);
        add(txtMataKuliah);

        JLabel lblNilai = new JLabel("Nilai:");
        lblNilai.setBounds(10, 115, 100, 25);
        add(lblNilai);

        txtNilai = new JTextField();
        txtNilai.setBounds(120, 115, 250, 25);
        add(txtNilai);

        JButton btnHitung = new JButton("Hitung");
        btnHitung.setBounds(10, 150, 100, 25);
        add(btnHitung);

        JButton btnKeluar = new JButton("Keluar");
        btnKeluar.setBounds(120, 150, 100, 25);
        add(btnKeluar);

        txtHasil = new JTextArea();
        txtHasil.setBounds(10, 185, 360, 75);
        add(txtHasil);

        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungNilai();
            }
        });

        btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void hitungNilai() {
        String nama = txtNama.getText();
        String nim = txtNIM.getText();
        String mataKuliah = txtMataKuliah.getText();
        double nilai = Double.parseDouble(txtNilai.getText());

        String hasil = "Nama: " + nama + "\nNIM: " + nim + "\nMata Kuliah: " + mataKuliah + "\nNilai: " + nilai + "\n";
        if (nilai >= 80) {
            hasil += "Grade: A";
        } else if (nilai >= 70) {
            hasil += "Grade: B";
        } else if (nilai >= 60) {
            hasil += "Grade: C";
        } else if (nilai >= 50) {
            hasil += "Grade: D";
        } else {
            hasil += "Grade: E";
        }

        txtHasil.setText(hasil);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new penilaianMataKuliah().setVisible(true);
            }
        });
    }
}