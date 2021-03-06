import java.awt.Font;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class GUI extends javax.swing.JFrame {
	ToDoList list = new ToDoList();
	
    /**
     * Constructor that initializes all GUI elements
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        restoreButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        completeButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        inprogressButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("To Do List");

        jLabel6.setText("Due Date");

        jTextField3.setToolTipText("");

        jLabel8.setText("Description");

        jButton8.setText("Add Task");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(89, 89, 89))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add", jPanel2);

        jLabel10.setText("Due Date");

        jLabel11.setText("Priority");

        jLabel12.setText("Description");

        jButton3.setText("Update Task");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Select a Task from the list that you want to modify");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(89, 89, 89))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(35, 35, 35)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modify", jPanel4);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        restoreButton.setText("Restore");
        restoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Status", "Due Date", "Priority"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTable1.setRowHeight(30);
    jTable1.getTableHeader().setReorderingAllowed(false);
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane3.setViewportView(jTable1);
    if (jTable1.getColumnModel().getColumnCount() > 0) {
        jTable1.getColumnModel().getColumn(0).setMinWidth(200);
    }

    completeButton.setText("Set As Complete");
    completeButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            completeButtonActionPerformed(evt);
        }
    });

    deleteButton.setText("Delete");
    deleteButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteButtonActionPerformed(evt);
        }
    });

    reportButton.setText("Save Report");
    reportButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            reportButtonActionPerformed(evt);
        }
    });

    inprogressButton.setText("Set As In Progress");
    inprogressButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            inprogressButtonActionPerformed(evt);
        }
    });

    resetButton.setText("Reset");
    resetButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            resetButtonActionPerformed(evt);
        }
    });

    jLabel3.setText("Select column headers to sort the To Do List");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(11, 11, 11)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 50, Short.MAX_VALUE)
                            .addComponent(inprogressButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(completeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(saveButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(restoreButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(reportButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetButton)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveButton)
                        .addComponent(restoreButton)
                        .addComponent(reportButton)
                        .addComponent(resetButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(completeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inprogressButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)))
            .addContainerGap())
    );

    jTabbedPane1.getAccessibleContext().setAccessibleName("Add");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    jTable1.setAutoCreateRowSorter(true);
    jTabbedPane1.setFont(new Font( "Dialog", Font.BOLD, 16));
    }// </editor-fold>
    
    
    int listSelectedIndex = -1;
    int convertedIndex = -1;
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // "Save" button
    	list.save();
    	updateTable();
    }                                        

    private void restoreButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // "Restore" button
    	list = new ToDoList();
    	list.restore();
    	updateTable();
    }
    
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // "Reset" button
    	int yesnoButton = JOptionPane.YES_NO_OPTION;
    	int result = JOptionPane.showConfirmDialog (jPanel1, "Are you sure you want to reset your To Do List?","Warning",yesnoButton);
    	if(result == JOptionPane.YES_OPTION){
    		list = new ToDoList();
    		updateTable();
    		JOptionPane.showMessageDialog(jPanel1, "Current To Do List has been reset", "Message", JOptionPane.INFORMATION_MESSAGE);
    	}
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // "Update" button
    	boolean error = false;
    	String description = jTextField6.getText();
    	String priority = jTextField1.getText();
    	String dueDate = jTextField2.getText();
    	
    	//Error checking
    	if(convertedIndex == -1) {
    		JOptionPane.showMessageDialog(jTabbedPane1, "Please select a task from the list", "Error", JOptionPane.ERROR_MESSAGE);
    		error = true;
    	}
    	if((!description.equals("")) && (!priority.equals("")) && (!dueDate.equals("")) && !error) {
    		try {
    			Integer.parseInt(priority);
    		}catch (NumberFormatException ex) {
    			//jLabel4.setText("Please input a number for the priority");
    			JOptionPane.showMessageDialog(jTabbedPane1, "Please input a number for the priority", "Error", JOptionPane.ERROR_MESSAGE);
    			error = true;
    		}
    	}
    	else {
    		//jLabel4.setText("Please select a task from the list");
    		JOptionPane.showMessageDialog(jTabbedPane1, "Please select a task from the list", "Error", JOptionPane.ERROR_MESSAGE);
    		error = true;
    	}
    	//If no error, attempt to change list
    	if(!error) {
    		Task newTask = new Task(description, dueDate, Integer.parseInt(priority));
        	if(list.changeTask(newTask, listSelectedIndex)) {
        		jTextField6.setText("");
            	jTextField1.setText("");
            	jTextField2.setText("");
            	newTask.setPriority(Integer.parseInt(priority));
        		updateTable();
            	//jLabel4.setText("Task modified!");
            	JOptionPane.showMessageDialog(jTabbedPane1, "Task Modified!", "Message", JOptionPane.INFORMATION_MESSAGE);
        	}
        	else {
        		//jLabel4.setText("Please enter a unique description");
        		JOptionPane.showMessageDialog(jTabbedPane1, "Please enter a unique description", "Error", JOptionPane.ERROR_MESSAGE);
        	}
    	}
    }                                        

    private void inprogressButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	// "Complete" button
    	if(convertedIndex == -1) {
    		JOptionPane.showMessageDialog(jPanel1, "Please select a task from the list", "Error", JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		Task inprogress = list.getTask(convertedIndex);
    		list.startTask(inprogress);
    		listSelectedIndex = -1;
    	    convertedIndex = -1;
    	    jTextField6.setText("");
        	jTextField1.setText("");
        	jTextField2.setText("");
    		updateTable();
    	}
    }
    
    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // "Complete" button
    	if(convertedIndex == -1) {
    		JOptionPane.showMessageDialog(jPanel1, "Please select a task from the list", "Error", JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		Task complete = list.getTask(convertedIndex);
    		if(list.completeTask(complete)) {
    			listSelectedIndex = -1;
        	    convertedIndex = -1;
        	    jTextField6.setText("");
            	jTextField1.setText("");
            	jTextField2.setText("");
        		updateTable();
    		}
    		else {
    			JOptionPane.showMessageDialog(jPanel1, "Please start the task before completing it", "Error", JOptionPane.ERROR_MESSAGE);
    		}
    		
    	}
    }                                        

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // "Delete" button
    	if(convertedIndex == -1) {
    		JOptionPane.showMessageDialog(jPanel1, "Please select a task from the list", "Error", JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		Task delete = list.getTask(convertedIndex);
    		list.deleteTask(delete);
    		listSelectedIndex = -1;
    	    convertedIndex = -1;
    	    jTextField6.setText("");
        	jTextField1.setText("");
        	jTextField2.setText("");
    		updateTable();
    	}
    }                                        

    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
    	DefaultTableModel model =  (DefaultTableModel) jTable1.getModel();
    	int selectedRowIndex = jTable1.getSelectedRow();
    	convertedIndex = jTable1.convertRowIndexToModel(selectedRowIndex);
    	jTextField6.setText(model.getValueAt(convertedIndex, 0).toString()); //description
    	jTextField1.setText(model.getValueAt(convertedIndex, 3).toString()); //priority
    	jTextField2.setText(model.getValueAt(convertedIndex, 2).toString()); //due date
    	listSelectedIndex = list.getIndexOfTask(jTextField6.getText());
    }
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // "Add" button
    	boolean error = false;
    	String description = jTextField5.getText();
    	//String priority = jTextField4.getText();
    	String dueDate = jTextField3.getText();
    	
    	//Error checking
    	if((!description.equals("")) /*&& (!priority.equals(""))*/ && (!dueDate.equals(""))) {
    		try {
    			Integer.parseInt("1");
    		}catch (NumberFormatException ex) {
    			//jLabel5.setText("Please input a number for the priority");
    			JOptionPane.showMessageDialog(jTabbedPane1, "Please input a number for the priority", "Error", JOptionPane.ERROR_MESSAGE);
    			error = true;
    		}
    	}
    	else {
    		//jLabel5.setText("Please fill in all fields");
    		JOptionPane.showMessageDialog(jTabbedPane1, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
    		error = true;
    	}
    	//If no error, attempt to add to list
    	if(!error) {
    		Task newTask = new Task(description, dueDate, 0);
        	if(list.addTaskToList(newTask)) {
        		jTextField5.setText("");
            	//jTextField4.setText("");
            	jTextField3.setText("");
        		updateTable();
            	//jLabel5.setText("Added!");
            	JOptionPane.showMessageDialog(jTabbedPane1, "Task Added!", "Message", JOptionPane.INFORMATION_MESSAGE);
        	}
        	else {
        		//jLabel5.setText("Please enter a unique description");
        		JOptionPane.showMessageDialog(jTabbedPane1, "Please enter a unique description", "Error", JOptionPane.ERROR_MESSAGE);
        	}
    	}
    	
    	
    }                                        

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // "Save Report" button
    	try {
			list.printReport();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    private void updateTable() {
    	//updates the table display
		ArrayList<Task> currentTasks = list.getCurrentTasks();
    	DefaultTableModel model =  (DefaultTableModel) jTable1.getModel();
    	model.setRowCount(0);
    	Object rowData[] = new Object[4];
    	for(int i=0; i<currentTasks.size(); i++) {
    		rowData[0] = currentTasks.get(i).getDescription();
    		rowData[1] = currentTasks.get(i).getStatus();
    		rowData[2] = currentTasks.get(i).getDueDate();
    		rowData[3] = currentTasks.get(i).getPriority();
    		model.addRow(rowData);
    	}
    }
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton completeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton inprogressButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton restoreButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration                  
}