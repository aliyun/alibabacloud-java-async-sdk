// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link UploadFileSignatureResult} extends {@link TeaModel}
 *
 * <p>UploadFileSignatureResult</p>
 */
public class UploadFileSignatureResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expiredTime")
    private Long expiredTime;

    @com.aliyun.core.annotation.NameInMap("fileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.NameInMap("host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("keyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("signature")
    private String signature;

    @com.aliyun.core.annotation.NameInMap("thumbUrl")
    private String thumbUrl;

    private UploadFileSignatureResult(Builder builder) {
        this.expiredTime = builder.expiredTime;
        this.fileUrl = builder.fileUrl;
        this.host = builder.host;
        this.keyId = builder.keyId;
        this.path = builder.path;
        this.policy = builder.policy;
        this.signature = builder.signature;
        this.thumbUrl = builder.thumbUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadFileSignatureResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expiredTime
     */
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return thumbUrl
     */
    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public static final class Builder {
        private Long expiredTime; 
        private String fileUrl; 
        private String host; 
        private String keyId; 
        private String path; 
        private String policy; 
        private String signature; 
        private String thumbUrl; 

        private Builder() {
        } 

        private Builder(UploadFileSignatureResult model) {
            this.expiredTime = model.expiredTime;
            this.fileUrl = model.fileUrl;
            this.host = model.host;
            this.keyId = model.keyId;
            this.path = model.path;
            this.policy = model.policy;
            this.signature = model.signature;
            this.thumbUrl = model.thumbUrl;
        } 

        /**
         * expiredTime.
         */
        public Builder expiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * fileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
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
         * keyId.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.path = path;
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
         * signature.
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * thumbUrl.
         */
        public Builder thumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }

        public UploadFileSignatureResult build() {
            return new UploadFileSignatureResult(this);
        } 

    } 

}
