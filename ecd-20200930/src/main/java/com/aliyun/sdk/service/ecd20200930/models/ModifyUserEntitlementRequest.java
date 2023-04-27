// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserEntitlementRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserEntitlementRequest</p>
 */
public class ModifyUserEntitlementRequest extends Request {
    @Query
    @NameInMap("AuthorizeDesktopId")
    private java.util.List < String > authorizeDesktopId;

    @Query
    @NameInMap("EndUserId")
    private java.util.List < String > endUserId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RevokeDesktopId")
    private java.util.List < String > revokeDesktopId;

    private ModifyUserEntitlementRequest(Builder builder) {
        super(builder);
        this.authorizeDesktopId = builder.authorizeDesktopId;
        this.endUserId = builder.endUserId;
        this.regionId = builder.regionId;
        this.revokeDesktopId = builder.revokeDesktopId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserEntitlementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizeDesktopId
     */
    public java.util.List < String > getAuthorizeDesktopId() {
        return this.authorizeDesktopId;
    }

    /**
     * @return endUserId
     */
    public java.util.List < String > getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return revokeDesktopId
     */
    public java.util.List < String > getRevokeDesktopId() {
        return this.revokeDesktopId;
    }

    public static final class Builder extends Request.Builder<ModifyUserEntitlementRequest, Builder> {
        private java.util.List < String > authorizeDesktopId; 
        private java.util.List < String > endUserId; 
        private String regionId; 
        private java.util.List < String > revokeDesktopId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserEntitlementRequest request) {
            super(request);
            this.authorizeDesktopId = request.authorizeDesktopId;
            this.endUserId = request.endUserId;
            this.regionId = request.regionId;
            this.revokeDesktopId = request.revokeDesktopId;
        } 

        /**
         * The ID of the request.
         */
        public Builder authorizeDesktopId(java.util.List < String > authorizeDesktopId) {
            this.putQueryParameter("AuthorizeDesktopId", authorizeDesktopId);
            this.authorizeDesktopId = authorizeDesktopId;
            return this;
        }

        /**
         * The ID of cloud desktop.
         */
        public Builder endUserId(java.util.List < String > endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The IDs of cloud desktops which you want to revoke permissions from regular users.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ModifyUserEntitlement
         */
        public Builder revokeDesktopId(java.util.List < String > revokeDesktopId) {
            this.putQueryParameter("RevokeDesktopId", revokeDesktopId);
            this.revokeDesktopId = revokeDesktopId;
            return this;
        }

        @Override
        public ModifyUserEntitlementRequest build() {
            return new ModifyUserEntitlementRequest(this);
        } 

    } 

}
