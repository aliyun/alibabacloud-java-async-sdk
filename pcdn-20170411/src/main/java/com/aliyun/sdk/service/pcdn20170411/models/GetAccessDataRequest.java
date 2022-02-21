// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessDataRequest} extends {@link RequestModel}
 *
 * <p>GetAccessDataRequest</p>
 */
public class GetAccessDataRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    @Validation(required = true)
    private String businessType;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Query
    @NameInMap("IspName")
    @Validation(required = true)
    private String ispName;

    @Query
    @NameInMap("PlatformType")
    @Validation(required = true)
    private String platformType;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private GetAccessDataRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.domain = builder.domain;
        this.endDate = builder.endDate;
        this.ispName = builder.ispName;
        this.platformType = builder.platformType;
        this.region = builder.region;
        this.securityToken = builder.securityToken;
        this.startDate = builder.startDate;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return ispName
     */
    public String getIspName() {
        return this.ispName;
    }

    /**
     * @return platformType
     */
    public String getPlatformType() {
        return this.platformType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetAccessDataRequest, Builder> {
        private String businessType; 
        private String domain; 
        private String endDate; 
        private String ispName; 
        private String platformType; 
        private String region; 
        private String securityToken; 
        private String startDate; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessDataRequest response) {
            super(response);
            this.businessType = response.businessType;
            this.domain = response.domain;
            this.endDate = response.endDate;
            this.ispName = response.ispName;
            this.platformType = response.platformType;
            this.region = response.region;
            this.securityToken = response.securityToken;
            this.startDate = response.startDate;
            this.version = response.version;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * IspName.
         */
        public Builder ispName(String ispName) {
            this.putQueryParameter("IspName", ispName);
            this.ispName = ispName;
            return this;
        }

        /**
         * PlatformType.
         */
        public Builder platformType(String platformType) {
            this.putQueryParameter("PlatformType", platformType);
            this.platformType = platformType;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetAccessDataRequest build() {
            return new GetAccessDataRequest(this);
        } 

    } 

}
