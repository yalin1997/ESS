package ESS;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame extends JFrame{
	
	private Component component;
	private ESS_center ess;
	Frame(){
		setLayout(new BorderLayout(1,1));
		component = new Component();
		component.setSize(450,300);
		actLis actLis = new actLis();
		component.selectFile.addActionListener(actLis);
		component.exportProcedure.addActionListener(actLis);
		add(component);
	}
	
	
	private class actLis implements ActionListener{

		private actLis() {}
		
		public void actionPerformed(ActionEvent e){ // 事件發生的處理動作
			String fileName1 = "select";
			String fileName2 = "export";
			if(e.getSource() == Frame.this.component.selectFile){
				component.callFile();
				component.setFileName(fileName1);
			}
			else if(e.getSource() == Frame.this.component.exportProcedure){
				component.setFileName(fileName2);
			}
		} 	
	}
}
