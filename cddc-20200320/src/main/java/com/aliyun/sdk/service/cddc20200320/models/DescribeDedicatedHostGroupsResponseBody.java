// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

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
         * The queried hosts.
         */
        public Builder dedicatedHostGroups(DedicatedHostGroups dedicatedHostGroups) {
            this.dedicatedHostGroups = dedicatedHostGroups;
            return this;
        }

        /**
         * The request ID.
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

        @NameInMap("Category")
        private String category;

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

        @NameInMap("DeployType")
        private String deployType;

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
            this.category = builder.category;
            this.cpuAllocateRation = builder.cpuAllocateRation;
            this.cpuAllocatedAmount = builder.cpuAllocatedAmount;
            this.cpuAllocationRatio = builder.cpuAllocationRatio;
            this.createTime = builder.createTime;
            this.dedicatedHostCountGroupByHostType = builder.dedicatedHostCountGroupByHostType;
            this.dedicatedHostGroupDesc = builder.dedicatedHostGroupDesc;
            this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
            this.deployType = builder.deployType;
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
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
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
            private String category; 
            private Float cpuAllocateRation; 
            private Float cpuAllocatedAmount; 
            private Integer cpuAllocationRatio; 
            private String createTime; 
            private java.util.Map < String, ? > dedicatedHostCountGroupByHostType; 
            private String dedicatedHostGroupDesc; 
            private String dedicatedHostGroupId; 
            private String deployType; 
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
             * The policy that is used to allocate host resources. Valid values:
             * <p>
             * 
             * *   **Evenly**: The system preferentially deploys database instances on the hosts where no resources or fewer resources are allocated. This maximizes system stability.
             * *   **Intensively**: The system preferentially deploys database instances on the hosts that are created earlier and have more allocated resources. This maximizes resource utilization.
             */
            public Builder allocationPolicy(String allocationPolicy) {
                this.allocationPolicy = allocationPolicy;
                return this;
            }

            /**
             * The ID of the primary instance deployed on the host. If no primary instance is deployed on the host, an empty string is returned.
             */
            public Builder bastionInstanceId(String bastionInstanceId) {
                this.bastionInstanceId = bastionInstanceId;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The CPU allocation ratio of the host.
             */
            public Builder cpuAllocateRation(Float cpuAllocateRation) {
                this.cpuAllocateRation = cpuAllocateRation;
                return this;
            }

            /**
             * The number of CPU cores allocated to the host.
             */
            public Builder cpuAllocatedAmount(Float cpuAllocatedAmount) {
                this.cpuAllocatedAmount = cpuAllocatedAmount;
                return this;
            }

            /**
             * The CPU overcommit ratio of the host.
             */
            public Builder cpuAllocationRatio(Integer cpuAllocationRatio) {
                this.cpuAllocationRatio = cpuAllocationRatio;
                return this;
            }

            /**
             * The time when the host was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The number of hosts by storage type.
             */
            public Builder dedicatedHostCountGroupByHostType(java.util.Map < String, ? > dedicatedHostCountGroupByHostType) {
                this.dedicatedHostCountGroupByHostType = dedicatedHostCountGroupByHostType;
                return this;
            }

            /**
             * The name of the dedicated cluster in which the host is created.
             */
            public Builder dedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
                this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
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
             * The instance deployment mode of the host.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * The disk allocation rate of the host.
             */
            public Builder diskAllocateRation(Float diskAllocateRation) {
                this.diskAllocateRation = diskAllocateRation;
                return this;
            }

            /**
             * The disk storage allocated to the host.
             */
            public Builder diskAllocatedAmount(Float diskAllocatedAmount) {
                this.diskAllocatedAmount = diskAllocatedAmount;
                return this;
            }

            /**
             * The storage overcommit ratio of the host.
             */
            public Builder diskAllocationRatio(Integer diskAllocationRatio) {
                this.diskAllocationRatio = diskAllocationRatio;
                return this;
            }

            /**
             * The disk storage used by the host.
             */
            public Builder diskUsedAmount(Float diskUsedAmount) {
                this.diskUsedAmount = diskUsedAmount;
                return this;
            }

            /**
             * The disk usage of the host.
             */
            public Builder diskUtility(Float diskUtility) {
                this.diskUtility = diskUtility;
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
             * The number of hosts.
             */
            public Builder hostNumber(Integer hostNumber) {
                this.hostNumber = hostNumber;
                return this;
            }

            /**
             * The policy that is used for host troubleshooting. Valid values:
             * <p>
             * 
             * *   Auto (default): The system automatically replaces faulty hosts.
             * *   Manual: You must manually replace faulty hosts.
             */
            public Builder hostReplacePolicy(String hostReplacePolicy) {
                this.hostReplacePolicy = hostReplacePolicy;
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
             * The memory allocation ratio of the host.
             */
            public Builder memAllocateRation(Float memAllocateRation) {
                this.memAllocateRation = memAllocateRation;
                return this;
            }

            /**
             * The amount of memory allocated to the host.
             */
            public Builder memAllocatedAmount(Float memAllocatedAmount) {
                this.memAllocatedAmount = memAllocatedAmount;
                return this;
            }

            /**
             * The memory overcommit ratio of the host.
             */
            public Builder memAllocationRatio(Integer memAllocationRatio) {
                this.memAllocationRatio = memAllocationRatio;
                return this;
            }

            /**
             * The amount of used memory.
             */
            public Builder memUsedAmount(Float memUsedAmount) {
                this.memUsedAmount = memUsedAmount;
                return this;
            }

            /**
             * The memory usage.
             */
            public Builder memUtility(Float memUtility) {
                this.memUtility = memUtility;
                return this;
            }

            /**
             * Indicates whether the host OS permissions are granted. Valid values:
             * <p>
             * 
             * *   **0 or 1**: no.
             * *   **2 or 3** (default): yes.
             * 
             * >  When you create a dedicated cluster that runs **MySQL**, **SQL Server**, or **PostgreSQL**, you can grant the host OS permissions based on your business requirements.
             */
            public Builder openPermission(String openPermission) {
                this.openPermission = openPermission;
                return this;
            }

            /**
             * The description of the host.
             */
            public Builder text(String text) {
                this.text = text;
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
             * ZoneIDList.
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
             * The queried hosts.
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
