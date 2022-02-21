// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOfficeSiteMfaEnabledRequest} extends {@link RequestModel}
 *
 * <p>ModifyOfficeSiteMfaEnabledRequest</p>
 */
public class ModifyOfficeSiteMfaEnabledRequest extends Request {
    @Query
    @NameInMap("MfaEnabled")
    @Validation(required = true)
    private Boolean mfaEnabled;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyOfficeSiteMfaEnabledRequest(Builder builder) {
        super(builder);
        this.mfaEnabled = builder.mfaEnabled;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfficeSiteMfaEnabledRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mfaEnabled
     */
    public Boolean getMfaEnabled() {
        return this.mfaEnabled;
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

    public static final class Builder extends Request.Builder<ModifyOfficeSiteMfaEnabledRequest, Builder> {
        private Boolean mfaEnabled; 
        private String officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOfficeSiteMfaEnabledRequest response) {
            super(response);
            this.mfaEnabled = response.mfaEnabled;
            this.officeSiteId = response.officeSiteId;
            this.regionId = response.regionId;
        } 

        /**
         * MfaEnabled.
         */
        public Builder mfaEnabled(Boolean mfaEnabled) {
            this.putQueryParameter("MfaEnabled", mfaEnabled);
            this.mfaEnabled = mfaEnabled;
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
        public ModifyOfficeSiteMfaEnabledRequest build() {
            return new ModifyOfficeSiteMfaEnabledRequest(this);
        } 

    } 

}
