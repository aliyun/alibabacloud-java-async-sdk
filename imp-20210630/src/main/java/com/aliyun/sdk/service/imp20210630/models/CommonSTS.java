// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommonSTS} extends {@link TeaModel}
 *
 * <p>CommonSTS</p>
 */
public class CommonSTS extends TeaModel {
    @NameInMap("AccessKeyId")
    private String accessKeyId;

    @NameInMap("AccessKeySecret")
    private String accessKeySecret;

    @NameInMap("SecurityToken")
    private String securityToken;

    private CommonSTS(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.accessKeySecret = builder.accessKeySecret;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonSTS create() {
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String accessKeySecret; 
        private String securityToken; 

        /**
         * AccessKey ID 标识用户
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * AccessKey Secret 验证用户的密钥
         */
        public Builder accessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }

        /**
         * 临时token
         */
        public Builder securityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        public CommonSTS build() {
            return new CommonSTS(this);
        } 

    } 

}
