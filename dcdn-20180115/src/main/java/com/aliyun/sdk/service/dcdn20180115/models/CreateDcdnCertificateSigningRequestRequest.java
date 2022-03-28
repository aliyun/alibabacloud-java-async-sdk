// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnCertificateSigningRequestRequest} extends {@link RequestModel}
 *
 * <p>CreateDcdnCertificateSigningRequestRequest</p>
 */
public class CreateDcdnCertificateSigningRequestRequest extends Request {
    @Query
    @NameInMap("City")
    private String city;

    @Query
    @NameInMap("CommonName")
    @Validation(required = true)
    private String commonName;

    @Query
    @NameInMap("Country")
    private String country;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("Organization")
    private String organization;

    @Query
    @NameInMap("OrganizationUnit")
    private String organizationUnit;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SANs")
    private String SANs;

    @Query
    @NameInMap("State")
    private String state;

    private CreateDcdnCertificateSigningRequestRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.commonName = builder.commonName;
        this.country = builder.country;
        this.email = builder.email;
        this.organization = builder.organization;
        this.organizationUnit = builder.organizationUnit;
        this.ownerId = builder.ownerId;
        this.SANs = builder.SANs;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDcdnCertificateSigningRequestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return organization
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * @return organizationUnit
     */
    public String getOrganizationUnit() {
        return this.organizationUnit;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return SANs
     */
    public String getSANs() {
        return this.SANs;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<CreateDcdnCertificateSigningRequestRequest, Builder> {
        private String city; 
        private String commonName; 
        private String country; 
        private String email; 
        private String organization; 
        private String organizationUnit; 
        private Long ownerId; 
        private String SANs; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(CreateDcdnCertificateSigningRequestRequest request) {
            super(request);
            this.city = request.city;
            this.commonName = request.commonName;
            this.country = request.country;
            this.email = request.email;
            this.organization = request.organization;
            this.organizationUnit = request.organizationUnit;
            this.ownerId = request.ownerId;
            this.SANs = request.SANs;
            this.state = request.state;
        } 

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * CommonName.
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Organization.
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * OrganizationUnit.
         */
        public Builder organizationUnit(String organizationUnit) {
            this.putQueryParameter("OrganizationUnit", organizationUnit);
            this.organizationUnit = organizationUnit;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SANs.
         */
        public Builder SANs(String SANs) {
            this.putQueryParameter("SANs", SANs);
            this.SANs = SANs;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public CreateDcdnCertificateSigningRequestRequest build() {
            return new CreateDcdnCertificateSigningRequestRequest(this);
        } 

    } 

}
