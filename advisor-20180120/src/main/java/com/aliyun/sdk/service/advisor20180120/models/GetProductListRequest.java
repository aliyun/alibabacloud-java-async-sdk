// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link GetProductListRequest} extends {@link RequestModel}
 *
 * <p>GetProductListRequest</p>
 */
public class GetProductListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetProductListRequest(Builder builder) {
        super(builder);
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductListRequest create() {
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

    public static final class Builder extends Request.Builder<GetProductListRequest, Builder> {
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetProductListRequest request) {
            super(request);
            this.token = request.token;
        } 

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetProductListRequest build() {
            return new GetProductListRequest(this);
        } 

    } 

}
