// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileStoreUploadPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileStoreUploadPolicyResponseBody</p>
 */
public class GetFileStoreUploadPolicyResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetFileStoreUploadPolicyResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileStoreUploadPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFileStoreUploadPolicyResponseBody build() {
            return new GetFileStoreUploadPolicyResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("Dir")
        private String dir;

        @NameInMap("Expire")
        private String expire;

        @NameInMap("Host")
        private String host;

        @NameInMap("Key")
        private String key;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("SecurityToken")
        private String securityToken;

        @NameInMap("Signature")
        private String signature;

        private Data(Builder builder) {
            this.accessId = builder.accessId;
            this.dir = builder.dir;
            this.expire = builder.expire;
            this.host = builder.host;
            this.key = builder.key;
            this.policy = builder.policy;
            this.securityToken = builder.securityToken;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
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
            private String key; 
            private String policy; 
            private String securityToken; 
            private String signature; 

            /**
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
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
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
