// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Credential} extends {@link TeaModel}
 *
 * <p>Credential</p>
 */
public class Credential extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessId;

    @com.aliyun.core.annotation.NameInMap("dir")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dir;

    @com.aliyun.core.annotation.NameInMap("expire")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expire;

    @com.aliyun.core.annotation.NameInMap("host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.NameInMap("policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    @com.aliyun.core.annotation.NameInMap("securityToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityToken;

    @com.aliyun.core.annotation.NameInMap("signature")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signature;

    private Credential(Builder builder) {
        this.accessId = builder.accessId;
        this.dir = builder.dir;
        this.expire = builder.expire;
        this.host = builder.host;
        this.policy = builder.policy;
        this.securityToken = builder.securityToken;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Credential create() {
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
        private String policy; 
        private String securityToken; 
        private String signature; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dir(String dir) {
            this.dir = dir;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder expire(String expire) {
            this.expire = expire;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder securityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public Credential build() {
            return new Credential(this);
        } 

    } 

}
