// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link CancelChatRequest} extends {@link RequestModel}
 *
 * <p>CancelChatRequest</p>
 */
public class CancelChatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Answer")
    private String answer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChatId")
    private String chatId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CancelChatRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.answer = builder.answer;
        this.chatId = builder.chatId;
        this.instanceId = builder.instanceId;
        this.sessionId = builder.sessionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * @return chatId
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CancelChatRequest, Builder> {
        private String agentKey; 
        private String answer; 
        private String chatId; 
        private String instanceId; 
        private String sessionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CancelChatRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.answer = request.answer;
            this.chatId = request.chatId;
            this.instanceId = request.instanceId;
            this.sessionId = request.sessionId;
            this.type = request.type;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putBodyParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Answer.
         */
        public Builder answer(String answer) {
            this.putBodyParameter("Answer", answer);
            this.answer = answer;
            return this;
        }

        /**
         * ChatId.
         */
        public Builder chatId(String chatId) {
            this.putBodyParameter("ChatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CancelChatRequest build() {
            return new CancelChatRequest(this);
        } 

    } 

}
