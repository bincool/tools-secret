/**
* @FileName: SecretBtnAction.java
* @Package: com.hro.qrdoc.action.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SecretBtnAction.java: ���ܰ�ť�¼�.
* @Author wchy����������(891946049).
* @Date 2018��6��11�� ����12:35:47.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.action.qrbox;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import org.apache.shiro.crypto.hash.SimpleHash;

import com.hro.qrdoc.action.base.BaseAction;
import com.hro.qrdoc.bean.qrbox.SecretPage;
import com.hro.qrdoc.constant.ApplicationConstant;
import com.hro.qrdoc.utils.StringUtils;

/**
* @ClassName: SecretBtnAction.java
* 
* @Description: 
* <p>
* ���ܰ�ť�¼�.
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
* @Date: 2018��6��11�� ����12:35:47.
* 
*/
public class SecretBtnAction extends BaseAction 
{
	
	/**
	 * ��ά��װ��ҳ��bean.
	 */
	private SecretPage secretPage;
	
	/**
	 * �û�������У��.
	 */
	private static final String usernameRegex = "^[a-zA-Z0-9]+[a-zA-Z0-9_]*{1,}$";
	
	/**
	 * ��������У��.
	 */
	private static final String passwordRegex = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,}$";
	
	/**
	 * �вι��캯��.
	 * @param qrBoxPage
	 */
	public SecretBtnAction(SecretPage qrBoxPage) 
	{
		this.secretPage = qrBoxPage;
	}
	
	/* (non-Javadoc)
	 * @see com.hro.qrdoc.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String username = secretPage.getUsername();
		String password = secretPage.getPassword();
		
		if (StringUtils.isEmpty(username) || !username.matches(usernameRegex)) 
		{
			JOptionPane.showMessageDialog(null, ApplicationConstant.WARN_USERNAME_NULL, ApplicationConstant.FRAME_TITLE, JOptionPane.WARNING_MESSAGE);
		} 
		else if (StringUtils.isEmpty(password) || !password.matches(passwordRegex)) 
		{
			JOptionPane.showMessageDialog(null, ApplicationConstant.WARN_PASSWORD_NULL, ApplicationConstant.FRAME_TITLE, JOptionPane.WARNING_MESSAGE);
		} 
		else 
		{
			String secret = new SimpleHash("SHA-1", username, password).toString();
			secretPage.getSecretPanel().setInputValue(secret);
		}
		
	}
	
}
