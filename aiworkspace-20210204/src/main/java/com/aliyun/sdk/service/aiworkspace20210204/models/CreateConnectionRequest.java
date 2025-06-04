// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateConnectionRequest</p>
 */
public class CreateConnectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, String> configs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionType")
    private String connectionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Models")
    private java.util.List<Models> models;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceMeta")
    private ResourceMeta resourceMeta;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Secrets")
    private java.util.Map<String, String> secrets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateConnectionRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.configs = builder.configs;
        this.connectionName = builder.connectionName;
        this.connectionType = builder.connectionType;
        this.description = builder.description;
        this.models = builder.models;
        this.resourceMeta = builder.resourceMeta;
        this.secrets = builder.secrets;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return configs
     */
    public java.util.Map<String, String> getConfigs() {
        return this.configs;
    }

    /**
     * @return connectionName
     */
    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * @return connectionType
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return models
     */
    public java.util.List<Models> getModels() {
        return this.models;
    }

    /**
     * @return resourceMeta
     */
    public ResourceMeta getResourceMeta() {
        return this.resourceMeta;
    }

    /**
     * @return secrets
     */
    public java.util.Map<String, String> getSecrets() {
        return this.secrets;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateConnectionRequest, Builder> {
        private String accessibility; 
        private java.util.Map<String, String> configs; 
        private String connectionName; 
        private String connectionType; 
        private String description; 
        private java.util.List<Models> models; 
        private ResourceMeta resourceMeta; 
        private java.util.Map<String, String> secrets; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConnectionRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.configs = request.configs;
            this.connectionName = request.connectionName;
            this.connectionType = request.connectionType;
            this.description = request.description;
            this.models = request.models;
            this.resourceMeta = request.resourceMeta;
            this.secrets = request.secrets;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The accessibility of the workspace. Valid values:</p>
         * <ul>
         * <li>PRIVATE: The workspace is accessible only to you and the administrator of the workspace. This is the default value.</li>
         * <li>PUBLIC: The workspace is accessible to all users in the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The connection configurations, in key-value pairs. The key varies based on the connection type. For more information, see the supplementary notes below the request parameters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder configs(java.util.Map<String, String> configs) {
            this.putBodyParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * <p>The connection name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-connection</p>
         */
        public Builder connectionName(String connectionName) {
            this.putBodyParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * <p>The connection type. Valid values:</p>
         * <ul>
         * <li>DashScopeConnection: Alibaba Cloud Model Studio connection</li>
         * <li>OpenLLMConnection: open source model connection</li>
         * <li>MilvusConnection: Milvus connection</li>
         * <li>OpenSearchConnection: OpenSearch connection</li>
         * <li>LindormConnection: Lindorm connection</li>
         * <li>ElasticsearchConnection: Elasticsearch connection</li>
         * <li>HologresConnection: Hologres connection</li>
         * <li>RDSConnection: RDS connection</li>
         * <li>CustomConnection: custom connection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DashScopeConnection</p>
         */
        public Builder connectionType(String connectionType) {
            this.putBodyParameter("ConnectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * <p>The connection description.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The models, which apply to model service connections.</p>
         */
        public Builder models(java.util.List<Models> models) {
            this.putBodyParameter("Models", models);
            this.models = models;
            return this;
        }

        /**
         * <p>The instance resource information of the connection, which applies to database connections.</p>
         */
        public Builder resourceMeta(ResourceMeta resourceMeta) {
            this.putBodyParameter("ResourceMeta", resourceMeta);
            this.resourceMeta = resourceMeta;
            return this;
        }

        /**
         * <p>The configuration to be encrypted. Examples: the database logon account and password and the key of the model service.</p>
         */
        public Builder secrets(java.util.Map<String, String> secrets) {
            this.putBodyParameter("Secrets", secrets);
            this.secrets = secrets;
            return this;
        }

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123**45</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateConnectionRequest build() {
            return new CreateConnectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("ToolCall")
        private Boolean toolCall;

        private Models(Builder builder) {
            this.displayName = builder.displayName;
            this.model = builder.model;
            this.modelType = builder.modelType;
            this.toolCall = builder.toolCall;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return toolCall
         */
        public Boolean getToolCall() {
            return this.toolCall;
        }

        public static final class Builder {
            private String displayName; 
            private String model; 
            private String modelType; 
            private Boolean toolCall; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.displayName = model.displayName;
                this.model = model.model;
                this.modelType = model.modelType;
                this.toolCall = model.toolCall;
            } 

            /**
             * <p>The display name of the model.</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The model identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>model_001</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The model type. Valid values:</p>
             * <ul>
             * <li>LLM</li>
             * <li>Embedding</li>
             * <li>ReRank</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LLM</p>
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * <p>Specifies whether a tool can be called by using ToolCall. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder toolCall(Boolean toolCall) {
                this.toolCall = toolCall;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateConnectionRequest} extends {@link TeaModel}
     *
     * <p>CreateConnectionRequest</p>
     */
    public static class ResourceMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        private ResourceMeta(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceMeta create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceName; 

            private Builder() {
            } 

            private Builder(ResourceMeta model) {
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ld-uf69****9nqjjes</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            public ResourceMeta build() {
                return new ResourceMeta(this);
            } 

        } 

    }
}
