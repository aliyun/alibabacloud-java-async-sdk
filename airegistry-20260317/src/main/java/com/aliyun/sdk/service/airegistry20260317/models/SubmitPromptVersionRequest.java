// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link SubmitPromptVersionRequest} extends {@link RequestModel}
 *
 * <p>SubmitPromptVersionRequest</p>
 */
public class SubmitPromptVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptVersion")
    private String promptVersion;

    private SubmitPromptVersionRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.promptKey = builder.promptKey;
        this.promptVersion = builder.promptVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitPromptVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return promptKey
     */
    public String getPromptKey() {
        return this.promptKey;
    }

    /**
     * @return promptVersion
     */
    public String getPromptVersion() {
        return this.promptVersion;
    }

    public static final class Builder extends Request.Builder<SubmitPromptVersionRequest, Builder> {
        private String namespaceId; 
        private String promptKey; 
        private String promptVersion; 

        private Builder() {
            super();
        } 

        private Builder(SubmitPromptVersionRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.promptKey = request.promptKey;
            this.promptVersion = request.promptVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-qa</p>
         */
        public Builder promptKey(String promptKey) {
            this.putQueryParameter("PromptKey", promptKey);
            this.promptKey = promptKey;
            return this;
        }

        /**
         * PromptVersion.
         */
        public Builder promptVersion(String promptVersion) {
            this.putQueryParameter("PromptVersion", promptVersion);
            this.promptVersion = promptVersion;
            return this;
        }

        @Override
        public SubmitPromptVersionRequest build() {
            return new SubmitPromptVersionRequest(this);
        } 

    } 

}
