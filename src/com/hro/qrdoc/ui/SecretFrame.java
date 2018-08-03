/**
* @FileName: SecretFrame.java
* @Package: com.hro.qrdoc.ui
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SecretFrame.java: 加密Frame.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月4日 下午12:47:25.
* @Content: 新增.
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
* 加密Frame.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年6月4日 下午12:47:25.
* 
*/
public class SecretFrame 
{
	
	/**
	 * 日志对象.
	 */
	private static final Logger LOGGER = Logger.getLogger(SecretFrame.class);

	/**
	 * 主窗体.
	 */
	private JFrame frame;
	
	/**
	 * 屏幕纬度.
	 */
	private Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	
	/**
	 * 无参构造函数.
	 */
	public SecretFrame() 
	{
		LOGGER.info("Begin to init the main frame.");
		initialize();
		LOGGER.info("End to init the main frame.");
	}
	
	/**
	 * 获取frame.
	 * @return
	 *     frame.
	 */
	public JFrame getFrame() 
	{
		return frame;
	}

	/**
	 * 设置frame.
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
		// 主窗体.
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
