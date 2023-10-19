// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApiProductRequest} extends {@link RequestModel}
 *
 * <p>DeleteApiProductRequest</p>
 */
public class DeleteApiProductRequest extends Request {
    @Query
    @NameInMap("ApiProductId")
    @Validation(required = true)
    private String apiProductId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteApiProductRequest(Builder builder) {
        super(builder);
        this.apiProductId = builder.apiProductId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApiProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiProductId
     */
    public String getApiProductId() {
        return this.apiProductId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteApiProductRequest, Builder> {
        private String apiProductId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApiProductRequest request) {
            super(request);
            this.apiProductId = request.apiProductId;
            this.securityToken = request.securityToken;
        } 

        /**
         * ApiProductId.
         */
        public Builder apiProductId(String apiProductId) {
            this.putQueryParameter("ApiProductId", apiProductId);
            this.apiProductId = apiProductId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DeleteApiProductRequest build() {
            return new DeleteApiProductRequest(this);
        } 

    } 

}
