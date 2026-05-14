// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawTaskResponseBody</p>
 */
public class DescribePolarClawTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Task")
    private Task task;

    private DescribePolarClawTaskResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private String message; 
        private String requestId; 
        private Task task; 

        private Builder() {
        } 

        private Builder(DescribePolarClawTaskResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.task = model.task;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C890995A-CF06-4F4D-8DB8-DD26C2******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Task.
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public DescribePolarClawTaskResponseBody build() {
            return new DescribePolarClawTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarClawTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawTaskResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
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

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarClawTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarClawTaskResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAtMs")
        private Long createdAtMs;

        @com.aliyun.core.annotation.NameInMap("Error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.Map<String, ?> result;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UpdatedAtMs")
        private Long updatedAtMs;

        private Task(Builder builder) {
            this.createdAtMs = builder.createdAtMs;
            this.error = builder.error;
            this.operation = builder.operation;
            this.result = builder.result;
            this.state = builder.state;
            this.taskId = builder.taskId;
            this.updatedAtMs = builder.updatedAtMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return createdAtMs
         */
        public Long getCreatedAtMs() {
            return this.createdAtMs;
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return result
         */
        public java.util.Map<String, ?> getResult() {
            return this.result;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return updatedAtMs
         */
        public Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

        public static final class Builder {
            private Long createdAtMs; 
            private Error error; 
            private String operation; 
            private java.util.Map<String, ?> result; 
            private String state; 
            private String taskId; 
            private Long updatedAtMs; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.createdAtMs = model.createdAtMs;
                this.error = model.error;
                this.operation = model.operation;
                this.result = model.result;
                this.state = model.state;
                this.taskId = model.taskId;
                this.updatedAtMs = model.updatedAtMs;
            } 

            /**
             * CreatedAtMs.
             */
            public Builder createdAtMs(Long createdAtMs) {
                this.createdAtMs = createdAtMs;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.Map<String, ?> result) {
                this.result = result;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * UpdatedAtMs.
             */
            public Builder updatedAtMs(Long updatedAtMs) {
                this.updatedAtMs = updatedAtMs;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
