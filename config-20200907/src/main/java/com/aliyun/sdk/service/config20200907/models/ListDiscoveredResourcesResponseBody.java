// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiscoveredResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDiscoveredResourcesResponseBody</p>
 */
public class ListDiscoveredResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiscoveredResourceProfiles")
    private DiscoveredResourceProfiles discoveredResourceProfiles;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDiscoveredResourcesResponseBody(Builder builder) {
        this.discoveredResourceProfiles = builder.discoveredResourceProfiles;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiscoveredResourcesResponseBody create() {
        return builder().build();
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

        /**
         * The information about the resources.
         */
        public Builder discoveredResourceProfiles(DiscoveredResourceProfiles discoveredResourceProfiles) {
            this.discoveredResourceProfiles = discoveredResourceProfiles;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDiscoveredResourcesResponseBody build() {
            return new ListDiscoveredResourcesResponseBody(this);
        } 

    } 

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
            private String resourceStatus; 
            private String resourceType; 
            private String tags; 
            private Long updateTime; 
            private Long version; 

            /**
             * The ID of the Alibaba Cloud account to which the resource belongs.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The timestamp when the resource was created. Unit: milliseconds.
             */
            public Builder resourceCreationTime(Long resourceCreationTime) {
                this.resourceCreationTime = resourceCreationTime;
                return this;
            }

            /**
             * The status of the resource. Valid values:
             * <p>
             * 
             * *   0: The resource is deleted.
             * *   1: The resource is retained.
             */
            public Builder resourceDeleted(Integer resourceDeleted) {
                this.resourceDeleted = resourceDeleted;
                return this;
            }

            /**
             * The resource ID.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The resource name.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The status of the resource. The value of this parameter varies based on the resource type and may be empty. Examples:
             * <p>
             * 
             * *   If the ResourceType parameter is set to ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance that has a specific state. In this case, the valid values of this parameter are Running and Stopped.
             * *   If the ResourceType parameter is ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that is not in a specific state. In this case, this parameter is left empty.
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The tags of the resource.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The version of the resource change.
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
    public static class DiscoveredResourceProfiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscoveredResourceProfileList")
        private java.util.List < DiscoveredResourceProfileList> discoveredResourceProfileList;

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
        public java.util.List < DiscoveredResourceProfileList> getDiscoveredResourceProfileList() {
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
            private java.util.List < DiscoveredResourceProfileList> discoveredResourceProfileList; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * The details of the resources.
             */
            public Builder discoveredResourceProfileList(java.util.List < DiscoveredResourceProfileList> discoveredResourceProfileList) {
                this.discoveredResourceProfileList = discoveredResourceProfileList;
                return this;
            }

            /**
             * The maximum number of entries returned on each page.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * A pagination token. It can be used in the next request to retrieve a new page of results.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The total number of resources.
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
