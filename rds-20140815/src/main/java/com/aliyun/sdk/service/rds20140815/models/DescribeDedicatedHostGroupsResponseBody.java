// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostGroupsResponseBody</p>
 */
public class DescribeDedicatedHostGroupsResponseBody extends TeaModel {
    @NameInMap("DedicatedHostGroups")
    private DedicatedHostGroups dedicatedHostGroups;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDedicatedHostGroupsResponseBody(Builder builder) {
        this.dedicatedHostGroups = builder.dedicatedHostGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostGroups
     */
    public DedicatedHostGroups getDedicatedHostGroups() {
        return this.dedicatedHostGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DedicatedHostGroups dedicatedHostGroups; 
        private String requestId; 

        /**
         * An array that consists of dedicated clusters returned.
         */
        public Builder dedicatedHostGroups(DedicatedHostGroups dedicatedHostGroups) {
            this.dedicatedHostGroups = dedicatedHostGroups;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedHostGroupsResponseBody build() {
            return new DescribeDedicatedHostGroupsResponseBody(this);
        } 

    } 

    public static class ZoneIDList extends TeaModel {
        @NameInMap("ZoneIDList")
        private java.util.List < String > zoneIDList;

        private ZoneIDList(Builder builder) {
            this.zoneIDList = builder.zoneIDList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneIDList create() {
            return builder().build();
        }

        /**
         * @return zoneIDList
         */
        public java.util.List < String > getZoneIDList() {
            return this.zoneIDList;
        }

        public static final class Builder {
            private java.util.List < String > zoneIDList; 

            /**
             * ZoneIDList.
             */
            public Builder zoneIDList(java.util.List < String > zoneIDList) {
                this.zoneIDList = zoneIDList;
                return this;
            }

            public ZoneIDList build() {
                return new ZoneIDList(this);
            } 

        } 

    }
    public static class DedicatedHostGroupsDedicatedHostGroups extends TeaModel {
        @NameInMap("AllocationPolicy")
        private String allocationPolicy;

        @NameInMap("BastionInstanceId")
        private String bastionInstanceId;

        @NameInMap("CpuAllocateRation")
        private Float cpuAllocateRation;

        @NameInMap("CpuAllocatedAmount")
        private Float cpuAllocatedAmount;

        @NameInMap("CpuAllocationRatio")
        private Integer cpuAllocationRatio;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DedicatedHostCountGroupByHostType")
        private java.util.Map < String, ? > dedicatedHostCountGroupByHostType;

        @NameInMap("DedicatedHostGroupDesc")
        private String dedicatedHostGroupDesc;

        @NameInMap("DedicatedHostGroupId")
        private String dedicatedHostGroupId;

        @NameInMap("DiskAllocateRation")
        private Float diskAllocateRation;

        @NameInMap("DiskAllocatedAmount")
        private Float diskAllocatedAmount;

        @NameInMap("DiskAllocationRatio")
        private Integer diskAllocationRatio;

        @NameInMap("DiskUsedAmount")
        private Float diskUsedAmount;

        @NameInMap("DiskUtility")
        private Float diskUtility;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("HostNumber")
        private Integer hostNumber;

        @NameInMap("HostReplacePolicy")
        private String hostReplacePolicy;

        @NameInMap("InstanceNumber")
        private Integer instanceNumber;

        @NameInMap("MemAllocateRation")
        private Float memAllocateRation;

        @NameInMap("MemAllocatedAmount")
        private Float memAllocatedAmount;

        @NameInMap("MemAllocationRatio")
        private Integer memAllocationRatio;

        @NameInMap("MemUsedAmount")
        private Float memUsedAmount;

        @NameInMap("MemUtility")
        private Float memUtility;

        @NameInMap("OpenPermission")
        private String openPermission;

        @NameInMap("Text")
        private String text;

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("ZoneIDList")
        private ZoneIDList zoneIDList;

        private DedicatedHostGroupsDedicatedHostGroups(Builder builder) {
            this.allocationPolicy = builder.allocationPolicy;
            this.bastionInstanceId = builder.bastionInstanceId;
            this.cpuAllocateRation = builder.cpuAllocateRation;
            this.cpuAllocatedAmount = builder.cpuAllocatedAmount;
            this.cpuAllocationRatio = builder.cpuAllocationRatio;
            this.createTime = builder.createTime;
            this.dedicatedHostCountGroupByHostType = builder.dedicatedHostCountGroupByHostType;
            this.dedicatedHostGroupDesc = builder.dedicatedHostGroupDesc;
            this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
            this.diskAllocateRation = builder.diskAllocateRation;
            this.diskAllocatedAmount = builder.diskAllocatedAmount;
            this.diskAllocationRatio = builder.diskAllocationRatio;
            this.diskUsedAmount = builder.diskUsedAmount;
            this.diskUtility = builder.diskUtility;
            this.engine = builder.engine;
            this.hostNumber = builder.hostNumber;
            this.hostReplacePolicy = builder.hostReplacePolicy;
            this.instanceNumber = builder.instanceNumber;
            this.memAllocateRation = builder.memAllocateRation;
            this.memAllocatedAmount = builder.memAllocatedAmount;
            this.memAllocationRatio = builder.memAllocationRatio;
            this.memUsedAmount = builder.memUsedAmount;
            this.memUtility = builder.memUtility;
            this.openPermission = builder.openPermission;
            this.text = builder.text;
            this.VPCId = builder.VPCId;
            this.zoneIDList = builder.zoneIDList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostGroupsDedicatedHostGroups create() {
            return builder().build();
        }

        /**
         * @return allocationPolicy
         */
        public String getAllocationPolicy() {
            return this.allocationPolicy;
        }

        /**
         * @return bastionInstanceId
         */
        public String getBastionInstanceId() {
            return this.bastionInstanceId;
        }

        /**
         * @return cpuAllocateRation
         */
        public Float getCpuAllocateRation() {
            return this.cpuAllocateRation;
        }

        /**
         * @return cpuAllocatedAmount
         */
        public Float getCpuAllocatedAmount() {
            return this.cpuAllocatedAmount;
        }

        /**
         * @return cpuAllocationRatio
         */
        public Integer getCpuAllocationRatio() {
            return this.cpuAllocationRatio;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dedicatedHostCountGroupByHostType
         */
        public java.util.Map < String, ? > getDedicatedHostCountGroupByHostType() {
            return this.dedicatedHostCountGroupByHostType;
        }

        /**
         * @return dedicatedHostGroupDesc
         */
        public String getDedicatedHostGroupDesc() {
            return this.dedicatedHostGroupDesc;
        }

        /**
         * @return dedicatedHostGroupId
         */
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        /**
         * @return diskAllocateRation
         */
        public Float getDiskAllocateRation() {
            return this.diskAllocateRation;
        }

        /**
         * @return diskAllocatedAmount
         */
        public Float getDiskAllocatedAmount() {
            return this.diskAllocatedAmount;
        }

        /**
         * @return diskAllocationRatio
         */
        public Integer getDiskAllocationRatio() {
            return this.diskAllocationRatio;
        }

        /**
         * @return diskUsedAmount
         */
        public Float getDiskUsedAmount() {
            return this.diskUsedAmount;
        }

        /**
         * @return diskUtility
         */
        public Float getDiskUtility() {
            return this.diskUtility;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return hostNumber
         */
        public Integer getHostNumber() {
            return this.hostNumber;
        }

        /**
         * @return hostReplacePolicy
         */
        public String getHostReplacePolicy() {
            return this.hostReplacePolicy;
        }

        /**
         * @return instanceNumber
         */
        public Integer getInstanceNumber() {
            return this.instanceNumber;
        }

        /**
         * @return memAllocateRation
         */
        public Float getMemAllocateRation() {
            return this.memAllocateRation;
        }

        /**
         * @return memAllocatedAmount
         */
        public Float getMemAllocatedAmount() {
            return this.memAllocatedAmount;
        }

        /**
         * @return memAllocationRatio
         */
        public Integer getMemAllocationRatio() {
            return this.memAllocationRatio;
        }

        /**
         * @return memUsedAmount
         */
        public Float getMemUsedAmount() {
            return this.memUsedAmount;
        }

        /**
         * @return memUtility
         */
        public Float getMemUtility() {
            return this.memUtility;
        }

        /**
         * @return openPermission
         */
        public String getOpenPermission() {
            return this.openPermission;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return zoneIDList
         */
        public ZoneIDList getZoneIDList() {
            return this.zoneIDList;
        }

        public static final class Builder {
            private String allocationPolicy; 
            private String bastionInstanceId; 
            private Float cpuAllocateRation; 
            private Float cpuAllocatedAmount; 
            private Integer cpuAllocationRatio; 
            private String createTime; 
            private java.util.Map < String, ? > dedicatedHostCountGroupByHostType; 
            private String dedicatedHostGroupDesc; 
            private String dedicatedHostGroupId; 
            private Float diskAllocateRation; 
            private Float diskAllocatedAmount; 
            private Integer diskAllocationRatio; 
            private Float diskUsedAmount; 
            private Float diskUtility; 
            private String engine; 
            private Integer hostNumber; 
            private String hostReplacePolicy; 
            private Integer instanceNumber; 
            private Float memAllocateRation; 
            private Float memAllocatedAmount; 
            private Integer memAllocationRatio; 
            private Float memUsedAmount; 
            private Float memUtility; 
            private String openPermission; 
            private String text; 
            private String VPCId; 
            private ZoneIDList zoneIDList; 

            /**
             * The policy based on which the system allocates resources in the dedicated cluster. Valid values:
             * <p>
             * 
             * *   **Evenly**: The system evenly allocates the resources to all the hosts in the dedicated cluster.
             * *   **Intensively**: The system preferentially allocates the resources to the heavily loaded hosts in the dedicated cluster.
             */
            public Builder allocationPolicy(String allocationPolicy) {
                this.allocationPolicy = allocationPolicy;
                return this;
            }

            /**
             * The ID of the bastion host.
             */
            public Builder bastionInstanceId(String bastionInstanceId) {
                this.bastionInstanceId = bastionInstanceId;
                return this;
            }

            /**
             * The percentage of allocated cores in the dedicated cluster. Unit: %.
             */
            public Builder cpuAllocateRation(Float cpuAllocateRation) {
                this.cpuAllocateRation = cpuAllocateRation;
                return this;
            }

            /**
             * The number of allocated cores in the dedicated cluster.
             */
            public Builder cpuAllocatedAmount(Float cpuAllocatedAmount) {
                this.cpuAllocatedAmount = cpuAllocatedAmount;
                return this;
            }

            /**
             * The core overcommitment ratio of the dedicated cluster. Unit: %. For more information about the core overcommitment ratio, see [Manage a dedicated cluster](~~182328~~).
             */
            public Builder cpuAllocationRatio(Integer cpuAllocationRatio) {
                this.cpuAllocationRatio = cpuAllocationRatio;
                return this;
            }

            /**
             * The timestamp when the dedicated cluster was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The type of storage media that is used for the hosts in the dedicated cluster. Valid values:
             * <p>
             * 
             * *   **dhg_cloud_ssd**: standard or enhanced solid-state drive (SSD)
             * *   **dhg_local_ssd**: local SSD
             */
            public Builder dedicatedHostCountGroupByHostType(java.util.Map < String, ? > dedicatedHostCountGroupByHostType) {
                this.dedicatedHostCountGroupByHostType = dedicatedHostCountGroupByHostType;
                return this;
            }

            /**
             * The name of the dedicated cluster.
             */
            public Builder dedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
                this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
                return this;
            }

            /**
             * The ID of the dedicated cluster.
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * The percentage of allocated disk space in the dedicated cluster. Unit: %.
             */
            public Builder diskAllocateRation(Float diskAllocateRation) {
                this.diskAllocateRation = diskAllocateRation;
                return this;
            }

            /**
             * The amount of allocated disk space in the dedicated cluster. Unit: GB.
             */
            public Builder diskAllocatedAmount(Float diskAllocatedAmount) {
                this.diskAllocatedAmount = diskAllocatedAmount;
                return this;
            }

            /**
             * The disk overcommitment ratio of the dedicated cluster. Unit: %. For more information about the disk overcommitment ratio, see [Manage a dedicated cluster](~~182328~~).
             */
            public Builder diskAllocationRatio(Integer diskAllocationRatio) {
                this.diskAllocationRatio = diskAllocationRatio;
                return this;
            }

            /**
             * The amount of used disk space in the dedicated cluster. Unit: GB.
             */
            public Builder diskUsedAmount(Float diskUsedAmount) {
                this.diskUsedAmount = diskUsedAmount;
                return this;
            }

            /**
             * The disk usage of the dedicated cluster. Unit: %.
             */
            public Builder diskUtility(Float diskUtility) {
                this.diskUtility = diskUtility;
                return this;
            }

            /**
             * The database engine that is run on the instances in the dedicated cluster.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The total number of hosts in the dedicated cluster.
             */
            public Builder hostNumber(Integer hostNumber) {
                this.hostNumber = hostNumber;
                return this;
            }

            /**
             * The policy based on which the system handles host failures. Valid values:
             * <p>
             * 
             * *   **Auto**: The system automatically replaces faulty hosts.
             * *   **Manual**: You must manually replace faulty hosts.
             */
            public Builder hostReplacePolicy(String hostReplacePolicy) {
                this.hostReplacePolicy = hostReplacePolicy;
                return this;
            }

            /**
             * The total number of instances in the dedicated cluster.
             */
            public Builder instanceNumber(Integer instanceNumber) {
                this.instanceNumber = instanceNumber;
                return this;
            }

            /**
             * The percentage of allocated memory space in the dedicated cluster. Unit: %.
             */
            public Builder memAllocateRation(Float memAllocateRation) {
                this.memAllocateRation = memAllocateRation;
                return this;
            }

            /**
             * The amount of allocated memory space in the dedicated cluster.
             */
            public Builder memAllocatedAmount(Float memAllocatedAmount) {
                this.memAllocatedAmount = memAllocatedAmount;
                return this;
            }

            /**
             * The memory overcommitment ratio of the dedicated cluster. Unit: %. For more information about the memory overcommitment ratio, see [Manage a dedicated cluster](~~182328~~).
             */
            public Builder memAllocationRatio(Integer memAllocationRatio) {
                this.memAllocationRatio = memAllocationRatio;
                return this;
            }

            /**
             * The amount of used memory space in the dedicated cluster. Unit: MB.
             */
            public Builder memUsedAmount(Float memUsedAmount) {
                this.memUsedAmount = memUsedAmount;
                return this;
            }

            /**
             * The memory usage of the dedicated cluster. Unit: %.
             */
            public Builder memUtility(Float memUtility) {
                this.memUtility = memUtility;
                return this;
            }

            /**
             * Indicates whether the operating system permissions of the hosts in the dedicated cluster can be granted. Valid values:
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
             * The name and ID of the dedicated cluster. The value of this parameter consists of two parts: the value of the **DedicatedHostGroupDesc** parameter and the value of the **DedicatedHostGroupId** parameter. Format: DedicatedHostGroupDesc/DedicatedHostGroupId.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) to which the dedicated cluster belongs.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * A list of zones to which the hosts of the dedicated cluster belong.
             */
            public Builder zoneIDList(ZoneIDList zoneIDList) {
                this.zoneIDList = zoneIDList;
                return this;
            }

            public DedicatedHostGroupsDedicatedHostGroups build() {
                return new DedicatedHostGroupsDedicatedHostGroups(this);
            } 

        } 

    }
    public static class DedicatedHostGroups extends TeaModel {
        @NameInMap("DedicatedHostGroups")
        private java.util.List < DedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups;

        private DedicatedHostGroups(Builder builder) {
            this.dedicatedHostGroups = builder.dedicatedHostGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostGroups create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostGroups
         */
        public java.util.List < DedicatedHostGroupsDedicatedHostGroups> getDedicatedHostGroups() {
            return this.dedicatedHostGroups;
        }

        public static final class Builder {
            private java.util.List < DedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups; 

            /**
             * An array that consists of dedicated clusters returned.
             */
            public Builder dedicatedHostGroups(java.util.List < DedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups) {
                this.dedicatedHostGroups = dedicatedHostGroups;
                return this;
            }

            public DedicatedHostGroups build() {
                return new DedicatedHostGroups(this);
            } 

        } 

    }
}
