/**
* @FileName: SecretFrame.java
* @Package: com.hro.qrdoc.ui
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SecretFrame.java: ����Frame.
* @Author wchy����������(891946049).
* @Date 2018��6��4�� ����12:47:25.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import org.apache.log4j.Logger;
import com.hro.qrdoc.constant.ApplicationConstant;
import com.hro.qrdoc.ui.panel.qrbox.SecretPanel;


/**
* @ClassName: SecretFrame.java
* 
* @Description: 
* <p>
* ����Frame.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��6��4�� ����12:47:25.
* 
*/
public class SecretFrame 
{
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(SecretFrame.class);

	/**
	 * ������.
	 */
	private JFrame frame;
	
	/**
	 * ��Ļγ��.
	 */
	private Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	
	/**
	 * �޲ι��캯��.
	 */
	public SecretFrame() 
	{
		LOGGER.info("Begin to init the main frame.");
		initialize();
		LOGGER.info("End to init the main frame.");
	}
	
	/**
	 * ��ȡframe.
	 * @return
	 *     frame.
	 */
	public JFrame getFrame() 
	{
		return frame;
	}

	/**
	 * ����frame.
	 * @param
	 *     frame.
	 */
	public void setFrame(JFrame frame) 
	{
		this.frame = frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		// ������.
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ApplicationConstant.FRAME_ICON_PATH));
		frame.setTitle(ApplicationConstant.FRAME_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int width = (int)((dimension.getWidth() - 410) / 2);
		int height = (int)((dimension.getHeight() - 220) / 2);
		frame.setBounds(width, height, 410, 220);
		frame.setLayout(new BorderLayout());
		
		SecretPanel qrBoxPanel = new SecretPanel();
		frame.add(qrBoxPanel, BorderLayout.CENTER);
		
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
}
