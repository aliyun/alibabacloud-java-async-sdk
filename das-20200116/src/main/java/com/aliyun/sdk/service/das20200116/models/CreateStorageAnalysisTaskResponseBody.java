// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStorageAnalysisTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStorageAnalysisTaskResponseBody</p>
 */
public class CreateStorageAnalysisTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateStorageAnalysisTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageAnalysisTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request is successful, **Successful** is returned. Otherwise, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateStorageAnalysisTaskResponseBody build() {
            return new CreateStorageAnalysisTaskResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTaskSuccess")
        private Boolean createTaskSuccess;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.createTaskSuccess = builder.createTaskSuccess;
            this.errorMessage = builder.errorMessage;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTaskSuccess
         */
        public Boolean getCreateTaskSuccess() {
            return this.createTaskSuccess;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Boolean createTaskSuccess; 
            private String errorMessage; 
            private String taskId; 

            /**
             * Indicates whether the task is created. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder createTaskSuccess(Boolean createTaskSuccess) {
                this.createTaskSuccess = createTaskSuccess;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
