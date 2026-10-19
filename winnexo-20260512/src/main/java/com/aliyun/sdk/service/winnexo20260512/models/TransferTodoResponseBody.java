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
 * {@link TransferTodoResponseBody} extends {@link TeaModel}
 *
 * <p>TransferTodoResponseBody</p>
 */
public class TransferTodoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("targets")
    private java.util.List<Targets> targets;

    @com.aliyun.core.annotation.NameInMap("todoId")
    private String todoId;

    private TransferTodoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.targets = builder.targets;
        this.todoId = builder.todoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferTodoResponseBody create() {
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
     * @return targets
     */
    public java.util.List<Targets> getTargets() {
        return this.targets;
    }

    /**
     * @return todoId
     */
    public String getTodoId() {
        return this.todoId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<Targets> targets; 
        private String todoId; 

        private Builder() {
        } 

        private Builder(TransferTodoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.targets = model.targets;
            this.todoId = model.todoId;
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
         * <p>逐目标处理结果</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            this.targets = targets;
            return this;
        }

        /**
         * <p>待办ID</p>
         * 
         * <strong>example:</strong>
         * <p>todo_abc123</p>
         */
        public Builder todoId(String todoId) {
            this.todoId = todoId;
            return this;
        }

        public TransferTodoResponseBody build() {
            return new TransferTodoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TransferTodoResponseBody} extends {@link TeaModel}
     *
     * <p>TransferTodoResponseBody</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private Targets(Builder builder) {
            this.result = builder.result;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String result; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.result = model.result;
                this.userId = model.userId;
            } 

            /**
             * <p>处理结果：CREATED/REVIVED/ALREADY_PENDING</p>
             * 
             * <strong>example:</strong>
             * <p>CREATED</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>目标用户ID</p>
             * 
             * <strong>example:</strong>
             * <p>43</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
