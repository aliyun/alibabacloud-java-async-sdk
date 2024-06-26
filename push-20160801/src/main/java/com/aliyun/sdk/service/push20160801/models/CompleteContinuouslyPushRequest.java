// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompleteContinuouslyPushRequest} extends {@link RequestModel}
 *
 * <p>CompleteContinuouslyPushRequest</p>
 */
public class CompleteContinuouslyPushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    private CompleteContinuouslyPushRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteContinuouslyPushRequest create() {
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

    public static final class Builder extends Request.Builder<CompleteContinuouslyPushRequest, Builder> {
        private Long appKey; 
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(CompleteContinuouslyPushRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.messageId = request.messageId;
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

        @Override
        public CompleteContinuouslyPushRequest build() {
            return new CompleteContinuouslyPushRequest(this);
        } 

    } 

}
