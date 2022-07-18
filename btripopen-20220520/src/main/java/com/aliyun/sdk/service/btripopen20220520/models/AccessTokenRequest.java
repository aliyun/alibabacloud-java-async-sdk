// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AccessTokenRequest} extends {@link RequestModel}
 *
 * <p>AccessTokenRequest</p>
 */
public class AccessTokenRequest extends Request {
    @Query
    @NameInMap("app_key")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("app_secret")
    @Validation(required = true)
    private String appSecret;

    private AccessTokenRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.appSecret = builder.appSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccessTokenRequest create() {
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
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    public static final class Builder extends Request.Builder<AccessTokenRequest, Builder> {
        private String appKey; 
        private String appSecret; 

        private Builder() {
            super();
        } 

        private Builder(AccessTokenRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.appSecret = request.appSecret;
        } 

        /**
         * 应用的appKey
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("app_key", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * 应用的appSecret
         */
        public Builder appSecret(String appSecret) {
            this.putQueryParameter("app_secret", appSecret);
            this.appSecret = appSecret;
            return this;
        }

        @Override
        public AccessTokenRequest build() {
            return new AccessTokenRequest(this);
        } 

    } 

}
