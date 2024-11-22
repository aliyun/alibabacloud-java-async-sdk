// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendDocumentAskQuestionRequest} extends {@link RequestModel}
 *
 * <p>SendDocumentAskQuestionRequest</p>
 */
public class SendDocumentAskQuestionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("folderId")
    private String folderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private SendDocumentAskQuestionRequest(Builder builder) {
        super(builder);
        this.folderId = builder.folderId;
        this.prompt = builder.prompt;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendDocumentAskQuestionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<SendDocumentAskQuestionRequest, Builder> {
        private String folderId; 
        private String prompt; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(SendDocumentAskQuestionRequest request) {
            super(request);
            this.folderId = request.folderId;
            this.prompt = request.prompt;
            this.sessionId = request.sessionId;
        } 

        /**
         * folderId.
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("folderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public SendDocumentAskQuestionRequest build() {
            return new SendDocumentAskQuestionRequest(this);
        } 

    } 

}
