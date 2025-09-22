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
 * {@link DescribePocOssTokenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePocOssTokenResponseBody</p>
 */
public class DescribePocOssTokenResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private Boolean resultObject;

    private DescribePocOssTokenResponseBody(Builder builder) {
        this.accessId = builder.accessId;
        this.host = builder.host;
        this.key = builder.key;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePocOssTokenResponseBody create() {
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
     * @return resultObject
     */
    public Boolean getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String accessId; 
        private String host; 
        private String key; 
        private String policy; 
        private String requestId; 
        private String signature; 
        private Boolean resultObject; 

        private Builder() {
        } 

        private Builder(DescribePocOssTokenResponseBody model) {
            this.accessId = model.accessId;
            this.host = model.host;
            this.key = model.key;
            this.policy = model.policy;
            this.requestId = model.requestId;
            this.signature = model.signature;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>AccessKeyId for OSS file upload</p>
         * 
         * <strong>example:</strong>
         * <p>LTAxxxxxxxxxxxx</p>
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * <p>Host address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.34.191</p>
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
         * <p>OSS security policy.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0wNy0zMFQwNjowNTo0OS45NTRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0sWyJlcSIsIiRrZXkiLCJzYWZcL2RlXC9uYW1lbGlzdFwvZTkyNFwvdWZ6Z3NlZFg5Ymxxxxxxxxxxx</p>
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
         * <p>Upload signature information.</p>
         * 
         * <strong>example:</strong>
         * <p>0lxQEWM0BqHd476JJE0fNXdS3UA=</p>
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

        public DescribePocOssTokenResponseBody build() {
            return new DescribePocOssTokenResponseBody(this);
        } 

    } 

}
