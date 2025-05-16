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
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * Configs.
         */
        public Builder configs(java.util.Map<String, String> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * ConnectionId.
         */
        public Builder connectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        /**
         * ConnectionName.
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        /**
         * ConnectionType.
         */
        public Builder connectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Models.
         */
        public Builder models(java.util.List<Models> models) {
            this.models = models;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceMeta.
         */
        public Builder resourceMeta(ResourceMeta resourceMeta) {
            this.resourceMeta = resourceMeta;
            return this;
        }

        /**
         * Secrets.
         */
        public Builder secrets(java.util.Map<String, String> secrets) {
            this.secrets = secrets;
            return this;
        }

        /**
         * WorkspaceId.
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
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * ModelType.
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * ToolCall.
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
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
