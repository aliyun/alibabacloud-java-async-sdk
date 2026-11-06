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
 * {@link RerunWorkflowNodeRequest} extends {@link RequestModel}
 *
 * <p>RerunWorkflowNodeRequest</p>
 */
public class RerunWorkflowNodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeKey")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String nodeKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("planId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String planId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private RerunWorkflowNodeRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.nodeKey = builder.nodeKey;
        this.planId = builder.planId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RerunWorkflowNodeRequest create() {
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
     * @return nodeKey
     */
    public String getNodeKey() {
        return this.nodeKey;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<RerunWorkflowNodeRequest, Builder> {
        private String collaborationGroupId; 
        private String nodeKey; 
        private String planId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(RerunWorkflowNodeRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.nodeKey = request.nodeKey;
            this.planId = request.planId;
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
         * <p>重跑起始节点 key，包含固定规划节点和业务执行节点</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        public Builder nodeKey(String nodeKey) {
            this.putBodyParameter("nodeKey", nodeKey);
            this.nodeKey = nodeKey;
            return this;
        }

        /**
         * <p>工作项当前物理计划ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>plan_v3</p>
         */
        public Builder planId(String planId) {
            this.putBodyParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>租户ID，缺省使用调用方默认租户</p>
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
        public RerunWorkflowNodeRequest build() {
            return new RerunWorkflowNodeRequest(this);
        } 

    } 

}
