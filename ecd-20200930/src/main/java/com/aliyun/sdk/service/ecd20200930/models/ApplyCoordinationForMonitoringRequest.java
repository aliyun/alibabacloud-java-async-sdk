// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyCoordinationForMonitoringRequest} extends {@link RequestModel}
 *
 * <p>ApplyCoordinationForMonitoringRequest</p>
 */
public class ApplyCoordinationForMonitoringRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoordinatePolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coordinatePolicyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InitiatorType")
    private String initiatorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceCandidates")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ResourceCandidates> resourceCandidates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuid;

    private ApplyCoordinationForMonitoringRequest(Builder builder) {
        super(builder);
        this.coordinatePolicyType = builder.coordinatePolicyType;
        this.endUserId = builder.endUserId;
        this.initiatorType = builder.initiatorType;
        this.regionId = builder.regionId;
        this.resourceCandidates = builder.resourceCandidates;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyCoordinationForMonitoringRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coordinatePolicyType
     */
    public String getCoordinatePolicyType() {
        return this.coordinatePolicyType;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return initiatorType
     */
    public String getInitiatorType() {
        return this.initiatorType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceCandidates
     */
    public java.util.List < ResourceCandidates> getResourceCandidates() {
        return this.resourceCandidates;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ApplyCoordinationForMonitoringRequest, Builder> {
        private String coordinatePolicyType; 
        private String endUserId; 
        private String initiatorType; 
        private String regionId; 
        private java.util.List < ResourceCandidates> resourceCandidates; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ApplyCoordinationForMonitoringRequest request) {
            super(request);
            this.coordinatePolicyType = request.coordinatePolicyType;
            this.endUserId = request.endUserId;
            this.initiatorType = request.initiatorType;
            this.regionId = request.regionId;
            this.resourceCandidates = request.resourceCandidates;
            this.uuid = request.uuid;
        } 

        /**
         * The coordination policy.
         * <p>
         * 
         * Set the value to FULL_CONTROL.
         * 
         * *   The value FULL_CONTROL specifies that the cloud desktop is shared and remote access to the cloud desktop is allowed.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder coordinatePolicyType(String coordinatePolicyType) {
            this.putQueryParameter("CoordinatePolicyType", coordinatePolicyType);
            this.coordinatePolicyType = coordinatePolicyType;
            return this;
        }

        /**
         * The ID of the end user who initiates the stream collaboration. If the initiator is the administrator, do not specify this parameter.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The type of the initiator.
         * <p>
         * 
         * Set the value to ADMIN_INITIATE.
         * 
         * *   The value ADMIN_INITIATE specifies that the administrator initiates the coordination request.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder initiatorType(String initiatorType) {
            this.putQueryParameter("InitiatorType", initiatorType);
            this.initiatorType = initiatorType;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](https://next.api.aliyun.com/document/ecd/2020-09-30/DescribeRegions) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The list of cloud desktops that run the collaboration task at the same time.
         */
        public Builder resourceCandidates(java.util.List < ResourceCandidates> resourceCandidates) {
            this.putQueryParameter("ResourceCandidates", resourceCandidates);
            this.resourceCandidates = resourceCandidates;
            return this;
        }

        /**
         * The universally unique identifier (UUID) of the device.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ApplyCoordinationForMonitoringRequest build() {
            return new ApplyCoordinationForMonitoringRequest(this);
        } 

    } 

    public static class ResourceCandidates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerAliUid")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long ownerAliUid;

        @com.aliyun.core.annotation.NameInMap("OwnerEndUserId")
        private String ownerEndUserId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceProperties")
        private String resourceProperties;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceRegionId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        private ResourceCandidates(Builder builder) {
            this.ownerAliUid = builder.ownerAliUid;
            this.ownerEndUserId = builder.ownerEndUserId;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceProperties = builder.resourceProperties;
            this.resourceRegionId = builder.resourceRegionId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceCandidates create() {
            return builder().build();
        }

        /**
         * @return ownerAliUid
         */
        public Long getOwnerAliUid() {
            return this.ownerAliUid;
        }

        /**
         * @return ownerEndUserId
         */
        public String getOwnerEndUserId() {
            return this.ownerEndUserId;
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
         * @return resourceProperties
         */
        public String getResourceProperties() {
            return this.resourceProperties;
        }

        /**
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Long ownerAliUid; 
            private String ownerEndUserId; 
            private String resourceId; 
            private String resourceName; 
            private String resourceProperties; 
            private String resourceRegionId; 
            private String resourceType; 

            /**
             * The ID of the Alibaba Cloud account to which the current cloud desktop belongs.
             */
            public Builder ownerAliUid(Long ownerAliUid) {
                this.ownerAliUid = ownerAliUid;
                return this;
            }

            /**
             * The ID of the current end user.
             */
            public Builder ownerEndUserId(String ownerEndUserId) {
                this.ownerEndUserId = ownerEndUserId;
                return this;
            }

            /**
             * The ID of the cloud desktop.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The name of the cloud desktop.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The properties of the cloud desktop.
             */
            public Builder resourceProperties(String resourceProperties) {
                this.resourceProperties = resourceProperties;
                return this;
            }

            /**
             * The region where the resource resides.
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * The resource type.
             * <p>
             * 
             * Set the value to CLOUD_DESKTOP.
             * 
             * *   The value CLOUD_DESKTOP specifies that the resource is a cloud desktop.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ResourceCandidates build() {
                return new ResourceCandidates(this);
            } 

        } 

    }
}
