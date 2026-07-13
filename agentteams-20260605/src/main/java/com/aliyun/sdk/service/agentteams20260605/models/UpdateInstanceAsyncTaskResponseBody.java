// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link UpdateInstanceAsyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateInstanceAsyncTaskResponseBody</p>
 */
public class UpdateInstanceAsyncTaskResponseBody extends TeaModel {
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

    private UpdateInstanceAsyncTaskResponseBody(Builder builder) {
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

    public static UpdateInstanceAsyncTaskResponseBody create() {
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

        private Builder(UpdateInstanceAsyncTaskResponseBody model) {
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
         * <p><strong>message</strong></p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p><strong>requestId</strong></p>
         * 
         * <strong>example:</strong>
         * <p>req-xxx</p>
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

        public UpdateInstanceAsyncTaskResponseBody build() {
            return new UpdateInstanceAsyncTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateInstanceAsyncTaskResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateInstanceAsyncTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("CurrentStep")
        private String currentStep;

        @com.aliyun.core.annotation.NameInMap("ModifiedAt")
        private String modifiedAt;

        @com.aliyun.core.annotation.NameInMap("TaskCode")
        private String taskCode;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("WaitingForUserAction")
        private Boolean waitingForUserAction;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.currentStep = builder.currentStep;
            this.modifiedAt = builder.modifiedAt;
            this.taskCode = builder.taskCode;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.waitingForUserAction = builder.waitingForUserAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return currentStep
         */
        public String getCurrentStep() {
            return this.currentStep;
        }

        /**
         * @return modifiedAt
         */
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        /**
         * @return taskCode
         */
        public String getTaskCode() {
            return this.taskCode;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return waitingForUserAction
         */
        public Boolean getWaitingForUserAction() {
            return this.waitingForUserAction;
        }

        public static final class Builder {
            private String createdAt; 
            private String currentStep; 
            private String modifiedAt; 
            private String taskCode; 
            private String taskId; 
            private String taskStatus; 
            private Boolean waitingForUserAction; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.currentStep = model.currentStep;
                this.modifiedAt = model.modifiedAt;
                this.taskCode = model.taskCode;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.waitingForUserAction = model.waitingForUserAction;
            } 

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * CurrentStep.
             */
            public Builder currentStep(String currentStep) {
                this.currentStep = currentStep;
                return this;
            }

            /**
             * ModifiedAt.
             */
            public Builder modifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * WaitingForUserAction.
             */
            public Builder waitingForUserAction(Boolean waitingForUserAction) {
                this.waitingForUserAction = waitingForUserAction;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
