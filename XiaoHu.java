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
    	  this.setTitle("欢迎进入销户界面");
    	  this.setSize(360, 410);
    	  this.setLocation(500, 300);
    	  BorderLayout bl=new BorderLayout(10,50);
    	     this.setLayout(bl);

    	  JPanel pane1 =new JPanel();
    	  JPanel pane2 = new JPanel();
    	  JPanel pane3 = new JPanel(new GridLayout(1, 1));
    	  pane1.add(new JLabel("账号"));
    	  JTextField text_1 = new JTextField(20);
    	  pane1.add(text_1);
    	  pane2.add(new JLabel("密码"));
    	  JPasswordField text_2 = new JPasswordField(20);
    	  pane2.add(text_2);
    	  JButton b1 = new JButton("确认");
    	  b1.addActionListener(new ActionListener(){  
              //单击按钮执行的方法  
              public void actionPerformed(ActionEvent e) {  
                   
            	  if(!text_1.getText().trim().equals(""))
              	  {
                  	  str1 = text_1.getText();
              	  }//获取账号
                  
            	  if(!text_2.getText().trim().equals(""))
              	  {
                  	  str2 = text_2.getText();//获取取款金额
              	  }  //获取密码 
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
             									JOptionPane.showMessageDialog(null, "销户成功", "提示",JOptionPane.PLAIN_MESSAGE);
             								}
             								else
             									{
             									JOptionPane.showMessageDialog(null, "销户失败", "提示",JOptionPane.PLAIN_MESSAGE);
             									}
             						 }else {
             							 JOptionPane.showMessageDialog(null, "密码不正确", "警告",JOptionPane.ERROR_MESSAGE);
             						 }
          						}else {
          							JOptionPane.showMessageDialog(null, "请输入密码", "提示",JOptionPane.PLAIN_MESSAGE);
          						}
      						 }else {
      							JOptionPane.showMessageDialog(null, "账户不存在", "警告 ",JOptionPane.WARNING_MESSAGE);
      						 }
                	   }else {
                		   JOptionPane.showMessageDialog(null, "请输入账户", "提示",JOptionPane.PLAIN_MESSAGE);
                	   }
   					
   				} catch (Exception e2) {
   					// TODO Auto-generated catch block
   					e2.printStackTrace();
   				}
              }  
                
          });  
    	  
    	  JButton b2 = new JButton("返回");
    	  b2.addActionListener(new ActionListener(){  
              //单击按钮执行的方法  
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
  		// 把背景图片显示在一个标签里
  		JLabel label = new JLabel(bg);
  		//把标签的大小位置设置为图片刚好填充整个面
  		label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
  		//添加图片到frame的第二层
  		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
  		//获取frame的最上层面板为了设置其背景颜色（JPanel有设置透明的方法）
  		JPanel jp=(JPanel)this.getContentPane();
  		jp.setOpaque(false);//设置透明
  		center.setOpaque(false);*/
  		this.setVisible(true);
  		//this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      }
      public static void main(String[] args)
  	{
  		new XiaoHu();
  		
  	}
}
