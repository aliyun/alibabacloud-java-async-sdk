// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelPushRequest} extends {@link RequestModel}
 *
 * <p>CancelPushRequest</p>
 */
public class CancelPushRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("MessageId")
    @Validation(required = true)
    private Long messageId;

    private CancelPushRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelPushRequest create() {
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
    public Long getMessageId() {
        return this.messageId;
    }

    public static final class Builder extends Request.Builder<CancelPushRequest, Builder> {
        private Long appKey; 
        private Long messageId; 

        private Builder() {
            super();
        } 

        private Builder(CancelPushRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.messageId = response.messageId;
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
        public Builder messageId(Long messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public CancelPushRequest build() {
            return new CancelPushRequest(this);
        } 

    } 

}
