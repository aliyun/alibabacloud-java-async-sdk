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
 * {@link TransferTodoRequest} extends {@link RequestModel}
 *
 * <p>TransferTodoRequest</p>
 */
public class TransferTodoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("targetUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> targetUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("todoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String todoId;

    private TransferTodoRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.targetUserIds = builder.targetUserIds;
        this.tenantId = builder.tenantId;
        this.todoId = builder.todoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferTodoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return targetUserIds
     */
    public java.util.List<String> getTargetUserIds() {
        return this.targetUserIds;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return todoId
     */
    public String getTodoId() {
        return this.todoId;
    }

    public static final class Builder extends Request.Builder<TransferTodoRequest, Builder> {
        private String comment; 
        private java.util.List<String> targetUserIds; 
        private String tenantId; 
        private String todoId; 

        private Builder() {
            super();
        } 

        private Builder(TransferTodoRequest request) {
            super(request);
            this.comment = request.comment;
            this.targetUserIds = request.targetUserIds;
            this.tenantId = request.tenantId;
            this.todoId = request.todoId;
        } 

        /**
         * <p>交接说明</p>
         * 
         * <strong>example:</strong>
         * <p>请继续处理</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>转办目标用户ID列表（1~100）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        public Builder targetUserIds(java.util.List<String> targetUserIds) {
            String targetUserIdsShrink = shrink(targetUserIds, "targetUserIds", "json");
            this.putBodyParameter("targetUserIds", targetUserIdsShrink);
            this.targetUserIds = targetUserIds;
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
         * <p>待办ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>todo_abc123</p>
         */
        public Builder todoId(String todoId) {
            this.putBodyParameter("todoId", todoId);
            this.todoId = todoId;
            return this;
        }

        @Override
        public TransferTodoRequest build() {
            return new TransferTodoRequest(this);
        } 

    } 

}
