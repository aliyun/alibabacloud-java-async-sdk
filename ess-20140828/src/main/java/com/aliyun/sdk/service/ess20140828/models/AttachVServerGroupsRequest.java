// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachVServerGroupsRequest} extends {@link RequestModel}
 *
 * <p>AttachVServerGroupsRequest</p>
 */
public class AttachVServerGroupsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ForceAttach")
    private Boolean forceAttach;

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

    private AttachVServerGroupsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.forceAttach = builder.forceAttach;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.VServerGroup = builder.VServerGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachVServerGroupsRequest create() {
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
     * @return forceAttach
     */
    public Boolean getForceAttach() {
        return this.forceAttach;
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

    public static final class Builder extends Request.Builder<AttachVServerGroupsRequest, Builder> {
        private String clientToken; 
        private Boolean forceAttach; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private java.util.List < VServerGroup> VServerGroup; 

        private Builder() {
            super();
        } 

        private Builder(AttachVServerGroupsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.forceAttach = response.forceAttach;
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
         * ForceAttach.
         */
        public Builder forceAttach(Boolean forceAttach) {
            this.putQueryParameter("ForceAttach", forceAttach);
            this.forceAttach = forceAttach;
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
        public AttachVServerGroupsRequest build() {
            return new AttachVServerGroupsRequest(this);
        } 

    } 

    public static class VServerGroupAttribute extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("VServerGroupId")
        private String VServerGroupId;

        @NameInMap("Weight")
        private Integer weight;

        private VServerGroupAttribute(Builder builder) {
            this.port = builder.port;
            this.VServerGroupId = builder.VServerGroupId;
            this.weight = builder.weight;
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

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer port; 
            private String VServerGroupId; 
            private Integer weight; 

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

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
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
