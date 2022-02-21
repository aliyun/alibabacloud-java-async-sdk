// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateOssPostPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateOssPostPolicyResponseBody</p>
 */
public class GenerateOssPostPolicyResponseBody extends TeaModel {
    @NameInMap("OssPostPolicy")
    private OssPostPolicy ossPostPolicy;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateOssPostPolicyResponseBody(Builder builder) {
        this.ossPostPolicy = builder.ossPostPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOssPostPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return ossPostPolicy
     */
    public OssPostPolicy getOssPostPolicy() {
        return this.ossPostPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OssPostPolicy ossPostPolicy; 
        private String requestId; 

        /**
         * OssPostPolicy.
         */
        public Builder ossPostPolicy(OssPostPolicy ossPostPolicy) {
            this.ossPostPolicy = ossPostPolicy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateOssPostPolicyResponseBody build() {
            return new GenerateOssPostPolicyResponseBody(this);
        } 

    } 

    public static class OssPostPolicy extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("Expire")
        private String expire;

        @NameInMap("Host")
        private String host;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Signature")
        private String signature;

        private OssPostPolicy(Builder builder) {
            this.accessId = builder.accessId;
            this.expire = builder.expire;
            this.host = builder.host;
            this.policy = builder.policy;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssPostPolicy create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
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
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String accessId; 
            private String expire; 
            private String host; 
            private String policy; 
            private String signature; 

            /**
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
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
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public OssPostPolicy build() {
                return new OssPostPolicy(this);
            } 

        } 

    }
}
