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
 * {@link CreateCredentialRequest} extends {@link RequestModel}
 *
 * <p>CreateCredentialRequest</p>
 */
public class CreateCredentialRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateCredentialRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateCredentialRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCredentialRequest create() {
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
    public CreateCredentialRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateCredentialRequest, Builder> {
        private String workspaceId; 
        private CreateCredentialRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateCredentialRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
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
         * <p>The request body for creating a credential.</p>
         */
        public Builder body(CreateCredentialRequestBody body) {
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
        public CreateCredentialRequest build() {
            return new CreateCredentialRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCredentialRequest} extends {@link TeaModel}
     *
     * <p>CreateCredentialRequest</p>
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
             * <p>The unique identifier of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-xxxx</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource name. This value is empty if the resource has been deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The resource type, such as agent.</p>
             * 
             * <strong>example:</strong>
             * <p>agent</p>
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
     * {@link CreateCredentialRequest} extends {@link TeaModel}
     *
     * <p>CreateCredentialRequest</p>
     */
    public static class CreateCredentialRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("credentialMetadata")
        @com.aliyun.core.annotation.Validation(required = true)
        private String credentialMetadata;

        @com.aliyun.core.annotation.NameInMap("credentialType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String credentialType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("resourceRefs")
        private java.util.List<ResourceRefs> resourceRefs;

        @com.aliyun.core.annotation.NameInMap("resourceScope")
        private String resourceScope;

        private CreateCredentialRequestBody(Builder builder) {
            this.credentialMetadata = builder.credentialMetadata;
            this.credentialType = builder.credentialType;
            this.description = builder.description;
            this.name = builder.name;
            this.resourceRefs = builder.resourceRefs;
            this.resourceScope = builder.resourceScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCredentialRequestBody create() {
            return builder().build();
        }

        /**
         * @return credentialMetadata
         */
        public String getCredentialMetadata() {
            return this.credentialMetadata;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String credentialType; 
            private String description; 
            private String name; 
            private java.util.List<ResourceRefs> resourceRefs; 
            private String resourceScope; 

            private Builder() {
            } 

            private Builder(CreateCredentialRequestBody model) {
                this.credentialMetadata = model.credentialMetadata;
                this.credentialType = model.credentialType;
                this.description = model.description;
                this.name = model.name;
                this.resourceRefs = model.resourceRefs;
                this.resourceScope = model.resourceScope;
            } 

            /**
             * <p>The credential content. The value is a JSON string. When credentialType is set to apiKey, the content can contain only the apiKey field, and the value cannot be empty. After being written, the content can only be queried in masked form.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;apiKey&quot;:&quot;sk-example-value&quot;}</p>
             */
            public Builder credentialMetadata(String credentialMetadata) {
                this.credentialMetadata = credentialMetadata;
                return this;
            }

            /**
             * <p>The credential type. Currently, only apiKey is supported.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>apiKey</p>
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * <p>The credential description. The description can be up to 256 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>API Key used for calling model services in the production environment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The credential name. The name must be unique within the workspace and can contain only letters, digits, periods (.), underscores (_), and hyphens (-). The name must be 3 to 128 characters in length and cannot use runtime reserved names.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>model-api-key</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required and must be a non-empty array when resourceScope is set to SPECIFIED. Each item contains resourceType and resourceId. resourceName is optional.</p>
             */
            public Builder resourceRefs(java.util.List<ResourceRefs> resourceRefs) {
                this.resourceRefs = resourceRefs;
                return this;
            }

            /**
             * <p>ALL indicates all resources. SPECIFIED indicates that the credential applies only to the resources specified in resourceRefs.</p>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder resourceScope(String resourceScope) {
                this.resourceScope = resourceScope;
                return this;
            }

            public CreateCredentialRequestBody build() {
                return new CreateCredentialRequestBody(this);
            } 

        } 

    }
}
