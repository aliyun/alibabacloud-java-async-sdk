// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>Details about the elasticity assurances.</p>
         */
        public Builder elasticityAssuranceSet(ElasticityAssuranceSet elasticityAssuranceSet) {
            this.elasticityAssuranceSet = elasticityAssuranceSet;
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
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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

        public DescribeElasticityAssurancesResponseBody build() {
            return new DescribeElasticityAssurancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeElasticityAssurancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticityAssurancesResponseBody</p>
     */
    public static class ElasticityAssuranceUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("UsedAmount")
        private Integer usedAmount;

        private ElasticityAssuranceUsage(Builder builder) {
            this.accountId = builder.accountId;
            this.serviceName = builder.serviceName;
            this.usedAmount = builder.usedAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticityAssuranceUsage create() {
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

            public ElasticityAssuranceUsage build() {
                return new ElasticityAssuranceUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeElasticityAssurancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticityAssurancesResponseBody</p>
     */
    public static class ElasticityAssuranceUsages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticityAssuranceUsage")
        private java.util.List < ElasticityAssuranceUsage> elasticityAssuranceUsage;

        private ElasticityAssuranceUsages(Builder builder) {
            this.elasticityAssuranceUsage = builder.elasticityAssuranceUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticityAssuranceUsages create() {
            return builder().build();
        }

        /**
         * @return elasticityAssuranceUsage
         */
        public java.util.List < ElasticityAssuranceUsage> getElasticityAssuranceUsage() {
            return this.elasticityAssuranceUsage;
        }

        public static final class Builder {
            private java.util.List < ElasticityAssuranceUsage> elasticityAssuranceUsage; 

            /**
             * ElasticityAssuranceUsage.
             */
            public Builder elasticityAssuranceUsage(java.util.List < ElasticityAssuranceUsage> elasticityAssuranceUsage) {
                this.elasticityAssuranceUsage = elasticityAssuranceUsage;
                return this;
            }

            public ElasticityAssuranceUsages build() {
                return new ElasticityAssuranceUsages(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeElasticityAssurancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticityAssurancesResponseBody</p>
     */
    public static class AllocatedResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableAmount")
        private Integer availableAmount;

        @com.aliyun.core.annotation.NameInMap("ElasticityAssuranceUsages")
        private ElasticityAssuranceUsages elasticityAssuranceUsages;

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
            this.elasticityAssuranceUsages = builder.elasticityAssuranceUsages;
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
         * @return elasticityAssuranceUsages
         */
        public ElasticityAssuranceUsages getElasticityAssuranceUsages() {
            return this.elasticityAssuranceUsages;
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
            private ElasticityAssuranceUsages elasticityAssuranceUsages; 
            private String instanceType; 
            private Integer totalAmount; 
            private Integer usedAmount; 
            private String zoneId; 

            /**
             * AvailableAmount.
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * ElasticityAssuranceUsages.
             */
            public Builder elasticityAssuranceUsages(ElasticityAssuranceUsages elasticityAssuranceUsages) {
                this.elasticityAssuranceUsages = elasticityAssuranceUsages;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The total number of instances for which capacity of an instance type is reserved.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalAmount(Integer totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * <p>The number of instances that have used the elasticity assurance.</p>
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
     * {@link DescribeElasticityAssurancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticityAssurancesResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeElasticityAssurancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticityAssurancesResponseBody</p>
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
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
     * {@link DescribeElasticityAssurancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticityAssurancesResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeElasticityAssurancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticityAssurancesResponseBody</p>
     */
    public static class ElasticityAssuranceItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocatedResources")
        private AllocatedResources allocatedResources;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ElasticityAssuranceOwnerId")
        private String elasticityAssuranceOwnerId;

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
            this.elasticityAssuranceOwnerId = builder.elasticityAssuranceOwnerId;
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
         * @return elasticityAssuranceOwnerId
         */
        public String getElasticityAssuranceOwnerId() {
            return this.elasticityAssuranceOwnerId;
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
            private String elasticityAssuranceOwnerId; 
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
             * <p>Details about the allocated resources.</p>
             */
            public Builder allocatedResources(AllocatedResources allocatedResources) {
                this.allocatedResources = allocatedResources;
                return this;
            }

            /**
             * <p>The description of the elasticity assurance.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ElasticityAssuranceOwnerId.
             */
            public Builder elasticityAssuranceOwnerId(String elasticityAssuranceOwnerId) {
                this.elasticityAssuranceOwnerId = elasticityAssuranceOwnerId;
                return this;
            }

            /**
             * <p>The time when the elasticity assurance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-03T16:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The billing method of the instance. The value can be only PostPaid. Only pay-as-you-go instances can be created by using elasticity assurances.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder latestStartTime(String latestStartTime) {
                this.latestStartTime = latestStartTime;
                return this;
            }

            /**
             * <p>The ID of the elasticity assurance.</p>
             * 
             * <strong>example:</strong>
             * <p>eap-bp1ir35kqtn8ywci****</p>
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
                return this;
            }

            /**
             * <p>The type of the private pool associated with the elasticity assurance. Valid values:</p>
             * <ul>
             * <li>Open: open private pool</li>
             * <li>Target: specific private pool</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Target</p>
             */
            public Builder privatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
                this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
                return this;
            }

            /**
             * <p>The name of the elasticity assurance.</p>
             * 
             * <strong>example:</strong>
             * <p>eapTestName</p>
             */
            public Builder privatePoolOptionsName(String privatePoolOptionsName) {
                this.privatePoolOptionsName = privatePoolOptionsName;
                return this;
            }

            /**
             * <p>The region ID of the elasticity assurance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The time when the elasticity assurance takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-03T05:25Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Indicates when the elasticity assurance takes effect. Valid values:</p>
             * <ul>
             * <li>Now: The elasticity assurance takes effect immediately after it is created.</li>
             * <li>Later: The elasticity assurance takes effect at a specified time.</li>
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
             * <p>The status of the elasticity assurance. Valid values:</p>
             * <ul>
             * <li>Preparing</li>
             * <li>Prepared</li>
             * <li>Active</li>
             * <li>Released</li>
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
             * <p>The tags of the elasticity assurance.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The total number of times that the elasticity assurance is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>Unlimited</p>
             */
            public Builder totalAssuranceTimes(String totalAssuranceTimes) {
                this.totalAssuranceTimes = totalAssuranceTimes;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeElasticityAssurancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticityAssurancesResponseBody</p>
     */
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
