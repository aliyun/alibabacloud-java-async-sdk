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
         * <p>The collaboration workspace ID.</p>
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
         * <p>The key of the starting node for the rerun, which includes fixed planning nodes and business execution nodes.</p>
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
         * <p>The current physical plan ID after the rerun. Rerunning a fixed planning node may generate a new plan. Use this value for subsequent queries.</p>
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
        public RerunWorkflowNodeRequest build() {
            return new RerunWorkflowNodeRequest(this);
        } 

    } 

}
