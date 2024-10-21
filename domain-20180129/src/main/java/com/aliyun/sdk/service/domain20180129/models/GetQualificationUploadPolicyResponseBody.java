// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetQualificationUploadPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualificationUploadPolicyResponseBody</p>
 */
public class GetQualificationUploadPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessid")
    private String accessid;

    @com.aliyun.core.annotation.NameInMap("Dir")
    private String dir;

    @com.aliyun.core.annotation.NameInMap("Expire")
    private String expire;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    private GetQualificationUploadPolicyResponseBody(Builder builder) {
        this.accessid = builder.accessid;
        this.dir = builder.dir;
        this.expire = builder.expire;
        this.host = builder.host;
        this.policy = builder.policy;
        this.prefix = builder.prefix;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualificationUploadPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessid
     */
    public String getAccessid() {
        return this.accessid;
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
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
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
        private String dir; 
        private String expire; 
        private String host; 
        private String policy; 
        private String prefix; 
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
         * Dir.
         */
        public Builder dir(String dir) {
            this.dir = dir;
            return this;
        }

        /**
         * Expire.
         */
        public Builder expire(String expire) {
            this.expire = expire;
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
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
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

        public GetQualificationUploadPolicyResponseBody build() {
            return new GetQualificationUploadPolicyResponseBody(this);
        } 

    } 

}
