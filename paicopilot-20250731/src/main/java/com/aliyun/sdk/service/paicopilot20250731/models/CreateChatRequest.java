// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paicopilot20250731.models;

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
 * {@link CreateChatRequest} extends {@link RequestModel}
 *
 * <p>CreateChatRequest</p>
 */
public class CreateChatRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtraData")
    private String extraData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Payload")
    private java.util.Map<String, ?> payload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Question")
    private ChatDetail question;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private CreateChatRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.extraData = builder.extraData;
        this.payload = builder.payload;
        this.question = builder.question;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return extraData
     */
    public String getExtraData() {
        return this.extraData;
    }

    /**
     * @return payload
     */
    public java.util.Map<String, ?> getPayload() {
        return this.payload;
    }

    /**
     * @return question
     */
    public ChatDetail getQuestion() {
        return this.question;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateChatRequest, Builder> {
        private String sessionId; 
        private String extraData; 
        private java.util.Map<String, ?> payload; 
        private ChatDetail question; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateChatRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.extraData = request.extraData;
            this.payload = request.payload;
            this.question = request.question;
            this.title = request.title;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>se-982******q0j9f</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * ExtraData.
         */
        public Builder extraData(String extraData) {
            this.putBodyParameter("ExtraData", extraData);
            this.extraData = extraData;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(java.util.Map<String, ?> payload) {
            this.putBodyParameter("Payload", payload);
            this.payload = payload;
            return this;
        }

        /**
         * Question.
         */
        public Builder question(ChatDetail question) {
            this.putBodyParameter("Question", question);
            this.question = question;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateChatRequest build() {
            return new CreateChatRequest(this);
        } 

    } 

}
