// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

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
    @NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @NameInMap("DedicatedHosts")
    private DedicatedHosts dedicatedHosts;

    @NameInMap("MaxAutoScaleHostStorage")
    private Long maxAutoScaleHostStorage;

    @NameInMap("PageNumbers")
    private Integer pageNumbers;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecords")
    private Integer totalRecords;

    private DescribeDedicatedHostsResponseBody(Builder builder) {
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.dedicatedHosts = builder.dedicatedHosts;
        this.maxAutoScaleHostStorage = builder.maxAutoScaleHostStorage;
        this.pageNumbers = builder.pageNumbers;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecords = builder.totalRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return dedicatedHosts
     */
    public DedicatedHosts getDedicatedHosts() {
        return this.dedicatedHosts;
    }

    /**
     * @return maxAutoScaleHostStorage
     */
    public Long getMaxAutoScaleHostStorage() {
        return this.maxAutoScaleHostStorage;
    }

    /**
     * @return pageNumbers
     */
    public Integer getPageNumbers() {
        return this.pageNumbers;
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
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static final class Builder {
        private String dedicatedHostGroupId; 
        private DedicatedHosts dedicatedHosts; 
        private Long maxAutoScaleHostStorage; 
        private Integer pageNumbers; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecords; 

        /**
         * DedicatedHostGroupId.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * DedicatedHosts.
         */
        public Builder dedicatedHosts(DedicatedHosts dedicatedHosts) {
            this.dedicatedHosts = dedicatedHosts;
            return this;
        }

        /**
         * MaxAutoScaleHostStorage.
         */
        public Builder maxAutoScaleHostStorage(Long maxAutoScaleHostStorage) {
            this.maxAutoScaleHostStorage = maxAutoScaleHostStorage;
            return this;
        }

        /**
         * PageNumbers.
         */
        public Builder pageNumbers(Integer pageNumbers) {
            this.pageNumbers = pageNumbers;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalRecords.
         */
        public Builder totalRecords(Integer totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }

        public DescribeDedicatedHostsResponseBody build() {
            return new DescribeDedicatedHostsResponseBody(this);
        } 

    } 

    public static class DedicatedHostsDedicatedHosts extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AccountType")
        private String accountType;

        @NameInMap("AllocationStatus")
        private String allocationStatus;

        @NameInMap("BastionInstanceId")
        private String bastionInstanceId;

        @NameInMap("CPUAllocationRatio")
        private String CPUAllocationRatio;

        @NameInMap("CpuUsed")
        private String cpuUsed;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DedicatedHostGroupId")
        private String dedicatedHostGroupId;

        @NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("DiskAllocationRatio")
        private String diskAllocationRatio;

        @NameInMap("DistributionSymbol")
        private String distributionSymbol;

        @NameInMap("DistributionTag")
        private String distributionTag;

        @NameInMap("EcsClassCode")
        private String ecsClassCode;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("HostCPU")
        private String hostCPU;

        @NameInMap("HostClass")
        private String hostClass;

        @NameInMap("HostMem")
        private String hostMem;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("HostStatus")
        private String hostStatus;

        @NameInMap("HostStorage")
        private String hostStorage;

        @NameInMap("HostType")
        private String hostType;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("ImageCategory")
        private String imageCategory;

        @NameInMap("InstanceNumber")
        private String instanceNumber;

        @NameInMap("MemAllocationRatio")
        private String memAllocationRatio;

        @NameInMap("MemoryUsed")
        private String memoryUsed;

        @NameInMap("OpenPermission")
        private String openPermission;

        @NameInMap("StorageUsed")
        private String storageUsed;

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private DedicatedHostsDedicatedHosts(Builder builder) {
            this.accountName = builder.accountName;
            this.accountType = builder.accountType;
            this.allocationStatus = builder.allocationStatus;
            this.bastionInstanceId = builder.bastionInstanceId;
            this.CPUAllocationRatio = builder.CPUAllocationRatio;
            this.cpuUsed = builder.cpuUsed;
            this.createdTime = builder.createdTime;
            this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
            this.dedicatedHostId = builder.dedicatedHostId;
            this.deployType = builder.deployType;
            this.diskAllocationRatio = builder.diskAllocationRatio;
            this.distributionSymbol = builder.distributionSymbol;
            this.distributionTag = builder.distributionTag;
            this.ecsClassCode = builder.ecsClassCode;
            this.endTime = builder.endTime;
            this.engine = builder.engine;
            this.hostCPU = builder.hostCPU;
            this.hostClass = builder.hostClass;
            this.hostMem = builder.hostMem;
            this.hostName = builder.hostName;
            this.hostStatus = builder.hostStatus;
            this.hostStorage = builder.hostStorage;
            this.hostType = builder.hostType;
            this.IPAddress = builder.IPAddress;
            this.imageCategory = builder.imageCategory;
            this.instanceNumber = builder.instanceNumber;
            this.memAllocationRatio = builder.memAllocationRatio;
            this.memoryUsed = builder.memoryUsed;
            this.openPermission = builder.openPermission;
            this.storageUsed = builder.storageUsed;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostsDedicatedHosts create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return allocationStatus
         */
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        /**
         * @return bastionInstanceId
         */
        public String getBastionInstanceId() {
            return this.bastionInstanceId;
        }

        /**
         * @return CPUAllocationRatio
         */
        public String getCPUAllocationRatio() {
            return this.CPUAllocationRatio;
        }

        /**
         * @return cpuUsed
         */
        public String getCpuUsed() {
            return this.cpuUsed;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return dedicatedHostGroupId
         */
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return diskAllocationRatio
         */
        public String getDiskAllocationRatio() {
            return this.diskAllocationRatio;
        }

        /**
         * @return distributionSymbol
         */
        public String getDistributionSymbol() {
            return this.distributionSymbol;
        }

        /**
         * @return distributionTag
         */
        public String getDistributionTag() {
            return this.distributionTag;
        }

        /**
         * @return ecsClassCode
         */
        public String getEcsClassCode() {
            return this.ecsClassCode;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return hostCPU
         */
        public String getHostCPU() {
            return this.hostCPU;
        }

        /**
         * @return hostClass
         */
        public String getHostClass() {
            return this.hostClass;
        }

        /**
         * @return hostMem
         */
        public String getHostMem() {
            return this.hostMem;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return hostStatus
         */
        public String getHostStatus() {
            return this.hostStatus;
        }

        /**
         * @return hostStorage
         */
        public String getHostStorage() {
            return this.hostStorage;
        }

        /**
         * @return hostType
         */
        public String getHostType() {
            return this.hostType;
        }

        /**
         * @return IPAddress
         */
        public String getIPAddress() {
            return this.IPAddress;
        }

        /**
         * @return imageCategory
         */
        public String getImageCategory() {
            return this.imageCategory;
        }

        /**
         * @return instanceNumber
         */
        public String getInstanceNumber() {
            return this.instanceNumber;
        }

        /**
         * @return memAllocationRatio
         */
        public String getMemAllocationRatio() {
            return this.memAllocationRatio;
        }

        /**
         * @return memoryUsed
         */
        public String getMemoryUsed() {
            return this.memoryUsed;
        }

        /**
         * @return openPermission
         */
        public String getOpenPermission() {
            return this.openPermission;
        }

        /**
         * @return storageUsed
         */
        public String getStorageUsed() {
            return this.storageUsed;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accountName; 
            private String accountType; 
            private String allocationStatus; 
            private String bastionInstanceId; 
            private String CPUAllocationRatio; 
            private String cpuUsed; 
            private String createdTime; 
            private String dedicatedHostGroupId; 
            private String dedicatedHostId; 
            private String deployType; 
            private String diskAllocationRatio; 
            private String distributionSymbol; 
            private String distributionTag; 
            private String ecsClassCode; 
            private String endTime; 
            private String engine; 
            private String hostCPU; 
            private String hostClass; 
            private String hostMem; 
            private String hostName; 
            private String hostStatus; 
            private String hostStorage; 
            private String hostType; 
            private String IPAddress; 
            private String imageCategory; 
            private String instanceNumber; 
            private String memAllocationRatio; 
            private String memoryUsed; 
            private String openPermission; 
            private String storageUsed; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * AllocationStatus.
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * BastionInstanceId.
             */
            public Builder bastionInstanceId(String bastionInstanceId) {
                this.bastionInstanceId = bastionInstanceId;
                return this;
            }

            /**
             * CPUAllocationRatio.
             */
            public Builder CPUAllocationRatio(String CPUAllocationRatio) {
                this.CPUAllocationRatio = CPUAllocationRatio;
                return this;
            }

            /**
             * CpuUsed.
             */
            public Builder cpuUsed(String cpuUsed) {
                this.cpuUsed = cpuUsed;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DedicatedHostGroupId.
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * DedicatedHostId.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * DiskAllocationRatio.
             */
            public Builder diskAllocationRatio(String diskAllocationRatio) {
                this.diskAllocationRatio = diskAllocationRatio;
                return this;
            }

            /**
             * DistributionSymbol.
             */
            public Builder distributionSymbol(String distributionSymbol) {
                this.distributionSymbol = distributionSymbol;
                return this;
            }

            /**
             * DistributionTag.
             */
            public Builder distributionTag(String distributionTag) {
                this.distributionTag = distributionTag;
                return this;
            }

            /**
             * EcsClassCode.
             */
            public Builder ecsClassCode(String ecsClassCode) {
                this.ecsClassCode = ecsClassCode;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * HostCPU.
             */
            public Builder hostCPU(String hostCPU) {
                this.hostCPU = hostCPU;
                return this;
            }

            /**
             * HostClass.
             */
            public Builder hostClass(String hostClass) {
                this.hostClass = hostClass;
                return this;
            }

            /**
             * HostMem.
             */
            public Builder hostMem(String hostMem) {
                this.hostMem = hostMem;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * HostStatus.
             */
            public Builder hostStatus(String hostStatus) {
                this.hostStatus = hostStatus;
                return this;
            }

            /**
             * HostStorage.
             */
            public Builder hostStorage(String hostStorage) {
                this.hostStorage = hostStorage;
                return this;
            }

            /**
             * HostType.
             */
            public Builder hostType(String hostType) {
                this.hostType = hostType;
                return this;
            }

            /**
             * IPAddress.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * ImageCategory.
             */
            public Builder imageCategory(String imageCategory) {
                this.imageCategory = imageCategory;
                return this;
            }

            /**
             * InstanceNumber.
             */
            public Builder instanceNumber(String instanceNumber) {
                this.instanceNumber = instanceNumber;
                return this;
            }

            /**
             * MemAllocationRatio.
             */
            public Builder memAllocationRatio(String memAllocationRatio) {
                this.memAllocationRatio = memAllocationRatio;
                return this;
            }

            /**
             * MemoryUsed.
             */
            public Builder memoryUsed(String memoryUsed) {
                this.memoryUsed = memoryUsed;
                return this;
            }

            /**
             * OpenPermission.
             */
            public Builder openPermission(String openPermission) {
                this.openPermission = openPermission;
                return this;
            }

            /**
             * StorageUsed.
             */
            public Builder storageUsed(String storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * VPCId.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DedicatedHostsDedicatedHosts build() {
                return new DedicatedHostsDedicatedHosts(this);
            } 

        } 

    }
    public static class DedicatedHosts extends TeaModel {
        @NameInMap("DedicatedHosts")
        private java.util.List < DedicatedHostsDedicatedHosts> dedicatedHosts;

        private DedicatedHosts(Builder builder) {
            this.dedicatedHosts = builder.dedicatedHosts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHosts create() {
            return builder().build();
        }

        /**
         * @return dedicatedHosts
         */
        public java.util.List < DedicatedHostsDedicatedHosts> getDedicatedHosts() {
            return this.dedicatedHosts;
        }

        public static final class Builder {
            private java.util.List < DedicatedHostsDedicatedHosts> dedicatedHosts; 

            /**
             * DedicatedHosts.
             */
            public Builder dedicatedHosts(java.util.List < DedicatedHostsDedicatedHosts> dedicatedHosts) {
                this.dedicatedHosts = dedicatedHosts;
                return this;
            }

            public DedicatedHosts build() {
                return new DedicatedHosts(this);
            } 

        } 

    }
}
