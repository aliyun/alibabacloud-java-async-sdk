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
 * {@link GetApplyStatusForTryOnRequest} extends {@link RequestModel}
 *
 * <p>GetApplyStatusForTryOnRequest</p>
 */
public class GetApplyStatusForTryOnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    private GetApplyStatusForTryOnRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplyStatusForTryOnRequest create() {
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

    public static final class Builder extends Request.Builder<GetApplyStatusForTryOnRequest, Builder> {
        private String jwtToken; 

        private Builder() {
            super();
        } 

        private Builder(GetApplyStatusForTryOnRequest request) {
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
        public GetApplyStatusForTryOnRequest build() {
            return new GetApplyStatusForTryOnRequest(this);
        } 

    } 

}
