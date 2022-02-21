// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiscoveredResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiscoveredResourceResponseBody</p>
 */
public class DescribeDiscoveredResourceResponseBody extends TeaModel {
    @NameInMap("DiscoveredResourceDetail")
    private DiscoveredResourceDetail discoveredResourceDetail;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDiscoveredResourceResponseBody(Builder builder) {
        this.discoveredResourceDetail = builder.discoveredResourceDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiscoveredResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return discoveredResourceDetail
     */
    public DiscoveredResourceDetail getDiscoveredResourceDetail() {
        return this.discoveredResourceDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DiscoveredResourceDetail discoveredResourceDetail; 
        private String requestId; 

        /**
         * DiscoveredResourceDetail.
         */
        public Builder discoveredResourceDetail(DiscoveredResourceDetail discoveredResourceDetail) {
            this.discoveredResourceDetail = discoveredResourceDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiscoveredResourceResponseBody build() {
            return new DescribeDiscoveredResourceResponseBody(this);
        } 

    } 

    public static class DiscoveredResourceDetail extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("AvailabilityZone")
        private String availabilityZone;

        @NameInMap("Configuration")
        private String configuration;

        @NameInMap("Region")
        private String region;

        @NameInMap("ResourceCreationTime")
        private Long resourceCreationTime;

        @NameInMap("ResourceDeleted")
        private Integer resourceDeleted;

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

        private DiscoveredResourceDetail(Builder builder) {
            this.accountId = builder.accountId;
            this.availabilityZone = builder.availabilityZone;
            this.configuration = builder.configuration;
            this.region = builder.region;
            this.resourceCreationTime = builder.resourceCreationTime;
            this.resourceDeleted = builder.resourceDeleted;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceStatus = builder.resourceStatus;
            this.resourceType = builder.resourceType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiscoveredResourceDetail create() {
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
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
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

        public static final class Builder {
            private Long accountId; 
            private String availabilityZone; 
            private String configuration; 
            private String region; 
            private Long resourceCreationTime; 
            private Integer resourceDeleted; 
            private String resourceId; 
            private String resourceName; 
            private String resourceStatus; 
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
             * Configuration.
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
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
             * ResourceCreationTime.
             */
            public Builder resourceCreationTime(Long resourceCreationTime) {
                this.resourceCreationTime = resourceCreationTime;
                return this;
            }

            /**
             * ResourceDeleted.
             */
            public Builder resourceDeleted(Integer resourceDeleted) {
                this.resourceDeleted = resourceDeleted;
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

            public DiscoveredResourceDetail build() {
                return new DiscoveredResourceDetail(this);
            } 

        } 

    }
}
