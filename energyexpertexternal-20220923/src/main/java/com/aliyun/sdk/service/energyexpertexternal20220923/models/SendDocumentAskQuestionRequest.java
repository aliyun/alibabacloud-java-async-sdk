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
         * <p>Folder ID, used to specify the range of documents for the query. If it is empty, it indicates that all documents under the tenant will be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1a851c4a-1d65-11ef-99a7-ssfsfdd</p>
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("folderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>The question queried by the user</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Total carbon emissions in 2023</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>Q&amp;A session ID, used to record multiple Q&amp;A interactions of the same user. If it is empty, it indicates that sessions are not distinguished.</p>
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
        public SendDocumentAskQuestionRequest build() {
            return new SendDocumentAskQuestionRequest(this);
        } 

    } 

}
