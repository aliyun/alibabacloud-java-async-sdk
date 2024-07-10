// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTraceAbJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitTraceAbJobRequest</p>
 */
public class SubmitTraceAbJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallBack")
    private String callBack;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CipherBase64ed")
    private String cipherBase64ed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private String input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Output")
    @com.aliyun.core.annotation.Validation(required = true)
    private String output;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalTime")
    private String totalTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitTraceAbJobRequest(Builder builder) {
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

    public static SubmitTraceAbJobRequest create() {
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
    public String getLevel() {
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
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalTime
     */
    public String getTotalTime() {
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

    public static final class Builder extends Request.Builder<SubmitTraceAbJobRequest, Builder> {
        private String callBack; 
        private String cipherBase64ed; 
        private String input; 
        private String level; 
        private String output; 
        private String startTime; 
        private String totalTime; 
        private String url; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTraceAbJobRequest request) {
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
         * CallBack.
         */
        public Builder callBack(String callBack) {
            this.putQueryParameter("CallBack", callBack);
            this.callBack = callBack;
            return this;
        }

        /**
         * CipherBase64ed.
         */
        public Builder cipherBase64ed(String cipherBase64ed) {
            this.putQueryParameter("CipherBase64ed", cipherBase64ed);
            this.cipherBase64ed = cipherBase64ed;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.putQueryParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TotalTime.
         */
        public Builder totalTime(String totalTime) {
            this.putQueryParameter("TotalTime", totalTime);
            this.totalTime = totalTime;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitTraceAbJobRequest build() {
            return new SubmitTraceAbJobRequest(this);
        } 

    } 

}
