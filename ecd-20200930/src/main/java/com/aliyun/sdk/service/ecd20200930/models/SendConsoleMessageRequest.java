// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendConsoleMessageRequest} extends {@link RequestModel}
 *
 * <p>SendConsoleMessageRequest</p>
 */
public class SendConsoleMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    private SendConsoleMessageRequest(Builder builder) {
        super(builder);
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendConsoleMessageRequest create() {
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

    public static final class Builder extends Request.Builder<SendConsoleMessageRequest, Builder> {
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(SendConsoleMessageRequest request) {
            super(request);
            this.messageId = request.messageId;
        } 

        /**
         * <p>The ID of the console message to be sent. You can obtain the ID from the return value of the message creation operation or the query result of DescribeConsoleMessages. Each call supports only one message ID, and the message must belong to the current Alibaba Cloud account. Only messages in the Published state can be sent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msg-123456</p>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public SendConsoleMessageRequest build() {
            return new SendConsoleMessageRequest(this);
        } 

    } 

}
