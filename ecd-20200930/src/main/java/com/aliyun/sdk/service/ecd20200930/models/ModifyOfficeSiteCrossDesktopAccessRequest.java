// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOfficeSiteCrossDesktopAccessRequest} extends {@link RequestModel}
 *
 * <p>ModifyOfficeSiteCrossDesktopAccessRequest</p>
 */
public class ModifyOfficeSiteCrossDesktopAccessRequest extends Request {
    @Query
    @NameInMap("EnableCrossDesktopAccess")
    @Validation(required = true)
    private Boolean enableCrossDesktopAccess;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyOfficeSiteCrossDesktopAccessRequest(Builder builder) {
        super(builder);
        this.enableCrossDesktopAccess = builder.enableCrossDesktopAccess;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfficeSiteCrossDesktopAccessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableCrossDesktopAccess
     */
    public Boolean getEnableCrossDesktopAccess() {
        return this.enableCrossDesktopAccess;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyOfficeSiteCrossDesktopAccessRequest, Builder> {
        private Boolean enableCrossDesktopAccess; 
        private String officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOfficeSiteCrossDesktopAccessRequest request) {
            super(request);
            this.enableCrossDesktopAccess = request.enableCrossDesktopAccess;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
        } 

        /**
         * EnableCrossDesktopAccess.
         */
        public Builder enableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
            this.putQueryParameter("EnableCrossDesktopAccess", enableCrossDesktopAccess);
            this.enableCrossDesktopAccess = enableCrossDesktopAccess;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
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
        public ModifyOfficeSiteCrossDesktopAccessRequest build() {
            return new ModifyOfficeSiteCrossDesktopAccessRequest(this);
        } 

    } 

}
