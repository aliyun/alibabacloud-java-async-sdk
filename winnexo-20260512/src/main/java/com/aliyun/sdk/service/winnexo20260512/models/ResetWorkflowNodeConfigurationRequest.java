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
 * {@link ResetWorkflowNodeConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ResetWorkflowNodeConfigurationRequest</p>
 */
public class ResetWorkflowNodeConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expectedVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expectedVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ResetWorkflowNodeConfigurationRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.expectedVersion = builder.expectedVersion;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetWorkflowNodeConfigurationRequest create() {
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
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ResetWorkflowNodeConfigurationRequest, Builder> {
        private String collaborationGroupId; 
        private Long expectedVersion; 
        private String instanceId; 
        private String nodeId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ResetWorkflowNodeConfigurationRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.expectedVersion = request.expectedVersion;
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
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
        public ResetWorkflowNodeConfigurationRequest build() {
            return new ResetWorkflowNodeConfigurationRequest(this);
        } 

    } 

}
