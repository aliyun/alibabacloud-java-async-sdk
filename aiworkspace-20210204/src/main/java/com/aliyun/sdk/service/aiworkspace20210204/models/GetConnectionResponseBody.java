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
 * {@link GetConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectionResponseBody</p>
 */
public class GetConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.Map<String, String> configs;

    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    private String connectionId;

    @com.aliyun.core.annotation.NameInMap("ConnectionName")
    private String connectionName;

    @com.aliyun.core.annotation.NameInMap("ConnectionType")
    private String connectionType;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Models")
    private java.util.List<Models> models;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceMeta")
    private ResourceMeta resourceMeta;

    @com.aliyun.core.annotation.NameInMap("Secrets")
    private java.util.Map<String, String> secrets;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetConnectionResponseBody(Builder builder) {
        this.accessibility = builder.accessibility;
        this.configs = builder.configs;
        this.connectionId = builder.connectionId;
        this.connectionName = builder.connectionName;
        this.connectionType = builder.connectionType;
        this.creator = builder.creator;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.models = builder.models;
        this.requestId = builder.requestId;
        this.resourceMeta = builder.resourceMeta;
        this.secrets = builder.secrets;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionResponseBody create() {
        return builder().build();
    }

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
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
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
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return models
     */
    public java.util.List<Models> getModels() {
        return this.models;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String accessibility; 
        private java.util.Map<String, String> configs; 
        private String connectionId; 
        private String connectionName; 
        private String connectionType; 
        private String creator; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.List<Models> models; 
        private String requestId; 
        private ResourceMeta resourceMeta; 
        private java.util.Map<String, String> secrets; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetConnectionResponseBody model) {
            this.accessibility = model.accessibility;
            this.configs = model.configs;
            this.connectionId = model.connectionId;
            this.connectionName = model.connectionName;
            this.connectionType = model.connectionType;
            this.creator = model.creator;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.models = model.models;
            this.requestId = model.requestId;
            this.resourceMeta = model.resourceMeta;
            this.secrets = model.secrets;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The resource accessibility. Valid values:</p>
         * <ul>
         * <li>PUBLIC: All members in the workspace can access the workspace.</li>
         * <li>PRIVATE: Only the creator can access the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The connection configuration.</p>
         */
        public Builder configs(java.util.Map<String, String> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The connection ID.</p>
         * 
         * <strong>example:</strong>
         * <p>conn-pai9m***mi47</p>
         */
        public Builder connectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        /**
         * <p>The connection name.</p>
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * <p>The type of the connection. Valid values:</p>
         * <ul>
         * <li>DashScopeConnection: Alibaba Cloud Model Studio connection.</li>
         * <li>OpenLLMConnection: Open source model connection.</li>
         * <li>MilvusConnection: Milvus connection.</li>
         * <li>OpenSearchConnection: OpenSearch connection.</li>
         * <li>LindormConnection: Lindorm connection.</li>
         * <li>ElasticsearchConnection: Elasticsearch connection.</li>
         * <li>HologresConnection: Hologres connection.</li>
         * <li>RDSConnection: RDS connection.</li>
         * <li>CustomConnection: Custom connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OpenSearchConnection</p>
         */
        public Builder connectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        /**
         * <p>The creator of the connection.</p>
         * 
         * <strong>example:</strong>
         * <p>28632***898231</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The connection description.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the connection is created, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-07T07:54:56Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time when the connection is modified, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-07T07:54:56Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The models, which apply to model service connections.</p>
         */
        public Builder models(java.util.List<Models> models) {
            this.models = models;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The instance resource information of the connection, which applies to database connections.</p>
         */
        public Builder resourceMeta(ResourceMeta resourceMeta) {
            this.resourceMeta = resourceMeta;
            return this;
        }

        /**
         * <p>The encrypted configuration, in key-value pairs. Examples: the database logon password and the key of the model connection.</p>
         */
        public Builder secrets(java.util.Map<String, String> secrets) {
            this.secrets = secrets;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11**43</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetConnectionResponseBody build() {
            return new GetConnectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetConnectionResponseBody</p>
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
             * <p>Indicates whether a tool can be called by using ToolCall. Valid values:</p>
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
     * {@link GetConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetConnectionResponseBody</p>
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
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ld-2vc1***v1zaqgzol</p>
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
