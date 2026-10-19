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
 * {@link GetTodoRequest} extends {@link RequestModel}
 *
 * <p>GetTodoRequest</p>
 */
public class GetTodoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messageId")
    private String messageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("todoId")
    private String todoId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workItemId")
    private String workItemId;

    private GetTodoRequest(Builder builder) {
        super(builder);
        this.messageId = builder.messageId;
        this.tenantId = builder.tenantId;
        this.todoId = builder.todoId;
        this.workItemId = builder.workItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTodoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
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

    /**
     * @return workItemId
     */
    public String getWorkItemId() {
        return this.workItemId;
    }

    public static final class Builder extends Request.Builder<GetTodoRequest, Builder> {
        private String messageId; 
        private String tenantId; 
        private String todoId; 
        private String workItemId; 

        private Builder() {
            super();
        } 

        private Builder(GetTodoRequest request) {
            super(request);
            this.messageId = request.messageId;
            this.tenantId = request.tenantId;
            this.todoId = request.todoId;
            this.workItemId = request.workItemId;
        } 

        /**
         * <p>assistant 消息ID（按消息反查多条）</p>
         * 
         * <strong>example:</strong>
         * <p>msg-1</p>
         */
        public Builder messageId(String messageId) {
            this.putBodyParameter("messageId", messageId);
            this.messageId = messageId;
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
         * <p>待办ID（单条查询）</p>
         * 
         * <strong>example:</strong>
         * <p>todo_abc123</p>
         */
        public Builder todoId(String todoId) {
            this.putBodyParameter("todoId", todoId);
            this.todoId = todoId;
            return this;
        }

        /**
         * <p>工作项ID（按来源反查多条）</p>
         * 
         * <strong>example:</strong>
         * <p>wi_1</p>
         */
        public Builder workItemId(String workItemId) {
            this.putBodyParameter("workItemId", workItemId);
            this.workItemId = workItemId;
            return this;
        }

        @Override
        public GetTodoRequest build() {
            return new GetTodoRequest(this);
        } 

    } 

}
