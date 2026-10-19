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
 * {@link CloseWorkflowTodosRequest} extends {@link RequestModel}
 *
 * <p>CloseWorkflowTodosRequest</p>
 */
public class CloseWorkflowTodosRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceWorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceWorkflowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CloseWorkflowTodosRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.sourceWorkflowId = builder.sourceWorkflowId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseWorkflowTodosRequest create() {
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
     * @return sourceWorkflowId
     */
    public String getSourceWorkflowId() {
        return this.sourceWorkflowId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CloseWorkflowTodosRequest, Builder> {
        private String collaborationGroupId; 
        private String sourceWorkflowId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CloseWorkflowTodosRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.sourceWorkflowId = request.sourceWorkflowId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>协作空间 ID（命中范围限定该空间内）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_123</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>工作流 ID（run 粒度）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wf-1</p>
         */
        public Builder sourceWorkflowId(String sourceWorkflowId) {
            this.putBodyParameter("sourceWorkflowId", sourceWorkflowId);
            this.sourceWorkflowId = sourceWorkflowId;
            return this;
        }

        /**
         * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
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
        public CloseWorkflowTodosRequest build() {
            return new CloseWorkflowTodosRequest(this);
        } 

    } 

}
