// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link GetAsyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsyncTaskResponseBody</p>
 */
public class GetAsyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("async_task_id")
    private String asyncTaskId;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("consumed_process")
    private Long consumedProcess;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("err_code")
    private Long errCode;

    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_message")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("failed_process")
    private Long failedProcess;

    @com.aliyun.core.annotation.NameInMap("finished_at")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("skipped_process")
    private Long skippedProcess;

    @com.aliyun.core.annotation.NameInMap("started_at")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("total_process")
    private Long totalProcess;

    @com.aliyun.core.annotation.NameInMap("uncompress_file_list")
    private java.util.List<UncompressedFileInfo> uncompressFileList;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private GetAsyncTaskResponseBody(Builder builder) {
        this.asyncTaskId = builder.asyncTaskId;
        this.category = builder.category;
        this.consumedProcess = builder.consumedProcess;
        this.createdAt = builder.createdAt;
        this.errCode = builder.errCode;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.failedProcess = builder.failedProcess;
        this.finishedAt = builder.finishedAt;
        this.message = builder.message;
        this.skippedProcess = builder.skippedProcess;
        this.startedAt = builder.startedAt;
        this.state = builder.state;
        this.status = builder.status;
        this.totalProcess = builder.totalProcess;
        this.uncompressFileList = builder.uncompressFileList;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncTaskId
     */
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return consumedProcess
     */
    public Long getConsumedProcess() {
        return this.consumedProcess;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return errCode
     */
    public Long getErrCode() {
        return this.errCode;
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
     * @return failedProcess
     */
    public Long getFailedProcess() {
        return this.failedProcess;
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return skippedProcess
     */
    public Long getSkippedProcess() {
        return this.skippedProcess;
    }

    /**
     * @return startedAt
     */
    public String getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalProcess
     */
    public Long getTotalProcess() {
        return this.totalProcess;
    }

    /**
     * @return uncompressFileList
     */
    public java.util.List<UncompressedFileInfo> getUncompressFileList() {
        return this.uncompressFileList;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String asyncTaskId; 
        private String category; 
        private Long consumedProcess; 
        private String createdAt; 
        private Long errCode; 
        private String errorCode; 
        private String errorMessage; 
        private Long failedProcess; 
        private String finishedAt; 
        private String message; 
        private Long skippedProcess; 
        private String startedAt; 
        private String state; 
        private String status; 
        private Long totalProcess; 
        private java.util.List<UncompressedFileInfo> uncompressFileList; 
        private String url; 

        private Builder() {
        } 

        private Builder(GetAsyncTaskResponseBody model) {
            this.asyncTaskId = model.asyncTaskId;
            this.category = model.category;
            this.consumedProcess = model.consumedProcess;
            this.createdAt = model.createdAt;
            this.errCode = model.errCode;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.failedProcess = model.failedProcess;
            this.finishedAt = model.finishedAt;
            this.message = model.message;
            this.skippedProcess = model.skippedProcess;
            this.startedAt = model.startedAt;
            this.state = model.state;
            this.status = model.status;
            this.totalProcess = model.totalProcess;
            this.uncompressFileList = model.uncompressFileList;
            this.url = model.url;
        } 

        /**
         * <p>The ID of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>000e89fb-cf8f-11e9-8ab4-b6e980803a3b</p>
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        /**
         * <p>The custom category of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>album</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The total amount of work that is done in the asynchronous task, such as the number of files that are packaged for package download on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder consumedProcess(Long consumedProcess) {
            this.consumedProcess = consumedProcess;
            return this;
        }

        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2019-03-28T13:03:29.298Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-20T06:51:27.292Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p><warning>This parameter is no longer used. We recommend that you use error_code instead.</warning></p>
         * <p>The error code returned if the asynchronous task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(Long errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error code returned if the asynchronous task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the asynchronous task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request has been failed due to some unknown error. Please try again later.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * failed_process.
         */
        public Builder failedProcess(Long failedProcess) {
            this.failedProcess = failedProcess;
            return this;
        }

        /**
         * <p>The time when the task was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2019-03-28T13:03:29.298Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-20T06:51:27.292Z</p>
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * <p><warning>This parameter is no longer used. We recommend that you use error_message instead.</warning></p>
         * <p>The error message returned if the asynchronous task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request has been failed due to some unknown error. Please try again later.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * skipped_process.
         */
        public Builder skippedProcess(Long skippedProcess) {
            this.skippedProcess = skippedProcess;
            return this;
        }

        /**
         * <p>The time when the task was started. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2019-03-28T13:03:29.298Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-20T06:51:27.292Z</p>
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * <p>The state of the task. Valid values:</p>
         * <ul>
         * <li>Failed</li>
         * <li>Running</li>
         * <li>PartialSucceed</li>
         * <li>Succeed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p><warning>This parameter is no longer used. We recommend that you use state instead.</warning></p>
         * <p>The state of the task. Valid values:</p>
         * <ul>
         * <li>Failed</li>
         * <li>Running</li>
         * <li>PartialSucceed</li>
         * <li>Succeed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The total amount of work to be done in the asynchronous task, such as the number of files to be packaged for package download on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalProcess(Long totalProcess) {
            this.totalProcess = totalProcess;
            return this;
        }

        /**
         * <p>The extracted files.</p>
         */
        public Builder uncompressFileList(java.util.List<UncompressedFileInfo> uncompressFileList) {
            this.uncompressFileList = uncompressFileList;
            return this;
        }

        /**
         * <p>The download URL of the data generated by the asynchronous task, such as the download URL of the packaged files generated by the task of package download on the server.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx">https://data.aliyunpds.com/hz22%2F5d5b986facbec311ef844c25954f96821497b383%2F5d5b986f955410dd991646bb87c6b4e899eff525?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetAsyncTaskResponseBody build() {
            return new GetAsyncTaskResponseBody(this);
        } 

    } 

}
