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
 * {@link GetResourceConfigurationTimelineResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceConfigurationTimelineResponseBody</p>
 */
public class GetResourceConfigurationTimelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceConfigurationTimeline")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ED9CD1B3-286C-4E05-A765-5E1E0B9BC2AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configuration timeline of the resource.</p>
         */
        public Builder resourceConfigurationTimeline(ResourceConfigurationTimeline resourceConfigurationTimeline) {
            this.resourceConfigurationTimeline = resourceConfigurationTimeline;
            return this;
        }

        public GetResourceConfigurationTimelineResponseBody build() {
            return new GetResourceConfigurationTimelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceConfigurationTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceConfigurationTimelineResponseBody</p>
     */
    public static class ConfigurationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
        private String availabilityZone;

        @com.aliyun.core.annotation.NameInMap("CaptureTime")
        private String captureTime;

        @com.aliyun.core.annotation.NameInMap("ConfigurationDiff")
        private String configurationDiff;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Relationship")
        private String relationship;

        @com.aliyun.core.annotation.NameInMap("RelationshipDiff")
        private String relationshipDiff;

        @com.aliyun.core.annotation.NameInMap("ResourceCreateTime")
        private String resourceCreateTime;

        @com.aliyun.core.annotation.NameInMap("ResourceEventType")
        private String resourceEventType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Tags")
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
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * <p>The time when the resource change snapshot was recorded. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1624961156000</p>
             */
            public Builder captureTime(String captureTime) {
                this.captureTime = captureTime;
                return this;
            }

            /**
             * <p>The details of the resource changes that trigger the compliance evaluation.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AccessControlList&quot;:[null,{&quot;Grant&quot;:&quot;private&quot;}],&quot;ServerSideEncryptionRule&quot;:[null,{&quot;SSEAlgorithm&quot;:&quot;None&quot;}],&quot;CreationDate&quot;:[null,&quot;2021-06-29T10:05:12.000Z&quot;],&quot;Owner&quot;:[null,{&quot;DisplayName&quot;:&quot;100931896542****&quot;,&quot;ID&quot;:&quot;100931896542****&quot;}],&quot;BucketPolicy&quot;:[null,{&quot;LogPrefix&quot;:&quot;&quot;,&quot;LogBucket&quot;:&quot;&quot;}],&quot;StorageClass&quot;:[null,&quot;Standard&quot;],&quot;ExtranetEndpoint&quot;:[null,&quot;oss-cn-hangzhou.aliyuncs.com&quot;],&quot;DataRedundancyType&quot;:[null,&quot;LRS&quot;],&quot;AllowEmptyReferer&quot;:[null,&quot;true&quot;],&quot;IntranetEndpoint&quot;:[null,&quot;oss-cn-hangzhou-internal.aliyuncs.com&quot;],&quot;Name&quot;:[null,&quot;new-bucket&quot;],&quot;Location&quot;:[null,&quot;oss-cn-hangzhou&quot;]}</p>
             */
            public Builder configurationDiff(String configurationDiff) {
                this.configurationDiff = configurationDiff;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The details of each resource that is associated with the current resource, including the region ID, resource relationship, resource ID, and resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder relationship(String relationship) {
                this.relationship = relationship;
                return this;
            }

            /**
             * <p>The change records of the resource relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder relationshipDiff(String relationshipDiff) {
                this.relationshipDiff = relationshipDiff;
                return this;
            }

            /**
             * <p>The time when the resource was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1624961112000</p>
             */
            public Builder resourceCreateTime(String resourceCreateTime) {
                this.resourceCreateTime = resourceCreateTime;
                return this;
            }

            /**
             * <p>The type of the resource change event. Valid values:</p>
             * <ul>
             * <li>DISCOVERED: A resource is created.</li>
             * <li>DISCOVERED_REVISED: A resource is created by periodic remediation tasks.</li>
             * <li>MODIFY: A resource is modified.</li>
             * <li>MODIFY_REVISED: A resource is modified by periodic remediation tasks.</li>
             * <li>REMOVE: A resource is deleted.</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>To ensure the integrity of resources, periodic remediation tasks are run to check data and generate events that indicate the creation of new resources. Such events are infrequent.</p>
             * </li>
             * <li><p>The time when a resource change event is generated by a periodic remediation task is considered as the detection time of Cloud Config. The detection time is later than the time when the resource is modified.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DISCOVERED</p>
             */
            public Builder resourceEventType(String resourceEventType) {
                this.resourceEventType = resourceEventType;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>new-bucket</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>new-bucket</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::OSS::Bucket</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The tags of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;&quot;hc&quot;&quot;:[&quot;&quot;value2&quot;&quot;]}</p>
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
    /**
     * 
     * {@link GetResourceConfigurationTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceConfigurationTimelineResponseBody</p>
     */
    public static class ResourceConfigurationTimeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigurationList")
        private java.util.List<ConfigurationList> configurationList;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
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
        public java.util.List<ConfigurationList> getConfigurationList() {
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
            private java.util.List<ConfigurationList> configurationList; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * <p>The configuration changes on the configuration timeline.</p>
             */
            public Builder configurationList(java.util.List<ConfigurationList> configurationList) {
                this.configurationList = configurationList;
                return this;
            }

            /**
             * <p>The maximum number of entries returned for a single request.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
             * 
             * <strong>example:</strong>
             * <p>IWBjqMYSy0is7zSMGu16****</p>
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
