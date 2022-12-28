// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessTokensRequest} extends {@link RequestModel}
 *
 * <p>ListAccessTokensRequest</p>
 */
public class ListAccessTokensRequest extends Request {
    @Query
    @NameInMap("tokenId")
    private String tokenId;

    private ListAccessTokensRequest(Builder builder) {
        super(builder);
        this.tokenId = builder.tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessTokensRequest create() {
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

    public static final class Builder extends Request.Builder<ListAccessTokensRequest, Builder> {
        private String tokenId; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessTokensRequest request) {
            super(request);
            this.tokenId = request.tokenId;
        } 

        /**
         * tokenId.
         */
        public Builder tokenId(String tokenId) {
            this.putQueryParameter("tokenId", tokenId);
            this.tokenId = tokenId;
            return this;
        }

        @Override
        public ListAccessTokensRequest build() {
            return new ListAccessTokensRequest(this);
        } 

    } 

}
