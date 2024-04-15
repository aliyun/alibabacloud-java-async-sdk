// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOfficeSitesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOfficeSitesResponseBody</p>
 */
public class DescribeOfficeSitesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("OfficeSites")
    private java.util.List < OfficeSites> officeSites;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOfficeSitesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.officeSites = builder.officeSites;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOfficeSitesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return officeSites
     */
    public java.util.List < OfficeSites> getOfficeSites() {
        return this.officeSites;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < OfficeSites> officeSites; 
        private String requestId; 

        /**
         * The token that determines the start point of the next query. If this parameter is empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about office networks.
         */
        public Builder officeSites(java.util.List < OfficeSites> officeSites) {
            this.officeSites = officeSites;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOfficeSitesResponseBody build() {
            return new DescribeOfficeSitesResponseBody(this);
        } 

    } 

    public static class ADConnectors extends TeaModel {
        @NameInMap("ADConnectorAddress")
        private String ADConnectorAddress;

        @NameInMap("ConnectorStatus")
        private String connectorStatus;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("Specification")
        private String specification;

        @NameInMap("TrustKey")
        private String trustKey;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private ADConnectors(Builder builder) {
            this.ADConnectorAddress = builder.ADConnectorAddress;
            this.connectorStatus = builder.connectorStatus;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.specification = builder.specification;
            this.trustKey = builder.trustKey;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ADConnectors create() {
            return builder().build();
        }

        /**
         * @return ADConnectorAddress
         */
        public String getADConnectorAddress() {
            return this.ADConnectorAddress;
        }

        /**
         * @return connectorStatus
         */
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return trustKey
         */
        public String getTrustKey() {
            return this.trustKey;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String ADConnectorAddress; 
            private String connectorStatus; 
            private String networkInterfaceId; 
            private String specification; 
            private String trustKey; 
            private String vSwitchId; 

            /**
             * The connection address of the AD connector.
             */
            public Builder ADConnectorAddress(String ADConnectorAddress) {
                this.ADConnectorAddress = ADConnectorAddress;
                return this;
            }

            /**
             * The status of the AD connector.
             * <p>
             * 
             * Valid values:
             * 
             * *   CONNECT_ERROR
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   RUNNING
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   CONNECTING
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     (You must configure the AD domain in which the AD connector is used.)
             * 
             *     <!-- -->
             * 
             * *   EXPIRED
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   CREATING
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder connectorStatus(String connectorStatus) {
                this.connectorStatus = connectorStatus;
                return this;
            }

            /**
             * The ID of an elastic network interface (ENI) to which the AD connector is mounted.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
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
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * The trust password that is specified when you configure the AD trust relationship.
             */
            public Builder trustKey(String trustKey) {
                this.trustKey = trustKey;
                return this;
            }

            /**
             * The ID of the vSwitch that resides in the network of the AD connector.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public ADConnectors build() {
                return new ADConnectors(this);
            } 

        } 

    }
    public static class Logs extends TeaModel {
        @NameInMap("Level")
        private String level;

        @NameInMap("Message")
        private String message;

        @NameInMap("Step")
        private String step;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private Logs(Builder builder) {
            this.level = builder.level;
            this.message = builder.message;
            this.step = builder.step;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String level; 
            private String message; 
            private String step; 
            private String timeStamp; 

            /**
             * The log severity.
             * <p>
             * 
             * Valid values:
             * 
             * *   ERROR
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   INFO
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   WARN
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Details of the log entry.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The step in the log entry.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            /**
             * The time when the log entry was printed.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
    public static class OfficeSites extends TeaModel {
        @NameInMap("ADConnectors")
        private java.util.List < ADConnectors> ADConnectors;

        @NameInMap("AdHostname")
        private String adHostname;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("CenAttachStatus")
        private String cenAttachStatus;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("CloudBoxOfficeSite")
        private Boolean cloudBoxOfficeSite;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("CustomSecurityGroupId")
        private String customSecurityGroupId;

        @NameInMap("DesktopAccessType")
        private String desktopAccessType;

        @NameInMap("DesktopCount")
        private Long desktopCount;

        @NameInMap("DesktopVpcEndpoint")
        private String desktopVpcEndpoint;

        @NameInMap("DnsAddress")
        private java.util.List < String > dnsAddress;

        @NameInMap("DnsUserName")
        private String dnsUserName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainPassword")
        private String domainPassword;

        @NameInMap("DomainUserName")
        private String domainUserName;

        @NameInMap("EnableAdminAccess")
        private Boolean enableAdminAccess;

        @NameInMap("EnableCrossDesktopAccess")
        private Boolean enableCrossDesktopAccess;

        @NameInMap("EnableInternetAccess")
        private Boolean enableInternetAccess;

        @NameInMap("FileSystemIds")
        private java.util.List < String > fileSystemIds;

        @NameInMap("Logs")
        private java.util.List < Logs> logs;

        @NameInMap("MfaEnabled")
        private Boolean mfaEnabled;

        @NameInMap("Name")
        private String name;

        @NameInMap("NeedVerifyLoginRisk")
        private Boolean needVerifyLoginRisk;

        @NameInMap("NeedVerifyZeroDevice")
        private Boolean needVerifyZeroDevice;

        @NameInMap("NetworkPackageId")
        private String networkPackageId;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("OfficeSiteType")
        private String officeSiteType;

        @NameInMap("OuName")
        private String ouName;

        @NameInMap("ProtocolType")
        private String protocolType;

        @NameInMap("RdsLicenseAddress")
        private String rdsLicenseAddress;

        @NameInMap("RdsLicenseDomainName")
        private String rdsLicenseDomainName;

        @NameInMap("RdsLicenseStatus")
        private String rdsLicenseStatus;

        @NameInMap("SsoEnabled")
        private Boolean ssoEnabled;

        @NameInMap("SsoType")
        private String ssoType;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubDnsAddress")
        private java.util.List < String > subDnsAddress;

        @NameInMap("SubDomainName")
        private String subDomainName;

        @NameInMap("TotalEdsCount")
        private Long totalEdsCount;

        @NameInMap("TotalEdsCountForGroup")
        private Long totalEdsCountForGroup;

        @NameInMap("TrustPassword")
        private String trustPassword;

        @NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcType")
        private String vpcType;

        private OfficeSites(Builder builder) {
            this.ADConnectors = builder.ADConnectors;
            this.adHostname = builder.adHostname;
            this.bandwidth = builder.bandwidth;
            this.cenAttachStatus = builder.cenAttachStatus;
            this.cenId = builder.cenId;
            this.cidrBlock = builder.cidrBlock;
            this.cloudBoxOfficeSite = builder.cloudBoxOfficeSite;
            this.creationTime = builder.creationTime;
            this.customSecurityGroupId = builder.customSecurityGroupId;
            this.desktopAccessType = builder.desktopAccessType;
            this.desktopCount = builder.desktopCount;
            this.desktopVpcEndpoint = builder.desktopVpcEndpoint;
            this.dnsAddress = builder.dnsAddress;
            this.dnsUserName = builder.dnsUserName;
            this.domainName = builder.domainName;
            this.domainPassword = builder.domainPassword;
            this.domainUserName = builder.domainUserName;
            this.enableAdminAccess = builder.enableAdminAccess;
            this.enableCrossDesktopAccess = builder.enableCrossDesktopAccess;
            this.enableInternetAccess = builder.enableInternetAccess;
            this.fileSystemIds = builder.fileSystemIds;
            this.logs = builder.logs;
            this.mfaEnabled = builder.mfaEnabled;
            this.name = builder.name;
            this.needVerifyLoginRisk = builder.needVerifyLoginRisk;
            this.needVerifyZeroDevice = builder.needVerifyZeroDevice;
            this.networkPackageId = builder.networkPackageId;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteType = builder.officeSiteType;
            this.ouName = builder.ouName;
            this.protocolType = builder.protocolType;
            this.rdsLicenseAddress = builder.rdsLicenseAddress;
            this.rdsLicenseDomainName = builder.rdsLicenseDomainName;
            this.rdsLicenseStatus = builder.rdsLicenseStatus;
            this.ssoEnabled = builder.ssoEnabled;
            this.ssoType = builder.ssoType;
            this.status = builder.status;
            this.subDnsAddress = builder.subDnsAddress;
            this.subDomainName = builder.subDomainName;
            this.totalEdsCount = builder.totalEdsCount;
            this.totalEdsCountForGroup = builder.totalEdsCountForGroup;
            this.trustPassword = builder.trustPassword;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
            this.vpcType = builder.vpcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfficeSites create() {
            return builder().build();
        }

        /**
         * @return ADConnectors
         */
        public java.util.List < ADConnectors> getADConnectors() {
            return this.ADConnectors;
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
         * @return cenAttachStatus
         */
        public String getCenAttachStatus() {
            return this.cenAttachStatus;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return cloudBoxOfficeSite
         */
        public Boolean getCloudBoxOfficeSite() {
            return this.cloudBoxOfficeSite;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return customSecurityGroupId
         */
        public String getCustomSecurityGroupId() {
            return this.customSecurityGroupId;
        }

        /**
         * @return desktopAccessType
         */
        public String getDesktopAccessType() {
            return this.desktopAccessType;
        }

        /**
         * @return desktopCount
         */
        public Long getDesktopCount() {
            return this.desktopCount;
        }

        /**
         * @return desktopVpcEndpoint
         */
        public String getDesktopVpcEndpoint() {
            return this.desktopVpcEndpoint;
        }

        /**
         * @return dnsAddress
         */
        public java.util.List < String > getDnsAddress() {
            return this.dnsAddress;
        }

        /**
         * @return dnsUserName
         */
        public String getDnsUserName() {
            return this.dnsUserName;
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
         * @return enableCrossDesktopAccess
         */
        public Boolean getEnableCrossDesktopAccess() {
            return this.enableCrossDesktopAccess;
        }

        /**
         * @return enableInternetAccess
         */
        public Boolean getEnableInternetAccess() {
            return this.enableInternetAccess;
        }

        /**
         * @return fileSystemIds
         */
        public java.util.List < String > getFileSystemIds() {
            return this.fileSystemIds;
        }

        /**
         * @return logs
         */
        public java.util.List < Logs> getLogs() {
            return this.logs;
        }

        /**
         * @return mfaEnabled
         */
        public Boolean getMfaEnabled() {
            return this.mfaEnabled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needVerifyLoginRisk
         */
        public Boolean getNeedVerifyLoginRisk() {
            return this.needVerifyLoginRisk;
        }

        /**
         * @return needVerifyZeroDevice
         */
        public Boolean getNeedVerifyZeroDevice() {
            return this.needVerifyZeroDevice;
        }

        /**
         * @return networkPackageId
         */
        public String getNetworkPackageId() {
            return this.networkPackageId;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteType
         */
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        /**
         * @return ouName
         */
        public String getOuName() {
            return this.ouName;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return rdsLicenseAddress
         */
        public String getRdsLicenseAddress() {
            return this.rdsLicenseAddress;
        }

        /**
         * @return rdsLicenseDomainName
         */
        public String getRdsLicenseDomainName() {
            return this.rdsLicenseDomainName;
        }

        /**
         * @return rdsLicenseStatus
         */
        public String getRdsLicenseStatus() {
            return this.rdsLicenseStatus;
        }

        /**
         * @return ssoEnabled
         */
        public Boolean getSsoEnabled() {
            return this.ssoEnabled;
        }

        /**
         * @return ssoType
         */
        public String getSsoType() {
            return this.ssoType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subDnsAddress
         */
        public java.util.List < String > getSubDnsAddress() {
            return this.subDnsAddress;
        }

        /**
         * @return subDomainName
         */
        public String getSubDomainName() {
            return this.subDomainName;
        }

        /**
         * @return totalEdsCount
         */
        public Long getTotalEdsCount() {
            return this.totalEdsCount;
        }

        /**
         * @return totalEdsCountForGroup
         */
        public Long getTotalEdsCountForGroup() {
            return this.totalEdsCountForGroup;
        }

        /**
         * @return trustPassword
         */
        public String getTrustPassword() {
            return this.trustPassword;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List < String > getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcType
         */
        public String getVpcType() {
            return this.vpcType;
        }

        public static final class Builder {
            private java.util.List < ADConnectors> ADConnectors; 
            private String adHostname; 
            private Integer bandwidth; 
            private String cenAttachStatus; 
            private String cenId; 
            private String cidrBlock; 
            private Boolean cloudBoxOfficeSite; 
            private String creationTime; 
            private String customSecurityGroupId; 
            private String desktopAccessType; 
            private Long desktopCount; 
            private String desktopVpcEndpoint; 
            private java.util.List < String > dnsAddress; 
            private String dnsUserName; 
            private String domainName; 
            private String domainPassword; 
            private String domainUserName; 
            private Boolean enableAdminAccess; 
            private Boolean enableCrossDesktopAccess; 
            private Boolean enableInternetAccess; 
            private java.util.List < String > fileSystemIds; 
            private java.util.List < Logs> logs; 
            private Boolean mfaEnabled; 
            private String name; 
            private Boolean needVerifyLoginRisk; 
            private Boolean needVerifyZeroDevice; 
            private String networkPackageId; 
            private String officeSiteId; 
            private String officeSiteType; 
            private String ouName; 
            private String protocolType; 
            private String rdsLicenseAddress; 
            private String rdsLicenseDomainName; 
            private String rdsLicenseStatus; 
            private Boolean ssoEnabled; 
            private String ssoType; 
            private String status; 
            private java.util.List < String > subDnsAddress; 
            private String subDomainName; 
            private Long totalEdsCount; 
            private Long totalEdsCountForGroup; 
            private String trustPassword; 
            private java.util.List < String > vSwitchIds; 
            private String vpcId; 
            private String vpcType; 

            /**
             * The details of AD connectors.
             */
            public Builder ADConnectors(java.util.List < ADConnectors> ADConnectors) {
                this.ADConnectors = ADConnectors;
                return this;
            }

            /**
             * The hostname of the domain controller. The hostname must comply with Windows hostname naming convention.
             */
            public Builder adHostname(String adHostname) {
                this.adHostname = adHostname;
                return this;
            }

            /**
             * The maximum public bandwidth value. Valid values: 0 to 1000.\
             * <p>
             * If you leave this parameter empty or set this parameter to 0, Internet access is not enabled.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The CEN instance status.
             */
            public Builder cenAttachStatus(String cenAttachStatus) {
                this.cenAttachStatus = cenAttachStatus;
                return this;
            }

            /**
             * The CEN instance ID.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The IPv4 CIDR block of the VPC that the office network uses.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * Indicates whether the CloudBox-based office network is created.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder cloudBoxOfficeSite(Boolean cloudBoxOfficeSite) {
                this.cloudBoxOfficeSite = cloudBoxOfficeSite;
                return this;
            }

            /**
             * The time when the office network was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The security group ID.
             */
            public Builder customSecurityGroupId(String customSecurityGroupId) {
                this.customSecurityGroupId = customSecurityGroupId;
                return this;
            }

            /**
             * The method that is used to connect cloud computers that reside in the office network from WUYING clients.
             * <p>
             * 
             * >  The VPC connection depends on Alibaba Cloud PrivateLink. You can use Alibaba Cloud PrivateLink for free. When you set this parameter to `VPC` or `Any`, PrivateLink is automatically activated.
             * 
             * Valid values:
             * 
             * *   INTERNET (default): Cloud computers are connected from WUYING clients over the Internet.
             * *   VPC: Cloud computers are connected from WUYING clients over the VPC.
             * *   ANY: Cloud computers are connected from WUYING clients over the Internet or the VPC. When you use can choose a method to connect cloud computers over the Internet or VPC from WUYING clients based on their business requirements.
             */
            public Builder desktopAccessType(String desktopAccessType) {
                this.desktopAccessType = desktopAccessType;
                return this;
            }

            /**
             * The number of cloud computers that are created.
             */
            public Builder desktopCount(Long desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * The endpoint that is used by the VPC, over which cloud computers are connected.
             */
            public Builder desktopVpcEndpoint(String desktopVpcEndpoint) {
                this.desktopVpcEndpoint = desktopVpcEndpoint;
                return this;
            }

            /**
             * The array of DNS addresses in the AD domains.
             */
            public Builder dnsAddress(java.util.List < String > dnsAddress) {
                this.dnsAddress = dnsAddress;
                return this;
            }

            /**
             * The username of a Domain Name System (DNS) user.
             */
            public Builder dnsUserName(String dnsUserName) {
                this.dnsUserName = dnsUserName;
                return this;
            }

            /**
             * The domain name of the enterprise AD.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The password of the domain administrator.
             */
            public Builder domainPassword(String domainPassword) {
                this.domainPassword = domainPassword;
                return this;
            }

            /**
             * The username of the domain administrator.
             */
            public Builder domainUserName(String domainUserName) {
                this.domainUserName = domainUserName;
                return this;
            }

            /**
             * Indicates whether the local administrator permissions are granted to users that are authorized to use cloud computers in the office network.
             * <p>
             * 
             * Valid values:
             * 
             * * true (default)
             * * false
             */
            public Builder enableAdminAccess(Boolean enableAdminAccess) {
                this.enableAdminAccess = enableAdminAccess;
                return this;
            }

            /**
             * Indicates whether the connection between cloud computers in the office network is enabled. After you enable the connection between cloud computers in the office network, cloud computers in the office network can access each other.
             */
            public Builder enableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
                this.enableCrossDesktopAccess = enableCrossDesktopAccess;
                return this;
            }

            /**
             * Indicates whether Internet access is enabled.
             */
            public Builder enableInternetAccess(Boolean enableInternetAccess) {
                this.enableInternetAccess = enableInternetAccess;
                return this;
            }

            /**
             * An array of Apsara File Storage NAS (NAS) file system IDs.
             */
            public Builder fileSystemIds(java.util.List < String > fileSystemIds) {
                this.fileSystemIds = fileSystemIds;
                return this;
            }

            /**
             * Details about registration logs.
             */
            public Builder logs(java.util.List < Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * Indicates whether multi-factor authentication (MFA) is enabled.
             */
            public Builder mfaEnabled(Boolean mfaEnabled) {
                this.mfaEnabled = mfaEnabled;
                return this;
            }

            /**
             * The office network name. The name is unique in a region.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether two-factor verification is enabled when an end user logs on to a WUYING client. This parameter is required only for convenience office networks. If two-factor verification is enabled, the system checks whether security risks exist within the logon account when the end user uses a convenience user to log on to the client. If risks are detected, the system sends a verification code to the email address that is associated with the account of the convenience user. Then, the end user can log on to the client only when the verification code is correct.
             */
            public Builder needVerifyLoginRisk(Boolean needVerifyLoginRisk) {
                this.needVerifyLoginRisk = needVerifyLoginRisk;
                return this;
            }

            /**
             * Indicates whether the trusted device verification is enabled.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   false
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder needVerifyZeroDevice(Boolean needVerifyZeroDevice) {
                this.needVerifyZeroDevice = needVerifyZeroDevice;
                return this;
            }

            /**
             * The premium bandwidth plan ID.
             */
            public Builder networkPackageId(String networkPackageId) {
                this.networkPackageId = networkPackageId;
                return this;
            }

            /**
             * The office network ID.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The account type of the office network.
             * <p>
             * 
             * Valid values:
             * 
             * *   SIMPLE: convenience account
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   AD_CONNECTOR: enterprise AD account
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * The organizational unit (OU) in the AD domain to which the office network is connected.
             */
            public Builder ouName(String ouName) {
                this.ouName = ouName;
                return this;
            }

            /**
             * The protocol type.
             * <p>
             * 
             * Valid values:
             * 
             * *   High-definition Experience (HDX)
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
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
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The IP address of the RDS license.
             */
            public Builder rdsLicenseAddress(String rdsLicenseAddress) {
                this.rdsLicenseAddress = rdsLicenseAddress;
                return this;
            }

            /**
             * The domain name of the RDS license.
             */
            public Builder rdsLicenseDomainName(String rdsLicenseDomainName) {
                this.rdsLicenseDomainName = rdsLicenseDomainName;
                return this;
            }

            /**
             * The remote desktop service (RDS) license status.
             */
            public Builder rdsLicenseStatus(String rdsLicenseStatus) {
                this.rdsLicenseStatus = rdsLicenseStatus;
                return this;
            }

            /**
             * Indicates whether single sign-on (SSO) is enabled.
             */
            public Builder ssoEnabled(Boolean ssoEnabled) {
                this.ssoEnabled = ssoEnabled;
                return this;
            }

            /**
             * The SSO type.
             */
            public Builder ssoType(String ssoType) {
                this.ssoType = ssoType;
                return this;
            }

            /**
             * The office network status.
             * <p>
             * 
             * Valid values:
             * 
             * *   REGISTERING: The office network is being registered.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   DEREGISTERING: The office network is being deregistered.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   REGISTERED: The office network is registered.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NEEDCONFIGTRUST: A trust relationship is required for the office network.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   CONFIGTRUSTFAILED: A trust relationship fails to be configured for the office network.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   DEREGISTERED: The office network is deregistered.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   ERROR: One or more configurations of the office network are invalid.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   CONFIGTRUSTING: A trust relationship is being configured for the office network.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   NEEDCONFIGUSER: Users are required for the office network.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * An array of DNS addresses for AD subdomains.
             */
            public Builder subDnsAddress(java.util.List < String > subDnsAddress) {
                this.subDnsAddress = subDnsAddress;
                return this;
            }

            /**
             * The username of enterprise AD subdomain.
             */
            public Builder subDomainName(String subDomainName) {
                this.subDomainName = subDomainName;
                return this;
            }

            /**
             * The total number of cloud computers.
             */
            public Builder totalEdsCount(Long totalEdsCount) {
                this.totalEdsCount = totalEdsCount;
                return this;
            }

            /**
             * The total number of cloud computers in the cloud computer pool (formerly desktop group).
             */
            public Builder totalEdsCountForGroup(Long totalEdsCountForGroup) {
                this.totalEdsCountForGroup = totalEdsCountForGroup;
                return this;
            }

            /**
             * >  This parameter is unavailable.
             */
            public Builder trustPassword(String trustPassword) {
                this.trustPassword = trustPassword;
                return this;
            }

            /**
             * An array of VSwitch IDs.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The VPC type.
             * <p>
             * 
             * Valid values:
             * 
             * *   Basic
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Customized
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Standard
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            public OfficeSites build() {
                return new OfficeSites(this);
            } 

        } 

    }
}
