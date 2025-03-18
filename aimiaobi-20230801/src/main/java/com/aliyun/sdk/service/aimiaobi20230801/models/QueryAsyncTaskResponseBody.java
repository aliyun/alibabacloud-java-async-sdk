// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link QueryAsyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAsyncTaskResponseBody</p>
 */
public class QueryAsyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(QueryAsyncTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

    /**
     * 
     * {@link QueryAsyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAsyncTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("TaskCode")
        private String taskCode;

        @com.aliyun.core.annotation.NameInMap("TaskErrorMessage")
        private String taskErrorMessage;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

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

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateUser")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.taskCode = model.taskCode;
                this.taskErrorMessage = model.taskErrorMessage;
                this.taskId = model.taskId;
                this.taskIntermediateResult = model.taskIntermediateResult;
                this.taskName = model.taskName;
                this.taskParam = model.taskParam;
                this.taskProgressMessage = model.taskProgressMessage;
                this.taskResult = model.taskResult;
                this.taskRetryCount = model.taskRetryCount;
                this.taskStatus = model.taskStatus;
                this.updateTime = model.updateTime;
                this.updateUser = model.updateUser;
            } 

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
