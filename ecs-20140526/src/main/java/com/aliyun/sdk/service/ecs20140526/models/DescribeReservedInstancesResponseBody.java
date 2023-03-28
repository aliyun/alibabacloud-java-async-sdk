// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ReservedInstances")
    private ReservedInstances reservedInstances;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeReservedInstancesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.reservedInstances = builder.reservedInstances;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservedInstancesResponseBody create() {
        return builder().build();
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
     * @return reservedInstances
     */
    public ReservedInstances getReservedInstances() {
        return this.reservedInstances;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private ReservedInstances reservedInstances; 
        private Integer totalCount; 

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
         * ReservedInstances.
         */
        public Builder reservedInstances(ReservedInstances reservedInstances) {
            this.reservedInstances = reservedInstances;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
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
             * LockReason.
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
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
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
        @NameInMap("AllocationStatus")
        private String allocationStatus;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("InstanceAmount")
        private Integer instanceAmount;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("OfferingType")
        private String offeringType;

        @NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ReservedInstanceId")
        private String reservedInstanceId;

        @NameInMap("ReservedInstanceName")
        private String reservedInstanceName;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("ZoneId")
        private String zoneId;

        private ReservedInstance(Builder builder) {
            this.allocationStatus = builder.allocationStatus;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.instanceAmount = builder.instanceAmount;
            this.instanceType = builder.instanceType;
            this.offeringType = builder.offeringType;
            this.operationLocks = builder.operationLocks;
            this.platform = builder.platform;
            this.regionId = builder.regionId;
            this.reservedInstanceId = builder.reservedInstanceId;
            this.reservedInstanceName = builder.reservedInstanceName;
            this.resourceGroupId = builder.resourceGroupId;
            this.scope = builder.scope;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.tags = builder.tags;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservedInstance create() {
            return builder().build();
        }

        /**
         * @return allocationStatus
         */
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceAmount
         */
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return offeringType
         */
        public String getOfferingType() {
            return this.offeringType;
        }

        /**
         * @return operationLocks
         */
        public OperationLocks getOperationLocks() {
            return this.operationLocks;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reservedInstanceId
         */
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        /**
         * @return reservedInstanceName
         */
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String allocationStatus; 
            private String creationTime; 
            private String description; 
            private String expiredTime; 
            private Integer instanceAmount; 
            private String instanceType; 
            private String offeringType; 
            private OperationLocks operationLocks; 
            private String platform; 
            private String regionId; 
            private String reservedInstanceId; 
            private String reservedInstanceName; 
            private String resourceGroupId; 
            private String scope; 
            private String startTime; 
            private String status; 
            private Tags tags; 
            private String zoneId; 

            /**
             * AllocationStatus.
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * InstanceAmount.
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
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
             * OfferingType.
             */
            public Builder offeringType(String offeringType) {
                this.offeringType = offeringType;
                return this;
            }

            /**
             * OperationLocks.
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ReservedInstanceId.
             */
            public Builder reservedInstanceId(String reservedInstanceId) {
                this.reservedInstanceId = reservedInstanceId;
                return this;
            }

            /**
             * ReservedInstanceName.
             */
            public Builder reservedInstanceName(String reservedInstanceName) {
                this.reservedInstanceName = reservedInstanceName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
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
