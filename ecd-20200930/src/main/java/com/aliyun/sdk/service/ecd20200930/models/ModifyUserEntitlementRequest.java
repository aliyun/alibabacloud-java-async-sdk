// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyUserEntitlementRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserEntitlementRequest</p>
 */
public class ModifyUserEntitlementRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizeDesktopId")
    private java.util.List < String > authorizeDesktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private java.util.List < String > endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevokeDesktopId")
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
         * <p>The IDs of the cloud computers to which you want to add end users.</p>
         */
        public Builder authorizeDesktopId(java.util.List < String > authorizeDesktopId) {
            this.putQueryParameter("AuthorizeDesktopId", authorizeDesktopId);
            this.authorizeDesktopId = authorizeDesktopId;
            return this;
        }

        /**
         * <p>The ID of the users.</p>
         */
        public Builder endUserId(java.util.List < String > endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IDs of the cloud computers whose end users you want to remove.</p>
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
