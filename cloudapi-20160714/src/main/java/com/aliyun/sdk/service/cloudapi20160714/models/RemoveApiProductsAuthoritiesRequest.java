// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveApiProductsAuthoritiesRequest} extends {@link RequestModel}
 *
 * <p>RemoveApiProductsAuthoritiesRequest</p>
 */
public class RemoveApiProductsAuthoritiesRequest extends Request {
    @Query
    @NameInMap("ApiProductIds")
    @Validation(required = true)
    private java.util.List < String > apiProductIds;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private RemoveApiProductsAuthoritiesRequest(Builder builder) {
        super(builder);
        this.apiProductIds = builder.apiProductIds;
        this.appId = builder.appId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveApiProductsAuthoritiesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiProductIds
     */
    public java.util.List < String > getApiProductIds() {
        return this.apiProductIds;
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<RemoveApiProductsAuthoritiesRequest, Builder> {
        private java.util.List < String > apiProductIds; 
        private Long appId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(RemoveApiProductsAuthoritiesRequest request) {
            super(request);
            this.apiProductIds = request.apiProductIds;
            this.appId = request.appId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The API products.
         */
        public Builder apiProductIds(java.util.List < String > apiProductIds) {
            String apiProductIdsShrink = shrink(apiProductIds, "ApiProductIds", "simple");
            this.putQueryParameter("ApiProductIds", apiProductIdsShrink);
            this.apiProductIds = apiProductIds;
            return this;
        }

        /**
         * The application ID.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
        public RemoveApiProductsAuthoritiesRequest build() {
            return new RemoveApiProductsAuthoritiesRequest(this);
        } 

    } 

}
