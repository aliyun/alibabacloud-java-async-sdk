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
 * {@link RespondAgentConversationActionRequest} extends {@link RequestModel}
 *
 * <p>RespondAgentConversationActionRequest</p>
 */
public class RespondAgentConversationActionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("conversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("actionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("answers")
    private java.util.Map<String, String> answers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("decision")
    private String decision;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("note")
    private String note;

    private RespondAgentConversationActionRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.actionId = builder.actionId;
        this.answers = builder.answers;
        this.decision = builder.decision;
        this.note = builder.note;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RespondAgentConversationActionRequest create() {
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
     * @return actionId
     */
    public String getActionId() {
        return this.actionId;
    }

    /**
     * @return answers
     */
    public java.util.Map<String, String> getAnswers() {
        return this.answers;
    }

    /**
     * @return decision
     */
    public String getDecision() {
        return this.decision;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    public static final class Builder extends Request.Builder<RespondAgentConversationActionRequest, Builder> {
        private String conversationId; 
        private String actionId; 
        private java.util.Map<String, String> answers; 
        private String decision; 
        private String note; 

        private Builder() {
            super();
        } 

        private Builder(RespondAgentConversationActionRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.actionId = request.actionId;
            this.answers = request.answers;
            this.decision = request.decision;
            this.note = request.note;
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
         * <p>tool_01</p>
         */
        public Builder actionId(String actionId) {
            this.putPathParameter("actionId", actionId);
            this.actionId = actionId;
            return this;
        }

        /**
         * answers.
         */
        public Builder answers(java.util.Map<String, String> answers) {
            this.putBodyParameter("answers", answers);
            this.answers = answers;
            return this;
        }

        /**
         * decision.
         */
        public Builder decision(String decision) {
            this.putBodyParameter("decision", decision);
            this.decision = decision;
            return this;
        }

        /**
         * note.
         */
        public Builder note(String note) {
            this.putBodyParameter("note", note);
            this.note = note;
            return this;
        }

        @Override
        public RespondAgentConversationActionRequest build() {
            return new RespondAgentConversationActionRequest(this);
        } 

    } 

}
