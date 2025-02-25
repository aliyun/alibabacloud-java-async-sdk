// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link AssumeUserInfo} extends {@link TeaModel}
 *
 * <p>AssumeUserInfo</p>
 */
public class AssumeUserInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeyId")
    private String accessKeyId;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private AssumeUserInfo(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.id = builder.id;
        this.securityToken = builder.securityToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeUserInfo create() {
        return builder().build();
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String id; 
        private String securityToken; 
        private String type; 

        /**
         * AccessKeyId.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AssumeUserInfo build() {
            return new AssumeUserInfo(this);
        } 

    } 

}
