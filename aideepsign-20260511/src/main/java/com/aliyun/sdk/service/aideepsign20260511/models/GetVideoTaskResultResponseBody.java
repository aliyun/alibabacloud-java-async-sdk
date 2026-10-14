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
 * {@link GetVideoTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoTaskResultResponseBody</p>
 */
public class GetVideoTaskResultResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Videos")
    private java.util.List<Videos> videos;

    private GetVideoTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
        this.taskId = builder.taskId;
        this.videos = builder.videos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoTaskResultResponseBody create() {
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
     * @return videos
     */
    public java.util.List<Videos> getVideos() {
        return this.videos;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 
        private String taskId; 
        private java.util.List<Videos> videos; 

        private Builder() {
        } 

        private Builder(GetVideoTaskResultResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
            this.taskId = model.taskId;
            this.videos = model.videos;
        } 

        /**
         * <p><strong>Business error code.</strong> Returns &quot;OK&quot; if the request succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
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
         * <p>The cause of the failure. This field is returned only when the task status is failed.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task status. Valid values: running, succeeded, and failed. Set the polling interval to at least 5 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
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

        /**
         * <p>The list of video information.</p>
         */
        public Builder videos(java.util.List<Videos> videos) {
            this.videos = videos;
            return this;
        }

        public GetVideoTaskResultResponseBody build() {
            return new GetVideoTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoTaskResultResponseBody</p>
     */
    public static class Videos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectKey")
        private String objectKey;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Videos(Builder builder) {
            this.objectKey = builder.objectKey;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Videos create() {
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

            private Builder(Videos model) {
                this.objectKey = model.objectKey;
                this.url = model.url;
            } 

            /**
             * <p>The OSS key of the output object.</p>
             * 
             * <strong>example:</strong>
             * <p>ai_deep_sign/1192853035118460/image-generation/2026/06/25/024d6974-1b14-4741-8919-9d02b7e3901b.mp4</p>
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * <p>The presigned download URL of the video stored in OSS after C2PA signing.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://duguang-database-public.oss-cn-hangzhou.aliyuncs.com/cosmetic_plicense_init/024d6974-1b14-4741-8919-9d02b7e3901b.mp4">http://duguang-database-public.oss-cn-hangzhou.aliyuncs.com/cosmetic_plicense_init/024d6974-1b14-4741-8919-9d02b7e3901b.mp4</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Videos build() {
                return new Videos(this);
            } 

        } 

    }
}
