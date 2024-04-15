// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyADConnectorDirectoryRequest} extends {@link RequestModel}
 *
 * <p>ModifyADConnectorDirectoryRequest</p>
 */
public class ModifyADConnectorDirectoryRequest extends Request {
    @Query
    @NameInMap("AdHostname")
    private String adHostname;

    @Query
    @NameInMap("DirectoryId")
    @Validation(required = true)
    private String directoryId;

    @Query
    @NameInMap("DirectoryName")
    private String directoryName;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SubDomainDnsAddress")
    private java.util.List < String > subDomainDnsAddress;

    @Query
    @NameInMap("SubDomainName")
    private String subDomainName;

    private ModifyADConnectorDirectoryRequest(Builder builder) {
        super(builder);
        this.adHostname = builder.adHostname;
        this.directoryId = builder.directoryId;
        this.directoryName = builder.directoryName;
        this.dnsAddress = builder.dnsAddress;
        this.domainName = builder.domainName;
        this.domainPassword = builder.domainPassword;
        this.domainUserName = builder.domainUserName;
        this.mfaEnabled = builder.mfaEnabled;
        this.OUName = builder.OUName;
        this.regionId = builder.regionId;
        this.subDomainDnsAddress = builder.subDomainDnsAddress;
        this.subDomainName = builder.subDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyADConnectorDirectoryRequest create() {
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return directoryName
     */
    public String getDirectoryName() {
        return this.directoryName;
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

    public static final class Builder extends Request.Builder<ModifyADConnectorDirectoryRequest, Builder> {
        private String adHostname; 
        private String directoryId; 
        private String directoryName; 
        private java.util.List < String > dnsAddress; 
        private String domainName; 
        private String domainPassword; 
        private String domainUserName; 
        private Boolean mfaEnabled; 
        private String OUName; 
        private String regionId; 
        private java.util.List < String > subDomainDnsAddress; 
        private String subDomainName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyADConnectorDirectoryRequest request) {
            super(request);
            this.adHostname = request.adHostname;
            this.directoryId = request.directoryId;
            this.directoryName = request.directoryName;
            this.dnsAddress = request.dnsAddress;
            this.domainName = request.domainName;
            this.domainPassword = request.domainPassword;
            this.domainUserName = request.domainUserName;
            this.mfaEnabled = request.mfaEnabled;
            this.OUName = request.OUName;
            this.regionId = request.regionId;
            this.subDomainDnsAddress = request.subDomainDnsAddress;
            this.subDomainName = request.subDomainName;
        } 

        /**
         * The hostname of the domain controller. The hostname must comply with the naming conventions for hostnames in Windows.
         */
        public Builder adHostname(String adHostname) {
            this.putQueryParameter("AdHostname", adHostname);
            this.adHostname = adHostname;
            return this;
        }

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The name of the AD directory.
         */
        public Builder directoryName(String directoryName) {
            this.putQueryParameter("DirectoryName", directoryName);
            this.directoryName = directoryName;
            return this;
        }

        /**
         * Details of the DNS addresses that correspond to the enterprise AD system. You can specify only one IP address. Make sure that the specified IP address can be accessed over the network that the selected vSwitch uses.
         */
        public Builder dnsAddress(java.util.List < String > dnsAddress) {
            this.putQueryParameter("DnsAddress", dnsAddress);
            this.dnsAddress = dnsAddress;
            return this;
        }

        /**
         * The domain name. The domain name must be 2 to 255 characters in length and consist of two parts. Example: example.com. You can register each domain name only once.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The password of the domain administrator. The username can be up to 64 characters in length.
         */
        public Builder domainPassword(String domainPassword) {
            this.putQueryParameter("DomainPassword", domainPassword);
            this.domainPassword = domainPassword;
            return this;
        }

        /**
         * The username of the domain administrator. The username can be up to 64 characters in length.
         */
        public Builder domainUserName(String domainUserName) {
            this.putQueryParameter("DomainUserName", domainUserName);
            this.domainUserName = domainUserName;
            return this;
        }

        /**
         * Specifies whether to enable multi-factor authentication (MFA). Default value: false.
         * <p>
         * 
         * If you enable MFA, all AD users in the AD directory must enter the password and the dynamic verification code generated by the MFA device when they connect to a cloud desktop.
         * 
         * > The first time you log on to the Alibaba Cloud Workspace client as an end user, you must bind an MFA device.
         */
        public Builder mfaEnabled(Boolean mfaEnabled) {
            this.putQueryParameter("MfaEnabled", mfaEnabled);
            this.mfaEnabled = mfaEnabled;
            return this;
        }

        /**
         * The name of the organizational unit (OU) in the AD domain. You can call the ListUserAdOrganizationUnits operation to obtain the name of the OU.
         */
        public Builder OUName(String OUName) {
            this.putQueryParameter("OUName", OUName);
            this.OUName = OUName;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The DNS addresses of the enterprise AD subdomain. If you specify SubDomainName but not this parameter, the DNS address of the subdomain is considered to be the same as that of the parent domain.
         */
        public Builder subDomainDnsAddress(java.util.List < String > subDomainDnsAddress) {
            this.putQueryParameter("SubDomainDnsAddress", subDomainDnsAddress);
            this.subDomainDnsAddress = subDomainDnsAddress;
            return this;
        }

        /**
         * The domain name of the enterprise AD subdomain.
         */
        public Builder subDomainName(String subDomainName) {
            this.putQueryParameter("SubDomainName", subDomainName);
            this.subDomainName = subDomainName;
            return this;
        }

        @Override
        public ModifyADConnectorDirectoryRequest build() {
            return new ModifyADConnectorDirectoryRequest(this);
        } 

    } 

}
