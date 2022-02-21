// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticityAssurancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticityAssurancesResponseBody</p>
 */
public class DescribeElasticityAssurancesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("ElasticityAssuranceSet")
    private ElasticityAssuranceSet elasticityAssuranceSet;

    private DescribeElasticityAssurancesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.maxResults = builder.maxResults;
        this.elasticityAssuranceSet = builder.elasticityAssuranceSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticityAssurancesResponseBody create() {
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
     * @return elasticityAssuranceSet
     */
    public ElasticityAssuranceSet getElasticityAssuranceSet() {
        return this.elasticityAssuranceSet;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private Integer maxResults; 
        private ElasticityAssuranceSet elasticityAssuranceSet; 

        /**
         * The start flag of the next query.
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
         * The number of rows displayed on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A collection of details about elastic protection services.
         */
        public Builder elasticityAssuranceSet(ElasticityAssuranceSet elasticityAssuranceSet) {
            this.elasticityAssuranceSet = elasticityAssuranceSet;
            return this;
        }

        public DescribeElasticityAssurancesResponseBody build() {
            return new DescribeElasticityAssurancesResponseBody(this);
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
    public static class ElasticityAssuranceItem extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        private String privatePoolOptionsMatchCriteria;

        @NameInMap("PrivatePoolOptionsId")
        private String privatePoolOptionsId;

        @NameInMap("UsedAssuranceTimes")
        private Integer usedAssuranceTimes;

        @NameInMap("LatestStartTime")
        private String latestStartTime;

        @NameInMap("PrivatePoolOptionsName")
        private String privatePoolOptionsName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("TotalAssuranceTimes")
        private String totalAssuranceTimes;

        @NameInMap("AllocatedResources")
        private AllocatedResources allocatedResources;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("StartTimeType")
        private String startTimeType;

        private ElasticityAssuranceItem(Builder builder) {
            this.status = builder.status;
            this.privatePoolOptionsMatchCriteria = builder.privatePoolOptionsMatchCriteria;
            this.privatePoolOptionsId = builder.privatePoolOptionsId;
            this.usedAssuranceTimes = builder.usedAssuranceTimes;
            this.latestStartTime = builder.latestStartTime;
            this.privatePoolOptionsName = builder.privatePoolOptionsName;
            this.regionId = builder.regionId;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.description = builder.description;
            this.resourceGroupId = builder.resourceGroupId;
            this.totalAssuranceTimes = builder.totalAssuranceTimes;
            this.allocatedResources = builder.allocatedResources;
            this.tags = builder.tags;
            this.instanceChargeType = builder.instanceChargeType;
            this.startTimeType = builder.startTimeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticityAssuranceItem create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
         * @return usedAssuranceTimes
         */
        public Integer getUsedAssuranceTimes() {
            return this.usedAssuranceTimes;
        }

        /**
         * @return latestStartTime
         */
        public String getLatestStartTime() {
            return this.latestStartTime;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return totalAssuranceTimes
         */
        public String getTotalAssuranceTimes() {
            return this.totalAssuranceTimes;
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
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return startTimeType
         */
        public String getStartTimeType() {
            return this.startTimeType;
        }

        public static final class Builder {
            private String status; 
            private String privatePoolOptionsMatchCriteria; 
            private String privatePoolOptionsId; 
            private Integer usedAssuranceTimes; 
            private String latestStartTime; 
            private String privatePoolOptionsName; 
            private String regionId; 
            private String endTime; 
            private String startTime; 
            private String description; 
            private String resourceGroupId; 
            private String totalAssuranceTimes; 
            private AllocatedResources allocatedResources; 
            private Tags tags; 
            private String instanceChargeType; 
            private String startTimeType; 

            /**
             * The status of the elastic protection service. Possible values:
             * <p>
             * 
             * -Preparing: Preparing.
             * -Prepared: to take effect.
             * -Active: takes effect.
             * -Released: Released.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The matching mode of the elastic protection service. Possible values:
             * <p>
             * 
             * -Open: the elastic guarantee service in the Open mode.
             * -Target: the elastic Protection Service of the specified mode.
             */
            public Builder privatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
                this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
                return this;
            }

            /**
             * The ID of the elastic protection service.
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
                return this;
            }

            /**
             * > This parameter is not available.
             */
            public Builder usedAssuranceTimes(Integer usedAssuranceTimes) {
                this.usedAssuranceTimes = usedAssuranceTimes;
                return this;
            }

            /**
             * > This parameter is not available.
             */
            public Builder latestStartTime(String latestStartTime) {
                this.latestStartTime = latestStartTime;
                return this;
            }

            /**
             * The name of the elastic protection service.
             */
            public Builder privatePoolOptionsName(String privatePoolOptionsName) {
                this.privatePoolOptionsName = privatePoolOptionsName;
                return this;
            }

            /**
             * The ID of the region to which the elastic Protection Service belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The expiration time of the elastic protection service.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The effective time of the elastic protection service.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The description of the elastic protection service.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The total number of elastic protection services.
             */
            public Builder totalAssuranceTimes(String totalAssuranceTimes) {
                this.totalAssuranceTimes = totalAssuranceTimes;
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
             * The tag key-value pair associated with the elastic protection service.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The billing method of the instance. Possible value: PostPaid. Currently, only pay-as-you-go is supported.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The effective method of elastic protection. Possible values:
             * <p>
             * 
             * -Now: takes effect immediately.
             * -Later: takes effect at the specified time.
             */
            public Builder startTimeType(String startTimeType) {
                this.startTimeType = startTimeType;
                return this;
            }

            public ElasticityAssuranceItem build() {
                return new ElasticityAssuranceItem(this);
            } 

        } 

    }
    public static class ElasticityAssuranceSet extends TeaModel {
        @NameInMap("ElasticityAssuranceItem")
        private java.util.List < ElasticityAssuranceItem> elasticityAssuranceItem;

        private ElasticityAssuranceSet(Builder builder) {
            this.elasticityAssuranceItem = builder.elasticityAssuranceItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticityAssuranceSet create() {
            return builder().build();
        }

        /**
         * @return elasticityAssuranceItem
         */
        public java.util.List < ElasticityAssuranceItem> getElasticityAssuranceItem() {
            return this.elasticityAssuranceItem;
        }

        public static final class Builder {
            private java.util.List < ElasticityAssuranceItem> elasticityAssuranceItem; 

            /**
             * ElasticityAssuranceItem.
             */
            public Builder elasticityAssuranceItem(java.util.List < ElasticityAssuranceItem> elasticityAssuranceItem) {
                this.elasticityAssuranceItem = elasticityAssuranceItem;
                return this;
            }

            public ElasticityAssuranceSet build() {
                return new ElasticityAssuranceSet(this);
            } 

        } 

    }
}
