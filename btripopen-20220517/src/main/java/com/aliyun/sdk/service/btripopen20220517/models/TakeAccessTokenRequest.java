// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TakeAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>TakeAccessTokenRequest</p>
 */
public class TakeAccessTokenRequest extends Request {
    @Query
    @NameInMap("app_key")
    private String appKey;

    @Query
    @NameInMap("app_secret")
    private String appSecret;

    private TakeAccessTokenRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.appSecret = builder.appSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TakeAccessTokenRequest create() {
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

    public static final class Builder extends Request.Builder<TakeAccessTokenRequest, Builder> {
        private String appKey; 
        private String appSecret; 

        private Builder() {
            super();
        } 

        private Builder(TakeAccessTokenRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.appSecret = request.appSecret;
        } 

        /**
         * app_key.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("app_key", appKey);
            this.appKey = appKey;
            return this;
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
        public TakeAccessTokenRequest build() {
            return new TakeAccessTokenRequest(this);
        } 

    } 

}
