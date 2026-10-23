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
 * {@link SubmitTodoResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitTodoResponseBody</p>
 */
public class SubmitTodoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("completedAt")
    private String completedAt;

    @com.aliyun.core.annotation.NameInMap("completedByUserId")
    private String completedByUserId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("todoId")
    private String todoId;

    private SubmitTodoResponseBody(Builder builder) {
        this.code = builder.code;
        this.completedAt = builder.completedAt;
        this.completedByUserId = builder.completedByUserId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.todoId = builder.todoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTodoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return completedAt
     */
    public String getCompletedAt() {
        return this.completedAt;
    }

    /**
     * @return completedByUserId
     */
    public String getCompletedByUserId() {
        return this.completedByUserId;
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
        private String code; 
        private String completedAt; 
        private String completedByUserId; 
        private String message; 
        private String requestId; 
        private String status; 
        private String todoId; 

        private Builder() {
        } 

        private Builder(SubmitTodoResponseBody model) {
            this.code = model.code;
            this.completedAt = model.completedAt;
            this.completedByUserId = model.completedByUserId;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.todoId = model.todoId;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The completion time in ISO 8601 UTC format. Note that this format differs from other time fields formatted in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12T02:00:00+00:00</p>
         */
        public Builder completedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * <p>The user ID of the user who completed the item.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder completedByUserId(String completedByUserId) {
            this.completedByUserId = completedByUserId;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status after submission. This value is always COMPLETED.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the to-do item.</p>
         * 
         * <strong>example:</strong>
         * <p>todo_abc123</p>
         */
        public Builder todoId(String todoId) {
            this.todoId = todoId;
            return this;
        }

        public SubmitTodoResponseBody build() {
            return new SubmitTodoResponseBody(this);
        } 

    } 

}
