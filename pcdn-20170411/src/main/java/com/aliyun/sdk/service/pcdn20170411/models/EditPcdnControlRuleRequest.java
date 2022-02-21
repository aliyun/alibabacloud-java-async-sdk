// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditPcdnControlRuleRequest} extends {@link RequestModel}
 *
 * <p>EditPcdnControlRuleRequest</p>
 */
public class EditPcdnControlRuleRequest extends Request {
    @Query
    @NameInMap("AppVersion")
    @Validation(required = true)
    private String appVersion;

    @Query
    @NameInMap("BusinessType")
    @Validation(required = true)
    private String businessType;

    @Query
    @NameInMap("IspName")
    @Validation(required = true)
    private String ispName;

    @Query
    @NameInMap("Market")
    @Validation(required = true)
    private String market;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("PlatformType")
    @Validation(required = true)
    private String platformType;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private EditPcdnControlRuleRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.businessType = builder.businessType;
        this.ispName = builder.ispName;
        this.market = builder.market;
        this.name = builder.name;
        this.platformType = builder.platformType;
        this.region = builder.region;
        this.resourceId = builder.resourceId;
        this.securityToken = builder.securityToken;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditPcdnControlRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return ispName
     */
    public String getIspName() {
        return this.ispName;
    }

    /**
     * @return market
     */
    public String getMarket() {
        return this.market;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<EditPcdnControlRuleRequest, Builder> {
        private String appVersion; 
        private String businessType; 
        private String ispName; 
        private String market; 
        private String name; 
        private String platformType; 
        private String region; 
        private String resourceId; 
        private String securityToken; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(EditPcdnControlRuleRequest response) {
            super(response);
            this.appVersion = response.appVersion;
            this.businessType = response.businessType;
            this.ispName = response.ispName;
            this.market = response.market;
            this.name = response.name;
            this.platformType = response.platformType;
            this.region = response.region;
            this.resourceId = response.resourceId;
            this.securityToken = response.securityToken;
            this.version = response.version;
        } 

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
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
         * IspName.
         */
        public Builder ispName(String ispName) {
            this.putQueryParameter("IspName", ispName);
            this.ispName = ispName;
            return this;
        }

        /**
         * Market.
         */
        public Builder market(String market) {
            this.putQueryParameter("Market", market);
            this.market = market;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
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
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public EditPcdnControlRuleRequest build() {
            return new EditPcdnControlRuleRequest(this);
        } 

    } 

}
