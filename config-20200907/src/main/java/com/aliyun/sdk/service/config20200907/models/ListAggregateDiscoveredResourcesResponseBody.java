// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListAggregateDiscoveredResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateDiscoveredResourcesResponseBody</p>
 */
public class ListAggregateDiscoveredResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiscoveredResourceProfiles")
    private DiscoveredResourceProfiles discoveredResourceProfiles;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAggregateDiscoveredResourcesResponseBody(Builder builder) {
        this.discoveredResourceProfiles = builder.discoveredResourceProfiles;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateDiscoveredResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return discoveredResourceProfiles
     */
    public DiscoveredResourceProfiles getDiscoveredResourceProfiles() {
        return this.discoveredResourceProfiles;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DiscoveredResourceProfiles discoveredResourceProfiles; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAggregateDiscoveredResourcesResponseBody model) {
            this.discoveredResourceProfiles = model.discoveredResourceProfiles;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the resources.</p>
         */
        public Builder discoveredResourceProfiles(DiscoveredResourceProfiles discoveredResourceProfiles) {
            this.discoveredResourceProfiles = discoveredResourceProfiles;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7817373-78CB-4F9A-8AFA-E7A88E9D64A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateDiscoveredResourcesResponseBody build() {
            return new ListAggregateDiscoveredResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAggregateDiscoveredResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateDiscoveredResourcesResponseBody</p>
     */
    public static class DiscoveredResourceProfileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
        private String availabilityZone;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceCreationTime")
        private Long resourceCreationTime;

        @com.aliyun.core.annotation.NameInMap("ResourceDeleted")
        private Integer resourceDeleted;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
        private Long resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private String resourceStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private DiscoveredResourceProfileList(Builder builder) {
            this.accountId = builder.accountId;
            this.availabilityZone = builder.availabilityZone;
            this.region = builder.region;
            this.resourceCreationTime = builder.resourceCreationTime;
            this.resourceDeleted = builder.resourceDeleted;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.resourceStatus = builder.resourceStatus;
            this.resourceType = builder.resourceType;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiscoveredResourceProfileList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return availabilityZone
         */
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceCreationTime
         */
        public Long getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        /**
         * @return resourceDeleted
         */
        public Integer getResourceDeleted() {
            return this.resourceDeleted;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceOwnerId
         */
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        /**
         * @return resourceStatus
         */
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long accountId; 
            private String availabilityZone; 
            private String region; 
            private Long resourceCreationTime; 
            private Integer resourceDeleted; 
            private String resourceId; 
            private String resourceName; 
            private Long resourceOwnerId; 
            private String resourceStatus; 
            private String resourceType; 
            private String tags; 
            private Long updateTime; 
            private Long version; 

            private Builder() {
            } 

            private Builder(DiscoveredResourceProfileList model) {
                this.accountId = model.accountId;
                this.availabilityZone = model.availabilityZone;
                this.region = model.region;
                this.resourceCreationTime = model.resourceCreationTime;
                this.resourceDeleted = model.resourceDeleted;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceOwnerId = model.resourceOwnerId;
                this.resourceStatus = model.resourceStatus;
                this.resourceType = model.resourceType;
                this.tags = model.tags;
                this.updateTime = model.updateTime;
                this.version = model.version;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs. We recommend that you use the ResourceOwnerId parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>161259599160****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the zone in which the resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote-a</p>
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The time when the resource was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1618675206000</p>
             */
            public Builder resourceCreationTime(Long resourceCreationTime) {
                this.resourceCreationTime = resourceCreationTime;
                return this;
            }

            /**
             * <p>The status of the resource. Valid values:</p>
             * <ul>
             * <li>0: The resource is deleted.</li>
             * <li>1: The resource is retained.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resourceDeleted(Integer resourceDeleted) {
                this.resourceDeleted = resourceDeleted;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-hp31cqoba96jagtz****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud Firewall</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>161259599160****</p>
             */
            public Builder resourceOwnerId(Long resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * <p>The status of the resource. The value of this parameter varies with the resource type and may be empty. Examples:</p>
             * <ul>
             * <li>If the value of the ResourceType parameter is ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance that is in a specific state. In this case, the valid values of this parameter are Running and Stopped.</li>
             * <li>If the value of the ResourceType parameter is ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that is not in a specific state. In this case, this parameter is empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InUse</p>
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::NetworkInterface</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The tags of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key1&quot;:[&quot;value2&quot;]}</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the resource was last updated. The value must be a timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1722441600000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The build version of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public DiscoveredResourceProfileList build() {
                return new DiscoveredResourceProfileList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAggregateDiscoveredResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateDiscoveredResourcesResponseBody</p>
     */
    public static class DiscoveredResourceProfiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscoveredResourceProfileList")
        private java.util.List<DiscoveredResourceProfileList> discoveredResourceProfileList;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private DiscoveredResourceProfiles(Builder builder) {
            this.discoveredResourceProfileList = builder.discoveredResourceProfileList;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiscoveredResourceProfiles create() {
            return builder().build();
        }

        /**
         * @return discoveredResourceProfileList
         */
        public java.util.List<DiscoveredResourceProfileList> getDiscoveredResourceProfileList() {
            return this.discoveredResourceProfileList;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DiscoveredResourceProfileList> discoveredResourceProfileList; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(DiscoveredResourceProfiles model) {
                this.discoveredResourceProfileList = model.discoveredResourceProfileList;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The details of the resources.</p>
             */
            public Builder discoveredResourceProfileList(java.util.List<DiscoveredResourceProfileList> discoveredResourceProfileList) {
                this.discoveredResourceProfileList = discoveredResourceProfileList;
                return this;
            }

            /**
             * <p>The maximum number of entries returned on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>The token that was used to initiate the next request.</p>
             * 
             * <strong>example:</strong>
             * <p>IWBjqMYSy0is7zSMGu16****</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The total number of resources.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DiscoveredResourceProfiles build() {
                return new DiscoveredResourceProfiles(this);
            } 

        } 

    }
}
