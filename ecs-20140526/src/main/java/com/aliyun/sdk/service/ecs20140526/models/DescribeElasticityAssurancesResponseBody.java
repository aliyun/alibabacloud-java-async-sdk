// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticityAssurancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticityAssurancesResponseBody</p>
 */
public class DescribeElasticityAssurancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticityAssuranceSet")
    private ElasticityAssuranceSet elasticityAssuranceSet;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeElasticityAssurancesResponseBody(Builder builder) {
        this.elasticityAssuranceSet = builder.elasticityAssuranceSet;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticityAssurancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticityAssuranceSet
     */
    public ElasticityAssuranceSet getElasticityAssuranceSet() {
        return this.elasticityAssuranceSet;
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
        private ElasticityAssuranceSet elasticityAssuranceSet; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the elasticity assurances.
         */
        public Builder elasticityAssuranceSet(ElasticityAssuranceSet elasticityAssuranceSet) {
            this.elasticityAssuranceSet = elasticityAssuranceSet;
            return this;
        }

        /**
         * The maximum number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeElasticityAssurancesResponseBody build() {
            return new DescribeElasticityAssurancesResponseBody(this);
        } 

    } 

    public static class AllocatedResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("TotalAmount")
        private Integer totalAmount;

        @com.aliyun.core.annotation.NameInMap("UsedAmount")
        private Integer usedAmount;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private AllocatedResource(Builder builder) {
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
            private String instanceType; 
            private Integer totalAmount; 
            private Integer usedAmount; 
            private String zoneId; 

            /**
             * The instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The total number of instances for which capacity of an instance type is reserved.
             */
            public Builder totalAmount(Integer totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * The number of instances that have used the elasticity assurance.
             */
            public Builder usedAmount(Integer usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * The zone ID.
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
    public static class AllocatedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocatedResource")
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
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag.
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
        @com.aliyun.core.annotation.NameInMap("Tag")
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
        @com.aliyun.core.annotation.NameInMap("AllocatedResources")
        private AllocatedResources allocatedResources;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("LatestStartTime")
        private String latestStartTime;

        @com.aliyun.core.annotation.NameInMap("PrivatePoolOptionsId")
        private String privatePoolOptionsId;

        @com.aliyun.core.annotation.NameInMap("PrivatePoolOptionsMatchCriteria")
        private String privatePoolOptionsMatchCriteria;

        @com.aliyun.core.annotation.NameInMap("PrivatePoolOptionsName")
        private String privatePoolOptionsName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StartTimeType")
        private String startTimeType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TotalAssuranceTimes")
        private String totalAssuranceTimes;

        @com.aliyun.core.annotation.NameInMap("UsedAssuranceTimes")
        private Integer usedAssuranceTimes;

        private ElasticityAssuranceItem(Builder builder) {
            this.allocatedResources = builder.allocatedResources;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.latestStartTime = builder.latestStartTime;
            this.privatePoolOptionsId = builder.privatePoolOptionsId;
            this.privatePoolOptionsMatchCriteria = builder.privatePoolOptionsMatchCriteria;
            this.privatePoolOptionsName = builder.privatePoolOptionsName;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.startTime = builder.startTime;
            this.startTimeType = builder.startTimeType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.totalAssuranceTimes = builder.totalAssuranceTimes;
            this.usedAssuranceTimes = builder.usedAssuranceTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticityAssuranceItem create() {
            return builder().build();
        }

        /**
         * @return allocatedResources
         */
        public AllocatedResources getAllocatedResources() {
            return this.allocatedResources;
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
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return latestStartTime
         */
        public String getLatestStartTime() {
            return this.latestStartTime;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * @return totalAssuranceTimes
         */
        public String getTotalAssuranceTimes() {
            return this.totalAssuranceTimes;
        }

        /**
         * @return usedAssuranceTimes
         */
        public Integer getUsedAssuranceTimes() {
            return this.usedAssuranceTimes;
        }

        public static final class Builder {
            private AllocatedResources allocatedResources; 
            private String description; 
            private String endTime; 
            private String instanceChargeType; 
            private String latestStartTime; 
            private String privatePoolOptionsId; 
            private String privatePoolOptionsMatchCriteria; 
            private String privatePoolOptionsName; 
            private String regionId; 
            private String resourceGroupId; 
            private String startTime; 
            private String startTimeType; 
            private String status; 
            private Tags tags; 
            private String totalAssuranceTimes; 
            private Integer usedAssuranceTimes; 

            /**
             * Details about the allocated resources.
             */
            public Builder allocatedResources(AllocatedResources allocatedResources) {
                this.allocatedResources = allocatedResources;
                return this;
            }

            /**
             * The description of the elasticity assurance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the elasticity assurance expires.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The billing method of the instance. The value can be only PostPaid. Only pay-as-you-go instances can be created by using elasticity assurances.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * > This parameter is not publicly available.
             */
            public Builder latestStartTime(String latestStartTime) {
                this.latestStartTime = latestStartTime;
                return this;
            }

            /**
             * The ID of the elasticity assurance.
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
                return this;
            }

            /**
             * The type of the private pool associated with the elasticity assurance. Valid values:
             * <p>
             * 
             * *   Open: open private pool
             * *   Target: specific private pool
             */
            public Builder privatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
                this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
                return this;
            }

            /**
             * The name of the elasticity assurance.
             */
            public Builder privatePoolOptionsName(String privatePoolOptionsName) {
                this.privatePoolOptionsName = privatePoolOptionsName;
                return this;
            }

            /**
             * The region ID of the elasticity assurance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * The time when the elasticity assurance takes effect.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Indicates when the elasticity assurance takes effect. Valid values:
             * <p>
             * 
             * *   Now: The elasticity assurance takes effect immediately after it is created.
             * *   Later: The elasticity assurance takes effect at a specified time.
             */
            public Builder startTimeType(String startTimeType) {
                this.startTimeType = startTimeType;
                return this;
            }

            /**
             * The status of the elasticity assurance. Valid values:
             * <p>
             * 
             * *   Preparing
             * *   Prepared
             * *   Active
             * *   Released
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags of the elasticity assurance.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The total number of times that the elasticity assurance is applied.
             */
            public Builder totalAssuranceTimes(String totalAssuranceTimes) {
                this.totalAssuranceTimes = totalAssuranceTimes;
                return this;
            }

            /**
             * > This parameter is not publicly available.
             */
            public Builder usedAssuranceTimes(Integer usedAssuranceTimes) {
                this.usedAssuranceTimes = usedAssuranceTimes;
                return this;
            }

            public ElasticityAssuranceItem build() {
                return new ElasticityAssuranceItem(this);
            } 

        } 

    }
    public static class ElasticityAssuranceSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticityAssuranceItem")
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
