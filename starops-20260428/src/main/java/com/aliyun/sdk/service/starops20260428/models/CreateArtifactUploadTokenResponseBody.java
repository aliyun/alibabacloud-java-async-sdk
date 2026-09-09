// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link CreateArtifactUploadTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateArtifactUploadTokenResponseBody</p>
 */
public class CreateArtifactUploadTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessId")
    private String accessId;

    @com.aliyun.core.annotation.NameInMap("artifactPath")
    private String artifactPath;

    @com.aliyun.core.annotation.NameInMap("dir")
    private String dir;

    @com.aliyun.core.annotation.NameInMap("expire")
    private Long expire;

    @com.aliyun.core.annotation.NameInMap("host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("maxSize")
    private Long maxSize;

    @com.aliyun.core.annotation.NameInMap("policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("signature")
    private String signature;

    @com.aliyun.core.annotation.NameInMap("successActionStatus")
    private String successActionStatus;

    private CreateArtifactUploadTokenResponseBody(Builder builder) {
        this.accessId = builder.accessId;
        this.artifactPath = builder.artifactPath;
        this.dir = builder.dir;
        this.expire = builder.expire;
        this.host = builder.host;
        this.maxSize = builder.maxSize;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
        this.successActionStatus = builder.successActionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateArtifactUploadTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
    }

    /**
     * @return artifactPath
     */
    public String getArtifactPath() {
        return this.artifactPath;
    }

    /**
     * @return dir
     */
    public String getDir() {
        return this.dir;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return maxSize
     */
    public Long getMaxSize() {
        return this.maxSize;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return successActionStatus
     */
    public String getSuccessActionStatus() {
        return this.successActionStatus;
    }

    public static final class Builder {
        private String accessId; 
        private String artifactPath; 
        private String dir; 
        private Long expire; 
        private String host; 
        private Long maxSize; 
        private String policy; 
        private String requestId; 
        private String signature; 
        private String successActionStatus; 

        private Builder() {
        } 

        private Builder(CreateArtifactUploadTokenResponseBody model) {
            this.accessId = model.accessId;
            this.artifactPath = model.artifactPath;
            this.dir = model.dir;
            this.expire = model.expire;
            this.host = model.host;
            this.maxSize = model.maxSize;
            this.policy = model.policy;
            this.requestId = model.requestId;
            this.signature = model.signature;
            this.successActionStatus = model.successActionStatus;
        } 

        /**
         * <p>The AccessKey ID used for OSS uploads.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI******</p>
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * <p>The normalized logical upload directory on the server side, relative to the digital human artifact root directory.</p>
         * 
         * <strong>example:</strong>
         * <p>upload/2026-05-25/</p>
         */
        public Builder artifactPath(String artifactPath) {
            this.artifactPath = artifactPath;
            return this;
        }

        /**
         * <p>The allowed OSS object prefix for uploads.</p>
         * 
         * <strong>example:</strong>
         * <p>agents/123/sample-agent/home/starops/upload/2026-05-25/</p>
         */
        public Builder dir(String dir) {
            this.dir = dir;
            return this;
        }

        /**
         * <p>The expiration time of the upload credential. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1770000000</p>
         */
        public Builder expire(Long expire) {
            this.expire = expire;
            return this;
        }

        /**
         * <p>The OSS form upload URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-shanghai.aliyuncs.com">https://example-bucket.oss-cn-shanghai.aliyuncs.com</a></p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>The maximum size of a single file upload, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>104857600</p>
         */
        public Builder maxSize(Long maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        /**
         * <p>The Base64-encoded OSS Post Policy.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNi0wNS0yMVQwODowMDowMFoifQ==</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-1234567890AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The OSS Post Policy signature.</p>
         * 
         * <strong>example:</strong>
         * <p>abc123signature</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * <p>The status code returned upon a successful OSS upload.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder successActionStatus(String successActionStatus) {
            this.successActionStatus = successActionStatus;
            return this;
        }

        public CreateArtifactUploadTokenResponseBody build() {
            return new CreateArtifactUploadTokenResponseBody(this);
        } 

    } 

}
