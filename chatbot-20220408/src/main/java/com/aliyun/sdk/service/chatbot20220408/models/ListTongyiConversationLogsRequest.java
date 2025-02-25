// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTongyiConversationLogsRequest} extends {@link RequestModel}
 *
 * <p>ListTongyiConversationLogsRequest</p>
 */
public class ListTongyiConversationLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RobotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String robotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private ListTongyiConversationLogsRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.robotInstanceId = builder.robotInstanceId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTongyiConversationLogsRequest create() {
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
     * @return robotInstanceId
     */
    public String getRobotInstanceId() {
        return this.robotInstanceId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<ListTongyiConversationLogsRequest, Builder> {
        private String agentKey; 
        private String robotInstanceId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ListTongyiConversationLogsRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.robotInstanceId = request.robotInstanceId;
            this.sessionId = request.sessionId;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-7QuUfaqMQe</p>
         */
        public Builder robotInstanceId(String robotInstanceId) {
            this.putQueryParameter("RobotInstanceId", robotInstanceId);
            this.robotInstanceId = robotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7c3cec23cc8940bc9db4a318c8f4f0aa</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public ListTongyiConversationLogsRequest build() {
            return new ListTongyiConversationLogsRequest(this);
        } 

    } 

}
