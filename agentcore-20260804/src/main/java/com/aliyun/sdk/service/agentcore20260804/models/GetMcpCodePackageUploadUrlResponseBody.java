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
 * {@link GetMcpCodePackageUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetMcpCodePackageUploadUrlResponseBody</p>
 */
public class GetMcpCodePackageUploadUrlResponseBody extends TeaModel {
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

    private GetMcpCodePackageUploadUrlResponseBody(Builder builder) {
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

    public static GetMcpCodePackageUploadUrlResponseBody create() {
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

        private Builder(GetMcpCodePackageUploadUrlResponseBody model) {
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
         * <p>The request ID, which is used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public GetMcpCodePackageUploadUrlResponseBody build() {
            return new GetMcpCodePackageUploadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMcpCodePackageUploadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpCodePackageUploadUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("artifactExpiresAt")
        private String artifactExpiresAt;

        @com.aliyun.core.annotation.NameInMap("codePackageToken")
        private String codePackageToken;

        @com.aliyun.core.annotation.NameInMap("expiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private Long maxSize;

        @com.aliyun.core.annotation.NameInMap("uploadMethod")
        private String uploadMethod;

        @com.aliyun.core.annotation.NameInMap("uploadUrl")
        private String uploadUrl;

        private Data(Builder builder) {
            this.artifactExpiresAt = builder.artifactExpiresAt;
            this.codePackageToken = builder.codePackageToken;
            this.expiresAt = builder.expiresAt;
            this.headers = builder.headers;
            this.maxSize = builder.maxSize;
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
         * @return artifactExpiresAt
         */
        public String getArtifactExpiresAt() {
            return this.artifactExpiresAt;
        }

        /**
         * @return codePackageToken
         */
        public String getCodePackageToken() {
            return this.codePackageToken;
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
            private String artifactExpiresAt; 
            private String codePackageToken; 
            private String expiresAt; 
            private java.util.Map<String, String> headers; 
            private Long maxSize; 
            private String uploadMethod; 
            private String uploadUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.artifactExpiresAt = model.artifactExpiresAt;
                this.codePackageToken = model.codePackageToken;
                this.expiresAt = model.expiresAt;
                this.headers = model.headers;
                this.maxSize = model.maxSize;
                this.uploadMethod = model.uploadMethod;
                this.uploadUrl = model.uploadUrl;
            } 

            /**
             * <p>The expiration time of the temporary code package artifact, in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-24T00:00:00Z</p>
             */
            public Builder artifactExpiresAt(String artifactExpiresAt) {
                this.artifactExpiresAt = artifactExpiresAt;
                return this;
            }

            /**
             * <p>The code package upload token.</p>
             * 
             * <strong>example:</strong>
             * <p>upload-token</p>
             */
            public Builder codePackageToken(String codePackageToken) {
                this.codePackageToken = codePackageToken;
                return this;
            }

            /**
             * <p>The expiration time of the presigned upload URL, in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-23T00:15:00Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The HTTP request headers. The key is the header name, and the value is the header content.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Content-Type&quot;:&quot;application/zip&quot;}</p>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The maximum allowed size of the code package to be uploaded, in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>52428800</p>
             */
            public Builder maxSize(Long maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * <p>The HTTP method used to upload the code package.</p>
             * 
             * <strong>example:</strong>
             * <p>PUT</p>
             */
            public Builder uploadMethod(String uploadMethod) {
                this.uploadMethod = uploadMethod;
                return this;
            }

            /**
             * <p>The presigned upload URL for the code package.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/server.zip?Signature=example-signature">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/server.zip?Signature=example-signature</a></p>
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
