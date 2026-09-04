// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

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
 * {@link CreateCodeBundleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCodeBundleResponseBody</p>
 */
public class CreateCodeBundleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bundleVersion")
    private String bundleVersion;

    @com.aliyun.core.annotation.NameInMap("codeBundleId")
    private Long codeBundleId;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("filename")
    private String filename;

    @com.aliyun.core.annotation.NameInMap("projectId")
    private Long projectId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("upload")
    private Upload upload;

    private CreateCodeBundleResponseBody(Builder builder) {
        this.bundleVersion = builder.bundleVersion;
        this.codeBundleId = builder.codeBundleId;
        this.createdAt = builder.createdAt;
        this.filename = builder.filename;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
        this.upload = builder.upload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCodeBundleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bundleVersion
     */
    public String getBundleVersion() {
        return this.bundleVersion;
    }

    /**
     * @return codeBundleId
     */
    public Long getCodeBundleId() {
        return this.codeBundleId;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
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
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return upload
     */
    public Upload getUpload() {
        return this.upload;
    }

    public static final class Builder {
        private String bundleVersion; 
        private Long codeBundleId; 
        private String createdAt; 
        private String filename; 
        private Long projectId; 
        private String requestId; 
        private String status; 
        private String updatedAt; 
        private Upload upload; 

        private Builder() {
        } 

        private Builder(CreateCodeBundleResponseBody model) {
            this.bundleVersion = model.bundleVersion;
            this.codeBundleId = model.codeBundleId;
            this.createdAt = model.createdAt;
            this.filename = model.filename;
            this.projectId = model.projectId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
            this.upload = model.upload;
        } 

        /**
         * bundleVersion.
         */
        public Builder bundleVersion(String bundleVersion) {
            this.bundleVersion = bundleVersion;
            return this;
        }

        /**
         * codeBundleId.
         */
        public Builder codeBundleId(Long codeBundleId) {
            this.codeBundleId = codeBundleId;
            return this;
        }

        /**
         * <p>代码包创建时间（RFC3339）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-27T00:53:46.774Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * filename.
         */
        public Builder filename(String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>代码包更新时间（RFC3339）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-27T00:53:46.774Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * upload.
         */
        public Builder upload(Upload upload) {
            this.upload = upload;
            return this;
        }

        public CreateCodeBundleResponseBody build() {
            return new CreateCodeBundleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateCodeBundleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateCodeBundleResponseBody</p>
     */
    public static class Upload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("putUrl")
        private String putUrl;

        @com.aliyun.core.annotation.NameInMap("requiredContentType")
        private String requiredContentType;

        private Upload(Builder builder) {
            this.expiresAt = builder.expiresAt;
            this.method = builder.method;
            this.putUrl = builder.putUrl;
            this.requiredContentType = builder.requiredContentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Upload create() {
            return builder().build();
        }

        /**
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return putUrl
         */
        public String getPutUrl() {
            return this.putUrl;
        }

        /**
         * @return requiredContentType
         */
        public String getRequiredContentType() {
            return this.requiredContentType;
        }

        public static final class Builder {
            private String expiresAt; 
            private String method; 
            private String putUrl; 
            private String requiredContentType; 

            private Builder() {
            } 

            private Builder(Upload model) {
                this.expiresAt = model.expiresAt;
                this.method = model.method;
                this.putUrl = model.putUrl;
                this.requiredContentType = model.requiredContentType;
            } 

            /**
             * <p>凭证过期时间（RFC3339）</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-03T05:58:47.88987539Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>HTTP method for the presigned URL.</p>
             * 
             * <strong>example:</strong>
             * <p>PUT</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>Presigned OSS PUT URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://codesec-beijing.oss-cn-beijing.aliyuncs.com/87766767%2F1001667%2F1004171.zip">https://codesec-beijing.oss-cn-beijing.aliyuncs.com/87766767%2F1001667%2F1004171.zip</a></p>
             */
            public Builder putUrl(String putUrl) {
                this.putUrl = putUrl;
                return this;
            }

            /**
             * <p>Clients MUST send this <strong><code>Content-Type</code></strong> on PUT when <strong><code>put_url</code></strong> is set.</p>
             * 
             * <strong>example:</strong>
             * <p>application/octet-stream</p>
             */
            public Builder requiredContentType(String requiredContentType) {
                this.requiredContentType = requiredContentType;
                return this;
            }

            public Upload build() {
                return new Upload(this);
            } 

        } 

    }
}
