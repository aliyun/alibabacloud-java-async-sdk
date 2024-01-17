// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAsyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAsyncTaskResponseBody</p>
 */
public class QueryAsyncTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryAsyncTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAsyncTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAsyncTaskResponseBody build() {
            return new QueryAsyncTaskResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUser")
        private String createUser;

        @NameInMap("TaskCode")
        private String taskCode;

        @NameInMap("TaskErrorMessage")
        private String taskErrorMessage;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskIntermediateResult")
        private String taskIntermediateResult;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskParam")
        private String taskParam;

        @NameInMap("TaskProgressMessage")
        private String taskProgressMessage;

        @NameInMap("TaskResult")
        private String taskResult;

        @NameInMap("TaskRetryCount")
        private String taskRetryCount;

        @NameInMap("TaskStatus")
        private Integer taskStatus;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateUser")
        private String updateUser;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.taskCode = builder.taskCode;
            this.taskErrorMessage = builder.taskErrorMessage;
            this.taskId = builder.taskId;
            this.taskIntermediateResult = builder.taskIntermediateResult;
            this.taskName = builder.taskName;
            this.taskParam = builder.taskParam;
            this.taskProgressMessage = builder.taskProgressMessage;
            this.taskResult = builder.taskResult;
            this.taskRetryCount = builder.taskRetryCount;
            this.taskStatus = builder.taskStatus;
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
         * @return taskCode
         */
        public String getTaskCode() {
            return this.taskCode;
        }

        /**
         * @return taskErrorMessage
         */
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
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
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
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
            private String taskCode; 
            private String taskErrorMessage; 
            private String taskId; 
            private String taskIntermediateResult; 
            private String taskName; 
            private String taskParam; 
            private String taskProgressMessage; 
            private String taskResult; 
            private String taskRetryCount; 
            private Integer taskStatus; 
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
             * TaskCode.
             */
            public Builder taskCode(String taskCode) {
                this.taskCode = taskCode;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
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
             * TaskStatus.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
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
