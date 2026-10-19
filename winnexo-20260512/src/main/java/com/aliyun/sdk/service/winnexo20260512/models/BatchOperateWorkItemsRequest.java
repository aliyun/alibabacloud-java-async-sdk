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
 * {@link BatchOperateWorkItemsRequest} extends {@link RequestModel}
 *
 * <p>BatchOperateWorkItemsRequest</p>
 */
public class BatchOperateWorkItemsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("idempotencyKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idempotencyKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workItemIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> workItemIds;

    private BatchOperateWorkItemsRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.idempotencyKey = builder.idempotencyKey;
        this.tenantId = builder.tenantId;
        this.workItemIds = builder.workItemIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchOperateWorkItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return idempotencyKey
     */
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workItemIds
     */
    public java.util.List<String> getWorkItemIds() {
        return this.workItemIds;
    }

    public static final class Builder extends Request.Builder<BatchOperateWorkItemsRequest, Builder> {
        private String action; 
        private String collaborationGroupId; 
        private String idempotencyKey; 
        private String tenantId; 
        private java.util.List<String> workItemIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchOperateWorkItemsRequest request) {
            super(request);
            this.action = request.action;
            this.collaborationGroupId = request.collaborationGroupId;
            this.idempotencyKey = request.idempotencyKey;
            this.tenantId = request.tenantId;
            this.workItemIds = request.workItemIds;
        } 

        /**
         * <p>批量动作</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SCHEDULE</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * <p>协作空间 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>幂等键</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder idempotencyKey(String idempotencyKey) {
            this.putBodyParameter("idempotencyKey", idempotencyKey);
            this.idempotencyKey = idempotencyKey;
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

        /**
         * <p>目标工作项 ID 列表（1~100 个）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder workItemIds(java.util.List<String> workItemIds) {
            String workItemIdsShrink = shrink(workItemIds, "workItemIds", "json");
            this.putBodyParameter("workItemIds", workItemIdsShrink);
            this.workItemIds = workItemIds;
            return this;
        }

        @Override
        public BatchOperateWorkItemsRequest build() {
            return new BatchOperateWorkItemsRequest(this);
        } 

    } 

}
