// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateADConnectorOfficeSiteRequest} extends {@link RequestModel}
 *
 * <p>CreateADConnectorOfficeSiteRequest</p>
 */
public class CreateADConnectorOfficeSiteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdHostname")
    private String adHostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenOwnerId")
    private Long cenOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsAddress")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > dnsAddress;

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
    private java.util.List < String > subDomainDnsAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDomainName")
    private String subDomainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    private String verifyCode;

    private CreateADConnectorOfficeSiteRequest(Builder builder) {
        super(builder);
        this.adHostname = builder.adHostname;
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
     * @return adHostname
     */
    public String getAdHostname() {
        return this.adHostname;
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
    public java.util.List < String > getSubDomainDnsAddress() {
        return this.subDomainDnsAddress;
    }

    /**
     * @return subDomainName
     */
    public String getSubDomainName() {
        return this.subDomainName;
    }

    /**
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public static final class Builder extends Request.Builder<CreateADConnectorOfficeSiteRequest, Builder> {
        private String adHostname; 
        private Integer bandwidth; 
        private String cenId; 
        private Long cenOwnerId; 
        private String cidrBlock; 
        private String desktopAccessType; 
        private java.util.List < String > dnsAddress; 
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
        private java.util.List < String > subDomainDnsAddress; 
        private String subDomainName; 
        private String verifyCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateADConnectorOfficeSiteRequest request) {
            super(request);
            this.adHostname = request.adHostname;
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
            this.verifyCode = request.verifyCode;
        } 

        /**
         * The hostname of the domain controller. The hostname must comply with the naming conventions for Windows hosts.
         */
        public Builder adHostname(String adHostname) {
            this.putQueryParameter("AdHostname", adHostname);
            this.adHostname = adHostname;
            return this;
        }

        /**
         * The maximum public bandwidth of the Internet access package. Valid values: 0 to 200.\
         * <p>
         * If you do not specify this parameter or you set this parameter to 0, Internet access is disabled.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The ID of the CEN instance.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The Alibaba Cloud account that creates the Cloud Enterprise Network (CEN) instance.
         * <p>
         * 
         * *   If you do not specify the CenId parameter, or the CEN instance that is specified by the CenId parameter belongs to the current Alibaba Cloud account, skip this parameter.
         * *   If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, enter the ID of the Alibaba Cloud account.
         */
        public Builder cenOwnerId(Long cenOwnerId) {
            this.putQueryParameter("CenOwnerId", cenOwnerId);
            this.cenOwnerId = cenOwnerId;
            return this;
        }

        /**
         * The IPv4 CIDR block of the virtual private cloud (VPC) that your office network uses. The system creates a VPC for your office network based on the IPv4 CIDR block. We recommend that you set this parameter to one of the following CIDR blocks and their subnets:
         * <p>
         * 
         * *   `10.0.0.0/12` (subnet mask range: 12 to 24 bits)
         * *   `172.16.0.0/12` (subnet mask range: 12 to 24 bits)
         * *   `192.168.0.0/16` (subnet mask range: 16 to 24 bits)
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * The method to connect to cloud computers from WUYING clients.
         * <p>
         * 
         * >  The VPC connection depends on Alibaba Cloud PrivateLink. You can use PrivateLink for free. When you set this parameter to `VPC` or `Any`, PrivateLink is automatically activated.
         * 
         * Valid values:
         * 
         * - Internet: connects clients to cloud desktops only over the Internet. [Default]
         * - VPC: connects clients to cloud desktops only over a VPC.
         * - Any: connects clients to cloud desktops over the Internet or a VPC. You can select a connection method based on your business requirements when you connect to your cloud desktop from a client.
         */
        public Builder desktopAccessType(String desktopAccessType) {
            this.putQueryParameter("DesktopAccessType", desktopAccessType);
            this.desktopAccessType = desktopAccessType;
            return this;
        }

        /**
         * The IP address of the DNS server of the enterprise AD system. You can specify only one IP address.
         */
        public Builder dnsAddress(java.util.List < String > dnsAddress) {
            this.putQueryParameter("DnsAddress", dnsAddress);
            this.dnsAddress = dnsAddress;
            return this;
        }

        /**
         * The domain name of the enterprise AD system. You can register each domain name only once.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The password of the domain administrator. The password can be up to 64 characters in length.
         */
        public Builder domainPassword(String domainPassword) {
            this.putQueryParameter("DomainPassword", domainPassword);
            this.domainPassword = domainPassword;
            return this;
        }

        /**
         * The username of the domain administrator. The username can be up to 64 characters in length.
         * <p>
         * 
         * > Specify the username by using sAMAccountName instead of userPrincipalName.
         */
        public Builder domainUserName(String domainUserName) {
            this.putQueryParameter("DomainUserName", domainUserName);
            this.domainUserName = domainUserName;
            return this;
        }

        /**
         * Specifies whether to grant the local administrator permissions to users that are authorized to use cloud computers in the office network.
         * <p>
         * 
         * Valid values:
         * 
         * *   <!-- -->
         * 
         *     true
         * 
         *     <!-- -->
         * 
         *     (default)
         * 
         *     <!-- -->
         * 
         * *   <!-- -->
         * 
         *     false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            this.putQueryParameter("EnableAdminAccess", enableAdminAccess);
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }

        /**
         * Specifies whether to enable Internet access.
         */
        public Builder enableInternetAccess(Boolean enableInternetAccess) {
            this.putQueryParameter("EnableInternetAccess", enableInternetAccess);
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }

        /**
         * Specifies whether to enable multi-factor authentication (MFA).
         */
        public Builder mfaEnabled(Boolean mfaEnabled) {
            this.putQueryParameter("MfaEnabled", mfaEnabled);
            this.mfaEnabled = mfaEnabled;
            return this;
        }

        /**
         * The office network name. The name must be 2 to 255 characters in length. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.\
         * <p>
         * This parameter is empty by default.
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * The protocol type.
         * <p>
         * 
         * Valid value:
         * 
         * *   Adaptive Streaming Protocol (ASP)
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The AD connector type.
         * <p>
         * 
         * Valid values:
         * 
         * *   1: General
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   2: Advanced
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder specification(Long specification) {
            this.putQueryParameter("Specification", specification);
            this.specification = specification;
            return this;
        }

        /**
         * The DNS address of the enterprise AD subdomain. If you specify `SubDomainName` but do not specify this parameter, the DNS address of the subdomain is the same as the DNS address of the parent domain.
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

        /**
         * The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the [SendVerifyCode](~~436847~~) operation to obtain the verification code.
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
