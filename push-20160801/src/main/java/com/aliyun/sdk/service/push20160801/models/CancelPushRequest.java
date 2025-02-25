// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelPushRequest} extends {@link RequestModel}
 *
 * <p>CancelPushRequest</p>
 */
public class CancelPushRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(CancelPushRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.messageId = request.messageId;
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
         * <p>501029</p>
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
