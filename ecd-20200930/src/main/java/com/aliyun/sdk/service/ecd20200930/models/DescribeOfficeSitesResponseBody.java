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
 * {@link DescribeOfficeSitesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOfficeSitesResponseBody</p>
 */
public class DescribeOfficeSitesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("OfficeSites")
    private java.util.List<OfficeSites> officeSites;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<OfficeSites> getOfficeSites() {
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
        private java.util.List<OfficeSites> officeSites; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeOfficeSitesResponseBody model) {
            this.nextToken = model.nextToken;
            this.officeSites = model.officeSites;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The token for the next query. If NextToken is empty, no more results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The collection of office network information.</p>
         */
        public Builder officeSites(java.util.List<OfficeSites> officeSites) {
            this.officeSites = officeSites;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of query results.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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

            private Builder() {
            } 

            private Builder(ADConnectors model) {
                this.ADConnectorAddress = model.ADConnectorAddress;
                this.connectorStatus = model.connectorStatus;
                this.networkInterfaceId = model.networkInterfaceId;
                this.specification = model.specification;
                this.trustKey = model.trustKey;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The connection address of the AD Connector.</p>
             * 
             * <strong>example:</strong>
             * <p>172.24.<em>.</em></p>
             */
            public Builder ADConnectorAddress(String ADConnectorAddress) {
                this.ADConnectorAddress = ADConnectorAddress;
                return this;
            }

            /**
             * <p>The status of the AD Connector.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder connectorStatus(String connectorStatus) {
                this.connectorStatus = connectorStatus;
                return this;
            }

            /**
             * <p>The ID of the elastic network interface (ENI) attached to the AD Connector.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp1i4wx78lgosrj6****</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * <p>The specification of the AD Connector.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * <p>The trust password specified when configuring the AD trust relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>password123***</p>
             */
            public Builder trustKey(String trustKey) {
                this.trustKey = trustKey;
                return this;
            }

            /**
             * <p>The vSwitch ID of the network where the AD Connector resides.</p>
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

            private Builder() {
            } 

            private Builder(Logs model) {
                this.level = model.level;
                this.message = model.message;
                this.step = model.step;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * <p>The log level.</p>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The detailed log information.</p>
             * 
             * <strong>example:</strong>
             * <p>code:success | message:Create Connector complete</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The step associated with the log entry.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE_CONNECTOR</p>
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            /**
             * <p>The time when the log was generated. The time is in the ISO 8601 standard format (UTC).</p>
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

            private Builder() {
            } 

            private Builder(ResourceAmounts model) {
                this.amount = model.amount;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The number of resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>desktop</p>
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
        private java.util.List<ADConnectors> ADConnectors;

        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("AccessAttribute")
        private String accessAttribute;

        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("AdHostname")
        private String adHostname;

        @com.aliyun.core.annotation.NameInMap("AuthorityHost")
        private String authorityHost;

        @com.aliyun.core.annotation.NameInMap("BackupDCHostname")
        private String backupDCHostname;

        @com.aliyun.core.annotation.NameInMap("BackupDns")
        private String backupDns;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BasicInternetType")
        private String basicInternetType;

        @com.aliyun.core.annotation.NameInMap("CenAttachStatus")
        private String cenAttachStatus;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("ClientSecret")
        private String clientSecret;

        @com.aliyun.core.annotation.NameInMap("CloudBoxOfficeSite")
        private Boolean cloudBoxOfficeSite;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CustomAccessPoint")
        private String customAccessPoint;

        @com.aliyun.core.annotation.NameInMap("CustomDnsAddress")
        private java.util.List<String> customDnsAddress;

        @com.aliyun.core.annotation.NameInMap("CustomSecurityGroupId")
        private String customSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
        private String desktopAccessType;

        @com.aliyun.core.annotation.NameInMap("DesktopCount")
        private Long desktopCount;

        @com.aliyun.core.annotation.NameInMap("DesktopVpcEndpoint")
        private String desktopVpcEndpoint;

        @com.aliyun.core.annotation.NameInMap("DnsAddress")
        private java.util.List<String> dnsAddress;

        @com.aliyun.core.annotation.NameInMap("DnsUserName")
        private String dnsUserName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainPassword")
        private String domainPassword;

        @com.aliyun.core.annotation.NameInMap("DomainUserName")
        private String domainUserName;

        @com.aliyun.core.annotation.NameInMap("Eid")
        private String eid;

        @com.aliyun.core.annotation.NameInMap("EnableAdminAccess")
        private Boolean enableAdminAccess;

        @com.aliyun.core.annotation.NameInMap("EnableCrossDesktopAccess")
        private Boolean enableCrossDesktopAccess;

        @com.aliyun.core.annotation.NameInMap("EnableInternetAccess")
        private Boolean enableInternetAccess;

        @com.aliyun.core.annotation.NameInMap("EnableServiceRoute")
        private Boolean enableServiceRoute;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("FileSystemIds")
        private java.util.List<String> fileSystemIds;

        @com.aliyun.core.annotation.NameInMap("IsLdap")
        private Boolean isLdap;

        @com.aliyun.core.annotation.NameInMap("LdapUrl")
        private String ldapUrl;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<Logs> logs;

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
        private java.util.List<ResourceAmounts> resourceAmounts;

        @com.aliyun.core.annotation.NameInMap("SecurityProtection")
        private String securityProtection;

        @com.aliyun.core.annotation.NameInMap("SsoEnabled")
        private Boolean ssoEnabled;

        @com.aliyun.core.annotation.NameInMap("SsoType")
        private String ssoType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubDnsAddress")
        private java.util.List<String> subDnsAddress;

        @com.aliyun.core.annotation.NameInMap("SubDomainName")
        private String subDomainName;

        @com.aliyun.core.annotation.NameInMap("SubnetMode")
        private String subnetMode;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TotalEdsCount")
        private Long totalEdsCount;

        @com.aliyun.core.annotation.NameInMap("TotalEdsCountForGroup")
        private Long totalEdsCountForGroup;

        @com.aliyun.core.annotation.NameInMap("TotalResourceAmount")
        private Long totalResourceAmount;

        @com.aliyun.core.annotation.NameInMap("TrustPassword")
        private String trustPassword;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcType")
        private String vpcType;

        @com.aliyun.core.annotation.NameInMap("VplVersion")
        private String vplVersion;

        private OfficeSites(Builder builder) {
            this.ADConnectors = builder.ADConnectors;
            this.acceleratorId = builder.acceleratorId;
            this.accessAttribute = builder.accessAttribute;
            this.accountType = builder.accountType;
            this.adHostname = builder.adHostname;
            this.authorityHost = builder.authorityHost;
            this.backupDCHostname = builder.backupDCHostname;
            this.backupDns = builder.backupDns;
            this.bandwidth = builder.bandwidth;
            this.basicInternetType = builder.basicInternetType;
            this.cenAttachStatus = builder.cenAttachStatus;
            this.cenId = builder.cenId;
            this.cidrBlock = builder.cidrBlock;
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
            this.cloudBoxOfficeSite = builder.cloudBoxOfficeSite;
            this.creationTime = builder.creationTime;
            this.customAccessPoint = builder.customAccessPoint;
            this.customDnsAddress = builder.customDnsAddress;
            this.customSecurityGroupId = builder.customSecurityGroupId;
            this.desktopAccessType = builder.desktopAccessType;
            this.desktopCount = builder.desktopCount;
            this.desktopVpcEndpoint = builder.desktopVpcEndpoint;
            this.dnsAddress = builder.dnsAddress;
            this.dnsUserName = builder.dnsUserName;
            this.domainName = builder.domainName;
            this.domainPassword = builder.domainPassword;
            this.domainUserName = builder.domainUserName;
            this.eid = builder.eid;
            this.enableAdminAccess = builder.enableAdminAccess;
            this.enableCrossDesktopAccess = builder.enableCrossDesktopAccess;
            this.enableInternetAccess = builder.enableInternetAccess;
            this.enableServiceRoute = builder.enableServiceRoute;
            this.envType = builder.envType;
            this.fileSystemIds = builder.fileSystemIds;
            this.isLdap = builder.isLdap;
            this.ldapUrl = builder.ldapUrl;
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
            this.tenantId = builder.tenantId;
            this.totalEdsCount = builder.totalEdsCount;
            this.totalEdsCountForGroup = builder.totalEdsCountForGroup;
            this.totalResourceAmount = builder.totalResourceAmount;
            this.trustPassword = builder.trustPassword;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
            this.vpcType = builder.vpcType;
            this.vplVersion = builder.vplVersion;
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
        public java.util.List<ADConnectors> getADConnectors() {
            return this.ADConnectors;
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return accessAttribute
         */
        public String getAccessAttribute() {
            return this.accessAttribute;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return adHostname
         */
        public String getAdHostname() {
            return this.adHostname;
        }

        /**
         * @return authorityHost
         */
        public String getAuthorityHost() {
            return this.authorityHost;
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
         * @return basicInternetType
         */
        public String getBasicInternetType() {
            return this.basicInternetType;
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
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
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
         * @return customDnsAddress
         */
        public java.util.List<String> getCustomDnsAddress() {
            return this.customDnsAddress;
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
        public java.util.List<String> getDnsAddress() {
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
         * @return eid
         */
        public String getEid() {
            return this.eid;
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
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return fileSystemIds
         */
        public java.util.List<String> getFileSystemIds() {
            return this.fileSystemIds;
        }

        /**
         * @return isLdap
         */
        public Boolean getIsLdap() {
            return this.isLdap;
        }

        /**
         * @return ldapUrl
         */
        public String getLdapUrl() {
            return this.ldapUrl;
        }

        /**
         * @return logs
         */
        public java.util.List<Logs> getLogs() {
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
        public java.util.List<ResourceAmounts> getResourceAmounts() {
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
        public java.util.List<String> getSubDnsAddress() {
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
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
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
        public java.util.List<String> getVSwitchIds() {
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

        /**
         * @return vplVersion
         */
        public String getVplVersion() {
            return this.vplVersion;
        }

        public static final class Builder {
            private java.util.List<ADConnectors> ADConnectors; 
            private String acceleratorId; 
            private String accessAttribute; 
            private String accountType; 
            private String adHostname; 
            private String authorityHost; 
            private String backupDCHostname; 
            private String backupDns; 
            private Integer bandwidth; 
            private String basicInternetType; 
            private String cenAttachStatus; 
            private String cenId; 
            private String cidrBlock; 
            private String clientId; 
            private String clientSecret; 
            private Boolean cloudBoxOfficeSite; 
            private String creationTime; 
            private String customAccessPoint; 
            private java.util.List<String> customDnsAddress; 
            private String customSecurityGroupId; 
            private String desktopAccessType; 
            private Long desktopCount; 
            private String desktopVpcEndpoint; 
            private java.util.List<String> dnsAddress; 
            private String dnsUserName; 
            private String domainName; 
            private String domainPassword; 
            private String domainUserName; 
            private String eid; 
            private Boolean enableAdminAccess; 
            private Boolean enableCrossDesktopAccess; 
            private Boolean enableInternetAccess; 
            private Boolean enableServiceRoute; 
            private String envType; 
            private java.util.List<String> fileSystemIds; 
            private Boolean isLdap; 
            private String ldapUrl; 
            private java.util.List<Logs> logs; 
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
            private java.util.List<ResourceAmounts> resourceAmounts; 
            private String securityProtection; 
            private Boolean ssoEnabled; 
            private String ssoType; 
            private String status; 
            private java.util.List<String> subDnsAddress; 
            private String subDomainName; 
            private String subnetMode; 
            private String tenantId; 
            private Long totalEdsCount; 
            private Long totalEdsCountForGroup; 
            private Long totalResourceAmount; 
            private String trustPassword; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 
            private String vpcType; 
            private String vplVersion; 

            private Builder() {
            } 

            private Builder(OfficeSites model) {
                this.ADConnectors = model.ADConnectors;
                this.acceleratorId = model.acceleratorId;
                this.accessAttribute = model.accessAttribute;
                this.accountType = model.accountType;
                this.adHostname = model.adHostname;
                this.authorityHost = model.authorityHost;
                this.backupDCHostname = model.backupDCHostname;
                this.backupDns = model.backupDns;
                this.bandwidth = model.bandwidth;
                this.basicInternetType = model.basicInternetType;
                this.cenAttachStatus = model.cenAttachStatus;
                this.cenId = model.cenId;
                this.cidrBlock = model.cidrBlock;
                this.clientId = model.clientId;
                this.clientSecret = model.clientSecret;
                this.cloudBoxOfficeSite = model.cloudBoxOfficeSite;
                this.creationTime = model.creationTime;
                this.customAccessPoint = model.customAccessPoint;
                this.customDnsAddress = model.customDnsAddress;
                this.customSecurityGroupId = model.customSecurityGroupId;
                this.desktopAccessType = model.desktopAccessType;
                this.desktopCount = model.desktopCount;
                this.desktopVpcEndpoint = model.desktopVpcEndpoint;
                this.dnsAddress = model.dnsAddress;
                this.dnsUserName = model.dnsUserName;
                this.domainName = model.domainName;
                this.domainPassword = model.domainPassword;
                this.domainUserName = model.domainUserName;
                this.eid = model.eid;
                this.enableAdminAccess = model.enableAdminAccess;
                this.enableCrossDesktopAccess = model.enableCrossDesktopAccess;
                this.enableInternetAccess = model.enableInternetAccess;
                this.enableServiceRoute = model.enableServiceRoute;
                this.envType = model.envType;
                this.fileSystemIds = model.fileSystemIds;
                this.isLdap = model.isLdap;
                this.ldapUrl = model.ldapUrl;
                this.logs = model.logs;
                this.mfaEnabled = model.mfaEnabled;
                this.name = model.name;
                this.needVerifyLoginRisk = model.needVerifyLoginRisk;
                this.needVerifyZeroDevice = model.needVerifyZeroDevice;
                this.networkPackageId = model.networkPackageId;
                this.nmVersion = model.nmVersion;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteType = model.officeSiteType;
                this.ouName = model.ouName;
                this.protocolType = model.protocolType;
                this.rdsLicenseAddress = model.rdsLicenseAddress;
                this.rdsLicenseDomainName = model.rdsLicenseDomainName;
                this.rdsLicenseStatus = model.rdsLicenseStatus;
                this.resourceAmounts = model.resourceAmounts;
                this.securityProtection = model.securityProtection;
                this.ssoEnabled = model.ssoEnabled;
                this.ssoType = model.ssoType;
                this.status = model.status;
                this.subDnsAddress = model.subDnsAddress;
                this.subDomainName = model.subDomainName;
                this.subnetMode = model.subnetMode;
                this.tenantId = model.tenantId;
                this.totalEdsCount = model.totalEdsCount;
                this.totalEdsCountForGroup = model.totalEdsCountForGroup;
                this.totalResourceAmount = model.totalResourceAmount;
                this.trustPassword = model.trustPassword;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
                this.vpcType = model.vpcType;
                this.vplVersion = model.vplVersion;
            } 

            /**
             * <p>The collection of AD Connector information.</p>
             */
            public Builder ADConnectors(java.util.List<ADConnectors> ADConnectors) {
                this.ADConnectors = ADConnectors;
                return this;
            }

            /**
             * <p>The ID of the Global Accelerator (GA) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp1astu3yrplkzoo2****</p>
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * <p>The access attribute of the office network (workspace).</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder accessAttribute(String accessAttribute) {
                this.accessAttribute = accessAttribute;
                return this;
            }

            /**
             * <p>The account type.</p>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The hostname of the domain controller. The hostname must comply with Windows host naming conventions.</p>
             * 
             * <strong>example:</strong>
             * <p>beijing-ad01</p>
             */
            public Builder adHostname(String adHostname) {
                this.adHostname = adHostname;
                return this;
            }

            /**
             * <p>The authority URL of the identity authentication service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://login.microsoftonline.com">https://login.microsoftonline.com</a></p>
             */
            public Builder authorityHost(String authorityHost) {
                this.authorityHost = authorityHost;
                return this;
            }

            /**
             * <p>The hostname of the backup domain controller.</p>
             * 
             * <strong>example:</strong>
             * <p>beijing-ad02</p>
             */
            public Builder backupDCHostname(String backupDCHostname) {
                this.backupDCHostname = backupDCHostname;
                return this;
            }

            /**
             * <p>The DNS address of the backup domain controller.</p>
             * 
             * <strong>example:</strong>
             * <p>172.24.XX.XX</p>
             */
            public Builder backupDns(String backupDns) {
                this.backupDns = backupDns;
                return this;
            }

            /**
             * <p>The peak public bandwidth. Valid values: 0 to 1000 Mbps.<br>If the value is empty or 0, Internet access is not enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The basic bandwidth type.</p>
             * 
             * <strong>example:</strong>
             * <p>basic_plus</p>
             */
            public Builder basicInternetType(String basicInternetType) {
                this.basicInternetType = basicInternetType;
                return this;
            }

            /**
             * <p>The status of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>attached</p>
             */
            public Builder cenAttachStatus(String cenAttachStatus) {
                this.cenAttachStatus = cenAttachStatus;
                return this;
            }

            /**
             * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-3gwy16dojz1m65****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The IPv4 CIDR block of the office network VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>47.100.XX.XX</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The client ID registered with the identity provider application.</p>
             * 
             * <strong>example:</strong>
             * <p>a2c8f7e4-1b3d-4c5e-9f0a-6d7b8c9e****</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The client secret registered with the identity provider application.</p>
             * 
             * <strong>example:</strong>
             * <p>sct-9f3e2d1c****</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * <p>Indicates whether the office network is a CloudBox office network.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cloudBoxOfficeSite(Boolean cloudBoxOfficeSite) {
                this.cloudBoxOfficeSite = cloudBoxOfficeSite;
                return this;
            }

            /**
             * <p>The time when the office network was created. The time is in the ISO 8601 standard format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-06T05:58Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The custom access gateway address.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-****.com</p>
             */
            public Builder customAccessPoint(String customAccessPoint) {
                this.customAccessPoint = customAccessPoint;
                return this;
            }

            /**
             * <p>The array of custom DNS addresses.</p>
             */
            public Builder customDnsAddress(java.util.List<String> customDnsAddress) {
                this.customDnsAddress = customDnsAddress;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1ce64o4g9mdf5u****</p>
             */
            public Builder customSecurityGroupId(String customSecurityGroupId) {
                this.customSecurityGroupId = customSecurityGroupId;
                return this;
            }

            /**
             * <p>The access method allowed for connecting to cloud computers.</p>
             * <blockquote>
             * <p>The VPC connection method depends on the Alibaba Cloud PrivateLink service, which is free of charge. When this parameter is set to <code>VPC</code> or <code>Any</code>, the system automatically activates the PrivateLink service for you.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>INTERNET</p>
             */
            public Builder desktopAccessType(String desktopAccessType) {
                this.desktopAccessType = desktopAccessType;
                return this;
            }

            /**
             * <p>The number of cloud computers that have been created.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder desktopCount(Long desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * <p>The endpoint used for VPC connections to cloud computers.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com">http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com</a></p>
             */
            public Builder desktopVpcEndpoint(String desktopVpcEndpoint) {
                this.desktopVpcEndpoint = desktopVpcEndpoint;
                return this;
            }

            /**
             * <p>The array of DNS addresses corresponding to the AD domain.</p>
             */
            public Builder dnsAddress(java.util.List<String> dnsAddress) {
                this.dnsAddress = dnsAddress;
                return this;
            }

            /**
             * <p>The DNS username.</p>
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
             * <p>The enterprise ID (EID).</p>
             * 
             * <strong>example:</strong>
             * <p>e-1234abcd****</p>
             */
            public Builder eid(String eid) {
                this.eid = eid;
                return this;
            }

            /**
             * <p>Indicates whether local administrator permissions are granted to users of cloud computers.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableAdminAccess(Boolean enableAdminAccess) {
                this.enableAdminAccess = enableAdminAccess;
                return this;
            }

            /**
             * <p>Indicates whether cross-cloud-computer access within the office network is enabled. After this feature is enabled, cloud computers within the same office network can access each other over the network.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
                this.enableCrossDesktopAccess = enableCrossDesktopAccess;
                return this;
            }

            /**
             * <p>Indicates whether public network access is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableInternetAccess(Boolean enableInternetAccess) {
                this.enableInternetAccess = enableInternetAccess;
                return this;
            }

            /**
             * <p>Indicates whether cloud service route access control is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableServiceRoute(Boolean enableServiceRoute) {
                this.enableServiceRoute = enableServiceRoute;
                return this;
            }

            /**
             * <p>The environment type. This parameter is not publicly available.</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The array of NAS file system IDs.</p>
             */
            public Builder fileSystemIds(java.util.List<String> fileSystemIds) {
                this.fileSystemIds = fileSystemIds;
                return this;
            }

            /**
             * <p>Indicates whether the directory is an LDAP directory.</p>
             */
            public Builder isLdap(Boolean isLdap) {
                this.isLdap = isLdap;
                return this;
            }

            /**
             * <p>The access URL of the LDAP service.</p>
             * 
             * <strong>example:</strong>
             * <p>ldap://192.168.0.10:389</p>
             */
            public Builder ldapUrl(String ldapUrl) {
                this.ldapUrl = ldapUrl;
                return this;
            }

            /**
             * <p>The registration log information.</p>
             */
            public Builder logs(java.util.List<Logs> logs) {
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
             * <p>The name of the office network. The name is unique within a region.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D_Office_Network</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Applicable only to convenience account office networks. Indicates whether secondary verification is required during logon. If logon secondary verification is enabled, the system checks whether the logon account has security risks when a convenience user logs on to the client. If a risk is detected, the system sends a verification code to the email address associated with the account. The convenience user can log on to the client only after passing the verification code check.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder needVerifyLoginRisk(Boolean needVerifyLoginRisk) {
                this.needVerifyLoginRisk = needVerifyLoginRisk;
                return this;
            }

            /**
             * <p>Indicates whether trusted device verification is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needVerifyZeroDevice(Boolean needVerifyZeroDevice) {
                this.needVerifyZeroDevice = needVerifyZeroDevice;
                return this;
            }

            /**
             * <p>The Internet access package ID.</p>
             * 
             * <strong>example:</strong>
             * <p>np-amtp8e8q1o9e4****</p>
             */
            public Builder networkPackageId(String networkPackageId) {
                this.networkPackageId = networkPackageId;
                return this;
            }

            /**
             * <p>The network version. The new version supports products such as Wuying Cloud Application.</p>
             * 
             * <strong>example:</strong>
             * <p>NM</p>
             */
            public Builder nmVersion(String nmVersion) {
                this.nmVersion = nmVersion;
                return this;
            }

            /**
             * <p>The office network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The account system type of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>AD_CONNECTOR</p>
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * <p>The organizational unit (OU) in the AD domain.</p>
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
             * <p>The domain name where the RDS license resides.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder rdsLicenseDomainName(String rdsLicenseDomainName) {
                this.rdsLicenseDomainName = rdsLicenseDomainName;
                return this;
            }

            /**
             * <p>The status of the RDS license.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder rdsLicenseStatus(String rdsLicenseStatus) {
                this.rdsLicenseStatus = rdsLicenseStatus;
                return this;
            }

            /**
             * <p>The list of resource quantities.</p>
             */
            public Builder resourceAmounts(java.util.List<ResourceAmounts> resourceAmounts) {
                this.resourceAmounts = resourceAmounts;
                return this;
            }

            /**
             * <p>The security protection configuration of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>SASE</p>
             */
            public Builder securityProtection(String securityProtection) {
                this.securityProtection = securityProtection;
                return this;
            }

            /**
             * <p>Indicates whether Single Sign-On (SSO) is enabled.</p>
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
             * 
             * <strong>example:</strong>
             * <p>SAML</p>
             */
            public Builder ssoType(String ssoType) {
                this.ssoType = ssoType;
                return this;
            }

            /**
             * <p>The office network status.</p>
             * 
             * <strong>example:</strong>
             * <p>REGISTERED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The array of DNS addresses for the AD subdomain.</p>
             */
            public Builder subDnsAddress(java.util.List<String> subDnsAddress) {
                this.subDnsAddress = subDnsAddress;
                return this;
            }

            /**
             * <p>The username of the AD subdomain DNS.</p>
             * 
             * <strong>example:</strong>
             * <p>testSubDnsUserName</p>
             */
            public Builder subDomainName(String subDomainName) {
                this.subDomainName = subDomainName;
                return this;
            }

            /**
             * <p>The subnet mode of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder subnetMode(String subnetMode) {
                this.subnetMode = subnetMode;
                return this;
            }

            /**
             * <p>The tenant ID of the identity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>72f988bf-86f1-41af-91ab-2d7cd011****</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The number of cloud computers.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalEdsCount(Long totalEdsCount) {
                this.totalEdsCount = totalEdsCount;
                return this;
            }

            /**
             * <p>The number of cloud computers in shared cloud computer pools.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalEdsCountForGroup(Long totalEdsCountForGroup) {
                this.totalEdsCountForGroup = totalEdsCountForGroup;
                return this;
            }

            /**
             * <p>The total number of network interface controllers (NICs).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalResourceAmount(Long totalResourceAmount) {
                this.totalResourceAmount = totalResourceAmount;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>To be hidden.</p>
             */
            public Builder trustPassword(String trustPassword) {
                this.trustPassword = trustPassword;
                return this;
            }

            /**
             * <p>The array of vSwitch IDs.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The VPC ID of the secure office network.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf6tz5k67puge5jn8****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The usage type of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            /**
             * <p>The version of the workspace network component (VPL).</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.0</p>
             */
            public Builder vplVersion(String vplVersion) {
                this.vplVersion = vplVersion;
                return this;
            }

            public OfficeSites build() {
                return new OfficeSites(this);
            } 

        } 

    }
}
