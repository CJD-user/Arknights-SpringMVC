package com.example.arknightsserve.util;


import com.example.arknightsserve.pojo.loginPojo.ReturnIdRes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonData {

    /**
     * 状态码 0 表示成功
     */

    private Integer code;
    /**
     * 数据
     */
    private Object data;
    /**
     * 描述
     */
    private String message;


    /**
     * 成功，不传入数据
     *
     * @return
     */
    public static JsonData buildSuccess() {
        return new JsonData(200, null, "success");
    }

    /**
     * 成功，传入数据
     *
     * @param data
     * @return
     */
    public static JsonData buildSuccess(Object data) {
        return new JsonData(200, data, "success");
    }

    public static JsonData buildSuccessById(Integer data) {
        return new JsonData(200, new ReturnIdRes(data), "success");
    }

    /**
     * 失败，传入描述信息
     *
     * @param msg
     * @return
     */
    public static JsonData buildError(String msg) {
        return new JsonData(-1, null, msg);
    }


    /**
     * 自定义状态码和错误信息
     *
     * @param code
     * @param msg
     * @return
     */
    public static JsonData buildCodeAndMsg(int code, String msg) {
        return new JsonData(code, null, msg);
    }
}