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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDynamicDictUploadInfoResponseBody model) {
            this.accessid = model.accessid;
            this.expire = model.expire;
            this.host = model.host;
            this.key = model.key;
            this.policy = model.policy;
            this.requestId = model.requestId;
            this.signature = model.signature;
        } 

        /**
         * <p>The AccessKey ID of OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeyID</p>
         */
        public Builder accessid(String accessid) {
            this.accessid = accessid;
            return this;
        }

        /**
         * <p>The expiration time of the OSS authorization, in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1719919893</p>
         */
        public Builder expire(String expire) {
            this.expire = expire;
            return this;
        }

        /**
         * <p>The OSS domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com">https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>The key of the OSS file name.</p>
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
         * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A3D7C47D-3F11-57BB-90E8-E5C20C61***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The signature information calculated based on <strong>AccessKeySecret</strong> and <strong>Policy</strong>. When you call an OSS API operation, OSS verifies this signature information to confirm the validity of the POST request.</p>
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
