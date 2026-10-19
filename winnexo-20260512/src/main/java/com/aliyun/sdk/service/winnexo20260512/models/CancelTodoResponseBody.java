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
 * {@link CancelTodoResponseBody} extends {@link TeaModel}
 *
 * <p>CancelTodoResponseBody</p>
 */
public class CancelTodoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cancelledCount")
    private Long cancelledCount;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("todoId")
    private String todoId;

    private CancelTodoResponseBody(Builder builder) {
        this.cancelledCount = builder.cancelledCount;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.todoId = builder.todoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelTodoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cancelledCount
     */
    public Long getCancelledCount() {
        return this.cancelledCount;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return todoId
     */
    public String getTodoId() {
        return this.todoId;
    }

    public static final class Builder {
        private Long cancelledCount; 
        private String code; 
        private String message; 
        private String requestId; 
        private String status; 
        private String todoId; 

        private Builder() {
        } 

        private Builder(CancelTodoResponseBody model) {
            this.cancelledCount = model.cancelledCount;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.todoId = model.todoId;
        } 

        /**
         * <p>作废条数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cancelledCount(Long cancelledCount) {
            this.cancelledCount = cancelledCount;
            return this;
        }

        /**
         * <p>业务状态码；成功为200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>作废后状态</p>
         * 
         * <strong>example:</strong>
         * <p>CANCELLED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>作废的待办ID（按 workItemId 定位时为空）</p>
         * 
         * <strong>example:</strong>
         * <p>todo_abc123</p>
         */
        public Builder todoId(String todoId) {
            this.todoId = todoId;
            return this;
        }

        public CancelTodoResponseBody build() {
            return new CancelTodoResponseBody(this);
        } 

    } 

}
