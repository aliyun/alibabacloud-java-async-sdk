// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushNoticeToiOSRequest} extends {@link RequestModel}
 *
 * <p>PushNoticeToiOSRequest</p>
 */
public class PushNoticeToiOSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApnsEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apnsEnv;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    @com.aliyun.core.annotation.Validation(required = true)
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtParameters")
    private String extParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobKey")
    private String jobKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true)
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private PushNoticeToiOSRequest(Builder builder) {
        super(builder);
        this.apnsEnv = builder.apnsEnv;
        this.appKey = builder.appKey;
        this.body = builder.body;
        this.extParameters = builder.extParameters;
        this.jobKey = builder.jobKey;
        this.target = builder.target;
        this.targetValue = builder.targetValue;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushNoticeToiOSRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apnsEnv
     */
    public String getApnsEnv() {
        return this.apnsEnv;
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return extParameters
     */
    public String getExtParameters() {
        return this.extParameters;
    }

    /**
     * @return jobKey
     */
    public String getJobKey() {
        return this.jobKey;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return targetValue
     */
    public String getTargetValue() {
        return this.targetValue;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<PushNoticeToiOSRequest, Builder> {
        private String apnsEnv; 
        private Long appKey; 
        private String body; 
        private String extParameters; 
        private String jobKey; 
        private String target; 
        private String targetValue; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(PushNoticeToiOSRequest request) {
            super(request);
            this.apnsEnv = request.apnsEnv;
            this.appKey = request.appKey;
            this.body = request.body;
            this.extParameters = request.extParameters;
            this.jobKey = request.jobKey;
            this.target = request.target;
            this.targetValue = request.targetValue;
            this.title = request.title;
        } 

        /**
         * ApnsEnv.
         */
        public Builder apnsEnv(String apnsEnv) {
            this.putQueryParameter("ApnsEnv", apnsEnv);
            this.apnsEnv = apnsEnv;
            return this;
        }

        /**
         * AppKey.
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * Body.
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * ExtParameters.
         */
        public Builder extParameters(String extParameters) {
            this.putQueryParameter("ExtParameters", extParameters);
            this.extParameters = extParameters;
            return this;
        }

        /**
         * JobKey.
         */
        public Builder jobKey(String jobKey) {
            this.putQueryParameter("JobKey", jobKey);
            this.jobKey = jobKey;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * TargetValue.
         */
        public Builder targetValue(String targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public PushNoticeToiOSRequest build() {
            return new PushNoticeToiOSRequest(this);
        } 

    } 

}
