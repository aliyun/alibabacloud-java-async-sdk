// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitLocateRequest} extends {@link RequestModel}
 *
 * <p>InitLocateRequest</p>
 */
public class InitLocateRequest extends Request {
    @Body
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("Params")
    @Validation(required = true)
    private String params;

    private InitLocateRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitLocateRequest create() {
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

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<InitLocateRequest, Builder> {
        private String jwtToken; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(InitLocateRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.params = request.params;
        } 

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        @Override
        public InitLocateRequest build() {
            return new InitLocateRequest(this);
        } 

    } 

}
