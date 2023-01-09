// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryClusterDetailResponseBody</p>
 */
public class QueryClusterDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryClusterDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryClusterDetailResponseBody build() {
            return new QueryClusterDetailResponseBody(this);
        } 

    } 

    public static class InstanceModels extends TeaModel {
        @NameInMap("CreationTimestamp")
        private String creationTimestamp;

        @NameInMap("HealthStatus")
        private String healthStatus;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("PodName")
        private String podName;

        @NameInMap("Role")
        private String role;

        @NameInMap("SingleTunnelVip")
        private String singleTunnelVip;

        @NameInMap("Zone")
        private String zone;

        private InstanceModels(Builder builder) {
            this.creationTimestamp = builder.creationTimestamp;
            this.healthStatus = builder.healthStatus;
            this.internetIp = builder.internetIp;
            this.ip = builder.ip;
            this.podName = builder.podName;
            this.role = builder.role;
            this.singleTunnelVip = builder.singleTunnelVip;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceModels create() {
            return builder().build();
        }

        /**
         * @return creationTimestamp
         */
        public String getCreationTimestamp() {
            return this.creationTimestamp;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return singleTunnelVip
         */
        public String getSingleTunnelVip() {
            return this.singleTunnelVip;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private String creationTimestamp; 
            private String healthStatus; 
            private String internetIp; 
            private String ip; 
            private String podName; 
            private String role; 
            private String singleTunnelVip; 
            private String zone; 

            /**
             * The timestamp when the instance node was created.
             */
            public Builder creationTimestamp(String creationTimestamp) {
                this.creationTimestamp = creationTimestamp;
                return this;
            }

            /**
             * The health status of the instance node.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * The public IP address.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The IP address of the node.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The name of the pod.
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * The role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The single-thread IP address.
             */
            public Builder singleTunnelVip(String singleTunnelVip) {
                this.singleTunnelVip = singleTunnelVip;
                return this;
            }

            /**
             * The zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public InstanceModels build() {
                return new InstanceModels(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AclEntryList")
        private String aclEntryList;

        @NameInMap("AclId")
        private String aclId;

        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ClusterAliasName")
        private String clusterAliasName;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterSpecification")
        private String clusterSpecification;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("ClusterVersion")
        private String clusterVersion;

        @NameInMap("ConnectionType")
        private String connectionType;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DiskCapacity")
        private Long diskCapacity;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("HealthStatus")
        private String healthStatus;

        @NameInMap("InitCostTime")
        private Long initCostTime;

        @NameInMap("InitStatus")
        private String initStatus;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceModels")
        private java.util.List < InstanceModels> instanceModels;

        @NameInMap("InternetAddress")
        private String internetAddress;

        @NameInMap("InternetDomain")
        private String internetDomain;

        @NameInMap("InternetPort")
        private String internetPort;

        @NameInMap("IntranetAddress")
        private String intranetAddress;

        @NameInMap("IntranetDomain")
        private String intranetDomain;

        @NameInMap("IntranetPort")
        private String intranetPort;

        @NameInMap("MemoryCapacity")
        private Long memoryCapacity;

        @NameInMap("MseVersion")
        private String mseVersion;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("OrderClusterVersion")
        private String orderClusterVersion;

        @NameInMap("PayInfo")
        private String payInfo;

        @NameInMap("PubNetworkFlow")
        private String pubNetworkFlow;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.aclEntryList = builder.aclEntryList;
            this.aclId = builder.aclId;
            this.appVersion = builder.appVersion;
            this.chargeType = builder.chargeType;
            this.clusterAliasName = builder.clusterAliasName;
            this.clusterName = builder.clusterName;
            this.clusterSpecification = builder.clusterSpecification;
            this.clusterType = builder.clusterType;
            this.clusterVersion = builder.clusterVersion;
            this.connectionType = builder.connectionType;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.diskCapacity = builder.diskCapacity;
            this.diskType = builder.diskType;
            this.healthStatus = builder.healthStatus;
            this.initCostTime = builder.initCostTime;
            this.initStatus = builder.initStatus;
            this.instanceCount = builder.instanceCount;
            this.instanceId = builder.instanceId;
            this.instanceModels = builder.instanceModels;
            this.internetAddress = builder.internetAddress;
            this.internetDomain = builder.internetDomain;
            this.internetPort = builder.internetPort;
            this.intranetAddress = builder.intranetAddress;
            this.intranetDomain = builder.intranetDomain;
            this.intranetPort = builder.intranetPort;
            this.memoryCapacity = builder.memoryCapacity;
            this.mseVersion = builder.mseVersion;
            this.netType = builder.netType;
            this.orderClusterVersion = builder.orderClusterVersion;
            this.payInfo = builder.payInfo;
            this.pubNetworkFlow = builder.pubNetworkFlow;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aclEntryList
         */
        public String getAclEntryList() {
            return this.aclEntryList;
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clusterAliasName
         */
        public String getClusterAliasName() {
            return this.clusterAliasName;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterSpecification
         */
        public String getClusterSpecification() {
            return this.clusterSpecification;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return clusterVersion
         */
        public String getClusterVersion() {
            return this.clusterVersion;
        }

        /**
         * @return connectionType
         */
        public String getConnectionType() {
            return this.connectionType;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return diskCapacity
         */
        public Long getDiskCapacity() {
            return this.diskCapacity;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return initCostTime
         */
        public Long getInitCostTime() {
            return this.initCostTime;
        }

        /**
         * @return initStatus
         */
        public String getInitStatus() {
            return this.initStatus;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceModels
         */
        public java.util.List < InstanceModels> getInstanceModels() {
            return this.instanceModels;
        }

        /**
         * @return internetAddress
         */
        public String getInternetAddress() {
            return this.internetAddress;
        }

        /**
         * @return internetDomain
         */
        public String getInternetDomain() {
            return this.internetDomain;
        }

        /**
         * @return internetPort
         */
        public String getInternetPort() {
            return this.internetPort;
        }

        /**
         * @return intranetAddress
         */
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        /**
         * @return intranetDomain
         */
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        /**
         * @return intranetPort
         */
        public String getIntranetPort() {
            return this.intranetPort;
        }

        /**
         * @return memoryCapacity
         */
        public Long getMemoryCapacity() {
            return this.memoryCapacity;
        }

        /**
         * @return mseVersion
         */
        public String getMseVersion() {
            return this.mseVersion;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return orderClusterVersion
         */
        public String getOrderClusterVersion() {
            return this.orderClusterVersion;
        }

        /**
         * @return payInfo
         */
        public String getPayInfo() {
            return this.payInfo;
        }

        /**
         * @return pubNetworkFlow
         */
        public String getPubNetworkFlow() {
            return this.pubNetworkFlow;
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
         * @return tags
         */
        public java.util.Map < String, ? > getTags() {
            return this.tags;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String aclEntryList; 
            private String aclId; 
            private String appVersion; 
            private String chargeType; 
            private String clusterAliasName; 
            private String clusterName; 
            private String clusterSpecification; 
            private String clusterType; 
            private String clusterVersion; 
            private String connectionType; 
            private Integer cpu; 
            private String createTime; 
            private Long diskCapacity; 
            private String diskType; 
            private String healthStatus; 
            private Long initCostTime; 
            private String initStatus; 
            private Integer instanceCount; 
            private String instanceId; 
            private java.util.List < InstanceModels> instanceModels; 
            private String internetAddress; 
            private String internetDomain; 
            private String internetPort; 
            private String intranetAddress; 
            private String intranetDomain; 
            private String intranetPort; 
            private Long memoryCapacity; 
            private String mseVersion; 
            private String netType; 
            private String orderClusterVersion; 
            private String payInfo; 
            private String pubNetworkFlow; 
            private String regionId; 
            private String resourceGroupId; 
            private java.util.Map < String, ? > tags; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The whitelist.
             */
            public Builder aclEntryList(String aclEntryList) {
                this.aclEntryList = aclEntryList;
                return this;
            }

            /**
             * The ID of the whitelist.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * The application version.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * The billing method, such as subscription or pay-as-you-go.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The alias of the instance.
             */
            public Builder clusterAliasName(String clusterAliasName) {
                this.clusterAliasName = clusterAliasName;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The engine specifications.
             */
            public Builder clusterSpecification(String clusterSpecification) {
                this.clusterSpecification = clusterSpecification;
                return this;
            }

            /**
             * The type of the instance. Valid values: ZooKeeper, Nacos-Ans, and Eureka.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The version of the instance.
             */
            public Builder clusterVersion(String clusterVersion) {
                this.clusterVersion = clusterVersion;
                return this;
            }

            /**
             * The network connection type. Valid values:
             * <p>
             * 
             * *   slb
             * *   eni
             */
            public Builder connectionType(String connectionType) {
                this.connectionType = connectionType;
                return this;
            }

            /**
             * The number of vCPUs.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time when the instance was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The capacity of the disk. Unit: GB.
             */
            public Builder diskCapacity(Long diskCapacity) {
                this.diskCapacity = diskCapacity;
                return this;
            }

            /**
             * The type of the disk.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The health status of the instance.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * The amount of time taken to create the instance. Unit: milliseconds.
             */
            public Builder initCostTime(Long initCostTime) {
                this.initCostTime = initCostTime;
                return this;
            }

            /**
             * The creation status of the instance.
             */
            public Builder initStatus(String initStatus) {
                this.initStatus = initStatus;
                return this;
            }

            /**
             * The number of instance nodes.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The list of instance nodes.
             */
            public Builder instanceModels(java.util.List < InstanceModels> instanceModels) {
                this.instanceModels = instanceModels;
                return this;
            }

            /**
             * The public IP address of the instance.
             */
            public Builder internetAddress(String internetAddress) {
                this.internetAddress = internetAddress;
                return this;
            }

            /**
             * The public endpoint of the instance.
             */
            public Builder internetDomain(String internetDomain) {
                this.internetDomain = internetDomain;
                return this;
            }

            /**
             * The private port number.
             */
            public Builder internetPort(String internetPort) {
                this.internetPort = internetPort;
                return this;
            }

            /**
             * The internal IP address.
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * The internal endpoint of the instance.
             */
            public Builder intranetDomain(String intranetDomain) {
                this.intranetDomain = intranetDomain;
                return this;
            }

            /**
             * The private port number.
             */
            public Builder intranetPort(String intranetPort) {
                this.intranetPort = intranetPort;
                return this;
            }

            /**
             * The size of the memory. Unit: GB.
             */
            public Builder memoryCapacity(Long memoryCapacity) {
                this.memoryCapacity = memoryCapacity;
                return this;
            }

            /**
             * The edition of Microservices Engine (MSE).
             */
            public Builder mseVersion(String mseVersion) {
                this.mseVersion = mseVersion;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   `privatenet`: VPC
             * *   `pubnet`: Internet
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * The version number of the original order.
             */
            public Builder orderClusterVersion(String orderClusterVersion) {
                this.orderClusterVersion = orderClusterVersion;
                return this;
            }

            /**
             * The billing method, such as subscription or pay-as-you-go.
             */
            public Builder payInfo(String payInfo) {
                this.payInfo = payInfo;
                return this;
            }

            /**
             * The public bandwidth. Unit: Mbit/s.\
             * <p>
             * Valid values: 0 to 5000. The value 0 indicates no access to the Internet.
             */
            public Builder pubNetworkFlow(String pubNetworkFlow) {
                this.pubNetworkFlow = pubNetworkFlow;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tags that are attached to the instance.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
