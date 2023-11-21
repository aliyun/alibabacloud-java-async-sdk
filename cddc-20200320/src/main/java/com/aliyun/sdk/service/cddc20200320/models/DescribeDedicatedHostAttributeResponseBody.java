// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostAttributeResponseBody</p>
 */
public class DescribeDedicatedHostAttributeResponseBody extends TeaModel {
    @NameInMap("AccountName")
    private String accountName;

    @NameInMap("AccountType")
    private String accountType;

    @NameInMap("AllocationStatus")
    private String allocationStatus;

    @NameInMap("AutoRenew")
    private String autoRenew;

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

    @NameInMap("DiskAllocationRatio")
    private String diskAllocationRatio;

    @NameInMap("DistributionTag")
    private String distributionTag;

    @NameInMap("EcsClassCode")
    private String ecsClassCode;

    @NameInMap("ExpiredTime")
    private String expiredTime;

    @NameInMap("HostCPU")
    private Integer hostCPU;

    @NameInMap("HostClass")
    private String hostClass;

    @NameInMap("HostMem")
    private Integer hostMem;

    @NameInMap("HostName")
    private String hostName;

    @NameInMap("HostStatus")
    private String hostStatus;

    @NameInMap("HostStorage")
    private Integer hostStorage;

    @NameInMap("HostType")
    private String hostType;

    @NameInMap("IPAddress")
    private String IPAddress;

    @NameInMap("ImageCategory")
    private String imageCategory;

    @NameInMap("InstanceNumber")
    private Integer instanceNumber;

    @NameInMap("InstanceNumberMaster")
    private Integer instanceNumberMaster;

    @NameInMap("InstanceNumberROMaster")
    private Integer instanceNumberROMaster;

    @NameInMap("InstanceNumberROSlave")
    private Integer instanceNumberROSlave;

    @NameInMap("InstanceNumberSlave")
    private Integer instanceNumberSlave;

    @NameInMap("MemAllocationRatio")
    private String memAllocationRatio;

    @NameInMap("MemoryUsed")
    private String memoryUsed;

    @NameInMap("OpenPermission")
    private String openPermission;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageUsed")
    private String storageUsed;

    @NameInMap("VPCId")
    private String VPCId;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("ZoneId")
    private String zoneId;

    private DescribeDedicatedHostAttributeResponseBody(Builder builder) {
        this.accountName = builder.accountName;
        this.accountType = builder.accountType;
        this.allocationStatus = builder.allocationStatus;
        this.autoRenew = builder.autoRenew;
        this.CPUAllocationRatio = builder.CPUAllocationRatio;
        this.cpuUsed = builder.cpuUsed;
        this.createdTime = builder.createdTime;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.dedicatedHostId = builder.dedicatedHostId;
        this.diskAllocationRatio = builder.diskAllocationRatio;
        this.distributionTag = builder.distributionTag;
        this.ecsClassCode = builder.ecsClassCode;
        this.expiredTime = builder.expiredTime;
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
        this.instanceNumberMaster = builder.instanceNumberMaster;
        this.instanceNumberROMaster = builder.instanceNumberROMaster;
        this.instanceNumberROSlave = builder.instanceNumberROSlave;
        this.instanceNumberSlave = builder.instanceNumberSlave;
        this.memAllocationRatio = builder.memAllocationRatio;
        this.memoryUsed = builder.memoryUsed;
        this.openPermission = builder.openPermission;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.storageUsed = builder.storageUsed;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostAttributeResponseBody create() {
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
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
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
     * @return diskAllocationRatio
     */
    public String getDiskAllocationRatio() {
        return this.diskAllocationRatio;
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
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return hostCPU
     */
    public Integer getHostCPU() {
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
    public Integer getHostMem() {
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
    public Integer getHostStorage() {
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
    public Integer getInstanceNumber() {
        return this.instanceNumber;
    }

    /**
     * @return instanceNumberMaster
     */
    public Integer getInstanceNumberMaster() {
        return this.instanceNumberMaster;
    }

    /**
     * @return instanceNumberROMaster
     */
    public Integer getInstanceNumberROMaster() {
        return this.instanceNumberROMaster;
    }

    /**
     * @return instanceNumberROSlave
     */
    public Integer getInstanceNumberROSlave() {
        return this.instanceNumberROSlave;
    }

    /**
     * @return instanceNumberSlave
     */
    public Integer getInstanceNumberSlave() {
        return this.instanceNumberSlave;
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
        private String autoRenew; 
        private String CPUAllocationRatio; 
        private String cpuUsed; 
        private String createdTime; 
        private String dedicatedHostGroupId; 
        private String dedicatedHostId; 
        private String diskAllocationRatio; 
        private String distributionTag; 
        private String ecsClassCode; 
        private String expiredTime; 
        private Integer hostCPU; 
        private String hostClass; 
        private Integer hostMem; 
        private String hostName; 
        private String hostStatus; 
        private Integer hostStorage; 
        private String hostType; 
        private String IPAddress; 
        private String imageCategory; 
        private Integer instanceNumber; 
        private Integer instanceNumberMaster; 
        private Integer instanceNumberROMaster; 
        private Integer instanceNumberROSlave; 
        private Integer instanceNumberSlave; 
        private String memAllocationRatio; 
        private String memoryUsed; 
        private String openPermission; 
        private String regionId; 
        private String requestId; 
        private String storageUsed; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        /**
         * The account name of the host.
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
         * *   **Normal**: standard account.
         * *   **Admin**: administrator account.
         */
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * Indicates whether instances can be deployed on the host. Valid values:
         * <p>
         * 
         * *   **Allocatable**: yes.
         * *   **Suspended**: no.
         */
        public Builder allocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }

        /**
         * Indicates whether auto-renewal is enabled on the host. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder autoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The CPU overcommit ratio of the dedicated cluster. Unit: %. The value is accurate to the tens digit.
         */
        public Builder CPUAllocationRatio(String CPUAllocationRatio) {
            this.CPUAllocationRatio = CPUAllocationRatio;
            return this;
        }

        /**
         * The number of CPU cores used by the host.
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
         * The storage overcommit ratio of the dedicated cluster.
         */
        public Builder diskAllocationRatio(String diskAllocationRatio) {
            this.diskAllocationRatio = diskAllocationRatio;
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
         * The instance type of the Elastic Compute Service (ECS) instance.
         */
        public Builder ecsClassCode(String ecsClassCode) {
            this.ecsClassCode = ecsClassCode;
            return this;
        }

        /**
         * The expiration time of the host. The time follows the ISO 8601 standard in the **yyyy-MM-ddTHH:mm:ssZ** format. The time is displayed in UTC.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * The number of CPU cores of the host.
         */
        public Builder hostCPU(Integer hostCPU) {
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
         * The memory size of the host. Unit: MB.
         */
        public Builder hostMem(Integer hostMem) {
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
         * >  When a host fails, the host is disabled. Before the host is disabled, the data of the instances that run on the host is migrated to another host. This ensures data integrity.
         */
        public Builder hostStatus(String hostStatus) {
            this.hostStatus = hostStatus;
            return this;
        }

        /**
         * The total storage of the host. Unit: GB.
         */
        public Builder hostStorage(Integer hostStorage) {
            this.hostStorage = hostStorage;
            return this;
        }

        /**
         * The storage type of the host. Valid values:
         * <p>
         * 
         * *   **dhg_cloud_ssd** or **dhg_cloud_essd**: enhanced SSD (ESSD).
         * *   **dhg_local_ssd**: local SSD.
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
         * The image of the host. This parameter is returned only when the database engine is **SQL Server**. Valid values:
         * <p>
         * 
         * *   **WindowsWithMssqlEntAlwaysonLicense**: SQL Server Cluster Edition (AlwaysOn).
         * *   **WindowsWithMssqlStdLicense**: SQL Server Standard Edition.
         * *   **WindowsWithMssqlEntLicense**: SQL Server Enterprise Edition.
         * *   **WindowsWithMssqlWebLicense**: SQL Server Web Edition.
         */
        public Builder imageCategory(String imageCategory) {
            this.imageCategory = imageCategory;
            return this;
        }

        /**
         * The number of instances deployed on the host.
         */
        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }

        /**
         * The number of primary instances deployed on the host.
         */
        public Builder instanceNumberMaster(Integer instanceNumberMaster) {
            this.instanceNumberMaster = instanceNumberMaster;
            return this;
        }

        /**
         * The number of primary instances of the read-only instance deployed on the host.
         */
        public Builder instanceNumberROMaster(Integer instanceNumberROMaster) {
            this.instanceNumberROMaster = instanceNumberROMaster;
            return this;
        }

        /**
         * The number of secondary instances of the read-only instance deployed on the host.
         */
        public Builder instanceNumberROSlave(Integer instanceNumberROSlave) {
            this.instanceNumberROSlave = instanceNumberROSlave;
            return this;
        }

        /**
         * The number of secondary instances deployed on the host.
         */
        public Builder instanceNumberSlave(Integer instanceNumberSlave) {
            this.instanceNumberSlave = instanceNumberSlave;
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
         * Indicates whether the host OS permissions are grated. Valid values:
         * <p>
         * 
         * *   **0**: no.
         * *   **1**: yes.
         */
        public Builder openPermission(String openPermission) {
            this.openPermission = openPermission;
            return this;
        }

        /**
         * [The region ID](~~198326~~).
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * The storage usage of the host. Unit: GB.
         */
        public Builder storageUsed(String storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }

        /**
         * The virtual private cloud (VPC) ID.
         */
        public Builder VPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }

        /**
         * The vSwitch ID.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The zone ID.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeDedicatedHostAttributeResponseBody build() {
            return new DescribeDedicatedHostAttributeResponseBody(this);
        } 

    } 

}
