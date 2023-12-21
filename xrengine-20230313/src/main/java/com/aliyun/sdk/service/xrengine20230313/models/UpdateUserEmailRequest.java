// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserEmailRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserEmailRequest</p>
 */
public class UpdateUserEmailRequest extends Request {
    @Body
    @NameInMap("Email")
    private String email;

    @Body
    @NameInMap("JwtToken")
    private String jwtToken;

    private UpdateUserEmailRequest(Builder builder) {
        super(builder);
        this.email = builder.email;
        this.jwtToken = builder.jwtToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserEmailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    public static final class Builder extends Request.Builder<UpdateUserEmailRequest, Builder> {
        private String email; 
        private String jwtToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserEmailRequest request) {
            super(request);
            this.email = request.email;
            this.jwtToken = request.jwtToken;
        } 

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putBodyParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        @Override
        public UpdateUserEmailRequest build() {
            return new UpdateUserEmailRequest(this);
        } 

    } 

}
