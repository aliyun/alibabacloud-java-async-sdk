// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ResetAppSecretRequest} extends {@link RequestModel}
 *
 * <p>ResetAppSecretRequest</p>
 */
public class ResetAppSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewAppKey")
    private String newAppKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewAppSecret")
    private String newAppSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private ResetAppSecretRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.newAppKey = builder.newAppKey;
        this.newAppSecret = builder.newAppSecret;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAppSecretRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return newAppKey
     */
    public String getNewAppKey() {
        return this.newAppKey;
    }

    /**
     * @return newAppSecret
     */
    public String getNewAppSecret() {
        return this.newAppSecret;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ResetAppSecretRequest, Builder> {
        private String appKey; 
        private String newAppKey; 
        private String newAppSecret; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ResetAppSecretRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.newAppKey = request.newAppKey;
            this.newAppSecret = request.newAppSecret;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The key of the application that is used to make an API call.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60030986</p>
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The new AppKey that you set must be globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>testAppKey</p>
         */
        public Builder newAppKey(String newAppKey) {
            this.putQueryParameter("NewAppKey", newAppKey);
            this.newAppKey = newAppKey;
            return this;
        }

        /**
         * <p>The new key of the application. To improve compatibility, we recommend that you use other parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>test***</p>
         */
        public Builder newAppSecret(String newAppSecret) {
            this.putQueryParameter("NewAppSecret", newAppSecret);
            this.newAppSecret = newAppSecret;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public ResetAppSecretRequest build() {
            return new ResetAppSecretRequest(this);
        } 

    } 

}
