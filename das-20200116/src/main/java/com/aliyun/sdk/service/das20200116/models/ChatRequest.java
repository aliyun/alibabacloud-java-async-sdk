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
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resume")
    private String resume;

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
        this.resume = builder.resume;
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
     * @return resume
     */
    public String getResume() {
        return this.resume;
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
        private String resume; 
        private String sessionId; 
        private String summary; 

        private Builder() {
            super();
        } 

        private Builder(ChatRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.message = request.message;
            this.resume = request.resume;
            this.sessionId = request.sessionId;
            this.summary = request.summary;
        } 

        /**
         * <p>The agent ID used for the service. This parameter is optional. You can specify an agent generated after DAS Agent is enabled or an agent that you manually created. If this parameter is not specified, the default agent is used.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-472T0DxtmjIxxxxx</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The message.</p>
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
         * <p>The user interaction feedback.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;metadata&quot;:{&quot;a2uiClientDataModel&quot;:{&quot;decided&quot;:true,&quot;interaction&quot;:{&quot;request&quot;:{&quot;allowFreeText&quot;:true,&quot;question&quot;:&quot;question?&quot;,&quot;options&quot;:[{&quot;label&quot;:&quot;162&quot;,&quot;value&quot;:&quot;162&quot;},{&quot;label&quot;:&quot;242&quot;,&quot;value&quot;:&quot;242&quot;},{&quot;label&quot;:&quot;243&quot;,&quot;value&quot;:&quot;243&quot;},{&quot;label&quot;:&quot;486&quot;,&quot;value&quot;:&quot;486&quot;}]},&quot;kind&quot;:&quot;choice&quot;,&quot;interruptId&quot;:&quot;5857955e-4856-4ab3-969e-f8b4c484bda4&quot;,&quot;status&quot;:&quot;pending&quot;},&quot;free_text&quot;:&quot;&quot;},&quot;a2uiAction&quot;:{&quot;name&quot;:&quot;das_interaction_response&quot;,&quot;context&quot;:{&quot;value&quot;:&quot;162&quot;},&quot;surfaceId&quot;:&quot;render-choice-7c03eb4f927f42ff8c30b30a2cc0797d&quot;,&quot;sourceComponentId&quot;:&quot;opts-0&quot;,&quot;timestamp&quot;:&quot;2026-09-15T06:54:15.556Z&quot;}},&quot;payload&quot;:{&quot;value&quot;:&quot;162&quot;},&quot;interruptId&quot;:&quot;5857955e-4856-4ab3-969e-f8b4c484bda4&quot;,&quot;status&quot;:&quot;resolved&quot;}]</p>
         */
        public Builder resume(String resume) {
            this.putQueryParameter("Resume", resume);
            this.resume = resume;
            return this;
        }

        /**
         * <p>The session ID in UUID string format. This parameter is optional. If this parameter is not specified, a new session is created by default. To maintain context across conversations, use the same session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-xxxxxxxxxxxx</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>Specifies whether to output summary information.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
