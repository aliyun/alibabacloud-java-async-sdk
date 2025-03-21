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
 * {@link DescribeDynamicDictUploadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDynamicDictUploadInfoResponseBody</p>
 */
public class DescribeDynamicDictUploadInfoResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    private DescribeDynamicDictUploadInfoResponseBody(Builder builder) {
        this.accessid = builder.accessid;
        this.expire = builder.expire;
        this.host = builder.host;
        this.key = builder.key;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDynamicDictUploadInfoResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private String signature; 

        /**
         * <p>The AccessKey ID that is used to access OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI4G1mgPbjvG********</p>
         */
        public Builder accessid(String accessid) {
            this.accessid = accessid;
            return this;
        }

        /**
         * <p>The validity period of the signature. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719919893</p>
         */
        public Builder expire(String expire) {
            this.expire = expire;
            return this;
        }

        /**
         * <p>The OSS endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com">https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>The name of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>DegradePool_Offset_****</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The OSS security policy.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNC0wNy0wMlQxMTozMTozMy40MjlaIiwiY29uZGl0aW9********</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3D7C47D-3F11-57BB-90E8-E5C20C61***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The signature that is calculated based on <strong>AccessKeySecret</strong> and <strong>Policy</strong>. When you call an OSS API operation, OSS uses the signature information to check the validity of the POST request.</p>
         * 
         * <strong>example:</strong>
         * <p>wBiwkhd5LGcLzijtc3FhI****</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public DescribeDynamicDictUploadInfoResponseBody build() {
            return new DescribeDynamicDictUploadInfoResponseBody(this);
        } 

    } 

}
