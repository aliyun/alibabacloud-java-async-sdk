// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCapacityReservationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCapacityReservationsResponseBody</p>
 */
public class DescribeCapacityReservationsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("CapacityReservationSet")
    private CapacityReservationSet capacityReservationSet;

    private DescribeCapacityReservationsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.maxResults = builder.maxResults;
        this.capacityReservationSet = builder.capacityReservationSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapacityReservationsResponseBody create() {
        return builder().build();
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

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return capacityReservationSet
     */
    public CapacityReservationSet getCapacityReservationSet() {
        return this.capacityReservationSet;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private Integer maxResults; 
        private CapacityReservationSet capacityReservationSet; 

        /**
         * The start flag of the next query in the capacity reservation service.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The number of records that meet the query criteria.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The number of rows displayed on each page of the capacity reservation service.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A collection of capacity reservation service details.
         */
        public Builder capacityReservationSet(CapacityReservationSet capacityReservationSet) {
            this.capacityReservationSet = capacityReservationSet;
            return this;
        }

        public DescribeCapacityReservationsResponseBody build() {
            return new DescribeCapacityReservationsResponseBody(this);
        } 

    } 

    public static class AllocatedResource extends TeaModel {
        @NameInMap("UsedAmount")
        private Integer usedAmount;

        @NameInMap("TotalAmount")
        private Integer totalAmount;

        @NameInMap("zoneId")
        private String zoneId;

        @NameInMap("InstanceType")
        private String instanceType;

        private AllocatedResource(Builder builder) {
            this.usedAmount = builder.usedAmount;
            this.totalAmount = builder.totalAmount;
            this.zoneId = builder.zoneId;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllocatedResource create() {
            return builder().build();
        }

        /**
         * @return usedAmount
         */
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        /**
         * @return totalAmount
         */
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer usedAmount; 
            private Integer totalAmount; 
            private String zoneId; 
            private String instanceType; 

            /**
             * The number of used instances.
             */
            public Builder usedAmount(Integer usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * The total number of instances to be reserved within an instance type.
             */
            public Builder totalAmount(Integer totalAmount) {
                this.totalAmount = totalAmount;
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
             * The instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public AllocatedResource build() {
                return new AllocatedResource(this);
            } 

        } 

    }
    public static class AllocatedResources extends TeaModel {
        @NameInMap("AllocatedResource")
        private java.util.List < AllocatedResource> allocatedResource;

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
        public java.util.List < AllocatedResource> getAllocatedResource() {
            return this.allocatedResource;
        }

        public static final class Builder {
            private java.util.List < AllocatedResource> allocatedResource; 

            /**
             * AllocatedResource.
             */
            public Builder allocatedResource(java.util.List < AllocatedResource> allocatedResource) {
                this.allocatedResource = allocatedResource;
                return this;
            }

            public AllocatedResources build() {
                return new AllocatedResources(this);
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
             * The value of the tag.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The key of the tag.
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
    public static class CapacityReservationItem extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("TimeSlot")
        private String timeSlot;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        private String privatePoolOptionsMatchCriteria;

        @NameInMap("PrivatePoolOptionsId")
        private String privatePoolOptionsId;

        @NameInMap("PrivatePoolOptionsName")
        private String privatePoolOptionsName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTimeType")
        private String endTimeType;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("AllocatedResources")
        private AllocatedResources allocatedResources;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("StartTimeType")
        private String startTimeType;

        private CapacityReservationItem(Builder builder) {
            this.status = builder.status;
            this.timeSlot = builder.timeSlot;
            this.privatePoolOptionsMatchCriteria = builder.privatePoolOptionsMatchCriteria;
            this.privatePoolOptionsId = builder.privatePoolOptionsId;
            this.privatePoolOptionsName = builder.privatePoolOptionsName;
            this.regionId = builder.regionId;
            this.instanceChargeType = builder.instanceChargeType;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.description = builder.description;
            this.endTimeType = builder.endTimeType;
            this.resourceGroupId = builder.resourceGroupId;
            this.platform = builder.platform;
            this.allocatedResources = builder.allocatedResources;
            this.tags = builder.tags;
            this.startTimeType = builder.startTimeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityReservationItem create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeSlot
         */
        public String getTimeSlot() {
            return this.timeSlot;
        }

        /**
         * @return privatePoolOptionsMatchCriteria
         */
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        /**
         * @return privatePoolOptionsId
         */
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
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
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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
         * @return endTimeType
         */
        public String getEndTimeType() {
            return this.endTimeType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return allocatedResources
         */
        public AllocatedResources getAllocatedResources() {
            return this.allocatedResources;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return startTimeType
         */
        public String getStartTimeType() {
            return this.startTimeType;
        }

        public static final class Builder {
            private String status; 
            private String timeSlot; 
            private String privatePoolOptionsMatchCriteria; 
            private String privatePoolOptionsId; 
            private String privatePoolOptionsName; 
            private String regionId; 
            private String instanceChargeType; 
            private String endTime; 
            private String startTime; 
            private String description; 
            private String endTimeType; 
            private String resourceGroupId; 
            private String platform; 
            private AllocatedResources allocatedResources; 
            private Tags tags; 
            private String startTimeType; 

            /**
             * The status of the subscription service. Possible values:
             * <p>
             * 
             * -Pending: initialization.
             * -Preparing: Preparing.
             * -Prepared: to take effect.
             * -Active: takes effect.
             * -Released: Released, including manual release and automatic release upon expiration.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * > This parameter is being invited for testing and is not currently available.
             */
            public Builder timeSlot(String timeSlot) {
                this.timeSlot = timeSlot;
                return this;
            }

            /**
             * Capacity reservation service after the entry into force generated private resource pool type. Possible values:
             * <p>
             * 
             * -Open: Open mode.
             * -Target: The dedicated mode.
             * 
             */
            public Builder privatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
                this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
                return this;
            }

            /**
             * The ID of the subscription service.
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
                return this;
            }

            /**
             * Capacity Scheduled service name.
             */
            public Builder privatePoolOptionsName(String privatePoolOptionsName) {
                this.privatePoolOptionsName = privatePoolOptionsName;
                return this;
            }

            /**
             * The ID of the region to which the capacity reservation service belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The billing method of the instance in the capacity reservation service. Possible values:
             * <p>
             * 
             * -PostPaid: pay-as-you-go.
             * -PrePaid: subscription.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The expiration time of the subscription service.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Capacity reservation service effective time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Capacity Scheduled service description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The expiration method of the capacity reservation service. Possible values:
             * <p>
             * 
             * -Limited: release at the specified time.
             * -Unlimited: manual release. No time limit.
             */
            public Builder endTimeType(String endTimeType) {
                this.endTimeType = endTimeType;
                return this;
            }

            /**
             * The ID of the resource group to which the capacity reservation service belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The operating system of the matched instance. Possible values:
             * <p>
             * 
             * -windows.
             * -linux.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The resource allocation details.
             */
            public Builder allocatedResources(AllocatedResources allocatedResources) {
                this.allocatedResources = allocatedResources;
                return this;
            }

            /**
             * Capacity Scheduled service binding label key value pair information.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Capacity scheduled entry into force. Possible values:
             * <p>
             * 
             * -Now: takes effect immediately.
             * -Later: takes effect at the specified time.
             */
            public Builder startTimeType(String startTimeType) {
                this.startTimeType = startTimeType;
                return this;
            }

            public CapacityReservationItem build() {
                return new CapacityReservationItem(this);
            } 

        } 

    }
    public static class CapacityReservationSet extends TeaModel {
        @NameInMap("CapacityReservationItem")
        private java.util.List < CapacityReservationItem> capacityReservationItem;

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
        public java.util.List < CapacityReservationItem> getCapacityReservationItem() {
            return this.capacityReservationItem;
        }

        public static final class Builder {
            private java.util.List < CapacityReservationItem> capacityReservationItem; 

            /**
             * CapacityReservationItem.
             */
            public Builder capacityReservationItem(java.util.List < CapacityReservationItem> capacityReservationItem) {
                this.capacityReservationItem = capacityReservationItem;
                return this;
            }

            public CapacityReservationSet build() {
                return new CapacityReservationSet(this);
            } 

        } 

    }
}
