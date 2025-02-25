// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAITaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetAITaskResponseBody</p>
 */
public class GetAITaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskOutput")
    private java.util.Map < String, ? > taskOutput;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private GetAITaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.success = builder.success;
        this.taskId = builder.taskId;
        this.taskOutput = builder.taskOutput;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAITaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskOutput
     */
    public java.util.Map < String, ? > getTaskOutput() {
        return this.taskOutput;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String status; 
        private String statusReason; 
        private String success; 
        private String taskId; 
        private java.util.Map < String, ? > taskOutput; 
        private String taskType; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StatusReason.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
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
         * TaskOutput.
         */
        public Builder taskOutput(java.util.Map < String, ? > taskOutput) {
            this.taskOutput = taskOutput;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GenerateTemplate</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public GetAITaskResponseBody build() {
            return new GetAITaskResponseBody(this);
        } 

    } 

}
