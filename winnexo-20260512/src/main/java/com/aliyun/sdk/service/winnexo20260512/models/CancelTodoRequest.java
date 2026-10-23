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
 * {@link CancelTodoRequest} extends {@link RequestModel}
 *
 * <p>CancelTodoRequest</p>
 */
public class CancelTodoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("todoId")
    private String todoId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workItemId")
    private String workItemId;

    private CancelTodoRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.todoId = builder.todoId;
        this.workItemId = builder.workItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelTodoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CancelTodoRequest, Builder> {
        private String tenantId; 
        private String todoId; 
        private String workItemId; 

        private Builder() {
            super();
        } 

        private Builder(CancelTodoRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.todoId = request.todoId;
            this.workItemId = request.workItemId;
        } 

        /**
         * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
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
         * <p>The ID of the to-do item. You must specify either this parameter or workItemId.</p>
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
         * <p>The ID of the work item. You can use this parameter to cancel to-do items in batches by source. You must specify either this parameter or todoId.</p>
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
        public CancelTodoRequest build() {
            return new CancelTodoRequest(this);
        } 

    } 

}
