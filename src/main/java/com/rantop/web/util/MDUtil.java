/**
* <p>Copyright @ 2009 深圳市朗拓科技发展有限公司</p>
* <p>All right reserved. </p>
*
* <p>JDK使用版本号		： jdk1.6 </P>
* <p>描述				： </p>
* @版本					： 1.0.0 
* @author				： yeziran
*
* <p>修改历史 </p>
*
* <p>修改时间            修改人员    修改内容 </p>
*  <p>2009-5-15			yeziran	  新建    </p>
*/
package com.rantop.web.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class MDUtil {
	private final static String HEX_NUMS_STR = "0123456789ABCDEF";
	private final static int SALT_LENGTH = 12;

	/**
	 * 将16进制字符串转换成数组
	 * 
	 * @return byte[]
	 * @author ran
	 * */
	public static byte[] hexStringTOByte(String hex) {
		int len = (hex.length() / 2);
		byte[] result = new byte[len];
		char[] hexChars = hex.toCharArray();
		for (int i = 0; i < len; i++) {
			int pos = i * 2;
			result[i] = (byte) (HEX_NUMS_STR.indexOf(hexChars[pos]) << 4 | HEX_NUMS_STR
					.indexOf(hexChars[pos + 1]));
		}
		return result;
	}
	
	/**
	 * 将数组转换成16进制字符串
	 * 
	 * @return String
	 * @author ran
	 *
	 * */
	public static String byteToHexString(byte[] salt){
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < salt.length; i++) {
			String hex = Integer.toHexString(salt[i] & 0xFF);
			if(hex.length() == 1){
				hex = '0' + hex;
			}
			hexString.append(hex.toUpperCase());
		}
		return hexString.toString();
		
	}
	/**
	 * @throws NoSuchAlgorithmException 
	 * @throws UnsupportedEncodingException 
	 * 
	 * @return boolean
	 * @author ran
	 * 
	 * */
	public static boolean validPasswd(String passwd, String dbPasswd)
	throws NoSuchAlgorithmException, UnsupportedEncodingException{
		byte[] pwIndb =  hexStringTOByte(dbPasswd);
		//定义salt
		byte[] salt = new byte[SALT_LENGTH];
		System.arraycopy(pwIndb, 0, salt, 0, SALT_LENGTH);
		//创建消息摘要对象
		MessageDigest md = MessageDigest.getInstance("MD5");
		//将盐数据传入消息摘要对象
		md.update(salt);
		md.update(passwd.getBytes("UTF-8"));
		byte[] digest = md.digest();
		//声明一个对象接收数据库中的口令消息摘要
		byte[] digestIndb = new byte[pwIndb.length - SALT_LENGTH];
		//获得数据库中口令的摘要
		System.arraycopy(pwIndb, SALT_LENGTH, digestIndb, 0,digestIndb.length);
		//比较根据输入口令生成的消息摘要和数据库中的口令摘要是否相同
		if(Arrays.equals(digest, digestIndb)){
			//口令匹配相同
			return true;
		}else{
			return false;
		}
	}
	
	public static String getEncryptedPwd(String passwd)
	throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//拿到一个随机数组，作为盐
		byte[] pwd = null;
		SecureRandom sc= new SecureRandom();
		byte[] salt = new byte[SALT_LENGTH];
		sc.nextBytes(salt);
		
		//声明摘要对象，并生成
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(salt);
		md.update(passwd.getBytes("UTF-8"));
		byte[] digest = md.digest();
		
		pwd = new byte[salt.length + digest.length];
		System.arraycopy(salt, 0, pwd, 0, SALT_LENGTH);
		System.arraycopy(digest, 0, pwd, SALT_LENGTH, digest.length);
		return byteToHexString(pwd);
		
	}
	
	/**
	 * 简单md5加密，不加盐
	 *
	 * @param str
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 * @author yeziran
	 * 2013-12-4
	 */
	public static String digest(String str) 
		throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//声明摘要对象，并生成
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(str.getBytes("UTF-8"));
		byte[] digest = md.digest();
		
		return byteToHexString(digest);
	}
	
	
	public static void main(String[] args) {
		try {
			String pwd = getEncryptedPwd("admin");
			boolean result = validPasswd("admin",pwd);
			if(result){
				System.out.println("登录成功");
			}else{
				System.out.println("密码错误");
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
