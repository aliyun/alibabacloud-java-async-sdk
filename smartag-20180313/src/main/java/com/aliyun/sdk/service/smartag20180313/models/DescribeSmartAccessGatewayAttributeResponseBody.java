// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSmartAccessGatewayAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSmartAccessGatewayAttributeResponseBody</p>
 */
public class DescribeSmartAccessGatewayAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccelerateBandwidth")
    private Long accelerateBandwidth;

    @com.aliyun.core.annotation.NameInMap("AccessPointId")
    private String accessPointId;

    @com.aliyun.core.annotation.NameInMap("AclIds")
    private AclIds aclIds;

    @com.aliyun.core.annotation.NameInMap("ApplicationBandwidthPackageBussinessStatus")
    private String applicationBandwidthPackageBussinessStatus;

    @com.aliyun.core.annotation.NameInMap("ApplicationBandwidthPackageId")
    private String applicationBandwidthPackageId;

    @com.aliyun.core.annotation.NameInMap("ApplicationBandwidthPackageName")
    private String applicationBandwidthPackageName;

    @com.aliyun.core.annotation.NameInMap("ApplicationBandwidthPackageOperationLocks")
    private ApplicationBandwidthPackageOperationLocks applicationBandwidthPackageOperationLocks;

    @com.aliyun.core.annotation.NameInMap("AssociatedCcnId")
    private String associatedCcnId;

    @com.aliyun.core.annotation.NameInMap("AssociatedCcnName")
    private String associatedCcnName;

    @com.aliyun.core.annotation.NameInMap("BackupBoxControllerIp")
    private String backupBoxControllerIp;

    @com.aliyun.core.annotation.NameInMap("BoxControllerIp")
    private String boxControllerIp;

    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("DataPlan")
    private Long dataPlan;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Devices")
    private Devices devices;

    @com.aliyun.core.annotation.NameInMap("EnableOptimization")
    private Boolean enableOptimization;

    @com.aliyun.core.annotation.NameInMap("EnableSoftwareConnectionAudit")
    private Boolean enableSoftwareConnectionAudit;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("FlowLogIds")
    private FlowLogIds flowLogIds;

    @com.aliyun.core.annotation.NameInMap("IRIds")
    private IRIds IRIds;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("IpsecStatus")
    private String ipsecStatus;

    @com.aliyun.core.annotation.NameInMap("Links")
    private Links links;

    @com.aliyun.core.annotation.NameInMap("MaxBandwidth")
    private String maxBandwidth;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OptimizationType")
    private Boolean optimizationType;

    @com.aliyun.core.annotation.NameInMap("Position")
    private String position;

    @com.aliyun.core.annotation.NameInMap("QosIds")
    private QosIds qosIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResellerInstanceId")
    private String resellerInstanceId;

    @com.aliyun.core.annotation.NameInMap("ResellerUid")
    private String resellerUid;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("RoutingStrategy")
    private String routingStrategy;

    @com.aliyun.core.annotation.NameInMap("SecurityLockThreshold")
    private Integer securityLockThreshold;

    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    private String smartAGId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TrafficMasterSn")
    private String trafficMasterSn;

    @com.aliyun.core.annotation.NameInMap("UpBandwidth4G")
    private Integer upBandwidth4G;

    @com.aliyun.core.annotation.NameInMap("UpBandwidthWan")
    private Integer upBandwidthWan;

    @com.aliyun.core.annotation.NameInMap("UserCount")
    private Integer userCount;

    @com.aliyun.core.annotation.NameInMap("VpnStatus")
    private String vpnStatus;

    private DescribeSmartAccessGatewayAttributeResponseBody(Builder builder) {
        this.accelerateBandwidth = builder.accelerateBandwidth;
        this.accessPointId = builder.accessPointId;
        this.aclIds = builder.aclIds;
        this.applicationBandwidthPackageBussinessStatus = builder.applicationBandwidthPackageBussinessStatus;
        this.applicationBandwidthPackageId = builder.applicationBandwidthPackageId;
        this.applicationBandwidthPackageName = builder.applicationBandwidthPackageName;
        this.applicationBandwidthPackageOperationLocks = builder.applicationBandwidthPackageOperationLocks;
        this.associatedCcnId = builder.associatedCcnId;
        this.associatedCcnName = builder.associatedCcnName;
        this.backupBoxControllerIp = builder.backupBoxControllerIp;
        this.boxControllerIp = builder.boxControllerIp;
        this.cidrBlock = builder.cidrBlock;
        this.city = builder.city;
        this.createTime = builder.createTime;
        this.dataPlan = builder.dataPlan;
        this.description = builder.description;
        this.devices = builder.devices;
        this.enableOptimization = builder.enableOptimization;
        this.enableSoftwareConnectionAudit = builder.enableSoftwareConnectionAudit;
        this.endTime = builder.endTime;
        this.flowLogIds = builder.flowLogIds;
        this.IRIds = builder.IRIds;
        this.instanceType = builder.instanceType;
        this.ipsecStatus = builder.ipsecStatus;
        this.links = builder.links;
        this.maxBandwidth = builder.maxBandwidth;
        this.name = builder.name;
        this.optimizationType = builder.optimizationType;
        this.position = builder.position;
        this.qosIds = builder.qosIds;
        this.requestId = builder.requestId;
        this.resellerInstanceId = builder.resellerInstanceId;
        this.resellerUid = builder.resellerUid;
        this.resourceGroupId = builder.resourceGroupId;
        this.routingStrategy = builder.routingStrategy;
        this.securityLockThreshold = builder.securityLockThreshold;
        this.serialNumber = builder.serialNumber;
        this.smartAGId = builder.smartAGId;
        this.status = builder.status;
        this.trafficMasterSn = builder.trafficMasterSn;
        this.upBandwidth4G = builder.upBandwidth4G;
        this.upBandwidthWan = builder.upBandwidthWan;
        this.userCount = builder.userCount;
        this.vpnStatus = builder.vpnStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartAccessGatewayAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateBandwidth
     */
    public Long getAccelerateBandwidth() {
        return this.accelerateBandwidth;
    }

    /**
     * @return accessPointId
     */
    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * @return aclIds
     */
    public AclIds getAclIds() {
        return this.aclIds;
    }

    /**
     * @return applicationBandwidthPackageBussinessStatus
     */
    public String getApplicationBandwidthPackageBussinessStatus() {
        return this.applicationBandwidthPackageBussinessStatus;
    }

    /**
     * @return applicationBandwidthPackageId
     */
    public String getApplicationBandwidthPackageId() {
        return this.applicationBandwidthPackageId;
    }

    /**
     * @return applicationBandwidthPackageName
     */
    public String getApplicationBandwidthPackageName() {
        return this.applicationBandwidthPackageName;
    }

    /**
     * @return applicationBandwidthPackageOperationLocks
     */
    public ApplicationBandwidthPackageOperationLocks getApplicationBandwidthPackageOperationLocks() {
        return this.applicationBandwidthPackageOperationLocks;
    }

    /**
     * @return associatedCcnId
     */
    public String getAssociatedCcnId() {
        return this.associatedCcnId;
    }

    /**
     * @return associatedCcnName
     */
    public String getAssociatedCcnName() {
        return this.associatedCcnName;
    }

    /**
     * @return backupBoxControllerIp
     */
    public String getBackupBoxControllerIp() {
        return this.backupBoxControllerIp;
    }

    /**
     * @return boxControllerIp
     */
    public String getBoxControllerIp() {
        return this.boxControllerIp;
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataPlan
     */
    public Long getDataPlan() {
        return this.dataPlan;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return devices
     */
    public Devices getDevices() {
        return this.devices;
    }

    /**
     * @return enableOptimization
     */
    public Boolean getEnableOptimization() {
        return this.enableOptimization;
    }

    /**
     * @return enableSoftwareConnectionAudit
     */
    public Boolean getEnableSoftwareConnectionAudit() {
        return this.enableSoftwareConnectionAudit;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return flowLogIds
     */
    public FlowLogIds getFlowLogIds() {
        return this.flowLogIds;
    }

    /**
     * @return IRIds
     */
    public IRIds getIRIds() {
        return this.IRIds;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return ipsecStatus
     */
    public String getIpsecStatus() {
        return this.ipsecStatus;
    }

    /**
     * @return links
     */
    public Links getLinks() {
        return this.links;
    }

    /**
     * @return maxBandwidth
     */
    public String getMaxBandwidth() {
        return this.maxBandwidth;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return optimizationType
     */
    public Boolean getOptimizationType() {
        return this.optimizationType;
    }

    /**
     * @return position
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * @return qosIds
     */
    public QosIds getQosIds() {
        return this.qosIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resellerInstanceId
     */
    public String getResellerInstanceId() {
        return this.resellerInstanceId;
    }

    /**
     * @return resellerUid
     */
    public String getResellerUid() {
        return this.resellerUid;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return routingStrategy
     */
    public String getRoutingStrategy() {
        return this.routingStrategy;
    }

    /**
     * @return securityLockThreshold
     */
    public Integer getSecurityLockThreshold() {
        return this.securityLockThreshold;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return trafficMasterSn
     */
    public String getTrafficMasterSn() {
        return this.trafficMasterSn;
    }

    /**
     * @return upBandwidth4G
     */
    public Integer getUpBandwidth4G() {
        return this.upBandwidth4G;
    }

    /**
     * @return upBandwidthWan
     */
    public Integer getUpBandwidthWan() {
        return this.upBandwidthWan;
    }

    /**
     * @return userCount
     */
    public Integer getUserCount() {
        return this.userCount;
    }

    /**
     * @return vpnStatus
     */
    public String getVpnStatus() {
        return this.vpnStatus;
    }

    public static final class Builder {
        private Long accelerateBandwidth; 
        private String accessPointId; 
        private AclIds aclIds; 
        private String applicationBandwidthPackageBussinessStatus; 
        private String applicationBandwidthPackageId; 
        private String applicationBandwidthPackageName; 
        private ApplicationBandwidthPackageOperationLocks applicationBandwidthPackageOperationLocks; 
        private String associatedCcnId; 
        private String associatedCcnName; 
        private String backupBoxControllerIp; 
        private String boxControllerIp; 
        private String cidrBlock; 
        private String city; 
        private Long createTime; 
        private Long dataPlan; 
        private String description; 
        private Devices devices; 
        private Boolean enableOptimization; 
        private Boolean enableSoftwareConnectionAudit; 
        private Long endTime; 
        private FlowLogIds flowLogIds; 
        private IRIds IRIds; 
        private String instanceType; 
        private String ipsecStatus; 
        private Links links; 
        private String maxBandwidth; 
        private String name; 
        private Boolean optimizationType; 
        private String position; 
        private QosIds qosIds; 
        private String requestId; 
        private String resellerInstanceId; 
        private String resellerUid; 
        private String resourceGroupId; 
        private String routingStrategy; 
        private Integer securityLockThreshold; 
        private String serialNumber; 
        private String smartAGId; 
        private String status; 
        private String trafficMasterSn; 
        private Integer upBandwidth4G; 
        private Integer upBandwidthWan; 
        private Integer userCount; 
        private String vpnStatus; 

        private Builder() {
        } 

        private Builder(DescribeSmartAccessGatewayAttributeResponseBody model) {
            this.accelerateBandwidth = model.accelerateBandwidth;
            this.accessPointId = model.accessPointId;
            this.aclIds = model.aclIds;
            this.applicationBandwidthPackageBussinessStatus = model.applicationBandwidthPackageBussinessStatus;
            this.applicationBandwidthPackageId = model.applicationBandwidthPackageId;
            this.applicationBandwidthPackageName = model.applicationBandwidthPackageName;
            this.applicationBandwidthPackageOperationLocks = model.applicationBandwidthPackageOperationLocks;
            this.associatedCcnId = model.associatedCcnId;
            this.associatedCcnName = model.associatedCcnName;
            this.backupBoxControllerIp = model.backupBoxControllerIp;
            this.boxControllerIp = model.boxControllerIp;
            this.cidrBlock = model.cidrBlock;
            this.city = model.city;
            this.createTime = model.createTime;
            this.dataPlan = model.dataPlan;
            this.description = model.description;
            this.devices = model.devices;
            this.enableOptimization = model.enableOptimization;
            this.enableSoftwareConnectionAudit = model.enableSoftwareConnectionAudit;
            this.endTime = model.endTime;
            this.flowLogIds = model.flowLogIds;
            this.IRIds = model.IRIds;
            this.instanceType = model.instanceType;
            this.ipsecStatus = model.ipsecStatus;
            this.links = model.links;
            this.maxBandwidth = model.maxBandwidth;
            this.name = model.name;
            this.optimizationType = model.optimizationType;
            this.position = model.position;
            this.qosIds = model.qosIds;
            this.requestId = model.requestId;
            this.resellerInstanceId = model.resellerInstanceId;
            this.resellerUid = model.resellerUid;
            this.resourceGroupId = model.resourceGroupId;
            this.routingStrategy = model.routingStrategy;
            this.securityLockThreshold = model.securityLockThreshold;
            this.serialNumber = model.serialNumber;
            this.smartAGId = model.smartAGId;
            this.status = model.status;
            this.trafficMasterSn = model.trafficMasterSn;
            this.upBandwidth4G = model.upBandwidth4G;
            this.upBandwidthWan = model.upBandwidthWan;
            this.userCount = model.userCount;
            this.vpnStatus = model.vpnStatus;
        } 

        /**
         * <p>The peak bandwidth for application acceleration of the Smart Access Gateway instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder accelerateBandwidth(Long accelerateBandwidth) {
            this.accelerateBandwidth = accelerateBandwidth;
            return this;
        }

        /**
         * <p>The ID of the access point for the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>238</p>
         */
        public Builder accessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * AclIds.
         */
        public Builder aclIds(AclIds aclIds) {
            this.aclIds = aclIds;
            return this;
        }

        /**
         * <p>The status of the bandwidth plan for application acceleration instance. Valid values:</p>
         * <ul>
         * <li><strong>Abnormal</strong>: Abnormal.</li>
         * <li><strong>Normal</strong>: Normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder applicationBandwidthPackageBussinessStatus(String applicationBandwidthPackageBussinessStatus) {
            this.applicationBandwidthPackageBussinessStatus = applicationBandwidthPackageBussinessStatus;
            return this;
        }

        /**
         * <p>The ID of the bandwidth plan for application acceleration associated with the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>abwp-7963l7iqnquyj3****</p>
         */
        public Builder applicationBandwidthPackageId(String applicationBandwidthPackageId) {
            this.applicationBandwidthPackageId = applicationBandwidthPackageId;
            return this;
        }

        /**
         * <p>The name of the bandwidth plan for application acceleration associated with the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        public Builder applicationBandwidthPackageName(String applicationBandwidthPackageName) {
            this.applicationBandwidthPackageName = applicationBandwidthPackageName;
            return this;
        }

        /**
         * <p>The lock information of the bandwidth plan for application acceleration instance.</p>
         */
        public Builder applicationBandwidthPackageOperationLocks(ApplicationBandwidthPackageOperationLocks applicationBandwidthPackageOperationLocks) {
            this.applicationBandwidthPackageOperationLocks = applicationBandwidthPackageOperationLocks;
            return this;
        }

        /**
         * <p>The ID of the Cloud Connect Network (CCN) instance associated with the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-iz26o9zye6lhoo****</p>
         */
        public Builder associatedCcnId(String associatedCcnId) {
            this.associatedCcnId = associatedCcnId;
            return this;
        }

        /**
         * <p>The name of the Cloud Connect Network (CCN) instance associated with the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        public Builder associatedCcnName(String associatedCcnName) {
            this.associatedCcnName = associatedCcnName;
            return this;
        }

        /**
         * <p>The public IP address of the standby Smart Access Gateway device.</p>
         * 
         * <strong>example:</strong>
         * <p>112.XX.XX.27</p>
         */
        public Builder backupBoxControllerIp(String backupBoxControllerIp) {
            this.backupBoxControllerIp = backupBoxControllerIp;
            return this;
        }

        /**
         * <p>The public IP address of the active Smart Access Gateway device.</p>
         * 
         * <strong>example:</strong>
         * <p>112.XX.XX.25</p>
         */
        public Builder boxControllerIp(String boxControllerIp) {
            this.boxControllerIp = boxControllerIp;
            return this;
        }

        /**
         * <p>The private CIDR block of the on-premises network or client that needs to communicate with Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.9.0/24</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The ID of the city where the Smart Access Gateway device is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * <p>The creation timestamp of the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1622617250000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The data plan of the Smart Access Gateway instance. Unit: GB.</p>
         * <blockquote>
         * <p>Currently, only 5 GB of free data traffic is provided per account each month.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder dataPlan(Long dataPlan) {
            this.dataPlan = dataPlan;
            return this;
        }

        /**
         * <p>The description of the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Devices.
         */
        public Builder devices(Devices devices) {
            this.devices = devices;
            return this;
        }

        /**
         * <p>Indicates whether the optimized retransmission feature is enabled for the Smart Access Gateway instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableOptimization(Boolean enableOptimization) {
            this.enableOptimization = enableOptimization;
            return this;
        }

        /**
         * <p>Indicates whether connection log auditing is enabled for the Smart Access Gateway app instance. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enables connection log auditing for the Smart Access Gateway app instance.</p>
         * </li>
         * <li><p><strong>false</strong>: Shutdown connection log auditing for the Smart Access Gateway app instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSoftwareConnectionAudit(Boolean enableSoftwareConnectionAudit) {
            this.enableSoftwareConnectionAudit = enableSoftwareConnectionAudit;
            return this;
        }

        /**
         * <p>The UNIX timestamp when the Smart Access Gateway instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1628265600000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * FlowLogIds.
         */
        public Builder flowLogIds(FlowLogIds flowLogIds) {
            this.flowLogIds = flowLogIds;
            return this;
        }

        /**
         * IRIds.
         */
        public Builder IRIds(IRIds IRIds) {
            this.IRIds = IRIds;
            return this;
        }

        /**
         * <p>The type of the Smart Access Gateway instance. Valid values:</p>
         * <ul>
         * <li><strong>sag-1000</strong>: The instance is a Smart Access Gateway hardware instance and the associated device is a SAG-1000 device.</li>
         * <li><strong>sag-10wm</strong>: The instance is a Smart Access Gateway hardware instance and the associated device is a SAG-100WM device.</li>
         * <li><strong>sag-software</strong>: The instance is a SAG app instance.</li>
         * <li><strong>sag-vcpe</strong>: The instance is a Smart Access Gateway vCPE instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sag-vcpe</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The connection status of the IPsec-VPN. Valid values:</p>
         * <ul>
         * <li><strong>up</strong>: The IPsec-VPN connection is normal.</li>
         * <li><strong>down</strong>: The IPsec-VPN connection is abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>up</p>
         */
        public Builder ipsecStatus(String ipsecStatus) {
            this.ipsecStatus = ipsecStatus;
            return this;
        }

        /**
         * Links.
         */
        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        /**
         * <p>The peak bandwidth of the Smart Access Gateway instance. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50 M</p>
         */
        public Builder maxBandwidth(String maxBandwidth) {
            this.maxBandwidth = maxBandwidth;
            return this;
        }

        /**
         * <p>The name of the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The optimized retransmission type of the Smart Access Gateway instance. After optimized retransmission is enabled, the default value is <strong>fec</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>fec</p>
         */
        public Builder optimizationType(Boolean optimizationType) {
            this.optimizationType = optimizationType;
            return this;
        }

        /**
         * <p>The location of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>shanghai</p>
         */
        public Builder position(String position) {
            this.position = position;
            return this;
        }

        /**
         * QosIds.
         */
        public Builder qosIds(QosIds qosIds) {
            this.qosIds = qosIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F02D092B-A0B7-4BA1-BCA7-014B953C5DC7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The instance ID of the reseller.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-v0fkpk4akfz5******</p>
         */
        public Builder resellerInstanceId(String resellerInstanceId) {
            this.resellerInstanceId = resellerInstanceId;
            return this;
        }

        /**
         * <p>The ID of the reseller account.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        public Builder resellerUid(String resellerUid) {
            this.resellerUid = resellerUid;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the Smart Access Gateway instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2iu4fnc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The on-premises route synchronization method of the Smart Access Gateway instance. Valid values:</p>
         * <ul>
         * <li><strong>static</strong>: Static routing.</li>
         * <li><strong>dynamic</strong>: Dynamic route.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        public Builder routingStrategy(String routingStrategy) {
            this.routingStrategy = routingStrategy;
            return this;
        }

        /**
         * <p>The time threshold for locking the Smart Access Gateway device when it goes offline. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder securityLockThreshold(Integer securityLockThreshold) {
            this.securityLockThreshold = securityLockThreshold;
            return this;
        }

        /**
         * <p>The serial number of the Smart Access Gateway device.</p>
         * 
         * <strong>example:</strong>
         * <p>sage6gsdllbidl****,sage6nniq3d****</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * <p>The instance ID of the Smart Access Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-6z21oj0vjjrx6s****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>The instance status of the Smart Access Gateway. Valid values:</p>
         * <ul>
         * <li><strong>Ordered</strong>: Pending delivery.</li>
         * <li><strong>Delivered</strong>: Delivered. </li>
         * <li><strong>Received</strong>: Activated.</li>
         * <li><strong>Unconfirmed</strong>: Pending confirmation.</li>
         * <li><strong>Active</strong>: Available. </li>
         * <li><strong>Offline</strong>: Offline.</li>
         * <li><strong>Arrearage</strong>: Locked due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The serial number of the Smart Access Gateway device that is currently primarily responsible for traffic transmission.</p>
         * 
         * <strong>example:</strong>
         * <p>sage6nniq3d****</p>
         */
        public Builder trafficMasterSn(String trafficMasterSn) {
            this.trafficMasterSn = trafficMasterSn;
            return this;
        }

        /**
         * <p>The maximum upstream bandwidth over the 4G public network for the Smart Access Gateway device. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder upBandwidth4G(Integer upBandwidth4G) {
            this.upBandwidth4G = upBandwidth4G;
            return this;
        }

        /**
         * <p>The maximum upstream bandwidth of the WAN port for the Smart Access Gateway device. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder upBandwidthWan(Integer upBandwidthWan) {
            this.upBandwidthWan = upBandwidthWan;
            return this;
        }

        /**
         * <p>The number of client accounts for the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder userCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }

        /**
         * <p>The connection status of aliVPN. Valid values:</p>
         * <ul>
         * <li><strong>up</strong>: The aliVPN connection is normal.</li>
         * <li><strong>down</strong>: The aliVPN connection is abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>down</p>
         */
        public Builder vpnStatus(String vpnStatus) {
            this.vpnStatus = vpnStatus;
            return this;
        }

        public DescribeSmartAccessGatewayAttributeResponseBody build() {
            return new DescribeSmartAccessGatewayAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSmartAccessGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayAttributeResponseBody</p>
     */
    public static class AclIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private java.util.List<String> aclId;

        private AclIds(Builder builder) {
            this.aclId = builder.aclId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclIds create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public java.util.List<String> getAclId() {
            return this.aclId;
        }

        public static final class Builder {
            private java.util.List<String> aclId; 

            private Builder() {
            } 

            private Builder(AclIds model) {
                this.aclId = model.aclId;
            } 

            /**
             * AclId.
             */
            public Builder aclId(java.util.List<String> aclId) {
                this.aclId = aclId;
                return this;
            }

            public AclIds build() {
                return new AclIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayAttributeResponseBody</p>
     */
    public static class ApplicationBandwidthPackageOperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
        private String lockReason;

        @com.aliyun.core.annotation.NameInMap("LockType")
        private String lockType;

        private ApplicationBandwidthPackageOperationLocks(Builder builder) {
            this.lockReason = builder.lockReason;
            this.lockType = builder.lockType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationBandwidthPackageOperationLocks create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return lockType
         */
        public String getLockType() {
            return this.lockType;
        }

        public static final class Builder {
            private String lockReason; 
            private String lockType; 

            private Builder() {
            } 

            private Builder(ApplicationBandwidthPackageOperationLocks model) {
                this.lockReason = model.lockReason;
                this.lockType = model.lockType;
            } 

            /**
             * <p>The lock reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Message</p>
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * <p>The lock type. Valid value: <strong>FinancialLocked</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinancialLocked</p>
             */
            public Builder lockType(String lockType) {
                this.lockType = lockType;
                return this;
            }

            public ApplicationBandwidthPackageOperationLocks build() {
                return new ApplicationBandwidthPackageOperationLocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayAttributeResponseBody</p>
     */
    public static class Device extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributeSkStatus")
        private Integer distributeSkStatus;

        @com.aliyun.core.annotation.NameInMap("DpiSignatureDbVersion")
        private String dpiSignatureDbVersion;

        @com.aliyun.core.annotation.NameInMap("HaState")
        private String haState;

        @com.aliyun.core.annotation.NameInMap("HcState")
        private String hcState;

        @com.aliyun.core.annotation.NameInMap("MonitorVersion")
        private String monitorVersion;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("SoftwareVersion")
        private String softwareVersion;

        private Device(Builder builder) {
            this.distributeSkStatus = builder.distributeSkStatus;
            this.dpiSignatureDbVersion = builder.dpiSignatureDbVersion;
            this.haState = builder.haState;
            this.hcState = builder.hcState;
            this.monitorVersion = builder.monitorVersion;
            this.secretKey = builder.secretKey;
            this.serialNumber = builder.serialNumber;
            this.softwareVersion = builder.softwareVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Device create() {
            return builder().build();
        }

        /**
         * @return distributeSkStatus
         */
        public Integer getDistributeSkStatus() {
            return this.distributeSkStatus;
        }

        /**
         * @return dpiSignatureDbVersion
         */
        public String getDpiSignatureDbVersion() {
            return this.dpiSignatureDbVersion;
        }

        /**
         * @return haState
         */
        public String getHaState() {
            return this.haState;
        }

        /**
         * @return hcState
         */
        public String getHcState() {
            return this.hcState;
        }

        /**
         * @return monitorVersion
         */
        public String getMonitorVersion() {
            return this.monitorVersion;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return softwareVersion
         */
        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

        public static final class Builder {
            private Integer distributeSkStatus; 
            private String dpiSignatureDbVersion; 
            private String haState; 
            private String hcState; 
            private String monitorVersion; 
            private String secretKey; 
            private String serialNumber; 
            private String softwareVersion; 

            private Builder() {
            } 

            private Builder(Device model) {
                this.distributeSkStatus = model.distributeSkStatus;
                this.dpiSignatureDbVersion = model.dpiSignatureDbVersion;
                this.haState = model.haState;
                this.hcState = model.hcState;
                this.monitorVersion = model.monitorVersion;
                this.secretKey = model.secretKey;
                this.serialNumber = model.serialNumber;
                this.softwareVersion = model.softwareVersion;
            } 

            /**
             * DistributeSkStatus.
             */
            public Builder distributeSkStatus(Integer distributeSkStatus) {
                this.distributeSkStatus = distributeSkStatus;
                return this;
            }

            /**
             * DpiSignatureDbVersion.
             */
            public Builder dpiSignatureDbVersion(String dpiSignatureDbVersion) {
                this.dpiSignatureDbVersion = dpiSignatureDbVersion;
                return this;
            }

            /**
             * HaState.
             */
            public Builder haState(String haState) {
                this.haState = haState;
                return this;
            }

            /**
             * HcState.
             */
            public Builder hcState(String hcState) {
                this.hcState = hcState;
                return this;
            }

            /**
             * MonitorVersion.
             */
            public Builder monitorVersion(String monitorVersion) {
                this.monitorVersion = monitorVersion;
                return this;
            }

            /**
             * SecretKey.
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The serial number of the Smart Access Gateway device.</p>
             * 
             * <strong>example:</strong>
             * <p>sage6gsdllbidl****,sage6nniq3d****</p>
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * SoftwareVersion.
             */
            public Builder softwareVersion(String softwareVersion) {
                this.softwareVersion = softwareVersion;
                return this;
            }

            public Device build() {
                return new Device(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayAttributeResponseBody</p>
     */
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Device")
        private java.util.List<Device> device;

        private Devices(Builder builder) {
            this.device = builder.device;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return device
         */
        public java.util.List<Device> getDevice() {
            return this.device;
        }

        public static final class Builder {
            private java.util.List<Device> device; 

            private Builder() {
            } 

            private Builder(Devices model) {
                this.device = model.device;
            } 

            /**
             * Device.
             */
            public Builder device(java.util.List<Device> device) {
                this.device = device;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayAttributeResponseBody</p>
     */
    public static class FlowLogIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowLogId")
        private java.util.List<String> flowLogId;

        private FlowLogIds(Builder builder) {
            this.flowLogId = builder.flowLogId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowLogIds create() {
            return builder().build();
        }

        /**
         * @return flowLogId
         */
        public java.util.List<String> getFlowLogId() {
            return this.flowLogId;
        }

        public static final class Builder {
            private java.util.List<String> flowLogId; 

            private Builder() {
            } 

            private Builder(FlowLogIds model) {
                this.flowLogId = model.flowLogId;
            } 

            /**
             * FlowLogId.
             */
            public Builder flowLogId(java.util.List<String> flowLogId) {
                this.flowLogId = flowLogId;
                return this;
            }

            public FlowLogIds build() {
                return new FlowLogIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayAttributeResponseBody</p>
     */
    public static class IRIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IRId")
        private java.util.List<String> IRId;

        private IRIds(Builder builder) {
            this.IRId = builder.IRId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IRIds create() {
            return builder().build();
        }

        /**
         * @return IRId
         */
        public java.util.List<String> getIRId() {
            return this.IRId;
        }

        public static final class Builder {
            private java.util.List<String> IRId; 

            private Builder() {
            } 

            private Builder(IRIds model) {
                this.IRId = model.IRId;
            } 

            /**
             * IRId.
             */
            public Builder IRId(java.util.List<String> IRId) {
                this.IRId = IRId;
                return this;
            }

            public IRIds build() {
                return new IRIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayAttributeResponseBody</p>
     */
    public static class Link extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("CommodityType")
        private String commodityType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTargetIp")
        private String healthCheckTargetIp;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RelateInstanceId")
        private String relateInstanceId;

        @com.aliyun.core.annotation.NameInMap("RelateInstanceRegionId")
        private String relateInstanceRegionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Link(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.commodityType = builder.commodityType;
            this.endTime = builder.endTime;
            this.healthCheckTargetIp = builder.healthCheckTargetIp;
            this.instanceId = builder.instanceId;
            this.relateInstanceId = builder.relateInstanceId;
            this.relateInstanceRegionId = builder.relateInstanceRegionId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Link create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return commodityType
         */
        public String getCommodityType() {
            return this.commodityType;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return healthCheckTargetIp
         */
        public String getHealthCheckTargetIp() {
            return this.healthCheckTargetIp;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return relateInstanceId
         */
        public String getRelateInstanceId() {
            return this.relateInstanceId;
        }

        /**
         * @return relateInstanceRegionId
         */
        public String getRelateInstanceRegionId() {
            return this.relateInstanceRegionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bandwidth; 
            private String commodityType; 
            private Long endTime; 
            private String healthCheckTargetIp; 
            private String instanceId; 
            private String relateInstanceId; 
            private String relateInstanceRegionId; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Link model) {
                this.bandwidth = model.bandwidth;
                this.commodityType = model.commodityType;
                this.endTime = model.endTime;
                this.healthCheckTargetIp = model.healthCheckTargetIp;
                this.instanceId = model.instanceId;
                this.relateInstanceId = model.relateInstanceId;
                this.relateInstanceRegionId = model.relateInstanceRegionId;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * CommodityType.
             */
            public Builder commodityType(String commodityType) {
                this.commodityType = commodityType;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the Smart Access Gateway instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1628265600000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * HealthCheckTargetIp.
             */
            public Builder healthCheckTargetIp(String healthCheckTargetIp) {
                this.healthCheckTargetIp = healthCheckTargetIp;
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
             * RelateInstanceId.
             */
            public Builder relateInstanceId(String relateInstanceId) {
                this.relateInstanceId = relateInstanceId;
                return this;
            }

            /**
             * RelateInstanceRegionId.
             */
            public Builder relateInstanceRegionId(String relateInstanceRegionId) {
                this.relateInstanceRegionId = relateInstanceRegionId;
                return this;
            }

            /**
             * <p>The instance status of the Smart Access Gateway. Valid values:</p>
             * <ul>
             * <li><strong>Ordered</strong>: Pending delivery.</li>
             * <li><strong>Delivered</strong>: Delivered. </li>
             * <li><strong>Received</strong>: Activated.</li>
             * <li><strong>Unconfirmed</strong>: Pending confirmation.</li>
             * <li><strong>Active</strong>: Available. </li>
             * <li><strong>Offline</strong>: Offline.</li>
             * <li><strong>Arrearage</strong>: Locked due to overdue payments.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Link build() {
                return new Link(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayAttributeResponseBody</p>
     */
    public static class Links extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Link")
        private java.util.List<Link> link;

        private Links(Builder builder) {
            this.link = builder.link;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Links create() {
            return builder().build();
        }

        /**
         * @return link
         */
        public java.util.List<Link> getLink() {
            return this.link;
        }

        public static final class Builder {
            private java.util.List<Link> link; 

            private Builder() {
            } 

            private Builder(Links model) {
                this.link = model.link;
            } 

            /**
             * Link.
             */
            public Builder link(java.util.List<Link> link) {
                this.link = link;
                return this;
            }

            public Links build() {
                return new Links(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewayAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayAttributeResponseBody</p>
     */
    public static class QosIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QosId")
        private java.util.List<String> qosId;

        private QosIds(Builder builder) {
            this.qosId = builder.qosId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QosIds create() {
            return builder().build();
        }

        /**
         * @return qosId
         */
        public java.util.List<String> getQosId() {
            return this.qosId;
        }

        public static final class Builder {
            private java.util.List<String> qosId; 

            private Builder() {
            } 

            private Builder(QosIds model) {
                this.qosId = model.qosId;
            } 

            /**
             * QosId.
             */
            public Builder qosId(java.util.List<String> qosId) {
                this.qosId = qosId;
                return this;
            }

            public QosIds build() {
                return new QosIds(this);
            } 

        } 

    }
}
