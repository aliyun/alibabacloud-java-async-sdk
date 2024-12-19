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

        /**
         * <p>Details of the capacity reservations.</p>
         */
        public Builder capacityReservationSet(CapacityReservationSet capacityReservationSet) {
            this.capacityReservationSet = capacityReservationSet;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.If NextToken is empty, no next page exists.</p>
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
         * <p>The total number of entries returned.</p>
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

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>105909559088****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute.aliyuncs.com</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The number of instances that are used by the Alibaba Cloud account or service.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("TotalAmount")
        private Integer totalAmount;

        @com.aliyun.core.annotation.NameInMap("UsedAmount")
        private Integer usedAmount;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private AllocatedResource(Builder builder) {
            this.availableAmount = builder.availableAmount;
            this.capacityReservationUsages = builder.capacityReservationUsages;
            this.instanceType = builder.instanceType;
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
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
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
            private String instanceType; 
            private Integer totalAmount; 
            private Integer usedAmount; 
            private String zoneId; 

            /**
             * <p>The number of available instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * <p>Details of instance usage.</p>
             */
            public Builder capacityReservationUsages(CapacityReservationUsages capacityReservationUsages) {
                this.capacityReservationUsages = capacityReservationUsages;
                return this;
            }

            /**
             * <p>The instance type of the instances.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The total number of instances for which the capacity of an instance type is reserved.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalAmount(Integer totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * <p>The number of instances that have used the capacity reservation.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder usedAmount(Integer usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
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

        private CapacityReservationItem(Builder builder) {
            this.allocatedResources = builder.allocatedResources;
            this.capacityReservationOwnerId = builder.capacityReservationOwnerId;
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

        public static final class Builder {
            private AllocatedResources allocatedResources; 
            private String capacityReservationOwnerId; 
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

            /**
             * <p>Details of the allocated resources.</p>
             */
            public Builder allocatedResources(AllocatedResources allocatedResources) {
                this.allocatedResources = allocatedResources;
                return this;
            }

            /**
             * <p>The ID of the capacity reservation owner.</p>
             * 
             * <strong>example:</strong>
             * <p>100************7</p>
             */
            public Builder capacityReservationOwnerId(String capacityReservationOwnerId) {
                this.capacityReservationOwnerId = capacityReservationOwnerId;
                return this;
            }

            /**
             * <p>The description of the capacity reservation.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the capacity reservation expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-19T03:02Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The release mode of the capacity reservation. Valid values:</p>
             * <ul>
             * <li>Limited: The capacity reservation is automatically released at a specified time.</li>
             * <li>Unlimited: The capacity reservation is manually released. You can release the capacity reservation anytime.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlimited</p>
             */
            public Builder endTimeType(String endTimeType) {
                this.endTimeType = endTimeType;
                return this;
            }

            /**
             * <p>The billing method of the instances created by using the capacity reservation. Valid values:</p>
             * <ul>
             * <li>PostPaid: pay-as-you-go.</li>
             * <li>PrePaid: subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The operating system type of the instances created by using the capacity reservation. Valid values:</p>
             * <ul>
             * <li>windows</li>
             * <li>linux</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The ID of the capacity reservation.</p>
             * 
             * <strong>example:</strong>
             * <p>crp-bp1gubrkqutenqdd****</p>
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
                return this;
            }

            /**
             * <p>The type of the private pool generated after the capacity reservation takes effect. Valid values:</p>
             * <ul>
             * <li>Open: open private pool.</li>
             * <li>Target: targeted private pool.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Open</p>
             */
            public Builder privatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
                this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
                return this;
            }

            /**
             * <p>The name of the capacity reservation.</p>
             * 
             * <strong>example:</strong>
             * <p>crpTestName</p>
             */
            public Builder privatePoolOptionsName(String privatePoolOptionsName) {
                this.privatePoolOptionsName = privatePoolOptionsName;
                return this;
            }

            /**
             * <p>The region ID of the capacity reservation.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the reserved instance used with the capacity reservation.</p>
             * 
             * <strong>example:</strong>
             * <p>ri-bpzhex2ulpzf53****</p>
             */
            public Builder reservedInstanceId(String reservedInstanceId) {
                this.reservedInstanceId = reservedInstanceId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the capacity reservation belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the savings plan used with the capacity reservation.</p>
             * 
             * <strong>example:</strong>
             * <p>spn-c29b5e18pJMT****</p>
             */
            public Builder savingPlanId(String savingPlanId) {
                this.savingPlanId = savingPlanId;
                return this;
            }

            /**
             * <p>The time when the capacity reservation takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-19T02:01Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The mode in which the capacity reservation takes effect. Valid values:</p>
             * <ul>
             * <li>Now: The capacity reservation takes effect immediately after it is created.</li>
             * <li>Later: The capacity reservation takes effect at a specified time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Now</p>
             */
            public Builder startTimeType(String startTimeType) {
                this.startTimeType = startTimeType;
                return this;
            }

            /**
             * <p>The status of the capacity reservation. Valid values:</p>
             * <ul>
             * <li>Pending: The capacity reservation is being initialized.</li>
             * <li>Preparing: The capacity reservation is being prepared.</li>
             * <li>Prepared: The capacity reservation is to take effect.</li>
             * <li>Active: The capacity reservation is in effect.</li>
             * <li>Released: The capacity reservation has been released manually or automatically when it expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags that are added to the capacity reservation.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder timeSlot(String timeSlot) {
                this.timeSlot = timeSlot;
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
