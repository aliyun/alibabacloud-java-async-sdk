// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LoginHuggingFaceRequest} extends {@link RequestModel}
 *
 * <p>LoginHuggingFaceRequest</p>
 */
public class LoginHuggingFaceRequest extends Request {
    @Body
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private LoginHuggingFaceRequest(Builder builder) {
        super(builder);
        this.token = builder.token;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoginHuggingFaceRequest create() {
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<LoginHuggingFaceRequest, Builder> {
        private String token; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(LoginHuggingFaceRequest request) {
            super(request);
            this.token = request.token;
            this.type = request.type;
        } 

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public LoginHuggingFaceRequest build() {
            return new LoginHuggingFaceRequest(this);
        } 

    } 

}
