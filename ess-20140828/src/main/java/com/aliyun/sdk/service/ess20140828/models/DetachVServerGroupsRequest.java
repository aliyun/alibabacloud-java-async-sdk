// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachVServerGroupsRequest} extends {@link RequestModel}
 *
 * <p>DetachVServerGroupsRequest</p>
 */
public class DetachVServerGroupsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ForceDetach")
    private Boolean forceDetach;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
    @Validation(required = true)
    private String scalingGroupId;

    @Query
    @NameInMap("VServerGroup")
    @Validation(required = true)
    private java.util.List < VServerGroup> VServerGroup;

    private DetachVServerGroupsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.forceDetach = builder.forceDetach;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.VServerGroup = builder.VServerGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachVServerGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return forceDetach
     */
    public Boolean getForceDetach() {
        return this.forceDetach;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return VServerGroup
     */
    public java.util.List < VServerGroup> getVServerGroup() {
        return this.VServerGroup;
    }

    public static final class Builder extends Request.Builder<DetachVServerGroupsRequest, Builder> {
        private String clientToken; 
        private Boolean forceDetach; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private java.util.List < VServerGroup> VServerGroup; 

        private Builder() {
            super();
        } 

        private Builder(DetachVServerGroupsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.forceDetach = response.forceDetach;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scalingGroupId = response.scalingGroupId;
            this.VServerGroup = response.VServerGroup;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ForceDetach.
         */
        public Builder forceDetach(Boolean forceDetach) {
            this.putQueryParameter("ForceDetach", forceDetach);
            this.forceDetach = forceDetach;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * VServerGroup.
         */
        public Builder VServerGroup(java.util.List < VServerGroup> VServerGroup) {
            this.putQueryParameter("VServerGroup", VServerGroup);
            this.VServerGroup = VServerGroup;
            return this;
        }

        @Override
        public DetachVServerGroupsRequest build() {
            return new DetachVServerGroupsRequest(this);
        } 

    } 

    public static class VServerGroupAttribute extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("VServerGroupId")
        private String VServerGroupId;

        private VServerGroupAttribute(Builder builder) {
            this.port = builder.port;
            this.VServerGroupId = builder.VServerGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroupAttribute create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return VServerGroupId
         */
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public static final class Builder {
            private Integer port; 
            private String VServerGroupId; 

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * VServerGroupId.
             */
            public Builder VServerGroupId(String VServerGroupId) {
                this.VServerGroupId = VServerGroupId;
                return this;
            }

            public VServerGroupAttribute build() {
                return new VServerGroupAttribute(this);
            } 

        } 

    }
    public static class VServerGroup extends TeaModel {
        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("VServerGroupAttribute")
        private java.util.List < VServerGroupAttribute> VServerGroupAttribute;

        private VServerGroup(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.VServerGroupAttribute = builder.VServerGroupAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroup create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return VServerGroupAttribute
         */
        public java.util.List < VServerGroupAttribute> getVServerGroupAttribute() {
            return this.VServerGroupAttribute;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private java.util.List < VServerGroupAttribute> VServerGroupAttribute; 

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * VServerGroupAttribute.
             */
            public Builder VServerGroupAttribute(java.util.List < VServerGroupAttribute> VServerGroupAttribute) {
                this.VServerGroupAttribute = VServerGroupAttribute;
                return this;
            }

            public VServerGroup build() {
                return new VServerGroup(this);
            } 

        } 

    }
}
