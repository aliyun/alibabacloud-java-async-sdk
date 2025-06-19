// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link CreateRunRequest} extends {@link RequestModel}
 *
 * <p>CreateRunRequest</p>
 */
public class CreateRunRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowStructViewContent")
    private Boolean allowStructViewContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("originalAssistantId")
    private String originalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceIdOfOriginalAssistantId")
    private String sourceIdOfOriginalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTypeOfOriginalAssistantId")
    private String sourceTypeOfOriginalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("threadId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String threadId;

    private CreateRunRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.allowStructViewContent = builder.allowStructViewContent;
        this.assistantId = builder.assistantId;
        this.originalAssistantId = builder.originalAssistantId;
        this.sourceIdOfOriginalAssistantId = builder.sourceIdOfOriginalAssistantId;
        this.sourceTypeOfOriginalAssistantId = builder.sourceTypeOfOriginalAssistantId;
        this.stream = builder.stream;
        this.threadId = builder.threadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return allowStructViewContent
     */
    public Boolean getAllowStructViewContent() {
        return this.allowStructViewContent;
    }

    /**
     * @return assistantId
     */
    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * @return originalAssistantId
     */
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    /**
     * @return sourceIdOfOriginalAssistantId
     */
    public String getSourceIdOfOriginalAssistantId() {
        return this.sourceIdOfOriginalAssistantId;
    }

    /**
     * @return sourceTypeOfOriginalAssistantId
     */
    public String getSourceTypeOfOriginalAssistantId() {
        return this.sourceTypeOfOriginalAssistantId;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    public static final class Builder extends Request.Builder<CreateRunRequest, Builder> {
        private String accountId; 
        private Boolean allowStructViewContent; 
        private String assistantId; 
        private String originalAssistantId; 
        private String sourceIdOfOriginalAssistantId; 
        private String sourceTypeOfOriginalAssistantId; 
        private Boolean stream; 
        private String threadId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRunRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.allowStructViewContent = request.allowStructViewContent;
            this.assistantId = request.assistantId;
            this.originalAssistantId = request.originalAssistantId;
            this.sourceIdOfOriginalAssistantId = request.sourceIdOfOriginalAssistantId;
            this.sourceTypeOfOriginalAssistantId = request.sourceTypeOfOriginalAssistantId;
            this.stream = request.stream;
            this.threadId = request.threadId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putHeaderParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * allowStructViewContent.
         */
        public Builder allowStructViewContent(Boolean allowStructViewContent) {
            this.putBodyParameter("allowStructViewContent", allowStructViewContent);
            this.allowStructViewContent = allowStructViewContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>assistantId1</p>
         */
        public Builder assistantId(String assistantId) {
            this.putBodyParameter("assistantId", assistantId);
            this.assistantId = assistantId;
            return this;
        }

        /**
         * originalAssistantId.
         */
        public Builder originalAssistantId(String originalAssistantId) {
            this.putBodyParameter("originalAssistantId", originalAssistantId);
            this.originalAssistantId = originalAssistantId;
            return this;
        }

        /**
         * sourceIdOfOriginalAssistantId.
         */
        public Builder sourceIdOfOriginalAssistantId(String sourceIdOfOriginalAssistantId) {
            this.putBodyParameter("sourceIdOfOriginalAssistantId", sourceIdOfOriginalAssistantId);
            this.sourceIdOfOriginalAssistantId = sourceIdOfOriginalAssistantId;
            return this;
        }

        /**
         * sourceTypeOfOriginalAssistantId.
         */
        public Builder sourceTypeOfOriginalAssistantId(String sourceTypeOfOriginalAssistantId) {
            this.putBodyParameter("sourceTypeOfOriginalAssistantId", sourceTypeOfOriginalAssistantId);
            this.sourceTypeOfOriginalAssistantId = sourceTypeOfOriginalAssistantId;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>threadId123</p>
         */
        public Builder threadId(String threadId) {
            this.putBodyParameter("threadId", threadId);
            this.threadId = threadId;
            return this;
        }

        @Override
        public CreateRunRequest build() {
            return new CreateRunRequest(this);
        } 

    } 

}
