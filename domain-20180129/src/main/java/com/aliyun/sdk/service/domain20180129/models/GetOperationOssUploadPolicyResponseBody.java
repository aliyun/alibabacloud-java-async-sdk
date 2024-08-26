// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOperationOssUploadPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetOperationOssUploadPolicyResponseBody</p>
 */
public class GetOperationOssUploadPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessid")
    private String accessid;

    @com.aliyun.core.annotation.NameInMap("EncodedPolicy")
    private String encodedPolicy;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("FileDir")
    private String fileDir;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    private GetOperationOssUploadPolicyResponseBody(Builder builder) {
        this.accessid = builder.accessid;
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

    public static GetOperationOssUploadPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessid
     */
    public String getAccessid() {
        return this.accessid;
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
    public String getExpireTime() {
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
        private String accessid; 
        private String encodedPolicy; 
        private String expireTime; 
        private String fileDir; 
        private String host; 
        private String requestId; 
        private String signature; 

        /**
         * Accessid.
         */
        public Builder accessid(String accessid) {
            this.accessid = accessid;
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
        public Builder expireTime(String expireTime) {
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
         * OSS Endpoint。
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

        public GetOperationOssUploadPolicyResponseBody build() {
            return new GetOperationOssUploadPolicyResponseBody(this);
        } 

    } 

}
