// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link SteerAgentConversationRequest} extends {@link RequestModel}
 *
 * <p>SteerAgentConversationRequest</p>
 */
public class SteerAgentConversationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("conversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("commandId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    private SteerAgentConversationRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.commandId = builder.commandId;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SteerAgentConversationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder extends Request.Builder<SteerAgentConversationRequest, Builder> {
        private String conversationId; 
        private String commandId; 
        private String message; 

        private Builder() {
            super();
        } 

        private Builder(SteerAgentConversationRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.commandId = request.commandId;
            this.message = request.message;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0198c8a91f4d7f01a3c21e97</p>
         */
        public Builder conversationId(String conversationId) {
            this.putPathParameter("conversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cmd-20260819-0001</p>
         */
        public Builder commandId(String commandId) {
            this.putBodyParameter("commandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>请优先检查消费组在线状态</p>
         */
        public Builder message(String message) {
            this.putBodyParameter("message", message);
            this.message = message;
            return this;
        }

        @Override
        public SteerAgentConversationRequest build() {
            return new SteerAgentConversationRequest(this);
        } 

    } 

}
