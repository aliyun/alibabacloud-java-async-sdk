// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigADConnectorTrustRequest} extends {@link RequestModel}
 *
 * <p>ConfigADConnectorTrustRequest</p>
 */
public class ConfigADConnectorTrustRequest extends Request {
    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("RdsLicenseDomain")
    private Boolean rdsLicenseDomain;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TrustKey")
    @Validation(required = true)
    private String trustKey;

    private ConfigADConnectorTrustRequest(Builder builder) {
        super(builder);
        this.officeSiteId = builder.officeSiteId;
        this.rdsLicenseDomain = builder.rdsLicenseDomain;
        this.regionId = builder.regionId;
        this.trustKey = builder.trustKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigADConnectorTrustRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return rdsLicenseDomain
     */
    public Boolean getRdsLicenseDomain() {
        return this.rdsLicenseDomain;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return trustKey
     */
    public String getTrustKey() {
        return this.trustKey;
    }

    public static final class Builder extends Request.Builder<ConfigADConnectorTrustRequest, Builder> {
        private String officeSiteId; 
        private Boolean rdsLicenseDomain; 
        private String regionId; 
        private String trustKey; 

        private Builder() {
            super();
        } 

        private Builder(ConfigADConnectorTrustRequest request) {
            super(request);
            this.officeSiteId = request.officeSiteId;
            this.rdsLicenseDomain = request.rdsLicenseDomain;
            this.regionId = request.regionId;
            this.trustKey = request.trustKey;
        } 

        /**
         * The ID of the AD workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * RdsLicenseDomain.
         */
        public Builder rdsLicenseDomain(Boolean rdsLicenseDomain) {
            this.putQueryParameter("RdsLicenseDomain", rdsLicenseDomain);
            this.rdsLicenseDomain = rdsLicenseDomain;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The trust password. You can specify the password when you configure a trust relationship between the AD domain and the ecd.acs domain.
         */
        public Builder trustKey(String trustKey) {
            this.putQueryParameter("TrustKey", trustKey);
            this.trustKey = trustKey;
            return this;
        }

        @Override
        public ConfigADConnectorTrustRequest build() {
            return new ConfigADConnectorTrustRequest(this);
        } 

    } 

}
