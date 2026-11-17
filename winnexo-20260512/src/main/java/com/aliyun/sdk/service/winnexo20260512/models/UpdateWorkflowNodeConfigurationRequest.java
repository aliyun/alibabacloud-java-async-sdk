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
         * <p>The ID of the collaboration workspace.</p>
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
         * <p>The executor of the node. If this parameter is omitted, the current value is retained. If this parameter is set to null, the default value is restored. You must modify at least one of the owner, model, or executor.</p>
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
         * <p>The configuration version returned by the read operation. The value must be a non-negative integer. If a version conflict occurs, you must refresh the version.</p>
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
         * <p>The ID of the current physical plan.</p>
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
         * <p>The model mode. The quick value is normalized to standard. If this parameter is omitted, the current value is retained. If this parameter is set to null, the default value is restored.</p>
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
         * <p>The key of the business node.</p>
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
         * <p>The list of user IDs for the node owners. The value must be a non-empty array of positive integers. If this parameter is omitted, the current value is retained. If this parameter is set to null, the default value is restored.</p>
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
         * <p>The tenant ID. If not specified, the default tenant of the caller is used.</p>
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
             * <p>The executor ID. If the type is USER, the value is a string representing a positive integer platform user ID. If the type is AGENT, the value is the technical name of the digital worker in the workspace.</p>
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
             * <p>The executor type. Valid values: USER (a human user) and AGENT (a digital worker).</p>
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
