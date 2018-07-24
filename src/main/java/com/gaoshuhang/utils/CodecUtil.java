package com.gaoshuhang.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class CodecUtil
{
	/**
	 * 计算字符串SHA256
	 * @param str 字符串
	 * @return 散列值
	 */
	public static String SHA256Encode(String str)
	{
		return DigestUtils.sha256Hex(str);
	}
}
