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
 * {@link DescribeModelOssPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelOssPolicyResponseBody</p>
 */
public class DescribeModelOssPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessId")
    private String accessId;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private Boolean resultObject;

    private DescribeModelOssPolicyResponseBody(Builder builder) {
        this.accessId = builder.accessId;
        this.host = builder.host;
        this.key = builder.key;
        this.message = builder.message;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelOssPolicyResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return resultObject
     */
    public Boolean getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String accessId; 
        private String host; 
        private String key; 
        private String message; 
        private String policy; 
        private String requestId; 
        private String signature; 
        private Boolean resultObject; 

        private Builder() {
        } 

        private Builder(DescribeModelOssPolicyResponseBody model) {
            this.accessId = model.accessId;
            this.host = model.host;
            this.key = model.key;
            this.message = model.message;
            this.policy = model.policy;
            this.requestId = model.requestId;
            this.signature = model.signature;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Access ID for OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAIpeYTKEbC0v10</p>
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * <p>Address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://saf-ai.oss-cn-shanghai.aliyuncs.com">https://saf-ai.oss-cn-shanghai.aliyuncs.com</a></p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>OSS access key secret.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/a/uid/ccc</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The policy for user form upload, which is a base64-encoded string.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpxxxxxx</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Signature information.</p>
         * 
         * <strong>example:</strong>
         * <p>tzl1wL4q8rR/xxxxxx</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * <p>Return result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder resultObject(Boolean resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeModelOssPolicyResponseBody build() {
            return new DescribeModelOssPolicyResponseBody(this);
        } 

    } 

}
