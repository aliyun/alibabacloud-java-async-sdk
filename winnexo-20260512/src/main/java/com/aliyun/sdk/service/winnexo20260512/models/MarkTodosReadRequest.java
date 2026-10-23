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
 * {@link MarkTodosReadRequest} extends {@link RequestModel}
 *
 * <p>MarkTodosReadRequest</p>
 */
public class MarkTodosReadRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("markAllRead")
    private Boolean markAllRead;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("todoIds")
    private java.util.List<String> todoIds;

    private MarkTodosReadRequest(Builder builder) {
        super(builder);
        this.markAllRead = builder.markAllRead;
        this.tenantId = builder.tenantId;
        this.todoIds = builder.todoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MarkTodosReadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return markAllRead
     */
    public Boolean getMarkAllRead() {
        return this.markAllRead;
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

    public static final class Builder extends Request.Builder<MarkTodosReadRequest, Builder> {
        private Boolean markAllRead; 
        private String tenantId; 
        private java.util.List<String> todoIds; 

        private Builder() {
            super();
        } 

        private Builder(MarkTodosReadRequest request) {
            super(request);
            this.markAllRead = request.markAllRead;
            this.tenantId = request.tenantId;
            this.todoIds = request.todoIds;
        } 

        /**
         * <p>Specifies whether to mark all to-do items as read. This parameter takes precedence over the todoIds parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder markAllRead(Boolean markAllRead) {
            this.putBodyParameter("markAllRead", markAllRead);
            this.markAllRead = markAllRead;
            return this;
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
         * <p>The list of to-do item IDs. You can specify up to 100 IDs. This parameter is ignored if markAllRead is set to true.</p>
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
        public MarkTodosReadRequest build() {
            return new MarkTodosReadRequest(this);
        } 

    } 

}
