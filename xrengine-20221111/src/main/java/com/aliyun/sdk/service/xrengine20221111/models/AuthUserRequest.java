// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link AuthUserRequest} extends {@link RequestModel}
 *
 * <p>AuthUserRequest</p>
 */
public class AuthUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jwtToken;

    private AuthUserRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    public static final class Builder extends Request.Builder<AuthUserRequest, Builder> {
        private String jwtToken; 

        private Builder() {
            super();
        } 

        private Builder(AuthUserRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        @Override
        public AuthUserRequest build() {
            return new AuthUserRequest(this);
        } 

    } 

}
