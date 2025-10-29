// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link GetUploadPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetUploadPolicyResponseBody</p>
 */
public class GetUploadPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetUploadPolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetUploadPolicyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUploadPolicyResponseBody build() {
            return new GetUploadPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUploadPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetUploadPolicyResponseBody</p>
     */
    public static class OssPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("dir")
        private String dir;

        @com.aliyun.core.annotation.NameInMap("expire")
        private String expire;

        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        private OssPolicy(Builder builder) {
            this.accessId = builder.accessId;
            this.dir = builder.dir;
            this.expire = builder.expire;
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
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String accessId; 
            private String dir; 
            private String expire; 
            private String host; 
            private String policy; 
            private String signature; 

            private Builder() {
            } 

            private Builder(OssPolicy model) {
                this.accessId = model.accessId;
                this.dir = model.dir;
                this.expire = model.expire;
                this.host = model.host;
                this.policy = model.policy;
                this.signature = model.signature;
            } 

            /**
             * <p>accessId。</p>
             * 
             * <strong>example:</strong>
             * <p>LTBI5123ADDJdsadCidYA8kw3</p>
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * dir.
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * expire.
             */
            public Builder expire(String expire) {
                this.expire = expire;
                return this;
            }

            /**
             * host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * signature.
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
    /**
     * 
     * {@link GetUploadPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetUploadPolicyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ossKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("ossPolicy")
        private OssPolicy ossPolicy;

        private Data(Builder builder) {
            this.ossKey = builder.ossKey;
            this.ossPolicy = builder.ossPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return ossPolicy
         */
        public OssPolicy getOssPolicy() {
            return this.ossPolicy;
        }

        public static final class Builder {
            private String ossKey; 
            private OssPolicy ossPolicy; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ossKey = model.ossKey;
                this.ossPolicy = model.ossPolicy;
            } 

            /**
             * ossKey.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * ossPolicy.
             */
            public Builder ossPolicy(OssPolicy ossPolicy) {
                this.ossPolicy = ossPolicy;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
