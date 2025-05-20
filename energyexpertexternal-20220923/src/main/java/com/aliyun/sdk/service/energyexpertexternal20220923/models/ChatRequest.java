// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("question")
    @com.aliyun.core.annotation.Validation(required = true)
    private String question;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    private ChatRequest(Builder builder) {
        super(builder);
        this.question = builder.question;
        this.sessionId = builder.sessionId;
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
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<ChatRequest, Builder> {
        private String question; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ChatRequest request) {
            super(request);
            this.question = request.question;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>Q&amp;A content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>How to access knowledge base Q&amp;A documents.</p>
         */
        public Builder question(String question) {
            this.putBodyParameter("question", question);
            this.question = question;
            return this;
        }

        /**
         * <ul>
         * <li>Q&amp;A session ID.</li>
         * <li>Historical sessions can be retrieved through GetSessionList.</li>
         * <li>A new session can also be created via CreateChatSession.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bfce2248-1546-4298-8bcf-70ac26e69646</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public ChatRequest build() {
            return new ChatRequest(this);
        } 

    } 

}
