// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>EnableAccessTokenRequest</p>
 */
public class EnableAccessTokenRequest extends Request {
    @Path
    @NameInMap("tokenId")
    @Validation(required = true)
    private String tokenId;

    private EnableAccessTokenRequest(Builder builder) {
        super(builder);
        this.tokenId = builder.tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableAccessTokenRequest create() {
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

    public static final class Builder extends Request.Builder<EnableAccessTokenRequest, Builder> {
        private String tokenId; 

        private Builder() {
            super();
        } 

        private Builder(EnableAccessTokenRequest request) {
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
        public EnableAccessTokenRequest build() {
            return new EnableAccessTokenRequest(this);
        } 

    } 

}
