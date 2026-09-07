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
 * {@link CreateADConnectorOfficeSiteRequest} extends {@link RequestModel}
 *
 * <p>CreateADConnectorOfficeSiteRequest</p>
 */
public class CreateADConnectorOfficeSiteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessAttribute")
    private String accessAttribute;

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
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenOwnerId")
    private Long cenOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> dnsAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainPassword")
    private String domainPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainUserName")
    private String domainUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAdminAccess")
    private Boolean enableAdminAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableInternetAccess")
    private Boolean enableInternetAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MfaEnabled")
    private Boolean mfaEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
    private String officeSiteName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolType")
    private String protocolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Specification")
    private Long specification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDomainDnsAddress")
    private java.util.List<String> subDomainDnsAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDomainName")
    private String subDomainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private java.util.List<String> vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    private String verifyCode;

    private CreateADConnectorOfficeSiteRequest(Builder builder) {
        super(builder);
        this.accessAttribute = builder.accessAttribute;
        this.adHostname = builder.adHostname;
        this.backupDCHostname = builder.backupDCHostname;
        this.backupDns = builder.backupDns;
        this.bandwidth = builder.bandwidth;
        this.cenId = builder.cenId;
        this.cenOwnerId = builder.cenOwnerId;
        this.cidrBlock = builder.cidrBlock;
        this.desktopAccessType = builder.desktopAccessType;
        this.dnsAddress = builder.dnsAddress;
        this.domainName = builder.domainName;
        this.domainPassword = builder.domainPassword;
        this.domainUserName = builder.domainUserName;
        this.enableAdminAccess = builder.enableAdminAccess;
        this.enableInternetAccess = builder.enableInternetAccess;
        this.mfaEnabled = builder.mfaEnabled;
        this.officeSiteName = builder.officeSiteName;
        this.protocolType = builder.protocolType;
        this.regionId = builder.regionId;
        this.specification = builder.specification;
        this.subDomainDnsAddress = builder.subDomainDnsAddress;
        this.subDomainName = builder.subDomainName;
        this.vSwitchId = builder.vSwitchId;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateADConnectorOfficeSiteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessAttribute
     */
    public String getAccessAttribute() {
        return this.accessAttribute;
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
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return cenOwnerId
     */
    public Long getCenOwnerId() {
        return this.cenOwnerId;
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return desktopAccessType
     */
    public String getDesktopAccessType() {
        return this.desktopAccessType;
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
     * @return enableAdminAccess
     */
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    /**
     * @return enableInternetAccess
     */
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    /**
     * @return mfaEnabled
     */
    public Boolean getMfaEnabled() {
        return this.mfaEnabled;
    }

    /**
     * @return officeSiteName
     */
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return specification
     */
    public Long getSpecification() {
        return this.specification;
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

    /**
     * @return vSwitchId
     */
    public java.util.List<String> getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public static final class Builder extends Request.Builder<CreateADConnectorOfficeSiteRequest, Builder> {
        private String accessAttribute; 
        private String adHostname; 
        private String backupDCHostname; 
        private String backupDns; 
        private Integer bandwidth; 
        private String cenId; 
        private Long cenOwnerId; 
        private String cidrBlock; 
        private String desktopAccessType; 
        private java.util.List<String> dnsAddress; 
        private String domainName; 
        private String domainPassword; 
        private String domainUserName; 
        private Boolean enableAdminAccess; 
        private Boolean enableInternetAccess; 
        private Boolean mfaEnabled; 
        private String officeSiteName; 
        private String protocolType; 
        private String regionId; 
        private Long specification; 
        private java.util.List<String> subDomainDnsAddress; 
        private String subDomainName; 
        private java.util.List<String> vSwitchId; 
        private String verifyCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateADConnectorOfficeSiteRequest request) {
            super(request);
            this.accessAttribute = request.accessAttribute;
            this.adHostname = request.adHostname;
            this.backupDCHostname = request.backupDCHostname;
            this.backupDns = request.backupDns;
            this.bandwidth = request.bandwidth;
            this.cenId = request.cenId;
            this.cenOwnerId = request.cenOwnerId;
            this.cidrBlock = request.cidrBlock;
            this.desktopAccessType = request.desktopAccessType;
            this.dnsAddress = request.dnsAddress;
            this.domainName = request.domainName;
            this.domainPassword = request.domainPassword;
            this.domainUserName = request.domainUserName;
            this.enableAdminAccess = request.enableAdminAccess;
            this.enableInternetAccess = request.enableInternetAccess;
            this.mfaEnabled = request.mfaEnabled;
            this.officeSiteName = request.officeSiteName;
            this.protocolType = request.protocolType;
            this.regionId = request.regionId;
            this.specification = request.specification;
            this.subDomainDnsAddress = request.subDomainDnsAddress;
            this.subDomainName = request.subDomainName;
            this.vSwitchId = request.vSwitchId;
            this.verifyCode = request.verifyCode;
        } 

        /**
         * <p>The access attribute of the office network (workspace).</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        public Builder accessAttribute(String accessAttribute) {
            this.putQueryParameter("AccessAttribute", accessAttribute);
            this.accessAttribute = accessAttribute;
            return this;
        }

        /**
         * <p>The hostname of the domain controller. The hostname must comply with Windows hostname naming conventions.</p>
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
         * <p>The peak Internet bandwidth, in Mbit/s. Valid values: 0 to 200.<br>If you do not set this parameter or set it to 0, the Internet access feature is not enabled. Settings take effect immediately.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The instance ID of the Cloud Enterprise Network (CEN).</p>
         * 
         * <strong>example:</strong>
         * <p>cen-3gwy16dojz1m65****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the Cloud Enterprise Network (CEN) instance owner.</p>
         * <ul>
         * <li>If CenId is not specified, or the specified CenId belongs to the current Alibaba Cloud account, you do not need to specify this parameter.</li>
         * <li>If the specified CenId belongs to another Alibaba Cloud account, specify the Alibaba Cloud account ID of that account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>102681951715****</p>
         */
        public Builder cenOwnerId(Long cenOwnerId) {
            this.putQueryParameter("CenOwnerId", cenOwnerId);
            this.cenOwnerId = cenOwnerId;
            return this;
        }

        /**
         * <p>The IPv4 CIDR block of the office network VPC. The system uses automatic creation to provision a VPC based on the specified IPv4 CIDR block. Use one of the following CIDR blocks or their subnets as the IPv4 CIDR block:</p>
         * <ul>
         * <li><code>10.0.0.0/12</code> (valid mask range: 12 to 24 bits)</li>
         * <li><code>172.16.0.0/12</code> (valid mask range: 12 to 24 bits)</li>
         * <li><code>192.168.0.0/16</code> (valid mask range: 16 to 24 bits)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The access method allowed when connecting to cloud computers.</p>
         * <blockquote>
         * <p>The VPC connection method depends on the Alibaba Cloud PrivateLink service, which is free of charge. If this parameter is set to <code>VPC</code> or <code>Any</code>, the system automatically activates the PrivateLink service for you.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        public Builder desktopAccessType(String desktopAccessType) {
            this.putQueryParameter("DesktopAccessType", desktopAccessType);
            this.desktopAccessType = desktopAccessType;
            return this;
        }

        /**
         * <p>The IP address of the DNS server corresponding to the enterprise AD. Currently, only one IP address is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder dnsAddress(java.util.List<String> dnsAddress) {
            this.putQueryParameter("DnsAddress", dnsAddress);
            this.dnsAddress = dnsAddress;
            return this;
        }

        /**
         * <p>The domain name of the enterprise AD. The same domain name can be registered only once.</p>
         * <p>This parameter is required.</p>
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
         * <p>The password of the domain administrator. The password can be up to 64 characters in length.</p>
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
         * <p>Use the sAMAccountName format for the username. Do not use the userPrincipalName format.</p>
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
         * <p>Specifies whether to grant local administrator permissions to users who use cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            this.putQueryParameter("EnableAdminAccess", enableAdminAccess);
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }

        /**
         * <p>Specifies whether public network access is enabled. This parameter indicates whether the feature is active.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableInternetAccess(Boolean enableInternetAccess) {
            this.putQueryParameter("EnableInternetAccess", enableInternetAccess);
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }

        /**
         * <p>Specifies whether to enable multi-factor authentication (MFA).</p>
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
         * <p>The name of the office network. The name must be 2 to 255 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.<br>Default value: null.</p>
         * 
         * <strong>example:</strong>
         * <p>RD_Office_Network</p>
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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
         * <p>The AD Connector specification.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder specification(Long specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        /**
         * <p>The DNS address of the enterprise AD subdomain. If <code>SubDomainName</code> is specified but this parameter is not, the subdomain DNS is considered the same as the parent domain DNS.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder subDomainDnsAddress(java.util.List<String> subDomainDnsAddress) {
            this.putQueryParameter("SubDomainDnsAddress", subDomainDnsAddress);
            this.subDomainDnsAddress = subDomainDnsAddress;
            return this;
        }

        /**
         * <p>The domain name of the enterprise AD subdomain.</p>
         * 
         * <strong>example:</strong>
         * <p>child.example.com</p>
         */
        public Builder subDomainName(String subDomainName) {
            this.putQueryParameter("SubDomainName", subDomainName);
            this.subDomainName = subDomainName;
            return this;
        }

        /**
         * <p>The list of vSwitch IDs.</p>
         */
        public Builder vSwitchId(java.util.List<String> vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The verification code. If the specified CenId belongs to another Alibaba Cloud account, you must first call <a href="https://help.aliyun.com/document_detail/436847.html">SendVerifyCode</a> to obtain the verification code.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder verifyCode(String verifyCode) {
            this.putQueryParameter("VerifyCode", verifyCode);
            this.verifyCode = verifyCode;
            return this;
        }

        @Override
        public CreateADConnectorOfficeSiteRequest build() {
            return new CreateADConnectorOfficeSiteRequest(this);
        } 

    } 

}
