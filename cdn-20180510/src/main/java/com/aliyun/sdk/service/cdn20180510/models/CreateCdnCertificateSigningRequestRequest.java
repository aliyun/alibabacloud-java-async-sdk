// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCdnCertificateSigningRequestRequest} extends {@link RequestModel}
 *
 * <p>CreateCdnCertificateSigningRequestRequest</p>
 */
public class CreateCdnCertificateSigningRequestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Organization")
    private String organization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationUnit")
    private String organizationUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SANs")
    private String SANs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private CreateCdnCertificateSigningRequestRequest(Builder builder) {
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

    public static CreateCdnCertificateSigningRequestRequest create() {
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

    public static final class Builder extends Request.Builder<CreateCdnCertificateSigningRequestRequest, Builder> {
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

        private Builder(CreateCdnCertificateSigningRequestRequest request) {
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
         * <p>The city. Default value: Hangzhou.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * <p>The Common Name of the certificate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CommonName</p>
         */
        public Builder commonName(String commonName) {
            this.putQueryParameter("CommonName", commonName);
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The country or region in which the organization is located. Default value: CN.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The name of the organization. Default value: Alibaba Inc.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Inc</p>
         */
        public Builder organization(String organization) {
            this.putQueryParameter("Organization", organization);
            this.organization = organization;
            return this;
        }

        /**
         * <p>The name of the department. Default value: Aliyun CDN.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun CDN</p>
         */
        public Builder organizationUnit(String organizationUnit) {
            this.putQueryParameter("OrganizationUnit", organizationUnit);
            this.organizationUnit = organizationUnit;
            return this;
        }

        /**
         * <p>The Subject Alternative Name (SAN) extension of the SSL certificate. This extension is used to add domain names to the certificate. Separate multiple domain names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder SANs(String SANs) {
            this.putQueryParameter("SANs", SANs);
            this.SANs = SANs;
            return this;
        }

        /**
         * <p>The provincial district. Default value: Zhejiang.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public CreateCdnCertificateSigningRequestRequest build() {
            return new CreateCdnCertificateSigningRequestRequest(this);
        } 

    } 

}
