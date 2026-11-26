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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("idempotencyKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idempotencyKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

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
        this.appToken = builder.appToken;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.idempotencyKey = builder.idempotencyKey;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
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
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
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
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
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
        private String appToken; 
        private String collaborationGroupId; 
        private String idempotencyKey; 
        private String opsUserCode; 
        private String opsUserId; 
        private String tenantId; 
        private java.util.List<String> workItemIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchOperateWorkItemsRequest request) {
            super(request);
            this.action = request.action;
            this.appToken = request.appToken;
            this.collaborationGroupId = request.collaborationGroupId;
            this.idempotencyKey = request.idempotencyKey;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.tenantId = request.tenantId;
            this.workItemIds = request.workItemIds;
        } 

        /**
         * <p>The batch action.</p>
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
         * <p>平台应用 Token（控制台签发）。传入后将以 opsUserId 或 opsUserCode 指定的用户身份执行</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The ID of the collaboration workspace.</p>
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
         * <p>The idempotency key.</p>
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
         * <p>代理用户编码（租户内唯一），仅当应用凭证配置为 source_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>代理用户ID（WINNEXO 平台用户ID），仅当应用凭证配置为 winnexo_uid 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
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
         * <p>The IDs of the target work items. You can specify 1 to 100 IDs.</p>
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
