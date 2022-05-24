// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTraceAbRequest} extends {@link RequestModel}
 *
 * <p>SubmitTraceAbRequest</p>
 */
public class SubmitTraceAbRequest extends Request {
    @Body
    @NameInMap("CallBack")
    private String callBack;

    @Body
    @NameInMap("CipherBase64ed")
    private String cipherBase64ed;

    @Body
    @NameInMap("Input")
    private String input;

    @Body
    @NameInMap("Level")
    @Validation(required = true)
    private Long level;

    @Body
    @NameInMap("Output")
    @Validation(required = true)
    private String output;

    @Body
    @NameInMap("StartTime")
    private Long startTime;

    @Body
    @NameInMap("TotalTime")
    private Long totalTime;

    @Body
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("UserData")
    private String userData;

    private SubmitTraceAbRequest(Builder builder) {
        super(builder);
        this.callBack = builder.callBack;
        this.cipherBase64ed = builder.cipherBase64ed;
        this.input = builder.input;
        this.level = builder.level;
        this.output = builder.output;
        this.startTime = builder.startTime;
        this.totalTime = builder.totalTime;
        this.url = builder.url;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTraceAbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callBack
     */
    public String getCallBack() {
        return this.callBack;
    }

    /**
     * @return cipherBase64ed
     */
    public String getCipherBase64ed() {
        return this.cipherBase64ed;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return level
     */
    public Long getLevel() {
        return this.level;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalTime
     */
    public Long getTotalTime() {
        return this.totalTime;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitTraceAbRequest, Builder> {
        private String callBack; 
        private String cipherBase64ed; 
        private String input; 
        private Long level; 
        private String output; 
        private Long startTime; 
        private Long totalTime; 
        private String url; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTraceAbRequest request) {
            super(request);
            this.callBack = request.callBack;
            this.cipherBase64ed = request.cipherBase64ed;
            this.input = request.input;
            this.level = request.level;
            this.output = request.output;
            this.startTime = request.startTime;
            this.totalTime = request.totalTime;
            this.url = request.url;
            this.userData = request.userData;
        } 

        /**
         * 任务结果回调
         */
        public Builder callBack(String callBack) {
            this.putBodyParameter("CallBack", callBack);
            this.callBack = callBack;
            return this;
        }

        /**
         * 密钥base64串
         */
        public Builder cipherBase64ed(String cipherBase64ed) {
            this.putBodyParameter("CipherBase64ed", cipherBase64ed);
            this.cipherBase64ed = cipherBase64ed;
            return this;
        }

        /**
         * 溯源水印ab流处理视频输入
         */
        public Builder input(String input) {
            this.putBodyParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * 水印强度
         */
        public Builder level(Long level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * 溯源水印ab流处理输出
         */
        public Builder output(String output) {
            this.putBodyParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * 嵌入水印开始时间
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * 嵌入水印总时长
         */
        public Builder totalTime(Long totalTime) {
            this.putBodyParameter("TotalTime", totalTime);
            this.totalTime = totalTime;
            return this;
        }

        /**
         * 外部url链接(Input和url二选一)
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * 用户自定义数据，最大长度1024个字节
         */
        public Builder userData(String userData) {
            this.putBodyParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitTraceAbRequest build() {
            return new SubmitTraceAbRequest(this);
        } 

    } 

}
