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
 * {@link GetPromptRequest} extends {@link RequestModel}
 *
 * <p>GetPromptRequest</p>
 */
public class GetPromptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptKey;

    private GetPromptRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.promptKey = builder.promptKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPromptRequest create() {
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

    public static final class Builder extends Request.Builder<GetPromptRequest, Builder> {
        private String namespaceId; 
        private String promptKey; 

        private Builder() {
            super();
        } 

        private Builder(GetPromptRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.promptKey = request.promptKey;
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

        @Override
        public GetPromptRequest build() {
            return new GetPromptRequest(this);
        } 

    } 

}
