package bank_view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bank_dao.find;
import bank_dao.xiaohu;
public class XiaoHu extends JFrame{
	String str1,str2;
    public XiaoHu() {
    	  this.setTitle("��ӭ������������");
    	  this.setSize(360, 410);
    	  this.setLocation(500, 300);
    	  BorderLayout bl=new BorderLayout(10,50);
    	     this.setLayout(bl);

    	  JPanel pane1 =new JPanel();
    	  JPanel pane2 = new JPanel();
    	  JPanel pane3 = new JPanel(new GridLayout(1, 1));
    	  pane1.add(new JLabel("�˺�"));
    	  JTextField text_1 = new JTextField(20);
    	  pane1.add(text_1);
    	  pane2.add(new JLabel("����"));
    	  JPasswordField text_2 = new JPasswordField(20);
    	  pane2.add(text_2);
    	  JButton b1 = new JButton("ȷ��");
    	  b1.addActionListener(new ActionListener(){  
              //������ťִ�еķ���  
              public void actionPerformed(ActionEvent e) {  
                   
            	  if(!text_1.getText().trim().equals(""))
              	  {
                  	  str1 = text_1.getText();
              	  }//��ȡ�˺�
                  
            	  if(!text_2.getText().trim().equals(""))
              	  {
                  	  str2 = text_2.getText();//��ȡȡ����
              	  }  //��ȡ���� 
             	  //new back_DM(str1,str2,str3);
             	  
                   try {
                	   if(str1!=null) {
                		   if(find.findId(str1)==1) {
          						if(str2!=null) {
          							if(find.findkey(str1, str2)==1)
             						 {
             								xiaohu.delete(str1);
             								if(find.findId(str1) == 0)
             								{
             									JOptionPane.showMessageDialog(null, "�����ɹ�", "��ʾ",JOptionPane.PLAIN_MESSAGE);
             								}
             								else
             									{
             									JOptionPane.showMessageDialog(null, "����ʧ��", "��ʾ",JOptionPane.PLAIN_MESSAGE);
             									}
             						 }else {
             							 JOptionPane.showMessageDialog(null, "���벻��ȷ", "����",JOptionPane.ERROR_MESSAGE);
             						 }
          						}else {
          							JOptionPane.showMessageDialog(null, "����������", "��ʾ",JOptionPane.PLAIN_MESSAGE);
          						}
      						 }else {
      							JOptionPane.showMessageDialog(null, "�˻�������", "���� ",JOptionPane.WARNING_MESSAGE);
      						 }
                	   }else {
                		   JOptionPane.showMessageDialog(null, "�������˻�", "��ʾ",JOptionPane.PLAIN_MESSAGE);
                	   }
   					
   				} catch (Exception e2) {
   					// TODO Auto-generated catch block
   					e2.printStackTrace();
   				}
              }  
                
          });  
    	  
    	  JButton b2 = new JButton("����");
    	  b2.addActionListener(new ActionListener(){  
              //������ťִ�еķ���  
              public void actionPerformed(ActionEvent e) {  
                  //new Main_View(); 
                  setVisible(false);
              }  
                
          });  
    	  pane3.add(b1);
    	  pane3.add(b2);
    	  this.add(pane1,"North");
    	  this.add(pane2, "Center");
    	  this.add(pane3, "South");
    	  /*Icon bg = new ImageIcon("image3.jpg");
  		// �ѱ���ͼƬ��ʾ��һ����ǩ��
  		JLabel label = new JLabel(bg);
  		//�ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ����������
  		label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
  		//���ͼƬ��frame�ĵڶ���
  		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
  		//��ȡframe�����ϲ����Ϊ�������䱳����ɫ��JPanel������͸���ķ�����
  		JPanel jp=(JPanel)this.getContentPane();
  		jp.setOpaque(false);//����͸��
  		center.setOpaque(false);*/
  		this.setVisible(true);
  		//this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      }
      public static void main(String[] args)
  	{
  		new XiaoHu();
  		
  	}
}
