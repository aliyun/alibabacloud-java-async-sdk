// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceComplianceTimelineResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceComplianceTimelineResponseBody</p>
 */
public class GetResourceComplianceTimelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceComplianceTimeline")
    private ResourceComplianceTimeline resourceComplianceTimeline;

    private GetResourceComplianceTimelineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceComplianceTimeline = builder.resourceComplianceTimeline;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceComplianceTimelineResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the compliance timeline.
         */
        public Builder resourceComplianceTimeline(ResourceComplianceTimeline resourceComplianceTimeline) {
            this.resourceComplianceTimeline = resourceComplianceTimeline;
            return this;
        }

        public GetResourceComplianceTimelineResponseBody build() {
            return new GetResourceComplianceTimelineResponseBody(this);
        } 

    } 

    public static class ComplianceList extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("AvailabilityZone")
        private String availabilityZone;

        @NameInMap("CaptureTime")
        private Long captureTime;

        @NameInMap("Configuration")
        private String configuration;

        @NameInMap("ConfigurationDiff")
        private String configurationDiff;

        @NameInMap("Region")
        private String region;

        @NameInMap("ResourceCreateTime")
        private Long resourceCreateTime;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourceStatus")
        private String resourceStatus;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Tags")
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
             * The ID of the Alibaba Cloud account to which the resource belongs.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The zone where the resource resides.
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * The timestamp when the compliance evaluation was recorded. Unit: milliseconds.
             */
            public Builder captureTime(Long captureTime) {
                this.captureTime = captureTime;
                return this;
            }

            /**
             * The information about the rules that evaluated the resource and the compliance evaluation result.
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * The details of the configuration change that triggered the compliance evaluation.
             */
            public Builder configurationDiff(String configurationDiff) {
                this.configurationDiff = configurationDiff;
                return this;
            }

            /**
             * The ID of the region where the resource resides.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The timestamp when the resource was created. Unit: milliseconds.
             */
            public Builder resourceCreateTime(Long resourceCreateTime) {
                this.resourceCreateTime = resourceCreateTime;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The name of the resource.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The status of the resource. The parameter value varies with the resource type and may be left empty. Examples:
             * <p>
             * 
             * *   If the ResourceType parameter is set to ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance that has a specific state. In this case, valid values of this parameter include Running and Stopped.
             * *   If the ResourceType parameter is set to ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that does not have a specific state. In this case, this parameter is left empty.
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

            public ComplianceList build() {
                return new ComplianceList(this);
            } 

        } 

    }
    public static class ResourceComplianceTimeline extends TeaModel {
        @NameInMap("ComplianceList")
        private java.util.List < ComplianceList> complianceList;

        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
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
        public java.util.List < ComplianceList> getComplianceList() {
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
            private java.util.List < ComplianceList> complianceList; 
            private Integer maxResults; 
            private String nextToken; 

            /**
             * The compliance evaluation records on the compliance timeline.
             */
            public Builder complianceList(java.util.List < ComplianceList> complianceList) {
                this.complianceList = complianceList;
                return this;
            }

            /**
             * The maximum number of entries that can be returned for a single request.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * The token that is used to initiate the next request.
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
