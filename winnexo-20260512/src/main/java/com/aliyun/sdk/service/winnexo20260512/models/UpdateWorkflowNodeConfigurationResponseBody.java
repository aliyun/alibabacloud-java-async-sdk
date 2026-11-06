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
         * <p>当前用户是否可编辑此节点</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canEdit(Boolean canEdit) {
            this.canEdit = canEdit;
            return this;
        }

        /**
         * <p>公共业务状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>配置版本；更新或恢复时作为expectedVersion</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder configVersion(Long configVersion) {
            this.configVersion = configVersion;
            return this;
        }

        /**
         * <p>模板默认执行主体</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
         */
        public Builder defaultExecutor(DefaultExecutor defaultExecutor) {
            this.defaultExecutor = defaultExecutor;
            return this;
        }

        /**
         * <p>模板默认模型运行档</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        public Builder defaultModel(String defaultModel) {
            this.defaultModel = defaultModel;
            return this;
        }

        /**
         * <p>模板默认负责人用户ID列表</p>
         * 
         * <strong>example:</strong>
         * <p>[10001]</p>
         */
        public Builder defaultResponsibleUserIds(java.util.List<String> defaultResponsibleUserIds) {
            this.defaultResponsibleUserIds = defaultResponsibleUserIds;
            return this;
        }

        /**
         * <p>当前生效的执行主体</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
         */
        public Builder effectiveExecutor(EffectiveExecutor effectiveExecutor) {
            this.effectiveExecutor = effectiveExecutor;
            return this;
        }

        /**
         * <p>当前生效的模型运行档</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max-plus</p>
         */
        public Builder effectiveModel(String effectiveModel) {
            this.effectiveModel = effectiveModel;
            return this;
        }

        /**
         * <p>当前生效的负责人用户ID列表</p>
         * 
         * <strong>example:</strong>
         * <p>[10001]</p>
         */
        public Builder effectiveResponsibleUserIds(java.util.List<String> effectiveResponsibleUserIds) {
            this.effectiveResponsibleUserIds = effectiveResponsibleUserIds;
            return this;
        }

        /**
         * <p>当前物理计划ID</p>
         * 
         * <strong>example:</strong>
         * <p>inst_2081</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>公共错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>业务节点key</p>
         * 
         * <strong>example:</strong>
         * <p>node_7f3a2c</p>
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>实例覆盖值；字段为null时使用模板默认值</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;model&quot;:&quot;qwen-max-plus&quot;}</p>
         */
        public Builder overrides(Overrides overrides) {
            this.overrides = overrides;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>状态刷新游标，不能作为配置版本</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder stateVersion(Long stateVersion) {
            this.stateVersion = stateVersion;
            return this;
        }

        /**
         * <p>最后配置更新时间ISO8601；从未更新时为空</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T08:00:00Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>最后更新配置的平台用户ID；从未更新时为空</p>
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
             * <p>USER 为正整数平台用户ID字符串；AGENT 为空间数字员工技术名称</p>
             * 
             * <strong>example:</strong>
             * <p>agent_1001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>USER 真人、AGENT 数字员工或历史 SYSTEM 系统执行人；SYSTEM仅用于响应</p>
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
             * <p>USER 为正整数平台用户ID字符串；AGENT 为空间数字员工技术名称</p>
             * 
             * <strong>example:</strong>
             * <p>agent_1001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>USER 真人、AGENT 数字员工或历史 SYSTEM 系统执行人；SYSTEM仅用于响应</p>
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
             * <p>USER 为正整数平台用户ID字符串；AGENT 为空间数字员工技术名称</p>
             * 
             * <strong>example:</strong>
             * <p>agent_1001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>USER 真人、AGENT 数字员工或历史 SYSTEM 系统执行人；SYSTEM仅用于响应</p>
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
             * <p>覆盖执行主体；null为默认</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
             */
            public Builder executor(Executor executor) {
                this.executor = executor;
                return this;
            }

            /**
             * <p>覆盖模型运行档；null为默认</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>覆盖负责人ID列表；null为默认</p>
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
