// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeModelOssTokenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelOssTokenResponseBody</p>
 */
public class DescribeModelOssTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessId")
    private String accessId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("XOssSecurityToken")
    private String xOssSecurityToken;

    private DescribeModelOssTokenResponseBody(Builder builder) {
        this.accessId = builder.accessId;
        this.code = builder.code;
        this.host = builder.host;
        this.httpStatusCode = builder.httpStatusCode;
        this.key = builder.key;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.signature = builder.signature;
        this.success = builder.success;
        this.xOssSecurityToken = builder.xOssSecurityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelOssTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return xOssSecurityToken
     */
    public String getXOssSecurityToken() {
        return this.xOssSecurityToken;
    }

    public static final class Builder {
        private String accessId; 
        private Long code; 
        private String host; 
        private Long httpStatusCode; 
        private String key; 
        private String policy; 
        private String requestId; 
        private ResultObject resultObject; 
        private String signature; 
        private Boolean success; 
        private String xOssSecurityToken; 

        private Builder() {
        } 

        private Builder(DescribeModelOssTokenResponseBody model) {
            this.accessId = model.accessId;
            this.code = model.code;
            this.host = model.host;
            this.httpStatusCode = model.httpStatusCode;
            this.key = model.key;
            this.policy = model.policy;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.signature = model.signature;
            this.success = model.success;
            this.xOssSecurityToken = model.xOssSecurityToken;
        } 

        /**
         * <p>AccessKeyId for uploading files to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>Lxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * <p>Status code. A return value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>OSS domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://safxxxxxxxxx.aliyuncs.com">https://safxxxxxxxxx.aliyuncs.com</a></p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Key required for file upload.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/xxxxxx/xxxxxx</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>Authorization policy for security group control rules.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>OSS signature.</p>
         * 
         * <strong>example:</strong>
         * <p>lUxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Temporary authorization token for OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>smxxxxxxxxxxx</p>
         */
        public Builder xOssSecurityToken(String xOssSecurityToken) {
            this.xOssSecurityToken = xOssSecurityToken;
            return this;
        }

        public DescribeModelOssTokenResponseBody build() {
            return new DescribeModelOssTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModelOssTokenResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelOssTokenResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("XOssSecurityToken")
        private String xOssSecurityToken;

        private ResultObject(Builder builder) {
            this.accessId = builder.accessId;
            this.host = builder.host;
            this.key = builder.key;
            this.policy = builder.policy;
            this.signature = builder.signature;
            this.xOssSecurityToken = builder.xOssSecurityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
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

        /**
         * @return xOssSecurityToken
         */
        public String getXOssSecurityToken() {
            return this.xOssSecurityToken;
        }

        public static final class Builder {
            private String accessId; 
            private String host; 
            private String key; 
            private String policy; 
            private String signature; 
            private String xOssSecurityToken; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.accessId = model.accessId;
                this.host = model.host;
                this.key = model.key;
                this.policy = model.policy;
                this.signature = model.signature;
                this.xOssSecurityToken = model.xOssSecurityToken;
            } 

            /**
             * <p>AccessKeyId for uploading files to OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>Lxxxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * <p>OSS domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://safxxxxxxxxx.aliyuncs.com">https://safxxxxxxxxx.aliyuncs.com</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Key required for file upload.</p>
             * 
             * <strong>example:</strong>
             * <p>saf/xxxxxx/xxxxxx</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Authorization policy for security group control rules.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJleHBpcmF0aW9uIjoiMxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>OSS signature.</p>
             * 
             * <strong>example:</strong>
             * <p>lUxxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>Temporary authorization token for OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>smxxxxxxxxxxx</p>
             */
            public Builder xOssSecurityToken(String xOssSecurityToken) {
                this.xOssSecurityToken = xOssSecurityToken;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
