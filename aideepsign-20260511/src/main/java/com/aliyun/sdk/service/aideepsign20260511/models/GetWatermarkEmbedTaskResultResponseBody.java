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
 * {@link GetWatermarkEmbedTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetWatermarkEmbedTaskResultResponseBody</p>
 */
public class GetWatermarkEmbedTaskResultResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private GetWatermarkEmbedTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
        this.taskId = builder.taskId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWatermarkEmbedTaskResultResponseBody create() {
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
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 
        private String taskId; 
        private String url; 

        private Builder() {
        } 

        private Builder(GetWatermarkEmbedTaskResultResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
            this.taskId = model.taskId;
            this.url = model.url;
        } 

        /**
         * <p><strong>The business error code.</strong> The value OK is returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p><strong>The HTTP status code.</strong> The value 200 is returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The failure reason when the task fails. This parameter is returned only when Status is failed.</p>
         * 
         * <strong>example:</strong>
         * <p>poll timeout: no result within 10m0s</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task status. The processing time is approximately equal to the media duration. Valid values:</p>
         * <ul>
         * <li>pending: The task is waiting.</li>
         * <li>running: The task is running.</li>
         * <li>succeeded: The task succeeded.</li>
         * <li>failed: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The invisible watermark embedding task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The pre-signed URL for accessing the watermarked file. This parameter is returned only when Status is succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-bucket.example.com/aideepsign/">https://oss-bucket.example.com/aideepsign/</a>...</p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetWatermarkEmbedTaskResultResponseBody build() {
            return new GetWatermarkEmbedTaskResultResponseBody(this);
        } 

    } 

}
