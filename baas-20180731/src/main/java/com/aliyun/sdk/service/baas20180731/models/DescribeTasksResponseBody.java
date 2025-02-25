// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTasksResponseBody</p>
 */
public class DescribeTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeTasksResponseBody(Builder builder) {
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer errorCode; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeTasksResponseBody build() {
            return new DescribeTasksResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Assignee")
        private String assignee;

        @com.aliyun.core.annotation.NameInMap("Handled")
        private Boolean handled;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("RequestTime")
        private Long requestTime;

        @com.aliyun.core.annotation.NameInMap("ResponseTime")
        private String responseTime;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Sender")
        private String sender;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        @com.aliyun.core.annotation.NameInMap("TaskState")
        private String taskState;

        private Result(Builder builder) {
            this.action = builder.action;
            this.assignee = builder.assignee;
            this.handled = builder.handled;
            this.operationType = builder.operationType;
            this.requestTime = builder.requestTime;
            this.responseTime = builder.responseTime;
            this.result = builder.result;
            this.sender = builder.sender;
            this.target = builder.target;
            this.taskId = builder.taskId;
            this.taskState = builder.taskState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return assignee
         */
        public String getAssignee() {
            return this.assignee;
        }

        /**
         * @return handled
         */
        public Boolean getHandled() {
            return this.handled;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return requestTime
         */
        public Long getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return responseTime
         */
        public String getResponseTime() {
            return this.responseTime;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return sender
         */
        public String getSender() {
            return this.sender;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskState
         */
        public String getTaskState() {
            return this.taskState;
        }

        public static final class Builder {
            private String action; 
            private String assignee; 
            private Boolean handled; 
            private String operationType; 
            private Long requestTime; 
            private String responseTime; 
            private String result; 
            private String sender; 
            private String target; 
            private Integer taskId; 
            private String taskState; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Assignee.
             */
            public Builder assignee(String assignee) {
                this.assignee = assignee;
                return this;
            }

            /**
             * Handled.
             */
            public Builder handled(Boolean handled) {
                this.handled = handled;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * RequestTime.
             */
            public Builder requestTime(Long requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * ResponseTime.
             */
            public Builder responseTime(String responseTime) {
                this.responseTime = responseTime;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * Sender.
             */
            public Builder sender(String sender) {
                this.sender = sender;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskState.
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
