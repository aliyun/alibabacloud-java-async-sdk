// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostsResponseBody</p>
 */
public class DescribeDedicatedHostsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @com.aliyun.core.annotation.NameInMap("DedicatedHosts")
    private DedicatedHosts dedicatedHosts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDedicatedHostsResponseBody model) {
            this.dedicatedHostGroupId = model.dedicatedHostGroupId;
            this.dedicatedHosts = model.dedicatedHosts;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The host group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-7a9xxxxxxxx</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>The host information.</p>
         */
        public Builder dedicatedHosts(DedicatedHosts dedicatedHosts) {
            this.dedicatedHosts = dedicatedHosts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C860658E-68A6-46C1-AF6E-3AE7C4D3CACF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedHostsResponseBody build() {
            return new DescribeDedicatedHostsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class DedicatedHostsDedicatedHosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AllocationStatus")
        private String allocationStatus;

        @com.aliyun.core.annotation.NameInMap("BastionInstanceId")
        private String bastionInstanceId;

        @com.aliyun.core.annotation.NameInMap("CPUAllocationRatio")
        private String CPUAllocationRatio;

        @com.aliyun.core.annotation.NameInMap("CpuUsed")
        private String cpuUsed;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
        private String dedicatedHostGroupId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @com.aliyun.core.annotation.NameInMap("DiskAllocationRatio")
        private String diskAllocationRatio;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("HostCPU")
        private String hostCPU;

        @com.aliyun.core.annotation.NameInMap("HostClass")
        private String hostClass;

        @com.aliyun.core.annotation.NameInMap("HostMem")
        private String hostMem;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("HostStatus")
        private String hostStatus;

        @com.aliyun.core.annotation.NameInMap("HostStorage")
        private String hostStorage;

        @com.aliyun.core.annotation.NameInMap("HostType")
        private String hostType;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("ImageCategory")
        private String imageCategory;

        @com.aliyun.core.annotation.NameInMap("InstanceNumber")
        private String instanceNumber;

        @com.aliyun.core.annotation.NameInMap("MemAllocationRatio")
        private String memAllocationRatio;

        @com.aliyun.core.annotation.NameInMap("MemoryUsed")
        private String memoryUsed;

        @com.aliyun.core.annotation.NameInMap("OpenPermission")
        private String openPermission;

        @com.aliyun.core.annotation.NameInMap("StorageUsed")
        private String storageUsed;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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

            private Builder() {
            } 

            private Builder(DedicatedHostsDedicatedHosts model) {
                this.accountName = model.accountName;
                this.allocationStatus = model.allocationStatus;
                this.bastionInstanceId = model.bastionInstanceId;
                this.CPUAllocationRatio = model.CPUAllocationRatio;
                this.cpuUsed = model.cpuUsed;
                this.createdTime = model.createdTime;
                this.dedicatedHostGroupId = model.dedicatedHostGroupId;
                this.dedicatedHostId = model.dedicatedHostId;
                this.diskAllocationRatio = model.diskAllocationRatio;
                this.endTime = model.endTime;
                this.engine = model.engine;
                this.hostCPU = model.hostCPU;
                this.hostClass = model.hostClass;
                this.hostMem = model.hostMem;
                this.hostName = model.hostName;
                this.hostStatus = model.hostStatus;
                this.hostStorage = model.hostStorage;
                this.hostType = model.hostType;
                this.IPAddress = model.IPAddress;
                this.imageCategory = model.imageCategory;
                this.instanceNumber = model.instanceNumber;
                this.memAllocationRatio = model.memAllocationRatio;
                this.memoryUsed = model.memoryUsed;
                this.openPermission = model.openPermission;
                this.storageUsed = model.storageUsed;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The host account. You can call the <a href="https://help.aliyun.com/document_detail/196877.html">CreateDedicatedHostAccount</a> operation to create a host account.</p>
             * 
             * <strong>example:</strong>
             * <p>test123</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>Specifies whether instances can be deployed on the host. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Instances cannot be deployed on the host.</li>
             * <li><strong>1</strong>: Instances can be deployed on the host.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * <p>The bastion host ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bastionhost-cn-m7xxxxxxxx</p>
             */
            public Builder bastionInstanceId(String bastionInstanceId) {
                this.bastionInstanceId = bastionInstanceId;
                return this;
            }

            /**
             * <p>The core overcommitment ratio of the dedicated cluster. Unit: percentage. For more information about the core overcommitment ratio, see <a href="https://help.aliyun.com/document_detail/182328.html">Manage a dedicated cluster</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder CPUAllocationRatio(String CPUAllocationRatio) {
                this.CPUAllocationRatio = CPUAllocationRatio;
                return this;
            }

            /**
             * <p>The number of used CPU cores on the host. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpuUsed(String cpuUsed) {
                this.cpuUsed = cpuUsed;
                return this;
            }

            /**
             * <p>The time when the host was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-25 17:29:06.0</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The dedicated cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dhg-7a9xxxxxxxx</p>
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * <p>The host ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bpxxxxxxx</p>
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * <p>The disk overcommitment ratio of the dedicated cluster. Unit: percentage. For more information about the core overcommitment ratio, see <a href="https://help.aliyun.com/document_detail/182328.html">Manage a dedicated cluster</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder diskAllocationRatio(String diskAllocationRatio) {
                this.diskAllocationRatio = diskAllocationRatio;
                return this;
            }

            /**
             * <p>The time when the host expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-25T16:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The database engine of instances that are created on the host.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The total number of CPU cores that are configured for the host. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder hostCPU(String hostCPU) {
                this.hostCPU = hostCPU;
                return this;
            }

            /**
             * <p>The instance type of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.i2.16xlarge</p>
             */
            public Builder hostClass(String hostClass) {
                this.hostClass = hostClass;
                return this;
            }

            /**
             * <p>The total memory space of the host. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>32238</p>
             */
            public Builder hostMem(String hostMem) {
                this.hostMem = hostMem;
                return this;
            }

            /**
             * <p>The host name.</p>
             * 
             * <strong>example:</strong>
             * <p>testHost1</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The status of the host. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: creating</li>
             * <li><strong>1</strong>: running</li>
             * <li><strong>2</strong>: faulty</li>
             * <li><strong>3</strong>: being replaced</li>
             * <li><strong>4</strong>: deprecated</li>
             * <li><strong>5</strong>: deleting</li>
             * <li><strong>6</strong>: restarting</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostStatus(String hostStatus) {
                this.hostStatus = hostStatus;
                return this;
            }

            /**
             * <p>The storage capacity of the host. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>2097152</p>
             */
            public Builder hostStorage(String hostStorage) {
                this.hostStorage = hostStorage;
                return this;
            }

            /**
             * <p>The storage type of the host. Valid values:</p>
             * <ul>
             * <li><strong>dhg_cloud_ssd</strong>: ESSD</li>
             * <li><strong>dhg_local_ssd</strong>: local SSD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dhg_cloud_ssd</p>
             */
            public Builder hostType(String hostType) {
                this.hostType = hostType;
                return this;
            }

            /**
             * <p>The internal IP address of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>192.xx.xx.xx</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The host image. This parameter is returned only when the <strong>Engine</strong> parameter is set to <strong>mssql</strong>. Valid values:</p>
             * <ul>
             * <li><strong>WindowsWithMssqlStdLicense</strong>: a Windows image that contains the licenses of SQL Server Standard Edition</li>
             * <li><strong>WindowsWithMssqlEntLisence</strong>: a Windows image that contains the licenses of SQL Server Enterprise Edition</li>
             * <li><strong>WindowsWithMssqlWebLisence</strong>: a Windows image that contains the licenses of SQL Server Web Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WindowsWithMssqlStdLicense</p>
             */
            public Builder imageCategory(String imageCategory) {
                this.imageCategory = imageCategory;
                return this;
            }

            /**
             * <p>The total number of instances that are created on the host.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder instanceNumber(String instanceNumber) {
                this.instanceNumber = instanceNumber;
                return this;
            }

            /**
             * <p>The maximum memory usage per host in the dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder memAllocationRatio(String memAllocationRatio) {
                this.memAllocationRatio = memAllocationRatio;
                return this;
            }

            /**
             * <p>The size of the used memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>16384</p>
             */
            public Builder memoryUsed(String memoryUsed) {
                this.memoryUsed = memoryUsed;
                return this;
            }

            /**
             * <p>Indicates whether the feature that allows you to have the OS permissions on the host is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong> or <strong>null</strong>: The permissions cannot be granted.</li>
             * <li><strong>1</strong>: The permissions can be granted.</li>
             * <li><strong>3</strong>: The permissions have been granted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder openPermission(String openPermission) {
                this.openPermission = openPermission;
                return this;
            }

            /**
             * <p>The amount of used storage space on the host.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder storageUsed(String storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the host belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bpxxxxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch associated with the specified VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bpxxxxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
    /**
     * 
     * {@link DescribeDedicatedHostsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostsResponseBody</p>
     */
    public static class DedicatedHosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHosts")
        private java.util.List<DedicatedHostsDedicatedHosts> dedicatedHosts;

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
        public java.util.List<DedicatedHostsDedicatedHosts> getDedicatedHosts() {
            return this.dedicatedHosts;
        }

        public static final class Builder {
            private java.util.List<DedicatedHostsDedicatedHosts> dedicatedHosts; 

            private Builder() {
            } 

            private Builder(DedicatedHosts model) {
                this.dedicatedHosts = model.dedicatedHosts;
            } 

            /**
             * <p>The host information.</p>
             */
            public Builder dedicatedHosts(java.util.List<DedicatedHostsDedicatedHosts> dedicatedHosts) {
                this.dedicatedHosts = dedicatedHosts;
                return this;
            }

            public DedicatedHosts build() {
                return new DedicatedHosts(this);
            } 

        } 

    }
}
