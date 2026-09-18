// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryConversationDetailInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryConversationDetailInfoRequest</p>
 */
public class QueryConversationDetailInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String batchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetailId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String detailId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private QueryConversationDetailInfoRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.detailId = builder.detailId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConversationDetailInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return detailId
     */
    public String getDetailId() {
        return this.detailId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<QueryConversationDetailInfoRequest, Builder> {
        private String batchId; 
        private String detailId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryConversationDetailInfoRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.detailId = request.detailId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The batch ID. This ID is returned by the <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> operation when you import callee data. You can view this ID on the <strong>execution history</strong> page by navigating to <strong>call task management</strong> &gt; <strong>details</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>139*********216</p>
         */
        public Builder batchId(String batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>The detail ID. You can find this ID in the upper-left corner of the page by navigating to <strong>call task management</strong> &gt; <strong>details</strong> &gt; <strong>execution history</strong> &gt; <strong>completed</strong> &gt; <strong>call details</strong>, or get it by calling the <a href="https://help.aliyun.com/document_detail/2926853.html">QueryAiCallDetailPage</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9662*************</p>
         */
        public Builder detailId(String detailId) {
            this.putQueryParameter("DetailId", detailId);
            this.detailId = detailId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The task ID. You can find this ID on the <strong>call task management</strong> page or get it by calling the <a href="https://help.aliyun.com/document_detail/2926799.html">QueryAiCallTaskPage</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>138************</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public QueryConversationDetailInfoRequest build() {
            return new QueryConversationDetailInfoRequest(this);
        } 

    } 

}
