// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMcubeFileTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetMcubeFileTokenResponseBody</p>
 */
public class GetMcubeFileTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GetFileTokenResult")
    private GetFileTokenResult getFileTokenResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private GetMcubeFileTokenResponseBody(Builder builder) {
        this.getFileTokenResult = builder.getFileTokenResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMcubeFileTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return getFileTokenResult
     */
    public GetFileTokenResult getGetFileTokenResult() {
        return this.getFileTokenResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private GetFileTokenResult getFileTokenResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * GetFileTokenResult.
         */
        public Builder getFileTokenResult(GetFileTokenResult getFileTokenResult) {
            this.getFileTokenResult = getFileTokenResult;
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
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public GetMcubeFileTokenResponseBody build() {
            return new GetMcubeFileTokenResponseBody(this);
        } 

    } 

    public static class FileToken extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        private FileToken(Builder builder) {
            this.accessid = builder.accessid;
            this.dir = builder.dir;
            this.expire = builder.expire;
            this.host = builder.host;
            this.policy = builder.policy;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileToken create() {
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
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public FileToken build() {
                return new FileToken(this);
            } 

        } 

    }
    public static class GetFileTokenResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileToken")
        private FileToken fileToken;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private GetFileTokenResult(Builder builder) {
            this.fileToken = builder.fileToken;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetFileTokenResult create() {
            return builder().build();
        }

        /**
         * @return fileToken
         */
        public FileToken getFileToken() {
            return this.fileToken;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private FileToken fileToken; 
            private String resultMsg; 
            private Boolean success; 

            /**
             * FileToken.
             */
            public Builder fileToken(FileToken fileToken) {
                this.fileToken = fileToken;
                return this;
            }

            /**
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public GetFileTokenResult build() {
                return new GetFileTokenResult(this);
            } 

        } 

    }
}
