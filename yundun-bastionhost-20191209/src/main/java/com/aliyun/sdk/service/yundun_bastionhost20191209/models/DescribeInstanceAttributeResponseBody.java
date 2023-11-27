// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAttributeResponseBody</p>
 */
public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("InstanceAttribute")
    private InstanceAttribute instanceAttribute;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceAttributeResponseBody(Builder builder) {
        this.instanceAttribute = builder.instanceAttribute;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceAttribute
     */
    public InstanceAttribute getInstanceAttribute() {
        return this.instanceAttribute;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceAttribute instanceAttribute; 
        private String requestId; 

        /**
         * The attribute information about the bastion host.
         */
        public Builder instanceAttribute(InstanceAttribute instanceAttribute) {
            this.instanceAttribute = instanceAttribute;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceAttributeResponseBody build() {
            return new DescribeInstanceAttributeResponseBody(this);
        } 

    } 

    public static class Ports extends TeaModel {
        @NameInMap("CustomPort")
        private Integer customPort;

        @NameInMap("StandardPort")
        private Integer standardPort;

        private Ports(Builder builder) {
            this.customPort = builder.customPort;
            this.standardPort = builder.standardPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return customPort
         */
        public Integer getCustomPort() {
            return this.customPort;
        }

        /**
         * @return standardPort
         */
        public Integer getStandardPort() {
            return this.standardPort;
        }

        public static final class Builder {
            private Integer customPort; 
            private Integer standardPort; 

            /**
             * The custom port.
             * <p>
             * 
             * >  You can change only the SSH and RDP ports. If O\&M ports are not specified, the value of the StandardPort parameter is returned.
             */
            public Builder customPort(Integer customPort) {
                this.customPort = customPort;
                return this;
            }

            /**
             * The standard port of the bastion host. Valid values:
             * <p>
             * 
             * *   **SSH**: 60022
             * *   **RDP**: 63389
             * *   **HTTPS**: 443
             */
            public Builder standardPort(Integer standardPort) {
                this.standardPort = standardPort;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
    public static class InstanceAttribute extends TeaModel {
        @NameInMap("AuthorizedSecurityGroups")
        private java.util.List < String > authorizedSecurityGroups;

        @NameInMap("Bandwidth")
        private String bandwidth;

        @NameInMap("BandwidthPackage")
        private String bandwidthPackage;

        @NameInMap("DbOperationModule")
        private String dbOperationModule;

        @NameInMap("Description")
        private String description;

        @NameInMap("EniInstanceId")
        private String eniInstanceId;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InternetEndpoint")
        private String internetEndpoint;

        @NameInMap("IntranetEndpoint")
        private String intranetEndpoint;

        @NameInMap("LicenseCode")
        private String licenseCode;

        @NameInMap("ModifyPasswordModule")
        private String modifyPasswordModule;

        @NameInMap("NetworkProxyModule")
        private String networkProxyModule;

        @NameInMap("Ports")
        private java.util.List < Ports> ports;

        @NameInMap("PrivateExportIps")
        private java.util.List < String > privateExportIps;

        @NameInMap("PrivateWhiteList")
        private java.util.List < String > privateWhiteList;

        @NameInMap("PublicExportIps")
        private java.util.List < String > publicExportIps;

        @NameInMap("PublicIps")
        private java.util.List < String > publicIps;

        @NameInMap("PublicNetworkAccess")
        private Boolean publicNetworkAccess;

        @NameInMap("PublicWhiteList")
        private java.util.List < String > publicWhiteList;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Storage")
        private Long storage;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("WebTerminalModule")
        private String webTerminalModule;

        private InstanceAttribute(Builder builder) {
            this.authorizedSecurityGroups = builder.authorizedSecurityGroups;
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackage = builder.bandwidthPackage;
            this.dbOperationModule = builder.dbOperationModule;
            this.description = builder.description;
            this.eniInstanceId = builder.eniInstanceId;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.internetEndpoint = builder.internetEndpoint;
            this.intranetEndpoint = builder.intranetEndpoint;
            this.licenseCode = builder.licenseCode;
            this.modifyPasswordModule = builder.modifyPasswordModule;
            this.networkProxyModule = builder.networkProxyModule;
            this.ports = builder.ports;
            this.privateExportIps = builder.privateExportIps;
            this.privateWhiteList = builder.privateWhiteList;
            this.publicExportIps = builder.publicExportIps;
            this.publicIps = builder.publicIps;
            this.publicNetworkAccess = builder.publicNetworkAccess;
            this.publicWhiteList = builder.publicWhiteList;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupIds = builder.securityGroupIds;
            this.startTime = builder.startTime;
            this.storage = builder.storage;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.webTerminalModule = builder.webTerminalModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceAttribute create() {
            return builder().build();
        }

        /**
         * @return authorizedSecurityGroups
         */
        public java.util.List < String > getAuthorizedSecurityGroups() {
            return this.authorizedSecurityGroups;
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthPackage
         */
        public String getBandwidthPackage() {
            return this.bandwidthPackage;
        }

        /**
         * @return dbOperationModule
         */
        public String getDbOperationModule() {
            return this.dbOperationModule;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eniInstanceId
         */
        public String getEniInstanceId() {
            return this.eniInstanceId;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return internetEndpoint
         */
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        /**
         * @return intranetEndpoint
         */
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        /**
         * @return licenseCode
         */
        public String getLicenseCode() {
            return this.licenseCode;
        }

        /**
         * @return modifyPasswordModule
         */
        public String getModifyPasswordModule() {
            return this.modifyPasswordModule;
        }

        /**
         * @return networkProxyModule
         */
        public String getNetworkProxyModule() {
            return this.networkProxyModule;
        }

        /**
         * @return ports
         */
        public java.util.List < Ports> getPorts() {
            return this.ports;
        }

        /**
         * @return privateExportIps
         */
        public java.util.List < String > getPrivateExportIps() {
            return this.privateExportIps;
        }

        /**
         * @return privateWhiteList
         */
        public java.util.List < String > getPrivateWhiteList() {
            return this.privateWhiteList;
        }

        /**
         * @return publicExportIps
         */
        public java.util.List < String > getPublicExportIps() {
            return this.publicExportIps;
        }

        /**
         * @return publicIps
         */
        public java.util.List < String > getPublicIps() {
            return this.publicIps;
        }

        /**
         * @return publicNetworkAccess
         */
        public Boolean getPublicNetworkAccess() {
            return this.publicNetworkAccess;
        }

        /**
         * @return publicWhiteList
         */
        public java.util.List < String > getPublicWhiteList() {
            return this.publicWhiteList;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List < String > getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return storage
         */
        public Long getStorage() {
            return this.storage;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return webTerminalModule
         */
        public String getWebTerminalModule() {
            return this.webTerminalModule;
        }

        public static final class Builder {
            private java.util.List < String > authorizedSecurityGroups; 
            private String bandwidth; 
            private String bandwidthPackage; 
            private String dbOperationModule; 
            private String description; 
            private String eniInstanceId; 
            private Long expireTime; 
            private String instanceId; 
            private String instanceStatus; 
            private String internetEndpoint; 
            private String intranetEndpoint; 
            private String licenseCode; 
            private String modifyPasswordModule; 
            private String networkProxyModule; 
            private java.util.List < Ports> ports; 
            private java.util.List < String > privateExportIps; 
            private java.util.List < String > privateWhiteList; 
            private java.util.List < String > publicExportIps; 
            private java.util.List < String > publicIps; 
            private Boolean publicNetworkAccess; 
            private java.util.List < String > publicWhiteList; 
            private String regionId; 
            private String resourceGroupId; 
            private java.util.List < String > securityGroupIds; 
            private Long startTime; 
            private Long storage; 
            private String vpcId; 
            private String vswitchId; 
            private String webTerminalModule; 

            /**
             * AuthorizedSecurityGroups.
             */
            public Builder authorizedSecurityGroups(java.util.List < String > authorizedSecurityGroups) {
                this.authorizedSecurityGroups = authorizedSecurityGroups;
                return this;
            }

            /**
             * The total bandwidth of the bastion host.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The extra bandwidth plan of the bastion host.
             */
            public Builder bandwidthPackage(String bandwidthPackage) {
                this.bandwidthPackage = bandwidthPackage;
                return this;
            }

            /**
             * DbOperationModule.
             */
            public Builder dbOperationModule(String dbOperationModule) {
                this.dbOperationModule = dbOperationModule;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EniInstanceId.
             */
            public Builder eniInstanceId(String eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * InternetEndpoint.
             */
            public Builder internetEndpoint(String internetEndpoint) {
                this.internetEndpoint = internetEndpoint;
                return this;
            }

            /**
             * IntranetEndpoint.
             */
            public Builder intranetEndpoint(String intranetEndpoint) {
                this.intranetEndpoint = intranetEndpoint;
                return this;
            }

            /**
             * LicenseCode.
             */
            public Builder licenseCode(String licenseCode) {
                this.licenseCode = licenseCode;
                return this;
            }

            /**
             * ModifyPasswordModule.
             */
            public Builder modifyPasswordModule(String modifyPasswordModule) {
                this.modifyPasswordModule = modifyPasswordModule;
                return this;
            }

            /**
             * NetworkProxyModule.
             */
            public Builder networkProxyModule(String networkProxyModule) {
                this.networkProxyModule = networkProxyModule;
                return this;
            }

            /**
             * Ports.
             */
            public Builder ports(java.util.List < Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * PrivateExportIps.
             */
            public Builder privateExportIps(java.util.List < String > privateExportIps) {
                this.privateExportIps = privateExportIps;
                return this;
            }

            /**
             * PrivateWhiteList.
             */
            public Builder privateWhiteList(java.util.List < String > privateWhiteList) {
                this.privateWhiteList = privateWhiteList;
                return this;
            }

            /**
             * PublicExportIps.
             */
            public Builder publicExportIps(java.util.List < String > publicExportIps) {
                this.publicExportIps = publicExportIps;
                return this;
            }

            /**
             * PublicIps.
             */
            public Builder publicIps(java.util.List < String > publicIps) {
                this.publicIps = publicIps;
                return this;
            }

            /**
             * PublicNetworkAccess.
             */
            public Builder publicNetworkAccess(Boolean publicNetworkAccess) {
                this.publicNetworkAccess = publicNetworkAccess;
                return this;
            }

            /**
             * PublicWhiteList.
             */
            public Builder publicWhiteList(java.util.List < String > publicWhiteList) {
                this.publicWhiteList = publicWhiteList;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SecurityGroupIds.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Storage.
             */
            public Builder storage(Long storage) {
                this.storage = storage;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * WebTerminalModule.
             */
            public Builder webTerminalModule(String webTerminalModule) {
                this.webTerminalModule = webTerminalModule;
                return this;
            }

            public InstanceAttribute build() {
                return new InstanceAttribute(this);
            } 

        } 

    }
}
