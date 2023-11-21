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
         * The dedicated cluster ID.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * The queried hosts.
         */
        public Builder dedicatedHosts(DedicatedHosts dedicatedHosts) {
            this.dedicatedHosts = dedicatedHosts;
            return this;
        }

        /**
         * The maximum storage of local SSDs for auto scaling. Unit: GB.
         */
        public Builder maxAutoScaleHostStorage(Long maxAutoScaleHostStorage) {
            this.maxAutoScaleHostStorage = maxAutoScaleHostStorage;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumbers(Integer pageNumbers) {
            this.pageNumbers = pageNumbers;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
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

        @NameInMap("Category")
        private String category;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CpuUsed")
        private String cpuUsed;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DedicatedHostGroupId")
        private String dedicatedHostGroupId;

        @NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @NameInMap("DiskAllocationRatio")
        private String diskAllocationRatio;

        @NameInMap("DiskInfo")
        private String diskInfo;

        @NameInMap("DistributionSymbol")
        private String distributionSymbol;

        @NameInMap("DistributionTag")
        private String distributionTag;

        @NameInMap("EcsClassCode")
        private String ecsClassCode;

        @NameInMap("EcsId")
        private String ecsId;

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

        @NameInMap("MssqlSupportVersion")
        private String mssqlSupportVersion;

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
            this.category = builder.category;
            this.chargeType = builder.chargeType;
            this.cpuUsed = builder.cpuUsed;
            this.createdTime = builder.createdTime;
            this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
            this.dedicatedHostId = builder.dedicatedHostId;
            this.diskAllocationRatio = builder.diskAllocationRatio;
            this.diskInfo = builder.diskInfo;
            this.distributionSymbol = builder.distributionSymbol;
            this.distributionTag = builder.distributionTag;
            this.ecsClassCode = builder.ecsClassCode;
            this.ecsId = builder.ecsId;
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
            this.mssqlSupportVersion = builder.mssqlSupportVersion;
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
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
         * @return diskAllocationRatio
         */
        public String getDiskAllocationRatio() {
            return this.diskAllocationRatio;
        }

        /**
         * @return diskInfo
         */
        public String getDiskInfo() {
            return this.diskInfo;
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
         * @return ecsId
         */
        public String getEcsId() {
            return this.ecsId;
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
         * @return mssqlSupportVersion
         */
        public String getMssqlSupportVersion() {
            return this.mssqlSupportVersion;
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
            private String category; 
            private String chargeType; 
            private String cpuUsed; 
            private String createdTime; 
            private String dedicatedHostGroupId; 
            private String dedicatedHostId; 
            private String diskAllocationRatio; 
            private String diskInfo; 
            private String distributionSymbol; 
            private String distributionTag; 
            private String ecsClassCode; 
            private String ecsId; 
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
            private String mssqlSupportVersion; 
            private String openPermission; 
            private String storageUsed; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * The custom account name of the host.
             * <p>
             * 
             * *   The name can contain lowercase letters, digits, and underscores (\_).
             * *   The name must start with a lowercase letter and end with a lowercase letter or a digit.
             * *   The name must be 2 to 16 characters in length.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The account type of the host. Valid values:
             * <p>
             * 
             * **Normal**: standard account.
             * 
             * **Admin**: administrator account.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * Specifies whether instances can be deployed on the host. Valid values:
             * <p>
             * 
             * *   **Allocatable**: Instances can be deployed on the host.
             * *   **Suspended**: Instances cannot be deployed on the host.
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * The ID of the bastion host with which the host is associated.
             */
            public Builder bastionInstanceId(String bastionInstanceId) {
                this.bastionInstanceId = bastionInstanceId;
                return this;
            }

            /**
             * The CPU utilization of the host.
             */
            public Builder CPUAllocationRatio(String CPUAllocationRatio) {
                this.CPUAllocationRatio = CPUAllocationRatio;
                return this;
            }

            /**
             * The type of the dedicated cluster. Valid values:
             * <p>
             * 
             * *   **Pro**: Proprietary MyBase.
             * *   **Standard**: Managed MyBase.
             * 
             * >  This parameter is returned only for the China site (aliyun.com).
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The billing method.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The number of used CPU cores.
             */
            public Builder cpuUsed(String cpuUsed) {
                this.cpuUsed = cpuUsed;
                return this;
            }

            /**
             * The time when the host was created. The time follows the ISO 8601 standard in the **yyyy-MM-ddTHH:mm:ssZ** format. The time is displayed in UTC.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The ID of the dedicated cluster in which the host is created.
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * The host ID.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * The disk usage of the host. Unit: %.
             */
            public Builder diskAllocationRatio(String diskAllocationRatio) {
                this.diskAllocationRatio = diskAllocationRatio;
                return this;
            }

            /**
             * The disk information of the ECS instance.
             * <p>
             * 
             * >  This parameter is returned only for the China site (aliyun.com) when the dedicated cluster is of the **Proprietary MyBase** type.
             */
            public Builder diskInfo(String diskInfo) {
                this.diskInfo = diskInfo;
                return this;
            }

            /**
             * The distribution symbol of the host.
             * <p>
             * 
             * >  This parameter is returned only when the host runs **Tair**.
             */
            public Builder distributionSymbol(String distributionSymbol) {
                this.distributionSymbol = distributionSymbol;
                return this;
            }

            /**
             * The distribution tag of the host.
             */
            public Builder distributionTag(String distributionTag) {
                this.distributionTag = distributionTag;
                return this;
            }

            /**
             * The instance type of the Elastic Compute Service (ECS) instance. For more information, see [Overview of instance families](~~25378~~).
             */
            public Builder ecsClassCode(String ecsClassCode) {
                this.ecsClassCode = ecsClassCode;
                return this;
            }

            /**
             * The ID of the ECS instance.
             * <p>
             * 
             * >  This parameter is returned only for the China site (aliyun.com) when the dedicated cluster is of the **Proprietary MyBase** type.
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            /**
             * The expiration time of the host. The time follows the ISO 8601 standard in the **yyyy-MM-ddTHH:mm:ssZ** format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The database engine of the host.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The number of CPU cores of the host.
             */
            public Builder hostCPU(String hostCPU) {
                this.hostCPU = hostCPU;
                return this;
            }

            /**
             * The instance type of the host.
             */
            public Builder hostClass(String hostClass) {
                this.hostClass = hostClass;
                return this;
            }

            /**
             * The memory size of the host. Unit: GB.
             */
            public Builder hostMem(String hostMem) {
                this.hostMem = hostMem;
                return this;
            }

            /**
             * The name of the host.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The state of the host. Valid values:
             * <p>
             * 
             * *   **0**: The host is being created.
             * *   **1**: The host is running.
             * *   **2**: The host is faulty.
             * *   **3**: The host is ready for disabling.
             * *   **4**: The host is being maintained.
             * *   **5**: The host is disabled.
             * *   **6**: The host is restarting.
             * *   **7**: The host is locked.
             * 
             * >  When a host fails, the host is disabled. Before the host is disabled, the data of the instances that run on the host is migrated to another host.
             */
            public Builder hostStatus(String hostStatus) {
                this.hostStatus = hostStatus;
                return this;
            }

            /**
             * The total storage of the host. Unit: GB.
             */
            public Builder hostStorage(String hostStorage) {
                this.hostStorage = hostStorage;
                return this;
            }

            /**
             * The storage type of the host.
             */
            public Builder hostType(String hostType) {
                this.hostType = hostType;
                return this;
            }

            /**
             * The IP address of the host.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * The image type of the host.
             */
            public Builder imageCategory(String imageCategory) {
                this.imageCategory = imageCategory;
                return this;
            }

            /**
             * The number of instances deployed on the host.
             */
            public Builder instanceNumber(String instanceNumber) {
                this.instanceNumber = instanceNumber;
                return this;
            }

            /**
             * The memory usage of the host. Unit: %.
             */
            public Builder memAllocationRatio(String memAllocationRatio) {
                this.memAllocationRatio = memAllocationRatio;
                return this;
            }

            /**
             * The amount of memory used by the host. Unit: GB.
             */
            public Builder memoryUsed(String memoryUsed) {
                this.memoryUsed = memoryUsed;
                return this;
            }

            /**
             * The versions supported by hosts in ApsaraDB MyBase for SQL Server.
             */
            public Builder mssqlSupportVersion(String mssqlSupportVersion) {
                this.mssqlSupportVersion = mssqlSupportVersion;
                return this;
            }

            /**
             * Indicates whether the host OS permissions are granted. Valid values:
             * <p>
             * 
             * *   **0**: no.
             * *   **1** (default): yes.
             */
            public Builder openPermission(String openPermission) {
                this.openPermission = openPermission;
                return this;
            }

            /**
             * The amount of storage used by the host. Unit: GB.
             */
            public Builder storageUsed(String storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * The virtual private cloud (VPC) ID of the dedicated cluster in which the host is created.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The ID of the vSwitch to which the host is connected.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the zone in which the host resides.
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
             * The queried hosts.
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
