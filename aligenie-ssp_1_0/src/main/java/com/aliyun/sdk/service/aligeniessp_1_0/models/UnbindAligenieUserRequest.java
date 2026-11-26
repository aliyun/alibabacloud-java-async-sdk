// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link UnbindAligenieUserRequest} extends {@link RequestModel}
 *
 * <p>UnbindAligenieUserRequest</p>
 */
public class UnbindAligenieUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginStateAccessToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginStateAccessToken;

    private UnbindAligenieUserRequest(Builder builder) {
        super(builder);
        this.loginStateAccessToken = builder.loginStateAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindAligenieUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loginStateAccessToken
     */
    public String getLoginStateAccessToken() {
        return this.loginStateAccessToken;
    }

    public static final class Builder extends Request.Builder<UnbindAligenieUserRequest, Builder> {
        private String loginStateAccessToken; 

        private Builder() {
            super();
        } 

        private Builder(UnbindAligenieUserRequest request) {
            super(request);
            this.loginStateAccessToken = request.loginStateAccessToken;
        } 

        /**
         * <p>Logon credential</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>99ce8a70c23a94f8569e1a525bef6e85</p>
         */
        public Builder loginStateAccessToken(String loginStateAccessToken) {
            this.putBodyParameter("LoginStateAccessToken", loginStateAccessToken);
            this.loginStateAccessToken = loginStateAccessToken;
            return this;
        }

        @Override
        public UnbindAligenieUserRequest build() {
            return new UnbindAligenieUserRequest(this);
        } 

    } 

}
