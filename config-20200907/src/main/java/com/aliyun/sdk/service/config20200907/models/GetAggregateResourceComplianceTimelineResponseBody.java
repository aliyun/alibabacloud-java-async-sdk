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
 * {@link GetAggregateResourceComplianceTimelineResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateResourceComplianceTimelineResponseBody</p>
 */
public class GetAggregateResourceComplianceTimelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceComplianceTimeline")
    private ResourceComplianceTimeline resourceComplianceTimeline;

    private GetAggregateResourceComplianceTimelineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceComplianceTimeline = builder.resourceComplianceTimeline;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceComplianceTimelineResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceComplianceTimeline
     */
    public ResourceComplianceTimeline getResourceComplianceTimeline() {
        return this.resourceComplianceTimeline;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceComplianceTimeline resourceComplianceTimeline; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8D53A78F-1EB8-4264-A554-72F07E34FAE6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the compliance timeline.</p>
         */
        public Builder resourceComplianceTimeline(ResourceComplianceTimeline resourceComplianceTimeline) {
            this.resourceComplianceTimeline = resourceComplianceTimeline;
            return this;
        }

        public GetAggregateResourceComplianceTimelineResponseBody build() {
            return new GetAggregateResourceComplianceTimelineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateResourceComplianceTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateResourceComplianceTimelineResponseBody</p>
     */
    public static class ComplianceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
        private String availabilityZone;

        @com.aliyun.core.annotation.NameInMap("CaptureTime")
        private Long captureTime;

        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("ConfigurationDiff")
        private String configurationDiff;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceCreateTime")
        private Long resourceCreateTime;

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

        private ComplianceList(Builder builder) {
            this.accountId = builder.accountId;
            this.availabilityZone = builder.availabilityZone;
            this.captureTime = builder.captureTime;
            this.configuration = builder.configuration;
            this.configurationDiff = builder.configurationDiff;
            this.region = builder.region;
            this.resourceCreateTime = builder.resourceCreateTime;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceStatus = builder.resourceStatus;
            this.resourceType = builder.resourceType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
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
        public Long getCaptureTime() {
            return this.captureTime;
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
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
         * @return resourceCreateTime
         */
        public Long getResourceCreateTime() {
            return this.resourceCreateTime;
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

        public static final class Builder {
            private String accountId; 
            private String availabilityZone; 
            private Long captureTime; 
            private String configuration; 
            private String configurationDiff; 
            private String region; 
            private Long resourceCreateTime; 
            private String resourceId; 
            private String resourceName; 
            private String resourceStatus; 
            private String resourceType; 
            private String tags; 

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>100931896542****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the zone in which the resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-f</p>
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * <p>The timestamp when the compliance evaluation was recorded. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1625200295276</p>
             */
            public Builder captureTime(Long captureTime) {
                this.captureTime = captureTime;
                return this;
            }

            /**
             * <p>The information about the rules that evaluated the resource and the compliance evaluation result.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;AccessControlList&quot;: {
             *         &quot;Grant&quot;: &quot;private&quot;
             *     },
             *     &quot;ServerSideEncryptionRule&quot;: {
             *         &quot;SSEAlgorithm&quot;: &quot;None&quot;
             *     },
             *     &quot;Comment&quot;: &quot;&quot;,
             *     &quot;Owner&quot;: {
             *         &quot;DisplayName&quot;: &quot;126672004088****&quot;,
             *         &quot;ID&quot;: &quot;126672004088****&quot;
             *     },
             *     &quot;ResourceGroupId&quot;: &quot;rg-acfmy4dfoau****&quot;,
             *     &quot;StorageClass&quot;: &quot;Standard&quot;,
             *     &quot;DataRedundancyType&quot;: &quot;LRS&quot;,
             *     &quot;AllowEmptyReferer&quot;: &quot;true&quot;,
             *     &quot;Name&quot;: &quot;test-private-oss****&quot;,
             *     &quot;BucketPolicy&quot;: {
             *         &quot;LogPrefix&quot;: &quot;&quot;,
             *         &quot;LogBucket&quot;: &quot;&quot;
             *     },
             *     &quot;ExtranetEndpoint&quot;: &quot;oss-cn-hangzhou.aliyuncs.com&quot;,
             *     &quot;IntranetEndpoint&quot;: &quot;oss-cn-hangzhou-internal.aliyuncs.com&quot;,
             *     &quot;Location&quot;: &quot;oss-cn-hangzhou&quot;
             * }</p>
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The details of the resource change that triggered the compliance evaluation.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;ResourceGroupId&quot;: [
             *         &quot;rg-acfmy4dfoau****&quot;,
             *         &quot;rg-a3dmy4lksta****&quot;
             *     ]
             * }</p>
             */
            public Builder configurationDiff(String configurationDiff) {
                this.configurationDiff = configurationDiff;
                return this;
            }

            /**
             * <p>The ID of the region in which the resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The timestamp when the resource was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1624961112000</p>
             */
            public Builder resourceCreateTime(Long resourceCreateTime) {
                this.resourceCreateTime = resourceCreateTime;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test-private-oss****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test-private-oss****</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The status of the resource. The parameter value varies based on the resource type and may be left empty. Examples:</p>
             * <ul>
             * <li>If the ResourceType parameter is set to ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance that has a specific state. In this case, the valid values of this parameter are Running and Stopped.</li>
             * <li>If the ResourceType parameter is set to ACS::OSS::Bucket, the resource is an OSS bucket that does not have a specific state. In this case, this parameter is left empty.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
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

            public ComplianceList build() {
                return new ComplianceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAggregateResourceComplianceTimelineResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateResourceComplianceTimelineResponseBody</p>
     */
    public static class ResourceComplianceTimeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplianceList")
        private java.util.List<ComplianceList> complianceList;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        private ResourceComplianceTimeline(Builder builder) {
            this.complianceList = builder.complianceList;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceComplianceTimeline create() {
            return builder().build();
        }

        /**
         * @return complianceList
         */
        public java.util.List<ComplianceList> getComplianceList() {
            return this.complianceList;
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
            private java.util.List<ComplianceList> complianceList; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * <p>The status of the resource. The parameter value varies based on the resource type and may be left empty. Examples:</p>
             * <ul>
             * <li>If the value of the ResourceType parameter is ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance that has a specific state. In this case, the valid values of this parameter are Running and Stopped.</li>
             * <li>If the value of the ResourceType parameter is ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that is not in a specific state. In this case, this parameter is empty.</li>
             * </ul>
             */
            public Builder complianceList(java.util.List<ComplianceList> complianceList) {
                this.complianceList = complianceList;
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
             * <p>5OVS5J4I1/UKTkHV5oNs****</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            public ResourceComplianceTimeline build() {
                return new ResourceComplianceTimeline(this);
            } 

        } 

    }
}
