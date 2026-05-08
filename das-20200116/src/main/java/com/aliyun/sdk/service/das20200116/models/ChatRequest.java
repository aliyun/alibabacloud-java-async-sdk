// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link ChatRequest} extends {@link RequestModel}
 *
 * <p>ChatRequest</p>
 */
public class ChatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    private ChatRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.message = builder.message;
        this.sessionId = builder.sessionId;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    public static final class Builder extends Request.Builder<ChatRequest, Builder> {
        private String agentId; 
        private String message; 
        private String sessionId; 
        private String summary; 

        private Builder() {
            super();
        } 

        private Builder(ChatRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.message = request.message;
            this.sessionId = request.sessionId;
            this.summary = request.summary;
        } 

        /**
         * AgentId.
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;id&quot;:&quot;68fe0321-37fe-4c75-a118-b61b33156f6a&quot;,&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:[{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;hello&quot;}]}</p>
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(String summary) {
            this.putQueryParameter("Summary", summary);
            this.summary = summary;
            return this;
        }

        @Override
        public ChatRequest build() {
            return new ChatRequest(this);
        } 

    } 

}
