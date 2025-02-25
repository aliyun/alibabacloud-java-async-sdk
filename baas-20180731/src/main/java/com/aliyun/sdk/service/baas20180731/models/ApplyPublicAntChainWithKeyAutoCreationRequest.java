// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyPublicAntChainWithKeyAutoCreationRequest} extends {@link RequestModel}
 *
 * <p>ApplyPublicAntChainWithKeyAutoCreationRequest</p>
 */
public class ApplyPublicAntChainWithKeyAutoCreationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizid")
    private String bizid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CountryName")
    private String countryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LocalityName")
    private String localityName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrganizationName")
    private String organizationName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrganizationUnitName")
    private String organizationUnitName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StateOrProvinceName")
    private String stateOrProvinceName;

    private ApplyPublicAntChainWithKeyAutoCreationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.commonName = builder.commonName;
        this.countryName = builder.countryName;
        this.localityName = builder.localityName;
        this.organizationName = builder.organizationName;
        this.organizationUnitName = builder.organizationUnitName;
        this.password = builder.password;
        this.stateOrProvinceName = builder.stateOrProvinceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyPublicAntChainWithKeyAutoCreationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return countryName
     */
    public String getCountryName() {
        return this.countryName;
    }

    /**
     * @return localityName
     */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * @return organizationName
     */
    public String getOrganizationName() {
        return this.organizationName;
    }

    /**
     * @return organizationUnitName
     */
    public String getOrganizationUnitName() {
        return this.organizationUnitName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return stateOrProvinceName
     */
    public String getStateOrProvinceName() {
        return this.stateOrProvinceName;
    }

    public static final class Builder extends Request.Builder<ApplyPublicAntChainWithKeyAutoCreationRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private String commonName; 
        private String countryName; 
        private String localityName; 
        private String organizationName; 
        private String organizationUnitName; 
        private String password; 
        private String stateOrProvinceName; 

        private Builder() {
            super();
        } 

        private Builder(ApplyPublicAntChainWithKeyAutoCreationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
            this.commonName = request.commonName;
            this.countryName = request.countryName;
            this.localityName = request.localityName;
            this.organizationName = request.organizationName;
            this.organizationUnitName = request.organizationUnitName;
            this.password = request.password;
            this.stateOrProvinceName = request.stateOrProvinceName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * CommonName.
         */
        public Builder commonName(String commonName) {
            this.putBodyParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * CountryName.
         */
        public Builder countryName(String countryName) {
            this.putBodyParameter("CountryName", countryName);
            this.countryName = countryName;
            return this;
        }

        /**
         * LocalityName.
         */
        public Builder localityName(String localityName) {
            this.putBodyParameter("LocalityName", localityName);
            this.localityName = localityName;
            return this;
        }

        /**
         * OrganizationName.
         */
        public Builder organizationName(String organizationName) {
            this.putBodyParameter("OrganizationName", organizationName);
            this.organizationName = organizationName;
            return this;
        }

        /**
         * OrganizationUnitName.
         */
        public Builder organizationUnitName(String organizationUnitName) {
            this.putBodyParameter("OrganizationUnitName", organizationUnitName);
            this.organizationUnitName = organizationUnitName;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * StateOrProvinceName.
         */
        public Builder stateOrProvinceName(String stateOrProvinceName) {
            this.putBodyParameter("StateOrProvinceName", stateOrProvinceName);
            this.stateOrProvinceName = stateOrProvinceName;
            return this;
        }

        @Override
        public ApplyPublicAntChainWithKeyAutoCreationRequest build() {
            return new ApplyPublicAntChainWithKeyAutoCreationRequest(this);
        } 

    } 

}
