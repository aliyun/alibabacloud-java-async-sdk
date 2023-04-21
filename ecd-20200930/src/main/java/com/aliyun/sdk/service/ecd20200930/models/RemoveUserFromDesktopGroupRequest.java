// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUserFromDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveUserFromDesktopGroupRequest</p>
 */
public class RemoveUserFromDesktopGroupRequest extends Request {
    @Query
    @NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @Query
    @NameInMap("DesktopGroupIds")
    private java.util.List < String > desktopGroupIds;

    @Query
    @NameInMap("EndUserIds")
    @Validation(required = true)
    private java.util.List < String > endUserIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private RemoveUserFromDesktopGroupRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopGroupIds = builder.desktopGroupIds;
        this.endUserIds = builder.endUserIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUserFromDesktopGroupRequest create() {
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
     * @return desktopGroupIds
     */
    public java.util.List < String > getDesktopGroupIds() {
        return this.desktopGroupIds;
    }

    /**
     * @return endUserIds
     */
    public java.util.List < String > getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RemoveUserFromDesktopGroupRequest, Builder> {
        private String desktopGroupId; 
        private java.util.List < String > desktopGroupIds; 
        private java.util.List < String > endUserIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUserFromDesktopGroupRequest request) {
            super(request);
            this.desktopGroupId = request.desktopGroupId;
            this.desktopGroupIds = request.desktopGroupIds;
            this.endUserIds = request.endUserIds;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the desktop group on which the permissions you want to revoke from the authorized user.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * Details about the IDs of the desktop groups.
         */
        public Builder desktopGroupIds(java.util.List < String > desktopGroupIds) {
            this.putQueryParameter("DesktopGroupIds", desktopGroupIds);
            this.desktopGroupIds = desktopGroupIds;
            return this;
        }

        /**
         * Details about the authorized users from which you want to revoke permissions on the desktop group.
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
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
        public RemoveUserFromDesktopGroupRequest build() {
            return new RemoveUserFromDesktopGroupRequest(this);
        } 

    } 

}
