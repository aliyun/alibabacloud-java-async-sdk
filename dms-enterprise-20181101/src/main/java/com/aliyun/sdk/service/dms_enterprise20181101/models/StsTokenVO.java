// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StsTokenVO} extends {@link TeaModel}
 *
 * <p>StsTokenVO</p>
 */
public class StsTokenVO extends TeaModel {
    @NameInMap("AccessKeyId")
    private String accessKeyId;

    @NameInMap("AccessKeySecret")
    private String accessKeySecret;

    @NameInMap("Expiration")
    private String expiration;

    @NameInMap("SecurityToken")
    private String securityToken;

    private StsTokenVO(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.accessKeySecret = builder.accessKeySecret;
        this.expiration = builder.expiration;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StsTokenVO create() {
        return builder().build();
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * @return accessKeySecret
     */
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String accessKeySecret; 
        private String expiration; 
        private String securityToken; 

        /**
         * 临时AK
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * 临时SK
         */
        public Builder accessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }

        /**
         * 过期时间
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * 临时Token
         */
        public Builder securityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        public StsTokenVO build() {
            return new StsTokenVO(this);
        } 

    } 

}
