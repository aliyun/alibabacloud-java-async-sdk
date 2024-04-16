// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Credential} extends {@link TeaModel}
 *
 * <p>Credential</p>
 */
public class Credential extends TeaModel {
    @NameInMap("accessId")
    @Validation(required = true)
    private String accessId;

    @NameInMap("dir")
    @Validation(required = true)
    private String dir;

    @NameInMap("expire")
    @Validation(required = true)
    private String expire;

    @NameInMap("host")
    @Validation(required = true)
    private String host;

    @NameInMap("policy")
    @Validation(required = true)
    private String policy;

    @NameInMap("securityToken")
    @Validation(required = true)
    private String securityToken;

    @NameInMap("signature")
    @Validation(required = true)
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
         * accessId.
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * dir.
         */
        public Builder dir(String dir) {
            this.dir = dir;
            return this;
        }

        /**
         * expire.
         */
        public Builder expire(String expire) {
            this.expire = expire;
            return this;
        }

        /**
         * host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * securityToken.
         */
        public Builder securityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        /**
         * signature.
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
