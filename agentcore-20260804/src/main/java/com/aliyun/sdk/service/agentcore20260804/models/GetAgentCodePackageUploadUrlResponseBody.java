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
 * {@link GetAgentCodePackageUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentCodePackageUploadUrlResponseBody</p>
 */
public class GetAgentCodePackageUploadUrlResponseBody extends TeaModel {
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

    private GetAgentCodePackageUploadUrlResponseBody(Builder builder) {
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

    public static GetAgentCodePackageUploadUrlResponseBody create() {
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

        private Builder(GetAgentCodePackageUploadUrlResponseBody model) {
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

        public GetAgentCodePackageUploadUrlResponseBody build() {
            return new GetAgentCodePackageUploadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentCodePackageUploadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentCodePackageUploadUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Long maxSize;

        @com.aliyun.core.annotation.NameInMap("sourceUri")
        private String sourceUri;

        @com.aliyun.core.annotation.NameInMap("uploadMethod")
        private String uploadMethod;

        @com.aliyun.core.annotation.NameInMap("uploadUrl")
        private String uploadUrl;

        private Data(Builder builder) {
            this.expiresAt = builder.expiresAt;
            this.headers = builder.headers;
            this.maxSize = builder.maxSize;
            this.sourceUri = builder.sourceUri;
            this.uploadMethod = builder.uploadMethod;
            this.uploadUrl = builder.uploadUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return maxSize
         */
        public Long getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return sourceUri
         */
        public String getSourceUri() {
            return this.sourceUri;
        }

        /**
         * @return uploadMethod
         */
        public String getUploadMethod() {
            return this.uploadMethod;
        }

        /**
         * @return uploadUrl
         */
        public String getUploadUrl() {
            return this.uploadUrl;
        }

        public static final class Builder {
            private String expiresAt; 
            private java.util.Map<String, String> headers; 
            private Long maxSize; 
            private String sourceUri; 
            private String uploadMethod; 
            private String uploadUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.expiresAt = model.expiresAt;
                this.headers = model.headers;
                this.maxSize = model.maxSize;
                this.sourceUri = model.sourceUri;
                this.uploadMethod = model.uploadMethod;
                this.uploadUrl = model.uploadUrl;
            } 

            /**
             * <p>The expiration time of the upload URL.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-22T00:10:00Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The HTTP headers that must be included in the direct upload request.</p>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The maximum compressed size of the code package.</p>
             * 
             * <strong>example:</strong>
             * <p>500000000</p>
             */
            public Builder maxSize(Long maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * <p>The temporary Object Storage Service (OSS) URI of the code package.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://agentcore-platform-example/code-package-uploads/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip</p>
             */
            public Builder sourceUri(String sourceUri) {
                this.sourceUri = sourceUri;
                return this;
            }

            /**
             * <p>The HTTP method for direct upload.</p>
             * 
             * <strong>example:</strong>
             * <p>PUT</p>
             */
            public Builder uploadMethod(String uploadMethod) {
                this.uploadMethod = uploadMethod;
                return this;
            }

            /**
             * <p>The time-limited presigned upload URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://agentcore-platform-example.oss-cn-hangzhou.aliyuncs.com/code-package-uploads/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip?OSSAccessKeyId=LTAI5tExample****&Expires=1792627800&Signature=ExampleSignature">https://agentcore-platform-example.oss-cn-hangzhou.aliyuncs.com/code-package-uploads/workspaces/ws-a1b2c3d4e5f6/550e8400-e29b-41d4-a716-446655440000/package.zip?OSSAccessKeyId=LTAI5tExample****&amp;Expires=1792627800&amp;Signature=ExampleSignature</a>****</p>
             */
            public Builder uploadUrl(String uploadUrl) {
                this.uploadUrl = uploadUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
