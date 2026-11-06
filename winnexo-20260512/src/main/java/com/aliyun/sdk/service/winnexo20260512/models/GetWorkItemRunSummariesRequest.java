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
 * {@link GetWorkItemRunSummariesRequest} extends {@link RequestModel}
 *
 * <p>GetWorkItemRunSummariesRequest</p>
 */
public class GetWorkItemRunSummariesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nodeKey")
    private String nodeKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workItemId;

    private GetWorkItemRunSummariesRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.nodeKey = builder.nodeKey;
        this.tenantId = builder.tenantId;
        this.workItemId = builder.workItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkItemRunSummariesRequest create() {
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workItemId
     */
    public String getWorkItemId() {
        return this.workItemId;
    }

    public static final class Builder extends Request.Builder<GetWorkItemRunSummariesRequest, Builder> {
        private String collaborationGroupId; 
        private String nodeKey; 
        private String tenantId; 
        private String workItemId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkItemRunSummariesRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.nodeKey = request.nodeKey;
            this.tenantId = request.tenantId;
            this.workItemId = request.workItemId;
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
         * <p>可选节点key；传入后只返回该节点当前轮次的总结</p>
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

        /**
         * <p>工作项ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wi_0123456789ab4cde</p>
         */
        public Builder workItemId(String workItemId) {
            this.putBodyParameter("workItemId", workItemId);
            this.workItemId = workItemId;
            return this;
        }

        @Override
        public GetWorkItemRunSummariesRequest build() {
            return new GetWorkItemRunSummariesRequest(this);
        } 

    } 

}
