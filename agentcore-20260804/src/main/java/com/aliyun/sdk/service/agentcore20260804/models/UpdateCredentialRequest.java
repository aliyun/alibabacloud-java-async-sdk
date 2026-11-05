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
 * {@link UpdateCredentialRequest} extends {@link RequestModel}
 *
 * <p>UpdateCredentialRequest</p>
 */
public class UpdateCredentialRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("credentialId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateCredentialRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateCredentialRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.credentialId = builder.credentialId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCredentialRequest create() {
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
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return body
     */
    public UpdateCredentialRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateCredentialRequest, Builder> {
        private String workspaceId; 
        private String credentialId; 
        private UpdateCredentialRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCredentialRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.credentialId = request.credentialId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The credential ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-123456</p>
         */
        public Builder credentialId(String credentialId) {
            this.putPathParameter("credentialId", credentialId);
            this.credentialId = credentialId;
            return this;
        }

        /**
         * <p>The request body for updating the credential.</p>
         */
        public Builder body(UpdateCredentialRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>Not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Not supported</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateCredentialRequest build() {
            return new UpdateCredentialRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateCredentialRequest</p>
     */
    public static class ResourceRefs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private ResourceRefs(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceRefs create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(ResourceRefs model) {
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The ID of the applicable MCP service.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-example</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource name. This field is empty if the resource has been deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>my-mcp-service</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The resource type. Currently, the value is mcpServer, which indicates an MCP service.</p>
             * 
             * <strong>example:</strong>
             * <p>mcpServer</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceRefs build() {
                return new ResourceRefs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateCredentialRequest} extends {@link TeaModel}
     *
     * <p>UpdateCredentialRequest</p>
     */
    public static class UpdateCredentialRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credentialMetadata")
        private String credentialMetadata;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("resourceRefs")
        private java.util.List<ResourceRefs> resourceRefs;

        @com.aliyun.core.annotation.NameInMap("resourceScope")
        private String resourceScope;

        private UpdateCredentialRequestBody(Builder builder) {
            this.credentialMetadata = builder.credentialMetadata;
            this.description = builder.description;
            this.resourceRefs = builder.resourceRefs;
            this.resourceScope = builder.resourceScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCredentialRequestBody create() {
            return builder().build();
        }

        /**
         * @return credentialMetadata
         */
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return resourceRefs
         */
        public java.util.List<ResourceRefs> getResourceRefs() {
            return this.resourceRefs;
        }

        /**
         * @return resourceScope
         */
        public String getResourceScope() {
            return this.resourceScope;
        }

        public static final class Builder {
            private String credentialMetadata; 
            private String description; 
            private java.util.List<ResourceRefs> resourceRefs; 
            private String resourceScope; 

            private Builder() {
            } 

            private Builder(UpdateCredentialRequestBody model) {
                this.credentialMetadata = model.credentialMetadata;
                this.description = model.description;
                this.resourceRefs = model.resourceRefs;
                this.resourceScope = model.resourceScope;
            } 

            /**
             * <p>The credential content, submitted as a JSON string. For the apiKey type, it contains only a non-empty apiKey. For the mcpHeader type, it contains a non-empty headers array, where each item includes a name and a value.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;apiKey&quot;:&quot;sk-example-value&quot;}</p>
             */
            public Builder credentialMetadata(String credentialMetadata) {
                this.credentialMetadata = credentialMetadata;
                return this;
            }

            /**
             * <p>The new credential description. The description can be up to 256 characters in length. If omitted, the original description is retained. It can be updated independently of the credential content or application scope.</p>
             * 
             * <strong>example:</strong>
             * <p>API key used to call the model service in the production environment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of applicable resources for the MCP header credential. If submitted, resourceScope must also be submitted. An empty array [] is allowed when the scope is SPECIFIED. Omit this field when the scope is ALL.</p>
             */
            public Builder resourceRefs(java.util.List<ResourceRefs> resourceRefs) {
                this.resourceRefs = resourceRefs;
                return this;
            }

            /**
             * <p>The application scope of the MCP header credential. This field is supported only for the mcpHeader type. ALL indicates all MCP services, and SPECIFIED indicates the MCP services specified in resourceRefs. Do not submit this field for the apiKey type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder resourceScope(String resourceScope) {
                this.resourceScope = resourceScope;
                return this;
            }

            public UpdateCredentialRequestBody build() {
                return new UpdateCredentialRequestBody(this);
            } 

        } 

    }
}
