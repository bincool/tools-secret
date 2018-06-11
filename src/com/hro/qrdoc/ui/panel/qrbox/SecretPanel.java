/**
* @FileName: SecretPanel.java
* @Package: com.hro.qrdoc.ui.panel.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SecretPanel.java: 加密Panel.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 上午10:40:17.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.ui.panel.qrbox;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.hro.qrdoc.action.qrbox.SecretBtnAction;
import com.hro.qrdoc.bean.qrbox.SecretPage;
import com.hro.qrdoc.constant.ApplicationConstant;
import com.hro.qrdoc.ui.panel.base.DefaultInputPanel;

/**
* @ClassName: SecretPanel.java
* 
* @Description: 
* <p>
* 加密Panel.
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
* @Date: 2018年6月7日 上午10:40:17.
* 
*/
public class SecretPanel extends JPanel 
{

	/**
	 * 序列版本号.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户名输入框提示标签.
	 */
	private JLabel usernameLabel = new JLabel(ApplicationConstant.LABEL_TITLE_USERNAME);
	
	/**
	 * 用户名输入框.
	 */
	private DefaultInputPanel usernamePanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * 密码输入框提示标签.
	 */
	private JLabel passwordLabel = new JLabel(ApplicationConstant.LABEL_TITLE_PASSWORD);
	
	/**
	 * 密码输入框.
	 */
	private DefaultInputPanel passwordPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * 密文提示标签.
	 */
	private JLabel secretLabel = new JLabel(ApplicationConstant.LABEL_TITLE_SECRET);
	
	/**
	 * 密文输入框.
	 */
	private DefaultInputPanel secretPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * 二维码装箱页面bean.
	 */
	private SecretPage qrBoxPage = new SecretPage();
	
	/**
	 * 加密按钮.
	 */
	private JButton secretBtn = new JButton(ApplicationConstant.BUTTON_TITLE_NEXTBTN);
	
	/**
	 * 无参构造函数.
	 */
	public SecretPanel() 
	{
		initLayout();
		initAction();
	}
	
	/**
	 * 获取usernamePanel.
	 * @return
	 *     usernamePanel.
	 */
	public DefaultInputPanel getUsernamePanel() 
	{
		return usernamePanel;
	}
	
	/**
	 * 获取passwordPanel.
	 * @return
	 *     passwordPanel.
	 */
	public DefaultInputPanel getPasswordPanel() 
	{
		return passwordPanel;
	}
	
	/**
	 * 获取secretPanel.
	 * @return
	 *     secretPanel.
	 */
	public DefaultInputPanel getSecretPanel() 
	{
		return secretPanel;
	}

	/**
	 * 初始化二维码装箱panel.
	 */
	private void initLayout() 
	{
		this.setLayout(null);
		
		// 用户名输入框.
		usernameLabel.setBounds(25, 20, 70, 35);
		usernamePanel.setBounds(80, 20, 300, 35);
		this.add(usernameLabel);
		this.add(usernamePanel);
		
		// 密码输入框.
		passwordLabel.setBounds(25, 60, 70, 35);
		passwordPanel.setBounds(80, 60, 300, 35);
		this.add(passwordLabel);
		this.add(passwordPanel);
		
		// 密文.
		secretLabel.setBounds(25, 100, 70, 35);
		secretPanel.setBounds(80, 100, 300, 35);
		this.add(secretLabel);
		this.add(secretPanel);
		
		// 加密.
		secretBtn.setBounds(180, 150, 80, 30);
		this.add(secretBtn);
	}

	/**
	 * 初始化二维码装箱事件绑定.
	 */
	protected void initAction() 
	{
		qrBoxPage.setUsernamePanel(usernamePanel);
		qrBoxPage.setPasswordPanel(passwordPanel);
		qrBoxPage.setSecretPanel(secretPanel);
		
		// 加密.
		secretBtn.addActionListener(new SecretBtnAction(qrBoxPage));
		
	}
	
}
