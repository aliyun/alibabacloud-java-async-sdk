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
 * {@link CreateTodoResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTodoResponseBody</p>
 */
public class CreateTodoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("assignees")
    private java.util.List<Assignees> assignees;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("todoId")
    private String todoId;

    private CreateTodoResponseBody(Builder builder) {
        this.assignees = builder.assignees;
        this.code = builder.code;
        this.gmtCreate = builder.gmtCreate;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.todoId = builder.todoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTodoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assignees
     */
    public java.util.List<Assignees> getAssignees() {
        return this.assignees;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
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
        private java.util.List<Assignees> assignees; 
        private String code; 
        private String gmtCreate; 
        private String message; 
        private String requestId; 
        private String status; 
        private String todoId; 

        private Builder() {
        } 

        private Builder(CreateTodoResponseBody model) {
            this.assignees = model.assignees;
            this.code = model.code;
            this.gmtCreate = model.gmtCreate;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.todoId = model.todoId;
        } 

        /**
         * <p>The list of assignees.</p>
         */
        public Builder assignees(java.util.List<Assignees> assignees) {
            this.assignees = assignees;
            return this;
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
         * <p>The creation time in ISO 8601 format with a time zone. This format differs from the UTC+8 format string used in the list and details.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12T15:00:00+08:00</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
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
         * <p>The status of the to-do item.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the created to-do item.</p>
         * 
         * <strong>example:</strong>
         * <p>todo_abc123</p>
         */
        public Builder todoId(String todoId) {
            this.todoId = todoId;
            return this;
        }

        public CreateTodoResponseBody build() {
            return new CreateTodoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTodoResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTodoResponseBody</p>
     */
    public static class Assignees extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assigneeUserId")
        private String assigneeUserId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Assignees(Builder builder) {
            this.assigneeUserId = builder.assigneeUserId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assignees create() {
            return builder().build();
        }

        /**
         * @return assigneeUserId
         */
        public String getAssigneeUserId() {
            return this.assigneeUserId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String assigneeUserId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Assignees model) {
                this.assigneeUserId = model.assigneeUserId;
                this.status = model.status;
            } 

            /**
             * <p>The user ID of the assignee.</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder assigneeUserId(String assigneeUserId) {
                this.assigneeUserId = assigneeUserId;
                return this;
            }

            /**
             * <p>The processing status of the assignee.</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Assignees build() {
                return new Assignees(this);
            } 

        } 

    }
}
