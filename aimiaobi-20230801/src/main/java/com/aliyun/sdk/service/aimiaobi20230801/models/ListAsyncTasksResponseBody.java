// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAsyncTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListAsyncTasksResponseBody</p>
 */
public class ListAsyncTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListAsyncTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.current = builder.current;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsyncTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer current; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Integer size; 
        private Boolean success; 
        private Integer total; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.current = current;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAsyncTasksResponseBody build() {
            return new ListAsyncTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAsyncTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListAsyncTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("TaskCode")
        private String taskCode;

        @com.aliyun.core.annotation.NameInMap("TaskDefinition")
        private String taskDefinition;

        @com.aliyun.core.annotation.NameInMap("TaskEndTime")
        private String taskEndTime;

        @com.aliyun.core.annotation.NameInMap("TaskErrorMessage")
        private String taskErrorMessage;

        @com.aliyun.core.annotation.NameInMap("TaskExecuteTime")
        private String taskExecuteTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskInnerErrorMessage")
        private String taskInnerErrorMessage;

        @com.aliyun.core.annotation.NameInMap("TaskIntermediateResult")
        private String taskIntermediateResult;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskParam")
        private String taskParam;

        @com.aliyun.core.annotation.NameInMap("TaskProgressMessage")
        private String taskProgressMessage;

        @com.aliyun.core.annotation.NameInMap("TaskResult")
        private String taskResult;

        @com.aliyun.core.annotation.NameInMap("TaskRetryCount")
        private String taskRetryCount;

        @com.aliyun.core.annotation.NameInMap("TaskStartTime")
        private String taskStartTime;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateUser")
        private String updateUser;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.id = builder.id;
            this.taskCode = builder.taskCode;
            this.taskDefinition = builder.taskDefinition;
            this.taskEndTime = builder.taskEndTime;
            this.taskErrorMessage = builder.taskErrorMessage;
            this.taskExecuteTime = builder.taskExecuteTime;
            this.taskId = builder.taskId;
            this.taskInnerErrorMessage = builder.taskInnerErrorMessage;
            this.taskIntermediateResult = builder.taskIntermediateResult;
            this.taskName = builder.taskName;
            this.taskParam = builder.taskParam;
            this.taskProgressMessage = builder.taskProgressMessage;
            this.taskResult = builder.taskResult;
            this.taskRetryCount = builder.taskRetryCount;
            this.taskStartTime = builder.taskStartTime;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
            this.updateTime = builder.updateTime;
            this.updateUser = builder.updateUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return taskCode
         */
        public String getTaskCode() {
            return this.taskCode;
        }

        /**
         * @return taskDefinition
         */
        public String getTaskDefinition() {
            return this.taskDefinition;
        }

        /**
         * @return taskEndTime
         */
        public String getTaskEndTime() {
            return this.taskEndTime;
        }

        /**
         * @return taskErrorMessage
         */
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        /**
         * @return taskExecuteTime
         */
        public String getTaskExecuteTime() {
            return this.taskExecuteTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskInnerErrorMessage
         */
        public String getTaskInnerErrorMessage() {
            return this.taskInnerErrorMessage;
        }

        /**
         * @return taskIntermediateResult
         */
        public String getTaskIntermediateResult() {
            return this.taskIntermediateResult;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskParam
         */
        public String getTaskParam() {
            return this.taskParam;
        }

        /**
         * @return taskProgressMessage
         */
        public String getTaskProgressMessage() {
            return this.taskProgressMessage;
        }

        /**
         * @return taskResult
         */
        public String getTaskResult() {
            return this.taskResult;
        }

        /**
         * @return taskRetryCount
         */
        public String getTaskRetryCount() {
            return this.taskRetryCount;
        }

        /**
         * @return taskStartTime
         */
        public String getTaskStartTime() {
            return this.taskStartTime;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateUser
         */
        public String getUpdateUser() {
            return this.updateUser;
        }

        public static final class Builder {
            private String createTime; 
            private String createUser; 
            private Long id; 
            private String taskCode; 
            private String taskDefinition; 
            private String taskEndTime; 
            private String taskErrorMessage; 
            private String taskExecuteTime; 
            private String taskId; 
            private String taskInnerErrorMessage; 
            private String taskIntermediateResult; 
            private String taskName; 
            private String taskParam; 
            private String taskProgressMessage; 
            private String taskResult; 
            private String taskRetryCount; 
            private String taskStartTime; 
            private Integer taskStatus; 
            private String taskType; 
            private String updateTime; 
            private String updateUser; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * TaskCode.
             */
            public Builder taskCode(String taskCode) {
                this.taskCode = taskCode;
                return this;
            }

            /**
             * TaskDefinition.
             */
            public Builder taskDefinition(String taskDefinition) {
                this.taskDefinition = taskDefinition;
                return this;
            }

            /**
             * TaskEndTime.
             */
            public Builder taskEndTime(String taskEndTime) {
                this.taskEndTime = taskEndTime;
                return this;
            }

            /**
             * TaskErrorMessage.
             */
            public Builder taskErrorMessage(String taskErrorMessage) {
                this.taskErrorMessage = taskErrorMessage;
                return this;
            }

            /**
             * TaskExecuteTime.
             */
            public Builder taskExecuteTime(String taskExecuteTime) {
                this.taskExecuteTime = taskExecuteTime;
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
             * TaskInnerErrorMessage.
             */
            public Builder taskInnerErrorMessage(String taskInnerErrorMessage) {
                this.taskInnerErrorMessage = taskInnerErrorMessage;
                return this;
            }

            /**
             * TaskIntermediateResult.
             */
            public Builder taskIntermediateResult(String taskIntermediateResult) {
                this.taskIntermediateResult = taskIntermediateResult;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskParam.
             */
            public Builder taskParam(String taskParam) {
                this.taskParam = taskParam;
                return this;
            }

            /**
             * TaskProgressMessage.
             */
            public Builder taskProgressMessage(String taskProgressMessage) {
                this.taskProgressMessage = taskProgressMessage;
                return this;
            }

            /**
             * TaskResult.
             */
            public Builder taskResult(String taskResult) {
                this.taskResult = taskResult;
                return this;
            }

            /**
             * TaskRetryCount.
             */
            public Builder taskRetryCount(String taskRetryCount) {
                this.taskRetryCount = taskRetryCount;
                return this;
            }

            /**
             * TaskStartTime.
             */
            public Builder taskStartTime(String taskStartTime) {
                this.taskStartTime = taskStartTime;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateUser.
             */
            public Builder updateUser(String updateUser) {
                this.updateUser = updateUser;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
