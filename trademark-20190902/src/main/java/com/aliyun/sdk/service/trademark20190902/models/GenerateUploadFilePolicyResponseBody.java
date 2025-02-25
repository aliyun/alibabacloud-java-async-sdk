// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUploadFilePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateUploadFilePolicyResponseBody</p>
 */
public class GenerateUploadFilePolicyResponseBody extends TeaModel {
    @NameInMap("AccessId")
    private String accessId;

    @NameInMap("EncodedPolicy")
    private String encodedPolicy;

    @NameInMap("ExpireTime")
    private Long expireTime;

    @NameInMap("FileDir")
    private String fileDir;

    @NameInMap("Host")
    private String host;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Signature")
    private String signature;

    private GenerateUploadFilePolicyResponseBody(Builder builder) {
        this.accessId = builder.accessId;
        this.encodedPolicy = builder.encodedPolicy;
        this.expireTime = builder.expireTime;
        this.fileDir = builder.fileDir;
        this.host = builder.host;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUploadFilePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
    }

    /**
     * @return encodedPolicy
     */
    public String getEncodedPolicy() {
        return this.encodedPolicy;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return fileDir
     */
    public String getFileDir() {
        return this.fileDir;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
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

    public static final class Builder {
        private String accessId; 
        private String encodedPolicy; 
        private Long expireTime; 
        private String fileDir; 
        private String host; 
        private String requestId; 
        private String signature; 

        /**
         * OSSAccessKeyId
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * EncodedPolicy.
         */
        public Builder encodedPolicy(String encodedPolicy) {
            this.encodedPolicy = encodedPolicy;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * FileDir.
         */
        public Builder fileDir(String fileDir) {
            this.fileDir = fileDir;
            return this;
        }

        /**
         * host
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Signature.
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public GenerateUploadFilePolicyResponseBody build() {
            return new GenerateUploadFilePolicyResponseBody(this);
        } 

    } 

}
