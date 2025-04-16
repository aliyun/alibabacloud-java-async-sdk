// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeReservedInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReservedInstancesResponseBody</p>
 */
public class DescribeReservedInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReservedInstances")
    private ReservedInstances reservedInstances;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeReservedInstancesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.reservedInstances = model.reservedInstances;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E572643C-6A29-49D6-9D4E-6CFA4E063A3E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about the reserved instances.</p>
         */
        public Builder reservedInstances(ReservedInstances reservedInstances) {
            this.reservedInstances = reservedInstances;
            return this;
        }

        /**
         * <p>The total number of reserved instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeReservedInstancesResponseBody build() {
            return new DescribeReservedInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReservedInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedInstancesResponseBody</p>
     */
    public static class OperationLock extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockReason")
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

            private Builder() {
            } 

            private Builder(OperationLock model) {
                this.lockReason = model.lockReason;
            } 

            /**
             * <p>The reason why the instance is locked.</p>
             * 
             * <strong>example:</strong>
             * <p>security</p>
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
    /**
     * 
     * {@link DescribeReservedInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedInstancesResponseBody</p>
     */
    public static class OperationLocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationLock")
        private java.util.List<OperationLock> operationLock;

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
        public java.util.List<OperationLock> getOperationLock() {
            return this.operationLock;
        }

        public static final class Builder {
            private java.util.List<OperationLock> operationLock; 

            private Builder() {
            } 

            private Builder(OperationLocks model) {
                this.operationLock = model.operationLock;
            } 

            /**
             * OperationLock.
             */
            public Builder operationLock(java.util.List<OperationLock> operationLock) {
                this.operationLock = operationLock;
                return this;
            }

            public OperationLocks build() {
                return new OperationLocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReservedInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedInstancesResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link DescribeReservedInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReservedInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedInstancesResponseBody</p>
     */
    public static class ReservedInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationStatus")
        private String allocationStatus;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("InstanceAmount")
        private Integer instanceAmount;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("OfferingType")
        private String offeringType;

        @com.aliyun.core.annotation.NameInMap("OperationLocks")
        private OperationLocks operationLocks;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReservedInstanceId")
        private String reservedInstanceId;

        @com.aliyun.core.annotation.NameInMap("ReservedInstanceName")
        private String reservedInstanceName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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

            private Builder() {
            } 

            private Builder(ReservedInstance model) {
                this.allocationStatus = model.allocationStatus;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.expiredTime = model.expiredTime;
                this.instanceAmount = model.instanceAmount;
                this.instanceType = model.instanceType;
                this.offeringType = model.offeringType;
                this.operationLocks = model.operationLocks;
                this.platform = model.platform;
                this.regionId = model.regionId;
                this.reservedInstanceId = model.reservedInstanceId;
                this.reservedInstanceName = model.reservedInstanceName;
                this.resourceGroupId = model.resourceGroupId;
                this.scope = model.scope;
                this.startTime = model.startTime;
                this.status = model.status;
                this.tags = model.tags;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>Indicates the sharing status of the reserved instance when the AllocationType parameter is set to Shared. Valid values:</p>
             * <ul>
             * <li>allocated: The reserved instance is allocated to another account.</li>
             * <li>beAllocated: The reserved instance is allocated by another account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>allocated</p>
             */
            public Builder allocationStatus(String allocationStatus) {
                this.allocationStatus = allocationStatus;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-10T12:07Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-10T12:07Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The number of pay-as-you-go instances that are of the same instance type as the reserved instance and can be matched to the reserved instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
                return this;
            }

            /**
             * <p>The instance type of the pay-as-you-go instances that can be matched to the reserved instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The payment option.</p>
             * 
             * <strong>example:</strong>
             * <p>All Upfront</p>
             */
            public Builder offeringType(String offeringType) {
                this.offeringType = offeringType;
                return this;
            }

            /**
             * <p>Details about the lock status of the reserved instance.</p>
             */
            public Builder operationLocks(OperationLocks operationLocks) {
                this.operationLocks = operationLocks;
                return this;
            }

            /**
             * <p>The operating system of the image used by the instance. Valid values:</p>
             * <ul>
             * <li>Windows</li>
             * <li>Linux</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The reserved instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ri-bpzhex2ulpzf53****</p>
             */
            public Builder reservedInstanceId(String reservedInstanceId) {
                this.reservedInstanceId = reservedInstanceId;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>riZbpzhex2ulpzf53****</p>
             */
            public Builder reservedInstanceName(String reservedInstanceName) {
                this.reservedInstanceName = reservedInstanceName;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>EcsDocTest</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The scope.</p>
             * 
             * <strong>example:</strong>
             * <p>region</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The effective time.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-10T12:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the reserved instance.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-z</p>
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
    /**
     * 
     * {@link DescribeReservedInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedInstancesResponseBody</p>
     */
    public static class ReservedInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReservedInstance")
        private java.util.List<ReservedInstance> reservedInstance;

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
        public java.util.List<ReservedInstance> getReservedInstance() {
            return this.reservedInstance;
        }

        public static final class Builder {
            private java.util.List<ReservedInstance> reservedInstance; 

            private Builder() {
            } 

            private Builder(ReservedInstances model) {
                this.reservedInstance = model.reservedInstance;
            } 

            /**
             * ReservedInstance.
             */
            public Builder reservedInstance(java.util.List<ReservedInstance> reservedInstance) {
                this.reservedInstance = reservedInstance;
                return this;
            }

            public ReservedInstances build() {
                return new ReservedInstances(this);
            } 

        } 

    }
}
