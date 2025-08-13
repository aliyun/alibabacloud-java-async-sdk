// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeOssPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssPolicyResponseBody</p>
 */
public class DescribeOssPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessId")
    private String accessId;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DescribeOssPolicyResponseBody(Builder builder) {
        this.accessId = builder.accessId;
        this.host = builder.host;
        this.key = builder.key;
        this.policy = builder.policy;
        this.signature = builder.signature;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssPolicyResponseBody create() {
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
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessId; 
        private String host; 
        private String key; 
        private String policy; 
        private String signature; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOssPolicyResponseBody model) {
            this.accessId = model.accessId;
            this.host = model.host;
            this.key = model.key;
            this.policy = model.policy;
            this.signature = model.signature;
            this.requestId = model.requestId;
        } 

        /**
         * <p>accessId, a parameter used in OSS SDK uploads, corresponding to OSSAccessKeyId</p>
         * 
         * <strong>example:</strong>
         * <p>LTAIpeYTKEbC0v10</p>
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * <p>OSS host ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testvm.biubiubiuu.com</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>Key required for file upload.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/a/uid/ccc</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>OSS security policy</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpxxxxxx</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>Signature data.</p>
         * 
         * <strong>example:</strong>
         * <p>tzl1wL4q8rR/xxxxxx</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOssPolicyResponseBody build() {
            return new DescribeOssPolicyResponseBody(this);
        } 

    } 

}
