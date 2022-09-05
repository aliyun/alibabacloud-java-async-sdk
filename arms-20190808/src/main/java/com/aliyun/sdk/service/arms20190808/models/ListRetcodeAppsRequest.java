// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRetcodeAppsRequest} extends {@link RequestModel}
 *
 * <p>ListRetcodeAppsRequest</p>
 */
public class ListRetcodeAppsRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ListRetcodeAppsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRetcodeAppsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ListRetcodeAppsRequest, Builder> {
        private String regionId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ListRetcodeAppsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.securityToken = request.securityToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public ListRetcodeAppsRequest build() {
            return new ListRetcodeAppsRequest(this);
        } 

    } 

}
