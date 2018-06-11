/**
* @FileName: SecretPage.java
* @Package: com.hro.qrdoc.bean.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SecretPage.java: ����ҳ��bean.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����4:44:30.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.bean.qrbox;

import java.io.Serializable;

import com.hro.qrdoc.ui.panel.base.DefaultInputPanel;

/**
* @ClassName: SecretPage.java
* 
* @Description: 
* <p>
* ����ҳ��bean.
* </p>
* <p>
* ��ϸ����������ҳ��bean.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��6��7�� ����4:44:30.
* 
*/
/**
* @ClassName: QrBoxPage.java
* 
* @Description: 
* <p>
* һ�仰��������������.
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
* @Date: 2018��6��7�� ����4:49:04.
* 
*/
public class SecretPage implements Serializable
{
	
	/**
	 * ���а汾��.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * �û��������.
	 */
	private DefaultInputPanel usernamePanel;
	
	/**
	 * ���������.
	 */
	private DefaultInputPanel passwordPanel;
	
	/**
	 * ����.
	 */
	private DefaultInputPanel secretPanel;

	/**
	 * ��ȡusernamePanel.
	 * @return
	 *     usernamePanel.
	 */
	public String getUsername() 
	{
		return inputValue(usernamePanel);
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
	 * ����usernamePanel.
	 * @param
	 *     usernamePanel.
	 */
	public void setUsernamePanel(DefaultInputPanel usernamePanel) 
	{
		this.usernamePanel = usernamePanel;
	}

	/**
	 * ��ȡpasswordPanel.
	 * @return
	 *     passwordPanel.
	 */
	public String getPassword() 
	{
		return inputValue(passwordPanel);
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
	 * ����passwordPanel.
	 * @param
	 *     passwordPanel.
	 */
	public void setPasswordPanel(DefaultInputPanel passwordPanel) 
	{
		this.passwordPanel = passwordPanel;
	}

	/**
	 * ��ȡsecretPanel.
	 * @return
	 *     secretPanel.
	 */
	public String getSecret() 
	{
		return inputValue(secretPanel);
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
	 * ����secretPanel.
	 * @param
	 *     secretPanel.
	 */
	public void setSecretPanel(DefaultInputPanel secretPanel) 
	{
		this.secretPanel = secretPanel;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("QrBoxPage [username=");
		sb.append(getUsername());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", secret=");
		sb.append(getSecret());
		sb.append("]");
		return sb.toString();
	}
	
	/**
	 * ��ȡDefaultInputPanel�е�ֵ.
	 * @param inputPanel
	 * @return
	 */
	private String inputValue(DefaultInputPanel inputPanel) 
	{
		return inputPanel == null ? null : inputPanel.getInputValue();
	}

}
