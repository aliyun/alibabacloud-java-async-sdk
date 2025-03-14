// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

        private Builder(GetHoneyPotUploadPolicyInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8C177095-A734-59B2-9409-7D4F26FF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHoneyPotUploadPolicyInfoResponseBody build() {
            return new GetHoneyPotUploadPolicyInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHoneyPotUploadPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetHoneyPotUploadPolicyInfoResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        private Data(Builder builder) {
            this.accessid = builder.accessid;
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
            private String accessid; 
            private String expire; 
            private String host; 
            private String key; 
            private String policy; 
            private String securityToken; 
            private String signature; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessid = model.accessid;
                this.expire = model.expire;
                this.host = model.host;
                this.key = model.key;
                this.policy = model.policy;
                this.securityToken = model.securityToken;
                this.signature = model.signature;
            } 

            /**
             * <p>The key ID that is required for the file upload.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAI4G1mgPbjvGQuiV1X****</p>
             */
            public Builder accessid(String accessid) {
                this.accessid = accessid;
                return this;
            }

            /**
             * <p>The expiration time of the URL. The value is a timestamp. You can use the value to determine whether the URL expires. If the expiration time arrives, you can no longer use the URL to upload files.</p>
             * 
             * <strong>example:</strong>
             * <p>1661443200000</p>
             */
            public Builder expire(String expire) {
                this.expire = expire;
                return this;
            }

            /**
             * <p>The request URL during the upload.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com">https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The full path of the file in OSS. The file is uploaded by calling the OSS PostObject operation.</p>
             * 
             * <strong>example:</strong>
             * <p>HONEYPOT_FILE/1766185894104675_169********</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The limits that are imposed on the file upload. The limits include the file size.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJleHBpcmF0aW9uIjoiMjAyMy0wOS0wMVQwMzoyNTozNS44MzZaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwXSxbInN0YXJ0cy13aXRoIiwiJGtleSIsIkhPTkVZUE9UX0ZJTEUvMTc2NjE4NTg5NDEwNDY3NV8xNjkzNTM4NDM1N*****************</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The security token.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * <p>The signature that is calculated based on <strong>AccessKeySecret</strong> and <strong>Policy</strong>. When you call an Object Storage Service (OSS) API operation, OSS uses the signature information to verify the POST request.</p>
             * 
             * <strong>example:</strong>
             * <p>wKPqlFneNTZPn52k2Rz9GTY*****</p>
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
