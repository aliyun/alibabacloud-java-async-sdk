// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyADConnectorOfficeSiteRequest} extends {@link RequestModel}
 *
 * <p>ModifyADConnectorOfficeSiteRequest</p>
 */
public class ModifyADConnectorOfficeSiteRequest extends Request {
    @Query
    @NameInMap("AdHostname")
    private String adHostname;

    @Query
    @NameInMap("DnsAddress")
    private java.util.List < String > dnsAddress;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("DomainPassword")
    private String domainPassword;

    @Query
    @NameInMap("DomainUserName")
    private String domainUserName;

    @Query
    @NameInMap("MfaEnabled")
    private Boolean mfaEnabled;

    @Query
    @NameInMap("OUName")
    private String OUName;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("OfficeSiteName")
    private String officeSiteName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SubDomainDnsAddress")
    private java.util.List < String > subDomainDnsAddress;

    @Query
    @NameInMap("SubDomainName")
    private String subDomainName;

    private ModifyADConnectorOfficeSiteRequest(Builder builder) {
        super(builder);
        this.adHostname = builder.adHostname;
        this.dnsAddress = builder.dnsAddress;
        this.domainName = builder.domainName;
        this.domainPassword = builder.domainPassword;
        this.domainUserName = builder.domainUserName;
        this.mfaEnabled = builder.mfaEnabled;
        this.OUName = builder.OUName;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteName = builder.officeSiteName;
        this.regionId = builder.regionId;
        this.subDomainDnsAddress = builder.subDomainDnsAddress;
        this.subDomainName = builder.subDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyADConnectorOfficeSiteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adHostname
     */
    public String getAdHostname() {
        return this.adHostname;
    }

    /**
     * @return dnsAddress
     */
    public java.util.List < String > getDnsAddress() {
        return this.dnsAddress;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainPassword
     */
    public String getDomainPassword() {
        return this.domainPassword;
    }

    /**
     * @return domainUserName
     */
    public String getDomainUserName() {
        return this.domainUserName;
    }

    /**
     * @return mfaEnabled
     */
    public Boolean getMfaEnabled() {
        return this.mfaEnabled;
    }

    /**
     * @return OUName
     */
    public String getOUName() {
        return this.OUName;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return officeSiteName
     */
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subDomainDnsAddress
     */
    public java.util.List < String > getSubDomainDnsAddress() {
        return this.subDomainDnsAddress;
    }

    /**
     * @return subDomainName
     */
    public String getSubDomainName() {
        return this.subDomainName;
    }

    public static final class Builder extends Request.Builder<ModifyADConnectorOfficeSiteRequest, Builder> {
        private String adHostname; 
        private java.util.List < String > dnsAddress; 
        private String domainName; 
        private String domainPassword; 
        private String domainUserName; 
        private Boolean mfaEnabled; 
        private String OUName; 
        private String officeSiteId; 
        private String officeSiteName; 
        private String regionId; 
        private java.util.List < String > subDomainDnsAddress; 
        private String subDomainName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyADConnectorOfficeSiteRequest request) {
            super(request);
            this.adHostname = request.adHostname;
            this.dnsAddress = request.dnsAddress;
            this.domainName = request.domainName;
            this.domainPassword = request.domainPassword;
            this.domainUserName = request.domainUserName;
            this.mfaEnabled = request.mfaEnabled;
            this.OUName = request.OUName;
            this.officeSiteId = request.officeSiteId;
            this.officeSiteName = request.officeSiteName;
            this.regionId = request.regionId;
            this.subDomainDnsAddress = request.subDomainDnsAddress;
            this.subDomainName = request.subDomainName;
        } 

        /**
         * AdHostname.
         */
        public Builder adHostname(String adHostname) {
            this.putQueryParameter("AdHostname", adHostname);
            this.adHostname = adHostname;
            return this;
        }

        /**
         * DnsAddress.
         */
        public Builder dnsAddress(java.util.List < String > dnsAddress) {
            this.putQueryParameter("DnsAddress", dnsAddress);
            this.dnsAddress = dnsAddress;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainPassword.
         */
        public Builder domainPassword(String domainPassword) {
            this.putQueryParameter("DomainPassword", domainPassword);
            this.domainPassword = domainPassword;
            return this;
        }

        /**
         * DomainUserName.
         */
        public Builder domainUserName(String domainUserName) {
            this.putQueryParameter("DomainUserName", domainUserName);
            this.domainUserName = domainUserName;
            return this;
        }

        /**
         * MfaEnabled.
         */
        public Builder mfaEnabled(Boolean mfaEnabled) {
            this.putQueryParameter("MfaEnabled", mfaEnabled);
            this.mfaEnabled = mfaEnabled;
            return this;
        }

        /**
         * OUName.
         */
        public Builder OUName(String OUName) {
            this.putQueryParameter("OUName", OUName);
            this.OUName = OUName;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * OfficeSiteName.
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SubDomainDnsAddress.
         */
        public Builder subDomainDnsAddress(java.util.List < String > subDomainDnsAddress) {
            this.putQueryParameter("SubDomainDnsAddress", subDomainDnsAddress);
            this.subDomainDnsAddress = subDomainDnsAddress;
            return this;
        }

        /**
         * SubDomainName.
         */
        public Builder subDomainName(String subDomainName) {
            this.putQueryParameter("SubDomainName", subDomainName);
            this.subDomainName = subDomainName;
            return this;
        }

        @Override
        public ModifyADConnectorOfficeSiteRequest build() {
            return new ModifyADConnectorOfficeSiteRequest(this);
        } 

    } 

}
