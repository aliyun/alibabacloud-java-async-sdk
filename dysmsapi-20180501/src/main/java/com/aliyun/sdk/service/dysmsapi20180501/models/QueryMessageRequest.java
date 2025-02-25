// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMessageRequest} extends {@link RequestModel}
 *
 * <p>QueryMessageRequest</p>
 */
public class QueryMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    private QueryMessageRequest(Builder builder) {
        super(builder);
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    public static final class Builder extends Request.Builder<QueryMessageRequest, Builder> {
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(QueryMessageRequest request) {
            super(request);
            this.messageId = request.messageId;
        } 

        /**
         * <p>The ID of the message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1008030xxx3003</p>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public QueryMessageRequest build() {
            return new QueryMessageRequest(this);
        } 

    } 

}
