// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssTokenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssTokenResponseBody</p>
 */
public class DescribeOssTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessId")
    private String accessId;

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

    @com.aliyun.core.annotation.NameInMap("StsToken")
    private String stsToken;

    private DescribeOssTokenResponseBody(Builder builder) {
        this.accessId = builder.accessId;
        this.host = builder.host;
        this.key = builder.key;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
        this.stsToken = builder.stsToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
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

    /**
     * @return stsToken
     */
    public String getStsToken() {
        return this.stsToken;
    }

    public static final class Builder {
        private String accessId; 
        private String host; 
        private String key; 
        private String policy; 
        private String requestId; 
        private String signature; 
        private String stsToken; 

        /**
         * AccessId.
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
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

        /**
         * StsToken.
         */
        public Builder stsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }

        public DescribeOssTokenResponseBody build() {
            return new DescribeOssTokenResponseBody(this);
        } 

    } 

}
