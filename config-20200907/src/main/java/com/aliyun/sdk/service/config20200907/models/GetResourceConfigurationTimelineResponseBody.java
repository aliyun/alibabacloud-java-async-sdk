// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceConfigurationTimelineResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceConfigurationTimelineResponseBody</p>
 */
public class GetResourceConfigurationTimelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceConfigurationTimeline")
    private ResourceConfigurationTimeline resourceConfigurationTimeline;

    private GetResourceConfigurationTimelineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceConfigurationTimeline = builder.resourceConfigurationTimeline;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceConfigurationTimelineResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceConfigurationTimeline
     */
    public ResourceConfigurationTimeline getResourceConfigurationTimeline() {
        return this.resourceConfigurationTimeline;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceConfigurationTimeline resourceConfigurationTimeline; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The configuration timeline of the resource.
         */
        public Builder resourceConfigurationTimeline(ResourceConfigurationTimeline resourceConfigurationTimeline) {
            this.resourceConfigurationTimeline = resourceConfigurationTimeline;
            return this;
        }

        public GetResourceConfigurationTimelineResponseBody build() {
            return new GetResourceConfigurationTimelineResponseBody(this);
        } 

    } 

    public static class ConfigurationList extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("AvailabilityZone")
        private String availabilityZone;

        @NameInMap("CaptureTime")
        private String captureTime;

        @NameInMap("ConfigurationDiff")
        private String configurationDiff;

        @NameInMap("Region")
        private String region;

        @NameInMap("Relationship")
        private String relationship;

        @NameInMap("RelationshipDiff")
        private String relationshipDiff;

        @NameInMap("ResourceCreateTime")
        private String resourceCreateTime;

        @NameInMap("ResourceEventType")
        private String resourceEventType;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Tags")
        private String tags;

        private ConfigurationList(Builder builder) {
            this.accountId = builder.accountId;
            this.availabilityZone = builder.availabilityZone;
            this.captureTime = builder.captureTime;
            this.configurationDiff = builder.configurationDiff;
            this.region = builder.region;
            this.relationship = builder.relationship;
            this.relationshipDiff = builder.relationshipDiff;
            this.resourceCreateTime = builder.resourceCreateTime;
            this.resourceEventType = builder.resourceEventType;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigurationList create() {
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
         * @return captureTime
         */
        public String getCaptureTime() {
            return this.captureTime;
        }

        /**
         * @return configurationDiff
         */
        public String getConfigurationDiff() {
            return this.configurationDiff;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return relationship
         */
        public String getRelationship() {
            return this.relationship;
        }

        /**
         * @return relationshipDiff
         */
        public String getRelationshipDiff() {
            return this.relationshipDiff;
        }

        /**
         * @return resourceCreateTime
         */
        public String getResourceCreateTime() {
            return this.resourceCreateTime;
        }

        /**
         * @return resourceEventType
         */
        public String getResourceEventType() {
            return this.resourceEventType;
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

        public static final class Builder {
            private Long accountId; 
            private String availabilityZone; 
            private String captureTime; 
            private String configurationDiff; 
            private String region; 
            private String relationship; 
            private String relationshipDiff; 
            private String resourceCreateTime; 
            private String resourceEventType; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private String tags; 

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
             * The time when the resource change snapshot was recorded. Unit: milliseconds.
             */
            public Builder captureTime(String captureTime) {
                this.captureTime = captureTime;
                return this;
            }

            /**
             * The details of the resource changes that trigger the compliance evaluation.
             */
            public Builder configurationDiff(String configurationDiff) {
                this.configurationDiff = configurationDiff;
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
             * The details of each resource that is associated with the current resource, including the region ID, resource relationship, resource ID, and resource type.
             */
            public Builder relationship(String relationship) {
                this.relationship = relationship;
                return this;
            }

            /**
             * The change records of the resource relationship.
             */
            public Builder relationshipDiff(String relationshipDiff) {
                this.relationshipDiff = relationshipDiff;
                return this;
            }

            /**
             * The time when the resource was created. Unit: milliseconds.
             */
            public Builder resourceCreateTime(String resourceCreateTime) {
                this.resourceCreateTime = resourceCreateTime;
                return this;
            }

            /**
             * The type of the resource change event. Valid values:
             * <p>
             * 
             * *   DISCOVERED: A resource is created.
             * *   DISCOVERED_REVISED: A resource is created by periodic remediation tasks.
             * *   MODIFY: A resource is modified.
             * *   MODIFY_REVISED: A resource is modified by periodic remediation tasks.
             * *   REMOVE: A resource is deleted.
             * 
             * > 
             * 
             * *   To ensure the integrity of resources, periodic remediation tasks are run to check data and generate events that indicate the creation of new resources. Such events are infrequent.
             * 
             * *   The time when a resource change event is generated by a periodic remediation task is considered as the detection time of Cloud Config. The detection time is later than the time when the resource is modified.
             */
            public Builder resourceEventType(String resourceEventType) {
                this.resourceEventType = resourceEventType;
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
             * The resource type.
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

            public ConfigurationList build() {
                return new ConfigurationList(this);
            } 

        } 

    }
    public static class ResourceConfigurationTimeline extends TeaModel {
        @NameInMap("ConfigurationList")
        private java.util.List < ConfigurationList> configurationList;

        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        private ResourceConfigurationTimeline(Builder builder) {
            this.configurationList = builder.configurationList;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceConfigurationTimeline create() {
            return builder().build();
        }

        /**
         * @return configurationList
         */
        public java.util.List < ConfigurationList> getConfigurationList() {
            return this.configurationList;
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

        public static final class Builder {
            private java.util.List < ConfigurationList> configurationList; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * The configuration changes on the configuration timeline.
             */
            public Builder configurationList(java.util.List < ConfigurationList> configurationList) {
                this.configurationList = configurationList;
                return this;
            }

            /**
             * The maximum number of entries returned for a single request.
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

            public ResourceConfigurationTimeline build() {
                return new ResourceConfigurationTimeline(this);
            } 

        } 

    }
}
