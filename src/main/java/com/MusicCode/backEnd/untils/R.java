package com.MusicCode.backEnd.untils;

import lombok.Data;

/**
 * 返回对象
 */

@Data
public class R {
    // 状态码
    private Integer code;
    // 数据
    private Object data;
    // 信息
    private String msg;
    // 记录数
    private Integer total;
    //令牌
    private String token;
}
