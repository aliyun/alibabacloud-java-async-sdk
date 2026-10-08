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
         * DedicatedHostGroups.
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
             * AllocationPolicy.
             */
            public Builder allocationPolicy(String allocationPolicy) {
                this.allocationPolicy = allocationPolicy;
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
             * CpuAllocateRation.
             */
            public Builder cpuAllocateRation(Float cpuAllocateRation) {
                this.cpuAllocateRation = cpuAllocateRation;
                return this;
            }

            /**
             * CpuAllocatedAmount.
             */
            public Builder cpuAllocatedAmount(Float cpuAllocatedAmount) {
                this.cpuAllocatedAmount = cpuAllocatedAmount;
                return this;
            }

            /**
             * CpuAllocationRatio.
             */
            public Builder cpuAllocationRatio(Integer cpuAllocationRatio) {
                this.cpuAllocationRatio = cpuAllocationRatio;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DedicatedHostCountGroupByHostType.
             */
            public Builder dedicatedHostCountGroupByHostType(java.util.Map<String, ?> dedicatedHostCountGroupByHostType) {
                this.dedicatedHostCountGroupByHostType = dedicatedHostCountGroupByHostType;
                return this;
            }

            /**
             * DedicatedHostGroupDesc.
             */
            public Builder dedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
                this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
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
             * DiskAllocateRation.
             */
            public Builder diskAllocateRation(Float diskAllocateRation) {
                this.diskAllocateRation = diskAllocateRation;
                return this;
            }

            /**
             * DiskAllocatedAmount.
             */
            public Builder diskAllocatedAmount(Float diskAllocatedAmount) {
                this.diskAllocatedAmount = diskAllocatedAmount;
                return this;
            }

            /**
             * DiskAllocationRatio.
             */
            public Builder diskAllocationRatio(Integer diskAllocationRatio) {
                this.diskAllocationRatio = diskAllocationRatio;
                return this;
            }

            /**
             * DiskUsedAmount.
             */
            public Builder diskUsedAmount(Float diskUsedAmount) {
                this.diskUsedAmount = diskUsedAmount;
                return this;
            }

            /**
             * DiskUtility.
             */
            public Builder diskUtility(Float diskUtility) {
                this.diskUtility = diskUtility;
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
             * HostNumber.
             */
            public Builder hostNumber(Integer hostNumber) {
                this.hostNumber = hostNumber;
                return this;
            }

            /**
             * HostReplacePolicy.
             */
            public Builder hostReplacePolicy(String hostReplacePolicy) {
                this.hostReplacePolicy = hostReplacePolicy;
                return this;
            }

            /**
             * InstanceNumber.
             */
            public Builder instanceNumber(Integer instanceNumber) {
                this.instanceNumber = instanceNumber;
                return this;
            }

            /**
             * MemAllocateRation.
             */
            public Builder memAllocateRation(Float memAllocateRation) {
                this.memAllocateRation = memAllocateRation;
                return this;
            }

            /**
             * MemAllocatedAmount.
             */
            public Builder memAllocatedAmount(Float memAllocatedAmount) {
                this.memAllocatedAmount = memAllocatedAmount;
                return this;
            }

            /**
             * MemAllocationRatio.
             */
            public Builder memAllocationRatio(Integer memAllocationRatio) {
                this.memAllocationRatio = memAllocationRatio;
                return this;
            }

            /**
             * MemUsedAmount.
             */
            public Builder memUsedAmount(Float memUsedAmount) {
                this.memUsedAmount = memUsedAmount;
                return this;
            }

            /**
             * MemUtility.
             */
            public Builder memUtility(Float memUtility) {
                this.memUtility = memUtility;
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
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
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
             * DedicatedHostGroups.
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
