// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiscoveredResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetDiscoveredResourceResponseBody</p>
 */
public class GetDiscoveredResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiscoveredResourceDetail")
    private DiscoveredResourceDetail discoveredResourceDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDiscoveredResourceResponseBody(Builder builder) {
        this.discoveredResourceDetail = builder.discoveredResourceDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiscoveredResourceResponseBody create() {
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
         * The details of the resource.
         */
        public Builder discoveredResourceDetail(DiscoveredResourceDetail discoveredResourceDetail) {
            this.discoveredResourceDetail = discoveredResourceDetail;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDiscoveredResourceResponseBody build() {
            return new GetDiscoveredResourceResponseBody(this);
        } 

    } 

    public static class DiscoveredResourceDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
        private String availabilityZone;

        @com.aliyun.core.annotation.NameInMap("ComplianceType")
        private String complianceType;

        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

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

        private DiscoveredResourceDetail(Builder builder) {
            this.accountId = builder.accountId;
            this.availabilityZone = builder.availabilityZone;
            this.complianceType = builder.complianceType;
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
         * @return complianceType
         */
        public String getComplianceType() {
            return this.complianceType;
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
            private String complianceType; 
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
             * The ID of the Alibaba Cloud account to which the resource belongs.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of the zone in which the resource resides.
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * ComplianceType.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * The configuration of the resource.
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
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
             * The time when the resource was created.
             */
            public Builder resourceCreationTime(Long resourceCreationTime) {
                this.resourceCreationTime = resourceCreationTime;
                return this;
            }

            /**
             * Indicates whether the resource was deleted. Valid values:
             * <p>
             * 
             * *   1: The resource was not deleted.
             * *   0: The resource was deleted.
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
             * The status of the resource. The value of this parameter varies with the resource type and may be empty. Examples:
             * <p>
             * 
             * *   If the value of the ResourceType parameter is ACS::ECS::Instance, the resource is an Elastic Compute Service (ECS) instance that is in a specific state. In this case, the valid values of this parameter are Running and Stopped.
             * *   If the value of the ResourceType parameter is ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that is not in a specific state. In this case, this parameter is empty.
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
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

            public DiscoveredResourceDetail build() {
                return new DiscoveredResourceDetail(this);
            } 

        } 

    }
}
