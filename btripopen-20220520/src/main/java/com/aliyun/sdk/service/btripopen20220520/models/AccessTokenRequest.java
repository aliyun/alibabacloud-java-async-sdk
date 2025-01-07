// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link AccessTokenRequest} extends {@link RequestModel}
 *
 * <p>AccessTokenRequest</p>
 */
public class AccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("app_secret")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ggZADkghsadgogeDxdaD</p>
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
