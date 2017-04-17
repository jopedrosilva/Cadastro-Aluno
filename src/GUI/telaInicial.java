package GUI;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.dadosPessoais;

public class telaInicial extends javax.swing.JFrame {
    ArrayList <dadosPessoais> d = new ArrayList <> ();
    File arquivo = new File("jp.txt");
    int ind, contClick = 0;
    public telaInicial() {
        initComponents(); 
        nomeAtualizar.enable(false);
        matriculaAtualizar.enable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeCadastrar = new javax.swing.JTextField();
        matriculaCadastrar = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomePesquisar = new javax.swing.JTextField();
        matriculaPesquisar = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        procurarRemover = new javax.swing.JTextField();
        procurar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        indice = new javax.swing.JTextField();
        remover = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        NMAtualizar = new javax.swing.JTextField();
        nomeAtualizar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pesquisarAtualizar = new javax.swing.JButton();
        Atualizar2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        matriculaAtualizar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListarTodos = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Pessoal");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(200, 186, 186));
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(200, 186, 186));

        jLabel1.setText("Nome:");

        jLabel2.setText("Matrícula:");

        nomeCadastrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeCadastrarFocusGained(evt);
            }
        });
        nomeCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCadastrarActionPerformed(evt);
            }
        });

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/if.jpeg"))); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCadastrar)
                            .addComponent(matriculaCadastrar))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculaCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(200, 186, 186));

        jLabel3.setText("Nome:");

        jLabel4.setText("Matrícula:");

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/P2.jpeg"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 109, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(matriculaPesquisar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomePesquisar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculaPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisar)
                    .addComponent(jLabel11))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pesquisar", jPanel2);

        jPanel3.setBackground(new java.awt.Color(200, 186, 186));

        jLabel5.setText("Procurar por Nome ou Matrícula");

        procurar.setText("Procurar");
        procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarActionPerformed(evt);
            }
        });

        jLabel6.setText("Índice:");

        indice.setEditable(false);

        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/P4.jpeg"))); // NOI18N
        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(procurar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(procurarRemover)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(procurarRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(procurar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(indice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remover)))
                    .addComponent(jLabel12))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Remover", jPanel3);

        jPanel4.setBackground(new java.awt.Color(200, 186, 186));

        jLabel9.setText("Pesquise por Nome ou Matrícula:");

        pesquisarAtualizar.setText("Pesuisar");
        pesquisarAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarAtualizarActionPerformed(evt);
            }
        });

        Atualizar2.setText("Atualizar");
        Atualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atualizar2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Atualize o Nome:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/P5.jpeg"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel13.setText("Aualize a Matrícula");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NMAtualizar)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeAtualizar)
                                    .addComponent(matriculaAtualizar)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Atualizar2)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pesquisarAtualizar)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NMAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarAtualizar)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(nomeAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matriculaAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Atualizar2))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Atualizar", jPanel4);

        ListarTodos.setEditable(false);
        ListarTodos.setColumns(20);
        ListarTodos.setRows(5);
        jScrollPane3.setViewportView(ListarTodos);

        jButton1.setText("Listar Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Autor:  João Pedro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void colocarNoArray() throws IOException{
        d = new ArrayList <> ();
        String pegouArquivo = pegarTexto(arquivo.getAbsolutePath());
        String partes[] = pegouArquivo.split("\n");
        for (int i = 0; i < partes.length; i++) {
            if(i%2 != 0){
               dadosPessoais dop = new dadosPessoais(partes[i-1], partes[i]);
               d.add(dop); 
            }
        }
    }
    
    public String pegarTexto(String caminho) throws IOException{
        String textodoArquivo = "";
        String porLinha = "";
        BufferedReader in = new BufferedReader(new FileReader(caminho));
        while ((porLinha = in.readLine()) != null){
            textodoArquivo += porLinha + "\n";
        }
        in.close();;
        return textodoArquivo;
    }
    
    public void Escrever(String nome, String matricula) throws IOException{                  
        String tex = pegarTexto(arquivo.getAbsolutePath());
        PrintWriter pw = new PrintWriter(arquivo);
        pw.write(tex+nome+"\n"+matricula);
        pw.close();
    }
    
    public void erro(){
        JOptionPane.showMessageDialog(null, 
            "Preencha todos os campos!",
            "Erro",
            JOptionPane.ERROR_MESSAGE);
    }
    
    public void reescreverArquivo() throws FileNotFoundException, IOException{
        String text = "";
        PrintWriter pw = new PrintWriter(arquivo);
        for (int i = 0; i < d.size(); i++) {
           text += d.get(i).getNome()+"\n"+d.get(i).getMatricula()+"\n";           
        }
        pw.write(text);
        pw.close();
    }
    
    public void tratarExceptionColocarNoArray(){
        try {
            colocarNoArray();
        } catch (IOException ex) {
            Logger.getLogger(telaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tratarExceptionReescrever(){
        try {
            reescreverArquivo();
        } catch (IOException ex) {
            Logger.getLogger(telaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void nomeCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCadastrarActionPerformed
    }//GEN-LAST:event_nomeCadastrarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        tratarExceptionColocarNoArray();
        int verif = 0;
        for (int i = 0; i < d.size(); i++) {
            if((nomeCadastrar.getText().equalsIgnoreCase(d.get(i).getNome())||matriculaCadastrar.getText().equalsIgnoreCase(d.get(i).getMatricula()))){
                JOptionPane.showMessageDialog(null,
                    "O Nome ou Matrícula digitados já está"+"\n"+""
                    +" cadastrado. Cadastre o seu nome completo,"
                    +"\n"+" tente uma matrícula diferente ou atualize"+"\n"+
                    " as informações que já se encontram cadastradas!",
                    "erro",
                    JOptionPane.ERROR_MESSAGE);
                    verif = 1;
                    nomeCadastrar.setText("");
                    matriculaCadastrar.setText("");
                    break;
            }         
        }
        if (verif == 0 && (nomeCadastrar.getText().equalsIgnoreCase("") || matriculaCadastrar.getText().equalsIgnoreCase(""))){
            erro();
        }else{
            if(verif == 0){
                try {
                    Escrever(nomeCadastrar.getText(),matriculaCadastrar.getText());
                } catch (IOException ex) {
                    Logger.getLogger(telaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
                nomeCadastrar.setText("");
                matriculaCadastrar.setText("");
                JOptionPane.showMessageDialog(null, 
                        "Cadastrado com sucesso!");
            }
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        tratarExceptionColocarNoArray();
        ListarTodos.setText("");
        if (nomePesquisar.getText().equalsIgnoreCase("")&&matriculaPesquisar.getText().equalsIgnoreCase("")){
            erro(); 
        }
        int cont = 0;
        for (int i = 0; i < d.size(); i++) {
            if (nomePesquisar.getText().equalsIgnoreCase(d.get(i).getNome())||matriculaPesquisar.getText().equalsIgnoreCase(d.get(i).getMatricula())) {
                ListarTodos.setText(ListarTodos.getText()+"Resultado de Pesquisa:"+"\n"+"\n"
                +"Cadastrado ("+(i+1)+"):"+"\n"+
                "Nome: "+d.get(i).getNome()+"\n"+
                "Matrícula: "+d.get(i).getMatricula()+"\n");
                cont += 1;
            }
        }
        if (cont == 0) {
            ListarTodos.setText("Nenhum resultado encontrado!");
        }
        nomePesquisar.setText("");
        matriculaPesquisar.setText("");
    }//GEN-LAST:event_pesquisarActionPerformed

    private void procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarActionPerformed
        tratarExceptionColocarNoArray();
        ListarTodos.setText("");
        int verif = 0;
        for (int i = 0; i < d.size(); i++) {
            if(procurarRemover.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "   Campo procurar vazio!"+"\n"+
                    "Preencha-o e tente novamente!","erro",
                    JOptionPane.ERROR_MESSAGE);
                    verif = 1;
                    indice.setText("");
                    break;
            }
            if (procurarRemover.getText().equalsIgnoreCase(d.get(i).getNome())||procurarRemover.getText().equalsIgnoreCase(d.get(i).getMatricula())){
                ListarTodos.setText(ListarTodos.getText()+"Resultado da Pesquisa para Remover:"+"\n"+"\n"
                    +"Índice: "+i+"\n"+
                    "Nome: "+d.get(i).getNome()+"\n"+
                    "Matrícula: "+d.get(i).getMatricula()+"\n");
                    indice.setText(""+i);
                    verif = 1;
            }
        }
        if(verif == 0){
            JOptionPane.showMessageDialog(null, "Nenhum resultado Encontrado!",
                "erro", JOptionPane.ERROR_MESSAGE);
                indice.setText("");
        }
        procurarRemover.setText("");
    }//GEN-LAST:event_procurarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        tratarExceptionColocarNoArray();
        if((indice.getText().equalsIgnoreCase("")||indice.getText() == null)||((Integer.parseInt(indice.getText()) > d.size())||(Integer.parseInt(indice.getText()))< 0)){
            JOptionPane.showMessageDialog(null, 
                "Índice inválido!",
                "erro", 
                JOptionPane.ERROR_MESSAGE);
            indice.setText("");
        } else {
            d.remove(Integer.parseInt(indice.getText()));
            procurarRemover.setText("");
            indice.setText("");
            JOptionPane.showMessageDialog(null,
                " Removido com sucesso!",
                "erro",
                JOptionPane.INFORMATION_MESSAGE);
            tratarExceptionReescrever();
        }
    }//GEN-LAST:event_removerActionPerformed

    private void pesquisarAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarAtualizarActionPerformed
        tratarExceptionColocarNoArray();
        ListarTodos.setText("");
        int verif = 0;
        if(NMAtualizar.getText().equalsIgnoreCase("")||NMAtualizar.getText() == null){
            JOptionPane.showMessageDialog(null,
                "O campo perquisar está vazio!",
                "erro",
                JOptionPane.ERROR_MESSAGE);
                verif = 1;
        }
        for (int i = 0; i < d.size(); i++) {
            if (NMAtualizar.getText().equalsIgnoreCase(d.get(i).getNome()) || NMAtualizar.getText().equalsIgnoreCase(d.get(i).getMatricula())) {
                nomeAtualizar.setText(d.get(i).getNome());
                matriculaAtualizar.setText(d.get(i).getMatricula());
                nomeAtualizar.enable(true);
                matriculaAtualizar.enable(true);
                ind = i;
                ListarTodos.setText(ListarTodos.getText()+"Resultado de Pesquisa para Atualizar:"+"\n"+"\n"
                    +"Índice: "+i+"\n"+
                    "Nome: "+d.get(i).getNome()+"\n"+
                    "Matrícula: "+d.get(i).getMatricula()+"\n");
                verif = 1;
            }
        }
        if(verif == 0){
            JOptionPane.showMessageDialog(null,
                "Resultado não encontrado!",
                "erro",
                JOptionPane.ERROR_MESSAGE);
        }
        NMAtualizar.setText("");
    }//GEN-LAST:event_pesquisarAtualizarActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void Atualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atualizar2ActionPerformed
        int contador = 0;
        if(nomeAtualizar.getText().equalsIgnoreCase("")||matriculaAtualizar.getText().equalsIgnoreCase("")){
            erro();
            contador = 1;
        } else {
            for (int i = 0; i < d.size(); i++) {
                if (d.get(i).getNome().equalsIgnoreCase(nomeAtualizar.getText()) && d.get(i).getMatricula().equalsIgnoreCase(matriculaAtualizar.getText())) {
                    JOptionPane.showMessageDialog(null, "Nenhuma mudança feita no aluno cadastrado!");
                    contador = 1;
                    nomeAtualizar.setText("");
                    matriculaAtualizar.setText("");
                    nomeAtualizar.enable(false);
                    matriculaAtualizar.enable(false);
                    break;
                }
                else {
                    if (d.get(i).getNome().equalsIgnoreCase(nomeAtualizar.getText()) || d.get(i).getMatricula().equalsIgnoreCase(matriculaAtualizar.getText())){
                        JOptionPane.showMessageDialog(null, "Esse número ou matrícula já está Cadastrado!",
                            "Tente novamente!", JOptionPane.ERROR_MESSAGE);
                            contador = 1;
                            nomeAtualizar.setText("");
                            matriculaAtualizar.setText("");
                            nomeAtualizar.enable(false);
                            matriculaAtualizar.enable(false);
                            break;
                    }
                    
                }
            }
        }
        if(contador == 0){
            d.get(ind).setNome(nomeAtualizar.getText());
            d.get(ind).setMatricula(matriculaAtualizar.getText());
            ListarTodos.setText("Atualizado!"+"\n"+"\n"+
                "Nome: "+d.get(ind).getNome()+"\n"+
                "Matrícula: "+d.get(ind).getMatricula());
            ind = 0;
            nomeAtualizar.setText("");
            matriculaAtualizar.setText("");
            nomeAtualizar.enable(false);
            matriculaAtualizar.enable(false);
            JOptionPane.showMessageDialog(null, "Atualizado Com Sucesso!");
        }
        tratarExceptionReescrever();
    }//GEN-LAST:event_Atualizar2ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
    }//GEN-LAST:event_formFocusGained

    private void nomeCadastrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeCadastrarFocusGained
    }//GEN-LAST:event_nomeCadastrarFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tratarExceptionColocarNoArray();
        ListarTodos.setText("");
        for (int i = 0; i < d.size(); i++) {
            ListarTodos.setText(ListarTodos.getText()
            +"Índice: "+i+"\n"+
            "Nome: "+d.get(i).getNome()+"\n"+
            "Matrícula: "+d.get(i).getMatricula()+"\n"+"\n");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizar2;
    private javax.swing.JTextArea ListarTodos;
    private javax.swing.JTextField NMAtualizar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField indice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField matriculaAtualizar;
    private javax.swing.JTextField matriculaCadastrar;
    private javax.swing.JTextField matriculaPesquisar;
    private javax.swing.JTextField nomeAtualizar;
    private javax.swing.JTextField nomeCadastrar;
    private javax.swing.JTextField nomePesquisar;
    private javax.swing.JButton pesquisar;
    private javax.swing.JButton pesquisarAtualizar;
    private javax.swing.JButton procurar;
    private javax.swing.JTextField procurarRemover;
    private javax.swing.JButton remover;
    // End of variables declaration//GEN-END:variables
}