/**
* @FileName: ApplicationConstant.java
* @Package: xyz.wchy.constant
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: ApplicationConstant.java: ���±�����-������.
* @Author wchy����������(891946049).
* @Date 2018��1��31�� ����16:38:40.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.constant;

import java.util.Map;

import com.hro.qrdoc.utils.ApplicationConfigHelper;

/**
* @ClassName: ApplicationConstant.java
* 
* @Description: 
* <p>
* ���±�����-����application.properties�������䳣������ֵ.
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
* @Date: 2018��1��31�� ����16:38:40.
* 
*/
public interface ApplicationConstant 
{
	
	/**
	 * Ӧ������.
	 */
	Map<String, String> APP_CONFIGS = ApplicationConfigHelper.getInstance().getPropMap();
	
	/**
	 * Frame����.
	 */
	String FRAME_TITLE = APP_CONFIGS.get("frame.title");
	
	/**
	 * logoͼ��·��.
	 */
	String FRAME_ICON_PATH = APP_CONFIGS.get("frame.icon.path");
	
	/**
	 * ͼ��·����ȡ����ʾͼ��·��.
	 */
	String FRAME_CANCEL_SHOW_PATH = APP_CONFIGS.get("image.cancel.show.path");
	
	/**
	 * ͼ��·����ȡ������ͼ��·��.
	 */
	String FRAME_CANCEL_HIDE_PATH = APP_CONFIGS.get("image.cancel.hide.path");
	
	/**
	 * label���⣺�û���.
	 */
	String LABEL_TITLE_USERNAME = APP_CONFIGS.get("label.title.username");
	
	/**
	 * label���⣺����.
	 */
	String LABEL_TITLE_PASSWORD = APP_CONFIGS.get("label.title.password");
	
	/**
	 * label���⣺����.
	 */
	String LABEL_TITLE_SECRET = APP_CONFIGS.get("label.title.secret");
	
	/**
	 * button���⣺����.
	 */
	String BUTTON_TITLE_NEXTBTN = APP_CONFIGS.get("button.title.secret");
	
	/**
	 * ������ʾ��action����δ���ž���.
	 */
	String WARN_ACTION_FUN_NOTOPEN = APP_CONFIGS.get("warn.action.fun.notopen");
	
	/**
	 * ���棺�û�������Ϊ��.
	 */
	String WARN_USERNAME_NULL = APP_CONFIGS.get("secretpage.params.verify.err.username");
	
	/**
	 * ���棺���벻��Ϊ��.secretpage.params.verify.ok
	 */
	String WARN_PASSWORD_NULL = APP_CONFIGS.get("secretpage.params.verify.err.password");
	
	/**
	 * У��ͨ��.
	 */
	String VERIFY_OK = APP_CONFIGS.get("secretpage.params.verify.ok");
	
}
