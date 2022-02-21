// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceConfigurationTimeline.
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
            private String resourceCreateTime; 
            private String resourceEventType; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private String tags; 

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
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
            public Builder captureTime(String captureTime) {
                this.captureTime = captureTime;
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
            public Builder resourceCreateTime(String resourceCreateTime) {
                this.resourceCreateTime = resourceCreateTime;
                return this;
            }

            /**
             * ResourceEventType.
             */
            public Builder resourceEventType(String resourceEventType) {
                this.resourceEventType = resourceEventType;
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

            public ConfigurationList build() {
                return new ConfigurationList(this);
            } 

        } 

    }
    public static class ResourceConfigurationTimeline extends TeaModel {
        @NameInMap("ConfigurationList")
        private java.util.List < ConfigurationList> configurationList;

        @NameInMap("Limit")
        private Integer limit;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("TotalCount")
        private Long totalCount;

        private ResourceConfigurationTimeline(Builder builder) {
            this.configurationList = builder.configurationList;
            this.limit = builder.limit;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
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
            private java.util.List < ConfigurationList> configurationList; 
            private Integer limit; 
            private String nextToken; 
            private Long totalCount; 

            /**
             * ConfigurationList.
             */
            public Builder configurationList(java.util.List < ConfigurationList> configurationList) {
                this.configurationList = configurationList;
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

            public ResourceConfigurationTimeline build() {
                return new ResourceConfigurationTimeline(this);
            } 

        } 

    }
}
