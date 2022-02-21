// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPushStatByMsgRequest} extends {@link RequestModel}
 *
 * <p>QueryPushStatByMsgRequest</p>
 */
public class QueryPushStatByMsgRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("MessageId")
    @Validation(required = true)
    private Long messageId;

    private QueryPushStatByMsgRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPushStatByMsgRequest create() {
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

    public static final class Builder extends Request.Builder<QueryPushStatByMsgRequest, Builder> {
        private Long appKey; 
        private Long messageId; 

        private Builder() {
            super();
        } 

        private Builder(QueryPushStatByMsgRequest response) {
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
        public QueryPushStatByMsgRequest build() {
            return new QueryPushStatByMsgRequest(this);
        } 

    } 

}
