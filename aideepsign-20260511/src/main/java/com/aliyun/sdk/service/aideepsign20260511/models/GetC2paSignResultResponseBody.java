// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link GetC2paSignResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetC2paSignResultResponseBody</p>
 */
public class GetC2paSignResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Long failedCount;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ReportFileUrl")
    private String reportFileUrl;

    @com.aliyun.core.annotation.NameInMap("ReportObjectKey")
    private String reportObjectKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignedFileUrl")
    private String signedFileUrl;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SucceededCount")
    private Long succeededCount;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetC2paSignResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.failedCount = builder.failedCount;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.reportFileUrl = builder.reportFileUrl;
        this.reportObjectKey = builder.reportObjectKey;
        this.requestId = builder.requestId;
        this.signedFileUrl = builder.signedFileUrl;
        this.status = builder.status;
        this.succeededCount = builder.succeededCount;
        this.success = builder.success;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetC2paSignResultResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return failedCount
     */
    public Long getFailedCount() {
        return this.failedCount;
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
     * @return reportFileUrl
     */
    public String getReportFileUrl() {
        return this.reportFileUrl;
    }

    /**
     * @return reportObjectKey
     */
    public String getReportObjectKey() {
        return this.reportObjectKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signedFileUrl
     */
    public String getSignedFileUrl() {
        return this.signedFileUrl;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return succeededCount
     */
    public Long getSucceededCount() {
        return this.succeededCount;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String errorCode; 
        private String errorMessage; 
        private Long failedCount; 
        private Integer httpStatusCode; 
        private String message; 
        private String reportFileUrl; 
        private String reportObjectKey; 
        private String requestId; 
        private String signedFileUrl; 
        private String status; 
        private Long succeededCount; 
        private Boolean success; 
        private String taskId; 
        private String taskType; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetC2paSignResultResponseBody model) {
            this.code = model.code;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.failedCount = model.failedCount;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.reportFileUrl = model.reportFileUrl;
            this.reportObjectKey = model.reportObjectKey;
            this.requestId = model.requestId;
            this.signedFileUrl = model.signedFileUrl;
            this.status = model.status;
            this.succeededCount = model.succeededCount;
            this.success = model.success;
            this.taskId = model.taskId;
            this.taskType = model.taskType;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The business error code for the API call. OK is returned when the call succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error code for task failure. This parameter is returned only when Status is FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>C2PA_FORMAT_UNSUPPORTED</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message for task failure. This parameter is returned only when Status is FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>only valid JPEG and PNG source files are supported</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The number of objects that failed to be signed, were skipped, or were terminated in the Bucket task. This parameter is returned only when the Bucket task is in the SUCCEEDED or CANCELED state.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder failedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * <p>The HTTP status code. 200 is returned when the API call succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The additional information. success is returned when the API call succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The temporary download URL returned when a Bucket task enters the CANCELED state and the JSON report is successfully generated. The report covers only the objects discovered before termination.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/c2pa_report.json?Expires=1788000000&Signature=">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/c2pa_report.json?Expires=1788000000&amp;Signature=</a>***</p>
         */
        public Builder reportFileUrl(String reportFileUrl) {
            this.reportFileUrl = reportFileUrl;
            return this;
        }

        /**
         * <p>The object key of the final standard JSON report for the Bucket task. This parameter is returned only when the Bucket task succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-deepsign-signed/047b8305-9572-4eed-b7fb-8588b989b6e5/c2pa_report.json</p>
         */
        public Builder reportObjectKey(String reportObjectKey) {
            this.reportObjectKey = reportObjectKey;
            return this;
        }

        /**
         * <p>The request ID of the OpenAPI call.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The temporary download URL of the signature file. This parameter is returned only when Status is SUCCEEDED.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.oss-cn-hangzhou.aliyuncs.com/">https://example.oss-cn-hangzhou.aliyuncs.com/</a>...</p>
         */
        public Builder signedFileUrl(String signedFileUrl) {
            this.signedFileUrl = signedFileUrl;
            return this;
        }

        /**
         * <p>The task status. Valid values: PROCESSING, SUCCEEDED, and FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The number of successfully signed objects in the Bucket task. This parameter is returned only when the Bucket task is in the SUCCEEDED or CANCELED state.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder succeededCount(Long succeededCount) {
            this.succeededCount = succeededCount;
            return this;
        }

        /**
         * <p>Indicates whether the query call is successful. This value may still be true even if the task itself fails.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The C2PA signing task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7093c29e-f472-4e1e-91c6-a43df7c7382e</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task type. Valid values: FILE and BUCKET.</p>
         * 
         * <strong>example:</strong>
         * <p>BUCKET</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The total number of objects scanned by the Bucket task. This parameter is returned only when the Bucket task is in the SUCCEEDED or CANCELED state.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetC2paSignResultResponseBody build() {
            return new GetC2paSignResultResponseBody(this);
        } 

    } 

}
