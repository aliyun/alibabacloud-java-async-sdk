// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyAntChainCertificateWithKeyAutoCreationRequest} extends {@link RequestModel}
 *
 * <p>ApplyAntChainCertificateWithKeyAutoCreationRequest</p>
 */
public class ApplyAntChainCertificateWithKeyAutoCreationRequest extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("CommonName")
    @Validation(required = true)
    private String commonName;

    @Body
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Body
    @NameInMap("CountryName")
    @Validation(required = true)
    private String countryName;

    @Body
    @NameInMap("LocalityName")
    @Validation(required = true)
    private String localityName;

    @Body
    @NameInMap("OrganizationName")
    @Validation(required = true)
    private String organizationName;

    @Body
    @NameInMap("OrganizationUnitName")
    @Validation(required = true)
    private String organizationUnitName;

    @Body
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("StateOrProvinceName")
    @Validation(required = true)
    private String stateOrProvinceName;

    private ApplyAntChainCertificateWithKeyAutoCreationRequest(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.commonName = builder.commonName;
        this.consortiumId = builder.consortiumId;
        this.countryName = builder.countryName;
        this.localityName = builder.localityName;
        this.organizationName = builder.organizationName;
        this.organizationUnitName = builder.organizationUnitName;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.stateOrProvinceName = builder.stateOrProvinceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyAntChainCertificateWithKeyAutoCreationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stateOrProvinceName
     */
    public String getStateOrProvinceName() {
        return this.stateOrProvinceName;
    }

    public static final class Builder extends Request.Builder<ApplyAntChainCertificateWithKeyAutoCreationRequest, Builder> {
        private String antChainId; 
        private String commonName; 
        private String consortiumId; 
        private String countryName; 
        private String localityName; 
        private String organizationName; 
        private String organizationUnitName; 
        private String password; 
        private String regionId; 
        private String stateOrProvinceName; 

        private Builder() {
            super();
        } 

        private Builder(ApplyAntChainCertificateWithKeyAutoCreationRequest response) {
            super(response);
            this.antChainId = response.antChainId;
            this.commonName = response.commonName;
            this.consortiumId = response.consortiumId;
            this.countryName = response.countryName;
            this.localityName = response.localityName;
            this.organizationName = response.organizationName;
            this.organizationUnitName = response.organizationUnitName;
            this.password = response.password;
            this.regionId = response.regionId;
            this.stateOrProvinceName = response.stateOrProvinceName;
        } 

        /**
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
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
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public ApplyAntChainCertificateWithKeyAutoCreationRequest build() {
            return new ApplyAntChainCertificateWithKeyAutoCreationRequest(this);
        } 

    } 

}
