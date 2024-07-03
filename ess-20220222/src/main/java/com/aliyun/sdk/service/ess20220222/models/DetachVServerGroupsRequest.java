// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachVServerGroupsRequest} extends {@link RequestModel}
 *
 * <p>DetachVServerGroupsRequest</p>
 */
public class DetachVServerGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceDetach")
    private Boolean forceDetach;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < VServerGroups> vServerGroups;

    private DetachVServerGroupsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.forceDetach = builder.forceDetach;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.vServerGroups = builder.vServerGroups;
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
     * @return vServerGroups
     */
    public java.util.List < VServerGroups> getVServerGroups() {
        return this.vServerGroups;
    }

    public static final class Builder extends Request.Builder<DetachVServerGroupsRequest, Builder> {
        private String clientToken; 
        private Boolean forceDetach; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private java.util.List < VServerGroups> vServerGroups; 

        private Builder() {
            super();
        } 

        private Builder(DetachVServerGroupsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.forceDetach = request.forceDetach;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.vServerGroups = request.vServerGroups;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [Ensure idempotence](~~25965~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to remove the existing instances in the scaling group from the vServer group marked for detachment.
         * <p>
         * 
         * *   true: If you set this parameter to `true`, the detachment of the load balancer from the scaling group causes automatic removal of the existing instances in the scaling group from the corresponding vServer group.
         * *   false: If you set this parameter to `false`, the detachment of the load balancer from the scaling group does not cause automatic removal of the existing instances in the scaling group from the corresponding vServer group.
         * 
         * Default value: false.
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
         * The region ID of the scaling group. Examples: cn-hangzhou and cn-shanghai.
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
         * The ID of the scaling group.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * The collection of information about the vServer groups marked for detachment.
         */
        public Builder vServerGroups(java.util.List < VServerGroups> vServerGroups) {
            this.putQueryParameter("VServerGroups", vServerGroups);
            this.vServerGroups = vServerGroups;
            return this;
        }

        @Override
        public DetachVServerGroupsRequest build() {
            return new DetachVServerGroupsRequest(this);
        } 

    } 

    public static class VServerGroupAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        private VServerGroupAttributes(Builder builder) {
            this.port = builder.port;
            this.vServerGroupId = builder.vServerGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroupAttributes create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        public static final class Builder {
            private Integer port; 
            private String vServerGroupId; 

            /**
             * The port number that Auto Scaling employs to incorporate instances into the vServer group. Valid values: 1 to 65535.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the backend vServer group.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            public VServerGroupAttributes build() {
                return new VServerGroupAttributes(this);
            } 

        } 

    }
    public static class VServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("VServerGroupAttributes")
        private java.util.List < VServerGroupAttributes> vServerGroupAttributes;

        private VServerGroups(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.vServerGroupAttributes = builder.vServerGroupAttributes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroups create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return vServerGroupAttributes
         */
        public java.util.List < VServerGroupAttributes> getVServerGroupAttributes() {
            return this.vServerGroupAttributes;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private java.util.List < VServerGroupAttributes> vServerGroupAttributes; 

            /**
             * The ID of the load balancer to which the vServer group belongs.
             * <p>
             * 
             * >  You can detach vServer groups of up to five load balancers from a scaling group in one call.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The attributes of the backend vServer group.
             */
            public Builder vServerGroupAttributes(java.util.List < VServerGroupAttributes> vServerGroupAttributes) {
                this.vServerGroupAttributes = vServerGroupAttributes;
                return this;
            }

            public VServerGroups build() {
                return new VServerGroups(this);
            } 

        } 

    }
}
