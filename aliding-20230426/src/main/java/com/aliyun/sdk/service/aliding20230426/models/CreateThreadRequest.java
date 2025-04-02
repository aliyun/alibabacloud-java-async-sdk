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
 * {@link CreateThreadRequest} extends {@link RequestModel}
 *
 * <p>CreateThreadRequest</p>
 */
public class CreateThreadRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("originalAssistantId")
    private String originalAssistantId;

    private CreateThreadRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.assistantId = builder.assistantId;
        this.metadata = builder.metadata;
        this.originalAssistantId = builder.originalAssistantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateThreadRequest create() {
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
     * @return assistantId
     */
    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return originalAssistantId
     */
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    public static final class Builder extends Request.Builder<CreateThreadRequest, Builder> {
        private String accountId; 
        private String assistantId; 
        private java.util.Map<String, ?> metadata; 
        private String originalAssistantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateThreadRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.assistantId = request.assistantId;
            this.metadata = request.metadata;
            this.originalAssistantId = request.originalAssistantId;
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
         * metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.putBodyParameter("metadata", metadata);
            this.metadata = metadata;
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

        @Override
        public CreateThreadRequest build() {
            return new CreateThreadRequest(this);
        } 

    } 

}
