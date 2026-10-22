// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetAgentCodePackageDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentCodePackageDownloadUrlResponseBody</p>
 */
public class GetAgentCodePackageDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetAgentCodePackageDownloadUrlResponseBody(Builder builder) {
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

    public static GetAgentCodePackageDownloadUrlResponseBody create() {
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

        private Builder(GetAgentCodePackageDownloadUrlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>The response message.</p>
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
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAgentCodePackageDownloadUrlResponseBody build() {
            return new GetAgentCodePackageDownloadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentCodePackageDownloadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentCodePackageDownloadUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("crc64")
        private String crc64;

        @com.aliyun.core.annotation.NameInMap("downloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("etag")
        private String etag;

        @com.aliyun.core.annotation.NameInMap("expiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("resourceVersionId")
        private String resourceVersionId;

        private Data(Builder builder) {
            this.crc64 = builder.crc64;
            this.downloadUrl = builder.downloadUrl;
            this.etag = builder.etag;
            this.expiresAt = builder.expiresAt;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.format = builder.format;
            this.resourceVersionId = builder.resourceVersionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return crc64
         */
        public String getCrc64() {
            return this.crc64;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return etag
         */
        public String getEtag() {
            return this.etag;
        }

        /**
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return resourceVersionId
         */
        public String getResourceVersionId() {
            return this.resourceVersionId;
        }

        public static final class Builder {
            private String crc64; 
            private String downloadUrl; 
            private String etag; 
            private String expiresAt; 
            private String fileName; 
            private Long fileSize; 
            private String format; 
            private String resourceVersionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.crc64 = model.crc64;
                this.downloadUrl = model.downloadUrl;
                this.etag = model.etag;
                this.expiresAt = model.expiresAt;
                this.fileName = model.fileName;
                this.fileSize = model.fileSize;
                this.format = model.format;
                this.resourceVersionId = model.resourceVersionId;
            } 

            /**
             * <p>The CRC64 value of the code package object.</p>
             * 
             * <strong>example:</strong>
             * <p>456</p>
             */
            public Builder crc64(String crc64) {
                this.crc64 = crc64;
                return this;
            }

            /**
             * <p>The time-limited, read-only download URL for the code package.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://agentcore-platform-example.oss-cn-hangzhou.aliyuncs.com/code-packages/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip?OSSAccessKeyId=LTAI5tExample****&Expires=1792627800&Signature=ExampleSignature">https://agentcore-platform-example.oss-cn-hangzhou.aliyuncs.com/code-packages/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip?OSSAccessKeyId=LTAI5tExample****&amp;Expires=1792627800&amp;Signature=ExampleSignature</a>****</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The ETag of the code package object.</p>
             * 
             * <strong>example:</strong>
             * <p>fixed-etag</p>
             */
            public Builder etag(String etag) {
                this.etag = etag;
                return this;
            }

            /**
             * <p>The expiration time of the download URL.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-22T00:10:00Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The original file name of the code package.</p>
             * 
             * <strong>example:</strong>
             * <p>main.zip</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The compressed size of the code package.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The format of the code package.</p>
             * 
             * <strong>example:</strong>
             * <p>zip</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The resource version ID corresponding to the currently saved configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder resourceVersionId(String resourceVersionId) {
                this.resourceVersionId = resourceVersionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
