// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinuouslyPushRequest} extends {@link RequestModel}
 *
 * <p>ContinuouslyPushRequest</p>
 */
public class ContinuouslyPushRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("MessageId")
    @Validation(required = true)
    private String messageId;

    @Query
    @NameInMap("Target")
    @Validation(required = true)
    private String target;

    @Query
    @NameInMap("TargetValue")
    @Validation(required = true)
    private String targetValue;

    private ContinuouslyPushRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.messageId = builder.messageId;
        this.target = builder.target;
        this.targetValue = builder.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinuouslyPushRequest create() {
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
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
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

    public static final class Builder extends Request.Builder<ContinuouslyPushRequest, Builder> {
        private Long appKey; 
        private String messageId; 
        private String target; 
        private String targetValue; 

        private Builder() {
            super();
        } 

        private Builder(ContinuouslyPushRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.messageId = response.messageId;
            this.target = response.target;
            this.targetValue = response.targetValue;
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
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
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

        @Override
        public ContinuouslyPushRequest build() {
            return new ContinuouslyPushRequest(this);
        } 

    } 

}
