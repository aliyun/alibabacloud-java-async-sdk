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
    @NameInMap("app_secret")
    @Validation(required = true)
    private String appSecret;

    private AccessTokenRequest(Builder builder) {
        super(builder);
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
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    public static final class Builder extends Request.Builder<AccessTokenRequest, Builder> {
        private String appSecret; 

        private Builder() {
            super();
        } 

        private Builder(AccessTokenRequest request) {
            super(request);
            this.appSecret = request.appSecret;
        } 

        /**
         * app_secret.
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
