/*基于捂脸猫FaceCat框架 v1.0 https://github.com/FaceCat007/facecat.git
 1.创始人-矿洞程序员-上海卷卷猫信息技术有限公司-脉脉KOL-陶德 (微信号:suade1984);
 2.联合创始人-上海卷卷猫信息技术有限公司-周淋霞;
 3.该程序不开源，需要得到授权才能使用。
 */

package ctp;

import java.io.*;
import java.util.*;
import java.util.zip.*;

public class FCStrEx {
	/**
	 * 字符串转换为浮点型
	 * 
	 * @param str
	 *            字符串
	 * @return 数值
	 */
	public static double ConvertStrToDouble(String str) {
		return Double.parseDouble(str);
	}

	/**
	 * 字符串转换为整形
	 * 
	 * @param str
	 *            字符串
	 * @return 数值
	 */
	public static int ConvertStrToInt(String str) {
		return Integer.parseInt(str);
	}

	/**
	 * 将流转换成map {@link} "function◎addUser&username◎aa&pwd◎dd"
	 * 
	 * @param bytes
	 * @return
	 */
	public static Map<String, String> ConvertByteArrayToString(byte[] bytes) {
		Map<String, String> retMap = new HashMap<String, String>();
		if (bytes == null) {
			return retMap;
		}
		try {
			String tempString = new String(bytes, "GBK");
			String[] arr = tempString.split("&");
			for (int i = 0; i < arr.length; i++) {
				String[] car = arr[i].split("◎");
				String value = "";
				try {
					value = car[1];
				} catch (Exception e) {
					// 键对应的value为空
				}
				retMap.put(car[0], value);
			}
		} catch (Exception e) {
			// 编码格式错误
		}
		return retMap;
	}
}
