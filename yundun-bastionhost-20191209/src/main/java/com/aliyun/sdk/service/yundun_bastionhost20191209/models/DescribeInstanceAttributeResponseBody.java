// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAttributeResponseBody</p>
 */
public class DescribeInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceAttribute")
    private InstanceAttribute instanceAttribute;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceAttributeResponseBody model) {
            this.instanceAttribute = model.instanceAttribute;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The attribute information about the bastion host.</p>
         */
        public Builder instanceAttribute(InstanceAttribute instanceAttribute) {
            this.instanceAttribute = instanceAttribute;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>082FAB35-6AB9-4FD5-8750-D36673548E76</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceAttributeResponseBody build() {
            return new DescribeInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPort")
        private Integer customPort;

        @com.aliyun.core.annotation.NameInMap("StandardPort")
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

            private Builder() {
            } 

            private Builder(Ports model) {
                this.customPort = model.customPort;
                this.standardPort = model.standardPort;
            } 

            /**
             * <p>The custom port.</p>
             * <blockquote>
             * <p>Only the SSH and RDP ports can be changed. If no custom O&amp;M port is specified for the bastion host, the value of StandardPort is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>600xx</p>
             */
            public Builder customPort(Integer customPort) {
                this.customPort = customPort;
                return this;
            }

            /**
             * <p>The standard port of the bastion host. Valid values:</p>
             * <ul>
             * <li><strong>SSH</strong>: 60022.</li>
             * <li><strong>RDP</strong>: 63389.</li>
             * <li><strong>HTTPS</strong>: 443.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>60022</p>
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
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class WhiteListPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Entry")
        private String entry;

        private WhiteListPolicies(Builder builder) {
            this.description = builder.description;
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteListPolicies create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entry
         */
        public String getEntry() {
            return this.entry;
        }

        public static final class Builder {
            private String description; 
            private String entry; 

            private Builder() {
            } 

            private Builder(WhiteListPolicies model) {
                this.description = model.description;
                this.entry = model.entry;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Entry.
             */
            public Builder entry(String entry) {
                this.entry = entry;
                return this;
            }

            public WhiteListPolicies build() {
                return new WhiteListPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceAttributeResponseBody</p>
     */
    public static class InstanceAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppOperationModule")
        private String appOperationModule;

        @com.aliyun.core.annotation.NameInMap("AuthorizedSecurityGroups")
        private java.util.List<String> authorizedSecurityGroups;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackage")
        private String bandwidthPackage;

        @com.aliyun.core.annotation.NameInMap("DbOperationModule")
        private String dbOperationModule;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EniInstanceId")
        private String eniInstanceId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("HSMModule")
        private String HSMModule;

        @com.aliyun.core.annotation.NameInMap("IDaaSModule")
        private String iDaaSModule;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InternetEndpoint")
        private String internetEndpoint;

        @com.aliyun.core.annotation.NameInMap("IntranetEndpoint")
        private String intranetEndpoint;

        @com.aliyun.core.annotation.NameInMap("KmsSecretModule")
        private String kmsSecretModule;

        @com.aliyun.core.annotation.NameInMap("LicenseCode")
        private String licenseCode;

        @com.aliyun.core.annotation.NameInMap("ModifyPasswordModule")
        private String modifyPasswordModule;

        @com.aliyun.core.annotation.NameInMap("NetworkProxyModule")
        private String networkProxyModule;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List<Ports> ports;

        @com.aliyun.core.annotation.NameInMap("PrivateExportIps")
        private java.util.List<String> privateExportIps;

        @com.aliyun.core.annotation.NameInMap("PrivateWhiteList")
        private java.util.List<String> privateWhiteList;

        @com.aliyun.core.annotation.NameInMap("PublicExportIps")
        private java.util.List<String> publicExportIps;

        @com.aliyun.core.annotation.NameInMap("PublicIps")
        private java.util.List<String> publicIps;

        @com.aliyun.core.annotation.NameInMap("PublicNetworkAccess")
        private Boolean publicNetworkAccess;

        @com.aliyun.core.annotation.NameInMap("PublicWhiteList")
        private java.util.List<String> publicWhiteList;

        @com.aliyun.core.annotation.NameInMap("RDModule")
        private String RDModule;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RouterRules")
        private java.util.List<String> routerRules;

        @com.aliyun.core.annotation.NameInMap("ScriptDeliverModule")
        private String scriptDeliverModule;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("SlaveVswitchId")
        private String slaveVswitchId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private Long storage;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("WebTerminalModule")
        private String webTerminalModule;

        @com.aliyun.core.annotation.NameInMap("WhiteListPolicies")
        private java.util.List<WhiteListPolicies> whiteListPolicies;

        private InstanceAttribute(Builder builder) {
            this.appOperationModule = builder.appOperationModule;
            this.authorizedSecurityGroups = builder.authorizedSecurityGroups;
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackage = builder.bandwidthPackage;
            this.dbOperationModule = builder.dbOperationModule;
            this.description = builder.description;
            this.eniInstanceId = builder.eniInstanceId;
            this.expireTime = builder.expireTime;
            this.HSMModule = builder.HSMModule;
            this.iDaaSModule = builder.iDaaSModule;
            this.instanceId = builder.instanceId;
            this.instanceStatus = builder.instanceStatus;
            this.internetEndpoint = builder.internetEndpoint;
            this.intranetEndpoint = builder.intranetEndpoint;
            this.kmsSecretModule = builder.kmsSecretModule;
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
            this.RDModule = builder.RDModule;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.routerRules = builder.routerRules;
            this.scriptDeliverModule = builder.scriptDeliverModule;
            this.securityGroupIds = builder.securityGroupIds;
            this.slaveVswitchId = builder.slaveVswitchId;
            this.startTime = builder.startTime;
            this.storage = builder.storage;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.webTerminalModule = builder.webTerminalModule;
            this.whiteListPolicies = builder.whiteListPolicies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceAttribute create() {
            return builder().build();
        }

        /**
         * @return appOperationModule
         */
        public String getAppOperationModule() {
            return this.appOperationModule;
        }

        /**
         * @return authorizedSecurityGroups
         */
        public java.util.List<String> getAuthorizedSecurityGroups() {
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
         * @return HSMModule
         */
        public String getHSMModule() {
            return this.HSMModule;
        }

        /**
         * @return iDaaSModule
         */
        public String getIDaaSModule() {
            return this.iDaaSModule;
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
         * @return kmsSecretModule
         */
        public String getKmsSecretModule() {
            return this.kmsSecretModule;
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
        public java.util.List<Ports> getPorts() {
            return this.ports;
        }

        /**
         * @return privateExportIps
         */
        public java.util.List<String> getPrivateExportIps() {
            return this.privateExportIps;
        }

        /**
         * @return privateWhiteList
         */
        public java.util.List<String> getPrivateWhiteList() {
            return this.privateWhiteList;
        }

        /**
         * @return publicExportIps
         */
        public java.util.List<String> getPublicExportIps() {
            return this.publicExportIps;
        }

        /**
         * @return publicIps
         */
        public java.util.List<String> getPublicIps() {
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
        public java.util.List<String> getPublicWhiteList() {
            return this.publicWhiteList;
        }

        /**
         * @return RDModule
         */
        public String getRDModule() {
            return this.RDModule;
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
         * @return routerRules
         */
        public java.util.List<String> getRouterRules() {
            return this.routerRules;
        }

        /**
         * @return scriptDeliverModule
         */
        public String getScriptDeliverModule() {
            return this.scriptDeliverModule;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return slaveVswitchId
         */
        public String getSlaveVswitchId() {
            return this.slaveVswitchId;
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

        /**
         * @return whiteListPolicies
         */
        public java.util.List<WhiteListPolicies> getWhiteListPolicies() {
            return this.whiteListPolicies;
        }

        public static final class Builder {
            private String appOperationModule; 
            private java.util.List<String> authorizedSecurityGroups; 
            private String bandwidth; 
            private String bandwidthPackage; 
            private String dbOperationModule; 
            private String description; 
            private String eniInstanceId; 
            private Long expireTime; 
            private String HSMModule; 
            private String iDaaSModule; 
            private String instanceId; 
            private String instanceStatus; 
            private String internetEndpoint; 
            private String intranetEndpoint; 
            private String kmsSecretModule; 
            private String licenseCode; 
            private String modifyPasswordModule; 
            private String networkProxyModule; 
            private java.util.List<Ports> ports; 
            private java.util.List<String> privateExportIps; 
            private java.util.List<String> privateWhiteList; 
            private java.util.List<String> publicExportIps; 
            private java.util.List<String> publicIps; 
            private Boolean publicNetworkAccess; 
            private java.util.List<String> publicWhiteList; 
            private String RDModule; 
            private String regionId; 
            private String resourceGroupId; 
            private java.util.List<String> routerRules; 
            private String scriptDeliverModule; 
            private java.util.List<String> securityGroupIds; 
            private String slaveVswitchId; 
            private Long startTime; 
            private Long storage; 
            private String vpcId; 
            private String vswitchId; 
            private String webTerminalModule; 
            private java.util.List<WhiteListPolicies> whiteListPolicies; 

            private Builder() {
            } 

            private Builder(InstanceAttribute model) {
                this.appOperationModule = model.appOperationModule;
                this.authorizedSecurityGroups = model.authorizedSecurityGroups;
                this.bandwidth = model.bandwidth;
                this.bandwidthPackage = model.bandwidthPackage;
                this.dbOperationModule = model.dbOperationModule;
                this.description = model.description;
                this.eniInstanceId = model.eniInstanceId;
                this.expireTime = model.expireTime;
                this.HSMModule = model.HSMModule;
                this.iDaaSModule = model.iDaaSModule;
                this.instanceId = model.instanceId;
                this.instanceStatus = model.instanceStatus;
                this.internetEndpoint = model.internetEndpoint;
                this.intranetEndpoint = model.intranetEndpoint;
                this.kmsSecretModule = model.kmsSecretModule;
                this.licenseCode = model.licenseCode;
                this.modifyPasswordModule = model.modifyPasswordModule;
                this.networkProxyModule = model.networkProxyModule;
                this.ports = model.ports;
                this.privateExportIps = model.privateExportIps;
                this.privateWhiteList = model.privateWhiteList;
                this.publicExportIps = model.publicExportIps;
                this.publicIps = model.publicIps;
                this.publicNetworkAccess = model.publicNetworkAccess;
                this.publicWhiteList = model.publicWhiteList;
                this.RDModule = model.RDModule;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.routerRules = model.routerRules;
                this.scriptDeliverModule = model.scriptDeliverModule;
                this.securityGroupIds = model.securityGroupIds;
                this.slaveVswitchId = model.slaveVswitchId;
                this.startTime = model.startTime;
                this.storage = model.storage;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
                this.webTerminalModule = model.webTerminalModule;
                this.whiteListPolicies = model.whiteListPolicies;
            } 

            /**
             * AppOperationModule.
             */
            public Builder appOperationModule(String appOperationModule) {
                this.appOperationModule = appOperationModule;
                return this;
            }

            /**
             * <p>The IDs of authorized security groups.</p>
             */
            public Builder authorizedSecurityGroups(java.util.List<String> authorizedSecurityGroups) {
                this.authorizedSecurityGroups = authorizedSecurityGroups;
                return this;
            }

            /**
             * <p>The total bandwidth of the bastion host.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The bandwidth plan ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder bandwidthPackage(String bandwidthPackage) {
                this.bandwidthPackage = bandwidthPackage;
                return this;
            }

            /**
             * <p>The status of the database O&amp;M feature.</p>
             * 
             * <strong>example:</strong>
             * <p>Disable</p>
             */
            public Builder dbOperationModule(String dbOperationModule) {
                this.dbOperationModule = dbOperationModule;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the Elastic Network Interface (ENI).</p>
             * 
             * <strong>example:</strong>
             * <p>eni-bp1455jrzwm7moaxxxxx</p>
             */
            public Builder eniInstanceId(String eniInstanceId) {
                this.eniInstanceId = eniInstanceId;
                return this;
            }

            /**
             * <p>The time when the instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1578326400000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * HSMModule.
             */
            public Builder HSMModule(String HSMModule) {
                this.HSMModule = HSMModule;
                return this;
            }

            /**
             * IDaaSModule.
             */
            public Builder iDaaSModule(String iDaaSModule) {
                this.iDaaSModule = iDaaSModule;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>bastionhost-cn-78v1ghxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>PENDING: The instance is not initialized.</li>
             * <li>CREATING: The instance is being created.</li>
             * <li>RUNNING: The instance is running.</li>
             * <li>EXPIRED: The instance expired.</li>
             * <li>CREATE_FAILED: The instance fails to be created.</li>
             * <li>UPGRADING: The configurations of the instance are being changed.</li>
             * <li>UPGRADE_FAILED: The configurations of the instance fail to be changed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>drawvxalwb-public.bastionhost.aliyuncs.com</p>
             */
            public Builder internetEndpoint(String internetEndpoint) {
                this.internetEndpoint = internetEndpoint;
                return this;
            }

            /**
             * <p>The private endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>drawvxalwb.bastionhost.aliyuncs.com</p>
             */
            public Builder intranetEndpoint(String intranetEndpoint) {
                this.intranetEndpoint = intranetEndpoint;
                return this;
            }

            /**
             * KmsSecretModule.
             */
            public Builder kmsSecretModule(String kmsSecretModule) {
                this.kmsSecretModule = kmsSecretModule;
                return this;
            }

            /**
             * <p>The license code.</p>
             * 
             * <strong>example:</strong>
             * <p>bhah_ent_50_asset</p>
             */
            public Builder licenseCode(String licenseCode) {
                this.licenseCode = licenseCode;
                return this;
            }

            /**
             * <p>The status of the automatic password change feature.</p>
             * <ul>
             * <li><strong>Enable</strong></li>
             * <li><strong>Disable</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder modifyPasswordModule(String modifyPasswordModule) {
                this.modifyPasswordModule = modifyPasswordModule;
                return this;
            }

            /**
             * <p>The status of the network domain feature.</p>
             * <ul>
             * <li><strong>Enable</strong></li>
             * <li><strong>Disable</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder networkProxyModule(String networkProxyModule) {
                this.networkProxyModule = networkProxyModule;
                return this;
            }

            /**
             * <p>An array that consists of the O&amp;M ports of the bastion host.</p>
             */
            public Builder ports(java.util.List<Ports> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>An array that consists of the egress private IP addresses of the bastion host.</p>
             */
            public Builder privateExportIps(java.util.List<String> privateExportIps) {
                this.privateExportIps = privateExportIps;
                return this;
            }

            /**
             * <p>The private IP addresses that are allowed to access the instance.</p>
             */
            public Builder privateWhiteList(java.util.List<String> privateWhiteList) {
                this.privateWhiteList = privateWhiteList;
                return this;
            }

            /**
             * <p>An array that consists of the egress public IP addresses of the bastion host.</p>
             */
            public Builder publicExportIps(java.util.List<String> publicExportIps) {
                this.publicExportIps = publicExportIps;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             */
            public Builder publicIps(java.util.List<String> publicIps) {
                this.publicIps = publicIps;
                return this;
            }

            /**
             * <p>Indicates whether the Bastionhost instance can be accessed over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publicNetworkAccess(Boolean publicNetworkAccess) {
                this.publicNetworkAccess = publicNetworkAccess;
                return this;
            }

            /**
             * <p>The public IP addresses that are allowed to access the instance.</p>
             */
            public Builder publicWhiteList(java.util.List<String> publicWhiteList) {
                this.publicWhiteList = publicWhiteList;
                return this;
            }

            /**
             * RDModule.
             */
            public Builder RDModule(String RDModule) {
                this.RDModule = RDModule;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzc427dbl2shy</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * RouterRules.
             */
            public Builder routerRules(java.util.List<String> routerRules) {
                this.routerRules = routerRules;
                return this;
            }

            /**
             * ScriptDeliverModule.
             */
            public Builder scriptDeliverModule(String scriptDeliverModule) {
                this.scriptDeliverModule = scriptDeliverModule;
                return this;
            }

            /**
             * <p>The IDs of the security groups to which the instance belongs.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * SlaveVswitchId.
             */
            public Builder slaveVswitchId(String slaveVswitchId) {
                this.slaveVswitchId = slaveVswitchId;
                return this;
            }

            /**
             * <p>The time when the instance started.</p>
             * 
             * <strong>example:</strong>
             * <p>1577681345000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The storage capacity of the bastion host. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2199023255552</p>
             */
            public Builder storage(Long storage) {
                this.storage = storage;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1c85tzgqu1bf5bxxxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the instance connects.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1xfwzzfti0kjbfxxxxx</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>The status of the web terminal.</p>
             * <ul>
             * <li><strong>Enable</strong></li>
             * <li><strong>Disable</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder webTerminalModule(String webTerminalModule) {
                this.webTerminalModule = webTerminalModule;
                return this;
            }

            /**
             * WhiteListPolicies.
             */
            public Builder whiteListPolicies(java.util.List<WhiteListPolicies> whiteListPolicies) {
                this.whiteListPolicies = whiteListPolicies;
                return this;
            }

            public InstanceAttribute build() {
                return new InstanceAttribute(this);
            } 

        } 

    }
}
