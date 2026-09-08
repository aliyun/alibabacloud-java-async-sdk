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
 * {@link DescribeCapacityReservationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCapacityReservationsResponseBody</p>
 */
public class DescribeCapacityReservationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CapacityReservationSet")
    private CapacityReservationSet capacityReservationSet;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCapacityReservationsResponseBody(Builder builder) {
        this.capacityReservationSet = builder.capacityReservationSet;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapacityReservationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityReservationSet
     */
    public CapacityReservationSet getCapacityReservationSet() {
        return this.capacityReservationSet;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private CapacityReservationSet capacityReservationSet; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCapacityReservationsResponseBody model) {
            this.capacityReservationSet = model.capacityReservationSet;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CapacityReservationSet.
         */
        public Builder capacityReservationSet(CapacityReservationSet capacityReservationSet) {
            this.capacityReservationSet = capacityReservationSet;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCapacityReservationsResponseBody build() {
            return new DescribeCapacityReservationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapacityReservationsResponseBody</p>
     */
    public static class CapacityReservationUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("UsedAmount")
        private Integer usedAmount;

        private CapacityReservationUsage(Builder builder) {
            this.accountId = builder.accountId;
            this.serviceName = builder.serviceName;
            this.usedAmount = builder.usedAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityReservationUsage create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return usedAmount
         */
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        public static final class Builder {
            private String accountId; 
            private String serviceName; 
            private Integer usedAmount; 

            private Builder() {
            } 

            private Builder(CapacityReservationUsage model) {
                this.accountId = model.accountId;
                this.serviceName = model.serviceName;
                this.usedAmount = model.usedAmount;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * UsedAmount.
             */
            public Builder usedAmount(Integer usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            public CapacityReservationUsage build() {
                return new CapacityReservationUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapacityReservationsResponseBody</p>
     */
    public static class CapacityReservationUsages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityReservationUsage")
        private java.util.List<CapacityReservationUsage> capacityReservationUsage;

        private CapacityReservationUsages(Builder builder) {
            this.capacityReservationUsage = builder.capacityReservationUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityReservationUsages create() {
            return builder().build();
        }

        /**
         * @return capacityReservationUsage
         */
        public java.util.List<CapacityReservationUsage> getCapacityReservationUsage() {
            return this.capacityReservationUsage;
        }

        public static final class Builder {
            private java.util.List<CapacityReservationUsage> capacityReservationUsage; 

            private Builder() {
            } 

            private Builder(CapacityReservationUsages model) {
                this.capacityReservationUsage = model.capacityReservationUsage;
            } 

            /**
             * CapacityReservationUsage.
             */
            public Builder capacityReservationUsage(java.util.List<CapacityReservationUsage> capacityReservationUsage) {
                this.capacityReservationUsage = capacityReservationUsage;
                return this;
            }

            public CapacityReservationUsages build() {
                return new CapacityReservationUsages(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapacityReservationsResponseBody</p>
     */
    public static class AllocatedResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableAmount")
        private Integer availableAmount;

        @com.aliyun.core.annotation.NameInMap("CapacityReservationUsages")
        private CapacityReservationUsages capacityReservationUsages;

        @com.aliyun.core.annotation.NameInMap("FailedAmount")
        private Integer failedAmount;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("LockedAmount")
        private Integer lockedAmount;

        @com.aliyun.core.annotation.NameInMap("TotalAmount")
        private Integer totalAmount;

        @com.aliyun.core.annotation.NameInMap("UsedAmount")
        private Integer usedAmount;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private AllocatedResource(Builder builder) {
            this.availableAmount = builder.availableAmount;
            this.capacityReservationUsages = builder.capacityReservationUsages;
            this.failedAmount = builder.failedAmount;
            this.instanceType = builder.instanceType;
            this.lockedAmount = builder.lockedAmount;
            this.totalAmount = builder.totalAmount;
            this.usedAmount = builder.usedAmount;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllocatedResource create() {
            return builder().build();
        }

        /**
         * @return availableAmount
         */
        public Integer getAvailableAmount() {
            return this.availableAmount;
        }

        /**
         * @return capacityReservationUsages
         */
        public CapacityReservationUsages getCapacityReservationUsages() {
            return this.capacityReservationUsages;
        }

        /**
         * @return failedAmount
         */
        public Integer getFailedAmount() {
            return this.failedAmount;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return lockedAmount
         */
        public Integer getLockedAmount() {
            return this.lockedAmount;
        }

        /**
         * @return totalAmount
         */
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return usedAmount
         */
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer availableAmount; 
            private CapacityReservationUsages capacityReservationUsages; 
            private Integer failedAmount; 
            private String instanceType; 
            private Integer lockedAmount; 
            private Integer totalAmount; 
            private Integer usedAmount; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(AllocatedResource model) {
                this.availableAmount = model.availableAmount;
                this.capacityReservationUsages = model.capacityReservationUsages;
                this.failedAmount = model.failedAmount;
                this.instanceType = model.instanceType;
                this.lockedAmount = model.lockedAmount;
                this.totalAmount = model.totalAmount;
                this.usedAmount = model.usedAmount;
                this.zoneId = model.zoneId;
            } 

            /**
             * AvailableAmount.
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * CapacityReservationUsages.
             */
            public Builder capacityReservationUsages(CapacityReservationUsages capacityReservationUsages) {
                this.capacityReservationUsages = capacityReservationUsages;
                return this;
            }

            /**
             * FailedAmount.
             */
            public Builder failedAmount(Integer failedAmount) {
                this.failedAmount = failedAmount;
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
             * LockedAmount.
             */
            public Builder lockedAmount(Integer lockedAmount) {
                this.lockedAmount = lockedAmount;
                return this;
            }

            /**
             * TotalAmount.
             */
            public Builder totalAmount(Integer totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * UsedAmount.
             */
            public Builder usedAmount(Integer usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * zoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AllocatedResource build() {
                return new AllocatedResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapacityReservationsResponseBody</p>
     */
    public static class AllocatedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocatedResource")
        private java.util.List<AllocatedResource> allocatedResource;

        private AllocatedResources(Builder builder) {
            this.allocatedResource = builder.allocatedResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllocatedResources create() {
            return builder().build();
        }

        /**
         * @return allocatedResource
         */
        public java.util.List<AllocatedResource> getAllocatedResource() {
            return this.allocatedResource;
        }

        public static final class Builder {
            private java.util.List<AllocatedResource> allocatedResource; 

            private Builder() {
            } 

            private Builder(AllocatedResources model) {
                this.allocatedResource = model.allocatedResource;
            } 

            /**
             * AllocatedResource.
             */
            public Builder allocatedResource(java.util.List<AllocatedResource> allocatedResource) {
                this.allocatedResource = allocatedResource;
                return this;
            }

            public AllocatedResources build() {
                return new AllocatedResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapacityReservationsResponseBody</p>
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
    /**
     * 
     * {@link DescribeCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapacityReservationsResponseBody</p>
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
     * {@link DescribeCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapacityReservationsResponseBody</p>
     */
    public static class CapacityReservationItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocatedResources")
        private AllocatedResources allocatedResources;

        @com.aliyun.core.annotation.NameInMap("CapacityReservationOwnerId")
        private String capacityReservationOwnerId;

        @com.aliyun.core.annotation.NameInMap("DeliveryTime")
        private String deliveryTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EndTimeType")
        private String endTimeType;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("PrivatePoolOptionsId")
        private String privatePoolOptionsId;

        @com.aliyun.core.annotation.NameInMap("PrivatePoolOptionsMatchCriteria")
        private String privatePoolOptionsMatchCriteria;

        @com.aliyun.core.annotation.NameInMap("PrivatePoolOptionsName")
        private String privatePoolOptionsName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReservedInstanceId")
        private String reservedInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SavingPlanId")
        private String savingPlanId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StartTimeType")
        private String startTimeType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TimeSlot")
        private String timeSlot;

        @com.aliyun.core.annotation.NameInMap("UnlockedTime")
        private String unlockedTime;

        private CapacityReservationItem(Builder builder) {
            this.allocatedResources = builder.allocatedResources;
            this.capacityReservationOwnerId = builder.capacityReservationOwnerId;
            this.deliveryTime = builder.deliveryTime;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.endTimeType = builder.endTimeType;
            this.instanceChargeType = builder.instanceChargeType;
            this.platform = builder.platform;
            this.privatePoolOptionsId = builder.privatePoolOptionsId;
            this.privatePoolOptionsMatchCriteria = builder.privatePoolOptionsMatchCriteria;
            this.privatePoolOptionsName = builder.privatePoolOptionsName;
            this.regionId = builder.regionId;
            this.reservedInstanceId = builder.reservedInstanceId;
            this.resourceGroupId = builder.resourceGroupId;
            this.savingPlanId = builder.savingPlanId;
            this.startTime = builder.startTime;
            this.startTimeType = builder.startTimeType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.timeSlot = builder.timeSlot;
            this.unlockedTime = builder.unlockedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityReservationItem create() {
            return builder().build();
        }

        /**
         * @return allocatedResources
         */
        public AllocatedResources getAllocatedResources() {
            return this.allocatedResources;
        }

        /**
         * @return capacityReservationOwnerId
         */
        public String getCapacityReservationOwnerId() {
            return this.capacityReservationOwnerId;
        }

        /**
         * @return deliveryTime
         */
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return endTimeType
         */
        public String getEndTimeType() {
            return this.endTimeType;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return privatePoolOptionsId
         */
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        /**
         * @return privatePoolOptionsMatchCriteria
         */
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        /**
         * @return privatePoolOptionsName
         */
        public String getPrivatePoolOptionsName() {
            return this.privatePoolOptionsName;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return savingPlanId
         */
        public String getSavingPlanId() {
            return this.savingPlanId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return startTimeType
         */
        public String getStartTimeType() {
            return this.startTimeType;
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
         * @return timeSlot
         */
        public String getTimeSlot() {
            return this.timeSlot;
        }

        /**
         * @return unlockedTime
         */
        public String getUnlockedTime() {
            return this.unlockedTime;
        }

        public static final class Builder {
            private AllocatedResources allocatedResources; 
            private String capacityReservationOwnerId; 
            private String deliveryTime; 
            private String description; 
            private String endTime; 
            private String endTimeType; 
            private String instanceChargeType; 
            private String platform; 
            private String privatePoolOptionsId; 
            private String privatePoolOptionsMatchCriteria; 
            private String privatePoolOptionsName; 
            private String regionId; 
            private String reservedInstanceId; 
            private String resourceGroupId; 
            private String savingPlanId; 
            private String startTime; 
            private String startTimeType; 
            private String status; 
            private Tags tags; 
            private String timeSlot; 
            private String unlockedTime; 

            private Builder() {
            } 

            private Builder(CapacityReservationItem model) {
                this.allocatedResources = model.allocatedResources;
                this.capacityReservationOwnerId = model.capacityReservationOwnerId;
                this.deliveryTime = model.deliveryTime;
                this.description = model.description;
                this.endTime = model.endTime;
                this.endTimeType = model.endTimeType;
                this.instanceChargeType = model.instanceChargeType;
                this.platform = model.platform;
                this.privatePoolOptionsId = model.privatePoolOptionsId;
                this.privatePoolOptionsMatchCriteria = model.privatePoolOptionsMatchCriteria;
                this.privatePoolOptionsName = model.privatePoolOptionsName;
                this.regionId = model.regionId;
                this.reservedInstanceId = model.reservedInstanceId;
                this.resourceGroupId = model.resourceGroupId;
                this.savingPlanId = model.savingPlanId;
                this.startTime = model.startTime;
                this.startTimeType = model.startTimeType;
                this.status = model.status;
                this.tags = model.tags;
                this.timeSlot = model.timeSlot;
                this.unlockedTime = model.unlockedTime;
            } 

            /**
             * AllocatedResources.
             */
            public Builder allocatedResources(AllocatedResources allocatedResources) {
                this.allocatedResources = allocatedResources;
                return this;
            }

            /**
             * CapacityReservationOwnerId.
             */
            public Builder capacityReservationOwnerId(String capacityReservationOwnerId) {
                this.capacityReservationOwnerId = capacityReservationOwnerId;
                return this;
            }

            /**
             * DeliveryTime.
             */
            public Builder deliveryTime(String deliveryTime) {
                this.deliveryTime = deliveryTime;
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
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EndTimeType.
             */
            public Builder endTimeType(String endTimeType) {
                this.endTimeType = endTimeType;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
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
             * PrivatePoolOptionsId.
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
                return this;
            }

            /**
             * PrivatePoolOptionsMatchCriteria.
             */
            public Builder privatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
                this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
                return this;
            }

            /**
             * PrivatePoolOptionsName.
             */
            public Builder privatePoolOptionsName(String privatePoolOptionsName) {
                this.privatePoolOptionsName = privatePoolOptionsName;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SavingPlanId.
             */
            public Builder savingPlanId(String savingPlanId) {
                this.savingPlanId = savingPlanId;
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
             * StartTimeType.
             */
            public Builder startTimeType(String startTimeType) {
                this.startTimeType = startTimeType;
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
             * TimeSlot.
             */
            public Builder timeSlot(String timeSlot) {
                this.timeSlot = timeSlot;
                return this;
            }

            /**
             * UnlockedTime.
             */
            public Builder unlockedTime(String unlockedTime) {
                this.unlockedTime = unlockedTime;
                return this;
            }

            public CapacityReservationItem build() {
                return new CapacityReservationItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCapacityReservationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapacityReservationsResponseBody</p>
     */
    public static class CapacityReservationSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityReservationItem")
        private java.util.List<CapacityReservationItem> capacityReservationItem;

        private CapacityReservationSet(Builder builder) {
            this.capacityReservationItem = builder.capacityReservationItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityReservationSet create() {
            return builder().build();
        }

        /**
         * @return capacityReservationItem
         */
        public java.util.List<CapacityReservationItem> getCapacityReservationItem() {
            return this.capacityReservationItem;
        }

        public static final class Builder {
            private java.util.List<CapacityReservationItem> capacityReservationItem; 

            private Builder() {
            } 

            private Builder(CapacityReservationSet model) {
                this.capacityReservationItem = model.capacityReservationItem;
            } 

            /**
             * CapacityReservationItem.
             */
            public Builder capacityReservationItem(java.util.List<CapacityReservationItem> capacityReservationItem) {
                this.capacityReservationItem = capacityReservationItem;
                return this;
            }

            public CapacityReservationSet build() {
                return new CapacityReservationSet(this);
            } 

        } 

    }
}
