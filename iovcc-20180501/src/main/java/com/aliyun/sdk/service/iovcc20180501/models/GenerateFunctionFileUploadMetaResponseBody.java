// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateFunctionFileUploadMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateFunctionFileUploadMetaResponseBody</p>
 */
public class GenerateFunctionFileUploadMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UploadMeta")
    private UploadMeta uploadMeta;

    private GenerateFunctionFileUploadMetaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uploadMeta = builder.uploadMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateFunctionFileUploadMetaResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadMeta
     */
    public UploadMeta getUploadMeta() {
        return this.uploadMeta;
    }

    public static final class Builder {
        private String requestId; 
        private UploadMeta uploadMeta; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UploadMeta.
         */
        public Builder uploadMeta(UploadMeta uploadMeta) {
            this.uploadMeta = uploadMeta;
            return this;
        }

        public GenerateFunctionFileUploadMetaResponseBody build() {
            return new GenerateFunctionFileUploadMetaResponseBody(this);
        } 

    } 

    public static class PostObjectPolicy extends TeaModel {
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

        private PostObjectPolicy(Builder builder) {
            this.accessId = builder.accessId;
            this.expire = builder.expire;
            this.host = builder.host;
            this.policy = builder.policy;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostObjectPolicy create() {
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

            public PostObjectPolicy build() {
                return new PostObjectPolicy(this);
            } 

        } 

    }
    public static class UploadMeta extends TeaModel {
        @NameInMap("ObjectKey")
        private String objectKey;

        @NameInMap("PostObjectPolicy")
        private PostObjectPolicy postObjectPolicy;

        @NameInMap("SecurityToken")
        private String securityToken;

        private UploadMeta(Builder builder) {
            this.objectKey = builder.objectKey;
            this.postObjectPolicy = builder.postObjectPolicy;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadMeta create() {
            return builder().build();
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
        }

        /**
         * @return postObjectPolicy
         */
        public PostObjectPolicy getPostObjectPolicy() {
            return this.postObjectPolicy;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        public static final class Builder {
            private String objectKey; 
            private PostObjectPolicy postObjectPolicy; 
            private String securityToken; 

            /**
             * ObjectKey.
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * PostObjectPolicy.
             */
            public Builder postObjectPolicy(PostObjectPolicy postObjectPolicy) {
                this.postObjectPolicy = postObjectPolicy;
                return this;
            }

            /**
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public UploadMeta build() {
                return new UploadMeta(this);
            } 

        } 

    }
}
