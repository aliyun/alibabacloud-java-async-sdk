// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link AskLumaRequest} extends {@link RequestModel}
 *
 * <p>AskLumaRequest</p>
 */
public class AskLumaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxRows")
    private Integer maxRows;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Question")
    @com.aliyun.core.annotation.Validation(required = true)
    private String question;

    private AskLumaRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.conversationId = builder.conversationId;
        this.maxRows = builder.maxRows;
        this.question = builder.question;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AskLumaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return maxRows
     */
    public Integer getMaxRows() {
        return this.maxRows;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    public static final class Builder extends Request.Builder<AskLumaRequest, Builder> {
        private String agentName; 
        private String conversationId; 
        private Integer maxRows; 
        private String question; 

        private Builder() {
            super();
        } 

        private Builder(AskLumaRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.conversationId = request.conversationId;
            this.maxRows = request.maxRows;
            this.question = request.question;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-luma-agent</p>
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * MaxRows.
         */
        public Builder maxRows(Integer maxRows) {
            this.putBodyParameter("MaxRows", maxRows);
            this.maxRows = maxRows;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder question(String question) {
            this.putBodyParameter("Question", question);
            this.question = question;
            return this;
        }

        @Override
        public AskLumaRequest build() {
            return new AskLumaRequest(this);
        } 

    } 

}
