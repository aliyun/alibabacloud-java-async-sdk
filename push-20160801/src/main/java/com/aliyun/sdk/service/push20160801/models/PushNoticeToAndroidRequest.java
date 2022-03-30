// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushNoticeToAndroidRequest} extends {@link RequestModel}
 *
 * <p>PushNoticeToAndroidRequest</p>
 */
public class PushNoticeToAndroidRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("Body")
    @Validation(required = true)
    private String body;

    @Query
    @NameInMap("ExtParameters")
    private String extParameters;

    @Query
    @NameInMap("JobKey")
    private String jobKey;

    @Query
    @NameInMap("Target")
    @Validation(required = true)
    private String target;

    @Query
    @NameInMap("TargetValue")
    @Validation(required = true)
    private String targetValue;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private PushNoticeToAndroidRequest(Builder builder) {
        super(builder);
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
            this.target = request.target;
            this.targetValue = request.targetValue;
            this.title = request.title;
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
        public PushNoticeToAndroidRequest build() {
            return new PushNoticeToAndroidRequest(this);
        } 

    } 

}
