/**
* @FileName: ApplicationConstant.java
* @Package: xyz.wchy.constant
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: ApplicationConstant.java: 记事本常量-可配置.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月31日 上午16:38:40.
* @Content: 新增.
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
* 记事本常量-可在application.properties中配置其常量具体值.
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
* @Date: 2018年1月31日 上午16:38:40.
* 
*/
public interface ApplicationConstant 
{
	
	/**
	 * 应用配置.
	 */
	Map<String, String> APP_CONFIGS = ApplicationConfigHelper.getInstance().getPropMap();
	
	/**
	 * Frame标题.
	 */
	String FRAME_TITLE = APP_CONFIGS.get("frame.title");
	
	/**
	 * logo图标路径.
	 */
	String FRAME_ICON_PATH = APP_CONFIGS.get("frame.icon.path");
	
	/**
	 * 图标路径：取消显示图标路径.
	 */
	String FRAME_CANCEL_SHOW_PATH = APP_CONFIGS.get("image.cancel.show.path");
	
	/**
	 * 图标路径：取消隐藏图标路径.
	 */
	String FRAME_CANCEL_HIDE_PATH = APP_CONFIGS.get("image.cancel.hide.path");
	
	/**
	 * label标题：用户名.
	 */
	String LABEL_TITLE_USERNAME = APP_CONFIGS.get("label.title.username");
	
	/**
	 * label标题：密码.
	 */
	String LABEL_TITLE_PASSWORD = APP_CONFIGS.get("label.title.password");
	
	/**
	 * label标题：密文.
	 */
	String LABEL_TITLE_SECRET = APP_CONFIGS.get("label.title.secret");
	
	/**
	 * button标题：加密.
	 */
	String BUTTON_TITLE_NEXTBTN = APP_CONFIGS.get("button.title.secret");
	
	/**
	 * 警告提示：action功能未开放警告.
	 */
	String WARN_ACTION_FUN_NOTOPEN = APP_CONFIGS.get("warn.action.fun.notopen");
	
	/**
	 * 警告：用户名不能为空.
	 */
	String WARN_USERNAME_NULL = APP_CONFIGS.get("secretpage.params.verify.err.username");
	
	/**
	 * 警告：密码不能为空.secretpage.params.verify.ok
	 */
	String WARN_PASSWORD_NULL = APP_CONFIGS.get("secretpage.params.verify.err.password");
	
	/**
	 * 校验通过.
	 */
	String VERIFY_OK = APP_CONFIGS.get("secretpage.params.verify.ok");
	
}
