// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableDesktopsInGroupRequest} extends {@link RequestModel}
 *
 * <p>DisableDesktopsInGroupRequest</p>
 */
public class DisableDesktopsInGroupRequest extends Request {
    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("DesktopIds")
    @Validation(required = true)
    private java.util.List < String > desktopIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DisableDesktopsInGroupRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopIds = builder.desktopIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableDesktopsInGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return desktopIds
     */
    public java.util.List < String > getDesktopIds() {
        return this.desktopIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DisableDesktopsInGroupRequest, Builder> {
        private String desktopGroupId; 
        private java.util.List < String > desktopIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DisableDesktopsInGroupRequest request) {
            super(request);
            this.desktopGroupId = request.desktopGroupId;
            this.desktopIds = request.desktopIds;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the desktop group.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The IDs of the cloud desktops.
         */
        public Builder desktopIds(java.util.List < String > desktopIds) {
            this.putQueryParameter("DesktopIds", desktopIds);
            this.desktopIds = desktopIds;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DisableDesktopsInGroupRequest build() {
            return new DisableDesktopsInGroupRequest(this);
        } 

    } 

}
