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
 * {@link BatchCancelTodosRequest} extends {@link RequestModel}
 *
 * <p>BatchCancelTodosRequest</p>
 */
public class BatchCancelTodosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("todoIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> todoIds;

    private BatchCancelTodosRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.todoIds = builder.todoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCancelTodosRequest create() {
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
     * @return todoIds
     */
    public java.util.List<String> getTodoIds() {
        return this.todoIds;
    }

    public static final class Builder extends Request.Builder<BatchCancelTodosRequest, Builder> {
        private String tenantId; 
        private java.util.List<String> todoIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchCancelTodosRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.todoIds = request.todoIds;
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
         * <p>The list of to-do IDs. You can specify 1 to 100 IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>todo_abc123</p>
         */
        public Builder todoIds(java.util.List<String> todoIds) {
            String todoIdsShrink = shrink(todoIds, "todoIds", "json");
            this.putBodyParameter("todoIds", todoIdsShrink);
            this.todoIds = todoIds;
            return this;
        }

        @Override
        public BatchCancelTodosRequest build() {
            return new BatchCancelTodosRequest(this);
        } 

    } 

}
