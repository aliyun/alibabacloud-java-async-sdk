// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenOssUploadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScreenOssUploadInfoResponseBody</p>
 */
public class DescribeScreenOssUploadInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessId")
    private String accessId;

    @com.aliyun.core.annotation.NameInMap("Expire")
    private Integer expire;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    private DescribeScreenOssUploadInfoResponseBody(Builder builder) {
        this.accessId = builder.accessId;
        this.expire = builder.expire;
        this.host = builder.host;
        this.key = builder.key;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.securityToken = builder.securityToken;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenOssUploadInfoResponseBody create() {
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
     * @return expire
     */
    public Integer getExpire() {
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
        private Integer expire; 
        private String host; 
        private String key; 
        private String policy; 
        private String requestId; 
        private String securityToken; 
        private String signature; 

        private Builder() {
        } 

        private Builder(DescribeScreenOssUploadInfoResponseBody model) {
            this.accessId = model.accessId;
            this.expire = model.expire;
            this.host = model.host;
            this.key = model.key;
            this.policy = model.policy;
            this.requestId = model.requestId;
            this.securityToken = model.securityToken;
            this.signature = model.signature;
        } 

        /**
         * AccessId.
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * Expire.
         */
        public Builder expire(Integer expire) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeScreenOssUploadInfoResponseBody build() {
            return new DescribeScreenOssUploadInfoResponseBody(this);
        } 

    } 

}
