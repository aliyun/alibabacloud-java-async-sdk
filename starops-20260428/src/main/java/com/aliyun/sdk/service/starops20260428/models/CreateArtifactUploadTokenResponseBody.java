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
         * accessId.
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * artifactPath.
         */
        public Builder artifactPath(String artifactPath) {
            this.artifactPath = artifactPath;
            return this;
        }

        /**
         * dir.
         */
        public Builder dir(String dir) {
            this.dir = dir;
            return this;
        }

        /**
         * expire.
         */
        public Builder expire(Long expire) {
            this.expire = expire;
            return this;
        }

        /**
         * host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * maxSize.
         */
        public Builder maxSize(Long maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        /**
         * policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
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
         * signature.
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * successActionStatus.
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
