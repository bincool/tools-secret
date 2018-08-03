/**
* @FileName: SecretPage.java
* @Package: com.hro.qrdoc.bean.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SecretPage.java: 加密页面bean.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 下午4:44:30.
* @Content: 新增.
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
* 加密页面bean.
* </p>
* <p>
* 详细描述：加密页面bean.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年6月7日 下午4:44:30.
* 
*/
/**
* @ClassName: QrBoxPage.java
* 
* @Description: 
* <p>
* 一句话对这个类进行描述.
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
* @Date: 2018年6月7日 下午4:49:04.
* 
*/
public class SecretPage implements Serializable
{
	
	/**
	 * 序列版本号.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户名输入框.
	 */
	private DefaultInputPanel usernamePanel;
	
	/**
	 * 密码输入框.
	 */
	private DefaultInputPanel passwordPanel;
	
	/**
	 * 密文.
	 */
	private DefaultInputPanel secretPanel;

	/**
	 * 获取usernamePanel.
	 * @return
	 *     usernamePanel.
	 */
	public String getUsername() 
	{
		return inputValue(usernamePanel);
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
	 * 设置usernamePanel.
	 * @param
	 *     usernamePanel.
	 */
	public void setUsernamePanel(DefaultInputPanel usernamePanel) 
	{
		this.usernamePanel = usernamePanel;
	}

	/**
	 * 获取passwordPanel.
	 * @return
	 *     passwordPanel.
	 */
	public String getPassword() 
	{
		return inputValue(passwordPanel);
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
	 * 设置passwordPanel.
	 * @param
	 *     passwordPanel.
	 */
	public void setPasswordPanel(DefaultInputPanel passwordPanel) 
	{
		this.passwordPanel = passwordPanel;
	}

	/**
	 * 获取secretPanel.
	 * @return
	 *     secretPanel.
	 */
	public String getSecret() 
	{
		return inputValue(secretPanel);
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
	 * 设置secretPanel.
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
	 * 获取DefaultInputPanel中的值.
	 * @param inputPanel
	 * @return
	 */
	private String inputValue(DefaultInputPanel inputPanel) 
	{
		return inputPanel == null ? null : inputPanel.getInputValue();
	}

}
