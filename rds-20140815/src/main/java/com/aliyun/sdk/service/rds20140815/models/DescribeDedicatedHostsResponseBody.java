// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDedicatedHostsResponseBody(Builder builder) {
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.dedicatedHosts = builder.dedicatedHosts;
        this.requestId = builder.requestId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dedicatedHostGroupId; 
        private DedicatedHosts dedicatedHosts; 
        private String requestId; 

        /**
         * The host group ID.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * The host information.
         */
        public Builder dedicatedHosts(DedicatedHosts dedicatedHosts) {
            this.dedicatedHosts = dedicatedHosts;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedHostsResponseBody build() {
            return new DescribeDedicatedHostsResponseBody(this);
        } 

    } 

    public static class DedicatedHostsDedicatedHosts extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

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

        @NameInMap("DiskAllocationRatio")
        private String diskAllocationRatio;

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
            this.allocationStatus = builder.allocationStatus;
            this.bastionInstanceId = builder.bastionInstanceId;
            this.CPUAllocationRatio = builder.CPUAllocationRatio;
            this.cpuUsed = builder.cpuUsed;
            this.createdTime = builder.createdTime;
            this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
            this.dedicatedHostId = builder.dedicatedHostId;
            this.diskAllocationRatio = builder.diskAllocationRatio;
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
         * @return diskAllocationRatio
         */
        public String getDiskAllocationRatio() {
            return this.diskAllocationRatio;
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
            private String allocationStatus; 
            private String bastionInstanceId; 
            private String CPUAllocationRatio; 
            private String cpuUsed; 
            private String createdTime; 
            private String dedicatedHostGroupId; 
            private String dedicatedHostId; 
            private String diskAllocationRatio; 
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
             * The host account. You can call the [CreateDedicatedHostAccount](~~196877~~) operation to create a host account.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * Specifies whether instances can be deployed on the host. Valid values:
             * <p>
             * 
             * *   **0**: Instances cannot be deployed on the host.
             * *   **1**: Instances can be deployed on the host.
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * The bastion host ID.
             */
            public Builder bastionInstanceId(String bastionInstanceId) {
                this.bastionInstanceId = bastionInstanceId;
                return this;
            }

            /**
             * The core overcommitment ratio of the dedicated cluster. Unit: percentage. For more information about the core overcommitment ratio, see [Manage a dedicated cluster](~~182328~~).
             */
            public Builder CPUAllocationRatio(String CPUAllocationRatio) {
                this.CPUAllocationRatio = CPUAllocationRatio;
                return this;
            }

            /**
             * The number of used CPU cores on the host. Unit: cores.
             */
            public Builder cpuUsed(String cpuUsed) {
                this.cpuUsed = cpuUsed;
                return this;
            }

            /**
             * The time when the host was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The dedicated cluster ID.
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
             * The disk overcommitment ratio of the dedicated cluster. Unit: percentage. For more information about the core overcommitment ratio, see [Manage a dedicated cluster](~~182328~~).
             */
            public Builder diskAllocationRatio(String diskAllocationRatio) {
                this.diskAllocationRatio = diskAllocationRatio;
                return this;
            }

            /**
             * The time when the host expires.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The database engine of instances that are created on the host.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The total number of CPU cores that are configured for the host. Unit: cores.
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
             * The total memory space of the host. Unit: MB.
             */
            public Builder hostMem(String hostMem) {
                this.hostMem = hostMem;
                return this;
            }

            /**
             * The host name.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The status of the host. Valid values:
             * <p>
             * 
             * *   **0**: creating
             * *   **1**: running
             * *   **2**: faulty
             * *   **3**: being replaced
             * *   **4**: deprecated
             * *   **5**: deleting
             * *   **6**: restarting
             */
            public Builder hostStatus(String hostStatus) {
                this.hostStatus = hostStatus;
                return this;
            }

            /**
             * The storage capacity of the host. Unit: MB.
             */
            public Builder hostStorage(String hostStorage) {
                this.hostStorage = hostStorage;
                return this;
            }

            /**
             * The storage type of the host. Valid values:
             * <p>
             * 
             * *   **dhg_cloud_ssd**: ESSD
             * *   **dhg_local_ssd**: local SSD
             */
            public Builder hostType(String hostType) {
                this.hostType = hostType;
                return this;
            }

            /**
             * The internal IP address of the host.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * The host image. This parameter is returned only when the **Engine** parameter is set to **mssql**. Valid values:
             * <p>
             * 
             * *   **WindowsWithMssqlStdLicense**: a Windows image that contains the licenses of SQL Server Standard Edition
             * *   **WindowsWithMssqlEntLisence**: a Windows image that contains the licenses of SQL Server Enterprise Edition
             * *   **WindowsWithMssqlWebLisence**: a Windows image that contains the licenses of SQL Server Web Edition
             */
            public Builder imageCategory(String imageCategory) {
                this.imageCategory = imageCategory;
                return this;
            }

            /**
             * The total number of instances that are created on the host.
             */
            public Builder instanceNumber(String instanceNumber) {
                this.instanceNumber = instanceNumber;
                return this;
            }

            /**
             * The maximum memory usage per host in the dedicated cluster.
             */
            public Builder memAllocationRatio(String memAllocationRatio) {
                this.memAllocationRatio = memAllocationRatio;
                return this;
            }

            /**
             * The size of the used memory. Unit: MB.
             */
            public Builder memoryUsed(String memoryUsed) {
                this.memoryUsed = memoryUsed;
                return this;
            }

            /**
             * Indicates whether the feature that allows you to have the OS permissions on the host is enabled. Valid values:
             * <p>
             * 
             * *   **0** or **null**: The permissions cannot be granted.
             * *   **1**: The permissions can be granted.
             * *   **3**: The permissions have been granted.
             */
            public Builder openPermission(String openPermission) {
                this.openPermission = openPermission;
                return this;
            }

            /**
             * The amount of used storage space on the host.
             */
            public Builder storageUsed(String storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) to which the host belongs.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The ID of the vSwitch associated with the specified VPC.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The zone ID of the host.
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
             * The host information.
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
