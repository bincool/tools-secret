/**
* @FileName: SecretPanel.java
* @Package: com.hro.qrdoc.ui.panel.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SecretPanel.java: ����Panel.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����10:40:17.
* @Content: ����.
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
* ����Panel.
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
* @Date: 2018��6��7�� ����10:40:17.
* 
*/
public class SecretPanel extends JPanel 
{

	/**
	 * ���а汾��.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * �û����������ʾ��ǩ.
	 */
	private JLabel usernameLabel = new JLabel(ApplicationConstant.LABEL_TITLE_USERNAME);
	
	/**
	 * �û��������.
	 */
	private DefaultInputPanel usernamePanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * �����������ʾ��ǩ.
	 */
	private JLabel passwordLabel = new JLabel(ApplicationConstant.LABEL_TITLE_PASSWORD);
	
	/**
	 * ���������.
	 */
	private DefaultInputPanel passwordPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * ������ʾ��ǩ.
	 */
	private JLabel secretLabel = new JLabel(ApplicationConstant.LABEL_TITLE_SECRET);
	
	/**
	 * ���������.
	 */
	private DefaultInputPanel secretPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * ��ά��װ��ҳ��bean.
	 */
	private SecretPage qrBoxPage = new SecretPage();
	
	/**
	 * ���ܰ�ť.
	 */
	private JButton secretBtn = new JButton(ApplicationConstant.BUTTON_TITLE_NEXTBTN);
	
	/**
	 * �޲ι��캯��.
	 */
	public SecretPanel() 
	{
		initLayout();
		initAction();
	}
	
	/**
	 * ��ȡusernamePanel.
	 * @return
	 *     usernamePanel.
	 */
	public DefaultInputPanel getUsernamePanel() 
	{
		return usernamePanel;
	}
	
	/**
	 * ��ȡpasswordPanel.
	 * @return
	 *     passwordPanel.
	 */
	public DefaultInputPanel getPasswordPanel() 
	{
		return passwordPanel;
	}
	
	/**
	 * ��ȡsecretPanel.
	 * @return
	 *     secretPanel.
	 */
	public DefaultInputPanel getSecretPanel() 
	{
		return secretPanel;
	}

	/**
	 * ��ʼ����ά��װ��panel.
	 */
	private void initLayout() 
	{
		this.setLayout(null);
		
		// �û��������.
		usernameLabel.setBounds(25, 20, 70, 35);
		usernamePanel.setBounds(80, 20, 300, 35);
		this.add(usernameLabel);
		this.add(usernamePanel);
		
		// ���������.
		passwordLabel.setBounds(25, 60, 70, 35);
		passwordPanel.setBounds(80, 60, 300, 35);
		this.add(passwordLabel);
		this.add(passwordPanel);
		
		// ����.
		secretLabel.setBounds(25, 100, 70, 35);
		secretPanel.setBounds(80, 100, 300, 35);
		this.add(secretLabel);
		this.add(secretPanel);
		
		// ����.
		secretBtn.setBounds(180, 150, 80, 30);
		this.add(secretBtn);
	}

	/**
	 * ��ʼ����ά��װ���¼���.
	 */
	protected void initAction() 
	{
		qrBoxPage.setUsernamePanel(usernamePanel);
		qrBoxPage.setPasswordPanel(passwordPanel);
		qrBoxPage.setSecretPanel(secretPanel);
		
		// ����.
		secretBtn.addActionListener(new SecretBtnAction(qrBoxPage));
		
	}
	
}
