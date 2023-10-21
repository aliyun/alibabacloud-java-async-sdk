// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetApiProductsAuthoritiesRequest} extends {@link RequestModel}
 *
 * <p>SetApiProductsAuthoritiesRequest</p>
 */
public class SetApiProductsAuthoritiesRequest extends Request {
    @Query
    @NameInMap("ApiProductIds")
    @Validation(required = true)
    private java.util.List < String > apiProductIds;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("AuthValidTime")
    private String authValidTime;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SetApiProductsAuthoritiesRequest(Builder builder) {
        super(builder);
        this.apiProductIds = builder.apiProductIds;
        this.appId = builder.appId;
        this.authValidTime = builder.authValidTime;
        this.description = builder.description;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetApiProductsAuthoritiesRequest create() {
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
     * @return authValidTime
     */
    public String getAuthValidTime() {
        return this.authValidTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SetApiProductsAuthoritiesRequest, Builder> {
        private java.util.List < String > apiProductIds; 
        private Long appId; 
        private String authValidTime; 
        private String description; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetApiProductsAuthoritiesRequest request) {
            super(request);
            this.apiProductIds = request.apiProductIds;
            this.appId = request.appId;
            this.authValidTime = request.authValidTime;
            this.description = request.description;
            this.securityToken = request.securityToken;
        } 

        /**
         * ApiProductIds.
         */
        public Builder apiProductIds(java.util.List < String > apiProductIds) {
            String apiProductIdsShrink = shrink(apiProductIds, "ApiProductIds", "simple");
            this.putQueryParameter("ApiProductIds", apiProductIdsShrink);
            this.apiProductIds = apiProductIds;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AuthValidTime.
         */
        public Builder authValidTime(String authValidTime) {
            this.putQueryParameter("AuthValidTime", authValidTime);
            this.authValidTime = authValidTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
        public SetApiProductsAuthoritiesRequest build() {
            return new SetApiProductsAuthoritiesRequest(this);
        } 

    } 

}
