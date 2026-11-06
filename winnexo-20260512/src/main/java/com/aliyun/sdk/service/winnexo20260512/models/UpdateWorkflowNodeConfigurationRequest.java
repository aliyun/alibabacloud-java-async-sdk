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
 * {@link UpdateWorkflowNodeConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkflowNodeConfigurationRequest</p>
 */
public class UpdateWorkflowNodeConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("executor")
    private Executor executor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expectedVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expectedVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("responsibleUserIds")
    private java.util.List<Long> responsibleUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateWorkflowNodeConfigurationRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.executor = builder.executor;
        this.expectedVersion = builder.expectedVersion;
        this.instanceId = builder.instanceId;
        this.model = builder.model;
        this.nodeId = builder.nodeId;
        this.responsibleUserIds = builder.responsibleUserIds;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkflowNodeConfigurationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return executor
     */
    public Executor getExecutor() {
        return this.executor;
    }

    /**
     * @return expectedVersion
     */
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return responsibleUserIds
     */
    public java.util.List<Long> getResponsibleUserIds() {
        return this.responsibleUserIds;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<UpdateWorkflowNodeConfigurationRequest, Builder> {
        private String collaborationGroupId; 
        private Executor executor; 
        private Long expectedVersion; 
        private String instanceId; 
        private String model; 
        private String nodeId; 
        private java.util.List<Long> responsibleUserIds; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkflowNodeConfigurationRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.executor = request.executor;
            this.expectedVersion = request.expectedVersion;
            this.instanceId = request.instanceId;
            this.model = request.model;
            this.nodeId = request.nodeId;
            this.responsibleUserIds = request.responsibleUserIds;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>协作空间ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_9401</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>节点执行人；省略保持，null恢复默认；与负责人、模型至少修改一项</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;AGENT&quot;,&quot;id&quot;:&quot;agent_1001&quot;}</p>
         */
        public Builder executor(Executor executor) {
            String executorShrink = shrink(executor, "executor", "json");
            this.putBodyParameter("executor", executorShrink);
            this.executor = executor;
            return this;
        }

        /**
         * <p>读取接口返回的configVersion；非负整数；版本冲突须刷新</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder expectedVersion(Long expectedVersion) {
            this.putBodyParameter("expectedVersion", expectedVersion);
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * <p>当前物理计划ID（planId）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inst_2081</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>模型模式；quick归一化standard；省略保持，null恢复默认</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>业务节点key（nodeKey）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>node_7f3a2c</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("nodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>节点负责人用户ID列表，非空正整数数组；省略保持，null恢复默认</p>
         * 
         * <strong>example:</strong>
         * <p>[10001]</p>
         */
        public Builder responsibleUserIds(java.util.List<Long> responsibleUserIds) {
            String responsibleUserIdsShrink = shrink(responsibleUserIds, "responsibleUserIds", "json");
            this.putBodyParameter("responsibleUserIds", responsibleUserIdsShrink);
            this.responsibleUserIds = responsibleUserIds;
            return this;
        }

        /**
         * <p>租户ID；缺省使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public UpdateWorkflowNodeConfigurationRequest build() {
            return new UpdateWorkflowNodeConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkflowNodeConfigurationRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkflowNodeConfigurationRequest</p>
     */
    public static class Executor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>agent_1001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>USER 真人或 AGENT 数字员工</p>
             * <p>This parameter is required.</p>
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
}
