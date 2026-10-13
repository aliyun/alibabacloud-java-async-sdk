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
         * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key value on the business management page of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putBodyParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The answer content.</p>
         * 
         * <strong>example:</strong>
         * <This answer was inter>
         */
        public Builder answer(String answer) {
            this.putBodyParameter("Answer", answer);
            this.answer = answer;
            return this;
        }

        /**
         * <p>The ID that identifies a single conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>7105a351-b2e7-4c9e-8437-c43a043c0a4e</p>
         */
        public Builder chatId(String chatId) {
            this.putBodyParameter("ChatId", chatId);
            this.chatId = chatId;
            return this;
        }

        /**
         * <p>The chatbot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-yjzbyrEvqd</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The session ID, which is used to identify a visitor\&quot;s session and maintain context information. For a new visitor, you do not need to specify this parameter when calling the Chat operation for the first time. The chatbot starts a session and returns the SessionId in the response of the Chat operation. For subsequent conversation turns of the visitor, pass the SessionId of the current session when calling the Chat operation so that the chatbot can continue the conversation based on the SessionId. Maximum length: 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>c1187530338311ebade7cf3eaeb3668a</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The interruption type.</p>
         * 
         * <strong>example:</strong>
         * <p>Canceled</p>
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
