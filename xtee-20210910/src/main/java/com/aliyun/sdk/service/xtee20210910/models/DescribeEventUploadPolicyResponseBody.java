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
 * {@link DescribeEventUploadPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventUploadPolicyResponseBody</p>
 */
public class DescribeEventUploadPolicyResponseBody extends TeaModel {
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

    private DescribeEventUploadPolicyResponseBody(Builder builder) {
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

    public static DescribeEventUploadPolicyResponseBody create() {
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

        private Builder() {
        } 

        private Builder(DescribeEventUploadPolicyResponseBody model) {
            this.accessId = model.accessId;
            this.host = model.host;
            this.key = model.key;
            this.policy = model.policy;
            this.requestId = model.requestId;
            this.signature = model.signature;
            this.stsToken = model.stsToken;
        } 

        /**
         * <p>ID for accessing OSS</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI5tPXz8Y9tLVh5xxnnEAC</p>
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * <p>OSS host.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.44</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>The Key required for file upload.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/de/namelist/e924/ufzgsedX9bd3a7</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>OSS security policy</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wNy0zMFQwNjowNTo0OS45NTRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0sWyJlcSIsIiRrZXkiLCJzYWZcL2RlXC9uYW1lbGlzdFwvZTkyNFwvdWZ6Z3NlZFg5Ymxxxxxxxxxxx</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Signature data.</p>
         * 
         * <strong>example:</strong>
         * <p>7aXmkd2Z3oksCXOS9uvKlJuOKaY=</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * <p>Temporary identity credential.</p>
         * 
         * <strong>example:</strong>
         * <p>tT44bMQxxxxxxxxxxxxxxx</p>
         */
        public Builder stsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }

        public DescribeEventUploadPolicyResponseBody build() {
            return new DescribeEventUploadPolicyResponseBody(this);
        } 

    } 

}
