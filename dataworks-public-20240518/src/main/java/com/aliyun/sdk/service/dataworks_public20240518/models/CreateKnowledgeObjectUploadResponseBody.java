// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateKnowledgeObjectUploadResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKnowledgeObjectUploadResponseBody</p>
 */
public class CreateKnowledgeObjectUploadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateKnowledgeObjectUploadResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeObjectUploadResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateKnowledgeObjectUploadResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business error code, which is used to determine the error type when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data returned when the request is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The request parameters are invalid</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
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

        public CreateKnowledgeObjectUploadResponseBody build() {
            return new CreateKnowledgeObjectUploadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateKnowledgeObjectUploadResponseBody} extends {@link TeaModel}
     *
     * <p>CreateKnowledgeObjectUploadResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiresAt")
        private Long expiresAt;

        @com.aliyun.core.annotation.NameInMap("RequiredHeaders")
        private java.util.Map<String, String> requiredHeaders;

        @com.aliyun.core.annotation.NameInMap("UploadId")
        private String uploadId;

        @com.aliyun.core.annotation.NameInMap("UploadUrl")
        private String uploadUrl;

        private Data(Builder builder) {
            this.expiresAt = builder.expiresAt;
            this.requiredHeaders = builder.requiredHeaders;
            this.uploadId = builder.uploadId;
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
        public Long getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return requiredHeaders
         */
        public java.util.Map<String, String> getRequiredHeaders() {
            return this.requiredHeaders;
        }

        /**
         * @return uploadId
         */
        public String getUploadId() {
            return this.uploadId;
        }

        /**
         * @return uploadUrl
         */
        public String getUploadUrl() {
            return this.uploadUrl;
        }

        public static final class Builder {
            private Long expiresAt; 
            private java.util.Map<String, String> requiredHeaders; 
            private String uploadId; 
            private String uploadUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.expiresAt = model.expiresAt;
                this.requiredHeaders = model.requiredHeaders;
                this.uploadId = model.uploadId;
                this.uploadUrl = model.uploadUrl;
            } 

            /**
             * <p>The expiration time of the UploadUrl, represented as a UNIX timestamp in milliseconds. The maximum validity period is 30 minutes, subject to the upper limit of the OSS signature configuration and the remaining time of the session. This field prevails.</p>
             * 
             * <strong>example:</strong>
             * <p>1792456200000</p>
             */
            public Builder expiresAt(Long expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The HTTP headers that must be included in the direct upload request. The key is the actual header name, and the value is the header value.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Content-Type&quot;:&quot;text/plain&quot;,&quot;Content-MD5&quot;:&quot;1B2M2Y8AsgTpgAmY7PhCfg==&quot;}</p>
             */
            public Builder requiredHeaders(java.util.Map<String, String> requiredHeaders) {
                this.requiredHeaders = requiredHeaders;
                return this;
            }

            /**
             * <p>The identifier of the upload session to be consumed by document creation, model update, or model import tasks. This is not a KnowledgeObjectId or TaskId.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abd</p>
             */
            public Builder uploadId(String uploadId) {
                this.uploadId = uploadId;
                return this;
            }

            /**
             * <p>The temporary direct upload URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.invalid/short-lived-upload">https://example.invalid/short-lived-upload</a></p>
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
