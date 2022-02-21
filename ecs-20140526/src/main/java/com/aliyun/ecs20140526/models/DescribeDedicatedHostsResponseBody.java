// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostsResponseBody</p>
 */
public class DescribeDedicatedHostsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("DedicatedHosts")
    private DedicatedHosts dedicatedHosts;

    private DescribeDedicatedHostsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.dedicatedHosts = builder.dedicatedHosts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return dedicatedHosts
     */
    public DedicatedHosts getDedicatedHosts() {
        return this.dedicatedHosts;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private DedicatedHosts dedicatedHosts; 

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Proprietary Host List page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Proprietary host total number.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Proprietary host more information collection.
         */
        public Builder dedicatedHosts(DedicatedHosts dedicatedHosts) {
            this.dedicatedHosts = dedicatedHosts;
            return this;
        }

        public DescribeDedicatedHostsResponseBody build() {
            return new DescribeDedicatedHostsResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceId")
        private String instanceId;

        private Instance(Builder builder) {
            this.instanceType = builder.instanceType;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceType; 
            private String instanceId; 

            /**
             * Proprietary host created ECS instance dimension information.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Proprietary host created ECS instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

        private Instances(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class OperationLock extends TeaModel {
        @NameInMap("LockReason")
        private String lockReason;

        private OperationLock(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLock create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockReason; 

            /**
             * The reason why the dedicated host is locked. Possible values:
             * <p>
             * -financial: locked due to overdue payments.
             * -security: locked for security reasons.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLock build() {
                return new OperationLock(this);
            } 

        } 

    }
    public static class OperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        private java.util.List < OperationLock> operationLock;

        private OperationLocks(Builder builder) {
            this.operationLock = builder.operationLock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return operationLock
         */
        public java.util.List < OperationLock> getOperationLock() {
            return this.operationLock;
        }

        public static final class Builder {
            private java.util.List < OperationLock> operationLock; 

            /**
             * OperationLock.
             */
            public Builder operationLock(java.util.List < OperationLock> operationLock) {
                this.operationLock = operationLock;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagKey")
        private String tagKey;

        private Tag(Builder builder) {
            this.tagValue = builder.tagValue;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String tagValue; 
            private String tagKey; 

            /**
             * Proprietary the host label value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * Proprietary the host label key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class SupportedInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportedInstanceTypeFamily")
        private java.util.List < String > supportedInstanceTypeFamily;

        private SupportedInstanceTypeFamilies(Builder builder) {
            this.supportedInstanceTypeFamily = builder.supportedInstanceTypeFamily;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedInstanceTypeFamilies create() {
            return builder().build();
        }

        /**
         * @return supportedInstanceTypeFamily
         */
        public java.util.List < String > getSupportedInstanceTypeFamily() {
            return this.supportedInstanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List < String > supportedInstanceTypeFamily; 

            /**
             * SupportedInstanceTypeFamily.
             */
            public Builder supportedInstanceTypeFamily(java.util.List < String > supportedInstanceTypeFamily) {
                this.supportedInstanceTypeFamily = supportedInstanceTypeFamily;
                return this;
            }

            public SupportedInstanceTypeFamilies build() {
                return new SupportedInstanceTypeFamilies(this);
            } 

        } 

    }
    public static class SupportedCustomInstanceTypeFamilies extends TeaModel {
        @NameInMap("SupportedCustomInstanceTypeFamily")
        private java.util.List < String > supportedCustomInstanceTypeFamily;

        private SupportedCustomInstanceTypeFamilies(Builder builder) {
            this.supportedCustomInstanceTypeFamily = builder.supportedCustomInstanceTypeFamily;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedCustomInstanceTypeFamilies create() {
            return builder().build();
        }

        /**
         * @return supportedCustomInstanceTypeFamily
         */
        public java.util.List < String > getSupportedCustomInstanceTypeFamily() {
            return this.supportedCustomInstanceTypeFamily;
        }

        public static final class Builder {
            private java.util.List < String > supportedCustomInstanceTypeFamily; 

            /**
             * SupportedCustomInstanceTypeFamily.
             */
            public Builder supportedCustomInstanceTypeFamily(java.util.List < String > supportedCustomInstanceTypeFamily) {
                this.supportedCustomInstanceTypeFamily = supportedCustomInstanceTypeFamily;
                return this;
            }

            public SupportedCustomInstanceTypeFamilies build() {
                return new SupportedCustomInstanceTypeFamilies(this);
            } 

        } 

    }
    public static class SupportedInstanceTypesList extends TeaModel {
        @NameInMap("SupportedInstanceTypesList")
        private java.util.List < String > supportedInstanceTypesList;

        private SupportedInstanceTypesList(Builder builder) {
            this.supportedInstanceTypesList = builder.supportedInstanceTypesList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedInstanceTypesList create() {
            return builder().build();
        }

        /**
         * @return supportedInstanceTypesList
         */
        public java.util.List < String > getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        public static final class Builder {
            private java.util.List < String > supportedInstanceTypesList; 

            /**
             * SupportedInstanceTypesList.
             */
            public Builder supportedInstanceTypesList(java.util.List < String > supportedInstanceTypesList) {
                this.supportedInstanceTypesList = supportedInstanceTypesList;
                return this;
            }

            public SupportedInstanceTypesList build() {
                return new SupportedInstanceTypesList(this);
            } 

        } 

    }
    public static class Capacity extends TeaModel {
        @NameInMap("AvailableMemory")
        private Float availableMemory;

        @NameInMap("LocalStorageCategory")
        private String localStorageCategory;

        @NameInMap("TotalMemory")
        private Float totalMemory;

        @NameInMap("TotalLocalStorage")
        private Integer totalLocalStorage;

        @NameInMap("TotalVcpus")
        private Integer totalVcpus;

        @NameInMap("TotalVgpus")
        private Integer totalVgpus;

        @NameInMap("AvailableLocalStorage")
        private Integer availableLocalStorage;

        @NameInMap("AvailableVcpus")
        private Integer availableVcpus;

        @NameInMap("AvailableVgpus")
        private Integer availableVgpus;

        private Capacity(Builder builder) {
            this.availableMemory = builder.availableMemory;
            this.localStorageCategory = builder.localStorageCategory;
            this.totalMemory = builder.totalMemory;
            this.totalLocalStorage = builder.totalLocalStorage;
            this.totalVcpus = builder.totalVcpus;
            this.totalVgpus = builder.totalVgpus;
            this.availableLocalStorage = builder.availableLocalStorage;
            this.availableVcpus = builder.availableVcpus;
            this.availableVgpus = builder.availableVgpus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capacity create() {
            return builder().build();
        }

        /**
         * @return availableMemory
         */
        public Float getAvailableMemory() {
            return this.availableMemory;
        }

        /**
         * @return localStorageCategory
         */
        public String getLocalStorageCategory() {
            return this.localStorageCategory;
        }

        /**
         * @return totalMemory
         */
        public Float getTotalMemory() {
            return this.totalMemory;
        }

        /**
         * @return totalLocalStorage
         */
        public Integer getTotalLocalStorage() {
            return this.totalLocalStorage;
        }

        /**
         * @return totalVcpus
         */
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        /**
         * @return totalVgpus
         */
        public Integer getTotalVgpus() {
            return this.totalVgpus;
        }

        /**
         * @return availableLocalStorage
         */
        public Integer getAvailableLocalStorage() {
            return this.availableLocalStorage;
        }

        /**
         * @return availableVcpus
         */
        public Integer getAvailableVcpus() {
            return this.availableVcpus;
        }

        /**
         * @return availableVgpus
         */
        public Integer getAvailableVgpus() {
            return this.availableVgpus;
        }

        public static final class Builder {
            private Float availableMemory; 
            private String localStorageCategory; 
            private Float totalMemory; 
            private Integer totalLocalStorage; 
            private Integer totalVcpus; 
            private Integer totalVgpus; 
            private Integer availableLocalStorage; 
            private Integer availableVcpus; 
            private Integer availableVgpus; 

            /**
             * The remaining memory capacity. Unit: GiB.
             */
            public Builder availableMemory(Float availableMemory) {
                this.availableMemory = availableMemory;
                return this;
            }

            /**
             * The type of the local disk.
             */
            public Builder localStorageCategory(String localStorageCategory) {
                this.localStorageCategory = localStorageCategory;
                return this;
            }

            /**
             * Memory, unit: GiB.
             */
            public Builder totalMemory(Float totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * Local disk total capacity, unit: GiB.
             */
            public Builder totalLocalStorage(Integer totalLocalStorage) {
                this.totalLocalStorage = totalLocalStorage;
                return this;
            }

            /**
             * VCPUs total audit.
             */
            public Builder totalVcpus(Integer totalVcpus) {
                this.totalVcpus = totalVcpus;
                return this;
            }

            /**
             * Total virtual GPU quantity.
             */
            public Builder totalVgpus(Integer totalVgpus) {
                this.totalVgpus = totalVgpus;
                return this;
            }

            /**
             * The remaining local disk capacity. Unit: GiB.
             */
            public Builder availableLocalStorage(Integer availableLocalStorage) {
                this.availableLocalStorage = availableLocalStorage;
                return this;
            }

            /**
             * The number of remaining vCPU cores.
             */
            public Builder availableVcpus(Integer availableVcpus) {
                this.availableVcpus = availableVcpus;
                return this;
            }

            /**
             * Available virtual number of GPUS.
             */
            public Builder availableVgpus(Integer availableVgpus) {
                this.availableVgpus = availableVgpus;
                return this;
            }

            public Capacity build() {
                return new Capacity(this);
            } 

        } 

    }
    public static class NetworkAttributes extends TeaModel {
        @NameInMap("UdpTimeout")
        private Integer udpTimeout;

        @NameInMap("SlbUdpTimeout")
        private Integer slbUdpTimeout;

        private NetworkAttributes(Builder builder) {
            this.udpTimeout = builder.udpTimeout;
            this.slbUdpTimeout = builder.slbUdpTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAttributes create() {
            return builder().build();
        }

        /**
         * @return udpTimeout
         */
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

        /**
         * @return slbUdpTimeout
         */
        public Integer getSlbUdpTimeout() {
            return this.slbUdpTimeout;
        }

        public static final class Builder {
            private Integer udpTimeout; 
            private Integer slbUdpTimeout; 

            /**
             * UDP timeout time.
             */
            public Builder udpTimeout(Integer udpTimeout) {
                this.udpTimeout = udpTimeout;
                return this;
            }

            /**
             * SLB UDP timeout.
             */
            public Builder slbUdpTimeout(Integer slbUdpTimeout) {
                this.slbUdpTimeout = slbUdpTimeout;
                return this;
            }

            public NetworkAttributes build() {
                return new NetworkAttributes(this);
            } 

        } 

    }
    public static class HostDetailInfo extends TeaModel {
        @NameInMap("SerialNumber")
        private String serialNumber;

        private HostDetailInfo(Builder builder) {
            this.serialNumber = builder.serialNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostDetailInfo create() {
            return builder().build();
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public static final class Builder {
            private String serialNumber; 

            /**
             * This parameter will be removed soon. We recommend that you use other parameters to improve compatibility.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            public HostDetailInfo build() {
                return new HostDetailInfo(this);
            } 

        } 

    }
    public static class DedicatedHost extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("AutoPlacement")
        private String autoPlacement;

        @NameInMap("GPUSpec")
        private String GPUSpec;

        @NameInMap("AutoReleaseTime")
        private String autoReleaseTime;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CpuOverCommitRatio")
        private Float cpuOverCommitRatio;

        @NameInMap("ActionOnMaintenance")
        private String actionOnMaintenance;

        @NameInMap("SaleCycle")
        private String saleCycle;

        @NameInMap("PhysicalGpus")
        private Integer physicalGpus;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("DedicatedHostName")
        private String dedicatedHostName;

        @NameInMap("Description")
        private String description;

        @NameInMap("DedicatedHostClusterId")
        private String dedicatedHostClusterId;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("DedicatedHostType")
        private String dedicatedHostType;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @NameInMap("Sockets")
        private Integer sockets;

        @NameInMap("MachineId")
        private String machineId;

        @NameInMap("Instances")
        private Instances instances;

        @NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("SupportedInstanceTypeFamilies")
        private SupportedInstanceTypeFamilies supportedInstanceTypeFamilies;

        @NameInMap("SupportedCustomInstanceTypeFamilies")
        private SupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies;

        @NameInMap("SupportedInstanceTypesList")
        private SupportedInstanceTypesList supportedInstanceTypesList;

        @NameInMap("Capacity")
        private Capacity capacity;

        @NameInMap("NetworkAttributes")
        private NetworkAttributes networkAttributes;

        @NameInMap("HostDetailInfo")
        private HostDetailInfo hostDetailInfo;

        private DedicatedHost(Builder builder) {
            this.creationTime = builder.creationTime;
            this.status = builder.status;
            this.cores = builder.cores;
            this.autoPlacement = builder.autoPlacement;
            this.GPUSpec = builder.GPUSpec;
            this.autoReleaseTime = builder.autoReleaseTime;
            this.chargeType = builder.chargeType;
            this.cpuOverCommitRatio = builder.cpuOverCommitRatio;
            this.actionOnMaintenance = builder.actionOnMaintenance;
            this.saleCycle = builder.saleCycle;
            this.physicalGpus = builder.physicalGpus;
            this.regionId = builder.regionId;
            this.dedicatedHostName = builder.dedicatedHostName;
            this.description = builder.description;
            this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
            this.expiredTime = builder.expiredTime;
            this.dedicatedHostType = builder.dedicatedHostType;
            this.resourceGroupId = builder.resourceGroupId;
            this.zoneId = builder.zoneId;
            this.dedicatedHostId = builder.dedicatedHostId;
            this.sockets = builder.sockets;
            this.machineId = builder.machineId;
            this.instances = builder.instances;
            this.operationLocks = builder.operationLocks;
            this.tags = builder.tags;
            this.supportedInstanceTypeFamilies = builder.supportedInstanceTypeFamilies;
            this.supportedCustomInstanceTypeFamilies = builder.supportedCustomInstanceTypeFamilies;
            this.supportedInstanceTypesList = builder.supportedInstanceTypesList;
            this.capacity = builder.capacity;
            this.networkAttributes = builder.networkAttributes;
            this.hostDetailInfo = builder.hostDetailInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHost create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return cores
         */
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return autoPlacement
         */
        public String getAutoPlacement() {
            return this.autoPlacement;
        }

        /**
         * @return GPUSpec
         */
        public String getGPUSpec() {
            return this.GPUSpec;
        }

        /**
         * @return autoReleaseTime
         */
        public String getAutoReleaseTime() {
            return this.autoReleaseTime;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return cpuOverCommitRatio
         */
        public Float getCpuOverCommitRatio() {
            return this.cpuOverCommitRatio;
        }

        /**
         * @return actionOnMaintenance
         */
        public String getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

        /**
         * @return saleCycle
         */
        public String getSaleCycle() {
            return this.saleCycle;
        }

        /**
         * @return physicalGpus
         */
        public Integer getPhysicalGpus() {
            return this.physicalGpus;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return dedicatedHostName
         */
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dedicatedHostClusterId
         */
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return dedicatedHostType
         */
        public String getDedicatedHostType() {
            return this.dedicatedHostType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        /**
         * @return sockets
         */
        public Integer getSockets() {
            return this.sockets;
        }

        /**
         * @return machineId
         */
        public String getMachineId() {
            return this.machineId;
        }

        /**
         * @return instances
         */
        public Instances getInstances() {
            return this.instances;
        }

        /**
         * @return operationLocks
         */
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return supportedInstanceTypeFamilies
         */
        public SupportedInstanceTypeFamilies getSupportedInstanceTypeFamilies() {
            return this.supportedInstanceTypeFamilies;
        }

        /**
         * @return supportedCustomInstanceTypeFamilies
         */
        public SupportedCustomInstanceTypeFamilies getSupportedCustomInstanceTypeFamilies() {
            return this.supportedCustomInstanceTypeFamilies;
        }

        /**
         * @return supportedInstanceTypesList
         */
        public SupportedInstanceTypesList getSupportedInstanceTypesList() {
            return this.supportedInstanceTypesList;
        }

        /**
         * @return capacity
         */
        public Capacity getCapacity() {
            return this.capacity;
        }

        /**
         * @return networkAttributes
         */
        public NetworkAttributes getNetworkAttributes() {
            return this.networkAttributes;
        }

        /**
         * @return hostDetailInfo
         */
        public HostDetailInfo getHostDetailInfo() {
            return this.hostDetailInfo;
        }

        public static final class Builder {
            private String creationTime; 
            private String status; 
            private Integer cores; 
            private String autoPlacement; 
            private String GPUSpec; 
            private String autoReleaseTime; 
            private String chargeType; 
            private Float cpuOverCommitRatio; 
            private String actionOnMaintenance; 
            private String saleCycle; 
            private Integer physicalGpus; 
            private String regionId; 
            private String dedicatedHostName; 
            private String description; 
            private String dedicatedHostClusterId; 
            private String expiredTime; 
            private String dedicatedHostType; 
            private String resourceGroupId; 
            private String zoneId; 
            private String dedicatedHostId; 
            private Integer sockets; 
            private String machineId; 
            private Instances instances; 
            private OperationLocks operationLocks; 
            private Tags tags; 
            private SupportedInstanceTypeFamilies supportedInstanceTypeFamilies; 
            private SupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies; 
            private SupportedInstanceTypesList supportedInstanceTypesList; 
            private Capacity capacity; 
            private NetworkAttributes networkAttributes; 
            private HostDetailInfo hostDetailInfo; 

            /**
             * The time when the dedicated host was created. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is "yyyy-MM-ddTHH:mmZ ".
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The status of the dedicated host. Possible values:
             * <p>
             * 
             * -Available: running. The running status of the dedicated host.
             * 
             * -UnderAssessment: a physical machine is at risk, that is, the latency of a failure. The physical machine is in the available state, but may cause problems with ECS instances on the dedicated host.
             * 
             * -PermanentFailure: fault. The dedicated host is unavailable due to a permanent failure.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The number of cores per CPU.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * Indicates whether the dedicated host is added to the automatic deployment resource pool. Valid values:
             * <p>
             * 
             * -on: added to the automatic deployment resource pool.
             * 
             * -off: does not join the automatic deployment resource pool.
             * 
             * For more information about automatic deployment, see [automatic deployment features](~~ 118938 ~~).
             */
            public Builder autoPlacement(String autoPlacement) {
                this.autoPlacement = autoPlacement;
                return this;
            }

            /**
             * The GPU model.
             */
            public Builder GPUSpec(String GPUSpec) {
                this.GPUSpec = GPUSpec;
                return this;
            }

            /**
             * The automatic release time. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is "yyyy-MM-ddTHH:mmZ ".
             */
            public Builder autoReleaseTime(String autoReleaseTime) {
                this.autoReleaseTime = autoReleaseTime;
                return this;
            }

            /**
             * The billing method of the dedicated host.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CPU oversold ratio.
             */
            public Builder cpuOverCommitRatio(Float cpuOverCommitRatio) {
                this.cpuOverCommitRatio = cpuOverCommitRatio;
                return this;
            }

            /**
             * When a dedicated host fails or is repaired online, you can configure a migration solution for the host. Valid values:
             * <p>
             * 
             * -Migrate: Migrate the instance to another physical machine and restart the instance.
             * 
             * Default: Migrate (when proprietary host Mount cloud storage)
             * 
             * -Stop: Stop the instance on the current DDH. After confirming that the DDH cannot be repaired, migrate the instance to another physical machine and restart the instance.
             * 
             * Default: Stop (when proprietary host mount local disk storage)
             */
            public Builder actionOnMaintenance(String actionOnMaintenance) {
                this.actionOnMaintenance = actionOnMaintenance;
                return this;
            }

            /**
             * Subscription unit. Possible values:
             * <p>
             * -Month
             * -Year
             */
            public Builder saleCycle(String saleCycle) {
                this.saleCycle = saleCycle;
                return this;
            }

            /**
             * The number of physical GPUs.
             */
            public Builder physicalGpus(Integer physicalGpus) {
                this.physicalGpus = physicalGpus;
                return this;
            }

            /**
             * The region ID of the dedicated host.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the dedicated host.
             */
            public Builder dedicatedHostName(String dedicatedHostName) {
                this.dedicatedHostName = dedicatedHostName;
                return this;
            }

            /**
             * The description of the dedicated host.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the DDH cluster to which the DDH belongs.
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

            /**
             * The expiration time of the dedicated host. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is "yyyy-MM-ddTHH:mmZ ".
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The type of the dedicated host.
             */
            public Builder dedicatedHostType(String dedicatedHostType) {
                this.dedicatedHostType = dedicatedHostType;
                return this;
            }

            /**
             * The ID of the resource group to which the DDH belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The ID of the dedicated host.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * The number of physical processors.
             */
            public Builder sockets(Integer sockets) {
                this.sockets = sockets;
                return this;
            }

            /**
             * The machine code of the dedicated host.
             */
            public Builder machineId(String machineId) {
                this.machineId = machineId;
                return this;
            }

            /**
             * The ECS instance created on the DDH.
             */
            public Builder instances(Instances instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The reason why the DDH resource is locked.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * The tag of the dedicated host.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ECS instance type families supported by the dedicated host.
             */
            public Builder supportedInstanceTypeFamilies(SupportedInstanceTypeFamilies supportedInstanceTypeFamilies) {
                this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
                return this;
            }

            /**
             * The custom instance families supported by the dedicated host.
             */
            public Builder supportedCustomInstanceTypeFamilies(SupportedCustomInstanceTypeFamilies supportedCustomInstanceTypeFamilies) {
                this.supportedCustomInstanceTypeFamilies = supportedCustomInstanceTypeFamilies;
                return this;
            }

            /**
             * The ECS instance type supported by the dedicated host.
             */
            public Builder supportedInstanceTypesList(SupportedInstanceTypesList supportedInstanceTypesList) {
                this.supportedInstanceTypesList = supportedInstanceTypesList;
                return this;
            }

            /**
             * The set of dedicated host performance metrics.
             */
            public Builder capacity(Capacity capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The network attribute value of the DDH.
             */
            public Builder networkAttributes(NetworkAttributes networkAttributes) {
                this.networkAttributes = networkAttributes;
                return this;
            }

            /**
             * This parameter will be removed soon. We recommend that you use other parameters to improve compatibility.
             */
            public Builder hostDetailInfo(HostDetailInfo hostDetailInfo) {
                this.hostDetailInfo = hostDetailInfo;
                return this;
            }

            public DedicatedHost build() {
                return new DedicatedHost(this);
            } 

        } 

    }
    public static class DedicatedHosts extends TeaModel {
        @NameInMap("DedicatedHost")
        private java.util.List < DedicatedHost> dedicatedHost;

        private DedicatedHosts(Builder builder) {
            this.dedicatedHost = builder.dedicatedHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHosts create() {
            return builder().build();
        }

        /**
         * @return dedicatedHost
         */
        public java.util.List < DedicatedHost> getDedicatedHost() {
            return this.dedicatedHost;
        }

        public static final class Builder {
            private java.util.List < DedicatedHost> dedicatedHost; 

            /**
             * DedicatedHost.
             */
            public Builder dedicatedHost(java.util.List < DedicatedHost> dedicatedHost) {
                this.dedicatedHost = dedicatedHost;
                return this;
            }

            public DedicatedHosts build() {
                return new DedicatedHosts(this);
            } 

        } 

    }
}
