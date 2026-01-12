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
 * {@link GetArEditCommonMaterialRequest} extends {@link RequestModel}
 *
 * <p>GetArEditCommonMaterialRequest</p>
 */
public class GetArEditCommonMaterialRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JwtToken")
    private String jwtToken;

    private GetArEditCommonMaterialRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArEditCommonMaterialRequest create() {
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

    public static final class Builder extends Request.Builder<GetArEditCommonMaterialRequest, Builder> {
        private String jwtToken; 

        private Builder() {
            super();
        } 

        private Builder(GetArEditCommonMaterialRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
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
        public GetArEditCommonMaterialRequest build() {
            return new GetArEditCommonMaterialRequest(this);
        } 

    } 

}
