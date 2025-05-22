// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
    private java.util.Map<String, ?> taskOutput;

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
    public java.util.Map<String, ?> getTaskOutput() {
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
        private java.util.Map<String, ?> taskOutput; 
        private String taskType; 

        private Builder() {
        } 

        private Builder(GetAITaskResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.statusReason = model.statusReason;
            this.success = model.success;
            this.taskId = model.taskId;
            this.taskOutput = model.taskOutput;
            this.taskType = model.taskType;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Forbidden</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>You are not authorized to complete this action.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the AI task.</p>
         * <ul>
         * <li>PENDING</li>
         * <li>WAITING</li>
         * <li>RUNNING</li>
         * <li>SUCCESS</li>
         * <li>FAILURE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAILURE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The reason why the AI task is in the state.</p>
         * 
         * <strong>example:</strong>
         * <p>Handler execution unexpected failure</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the AI task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-asasas*****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The outputs of the AI task. The outputs include the template.</p>
         * <ul>
         * <li></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;Result&quot;: {
         *     &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,
         * }</p>
         */
        public Builder taskOutput(java.util.Map<String, ?> taskOutput) {
            this.taskOutput = taskOutput;
            return this;
        }

        /**
         * <p>The type of the AI task.</p>
         * <ul>
         * <li>GenerateTemplate: The AI task is used to generate a template.</li>
         * <li>FixTemplate: The AI task is used to fix a template.</li>
         * </ul>
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
