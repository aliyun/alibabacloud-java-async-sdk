// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link UpdateWorkflowNodeConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWorkflowNodeConfigurationResponseBody</p>
 */
public class UpdateWorkflowNodeConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("canEdit")
    private Boolean canEdit;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("configVersion")
    private Long configVersion;

    @com.aliyun.core.annotation.NameInMap("defaultExecutor")
    private DefaultExecutor defaultExecutor;

    @com.aliyun.core.annotation.NameInMap("defaultModel")
    private String defaultModel;

    @com.aliyun.core.annotation.NameInMap("defaultResponsibleUserIds")
    private java.util.List<String> defaultResponsibleUserIds;

    @com.aliyun.core.annotation.NameInMap("effectiveExecutor")
    private EffectiveExecutor effectiveExecutor;

    @com.aliyun.core.annotation.NameInMap("effectiveModel")
    private String effectiveModel;

    @com.aliyun.core.annotation.NameInMap("effectiveResponsibleUserIds")
    private java.util.List<String> effectiveResponsibleUserIds;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("overrides")
    private Overrides overrides;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("stateVersion")
    private Long stateVersion;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private Long updatedBy;

    private UpdateWorkflowNodeConfigurationResponseBody(Builder builder) {
        this.canEdit = builder.canEdit;
        this.code = builder.code;
        this.configVersion = builder.configVersion;
        this.defaultExecutor = builder.defaultExecutor;
        this.defaultModel = builder.defaultModel;
        this.defaultResponsibleUserIds = builder.defaultResponsibleUserIds;
        this.effectiveExecutor = builder.effectiveExecutor;
        this.effectiveModel = builder.effectiveModel;
        this.effectiveResponsibleUserIds = builder.effectiveResponsibleUserIds;
        this.instanceId = builder.instanceId;
        this.message = builder.message;
        this.nodeId = builder.nodeId;
        this.overrides = builder.overrides;
        this.requestId = builder.requestId;
        this.stateVersion = builder.stateVersion;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkflowNodeConfigurationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canEdit
     */
    public Boolean getCanEdit() {
        return this.canEdit;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return configVersion
     */
    public Long getConfigVersion() {
        return this.configVersion;
    }

    /**
     * @return defaultExecutor
     */
    public DefaultExecutor getDefaultExecutor() {
        return this.defaultExecutor;
    }

    /**
     * @return defaultModel
     */
    public String getDefaultModel() {
        return this.defaultModel;
    }

    /**
     * @return defaultResponsibleUserIds
     */
    public java.util.List<String> getDefaultResponsibleUserIds() {
        return this.defaultResponsibleUserIds;
    }

    /**
     * @return effectiveExecutor
     */
    public EffectiveExecutor getEffectiveExecutor() {
        return this.effectiveExecutor;
    }

    /**
     * @return effectiveModel
     */
    public String getEffectiveModel() {
        return this.effectiveModel;
    }

    /**
     * @return effectiveResponsibleUserIds
     */
    public java.util.List<String> getEffectiveResponsibleUserIds() {
        return this.effectiveResponsibleUserIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return overrides
     */
    public Overrides getOverrides() {
        return this.overrides;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stateVersion
     */
    public Long getStateVersion() {
        return this.stateVersion;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return updatedBy
     */
    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    public static final class Builder {
        private Boolean canEdit; 
        private String code; 
        private Long configVersion; 
        private DefaultExecutor defaultExecutor; 
        private String defaultModel; 
        private java.util.List<String> defaultResponsibleUserIds; 
        private EffectiveExecutor effectiveExecutor; 
        private String effectiveModel; 
        private java.util.List<String> effectiveResponsibleUserIds; 
        private String instanceId; 
        private String message; 
        private String nodeId; 
        private Overrides overrides; 
        private String requestId; 
        private Long stateVersion; 
        private String updatedAt; 
        private Long updatedBy; 

        private Builder() {
        } 

        private Builder(UpdateWorkflowNodeConfigurationResponseBody model) {
            this.canEdit = model.canEdit;
            this.code = model.code;
            this.configVersion = model.configVersion;
            this.defaultExecutor = model.defaultExecutor;
            this.defaultModel = model.defaultModel;
            this.defaultResponsibleUserIds = model.defaultResponsibleUserIds;
            this.effectiveExecutor = model.effectiveExecutor;
            this.effectiveModel = model.effectiveModel;
            this.effectiveResponsibleUserIds = model.effectiveResponsibleUserIds;
            this.instanceId = model.instanceId;
            this.message = model.message;
            this.nodeId = model.nodeId;
            this.overrides = model.overrides;
            this.requestId = model.requestId;
            this.stateVersion = model.stateVersion;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
        } 

        /**
         * <p>Indicates whether the current user can edit this node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canEdit(Boolean canEdit) {
            this.canEdit = canEdit;
            return this;
        }

        /**
         * <p>The common business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The configuration version. Use this value as the expectedVersion when updating or restoring.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder configVersion(Long configVersion) {
            this.configVersion = configVersion;
            return this;
        }

        /**
         * <p>The default executor defined in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
         */
        public Builder defaultExecutor(DefaultExecutor defaultExecutor) {
            this.defaultExecutor = defaultExecutor;
            return this;
        }

        /**
         * <p>The default model profile defined in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        public Builder defaultModel(String defaultModel) {
            this.defaultModel = defaultModel;
            return this;
        }

        /**
         * <p>The list of user IDs for the default owners defined in the template.</p>
         * 
         * <strong>example:</strong>
         * <p>[10001]</p>
         */
        public Builder defaultResponsibleUserIds(java.util.List<String> defaultResponsibleUserIds) {
            this.defaultResponsibleUserIds = defaultResponsibleUserIds;
            return this;
        }

        /**
         * <p>The currently effective executor.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
         */
        public Builder effectiveExecutor(EffectiveExecutor effectiveExecutor) {
            this.effectiveExecutor = effectiveExecutor;
            return this;
        }

        /**
         * <p>The currently effective model profile.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max-plus</p>
         */
        public Builder effectiveModel(String effectiveModel) {
            this.effectiveModel = effectiveModel;
            return this;
        }

        /**
         * <p>The list of user IDs for the currently effective owners.</p>
         * 
         * <strong>example:</strong>
         * <p>[10001]</p>
         */
        public Builder effectiveResponsibleUserIds(java.util.List<String> effectiveResponsibleUserIds) {
            this.effectiveResponsibleUserIds = effectiveResponsibleUserIds;
            return this;
        }

        /**
         * <p>The ID of the current physical plan.</p>
         * 
         * <strong>example:</strong>
         * <p>inst_2081</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The common error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The key of the business node.</p>
         * 
         * <strong>example:</strong>
         * <p>node_7f3a2c</p>
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The instance override values. If a field is null, the default value defined in the template is used.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;model&quot;:&quot;qwen-max-plus&quot;}</p>
         */
        public Builder overrides(Overrides overrides) {
            this.overrides = overrides;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state refresh cursor. This value cannot be used as the configuration version.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder stateVersion(Long stateVersion) {
            this.stateVersion = stateVersion;
            return this;
        }

        /**
         * <p>The time when the configuration was last updated, in ISO 8601 format. This field is empty if the configuration has never been updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T08:00:00Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The platform user ID of the user who last updated the configuration. This field is empty if the configuration has never been updated.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder updatedBy(Long updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public UpdateWorkflowNodeConfigurationResponseBody build() {
            return new UpdateWorkflowNodeConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkflowNodeConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowNodeConfigurationResponseBody</p>
     */
    public static class DefaultExecutor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private DefaultExecutor(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultExecutor create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(DefaultExecutor model) {
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>The executor ID. If the type is USER, the value is a string representing a positive integer platform user ID. If the type is AGENT, the value is the technical name of the digital worker in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>agent_1001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The executor type. Valid values: USER (a human user), AGENT (a digital worker), and SYSTEM (a legacy system executor). The SYSTEM value is used only in responses.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DefaultExecutor build() {
                return new DefaultExecutor(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowNodeConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowNodeConfigurationResponseBody</p>
     */
    public static class EffectiveExecutor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private EffectiveExecutor(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveExecutor create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(EffectiveExecutor model) {
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>The executor ID. If the type is USER, the value is a string representing a positive integer platform user ID. If the type is AGENT, the value is the technical name of the digital worker in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>agent_1001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The executor type. Valid values: USER (a human user), AGENT (a digital worker), and SYSTEM (a legacy system executor). The SYSTEM value is used only in responses.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EffectiveExecutor build() {
                return new EffectiveExecutor(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowNodeConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowNodeConfigurationResponseBody</p>
     */
    public static class Executor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Executor(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executor create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(Executor model) {
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>The executor ID. If the type is USER, the value is a string representing a positive integer platform user ID. If the type is AGENT, the value is the technical name of the digital worker in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>agent_1001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The executor type. Valid values: USER (a human user), AGENT (a digital worker), and SYSTEM (a legacy system executor). The SYSTEM value is used only in responses.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Executor build() {
                return new Executor(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkflowNodeConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowNodeConfigurationResponseBody</p>
     */
    public static class Overrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("executor")
        private Executor executor;

        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("responsibleUserIds")
        private java.util.List<Long> responsibleUserIds;

        private Overrides(Builder builder) {
            this.executor = builder.executor;
            this.model = builder.model;
            this.responsibleUserIds = builder.responsibleUserIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Overrides create() {
            return builder().build();
        }

        /**
         * @return executor
         */
        public Executor getExecutor() {
            return this.executor;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return responsibleUserIds
         */
        public java.util.List<Long> getResponsibleUserIds() {
            return this.responsibleUserIds;
        }

        public static final class Builder {
            private Executor executor; 
            private String model; 
            private java.util.List<Long> responsibleUserIds; 

            private Builder() {
            } 

            private Builder(Overrides model) {
                this.executor = model.executor;
                this.model = model.model;
                this.responsibleUserIds = model.responsibleUserIds;
            } 

            /**
             * <p>The overridden executor. A value of null indicates that the default value is used.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
             */
            public Builder executor(Executor executor) {
                this.executor = executor;
                return this;
            }

            /**
             * <p>The overridden model profile. A value of null indicates that the default value is used.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The list of overridden owner IDs. A value of null indicates that the default value is used.</p>
             * 
             * <strong>example:</strong>
             * <p>[10001]</p>
             */
            public Builder responsibleUserIds(java.util.List<Long> responsibleUserIds) {
                this.responsibleUserIds = responsibleUserIds;
                return this;
            }

            public Overrides build() {
                return new Overrides(this);
            } 

        } 

    }
}
