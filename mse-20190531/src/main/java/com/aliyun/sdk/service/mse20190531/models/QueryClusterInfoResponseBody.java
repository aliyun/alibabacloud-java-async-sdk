// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryClusterInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryClusterInfoResponseBody</p>
 */
public class QueryClusterInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryClusterInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterInfoResponseBody create() {
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
         * <p>The details of the data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * <ul>
         * <li>If the request is successful, a success message is returned.</li>
         * <li>If the request fails, an error message is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The request is successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>415088B3-A7BE-56F6-9CD9-C42DE895CD41</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryClusterInfoResponseBody build() {
            return new QueryClusterInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryClusterInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryClusterInfoResponseBody</p>
     */
    public static class InstanceModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTimestamp")
        private String creationTimestamp;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("SingleTunnelVip")
        private String singleTunnelVip;

        @com.aliyun.core.annotation.NameInMap("Zone")
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
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder creationTimestamp(String creationTimestamp) {
                this.creationTimestamp = creationTimestamp;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder singleTunnelVip(String singleTunnelVip) {
                this.singleTunnelVip = singleTunnelVip;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
    /**
     * 
     * {@link QueryClusterInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryClusterInfoResponseBody</p>
     */
    public static class MaintenancePeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private MaintenancePeriod(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaintenancePeriod create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            /**
             * <p>The start time of the O&amp;M time window.</p>
             * 
             * <strong>example:</strong>
             * <p>02:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The end time of the O&amp;M time window.</p>
             * 
             * <strong>example:</strong>
             * <p>06:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public MaintenancePeriod build() {
                return new MaintenancePeriod(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryClusterInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryClusterInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclEntryList")
        private String aclEntryList;

        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("CanUpdate")
        private Boolean canUpdate;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ClusterAliasName")
        private String clusterAliasName;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterSpecification")
        private String clusterSpecification;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("ClusterVersion")
        private String clusterVersion;

        @com.aliyun.core.annotation.NameInMap("ConnectionType")
        private String connectionType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DiskCapacity")
        private Long diskCapacity;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("EipInstanceId")
        private String eipInstanceId;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("ExpectZones")
        private java.util.List < String > expectZones;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("InitCostTime")
        private Long initCostTime;

        @com.aliyun.core.annotation.NameInMap("InitStatus")
        private String initStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceModels")
        private java.util.List < InstanceModels> instanceModels;

        @com.aliyun.core.annotation.NameInMap("InternetAddress")
        private String internetAddress;

        @com.aliyun.core.annotation.NameInMap("InternetDomain")
        private String internetDomain;

        @com.aliyun.core.annotation.NameInMap("InternetPort")
        private String internetPort;

        @com.aliyun.core.annotation.NameInMap("IntranetAddress")
        private String intranetAddress;

        @com.aliyun.core.annotation.NameInMap("IntranetDomain")
        private String intranetDomain;

        @com.aliyun.core.annotation.NameInMap("IntranetPort")
        private String intranetPort;

        @com.aliyun.core.annotation.NameInMap("MaintenancePeriod")
        private MaintenancePeriod maintenancePeriod;

        @com.aliyun.core.annotation.NameInMap("MemoryCapacity")
        private Long memoryCapacity;

        @com.aliyun.core.annotation.NameInMap("MseVersion")
        private String mseVersion;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("PayInfo")
        private String payInfo;

        @com.aliyun.core.annotation.NameInMap("PubNetworkFlow")
        private String pubNetworkFlow;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupType")
        private String securityGroupType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.aclEntryList = builder.aclEntryList;
            this.aclId = builder.aclId;
            this.appVersion = builder.appVersion;
            this.canUpdate = builder.canUpdate;
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
            this.eipInstanceId = builder.eipInstanceId;
            this.endDate = builder.endDate;
            this.expectZones = builder.expectZones;
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
            this.maintenancePeriod = builder.maintenancePeriod;
            this.memoryCapacity = builder.memoryCapacity;
            this.mseVersion = builder.mseVersion;
            this.netType = builder.netType;
            this.payInfo = builder.payInfo;
            this.pubNetworkFlow = builder.pubNetworkFlow;
            this.regionId = builder.regionId;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupType = builder.securityGroupType;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.versionCode = builder.versionCode;
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
         * @return canUpdate
         */
        public Boolean getCanUpdate() {
            return this.canUpdate;
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
         * @return eipInstanceId
         */
        public String getEipInstanceId() {
            return this.eipInstanceId;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return expectZones
         */
        public java.util.List < String > getExpectZones() {
            return this.expectZones;
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
         * @return maintenancePeriod
         */
        public MaintenancePeriod getMaintenancePeriod() {
            return this.maintenancePeriod;
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
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupType
         */
        public String getSecurityGroupType() {
            return this.securityGroupType;
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
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
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
            private Boolean canUpdate; 
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
            private String eipInstanceId; 
            private String endDate; 
            private java.util.List < String > expectZones; 
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
            private MaintenancePeriod maintenancePeriod; 
            private Long memoryCapacity; 
            private String mseVersion; 
            private String netType; 
            private String payInfo; 
            private String pubNetworkFlow; 
            private String regionId; 
            private String securityGroupId; 
            private String securityGroupType; 
            private java.util.Map < String, ? > tags; 
            private String vSwitchId; 
            private String versionCode; 
            private String vpcId; 

            /**
             * <p>The public IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;127.0.0.0/32&quot;]</p>
             */
            public Builder aclEntryList(String aclEntryList) {
                this.aclEntryList = aclEntryList;
                return this;
            }

            /**
             * <p>The ID of the instance in the public IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-bp144q24cgqvzckmxxxx</p>
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * <p>The version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2.1.0</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * CanUpdate.
             */
            public Builder canUpdate(Boolean canUpdate) {
                this.canUpdate = canUpdate;
                return this;
            }

            /**
             * <p>The billing method, such as subscription or pay-as-you-go.</p>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The alias of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Development environment</p>
             */
            public Builder clusterAliasName(String clusterAliasName) {
                this.clusterAliasName = clusterAliasName;
                return this;
            }

            /**
             * <p>The full name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-74355150-xxxxxxx</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The engine specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE_SC_2_4_60_c</p>
             */
            public Builder clusterSpecification(String clusterSpecification) {
                this.clusterSpecification = clusterSpecification;
                return this;
            }

            /**
             * <p>The type of the instance. Valid values: ZooKeeper, Nacos-Ans, and Eureka.</p>
             * 
             * <strong>example:</strong>
             * <p>Nacos-Ans</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The version of the order.</p>
             * 
             * <strong>example:</strong>
             * <p>NACOS_2_0_0</p>
             */
            public Builder clusterVersion(String clusterVersion) {
                this.clusterVersion = clusterVersion;
                return this;
            }

            /**
             * <p>A deprecated parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder connectionType(String connectionType) {
                this.connectionType = connectionType;
                return this;
            }

            /**
             * <p>A deprecated parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-15 10:02:07</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>A deprecated parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder diskCapacity(Long diskCapacity) {
                this.diskCapacity = diskCapacity;
                return this;
            }

            /**
             * <p>A deprecated parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The ID of the instance that is associated with the Elastic IP Address (EIP).</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bp1uujshd5funmyy8rcl9</p>
             */
            public Builder eipInstanceId(String eipInstanceId) {
                this.eipInstanceId = eipInstanceId;
                return this;
            }

            /**
             * <p>The time when the subscription instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-01 00:00:00</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The zones to which the current cluster can be distributed.</p>
             */
            public Builder expectZones(java.util.List < String > expectZones) {
                this.expectZones = expectZones;
                return this;
            }

            /**
             * <p>The status of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>INIT_SUCCESS</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>The time that is required to initialize the instance. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>53353</p>
             */
            public Builder initCostTime(Long initCostTime) {
                this.initCostTime = initCostTime;
                return this;
            }

            /**
             * <p>The initial status of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>INIT_SUCCESS</p>
             */
            public Builder initStatus(String initStatus) {
                this.initStatus = initStatus;
                return this;
            }

            /**
             * <p>The number of instance nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The ID of the instance</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-st21ri2****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The reserved structure.</p>
             */
            public Builder instanceModels(java.util.List < InstanceModels> instanceModels) {
                this.instanceModels = instanceModels;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder internetAddress(String internetAddress) {
                this.internetAddress = internetAddress;
                return this;
            }

            /**
             * <p>The public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-xxxxxx-p.nacos-ans.mse.aliyuncs.com</p>
             */
            public Builder internetDomain(String internetDomain) {
                this.internetDomain = internetDomain;
                return this;
            }

            /**
             * <p>The instance ports that are accessible over the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>8848,6443,9848,8761</p>
             */
            public Builder internetPort(String internetPort) {
                this.internetPort = internetPort;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * <p>The internal endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-xxxxx-nacos-ans.mse.aliyuncs.com</p>
             */
            public Builder intranetDomain(String intranetDomain) {
                this.intranetDomain = intranetDomain;
                return this;
            }

            /**
             * <p>The instance ports that are accessible over an internal network.</p>
             * 
             * <strong>example:</strong>
             * <p>8848,6443,9848,8761</p>
             */
            public Builder intranetPort(String intranetPort) {
                this.intranetPort = intranetPort;
                return this;
            }

            /**
             * <p>The O&amp;M time window.</p>
             */
            public Builder maintenancePeriod(MaintenancePeriod maintenancePeriod) {
                this.maintenancePeriod = maintenancePeriod;
                return this;
            }

            /**
             * <p>A deprecated parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder memoryCapacity(Long memoryCapacity) {
                this.memoryCapacity = memoryCapacity;
                return this;
            }

            /**
             * <p>The version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse_pro</p>
             */
            public Builder mseVersion(String mseVersion) {
                this.mseVersion = mseVersion;
                return this;
            }

            /**
             * <p>The network connection type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>privatenet</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>Pay-as-you-go</p>
             */
            public Builder payInfo(String payInfo) {
                this.payInfo = payInfo;
                return this;
            }

            /**
             * <p>The public bandwidth. Unit: Mbit/s.<br>Valid values: 0 to 5000. The value 0 indicates no access to the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pubNetworkFlow(String pubNetworkFlow) {
                this.pubNetworkFlow = pubNetworkFlow;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the security group to which the elastic network interface (ENI) is connected.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-uf6hgwe067prhg68agfa</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The type of the security group to which the ENI is connected.</p>
             * 
             * <strong>example:</strong>
             * <p>enterprise</p>
             */
            public Builder securityGroupType(String securityGroupType) {
                this.securityGroupType = securityGroupType;
                return this;
            }

            /**
             * <p>The tag.</p>
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1egfakxxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VersionCode.
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            /**
             * <p>The ID of the VPC where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1v5nbauzh8xxxxxxx</p>
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
