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
 * {@link GetAligenieUserInfoRequest} extends {@link RequestModel}
 *
 * <p>GetAligenieUserInfoRequest</p>
 */
public class GetAligenieUserInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginStateAccessToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginStateAccessToken;

    private GetAligenieUserInfoRequest(Builder builder) {
        super(builder);
        this.loginStateAccessToken = builder.loginStateAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAligenieUserInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetAligenieUserInfoRequest, Builder> {
        private String loginStateAccessToken; 

        private Builder() {
            super();
        } 

        private Builder(GetAligenieUserInfoRequest request) {
            super(request);
            this.loginStateAccessToken = request.loginStateAccessToken;
        } 

        /**
         * <p>Logon state access credential</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>99ce8a70c23a94f8569e1a525bef6e85</p>
         */
        public Builder loginStateAccessToken(String loginStateAccessToken) {
            this.putQueryParameter("LoginStateAccessToken", loginStateAccessToken);
            this.loginStateAccessToken = loginStateAccessToken;
            return this;
        }

        @Override
        public GetAligenieUserInfoRequest build() {
            return new GetAligenieUserInfoRequest(this);
        } 

    } 

}
