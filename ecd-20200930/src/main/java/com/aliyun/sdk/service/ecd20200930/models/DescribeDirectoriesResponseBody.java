// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDirectoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDirectoriesResponseBody</p>
 */
public class DescribeDirectoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdHostname")
    private String adHostname;

    @com.aliyun.core.annotation.NameInMap("Directories")
    private java.util.List < Directories> directories;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDirectoriesResponseBody(Builder builder) {
        this.adHostname = builder.adHostname;
        this.directories = builder.directories;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDirectoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return adHostname
     */
    public String getAdHostname() {
        return this.adHostname;
    }

    /**
     * @return directories
     */
    public java.util.List < Directories> getDirectories() {
        return this.directories;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String adHostname; 
        private java.util.List < Directories> directories; 
        private String nextToken; 
        private String requestId; 

        /**
         * The hostname of the domain controller. The hostname must comply with the hostname naming convention of Windows. This parameter is returned only when the directory type is AD office network.
         */
        public Builder adHostname(String adHostname) {
            this.adHostname = adHostname;
            return this;
        }

        /**
         * The directories.
         */
        public Builder directories(java.util.List < Directories> directories) {
            this.directories = directories;
            return this;
        }

        /**
         * The token that is used for the next query. If this parameter is empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDirectoriesResponseBody build() {
            return new DescribeDirectoriesResponseBody(this);
        } 

    } 

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
             * The connection address.
             */
            public Builder ADConnectorAddress(String ADConnectorAddress) {
                this.ADConnectorAddress = ADConnectorAddress;
                return this;
            }

            /**
             * Valid values:
             * <p>
             * 
             * *   CONNECT_ERROR
             * *   RUNNING
             * *   CONNECTING: You must configure domain trust for your AD system.
             * *   EXPIRED
             * *   CREATING
             */
            public Builder connectorStatus(String connectorStatus) {
                this.connectorStatus = connectorStatus;
                return this;
            }

            /**
             * The ID of the NIC to which the AD connector is mounted.
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
             * The trust password of the AD domain controller.
             */
            public Builder trustKey(String trustKey) {
                this.trustKey = trustKey;
                return this;
            }

            /**
             * The ID of the vSwitch with which the AD connector is associated.
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
             * The level of the log entry.
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
             * The step that corresponds to the log entry.
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
    public static class Directories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ADConnectors")
        private java.util.List < ADConnectors> ADConnectors;

        @com.aliyun.core.annotation.NameInMap("AdHostname")
        private String adHostname;

        @com.aliyun.core.annotation.NameInMap("BackupDCHostname")
        private String backupDCHostname;

        @com.aliyun.core.annotation.NameInMap("BackupDns")
        private String backupDns;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CustomSecurityGroupId")
        private String customSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
        private String desktopAccessType;

        @com.aliyun.core.annotation.NameInMap("DesktopVpcEndpoint")
        private String desktopVpcEndpoint;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryType")
        private String directoryType;

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

        @com.aliyun.core.annotation.NameInMap("OuName")
        private String ouName;

        @com.aliyun.core.annotation.NameInMap("SsoEnabled")
        private Boolean ssoEnabled;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubDnsAddress")
        private java.util.List < String > subDnsAddress;

        @com.aliyun.core.annotation.NameInMap("SubDomainName")
        private String subDomainName;

        @com.aliyun.core.annotation.NameInMap("TrustPassword")
        private String trustPassword;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Directories(Builder builder) {
            this.ADConnectors = builder.ADConnectors;
            this.adHostname = builder.adHostname;
            this.backupDCHostname = builder.backupDCHostname;
            this.backupDns = builder.backupDns;
            this.creationTime = builder.creationTime;
            this.customSecurityGroupId = builder.customSecurityGroupId;
            this.desktopAccessType = builder.desktopAccessType;
            this.desktopVpcEndpoint = builder.desktopVpcEndpoint;
            this.directoryId = builder.directoryId;
            this.directoryType = builder.directoryType;
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
            this.ouName = builder.ouName;
            this.ssoEnabled = builder.ssoEnabled;
            this.status = builder.status;
            this.subDnsAddress = builder.subDnsAddress;
            this.subDomainName = builder.subDomainName;
            this.trustPassword = builder.trustPassword;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directories create() {
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
         * @return desktopVpcEndpoint
         */
        public String getDesktopVpcEndpoint() {
            return this.desktopVpcEndpoint;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryType
         */
        public String getDirectoryType() {
            return this.directoryType;
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
         * @return ouName
         */
        public String getOuName() {
            return this.ouName;
        }

        /**
         * @return ssoEnabled
         */
        public Boolean getSsoEnabled() {
            return this.ssoEnabled;
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

        public static final class Builder {
            private java.util.List < ADConnectors> ADConnectors; 
            private String adHostname; 
            private String backupDCHostname; 
            private String backupDns; 
            private String creationTime; 
            private String customSecurityGroupId; 
            private String desktopAccessType; 
            private String desktopVpcEndpoint; 
            private String directoryId; 
            private String directoryType; 
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
            private String ouName; 
            private Boolean ssoEnabled; 
            private String status; 
            private java.util.List < String > subDnsAddress; 
            private String subDomainName; 
            private String trustPassword; 
            private java.util.List < String > vSwitchIds; 
            private String vpcId; 

            /**
             * Details of the AD connector.
             */
            public Builder ADConnectors(java.util.List < ADConnectors> ADConnectors) {
                this.ADConnectors = ADConnectors;
                return this;
            }

            /**
             * The hostname of the domain controller. The hostname must comply with the hostname naming convention of Windows. This parameter is returned only when the directory type is AD office network.
             */
            public Builder adHostname(String adHostname) {
                this.adHostname = adHostname;
                return this;
            }

            /**
             * BackupDCHostname.
             */
            public Builder backupDCHostname(String backupDCHostname) {
                this.backupDCHostname = backupDCHostname;
                return this;
            }

            /**
             * BackupDns.
             */
            public Builder backupDns(String backupDns) {
                this.backupDns = backupDns;
                return this;
            }

            /**
             * The time when the directory was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The security group ID. This parameter is returned only when the directory type is AD office network.
             */
            public Builder customSecurityGroupId(String customSecurityGroupId) {
                this.customSecurityGroupId = customSecurityGroupId;
                return this;
            }

            /**
             * The method in which the cloud computer is connected.
             * <p>
             * 
             * Valid values:
             * 
             * *   VPC
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Internet
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Any
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder desktopAccessType(String desktopAccessType) {
                this.desktopAccessType = desktopAccessType;
                return this;
            }

            /**
             * The endpoint that is used to connect to cloud computers in the directory over a VPC.
             */
            public Builder desktopVpcEndpoint(String desktopVpcEndpoint) {
                this.desktopVpcEndpoint = desktopVpcEndpoint;
                return this;
            }

            /**
             * The directory ID.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The directory type.
             * <p>
             * 
             * Valid values:
             * 
             * *   AD_CONNECTOR: AD directory
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   RAM: RAM directory
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder directoryType(String directoryType) {
                this.directoryType = directoryType;
                return this;
            }

            /**
             * The DNS address of the directory.
             */
            public Builder dnsAddress(java.util.List < String > dnsAddress) {
                this.dnsAddress = dnsAddress;
                return this;
            }

            /**
             * The username of a DNS user.
             */
            public Builder dnsUserName(String dnsUserName) {
                this.dnsUserName = dnsUserName;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The password of the domain administrator. This parameter is returned only when the directory type is AD office network.
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
             * Indicates whether the local administrator permissions are granted to users that use cloud computers in the office network.
             */
            public Builder enableAdminAccess(Boolean enableAdminAccess) {
                this.enableAdminAccess = enableAdminAccess;
                return this;
            }

            /**
             * Indicates whether cloud computers can communicate with each other in the directory.
             */
            public Builder enableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
                this.enableCrossDesktopAccess = enableCrossDesktopAccess;
                return this;
            }

            /**
             * Indicates whether access over the Internet is enabled.
             * <p>
             * 
             * >  This parameter is unavailable.
             */
            public Builder enableInternetAccess(Boolean enableInternetAccess) {
                this.enableInternetAccess = enableInternetAccess;
                return this;
            }

            /**
             * The IDs of Apsara File Storage NAS (NAS) file systems.
             */
            public Builder fileSystemIds(java.util.List < String > fileSystemIds) {
                this.fileSystemIds = fileSystemIds;
                return this;
            }

            /**
             * The registration logs. This parameter is returned only when the directory type is AD office network.
             */
            public Builder logs(java.util.List < Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * Indicates whether MFA is enabled.
             */
            public Builder mfaEnabled(Boolean mfaEnabled) {
                this.mfaEnabled = mfaEnabled;
                return this;
            }

            /**
             * The directory name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether two-step verification for logons is enabled. This parameter is returned only for directories of convenience account type.\
             * <p>
             * If two-factor verification is enabled, the system checks whether security risks exist within the logon account when a convenience user logs on to an Alibaba Cloud Workspace client. If risks are detected, the system sends a verification code to the email address that is associated with the account. Then, the convenience user can log on to the client only after the user enters the correct verification code.
             */
            public Builder needVerifyLoginRisk(Boolean needVerifyLoginRisk) {
                this.needVerifyLoginRisk = needVerifyLoginRisk;
                return this;
            }

            /**
             * The organization unit that you selected when you added the cloud computer to the domain.
             */
            public Builder ouName(String ouName) {
                this.ouName = ouName;
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
             * The status of the AD directory.
             * <p>
             * 
             * Valid values:
             * 
             * *   REGISTERING
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   REGISTERED
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
             * The DNS address of the enterprise AD subdomain.
             */
            public Builder subDnsAddress(java.util.List < String > subDnsAddress) {
                this.subDnsAddress = subDnsAddress;
                return this;
            }

            /**
             * The fully qualified domain name (FQDN) of the existing AD subdomain. The value contains both the host name and the domain name.
             */
            public Builder subDomainName(String subDomainName) {
                this.subDomainName = subDomainName;
                return this;
            }

            /**
             * The AD trust password. This parameter is returned only when the directory type is AD office network.
             */
            public Builder trustPassword(String trustPassword) {
                this.trustPassword = trustPassword;
                return this;
            }

            /**
             * The IDs of the vSwitches specified when the directory was created.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * The ID of the VPC to which the vSwitch belongs. This parameter is returned only when the directory type is AD office network.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Directories build() {
                return new Directories(this);
            } 

        } 

    }
}
