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
 * {@link UpdateModelConnectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelConnectionRequest</p>
 */
public class UpdateModelConnectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("connectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateModelConnectionRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateModelConnectionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.connectionId = builder.connectionId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelConnectionRequest create() {
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
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return body
     */
    public UpdateModelConnectionRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateModelConnectionRequest, Builder> {
        private String workspaceId; 
        private String connectionId; 
        private UpdateModelConnectionRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelConnectionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.connectionId = request.connectionId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        public Builder connectionId(String connectionId) {
            this.putPathParameter("connectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateModelConnectionRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateModelConnectionRequest build() {
            return new UpdateModelConnectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelConnectionRequest</p>
     */
    public static class UpdateModelConnectionRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKeys")
        private java.util.List<String> apiKeys;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("providerType")
        private String providerType;

        private UpdateModelConnectionRequestBody(Builder builder) {
            this.apiKeys = builder.apiKeys;
            this.description = builder.description;
            this.endpoint = builder.endpoint;
            this.name = builder.name;
            this.protocol = builder.protocol;
            this.providerType = builder.providerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateModelConnectionRequestBody create() {
            return builder().build();
        }

        /**
         * @return apiKeys
         */
        public java.util.List<String> getApiKeys() {
            return this.apiKeys;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return providerType
         */
        public String getProviderType() {
            return this.providerType;
        }

        public static final class Builder {
            private java.util.List<String> apiKeys; 
            private String description; 
            private String endpoint; 
            private String name; 
            private String protocol; 
            private String providerType; 

            private Builder() {
            } 

            private Builder(UpdateModelConnectionRequestBody model) {
                this.apiKeys = model.apiKeys;
                this.description = model.description;
                this.endpoint = model.endpoint;
                this.name = model.name;
                this.protocol = model.protocol;
                this.providerType = model.providerType;
            } 

            /**
             * apiKeys.
             */
            public Builder apiKeys(java.util.List<String> apiKeys) {
                this.apiKeys = apiKeys;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * providerType.
             */
            public Builder providerType(String providerType) {
                this.providerType = providerType;
                return this;
            }

            public UpdateModelConnectionRequestBody build() {
                return new UpdateModelConnectionRequestBody(this);
            } 

        } 

    }
}
