// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyCoordinationForMonitoringRequest} extends {@link RequestModel}
 *
 * <p>ApplyCoordinationForMonitoringRequest</p>
 */
public class ApplyCoordinationForMonitoringRequest extends Request {
    @Query
    @NameInMap("CoordinatePolicyType")
    @Validation(required = true)
    private String coordinatePolicyType;

    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("InitiatorType")
    private String initiatorType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceCandidates")
    @Validation(required = true)
    private java.util.List < ResourceCandidates> resourceCandidates;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
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
         * CoordinatePolicyType.
         */
        public Builder coordinatePolicyType(String coordinatePolicyType) {
            this.putQueryParameter("CoordinatePolicyType", coordinatePolicyType);
            this.coordinatePolicyType = coordinatePolicyType;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * InitiatorType.
         */
        public Builder initiatorType(String initiatorType) {
            this.putQueryParameter("InitiatorType", initiatorType);
            this.initiatorType = initiatorType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceCandidates.
         */
        public Builder resourceCandidates(java.util.List < ResourceCandidates> resourceCandidates) {
            this.putQueryParameter("ResourceCandidates", resourceCandidates);
            this.resourceCandidates = resourceCandidates;
            return this;
        }

        /**
         * Uuid.
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
        @NameInMap("OwnerAliUid")
        @Validation(required = true)
        private Long ownerAliUid;

        @NameInMap("OwnerEndUserId")
        private String ownerEndUserId;

        @NameInMap("ResourceId")
        @Validation(required = true)
        private String resourceId;

        @NameInMap("ResourceName")
        @Validation(required = true)
        private String resourceName;

        @NameInMap("ResourceProperties")
        private String resourceProperties;

        @NameInMap("ResourceRegionId")
        @Validation(required = true)
        private String resourceRegionId;

        @NameInMap("ResourceType")
        @Validation(required = true)
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
             * OwnerAliUid.
             */
            public Builder ownerAliUid(Long ownerAliUid) {
                this.ownerAliUid = ownerAliUid;
                return this;
            }

            /**
             * OwnerEndUserId.
             */
            public Builder ownerEndUserId(String ownerEndUserId) {
                this.ownerEndUserId = ownerEndUserId;
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
             * ResourceProperties.
             */
            public Builder resourceProperties(String resourceProperties) {
                this.resourceProperties = resourceProperties;
                return this;
            }

            /**
             * ResourceRegionId.
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * ResourceType.
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
