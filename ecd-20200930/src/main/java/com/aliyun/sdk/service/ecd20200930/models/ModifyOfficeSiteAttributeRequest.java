// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOfficeSiteAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyOfficeSiteAttributeRequest</p>
 */
public class ModifyOfficeSiteAttributeRequest extends Request {
    @Query
    @NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @Query
    @NameInMap("NeedVerifyLoginRisk")
    private Boolean needVerifyLoginRisk;

    @Query
    @NameInMap("NeedVerifyZeroDevice")
    private Boolean needVerifyZeroDevice;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("OfficeSiteName")
    private String officeSiteName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyOfficeSiteAttributeRequest(Builder builder) {
        super(builder);
        this.desktopAccessType = builder.desktopAccessType;
        this.needVerifyLoginRisk = builder.needVerifyLoginRisk;
        this.needVerifyZeroDevice = builder.needVerifyZeroDevice;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteName = builder.officeSiteName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfficeSiteAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopAccessType
     */
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    /**
     * @return needVerifyLoginRisk
     */
    public Boolean getNeedVerifyLoginRisk() {
        return this.needVerifyLoginRisk;
    }

    /**
     * @return needVerifyZeroDevice
     */
    public Boolean getNeedVerifyZeroDevice() {
        return this.needVerifyZeroDevice;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return officeSiteName
     */
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyOfficeSiteAttributeRequest, Builder> {
        private String desktopAccessType; 
        private Boolean needVerifyLoginRisk; 
        private Boolean needVerifyZeroDevice; 
        private String officeSiteId; 
        private String officeSiteName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOfficeSiteAttributeRequest response) {
            super(response);
            this.desktopAccessType = response.desktopAccessType;
            this.needVerifyLoginRisk = response.needVerifyLoginRisk;
            this.needVerifyZeroDevice = response.needVerifyZeroDevice;
            this.officeSiteId = response.officeSiteId;
            this.officeSiteName = response.officeSiteName;
            this.regionId = response.regionId;
        } 

        /**
         * DesktopAccessType.
         */
        public Builder desktopAccessType(String desktopAccessType) {
            this.putQueryParameter("DesktopAccessType", desktopAccessType);
            this.desktopAccessType = desktopAccessType;
            return this;
        }

        /**
         * NeedVerifyLoginRisk.
         */
        public Builder needVerifyLoginRisk(Boolean needVerifyLoginRisk) {
            this.putQueryParameter("NeedVerifyLoginRisk", needVerifyLoginRisk);
            this.needVerifyLoginRisk = needVerifyLoginRisk;
            return this;
        }

        /**
         * NeedVerifyZeroDevice.
         */
        public Builder needVerifyZeroDevice(Boolean needVerifyZeroDevice) {
            this.putQueryParameter("NeedVerifyZeroDevice", needVerifyZeroDevice);
            this.needVerifyZeroDevice = needVerifyZeroDevice;
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
         * OfficeSiteName.
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
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
        public ModifyOfficeSiteAttributeRequest build() {
            return new ModifyOfficeSiteAttributeRequest(this);
        } 

    } 

}
