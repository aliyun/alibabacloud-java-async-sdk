// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PushNoticeToAndroidRequest} extends {@link RequestModel}
 *
 * <p>PushNoticeToAndroidRequest</p>
 */
public class PushNoticeToAndroidRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("StoreOffline")
    private Boolean storeOffline;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private PushNoticeToAndroidRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.body = builder.body;
        this.extParameters = builder.extParameters;
        this.jobKey = builder.jobKey;
        this.storeOffline = builder.storeOffline;
        this.target = builder.target;
        this.targetValue = builder.targetValue;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushNoticeToAndroidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return storeOffline
     */
    public Boolean getStoreOffline() {
        return this.storeOffline;
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

    public static final class Builder extends Request.Builder<PushNoticeToAndroidRequest, Builder> {
        private Long appKey; 
        private String body; 
        private String extParameters; 
        private String jobKey; 
        private Boolean storeOffline; 
        private String target; 
        private String targetValue; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(PushNoticeToAndroidRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.body = request.body;
            this.extParameters = request.extParameters;
            this.jobKey = request.jobKey;
            this.storeOffline = request.storeOffline;
            this.target = request.target;
            this.targetValue = request.targetValue;
            this.title = request.title;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23267207</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>body</p>
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
         * StoreOffline.
         */
        public Builder storeOffline(Boolean storeOffline) {
            this.putQueryParameter("StoreOffline", storeOffline);
            this.storeOffline = storeOffline;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder targetValue(String targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public PushNoticeToAndroidRequest build() {
            return new PushNoticeToAndroidRequest(this);
        } 

    } 

}
