// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetAppsAuthToApiProductRequest} extends {@link RequestModel}
 *
 * <p>SetAppsAuthToApiProductRequest</p>
 */
public class SetAppsAuthToApiProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiProductId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Long > appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthValidTime")
    private String authValidTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private SetAppsAuthToApiProductRequest(Builder builder) {
        super(builder);
        this.apiProductId = builder.apiProductId;
        this.appIds = builder.appIds;
        this.authValidTime = builder.authValidTime;
        this.description = builder.description;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAppsAuthToApiProductRequest create() {
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
     * @return appIds
     */
    public java.util.List < Long > getAppIds() {
        return this.appIds;
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

    public static final class Builder extends Request.Builder<SetAppsAuthToApiProductRequest, Builder> {
        private String apiProductId; 
        private java.util.List < Long > appIds; 
        private String authValidTime; 
        private String description; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SetAppsAuthToApiProductRequest request) {
            super(request);
            this.apiProductId = request.apiProductId;
            this.appIds = request.appIds;
            this.authValidTime = request.authValidTime;
            this.description = request.description;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>117b7a64a8b3f064eaa4a47ac62aac5e</p>
         */
        public Builder apiProductId(String apiProductId) {
            this.putQueryParameter("ApiProductId", apiProductId);
            this.apiProductId = apiProductId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appIds(java.util.List < Long > appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
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
        public SetAppsAuthToApiProductRequest build() {
            return new SetAppsAuthToApiProductRequest(this);
        } 

    } 

}
