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
 * {@link CompleteCodeBundleResponseBody} extends {@link TeaModel}
 *
 * <p>CompleteCodeBundleResponseBody</p>
 */
public class CompleteCodeBundleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bundleVersion")
    private String bundleVersion;

    @com.aliyun.core.annotation.NameInMap("byteSize")
    private Long byteSize;

    @com.aliyun.core.annotation.NameInMap("codeBundleId")
    private Long codeBundleId;

    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

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

    private CompleteCodeBundleResponseBody(Builder builder) {
        this.bundleVersion = builder.bundleVersion;
        this.byteSize = builder.byteSize;
        this.codeBundleId = builder.codeBundleId;
        this.contentType = builder.contentType;
        this.createdAt = builder.createdAt;
        this.filename = builder.filename;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteCodeBundleResponseBody create() {
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
     * @return byteSize
     */
    public Long getByteSize() {
        return this.byteSize;
    }

    /**
     * @return codeBundleId
     */
    public Long getCodeBundleId() {
        return this.codeBundleId;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
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

    public static final class Builder {
        private String bundleVersion; 
        private Long byteSize; 
        private Long codeBundleId; 
        private String contentType; 
        private String createdAt; 
        private String filename; 
        private Long projectId; 
        private String requestId; 
        private String status; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(CompleteCodeBundleResponseBody model) {
            this.bundleVersion = model.bundleVersion;
            this.byteSize = model.byteSize;
            this.codeBundleId = model.codeBundleId;
            this.contentType = model.contentType;
            this.createdAt = model.createdAt;
            this.filename = model.filename;
            this.projectId = model.projectId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The code bundle version identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bundleVersion(String bundleVersion) {
            this.bundleVersion = bundleVersion;
            return this;
        }

        /**
         * <p>The object size.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder byteSize(Long byteSize) {
            this.byteSize = byteSize;
            return this;
        }

        /**
         * <p>The code bundle ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        public Builder codeBundleId(Long codeBundleId) {
            this.codeBundleId = codeBundleId;
            return this;
        }

        /**
         * <p>The MIME type of the stored code bundle. This is typically application/octet-stream for pre-signed PUT operations.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The time when the record was created, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-27T00:53:46.774Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-cases.zip</p>
         */
        public Builder filename(String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>76851f2b5bf0187fbc29e8bca4</p>
         */
        public Builder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A1F403F-0A85-5578-8B7C-55E3E9408659</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The code bundle status.</p>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the record was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-27T00:53:46.774Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CompleteCodeBundleResponseBody build() {
            return new CompleteCodeBundleResponseBody(this);
        } 

    } 

}
