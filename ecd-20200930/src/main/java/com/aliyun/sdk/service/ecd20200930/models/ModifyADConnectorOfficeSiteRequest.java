// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyADConnectorOfficeSiteRequest} extends {@link RequestModel}
 *
 * <p>ModifyADConnectorOfficeSiteRequest</p>
 */
public class ModifyADConnectorOfficeSiteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdHostname")
    private String adHostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupDCHostname")
    private String backupDCHostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupDns")
    private String backupDns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsAddress")
    private java.util.List<String> dnsAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainPassword")
    private String domainPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainUserName")
    private String domainUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MfaEnabled")
    private Boolean mfaEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OUName")
    private String OUName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
    private String officeSiteName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDomainDnsAddress")
    private java.util.List<String> subDomainDnsAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDomainName")
    private String subDomainName;

    private ModifyADConnectorOfficeSiteRequest(Builder builder) {
        super(builder);
        this.adHostname = builder.adHostname;
        this.backupDCHostname = builder.backupDCHostname;
        this.backupDns = builder.backupDns;
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
     * @return backupDCHostname
     */
    public String getBackupDCHostname() {
        return this.backupDCHostname;
    }

    /**
     * @return backupDns
     */
    public String getBackupDns() {
        return this.backupDns;
    }

    /**
     * @return dnsAddress
     */
    public java.util.List<String> getDnsAddress() {
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
    public java.util.List<String> getSubDomainDnsAddress() {
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
        private String backupDCHostname; 
        private String backupDns; 
        private java.util.List<String> dnsAddress; 
        private String domainName; 
        private String domainPassword; 
        private String domainUserName; 
        private Boolean mfaEnabled; 
        private String OUName; 
        private String officeSiteId; 
        private String officeSiteName; 
        private String regionId; 
        private java.util.List<String> subDomainDnsAddress; 
        private String subDomainName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyADConnectorOfficeSiteRequest request) {
            super(request);
            this.adHostname = request.adHostname;
            this.backupDCHostname = request.backupDCHostname;
            this.backupDns = request.backupDns;
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
         * <p>The hostname of the domain controller. The hostname must comply with the naming conventions for hostnames in Windows.</p>
         * 
         * <strong>example:</strong>
         * <p>beijing-ad01</p>
         */
        public Builder adHostname(String adHostname) {
            this.putQueryParameter("AdHostname", adHostname);
            this.adHostname = adHostname;
            return this;
        }

        /**
         * <p>The hostname of the backup domain controller.</p>
         * 
         * <strong>example:</strong>
         * <p>dc002</p>
         */
        public Builder backupDCHostname(String backupDCHostname) {
            this.putQueryParameter("BackupDCHostname", backupDCHostname);
            this.backupDCHostname = backupDCHostname;
            return this;
        }

        /**
         * <p>The DNS address of the backup domain controller.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.2.100</p>
         */
        public Builder backupDns(String backupDns) {
            this.putQueryParameter("BackupDns", backupDns);
            this.backupDns = backupDns;
            return this;
        }

        /**
         * <p>Details of the IP addresses of the Domain Name System (DNS) servers that correspond to the enterprise AD system. You can specify only one IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.<em>.</em></p>
         */
        public Builder dnsAddress(java.util.List<String> dnsAddress) {
            this.putQueryParameter("DnsAddress", dnsAddress);
            this.dnsAddress = dnsAddress;
            return this;
        }

        /**
         * <p>The domain name of the enterprise AD system. You can register each domain name only once.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The password of the domain administrator. The username can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>testPassword</p>
         */
        public Builder domainPassword(String domainPassword) {
            this.putQueryParameter("DomainPassword", domainPassword);
            this.domainPassword = domainPassword;
            return this;
        }

        /**
         * <p>The username of the domain administrator. The username can be up to 64 characters in length.</p>
         * <blockquote>
         * <p>Specify the value of the sAMAccountName parameter instead of the value of the userPrincipalName parameter as the username.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Administrator</p>
         */
        public Builder domainUserName(String domainUserName) {
            this.putQueryParameter("DomainUserName", domainUserName);
            this.domainUserName = domainUserName;
            return this;
        }

        /**
         * <p>Specifies whether to enable multi-factor authentication (MFA).</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder mfaEnabled(Boolean mfaEnabled) {
            this.putQueryParameter("MfaEnabled", mfaEnabled);
            this.mfaEnabled = mfaEnabled;
            return this;
        }

        /**
         * <p>The name of the organizational unit (OU) in the AD domain. You can call the <a href="https://help.aliyun.com/document_detail/311259.html">ListUserAdOrganizationUnits</a> operation to obtain OUs.</p>
         * 
         * <strong>example:</strong>
         * <p>oldad.com/Domain Controllers</p>
         */
        public Builder OUName(String OUName) {
            this.putQueryParameter("OUName", OUName);
            this.OUName = OUName;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The office network name. The name must be 2 to 255 characters in length. It can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The DNS address of the subdomain in the enterprise AD domain. You can specify only one DNS address. If you configure <code>SubDomainName</code> and leave this parameter empty, the value is the same as that of the enterprise AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.<em>.</em></p>
         */
        public Builder subDomainDnsAddress(java.util.List<String> subDomainDnsAddress) {
            this.putQueryParameter("SubDomainDnsAddress", subDomainDnsAddress);
            this.subDomainDnsAddress = subDomainDnsAddress;
            return this;
        }

        /**
         * <p>The name of the subdomain in the enterprise AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>childexample.com</p>
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
