package com.sxgnhs.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @auther x
 * @date 2020/5/25下午6:43
 */
@Data
@Accessors(chain = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class  BaseRemoteApiResult implements Serializable {

    private String message = ApiCode.SUCCESS.getMessage();
    @Builder.Default
    private int code = ApiCode.SUCCESS.getCode();

    public boolean isSuccess() {
        return code == ApiCode.SUCCESS.getCode();
    }

//    /**
//     * 响应码
//     */
//    @Builder.Default
//    private int code = ApiCode.SUCCESS.getCode();
//
//    /**
//     * 是否成功
//     */
//    private boolean success ;
//
//    /**
//     * 响应消息
//     */
//    private String message = ApiCode.SUCCESS.getMessage();
//
//    /**
//     * 响应时间
//     */
//    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    private LocalDateTime time;
//
//    public BaseRemoteApiResult(){
//        time = LocalDateTime.now();
//    }
//
//    public static BaseRemoteApiResult result(ApiCode apiCode, String message){
//        boolean success = false;
//        if (apiCode.getCode() == ApiCode.SUCCESS.getCode()) {
//            success = true;
//        }
//        String apiMessage = apiCode.getMessage();
//        if (StringUtils.isBlank(message)){
//            message = apiMessage;
//        }
//        return  BaseRemoteApiResult.builder()
//                .code(apiCode.getCode())
//                .message(message)
//                .success(success)
//                .time(LocalDateTime.now())
//                .build();
//
//    }
//
//    public static BaseRemoteApiResult result (ApiCode apiCode){
//        return result(apiCode, null);
//    }
//
//    public static BaseRemoteApiResult ok(String message) {
//        return result(ApiCode.SUCCESS, message);
//    }
//    public static BaseRemoteApiResult ok() {
//        return ok(ApiCode.SUCCESS.getMessage());
//    }
//
//    public static BaseRemoteApiResult fail(ApiCode apiCode,String message){
//        return result(apiCode, message);
//    }
//    public static BaseRemoteApiResult fail(String message){
//        return fail(ApiCode.FAIL, message);
//    }
//    public static BaseRemoteApiResult fail(){
//       return fail(ApiCode.FAIL.getMessage());
//    }

}
