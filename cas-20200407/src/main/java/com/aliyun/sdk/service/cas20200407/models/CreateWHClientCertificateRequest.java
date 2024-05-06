// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWHClientCertificateRequest} extends {@link RequestModel}
 *
 * <p>CreateWHClientCertificateRequest</p>
 */
public class CreateWHClientCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AfterTime")
    private Long afterTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeforeTime")
    private Long beforeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Days")
    private Long days;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Immediately")
    private Long immediately;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Locality")
    private String locality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Months")
    private Long months;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Organization")
    private String organization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationUnit")
    private String organizationUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SanType")
    private Long sanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SanValue")
    private String sanValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Years")
    private Long years;

    private CreateWHClientCertificateRequest(Builder builder) {
        super(builder);
        this.afterTime = builder.afterTime;
        this.algorithm = builder.algorithm;
        this.beforeTime = builder.beforeTime;
        this.commonName = builder.commonName;
        this.country = builder.country;
        this.csr = builder.csr;
        this.days = builder.days;
        this.immediately = builder.immediately;
        this.locality = builder.locality;
        this.months = builder.months;
        this.organization = builder.organization;
        this.organizationUnit = builder.organizationUnit;
        this.parentIdentifier = builder.parentIdentifier;
        this.sanType = builder.sanType;
        this.sanValue = builder.sanValue;
        this.state = builder.state;
        this.years = builder.years;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWHClientCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return afterTime
     */
    public Long getAfterTime() {
        return this.afterTime;
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return beforeTime
     */
    public Long getBeforeTime() {
        return this.beforeTime;
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
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return days
     */
    public Long getDays() {
        return this.days;
    }

    /**
     * @return immediately
     */
    public Long getImmediately() {
        return this.immediately;
    }

    /**
     * @return locality
     */
    public String getLocality() {
        return this.locality;
    }

    /**
     * @return months
     */
    public Long getMonths() {
        return this.months;
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
     * @return parentIdentifier
     */
    public String getParentIdentifier() {
        return this.parentIdentifier;
    }

    /**
     * @return sanType
     */
    public Long getSanType() {
        return this.sanType;
    }

    /**
     * @return sanValue
     */
    public String getSanValue() {
        return this.sanValue;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return years
     */
    public Long getYears() {
        return this.years;
    }

    public static final class Builder extends Request.Builder<CreateWHClientCertificateRequest, Builder> {
        private Long afterTime; 
        private String algorithm; 
        private Long beforeTime; 
        private String commonName; 
        private String country; 
        private String csr; 
        private Long days; 
        private Long immediately; 
        private String locality; 
        private Long months; 
        private String organization; 
        private String organizationUnit; 
        private String parentIdentifier; 
        private Long sanType; 
        private String sanValue; 
        private String state; 
        private Long years; 

        private Builder() {
            super();
        } 

        private Builder(CreateWHClientCertificateRequest request) {
            super(request);
            this.afterTime = request.afterTime;
            this.algorithm = request.algorithm;
            this.beforeTime = request.beforeTime;
            this.commonName = request.commonName;
            this.country = request.country;
            this.csr = request.csr;
            this.days = request.days;
            this.immediately = request.immediately;
            this.locality = request.locality;
            this.months = request.months;
            this.organization = request.organization;
            this.organizationUnit = request.organizationUnit;
            this.parentIdentifier = request.parentIdentifier;
            this.sanType = request.sanType;
            this.sanValue = request.sanValue;
            this.state = request.state;
            this.years = request.years;
        } 

        /**
         * AfterTime.
         */
        public Builder afterTime(Long afterTime) {
            this.putQueryParameter("AfterTime", afterTime);
            this.afterTime = afterTime;
            return this;
        }

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * BeforeTime.
         */
        public Builder beforeTime(Long beforeTime) {
            this.putQueryParameter("BeforeTime", beforeTime);
            this.beforeTime = beforeTime;
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
         * Csr.
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * Days.
         */
        public Builder days(Long days) {
            this.putQueryParameter("Days", days);
            this.days = days;
            return this;
        }

        /**
         * Immediately.
         */
        public Builder immediately(Long immediately) {
            this.putQueryParameter("Immediately", immediately);
            this.immediately = immediately;
            return this;
        }

        /**
         * Locality.
         */
        public Builder locality(String locality) {
            this.putQueryParameter("Locality", locality);
            this.locality = locality;
            return this;
        }

        /**
         * Months.
         */
        public Builder months(Long months) {
            this.putQueryParameter("Months", months);
            this.months = months;
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
         * ParentIdentifier.
         */
        public Builder parentIdentifier(String parentIdentifier) {
            this.putQueryParameter("ParentIdentifier", parentIdentifier);
            this.parentIdentifier = parentIdentifier;
            return this;
        }

        /**
         * SanType.
         */
        public Builder sanType(Long sanType) {
            this.putQueryParameter("SanType", sanType);
            this.sanType = sanType;
            return this;
        }

        /**
         * SanValue.
         */
        public Builder sanValue(String sanValue) {
            this.putQueryParameter("SanValue", sanValue);
            this.sanValue = sanValue;
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

        /**
         * Years.
         */
        public Builder years(Long years) {
            this.putQueryParameter("Years", years);
            this.years = years;
            return this;
        }

        @Override
        public CreateWHClientCertificateRequest build() {
            return new CreateWHClientCertificateRequest(this);
        } 

    } 

}
