// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
    private java.util.List<ResourceCandidates> resourceCandidates;

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
    public java.util.List<ResourceCandidates> getResourceCandidates() {
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
        private java.util.List<ResourceCandidates> resourceCandidates; 
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
         * <p>The access policy for the remote assistance procedure.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FULL_CONTROL</p>
         */
        public Builder coordinatePolicyType(String coordinatePolicyType) {
            this.putQueryParameter("CoordinatePolicyType", coordinatePolicyType);
            this.coordinatePolicyType = coordinatePolicyType;
            return this;
        }

        /**
         * <p>The ID of the end user who initiates the streaming collaboration. This parameter is not required if the administrator initiates the request.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The initiator type.</p>
         * 
         * <strong>example:</strong>
         * <p>ADMIN_INITIATE</p>
         */
        public Builder initiatorType(String initiatorType) {
            this.putQueryParameter("InitiatorType", initiatorType);
            this.initiatorType = initiatorType;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of cloud computers that need to accept remote assistance.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceCandidates(java.util.List<ResourceCandidates> resourceCandidates) {
            this.putQueryParameter("ResourceCandidates", resourceCandidates);
            this.resourceCandidates = resourceCandidates;
            return this;
        }

        /**
         * <p>The UUID (unique identifier) of the device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3E14A18BD4D088504B9F8A8751AB****</p>
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

    /**
     * 
     * {@link ApplyCoordinationForMonitoringRequest} extends {@link TeaModel}
     *
     * <p>ApplyCoordinationForMonitoringRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(ResourceCandidates model) {
                this.ownerAliUid = model.ownerAliUid;
                this.ownerEndUserId = model.ownerEndUserId;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceProperties = model.resourceProperties;
                this.resourceRegionId = model.resourceRegionId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The Alibaba Cloud account ID of the cloud computer administrator.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>130247021517****</p>
             */
            public Builder ownerAliUid(Long ownerAliUid) {
                this.ownerAliUid = ownerAliUid;
                return this;
            }

            /**
             * <p>The username of the current user of the cloud computer.</p>
             * <blockquote>
             * <p>This parameter is required.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder ownerEndUserId(String ownerEndUserId) {
                this.ownerEndUserId = ownerEndUserId;
                return this;
            }

            /**
             * <p>The cloud computer ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-08zhejm3h7ilr****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The cloud computer name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoComputer</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The cloud computer properties.</p>
             * 
             * <strong>example:</strong>
             * <p>TestProperty</p>
             */
            public Builder resourceProperties(String resourceProperties) {
                this.resourceProperties = resourceProperties;
                return this;
            }

            /**
             * <p>The region where the resource resides.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_DESKTOP</p>
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
