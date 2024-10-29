// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeOfficeSitesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOfficeSitesResponseBody</p>
 */
public class DescribeOfficeSitesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("OfficeSites")
    private java.util.List < OfficeSites> officeSites;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOfficeSitesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.officeSites = builder.officeSites;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < OfficeSites> officeSites; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The token that determines the start point of the next query. If this parameter is empty, all results are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The information about office networks.</p>
         */
        public Builder officeSites(java.util.List < OfficeSites> officeSites) {
            this.officeSites = officeSites;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOfficeSitesResponseBody build() {
            return new DescribeOfficeSitesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOfficeSitesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOfficeSitesResponseBody</p>
     */
    public static class ADConnectors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ADConnectorAddress")
        private String ADConnectorAddress;

        @com.aliyun.core.annotation.NameInMap("ConnectorStatus")
        private String connectorStatus;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("TrustKey")
        private String trustKey;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
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
             * <p>The connection address of the AD connector.</p>
             * 
             * <strong>example:</strong>
             * <p>172.24.<em>.</em></p>
             */
            public Builder ADConnectorAddress(String ADConnectorAddress) {
                this.ADConnectorAddress = ADConnectorAddress;
                return this;
            }

            /**
             * <p>The status of the AD connector.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>CONNECT_ERROR</li>
             * <li>RUNNING</li>
             * <li>CONNECTING (You must configure the AD domain in which the AD connector is used.)</li>
             * <li>EXPIRED</li>
             * <li>CREATING</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder connectorStatus(String connectorStatus) {
                this.connectorStatus = connectorStatus;
                return this;
            }

            /**
             * <p>The ID of an elastic network interface (ENI) to which the AD connector is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp1i4wx78lgosrj6****</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The AD connector type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>1: General</li>
             * <li>2: Advanced</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * <p>The trust password that is specified when you configure the AD trust relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>password123***</p>
             */
            public Builder trustKey(String trustKey) {
                this.trustKey = trustKey;
                return this;
            }

            /**
             * <p>The ID of the vSwitch that resides in the network of the AD connector.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp19ocz3erfx15uon****</p>
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
    /**
     * 
     * {@link DescribeOfficeSitesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOfficeSitesResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Step")
        private String step;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
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
             * <p>The log severity.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ERROR</li>
             * <li>INFO</li>
             * <li>WARN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>Details of the log entry.</p>
             * 
             * <strong>example:</strong>
             * <p>code:success | message:Create Connector complete</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The step in the log entry.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE_CONNECTOR</p>
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            /**
             * <p>The time when the log entry was printed.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-12T09:42Z</p>
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
    /**
     * 
     * {@link DescribeOfficeSitesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOfficeSitesResponseBody</p>
     */
    public static class ResourceAmounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private ResourceAmounts(Builder builder) {
            this.amount = builder.amount;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceAmounts create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Long amount; 
            private String resourceType; 

            /**
             * amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceAmounts build() {
                return new ResourceAmounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOfficeSitesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOfficeSitesResponseBody</p>
     */
    public static class OfficeSites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ADConnectors")
        private java.util.List < ADConnectors> ADConnectors;

        @com.aliyun.core.annotation.NameInMap("AdHostname")
        private String adHostname;

        @com.aliyun.core.annotation.NameInMap("BackupDCHostname")
        private String backupDCHostname;

        @com.aliyun.core.annotation.NameInMap("BackupDns")
        private String backupDns;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("CenAttachStatus")
        private String cenAttachStatus;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("CloudBoxOfficeSite")
        private Boolean cloudBoxOfficeSite;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CustomAccessPoint")
        private String customAccessPoint;

        @com.aliyun.core.annotation.NameInMap("CustomSecurityGroupId")
        private String customSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
        private String desktopAccessType;

        @com.aliyun.core.annotation.NameInMap("DesktopCount")
        private Long desktopCount;

        @com.aliyun.core.annotation.NameInMap("DesktopVpcEndpoint")
        private String desktopVpcEndpoint;

        @com.aliyun.core.annotation.NameInMap("DnsAddress")
        private java.util.List < String > dnsAddress;

        @com.aliyun.core.annotation.NameInMap("DnsUserName")
        private String dnsUserName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainPassword")
        private String domainPassword;

        @com.aliyun.core.annotation.NameInMap("DomainUserName")
        private String domainUserName;

        @com.aliyun.core.annotation.NameInMap("EnableAdminAccess")
        private Boolean enableAdminAccess;

        @com.aliyun.core.annotation.NameInMap("EnableCrossDesktopAccess")
        private Boolean enableCrossDesktopAccess;

        @com.aliyun.core.annotation.NameInMap("EnableInternetAccess")
        private Boolean enableInternetAccess;

        @com.aliyun.core.annotation.NameInMap("EnableServiceRoute")
        private Boolean enableServiceRoute;

        @com.aliyun.core.annotation.NameInMap("FileSystemIds")
        private java.util.List < String > fileSystemIds;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List < Logs> logs;

        @com.aliyun.core.annotation.NameInMap("MfaEnabled")
        private Boolean mfaEnabled;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedVerifyLoginRisk")
        private Boolean needVerifyLoginRisk;

        @com.aliyun.core.annotation.NameInMap("NeedVerifyZeroDevice")
        private Boolean needVerifyZeroDevice;

        @com.aliyun.core.annotation.NameInMap("NetworkPackageId")
        private String networkPackageId;

        @com.aliyun.core.annotation.NameInMap("NmVersion")
        private String nmVersion;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
        private String officeSiteType;

        @com.aliyun.core.annotation.NameInMap("OuName")
        private String ouName;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("RdsLicenseAddress")
        private String rdsLicenseAddress;

        @com.aliyun.core.annotation.NameInMap("RdsLicenseDomainName")
        private String rdsLicenseDomainName;

        @com.aliyun.core.annotation.NameInMap("RdsLicenseStatus")
        private String rdsLicenseStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceAmounts")
        private java.util.List < ResourceAmounts> resourceAmounts;

        @com.aliyun.core.annotation.NameInMap("SecurityProtection")
        private String securityProtection;

        @com.aliyun.core.annotation.NameInMap("SsoEnabled")
        private Boolean ssoEnabled;

        @com.aliyun.core.annotation.NameInMap("SsoType")
        private String ssoType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubDnsAddress")
        private java.util.List < String > subDnsAddress;

        @com.aliyun.core.annotation.NameInMap("SubDomainName")
        private String subDomainName;

        @com.aliyun.core.annotation.NameInMap("SubnetMode")
        private String subnetMode;

        @com.aliyun.core.annotation.NameInMap("TotalEdsCount")
        private Long totalEdsCount;

        @com.aliyun.core.annotation.NameInMap("TotalEdsCountForGroup")
        private Long totalEdsCountForGroup;

        @com.aliyun.core.annotation.NameInMap("TotalResourceAmount")
        private Long totalResourceAmount;

        @com.aliyun.core.annotation.NameInMap("TrustPassword")
        private String trustPassword;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcType")
        private String vpcType;

        private OfficeSites(Builder builder) {
            this.ADConnectors = builder.ADConnectors;
            this.adHostname = builder.adHostname;
            this.backupDCHostname = builder.backupDCHostname;
            this.backupDns = builder.backupDns;
            this.bandwidth = builder.bandwidth;
            this.cenAttachStatus = builder.cenAttachStatus;
            this.cenId = builder.cenId;
            this.cidrBlock = builder.cidrBlock;
            this.cloudBoxOfficeSite = builder.cloudBoxOfficeSite;
            this.creationTime = builder.creationTime;
            this.customAccessPoint = builder.customAccessPoint;
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
            this.enableServiceRoute = builder.enableServiceRoute;
            this.fileSystemIds = builder.fileSystemIds;
            this.logs = builder.logs;
            this.mfaEnabled = builder.mfaEnabled;
            this.name = builder.name;
            this.needVerifyLoginRisk = builder.needVerifyLoginRisk;
            this.needVerifyZeroDevice = builder.needVerifyZeroDevice;
            this.networkPackageId = builder.networkPackageId;
            this.nmVersion = builder.nmVersion;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteType = builder.officeSiteType;
            this.ouName = builder.ouName;
            this.protocolType = builder.protocolType;
            this.rdsLicenseAddress = builder.rdsLicenseAddress;
            this.rdsLicenseDomainName = builder.rdsLicenseDomainName;
            this.rdsLicenseStatus = builder.rdsLicenseStatus;
            this.resourceAmounts = builder.resourceAmounts;
            this.securityProtection = builder.securityProtection;
            this.ssoEnabled = builder.ssoEnabled;
            this.ssoType = builder.ssoType;
            this.status = builder.status;
            this.subDnsAddress = builder.subDnsAddress;
            this.subDomainName = builder.subDomainName;
            this.subnetMode = builder.subnetMode;
            this.totalEdsCount = builder.totalEdsCount;
            this.totalEdsCountForGroup = builder.totalEdsCountForGroup;
            this.totalResourceAmount = builder.totalResourceAmount;
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
         * @return customAccessPoint
         */
        public String getCustomAccessPoint() {
            return this.customAccessPoint;
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
         * @return enableServiceRoute
         */
        public Boolean getEnableServiceRoute() {
            return this.enableServiceRoute;
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
         * @return nmVersion
         */
        public String getNmVersion() {
            return this.nmVersion;
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
         * @return resourceAmounts
         */
        public java.util.List < ResourceAmounts> getResourceAmounts() {
            return this.resourceAmounts;
        }

        /**
         * @return securityProtection
         */
        public String getSecurityProtection() {
            return this.securityProtection;
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
         * @return subnetMode
         */
        public String getSubnetMode() {
            return this.subnetMode;
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
         * @return totalResourceAmount
         */
        public Long getTotalResourceAmount() {
            return this.totalResourceAmount;
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
            private String backupDCHostname; 
            private String backupDns; 
            private Integer bandwidth; 
            private String cenAttachStatus; 
            private String cenId; 
            private String cidrBlock; 
            private Boolean cloudBoxOfficeSite; 
            private String creationTime; 
            private String customAccessPoint; 
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
            private Boolean enableServiceRoute; 
            private java.util.List < String > fileSystemIds; 
            private java.util.List < Logs> logs; 
            private Boolean mfaEnabled; 
            private String name; 
            private Boolean needVerifyLoginRisk; 
            private Boolean needVerifyZeroDevice; 
            private String networkPackageId; 
            private String nmVersion; 
            private String officeSiteId; 
            private String officeSiteType; 
            private String ouName; 
            private String protocolType; 
            private String rdsLicenseAddress; 
            private String rdsLicenseDomainName; 
            private String rdsLicenseStatus; 
            private java.util.List < ResourceAmounts> resourceAmounts; 
            private String securityProtection; 
            private Boolean ssoEnabled; 
            private String ssoType; 
            private String status; 
            private java.util.List < String > subDnsAddress; 
            private String subDomainName; 
            private String subnetMode; 
            private Long totalEdsCount; 
            private Long totalEdsCountForGroup; 
            private Long totalResourceAmount; 
            private String trustPassword; 
            private java.util.List < String > vSwitchIds; 
            private String vpcId; 
            private String vpcType; 

            /**
             * <p>Details of AD connectors.</p>
             */
            public Builder ADConnectors(java.util.List < ADConnectors> ADConnectors) {
                this.ADConnectors = ADConnectors;
                return this;
            }

            /**
             * <p>The hostname of the domain controller. The hostname must comply with the hostname naming convention of Windows.</p>
             * 
             * <strong>example:</strong>
             * <p>beijing-ad01</p>
             */
            public Builder adHostname(String adHostname) {
                this.adHostname = adHostname;
                return this;
            }

            /**
             * <p>The hostname of the secondary domain controller.</p>
             * 
             * <strong>example:</strong>
             * <p>beijing-ad02</p>
             */
            public Builder backupDCHostname(String backupDCHostname) {
                this.backupDCHostname = backupDCHostname;
                return this;
            }

            /**
             * <p>The DNS address of the secondary domain controller.</p>
             * 
             * <strong>example:</strong>
             * <p>172.24.XX.XX</p>
             */
            public Builder backupDns(String backupDns) {
                this.backupDns = backupDns;
                return this;
            }

            /**
             * <p>The maximum public bandwidth value. Valid values: 0 to 1000.<br>If you leave this parameter empty or set this parameter to 0, Internet access is not enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The CEN instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>attached</p>
             */
            public Builder cenAttachStatus(String cenAttachStatus) {
                this.cenAttachStatus = cenAttachStatus;
                return this;
            }

            /**
             * <p>The CEN instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-3gwy16dojz1m65****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The IPv4 CIDR block of the VPC that the office network uses.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.0.0/16</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>Indicates whether the CloudBox-based office network is created.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cloudBoxOfficeSite(Boolean cloudBoxOfficeSite) {
                this.cloudBoxOfficeSite = cloudBoxOfficeSite;
                return this;
            }

            /**
             * <p>The time when the office network was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-06T05:58Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * CustomAccessPoint.
             */
            public Builder customAccessPoint(String customAccessPoint) {
                this.customAccessPoint = customAccessPoint;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1ce64o4g9mdf5u****</p>
             */
            public Builder customSecurityGroupId(String customSecurityGroupId) {
                this.customSecurityGroupId = customSecurityGroupId;
                return this;
            }

            /**
             * <p>The method that is used to connect cloud computers that reside in the office network from Alibaba Cloud Workspace clients.</p>
             * <blockquote>
             * <p> The VPC connection depends on Alibaba Cloud PrivateLink. You can use Alibaba Cloud PrivateLink for free. When you set this parameter to <code>VPC</code> or <code>Any</code>, PrivateLink is automatically activated.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>INTERNET (default): Cloud computers are connected from Alibaba Cloud Workspace clients over the Internet.</li>
             * <li>VPC: Cloud computers are connected from Alibaba Cloud Workspace clients over the VPC.</li>
             * <li>ANY: Cloud computers are connected from Alibaba Cloud Workspace clients over the Internet or the VPC. When end users connect to cloud computers from Alibaba Cloud Workspace clients, you can choose a connection method based on your business requirements.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INTERNET</p>
             */
            public Builder desktopAccessType(String desktopAccessType) {
                this.desktopAccessType = desktopAccessType;
                return this;
            }

            /**
             * <p>The number of cloud computers that are created.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopCount(Long desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * <p>The endpoint that is used to connect to cloud computers in the directory over a VPC.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com">http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com</a></p>
             */
            public Builder desktopVpcEndpoint(String desktopVpcEndpoint) {
                this.desktopVpcEndpoint = desktopVpcEndpoint;
                return this;
            }

            /**
             * <p>The array of DNS addresses in the AD domains.</p>
             */
            public Builder dnsAddress(java.util.List < String > dnsAddress) {
                this.dnsAddress = dnsAddress;
                return this;
            }

            /**
             * <p>The username of a Domain Name System (DNS) user.</p>
             * 
             * <strong>example:</strong>
             * <p>testDnsUserName</p>
             */
            public Builder dnsUserName(String dnsUserName) {
                this.dnsUserName = dnsUserName;
                return this;
            }

            /**
             * <p>The domain name of the enterprise AD.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The password of the domain administrator.</p>
             * 
             * <strong>example:</strong>
             * <p>testPassword</p>
             */
            public Builder domainPassword(String domainPassword) {
                this.domainPassword = domainPassword;
                return this;
            }

            /**
             * <p>The username of the domain administrator.</p>
             * 
             * <strong>example:</strong>
             * <p>Administrator</p>
             */
            public Builder domainUserName(String domainUserName) {
                this.domainUserName = domainUserName;
                return this;
            }

            /**
             * <p>Indicates whether the local administrator permissions are granted to users that are authorized to use cloud computers in the office network.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true (default)</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAdminAccess(Boolean enableAdminAccess) {
                this.enableAdminAccess = enableAdminAccess;
                return this;
            }

            /**
             * <p>Indicates whether the connection between cloud computers in the office network is enabled. After you enable the connection between cloud computers in the office network, cloud computers in the office network can access each other.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
                this.enableCrossDesktopAccess = enableCrossDesktopAccess;
                return this;
            }

            /**
             * <p>Indicates whether Internet access is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableInternetAccess(Boolean enableInternetAccess) {
                this.enableInternetAccess = enableInternetAccess;
                return this;
            }

            /**
             * <p>Indicates whether route access control is enabled for cloud services.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableServiceRoute(Boolean enableServiceRoute) {
                this.enableServiceRoute = enableServiceRoute;
                return this;
            }

            /**
             * <p>An array of Apsara File Storage NAS (NAS) file system IDs.</p>
             */
            public Builder fileSystemIds(java.util.List < String > fileSystemIds) {
                this.fileSystemIds = fileSystemIds;
                return this;
            }

            /**
             * <p>Details about registration logs.</p>
             */
            public Builder logs(java.util.List < Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * <p>Indicates whether multi-factor authentication (MFA) is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder mfaEnabled(Boolean mfaEnabled) {
                this.mfaEnabled = mfaEnabled;
                return this;
            }

            /**
             * <p>The name of the office network. The name is unique in a region.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether two-factor verification is enabled when an end user logs on to an Alibaba Cloud Workspace client. This parameter is required only for convenience office networks. If two-factor verification is enabled, the system checks whether security risks exist within the logon account when a convenience user logs on to the client. If risks are detected, the system sends a verification code to the email address that is associated with the account. Then, the convenience user can log on to the client only after the user enters the correct verification code.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder needVerifyLoginRisk(Boolean needVerifyLoginRisk) {
                this.needVerifyLoginRisk = needVerifyLoginRisk;
                return this;
            }

            /**
             * <p>Indicates whether the trusted device verification is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needVerifyZeroDevice(Boolean needVerifyZeroDevice) {
                this.needVerifyZeroDevice = needVerifyZeroDevice;
                return this;
            }

            /**
             * <p>The premium bandwidth plan ID.</p>
             * 
             * <strong>example:</strong>
             * <p>np-amtp8e8q1o9e4****</p>
             */
            public Builder networkPackageId(String networkPackageId) {
                this.networkPackageId = networkPackageId;
                return this;
            }

            /**
             * NmVersion.
             */
            public Builder nmVersion(String nmVersion) {
                this.nmVersion = nmVersion;
                return this;
            }

            /**
             * <p>The IDs of the office networks.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The account type of the office network.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SIMPLE: the convenience account</li>
             * <li>AD_CONNECTOR: the enterprise AD account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AD_CONNECTOR</p>
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * <p>The organizational unit (OU) in the AD domain to which the office network is connected.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com/Domain Controllers</p>
             */
            public Builder ouName(String ouName) {
                this.ouName = ouName;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>HDX</li>
             * <li>ASP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASP</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The IP address of the RDS license.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX</p>
             */
            public Builder rdsLicenseAddress(String rdsLicenseAddress) {
                this.rdsLicenseAddress = rdsLicenseAddress;
                return this;
            }

            /**
             * <p>The domain name of the RDS license.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder rdsLicenseDomainName(String rdsLicenseDomainName) {
                this.rdsLicenseDomainName = rdsLicenseDomainName;
                return this;
            }

            /**
             * <p>The remote desktop service (RDS) license status.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder rdsLicenseStatus(String rdsLicenseStatus) {
                this.rdsLicenseStatus = rdsLicenseStatus;
                return this;
            }

            /**
             * ResourceAmounts.
             */
            public Builder resourceAmounts(java.util.List < ResourceAmounts> resourceAmounts) {
                this.resourceAmounts = resourceAmounts;
                return this;
            }

            /**
             * SecurityProtection.
             */
            public Builder securityProtection(String securityProtection) {
                this.securityProtection = securityProtection;
                return this;
            }

            /**
             * <p>Indicates whether single sign-on (SSO) is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ssoEnabled(Boolean ssoEnabled) {
                this.ssoEnabled = ssoEnabled;
                return this;
            }

            /**
             * <p>The SSO type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SAML.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder ssoType(String ssoType) {
                this.ssoType = ssoType;
                return this;
            }

            /**
             * <p>The office network status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>REGISTERING: The office network is being registered.</li>
             * <li>DEREGISTERING: The office network is being deregistered.</li>
             * <li>REGISTERED: The office network is registered.</li>
             * <li>NEEDCONFIGTRUST: A trust relationship is required for the office network.</li>
             * <li>CONFIGTRUSTFAILED: A trust relationship fails to be configured for the office network.</li>
             * <li>DEREGISTERED: The office network is deregistered.</li>
             * <li>ERROR: One or more configurations of the office network are invalid.</li>
             * <li>CONFIGTRUSTING: A trust relationship is being configured for the office network.</li>
             * <li>NEEDCONFIGUSER: Users are required for the office network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REGISTERED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>An array of DNS addresses for AD subdomains.</p>
             */
            public Builder subDnsAddress(java.util.List < String > subDnsAddress) {
                this.subDnsAddress = subDnsAddress;
                return this;
            }

            /**
             * <p>The username of enterprise AD subdomain.</p>
             * 
             * <strong>example:</strong>
             * <p>testSubDnsUserName</p>
             */
            public Builder subDomainName(String subDomainName) {
                this.subDomainName = subDomainName;
                return this;
            }

            /**
             * SubnetMode.
             */
            public Builder subnetMode(String subnetMode) {
                this.subnetMode = subnetMode;
                return this;
            }

            /**
             * <p>The total number of cloud computers.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalEdsCount(Long totalEdsCount) {
                this.totalEdsCount = totalEdsCount;
                return this;
            }

            /**
             * <p>The number of pooled cloud computers in the cloud computer pool.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalEdsCountForGroup(Long totalEdsCountForGroup) {
                this.totalEdsCountForGroup = totalEdsCountForGroup;
                return this;
            }

            /**
             * TotalResourceAmount.
             */
            public Builder totalResourceAmount(Long totalResourceAmount) {
                this.totalResourceAmount = totalResourceAmount;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is unavailable.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder trustPassword(String trustPassword) {
                this.trustPassword = trustPassword;
                return this;
            }

            /**
             * <p>An array of VSwitch IDs.</p>
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6tz5k67puge5jn8****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The VPC type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Basic</li>
             * <li>Customized</li>
             * <li>Standard</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
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
