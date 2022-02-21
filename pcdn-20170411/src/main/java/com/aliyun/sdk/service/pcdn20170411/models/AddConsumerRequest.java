// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddConsumerRequest} extends {@link RequestModel}
 *
 * <p>AddConsumerRequest</p>
 */
public class AddConsumerRequest extends Request {
    @Query
    @NameInMap("BandwidthRequirement")
    private String bandwidthRequirement;

    @Query
    @NameInMap("BusinessType")
    @Validation(required = true)
    private String businessType;

    @Query
    @NameInMap("Ca")
    private String ca;

    @Query
    @NameInMap("Company")
    @Validation(required = true)
    private String company;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("Mobile")
    @Validation(required = true)
    private String mobile;

    @Query
    @NameInMap("Operator")
    private String operator;

    @Query
    @NameInMap("Requirement")
    @Validation(required = true)
    private String requirement;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Site")
    @Validation(required = true)
    private String site;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private AddConsumerRequest(Builder builder) {
        super(builder);
        this.bandwidthRequirement = builder.bandwidthRequirement;
        this.businessType = builder.businessType;
        this.ca = builder.ca;
        this.company = builder.company;
        this.email = builder.email;
        this.mobile = builder.mobile;
        this.operator = builder.operator;
        this.requirement = builder.requirement;
        this.securityToken = builder.securityToken;
        this.site = builder.site;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddConsumerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidthRequirement
     */
    public String getBandwidthRequirement() {
        return this.bandwidthRequirement;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return ca
     */
    public String getCa() {
        return this.ca;
    }

    /**
     * @return company
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return requirement
     */
    public String getRequirement() {
        return this.requirement;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return site
     */
    public String getSite() {
        return this.site;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<AddConsumerRequest, Builder> {
        private String bandwidthRequirement; 
        private String businessType; 
        private String ca; 
        private String company; 
        private String email; 
        private String mobile; 
        private String operator; 
        private String requirement; 
        private String securityToken; 
        private String site; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(AddConsumerRequest response) {
            super(response);
            this.bandwidthRequirement = response.bandwidthRequirement;
            this.businessType = response.businessType;
            this.ca = response.ca;
            this.company = response.company;
            this.email = response.email;
            this.mobile = response.mobile;
            this.operator = response.operator;
            this.requirement = response.requirement;
            this.securityToken = response.securityToken;
            this.site = response.site;
            this.version = response.version;
        } 

        /**
         * BandwidthRequirement.
         */
        public Builder bandwidthRequirement(String bandwidthRequirement) {
            this.putQueryParameter("BandwidthRequirement", bandwidthRequirement);
            this.bandwidthRequirement = bandwidthRequirement;
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
         * Ca.
         */
        public Builder ca(String ca) {
            this.putQueryParameter("Ca", ca);
            this.ca = ca;
            return this;
        }

        /**
         * Company.
         */
        public Builder company(String company) {
            this.putQueryParameter("Company", company);
            this.company = company;
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
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * Requirement.
         */
        public Builder requirement(String requirement) {
            this.putQueryParameter("Requirement", requirement);
            this.requirement = requirement;
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
         * Site.
         */
        public Builder site(String site) {
            this.putQueryParameter("Site", site);
            this.site = site;
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
        public AddConsumerRequest build() {
            return new AddConsumerRequest(this);
        } 

    } 

}
