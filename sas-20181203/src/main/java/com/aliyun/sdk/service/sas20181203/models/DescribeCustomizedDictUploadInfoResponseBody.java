// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizedDictUploadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizedDictUploadInfoResponseBody</p>
 */
public class DescribeCustomizedDictUploadInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessid")
    private String accessid;

    @com.aliyun.core.annotation.NameInMap("Expire")
    private String expire;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    private DescribeCustomizedDictUploadInfoResponseBody(Builder builder) {
        this.accessid = builder.accessid;
        this.expire = builder.expire;
        this.host = builder.host;
        this.key = builder.key;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizedDictUploadInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessid
     */
    public String getAccessid() {
        return this.accessid;
    }

    /**
     * @return expire
     */
    public String getExpire() {
        return this.expire;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
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

    public static final class Builder {
        private String accessid; 
        private String expire; 
        private String host; 
        private String key; 
        private String policy; 
        private String requestId; 
        private String signature; 

        /**
         * The AccessKey ID that is required to access the OSS object.
         */
        public Builder accessid(String accessid) {
            this.accessid = accessid;
            return this;
        }

        /**
         * The time when the OSS signature expires. This value is a UNIX timestamp.
         */
        public Builder expire(String expire) {
            this.expire = expire;
            return this;
        }

        /**
         * The OSS endpoint.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * The key of the OSS object.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * The policy of the OSS bucket.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The OSS signature.
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public DescribeCustomizedDictUploadInfoResponseBody build() {
            return new DescribeCustomizedDictUploadInfoResponseBody(this);
        } 

    } 

}
