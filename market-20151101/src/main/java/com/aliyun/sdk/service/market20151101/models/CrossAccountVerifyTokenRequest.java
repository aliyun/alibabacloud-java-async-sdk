// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CrossAccountVerifyTokenRequest} extends {@link RequestModel}
 *
 * <p>CrossAccountVerifyTokenRequest</p>
 */
public class CrossAccountVerifyTokenRequest extends Request {
    @Body
    @NameInMap("Token")
    private String token;

    private CrossAccountVerifyTokenRequest(Builder builder) {
        super(builder);
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CrossAccountVerifyTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<CrossAccountVerifyTokenRequest, Builder> {
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(CrossAccountVerifyTokenRequest request) {
            super(request);
            this.token = request.token;
        } 

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public CrossAccountVerifyTokenRequest build() {
            return new CrossAccountVerifyTokenRequest(this);
        } 

    } 

}
