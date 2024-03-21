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
            this.SANs = request.SANs;
            this.state = request.state;
        } 

        /**
         * The city. Default value: Hangzhou.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * The Common Name of the certificate.
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * The country or region in which the organization is located. Default value: CN.
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * The email address.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * The name of the organization. Default value: Alibaba Inc.
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * The name of the department. Default value: Aliyun CDN.
         */
        public Builder organizationUnit(String organizationUnit) {
            this.putQueryParameter("OrganizationUnit", organizationUnit);
            this.organizationUnit = organizationUnit;
            return this;
        }

        /**
         * The Subject Alternative Name (SAN) extension that allows multiple domain names to be associated with the certificate. Separate multiple domain names with commas (,).
         */
        public Builder SANs(String SANs) {
            this.putQueryParameter("SANs", SANs);
            this.SANs = SANs;
            return this;
        }

        /**
         * The provincial district. Default value: Zhejiang.
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
