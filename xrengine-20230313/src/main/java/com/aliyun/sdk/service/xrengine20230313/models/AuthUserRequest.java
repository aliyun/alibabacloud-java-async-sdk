// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthUserRequest} extends {@link RequestModel}
 *
 * <p>AuthUserRequest</p>
 */
public class AuthUserRequest extends Request {
    @Query
    @NameInMap("JwtToken")
    @Validation(required = true)
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
         * JwtToken.
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
