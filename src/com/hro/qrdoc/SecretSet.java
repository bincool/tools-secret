/**
* @FileName: SecretSet.java
* @Package: com.hro.qrdoc
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SecretSet.java: ��ά��װ���ĵ�����.
* @Author wchy����������(891946049).
* @Date 2018��6��1�� ����12:53:24.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc;

import java.awt.EventQueue;

import org.apache.log4j.Logger;

import com.hro.qrdoc.runnable.QrcodeDocRunnable;

/**
* @ClassName: SecretSet.java
* 
* @Description: 
* <p>
* ��ά��װ���ĵ����ɣ�ÿ������������ţ������룬��Ʒ��ά��.
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
* @Date: 2018��6��1�� ����12:53:24.
* 
*/
public class SecretSet 
{

	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(SecretSet.class);
	
	/**
	 * ������. Launch the application.
	 */
	public static void main(String[] args) 
	{
		LOGGER.info("Begin to run the system.");
		QrcodeDocRunnable qrcodeDocRunnable = new QrcodeDocRunnable();
		EventQueue.invokeLater(qrcodeDocRunnable);
		LOGGER.info("End to run the system.");
	}
	
}
