// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAppSecretRequest} extends {@link RequestModel}
 *
 * <p>ResetAppSecretRequest</p>
 */
public class ResetAppSecretRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("NewAppKey")
    private String newAppKey;

    @Query
    @NameInMap("NewAppSecret")
    private String newAppSecret;

    @Query
    @NameInMap("SecurityToken")
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
         * The key of the application that is used to make an API call.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * The new AppKey that you set must be globally unique.
         */
        public Builder newAppKey(String newAppKey) {
            this.putQueryParameter("NewAppKey", newAppKey);
            this.newAppKey = newAppKey;
            return this;
        }

        /**
         * The new key of the application. To improve compatibility, we recommend that you use other parameters.
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
