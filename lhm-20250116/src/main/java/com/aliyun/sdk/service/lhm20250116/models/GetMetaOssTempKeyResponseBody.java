// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetMetaOssTempKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaOssTempKeyResponseBody</p>
 */
public class GetMetaOssTempKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetMetaOssTempKeyResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaOssTempKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMetaOssTempKeyResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.success = model.success;
        } 

        /**
         * <p>The response body. For more information about the fields, see the child field descriptions.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call failed. Check errCode and errMessage for troubleshooting.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaOssTempKeyResponseBody build() {
            return new GetMetaOssTempKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaOssTempKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaOssTempKeyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ak")
        private String ak;

        @com.aliyun.core.annotation.NameInMap("bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("dir")
        private String dir;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("expire")
        private Long expire;

        @com.aliyun.core.annotation.NameInMap("policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("securityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        private Data(Builder builder) {
            this.ak = builder.ak;
            this.bucket = builder.bucket;
            this.dir = builder.dir;
            this.endpoint = builder.endpoint;
            this.expire = builder.expire;
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
         * @return ak
         */
        public String getAk() {
            return this.ak;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return dir
         */
        public String getDir() {
            return this.dir;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return expire
         */
        public Long getExpire() {
            return this.expire;
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
            private String ak; 
            private String bucket; 
            private String dir; 
            private String endpoint; 
            private Long expire; 
            private String policy; 
            private String securityToken; 
            private String signature; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ak = model.ak;
                this.bucket = model.bucket;
                this.dir = model.dir;
                this.endpoint = model.endpoint;
                this.expire = model.expire;
                this.policy = model.policy;
                this.securityToken = model.securityToken;
                this.signature = model.signature;
            } 

            /**
             * <p>The temporary AccessKey ID (STS token). This value is used together with securityToken to authenticate direct uploads to OSS. This is a sensitive credential. Do not hard-code it in your code or print it to logs.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.NY6bbCNqNPpt5GcSTEzB6Lahn</p>
             */
            public Builder ak(String ak) {
                this.ak = ak;
                return this;
            }

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>lhm-pre-cn-hangzhou</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The allowed OSS upload directory prefix. The value must end with a forward slash (/). The key of the uploaded object must start with this prefix. Otherwise, the request is rejected by OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>teleport/meta/1063934947625635/</p>
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * <p>The endpoint of the region where the OSS bucket resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-hangzhou.aliyuncs.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The credential expiration timestamp in Unix seconds. Before use, verify whether the current time has exceeded this value. If the credential has expired, obtain new credentials.</p>
             * 
             * <strong>example:</strong>
             * <p>1779966540</p>
             */
            public Builder expire(Long expire) {
                this.expire = expire;
                return this;
            }

            /**
             * <p>The Base64-encoded upload policy that defines constraints such as file size and path prefix. The decoded value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJleHBpcmF0aW9uIjoiMjAyNi0wNS0yOFQxMToxMjo1OC43MzZaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwXSxbInN0YXJ0cy13aXRoIiwiJGtleSIsInRlbGVwb3J0L21ldGEvMTA2MzkzNDk0NzYyNTYzNS8iXV19</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The STS temporary security token. This value is used together with ak for authentication and is returned only in STS authentication mode. This is a sensitive credential. Do not hard-code it in your code or print it to logs.</p>
             * 
             * <strong>example:</strong>
             * <p>CAIS3QJ1q6Ft5B2yfSjIr5rsAOjugKcY9YqlSRPBlWEFZN1V3fD6gzz2IHhMfHFvA</p>
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * <p>The signature calculated based on the policy. The OSS server uses this signature to verify the validity of upload requests.</p>
             * 
             * <strong>example:</strong>
             * <p>ydDYrWUzfKNM6slVhjPhUx83qUo=</p>
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
