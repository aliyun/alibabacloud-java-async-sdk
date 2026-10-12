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
         * <p>The visibility of the workspace. The default value is <code>PRIVATE</code>.</p>
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
         * <p>Configuration properties for the connection, provided as key-value pairs. The required keys depend on the connection type. For details, see the supplementary parameter information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder configs(java.util.Map<String, String> configs) {
            this.putBodyParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * <p>The name of the connection.</p>
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
         * <p>The type of the connection.</p>
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
         * <p>The description of the connection.</p>
         * 
         * <strong>example:</strong>
         * <p>Open-source LLM service connection.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>A list of models. This parameter applies to model service connections.</p>
         */
        public Builder models(java.util.List<Models> models) {
            this.putBodyParameter("Models", models);
            this.models = models;
            return this;
        }

        /**
         * <p>Resource metadata for the connection. This parameter is typically used for database connection types.</p>
         */
        public Builder resourceMeta(ResourceMeta resourceMeta) {
            this.putBodyParameter("ResourceMeta", resourceMeta);
            this.resourceMeta = resourceMeta;
            return this;
        }

        /**
         * <p>Sensitive connection properties that require encryption, such as database credentials or an API key for a model service.</p>
         */
        public Builder secrets(java.util.Map<String, String> secrets) {
            this.putBodyParameter("Secrets", secrets);
            this.secrets = secrets;
            return this;
        }

        /**
         * <p>The ID of the workspace. To get this ID, call the <a href="https://help.aliyun.com/document_detail/449124.html"><code>ListWorkspaces</code></a> operation.</p>
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

        @com.aliyun.core.annotation.NameInMap("MaxModelLength")
        private Long maxModelLength;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("SupportReasoning")
        private Boolean supportReasoning;

        @com.aliyun.core.annotation.NameInMap("SupportResponseSchema")
        private Boolean supportResponseSchema;

        @com.aliyun.core.annotation.NameInMap("SupportVision")
        private Boolean supportVision;

        @com.aliyun.core.annotation.NameInMap("ToolCall")
        private Boolean toolCall;

        private Models(Builder builder) {
            this.displayName = builder.displayName;
            this.maxModelLength = builder.maxModelLength;
            this.model = builder.model;
            this.modelType = builder.modelType;
            this.supportReasoning = builder.supportReasoning;
            this.supportResponseSchema = builder.supportResponseSchema;
            this.supportVision = builder.supportVision;
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
         * @return maxModelLength
         */
        public Long getMaxModelLength() {
            return this.maxModelLength;
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
         * @return supportReasoning
         */
        public Boolean getSupportReasoning() {
            return this.supportReasoning;
        }

        /**
         * @return supportResponseSchema
         */
        public Boolean getSupportResponseSchema() {
            return this.supportResponseSchema;
        }

        /**
         * @return supportVision
         */
        public Boolean getSupportVision() {
            return this.supportVision;
        }

        /**
         * @return toolCall
         */
        public Boolean getToolCall() {
            return this.toolCall;
        }

        public static final class Builder {
            private String displayName; 
            private Long maxModelLength; 
            private String model; 
            private String modelType; 
            private Boolean supportReasoning; 
            private Boolean supportResponseSchema; 
            private Boolean supportVision; 
            private Boolean toolCall; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.displayName = model.displayName;
                this.maxModelLength = model.maxModelLength;
                this.model = model.model;
                this.modelType = model.modelType;
                this.supportReasoning = model.supportReasoning;
                this.supportResponseSchema = model.supportResponseSchema;
                this.supportVision = model.supportVision;
                this.toolCall = model.toolCall;
            } 

            /**
             * <p>The display name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>Language model</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The context length.</p>
             * 
             * <strong>example:</strong>
             * <p>4096</p>
             */
            public Builder maxModelLength(Long maxModelLength) {
                this.maxModelLength = maxModelLength;
                return this;
            }

            /**
             * <p>The model identifier. This value corresponds to the <code>model</code> parameter in an OpenAI API request.</p>
             * 
             * <strong>example:</strong>
             * <p>model_001</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The model type.</p>
             * 
             * <strong>example:</strong>
             * <p>LLM</p>
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * <p>Specifies whether the model supports deep reasoning and can output the reasoning process as <code>reasoning_content</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportReasoning(Boolean supportReasoning) {
                this.supportReasoning = supportReasoning;
                return this;
            }

            /**
             * <p>Specifies whether the model supports structured output in the OpenAI API\&quot;s JSON Schema format.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportResponseSchema(Boolean supportResponseSchema) {
                this.supportResponseSchema = supportResponseSchema;
                return this;
            }

            /**
             * <p>Specifies whether the model supports visual understanding.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder supportVision(Boolean supportVision) {
                this.supportVision = supportVision;
                return this;
            }

            /**
             * <p>Specifies whether the model supports tool calling.</p>
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
        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        private ResourceMeta(Builder builder) {
            this.extra = builder.extra;
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
         * @return extra
         */
        public String getExtra() {
            return this.extra;
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
            private String extra; 
            private String instanceId; 
            private String instanceName; 

            private Builder() {
            } 

            private Builder(ResourceMeta model) {
                this.extra = model.extra;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
            } 

            /**
             * <p>Additional configuration information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;vpcId&quot;:&quot;vpc-xxxx&quot;}</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
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
             * 
             * <strong>example:</strong>
             * <p>Test instance.</p>
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
