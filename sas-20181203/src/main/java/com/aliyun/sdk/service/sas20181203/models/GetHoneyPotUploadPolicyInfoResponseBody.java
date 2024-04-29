// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHoneyPotUploadPolicyInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetHoneyPotUploadPolicyInfoResponseBody</p>
 */
public class GetHoneyPotUploadPolicyInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetHoneyPotUploadPolicyInfoResponseBody(Builder builder) {
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

    public static GetHoneyPotUploadPolicyInfoResponseBody create() {
        return builder().build();
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

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHoneyPotUploadPolicyInfoResponseBody build() {
            return new GetHoneyPotUploadPolicyInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accessid")
        private String accessid;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private String expire;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        private Data(Builder builder) {
            this.accessid = builder.accessid;
            this.expire = builder.expire;
            this.host = builder.host;
            this.key = builder.key;
            this.policy = builder.policy;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessid
         */
        public String getAccessid() {
            return this.accessid;
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
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String accessid; 
            private String expire; 
            private String host; 
            private String key; 
            private String policy; 
            private String signature; 

            /**
             * The key ID that is required for the file upload.
             */
            public Builder accessid(String accessid) {
                this.accessid = accessid;
                return this;
            }

            /**
             * The expiration time of the URL. The value is a timestamp. You can use the value to determine whether the URL expires. If the expiration time arrives, you can no longer use the URL to upload files.
             */
            public Builder expire(String expire) {
                this.expire = expire;
                return this;
            }

            /**
             * The request URL during the upload.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The full path of the file in OSS. The file is uploaded by calling the OSS PostObject operation.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The limits that are imposed on the file upload. The limits include the file size.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The signature that is calculated based on **AccessKeySecret** and **Policy**. When you call an Object Storage Service (OSS) API operation, OSS uses the signature information to verify the POST request.
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
