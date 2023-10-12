// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssPolicyResponseBody</p>
 */
public class GetOssPolicyResponseBody extends TeaModel {
    @NameInMap("OssPolicy")
    private OssPolicy ossPolicy;

    @NameInMap("RequestId")
    private String requestId;

    private GetOssPolicyResponseBody(Builder builder) {
        this.ossPolicy = builder.ossPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return ossPolicy
     */
    public OssPolicy getOssPolicy() {
        return this.ossPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OssPolicy ossPolicy; 
        private String requestId; 

        /**
         * 资源上传规则
         */
        public Builder ossPolicy(OssPolicy ossPolicy) {
            this.ossPolicy = ossPolicy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOssPolicyResponseBody build() {
            return new GetOssPolicyResponseBody(this);
        } 

    } 

    public static class OssPolicy extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("Directory")
        private String directory;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("Host")
        private String host;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Signature")
        private String signature;

        private OssPolicy(Builder builder) {
            this.accessId = builder.accessId;
            this.directory = builder.directory;
            this.expireTime = builder.expireTime;
            this.host = builder.host;
            this.policy = builder.policy;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssPolicy create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
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
            private String directory; 
            private String expireTime; 
            private String host; 
            private String policy; 
            private String signature; 

            /**
             * 通行id
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * 目录
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * 过期时间
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * 主机名
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * 通行规则
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * 签名
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public OssPolicy build() {
                return new OssPolicy(this);
            } 

        } 

    }
}
