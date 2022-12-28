// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>DisableAccessTokenRequest</p>
 */
public class DisableAccessTokenRequest extends Request {
    @Path
    @NameInMap("tokenId")
    @Validation(required = true)
    private String tokenId;

    private DisableAccessTokenRequest(Builder builder) {
        super(builder);
        this.tokenId = builder.tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableAccessTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tokenId
     */
    public String getTokenId() {
        return this.tokenId;
    }

    public static final class Builder extends Request.Builder<DisableAccessTokenRequest, Builder> {
        private String tokenId; 

        private Builder() {
            super();
        } 

        private Builder(DisableAccessTokenRequest request) {
            super(request);
            this.tokenId = request.tokenId;
        } 

        /**
         * tokenId.
         */
        public Builder tokenId(String tokenId) {
            this.putPathParameter("tokenId", tokenId);
            this.tokenId = tokenId;
            return this;
        }

        @Override
        public DisableAccessTokenRequest build() {
            return new DisableAccessTokenRequest(this);
        } 

    } 

}
