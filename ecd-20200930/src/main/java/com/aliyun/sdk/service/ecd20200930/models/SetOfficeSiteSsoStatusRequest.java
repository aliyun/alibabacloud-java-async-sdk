// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetOfficeSiteSsoStatusRequest} extends {@link RequestModel}
 *
 * <p>SetOfficeSiteSsoStatusRequest</p>
 */
public class SetOfficeSiteSsoStatusRequest extends Request {
    @Query
    @NameInMap("EnableSso")
    @Validation(required = true)
    private Boolean enableSso;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SsoType")
    private String ssoType;

    private SetOfficeSiteSsoStatusRequest(Builder builder) {
        super(builder);
        this.enableSso = builder.enableSso;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.ssoType = builder.ssoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetOfficeSiteSsoStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableSso
     */
    public Boolean getEnableSso() {
        return this.enableSso;
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

    /**
     * @return ssoType
     */
    public String getSsoType() {
        return this.ssoType;
    }

    public static final class Builder extends Request.Builder<SetOfficeSiteSsoStatusRequest, Builder> {
        private Boolean enableSso; 
        private String officeSiteId; 
        private String regionId; 
        private String ssoType; 

        private Builder() {
            super();
        } 

        private Builder(SetOfficeSiteSsoStatusRequest response) {
            super(response);
            this.enableSso = response.enableSso;
            this.officeSiteId = response.officeSiteId;
            this.regionId = response.regionId;
            this.ssoType = response.ssoType;
        } 

        /**
         * EnableSso.
         */
        public Builder enableSso(Boolean enableSso) {
            this.putQueryParameter("EnableSso", enableSso);
            this.enableSso = enableSso;
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

        /**
         * SsoType.
         */
        public Builder ssoType(String ssoType) {
            this.putQueryParameter("SsoType", ssoType);
            this.ssoType = ssoType;
            return this;
        }

        @Override
        public SetOfficeSiteSsoStatusRequest build() {
            return new SetOfficeSiteSsoStatusRequest(this);
        } 

    } 

}
