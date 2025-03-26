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
 * {@link DescribeDedicatedHostGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostGroupsResponseBody</p>
 */
public class DescribeDedicatedHostGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroups")
    private DedicatedHostGroups dedicatedHostGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDedicatedHostGroupsResponseBody model) {
            this.dedicatedHostGroups = model.dedicatedHostGroups;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about dedicated clusters returned.</p>
         */
        public Builder dedicatedHostGroups(DedicatedHostGroups dedicatedHostGroups) {
            this.dedicatedHostGroups = dedicatedHostGroups;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AB44DC0A-7E77-442A-97A9-C6418694CB22</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedHostGroupsResponseBody build() {
            return new DescribeDedicatedHostGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDedicatedHostGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostGroupsResponseBody</p>
     */
    public static class ZoneIDList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneIDList")
        private java.util.List<String> zoneIDList;

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
        public java.util.List<String> getZoneIDList() {
            return this.zoneIDList;
        }

        public static final class Builder {
            private java.util.List<String> zoneIDList; 

            private Builder() {
            } 

            private Builder(ZoneIDList model) {
                this.zoneIDList = model.zoneIDList;
            } 

            /**
             * ZoneIDList.
             */
            public Builder zoneIDList(java.util.List<String> zoneIDList) {
                this.zoneIDList = zoneIDList;
                return this;
            }

            public ZoneIDList build() {
                return new ZoneIDList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostGroupsResponseBody</p>
     */
    public static class DedicatedHostGroupsDedicatedHostGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationPolicy")
        private String allocationPolicy;

        @com.aliyun.core.annotation.NameInMap("BastionInstanceId")
        private String bastionInstanceId;

        @com.aliyun.core.annotation.NameInMap("CpuAllocateRation")
        private Float cpuAllocateRation;

        @com.aliyun.core.annotation.NameInMap("CpuAllocatedAmount")
        private Float cpuAllocatedAmount;

        @com.aliyun.core.annotation.NameInMap("CpuAllocationRatio")
        private Integer cpuAllocationRatio;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostCountGroupByHostType")
        private java.util.Map<String, ?> dedicatedHostCountGroupByHostType;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupDesc")
        private String dedicatedHostGroupDesc;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
        private String dedicatedHostGroupId;

        @com.aliyun.core.annotation.NameInMap("DiskAllocateRation")
        private Float diskAllocateRation;

        @com.aliyun.core.annotation.NameInMap("DiskAllocatedAmount")
        private Float diskAllocatedAmount;

        @com.aliyun.core.annotation.NameInMap("DiskAllocationRatio")
        private Integer diskAllocationRatio;

        @com.aliyun.core.annotation.NameInMap("DiskUsedAmount")
        private Float diskUsedAmount;

        @com.aliyun.core.annotation.NameInMap("DiskUtility")
        private Float diskUtility;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("HostNumber")
        private Integer hostNumber;

        @com.aliyun.core.annotation.NameInMap("HostReplacePolicy")
        private String hostReplacePolicy;

        @com.aliyun.core.annotation.NameInMap("InstanceNumber")
        private Integer instanceNumber;

        @com.aliyun.core.annotation.NameInMap("MemAllocateRation")
        private Float memAllocateRation;

        @com.aliyun.core.annotation.NameInMap("MemAllocatedAmount")
        private Float memAllocatedAmount;

        @com.aliyun.core.annotation.NameInMap("MemAllocationRatio")
        private Integer memAllocationRatio;

        @com.aliyun.core.annotation.NameInMap("MemUsedAmount")
        private Float memUsedAmount;

        @com.aliyun.core.annotation.NameInMap("MemUtility")
        private Float memUtility;

        @com.aliyun.core.annotation.NameInMap("OpenPermission")
        private String openPermission;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("ZoneIDList")
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
        public java.util.Map<String, ?> getDedicatedHostCountGroupByHostType() {
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
            private java.util.Map<String, ?> dedicatedHostCountGroupByHostType; 
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

            private Builder() {
            } 

            private Builder(DedicatedHostGroupsDedicatedHostGroups model) {
                this.allocationPolicy = model.allocationPolicy;
                this.bastionInstanceId = model.bastionInstanceId;
                this.cpuAllocateRation = model.cpuAllocateRation;
                this.cpuAllocatedAmount = model.cpuAllocatedAmount;
                this.cpuAllocationRatio = model.cpuAllocationRatio;
                this.createTime = model.createTime;
                this.dedicatedHostCountGroupByHostType = model.dedicatedHostCountGroupByHostType;
                this.dedicatedHostGroupDesc = model.dedicatedHostGroupDesc;
                this.dedicatedHostGroupId = model.dedicatedHostGroupId;
                this.diskAllocateRation = model.diskAllocateRation;
                this.diskAllocatedAmount = model.diskAllocatedAmount;
                this.diskAllocationRatio = model.diskAllocationRatio;
                this.diskUsedAmount = model.diskUsedAmount;
                this.diskUtility = model.diskUtility;
                this.engine = model.engine;
                this.hostNumber = model.hostNumber;
                this.hostReplacePolicy = model.hostReplacePolicy;
                this.instanceNumber = model.instanceNumber;
                this.memAllocateRation = model.memAllocateRation;
                this.memAllocatedAmount = model.memAllocatedAmount;
                this.memAllocationRatio = model.memAllocationRatio;
                this.memUsedAmount = model.memUsedAmount;
                this.memUtility = model.memUtility;
                this.openPermission = model.openPermission;
                this.text = model.text;
                this.VPCId = model.VPCId;
                this.zoneIDList = model.zoneIDList;
            } 

            /**
             * <p>The policy based on which the system allocates resources in the dedicated cluster. Valid values:</p>
             * <ul>
             * <li><strong>Evenly</strong>: The system evenly allocates the resources to all the hosts in the dedicated cluster.</li>
             * <li><strong>Intensively</strong>: The system preferentially allocates the resources to the heavily loaded hosts in the dedicated cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Evenly</p>
             */
            public Builder allocationPolicy(String allocationPolicy) {
                this.allocationPolicy = allocationPolicy;
                return this;
            }

            /**
             * <p>The ID of the bastion host.</p>
             * 
             * <strong>example:</strong>
             * <p>bastionhost-cn-m7xxxxxxxx</p>
             */
            public Builder bastionInstanceId(String bastionInstanceId) {
                this.bastionInstanceId = bastionInstanceId;
                return this;
            }

            /**
             * <p>The percentage of allocated cores in the dedicated cluster. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder cpuAllocateRation(Float cpuAllocateRation) {
                this.cpuAllocateRation = cpuAllocateRation;
                return this;
            }

            /**
             * <p>The number of allocated cores in the dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cpuAllocatedAmount(Float cpuAllocatedAmount) {
                this.cpuAllocatedAmount = cpuAllocatedAmount;
                return this;
            }

            /**
             * <p>The core overcommitment ratio of the dedicated cluster. Unit: %. For more information about the core overcommitment ratio, see <a href="https://help.aliyun.com/document_detail/182328.html">Manage a dedicated cluster</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder cpuAllocationRatio(Integer cpuAllocationRatio) {
                this.cpuAllocationRatio = cpuAllocationRatio;
                return this;
            }

            /**
             * <p>The timestamp when the dedicated cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1571125370000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The type of storage media that is used for the hosts in the dedicated cluster. Valid values:</p>
             * <ul>
             * <li><strong>dhg_cloud_ssd</strong>: cloud disks</li>
             * <li><strong>dhg_local_ssd</strong>: local disks</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dhg_cloud_ssd</p>
             */
            public Builder dedicatedHostCountGroupByHostType(java.util.Map<String, ?> dedicatedHostCountGroupByHostType) {
                this.dedicatedHostCountGroupByHostType = dedicatedHostCountGroupByHostType;
                return this;
            }

            /**
             * <p>The name of the dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>testHostGroup</p>
             */
            public Builder dedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
                this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
                return this;
            }

            /**
             * <p>The ID of the dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>dhg-7a9xxxxxxxx</p>
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * <p>The percentage of allocated disk space in the dedicated cluster. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>0.49</p>
             */
            public Builder diskAllocateRation(Float diskAllocateRation) {
                this.diskAllocateRation = diskAllocateRation;
                return this;
            }

            /**
             * <p>The amount of allocated disk space in the dedicated cluster. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder diskAllocatedAmount(Float diskAllocatedAmount) {
                this.diskAllocatedAmount = diskAllocatedAmount;
                return this;
            }

            /**
             * <p>The disk overcommitment ratio of the dedicated cluster. Unit: %. For more information about the core overcommitment ratio, see <a href="https://help.aliyun.com/document_detail/182328.html">Manage a dedicated cluster</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder diskAllocationRatio(Integer diskAllocationRatio) {
                this.diskAllocationRatio = diskAllocationRatio;
                return this;
            }

            /**
             * <p>The amount of used disk space in the dedicated cluster. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder diskUsedAmount(Float diskUsedAmount) {
                this.diskUsedAmount = diskUsedAmount;
                return this;
            }

            /**
             * <p>The disk usage of the dedicated cluster. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder diskUtility(Float diskUtility) {
                this.diskUtility = diskUtility;
                return this;
            }

            /**
             * <p>The database engine of the instances in the dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The total number of hosts in the dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder hostNumber(Integer hostNumber) {
                this.hostNumber = hostNumber;
                return this;
            }

            /**
             * <p>The policy that is used to handle host failures. Valid values:</p>
             * <ul>
             * <li><strong>Auto</strong>: The system automatically replaces faulty hosts.</li>
             * <li><strong>Manual</strong>: You must manually replace faulty hosts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Auto</p>
             */
            public Builder hostReplacePolicy(String hostReplacePolicy) {
                this.hostReplacePolicy = hostReplacePolicy;
                return this;
            }

            /**
             * <p>The total number of instances in the dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder instanceNumber(Integer instanceNumber) {
                this.instanceNumber = instanceNumber;
                return this;
            }

            /**
             * <p>The percentage of allocated memory space in the dedicated cluster. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>33.7</p>
             */
            public Builder memAllocateRation(Float memAllocateRation) {
                this.memAllocateRation = memAllocateRation;
                return this;
            }

            /**
             * <p>The amount of allocated memory space in the dedicated cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>16384</p>
             */
            public Builder memAllocatedAmount(Float memAllocatedAmount) {
                this.memAllocatedAmount = memAllocatedAmount;
                return this;
            }

            /**
             * <p>The memory overcommitment ratio of the dedicated cluster. Unit: %. For more information about the core overcommitment ratio, see <a href="https://help.aliyun.com/document_detail/182328.html">Manage a dedicated cluster</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder memAllocationRatio(Integer memAllocationRatio) {
                this.memAllocationRatio = memAllocationRatio;
                return this;
            }

            /**
             * <p>The amount of used memory space in the dedicated cluster. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder memUsedAmount(Float memUsedAmount) {
                this.memUsedAmount = memUsedAmount;
                return this;
            }

            /**
             * <p>The memory usage of the dedicated cluster. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder memUtility(Float memUtility) {
                this.memUtility = memUtility;
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
             * <p>The name and ID of the dedicated cluster. The value consists of <strong>DedicatedHostGroupDesc</strong> and <strong>DedicatedHostGroupId</strong>. Format: DedicatedHostGroupDesc/DedicatedHostGroupId.</p>
             * 
             * <strong>example:</strong>
             * <p>testHostGroup/dhg-7a9xxxxxxxx</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the dedicated cluster belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1oxxxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The zones to which the hosts of the dedicated cluster belong.</p>
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
    /**
     * 
     * {@link DescribeDedicatedHostGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostGroupsResponseBody</p>
     */
    public static class DedicatedHostGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostGroups")
        private java.util.List<DedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups;

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
        public java.util.List<DedicatedHostGroupsDedicatedHostGroups> getDedicatedHostGroups() {
            return this.dedicatedHostGroups;
        }

        public static final class Builder {
            private java.util.List<DedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups; 

            private Builder() {
            } 

            private Builder(DedicatedHostGroups model) {
                this.dedicatedHostGroups = model.dedicatedHostGroups;
            } 

            /**
             * <p>The information about dedicated clusters returned.</p>
             */
            public Builder dedicatedHostGroups(java.util.List<DedicatedHostGroupsDedicatedHostGroups> dedicatedHostGroups) {
                this.dedicatedHostGroups = dedicatedHostGroups;
                return this;
            }

            public DedicatedHostGroups build() {
                return new DedicatedHostGroups(this);
            } 

        } 

    }
}
