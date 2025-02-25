// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetLindormV2InstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormV2InstanceResponseBody</p>
 */
public class GetLindormV2InstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.NameInMap("ColdStorage")
    private Integer coldStorage;

    @com.aliyun.core.annotation.NameInMap("CreateMilliseconds")
    private Long createMilliseconds;

    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private String deletionProtection;

    @com.aliyun.core.annotation.NameInMap("DiskCategory")
    private String diskCategory;

    @com.aliyun.core.annotation.NameInMap("DiskThreshold")
    private String diskThreshold;

    @com.aliyun.core.annotation.NameInMap("DiskUsage")
    private String diskUsage;

    @com.aliyun.core.annotation.NameInMap("EnableCompute")
    private Boolean enableCompute;

    @com.aliyun.core.annotation.NameInMap("EngineList")
    private java.util.List<EngineList> engineList;

    @com.aliyun.core.annotation.NameInMap("ExpiredMilliseconds")
    private Long expiredMilliseconds;

    @com.aliyun.core.annotation.NameInMap("InitialRootPassword")
    private String initialRootPassword;

    @com.aliyun.core.annotation.NameInMap("InstanceAlias")
    private String instanceAlias;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
    private String maintainStartTime;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("StorageUsage")
    private StorageUsage storageUsage;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("VswitchId")
    private String vswitchId;

    @com.aliyun.core.annotation.NameInMap("WhiteIpList")
    private java.util.List<WhiteIpList> whiteIpList;

    @com.aliyun.core.annotation.NameInMap("ZoneEngineInfoMap")
    private java.util.Map<String, ?> zoneEngineInfoMap;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private GetLindormV2InstanceResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.autoRenew = builder.autoRenew;
        this.coldStorage = builder.coldStorage;
        this.createMilliseconds = builder.createMilliseconds;
        this.deletionProtection = builder.deletionProtection;
        this.diskCategory = builder.diskCategory;
        this.diskThreshold = builder.diskThreshold;
        this.diskUsage = builder.diskUsage;
        this.enableCompute = builder.enableCompute;
        this.engineList = builder.engineList;
        this.expiredMilliseconds = builder.expiredMilliseconds;
        this.initialRootPassword = builder.initialRootPassword;
        this.instanceAlias = builder.instanceAlias;
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
        this.instanceType = builder.instanceType;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.networkType = builder.networkType;
        this.payType = builder.payType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceType = builder.serviceType;
        this.storageUsage = builder.storageUsage;
        this.vpcId = builder.vpcId;
        this.vswitchId = builder.vswitchId;
        this.whiteIpList = builder.whiteIpList;
        this.zoneEngineInfoMap = builder.zoneEngineInfoMap;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLindormV2InstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return coldStorage
     */
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    /**
     * @return createMilliseconds
     */
    public Long getCreateMilliseconds() {
        return this.createMilliseconds;
    }

    /**
     * @return deletionProtection
     */
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return diskThreshold
     */
    public String getDiskThreshold() {
        return this.diskThreshold;
    }

    /**
     * @return diskUsage
     */
    public String getDiskUsage() {
        return this.diskUsage;
    }

    /**
     * @return enableCompute
     */
    public Boolean getEnableCompute() {
        return this.enableCompute;
    }

    /**
     * @return engineList
     */
    public java.util.List<EngineList> getEngineList() {
        return this.engineList;
    }

    /**
     * @return expiredMilliseconds
     */
    public Long getExpiredMilliseconds() {
        return this.expiredMilliseconds;
    }

    /**
     * @return initialRootPassword
     */
    public String getInitialRootPassword() {
        return this.initialRootPassword;
    }

    /**
     * @return instanceAlias
     */
    public String getInstanceAlias() {
        return this.instanceAlias;
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return maintainEndTime
     */
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return storageUsage
     */
    public StorageUsage getStorageUsage() {
        return this.storageUsage;
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
     * @return whiteIpList
     */
    public java.util.List<WhiteIpList> getWhiteIpList() {
        return this.whiteIpList;
    }

    /**
     * @return zoneEngineInfoMap
     */
    public java.util.Map<String, ?> getZoneEngineInfoMap() {
        return this.zoneEngineInfoMap;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Long aliUid; 
        private Boolean autoRenew; 
        private Integer coldStorage; 
        private Long createMilliseconds; 
        private String deletionProtection; 
        private String diskCategory; 
        private String diskThreshold; 
        private String diskUsage; 
        private Boolean enableCompute; 
        private java.util.List<EngineList> engineList; 
        private Long expiredMilliseconds; 
        private String initialRootPassword; 
        private String instanceAlias; 
        private String instanceId; 
        private String instanceStatus; 
        private String instanceType; 
        private String maintainEndTime; 
        private String maintainStartTime; 
        private String networkType; 
        private String payType; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String serviceType; 
        private StorageUsage storageUsage; 
        private String vpcId; 
        private String vswitchId; 
        private java.util.List<WhiteIpList> whiteIpList; 
        private java.util.Map<String, ?> zoneEngineInfoMap; 
        private String zoneId; 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * ColdStorage.
         */
        public Builder coldStorage(Integer coldStorage) {
            this.coldStorage = coldStorage;
            return this;
        }

        /**
         * CreateMilliseconds.
         */
        public Builder createMilliseconds(Long createMilliseconds) {
            this.createMilliseconds = createMilliseconds;
            return this;
        }

        /**
         * DeletionProtection.
         */
        public Builder deletionProtection(String deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * DiskCategory.
         */
        public Builder diskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * DiskThreshold.
         */
        public Builder diskThreshold(String diskThreshold) {
            this.diskThreshold = diskThreshold;
            return this;
        }

        /**
         * DiskUsage.
         */
        public Builder diskUsage(String diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }

        /**
         * EnableCompute.
         */
        public Builder enableCompute(Boolean enableCompute) {
            this.enableCompute = enableCompute;
            return this;
        }

        /**
         * EngineList.
         */
        public Builder engineList(java.util.List<EngineList> engineList) {
            this.engineList = engineList;
            return this;
        }

        /**
         * ExpiredMilliseconds.
         */
        public Builder expiredMilliseconds(Long expiredMilliseconds) {
            this.expiredMilliseconds = expiredMilliseconds;
            return this;
        }

        /**
         * InitialRootPassword.
         */
        public Builder initialRootPassword(String initialRootPassword) {
            this.initialRootPassword = initialRootPassword;
            return this;
        }

        /**
         * InstanceAlias.
         */
        public Builder instanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
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
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * MaintainEndTime.
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * MaintainStartTime.
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * StorageUsage.
         */
        public Builder storageUsage(StorageUsage storageUsage) {
            this.storageUsage = storageUsage;
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
         * WhiteIpList.
         */
        public Builder whiteIpList(java.util.List<WhiteIpList> whiteIpList) {
            this.whiteIpList = whiteIpList;
            return this;
        }

        /**
         * ZoneEngineInfoMap.
         */
        public Builder zoneEngineInfoMap(java.util.Map<String, ?> zoneEngineInfoMap) {
            this.zoneEngineInfoMap = zoneEngineInfoMap;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public GetLindormV2InstanceResponseBody build() {
            return new GetLindormV2InstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLindormV2InstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormV2InstanceResponseBody</p>
     */
    public static class ConnectAddressList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ConnectAddressList(Builder builder) {
            this.address = builder.address;
            this.port = builder.port;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectAddressList create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String address; 
            private String port; 
            private String type; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ConnectAddressList build() {
                return new ConnectAddressList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLindormV2InstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormV2InstanceResponseBody</p>
     */
    public static class NodeGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("EnableAttachLocalDisk")
        private Boolean enableAttachLocalDisk;

        @com.aliyun.core.annotation.NameInMap("LocalDiskCapacity")
        private Long localDiskCapacity;

        @com.aliyun.core.annotation.NameInMap("LocalDiskCategory")
        private String localDiskCategory;

        @com.aliyun.core.annotation.NameInMap("MemorySizeGiB")
        private Integer memorySizeGiB;

        @com.aliyun.core.annotation.NameInMap("NodeSpec")
        private String nodeSpec;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("SpecId")
        private String specId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private NodeGroup(Builder builder) {
            this.category = builder.category;
            this.cpuCoreCount = builder.cpuCoreCount;
            this.enableAttachLocalDisk = builder.enableAttachLocalDisk;
            this.localDiskCapacity = builder.localDiskCapacity;
            this.localDiskCategory = builder.localDiskCategory;
            this.memorySizeGiB = builder.memorySizeGiB;
            this.nodeSpec = builder.nodeSpec;
            this.quantity = builder.quantity;
            this.resourceGroupName = builder.resourceGroupName;
            this.specId = builder.specId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeGroup create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return cpuCoreCount
         */
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        /**
         * @return enableAttachLocalDisk
         */
        public Boolean getEnableAttachLocalDisk() {
            return this.enableAttachLocalDisk;
        }

        /**
         * @return localDiskCapacity
         */
        public Long getLocalDiskCapacity() {
            return this.localDiskCapacity;
        }

        /**
         * @return localDiskCategory
         */
        public String getLocalDiskCategory() {
            return this.localDiskCategory;
        }

        /**
         * @return memorySizeGiB
         */
        public Integer getMemorySizeGiB() {
            return this.memorySizeGiB;
        }

        /**
         * @return nodeSpec
         */
        public String getNodeSpec() {
            return this.nodeSpec;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return specId
         */
        public String getSpecId() {
            return this.specId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String category; 
            private Integer cpuCoreCount; 
            private Boolean enableAttachLocalDisk; 
            private Long localDiskCapacity; 
            private String localDiskCategory; 
            private Integer memorySizeGiB; 
            private String nodeSpec; 
            private Integer quantity; 
            private String resourceGroupName; 
            private String specId; 
            private String status; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CpuCoreCount.
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * EnableAttachLocalDisk.
             */
            public Builder enableAttachLocalDisk(Boolean enableAttachLocalDisk) {
                this.enableAttachLocalDisk = enableAttachLocalDisk;
                return this;
            }

            /**
             * LocalDiskCapacity.
             */
            public Builder localDiskCapacity(Long localDiskCapacity) {
                this.localDiskCapacity = localDiskCapacity;
                return this;
            }

            /**
             * LocalDiskCategory.
             */
            public Builder localDiskCategory(String localDiskCategory) {
                this.localDiskCategory = localDiskCategory;
                return this;
            }

            /**
             * MemorySizeGiB.
             */
            public Builder memorySizeGiB(Integer memorySizeGiB) {
                this.memorySizeGiB = memorySizeGiB;
                return this;
            }

            /**
             * NodeSpec.
             */
            public Builder nodeSpec(String nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * ResourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * SpecId.
             */
            public Builder specId(String specId) {
                this.specId = specId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NodeGroup build() {
                return new NodeGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLindormV2InstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormV2InstanceResponseBody</p>
     */
    public static class EngineList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectAddressList")
        private java.util.List<ConnectAddressList> connectAddressList;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("IsLastVersion")
        private Boolean isLastVersion;

        @com.aliyun.core.annotation.NameInMap("LatestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("NodeGroup")
        private java.util.List<NodeGroup> nodeGroup;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private EngineList(Builder builder) {
            this.connectAddressList = builder.connectAddressList;
            this.engine = builder.engine;
            this.isLastVersion = builder.isLastVersion;
            this.latestVersion = builder.latestVersion;
            this.nodeGroup = builder.nodeGroup;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineList create() {
            return builder().build();
        }

        /**
         * @return connectAddressList
         */
        public java.util.List<ConnectAddressList> getConnectAddressList() {
            return this.connectAddressList;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return isLastVersion
         */
        public Boolean getIsLastVersion() {
            return this.isLastVersion;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return nodeGroup
         */
        public java.util.List<NodeGroup> getNodeGroup() {
            return this.nodeGroup;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List<ConnectAddressList> connectAddressList; 
            private String engine; 
            private Boolean isLastVersion; 
            private String latestVersion; 
            private java.util.List<NodeGroup> nodeGroup; 
            private String version; 

            /**
             * ConnectAddressList.
             */
            public Builder connectAddressList(java.util.List<ConnectAddressList> connectAddressList) {
                this.connectAddressList = connectAddressList;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * IsLastVersion.
             */
            public Builder isLastVersion(Boolean isLastVersion) {
                this.isLastVersion = isLastVersion;
                return this;
            }

            /**
             * LatestVersion.
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * NodeGroup.
             */
            public Builder nodeGroup(java.util.List<NodeGroup> nodeGroup) {
                this.nodeGroup = nodeGroup;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public EngineList build() {
                return new EngineList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLindormV2InstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormV2InstanceResponseBody</p>
     */
    public static class StorageUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityByDiskCategory")
        private java.util.List<java.util.Map<String, ?>> capacityByDiskCategory;

        @com.aliyun.core.annotation.NameInMap("EngineUsage")
        private java.util.Map<String, ?> engineUsage;

        private StorageUsage(Builder builder) {
            this.capacityByDiskCategory = builder.capacityByDiskCategory;
            this.engineUsage = builder.engineUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageUsage create() {
            return builder().build();
        }

        /**
         * @return capacityByDiskCategory
         */
        public java.util.List<java.util.Map<String, ?>> getCapacityByDiskCategory() {
            return this.capacityByDiskCategory;
        }

        /**
         * @return engineUsage
         */
        public java.util.Map<String, ?> getEngineUsage() {
            return this.engineUsage;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> capacityByDiskCategory; 
            private java.util.Map<String, ?> engineUsage; 

            /**
             * CapacityByDiskCategory.
             */
            public Builder capacityByDiskCategory(java.util.List<java.util.Map<String, ?>> capacityByDiskCategory) {
                this.capacityByDiskCategory = capacityByDiskCategory;
                return this;
            }

            /**
             * EngineUsage.
             */
            public Builder engineUsage(java.util.Map<String, ?> engineUsage) {
                this.engineUsage = engineUsage;
                return this;
            }

            public StorageUsage build() {
                return new StorageUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLindormV2InstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormV2InstanceResponseBody</p>
     */
    public static class WhiteIpList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IpList")
        private String ipList;

        private WhiteIpList(Builder builder) {
            this.groupName = builder.groupName;
            this.ipList = builder.ipList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteIpList create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ipList
         */
        public String getIpList() {
            return this.ipList;
        }

        public static final class Builder {
            private String groupName; 
            private String ipList; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * IpList.
             */
            public Builder ipList(String ipList) {
                this.ipList = ipList;
                return this;
            }

            public WhiteIpList build() {
                return new WhiteIpList(this);
            } 

        } 

    }
}
