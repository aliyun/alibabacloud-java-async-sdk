// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReservedInstancesResponseBody</p>
 */
public class DescribeReservedInstancesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("ReservedInstances")
    private ReservedInstances reservedInstances;

    private DescribeReservedInstancesResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.reservedInstances = builder.reservedInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservedInstancesResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return reservedInstances
     */
    public ReservedInstances getReservedInstances() {
        return this.reservedInstances;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private ReservedInstances reservedInstances; 

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The page number of the reserved instance list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of reserved instances.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Returns the details of Reserved Instances in an array of ReservedInstance.
         */
        public Builder reservedInstances(ReservedInstances reservedInstances) {
            this.reservedInstances = reservedInstances;
            return this;
        }

        public DescribeReservedInstancesResponseBody build() {
            return new DescribeReservedInstancesResponseBody(this);
        } 

    } 

    public static class OperationLock extends TeaModel {
        @NameInMap("LockReason")
        private String lockReason;

        private OperationLock(Builder builder) {
            this.lockReason = builder.lockReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLock create() {
            return builder().build();
        }

        /**
         * @return lockReason
         */
        public String getLockReason() {
            return this.lockReason;
        }

        public static final class Builder {
            private String lockReason; 

            /**
             * Lock reason.
             */
            public Builder lockReason(String lockReason) {
                this.lockReason = lockReason;
                return this;
            }

            public OperationLock build() {
                return new OperationLock(this);
            } 

        } 

    }
    public static class OperationLocks extends TeaModel {
        @NameInMap("OperationLock")
        private java.util.List < OperationLock> operationLock;

        private OperationLocks(Builder builder) {
            this.operationLock = builder.operationLock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLocks create() {
            return builder().build();
        }

        /**
         * @return operationLock
         */
        public java.util.List < OperationLock> getOperationLock() {
            return this.operationLock;
        }

        public static final class Builder {
            private java.util.List < OperationLock> operationLock; 

            /**
             * OperationLock.
             */
            public Builder operationLock(java.util.List < OperationLock> operationLock) {
                this.operationLock = operationLock;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagKey")
        private String tagKey;

        private Tag(Builder builder) {
            this.tagValue = builder.tagValue;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String tagValue; 
            private String tagKey; 

            /**
             * Reserved Instance voucher label value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * Reserved Instance voucher label key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ReservedInstance extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("ReservedInstanceName")
        private String reservedInstanceName;

        @NameInMap("ReservedInstanceId")
        private String reservedInstanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceAmount")
        private Integer instanceAmount;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("OfferingType")
        private String offeringType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("AllocationStatus")
        private String allocationStatus;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @NameInMap("Tags")
        private Tags tags;

        private ReservedInstance(Builder builder) {
            this.status = builder.status;
            this.creationTime = builder.creationTime;
            this.reservedInstanceName = builder.reservedInstanceName;
            this.reservedInstanceId = builder.reservedInstanceId;
            this.instanceType = builder.instanceType;
            this.instanceAmount = builder.instanceAmount;
            this.regionId = builder.regionId;
            this.offeringType = builder.offeringType;
            this.startTime = builder.startTime;
            this.description = builder.description;
            this.allocationStatus = builder.allocationStatus;
            this.expiredTime = builder.expiredTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.zoneId = builder.zoneId;
            this.platform = builder.platform;
            this.scope = builder.scope;
            this.operationLocks = builder.operationLocks;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservedInstance create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return reservedInstanceName
         */
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        /**
         * @return reservedInstanceId
         */
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceAmount
         */
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return offeringType
         */
        public String getOfferingType() {
            return this.offeringType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return allocationStatus
         */
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return operationLocks
         */
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String status; 
            private String creationTime; 
            private String reservedInstanceName; 
            private String reservedInstanceId; 
            private String instanceType; 
            private Integer instanceAmount; 
            private String regionId; 
            private String offeringType; 
            private String startTime; 
            private String description; 
            private String allocationStatus; 
            private String expiredTime; 
            private String resourceGroupId; 
            private String zoneId; 
            private String platform; 
            private String scope; 
            private OperationLocks operationLocks; 
            private Tags tags; 

            /**
             * State.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The name.
             */
            public Builder reservedInstanceName(String reservedInstanceName) {
                this.reservedInstanceName = reservedInstanceName;
                return this;
            }

            /**
             * The ID of the reserved instance.
             */
            public Builder reservedInstanceId(String reservedInstanceId) {
                this.reservedInstanceId = reservedInstanceId;
                return this;
            }

            /**
             * The type of the pay-as-you-go instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The number of pay-as-you-go instances of the same specification can be matched.
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The payment type.
             */
            public Builder offeringType(String offeringType) {
                this.offeringType = offeringType;
                return this;
            }

            /**
             * Effective time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * When AllocationType value for Shared when this parameter indicates the reserved instance voucher assignment status. Possible values:
             * <p>
             * 
             * -allocated: Reserved instances that have been allocated to other users.
             * -beAllocated: Reserved Instances allocated to other users.
             * 
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * The expiration time.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The operating system type of the image used by the instance. Possible values:
             * <p>
             * 
             * -Windows:Windows Server-type operating system.
             * 
             * -Linux:Linux and Unix-like operating systems.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The range.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * Indicates whether the instance is locked.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * The tag pair of the reserved instance.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public ReservedInstance build() {
                return new ReservedInstance(this);
            } 

        } 

    }
    public static class ReservedInstances extends TeaModel {
        @NameInMap("ReservedInstance")
        private java.util.List < ReservedInstance> reservedInstance;

        private ReservedInstances(Builder builder) {
            this.reservedInstance = builder.reservedInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservedInstances create() {
            return builder().build();
        }

        /**
         * @return reservedInstance
         */
        public java.util.List < ReservedInstance> getReservedInstance() {
            return this.reservedInstance;
        }

        public static final class Builder {
            private java.util.List < ReservedInstance> reservedInstance; 

            /**
             * ReservedInstance.
             */
            public Builder reservedInstance(java.util.List < ReservedInstance> reservedInstance) {
                this.reservedInstance = reservedInstance;
                return this;
            }

            public ReservedInstances build() {
                return new ReservedInstances(this);
            } 

        } 

    }
}
