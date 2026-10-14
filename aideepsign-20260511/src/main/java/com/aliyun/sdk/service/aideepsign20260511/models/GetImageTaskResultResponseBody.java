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
 * {@link GetImageTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageTaskResultResponseBody</p>
 */
public class GetImageTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List<Images> images;

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

    private GetImageTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.images = builder.images;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageTaskResultResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return images
     */
    public java.util.List<Images> getImages() {
        return this.images;
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

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private java.util.List<Images> images; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(GetImageTaskResultResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.images = model.images;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The business error code. The value <code>OK</code> is returned if the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message. This parameter is returned only when the task status is <code>failed</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance access forbidden.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code. The value <code>200</code> is returned if the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list of generated images. This parameter is returned only when <code>Status</code> is <code>succeeded</code>.</p>
         */
        public Builder images(java.util.List<Images> images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The additional information. The value <code>success</code> is returned if the request succeeds. An error message is returned if the task fails. This parameter is returned only when <code>Status</code> is <code>failed</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
         * <p>The task status. Valid values: <code>pending</code> (waiting), <code>running</code> (in progress), <code>succeeded</code> (completed), <code>failed</code> (failed).</p>
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
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public GetImageTaskResultResponseBody build() {
            return new GetImageTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTaskResultResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectKey")
        private String objectKey;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Images(Builder builder) {
            this.objectKey = builder.objectKey;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String objectKey; 
            private String url; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.objectKey = model.objectKey;
                this.url = model.url;
            } 

            /**
             * <p>The <code>ObjectKey</code> of the image in OSS. You can use this value in subsequent API calls.</p>
             * 
             * <strong>example:</strong>
             * <p>deepsign/123456789/image-generation/abc12345-def6-7890-abcd-ef1234567890.png</p>
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * <p>The pre-signed download URL of the image. The URL is valid for 1 hour.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://bucket.oss-cn-hangzhou.aliyuncs.com/deepsign/123456789/image-generation/abc12345.png?Expires=1718700000&OSSAccessKeyId=">https://bucket.oss-cn-hangzhou.aliyuncs.com/deepsign/123456789/image-generation/abc12345.png?Expires=1718700000&amp;OSSAccessKeyId=</a>...</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
