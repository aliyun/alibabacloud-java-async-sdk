// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceComplianceTimeline.
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
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AvailabilityZone.
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * CaptureTime.
             */
            public Builder captureTime(Long captureTime) {
                this.captureTime = captureTime;
                return this;
            }

            /**
             * Configuration.
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * ConfigurationDiff.
             */
            public Builder configurationDiff(String configurationDiff) {
                this.configurationDiff = configurationDiff;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceCreateTime.
             */
            public Builder resourceCreateTime(Long resourceCreateTime) {
                this.resourceCreateTime = resourceCreateTime;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceStatus.
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Tags.
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

        @NameInMap("Limit")
        private Integer limit;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("TotalCount")
        private Long totalCount;

        private ResourceComplianceTimeline(Builder builder) {
            this.complianceList = builder.complianceList;
            this.limit = builder.limit;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
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
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
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
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < ComplianceList> complianceList; 
            private Integer limit; 
            private String nextToken; 
            private Long totalCount; 

            /**
             * ComplianceList.
             */
            public Builder complianceList(java.util.List < ComplianceList> complianceList) {
                this.complianceList = complianceList;
                return this;
            }

            /**
             * Limit.
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ResourceComplianceTimeline build() {
                return new ResourceComplianceTimeline(this);
            } 

        } 

    }
}
