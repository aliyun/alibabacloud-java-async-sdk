// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link CreateMemoryStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateMemoryStoreRequest</p>
 */
public class CreateMemoryStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateMemoryStoreRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateMemoryStoreRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryStoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return body
     */
    public CreateMemoryStoreRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateMemoryStoreRequest, Builder> {
        private String workspaceId; 
        private CreateMemoryStoreRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemoryStoreRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The AgentCore workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The request to create a memory store.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateMemoryStoreRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The client request token.</p>
         * 
         * <strong>example:</strong>
         * <p>memory-store-create-20260909-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateMemoryStoreRequest build() {
            return new CreateMemoryStoreRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMemoryStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateMemoryStoreRequest</p>
     */
    public static class CreateMemoryStoreRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("extractInstructions")
        private String extractInstructions;

        @com.aliyun.core.annotation.NameInMap("memoryStoreName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String memoryStoreName;

        private CreateMemoryStoreRequestBody(Builder builder) {
            this.description = builder.description;
            this.extractInstructions = builder.extractInstructions;
            this.memoryStoreName = builder.memoryStoreName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateMemoryStoreRequestBody create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extractInstructions
         */
        public String getExtractInstructions() {
            return this.extractInstructions;
        }

        /**
         * @return memoryStoreName
         */
        public String getMemoryStoreName() {
            return this.memoryStoreName;
        }

        public static final class Builder {
            private String description; 
            private String extractInstructions; 
            private String memoryStoreName; 

            private Builder() {
            } 

            private Builder(CreateMemoryStoreRequestBody model) {
                this.description = model.description;
                this.extractInstructions = model.extractInstructions;
                this.memoryStoreName = model.memoryStoreName;
            } 

            /**
             * <p>The description of the memory store. Maximum of 1,024 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Used to store long-term user preferences</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The custom extraction instructions. Maximum of 4,096 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>Extract only long-term preferences explicitly expressed by the user</p>
             */
            public Builder extractInstructions(String extractInstructions) {
                this.extractInstructions = extractInstructions;
                return this;
            }

            /**
             * <p>The name of the memory store. The name must be 1 to 64 characters in length and can contain only lowercase letters, digits, and hyphens (-). The name cannot be modified after creation.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>customer-memory</p>
             */
            public Builder memoryStoreName(String memoryStoreName) {
                this.memoryStoreName = memoryStoreName;
                return this;
            }

            public CreateMemoryStoreRequestBody build() {
                return new CreateMemoryStoreRequestBody(this);
            } 

        } 

    }
}
