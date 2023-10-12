// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMessageToiOSRequest} extends {@link RequestModel}
 *
 * <p>PushMessageToiOSRequest</p>
 */
public class PushMessageToiOSRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("Body")
    @Validation(required = true)
    private String body;

    @Query
    @NameInMap("JobKey")
    private String jobKey;

    @Query
    @NameInMap("StoreOffline")
    private Boolean storeOffline;

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

    private PushMessageToiOSRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.body = builder.body;
        this.jobKey = builder.jobKey;
        this.storeOffline = builder.storeOffline;
        this.target = builder.target;
        this.targetValue = builder.targetValue;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMessageToiOSRequest create() {
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

    public static final class Builder extends Request.Builder<PushMessageToiOSRequest, Builder> {
        private Long appKey; 
        private String body; 
        private String jobKey; 
        private Boolean storeOffline; 
        private String target; 
        private String targetValue; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(PushMessageToiOSRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.body = request.body;
            this.jobKey = request.jobKey;
            this.storeOffline = request.storeOffline;
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
        public PushMessageToiOSRequest build() {
            return new PushMessageToiOSRequest(this);
        } 

    } 

}
