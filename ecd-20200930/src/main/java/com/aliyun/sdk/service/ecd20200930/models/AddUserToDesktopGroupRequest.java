// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserToDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>AddUserToDesktopGroupRequest</p>
 */
public class AddUserToDesktopGroupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("EndUserIds")
    @Validation(required = true)
    private java.util.List < String > endUserIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AddUserToDesktopGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.desktopGroupId = builder.desktopGroupId;
        this.endUserIds = builder.endUserIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserToDesktopGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
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

    public static final class Builder extends Request.Builder<AddUserToDesktopGroupRequest, Builder> {
        private String clientToken; 
        private String desktopGroupId; 
        private java.util.List < String > endUserIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddUserToDesktopGroupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.desktopGroupId = response.desktopGroupId;
            this.endUserIds = response.endUserIds;
            this.regionId = response.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DesktopGroupId.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * EndUserIds.
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddUserToDesktopGroupRequest build() {
            return new AddUserToDesktopGroupRequest(this);
        } 

    } 

}
