package com.Recruitements;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class RecruitmentDetails extends JPanel
{
	private static final long serialVersionUID = 1L;

	public RecruitmentDetails()
	{
		init();
		cmp();
		setBackground(Color.BLUE);
	}

	private void cmp() {
		// TODO Auto-generated method stub
		
	}

	private void init() 
	{
		setPreferredSize(new Dimension(1105, 610));
		BorderLayout border = new BorderLayout();
		border.setHgap(10);
		setLayout(border);
	}
}
