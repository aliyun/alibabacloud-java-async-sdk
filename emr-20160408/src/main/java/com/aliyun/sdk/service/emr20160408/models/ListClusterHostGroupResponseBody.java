// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterHostGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterHostGroupResponseBody</p>
 */
public class ListClusterHostGroupResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("HostGroupList")
    private HostGroupList hostGroupList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListClusterHostGroupResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.hostGroupList = builder.hostGroupList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterHostGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return hostGroupList
     */
    public HostGroupList getHostGroupList() {
        return this.hostGroupList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String clusterId; 
        private HostGroupList hostGroupList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * HostGroupList.
         */
        public Builder hostGroupList(HostGroupList hostGroupList) {
            this.hostGroupList = hostGroupList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListClusterHostGroupResponseBody build() {
            return new ListClusterHostGroupResponseBody(this);
        } 

    } 

    public static class HostGroup extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CostSavingPercent")
        private Float costSavingPercent;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("DataDiskCount")
        private Integer dataDiskCount;

        @NameInMap("DataDiskSize")
        private Integer dataDiskSize;

        @NameInMap("DataDiskType")
        private String dataDiskType;

        @NameInMap("HostGroupChangeStatus")
        private String hostGroupChangeStatus;

        @NameInMap("HostGroupChangeType")
        private String hostGroupChangeType;

        @NameInMap("HostGroupId")
        private String hostGroupId;

        @NameInMap("HostGroupName")
        private String hostGroupName;

        @NameInMap("HostGroupSubType")
        private String hostGroupSubType;

        @NameInMap("HostGroupType")
        private String hostGroupType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("LockReason")
        private String lockReason;

        @NameInMap("LockType")
        private String lockType;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("NodeCount")
        private Integer nodeCount;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("ScalingGroupActiveStatus")
        private String scalingGroupActiveStatus;

        @NameInMap("ScalingGroupBizId")
        private String scalingGroupBizId;

        @NameInMap("ScalingGroupConfigState")
        private String scalingGroupConfigState;

        @NameInMap("ScalingGroupMaxNode")
        private Integer scalingGroupMaxNode;

        @NameInMap("ScalingGroupMinNode")
        private Integer scalingGroupMinNode;

        @NameInMap("ScalingInMode")
        private String scalingInMode;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SystemDiskCount")
        private Integer systemDiskCount;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("SystemDiskType")
        private String systemDiskType;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("gmtCreate")
        private String gmtCreate;

        @NameInMap("gmtModified")
        private String gmtModified;

        private HostGroup(Builder builder) {
            this.chargeType = builder.chargeType;
            this.comment = builder.comment;
            this.costSavingPercent = builder.costSavingPercent;
            this.cpu = builder.cpu;
            this.dataDiskCount = builder.dataDiskCount;
            this.dataDiskSize = builder.dataDiskSize;
            this.dataDiskType = builder.dataDiskType;
            this.hostGroupChangeStatus = builder.hostGroupChangeStatus;
            this.hostGroupChangeType = builder.hostGroupChangeType;
            this.hostGroupId = builder.hostGroupId;
            this.hostGroupName = builder.hostGroupName;
            this.hostGroupSubType = builder.hostGroupSubType;
            this.hostGroupType = builder.hostGroupType;
            this.instanceType = builder.instanceType;
            this.lockReason = builder.lockReason;
            this.lockType = builder.lockType;
            this.memory = builder.memory;
            this.nodeCount = builder.nodeCount;
            this.payType = builder.payType;
            this.scalingGroupActiveStatus = builder.scalingGroupActiveStatus;
            this.scalingGroupBizId = builder.scalingGroupBizId;
            this.scalingGroupConfigState = builder.scalingGroupConfigState;
            this.scalingGroupMaxNode = builder.scalingGroupMaxNode;
            this.scalingGroupMinNode = builder.scalingGroupMinNode;
            this.scalingInMode = builder.scalingInMode;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.systemDiskCount = builder.systemDiskCount;
            this.systemDiskSize = builder.systemDiskSize;
            this.systemDiskType = builder.systemDiskType;
            this.vswitchId = builder.vswitchId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroup create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return costSavingPercent
         */
        public Float getCostSavingPercent() {
            return this.costSavingPercent;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return dataDiskCount
         */
        public Integer getDataDiskCount() {
            return this.dataDiskCount;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return dataDiskType
         */
        public String getDataDiskType() {
            return this.dataDiskType;
        }

        /**
         * @return hostGroupChangeStatus
         */
        public String getHostGroupChangeStatus() {
            return this.hostGroupChangeStatus;
        }

        /**
         * @return hostGroupChangeType
         */
        public String getHostGroupChangeType() {
            return this.hostGroupChangeType;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        /**
         * @return hostGroupName
         */
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        /**
         * @return hostGroupSubType
         */
        public String getHostGroupSubType() {
            return this.hostGroupSubType;
        }

        /**
         * @return hostGroupType
         */
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        /**
         * @return lockType
         */
        public String getLockType() {
            return this.lockType;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return scalingGroupActiveStatus
         */
        public String getScalingGroupActiveStatus() {
            return this.scalingGroupActiveStatus;
        }

        /**
         * @return scalingGroupBizId
         */
        public String getScalingGroupBizId() {
            return this.scalingGroupBizId;
        }

        /**
         * @return scalingGroupConfigState
         */
        public String getScalingGroupConfigState() {
            return this.scalingGroupConfigState;
        }

        /**
         * @return scalingGroupMaxNode
         */
        public Integer getScalingGroupMaxNode() {
            return this.scalingGroupMaxNode;
        }

        /**
         * @return scalingGroupMinNode
         */
        public Integer getScalingGroupMinNode() {
            return this.scalingGroupMinNode;
        }

        /**
         * @return scalingInMode
         */
        public String getScalingInMode() {
            return this.scalingInMode;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemDiskCount
         */
        public Integer getSystemDiskCount() {
            return this.systemDiskCount;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return systemDiskType
         */
        public String getSystemDiskType() {
            return this.systemDiskType;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        public static final class Builder {
            private String chargeType; 
            private String comment; 
            private Float costSavingPercent; 
            private Integer cpu; 
            private Integer dataDiskCount; 
            private Integer dataDiskSize; 
            private String dataDiskType; 
            private String hostGroupChangeStatus; 
            private String hostGroupChangeType; 
            private String hostGroupId; 
            private String hostGroupName; 
            private String hostGroupSubType; 
            private String hostGroupType; 
            private String instanceType; 
            private String lockReason; 
            private String lockType; 
            private Integer memory; 
            private Integer nodeCount; 
            private String payType; 
            private String scalingGroupActiveStatus; 
            private String scalingGroupBizId; 
            private String scalingGroupConfigState; 
            private Integer scalingGroupMaxNode; 
            private Integer scalingGroupMinNode; 
            private String scalingInMode; 
            private String securityGroupId; 
            private String status; 
            private Integer systemDiskCount; 
            private Integer systemDiskSize; 
            private String systemDiskType; 
            private String vswitchId; 
            private String gmtCreate; 
            private String gmtModified; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CostSavingPercent.
             */
            public Builder costSavingPercent(Float costSavingPercent) {
                this.costSavingPercent = costSavingPercent;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * DataDiskCount.
             */
            public Builder dataDiskCount(Integer dataDiskCount) {
                this.dataDiskCount = dataDiskCount;
                return this;
            }

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * DataDiskType.
             */
            public Builder dataDiskType(String dataDiskType) {
                this.dataDiskType = dataDiskType;
                return this;
            }

            /**
             * HostGroupChangeStatus.
             */
            public Builder hostGroupChangeStatus(String hostGroupChangeStatus) {
                this.hostGroupChangeStatus = hostGroupChangeStatus;
                return this;
            }

            /**
             * HostGroupChangeType.
             */
            public Builder hostGroupChangeType(String hostGroupChangeType) {
                this.hostGroupChangeType = hostGroupChangeType;
                return this;
            }

            /**
             * HostGroupId.
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * HostGroupName.
             */
            public Builder hostGroupName(String hostGroupName) {
                this.hostGroupName = hostGroupName;
                return this;
            }

            /**
             * HostGroupSubType.
             */
            public Builder hostGroupSubType(String hostGroupSubType) {
                this.hostGroupSubType = hostGroupSubType;
                return this;
            }

            /**
             * HostGroupType.
             */
            public Builder hostGroupType(String hostGroupType) {
                this.hostGroupType = hostGroupType;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * LockReason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            /**
             * LockType.
             */
            public Builder lockType(String lockType) {
                this.lockType = lockType;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * ScalingGroupActiveStatus.
             */
            public Builder scalingGroupActiveStatus(String scalingGroupActiveStatus) {
                this.scalingGroupActiveStatus = scalingGroupActiveStatus;
                return this;
            }

            /**
             * ScalingGroupBizId.
             */
            public Builder scalingGroupBizId(String scalingGroupBizId) {
                this.scalingGroupBizId = scalingGroupBizId;
                return this;
            }

            /**
             * ScalingGroupConfigState.
             */
            public Builder scalingGroupConfigState(String scalingGroupConfigState) {
                this.scalingGroupConfigState = scalingGroupConfigState;
                return this;
            }

            /**
             * ScalingGroupMaxNode.
             */
            public Builder scalingGroupMaxNode(Integer scalingGroupMaxNode) {
                this.scalingGroupMaxNode = scalingGroupMaxNode;
                return this;
            }

            /**
             * ScalingGroupMinNode.
             */
            public Builder scalingGroupMinNode(Integer scalingGroupMinNode) {
                this.scalingGroupMinNode = scalingGroupMinNode;
                return this;
            }

            /**
             * ScalingInMode.
             */
            public Builder scalingInMode(String scalingInMode) {
                this.scalingInMode = scalingInMode;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SystemDiskCount.
             */
            public Builder systemDiskCount(Integer systemDiskCount) {
                this.systemDiskCount = systemDiskCount;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * SystemDiskType.
             */
            public Builder systemDiskType(String systemDiskType) {
                this.systemDiskType = systemDiskType;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            public HostGroup build() {
                return new HostGroup(this);
            } 

        } 

    }
    public static class HostGroupList extends TeaModel {
        @NameInMap("HostGroup")
        private java.util.List < HostGroup> hostGroup;

        private HostGroupList(Builder builder) {
            this.hostGroup = builder.hostGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostGroupList create() {
            return builder().build();
        }

        /**
         * @return hostGroup
         */
        public java.util.List < HostGroup> getHostGroup() {
            return this.hostGroup;
        }

        public static final class Builder {
            private java.util.List < HostGroup> hostGroup; 

            /**
             * HostGroup.
             */
            public Builder hostGroup(java.util.List < HostGroup> hostGroup) {
                this.hostGroup = hostGroup;
                return this;
            }

            public HostGroupList build() {
                return new HostGroupList(this);
            } 

        } 

    }
}
