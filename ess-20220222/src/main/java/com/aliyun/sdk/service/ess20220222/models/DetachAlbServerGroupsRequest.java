// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachAlbServerGroupsRequest} extends {@link RequestModel}
 *
 * <p>DetachAlbServerGroupsRequest</p>
 */
public class DetachAlbServerGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlbServerGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < AlbServerGroups> albServerGroups;

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

    private DetachAlbServerGroupsRequest(Builder builder) {
        super(builder);
        this.albServerGroups = builder.albServerGroups;
        this.clientToken = builder.clientToken;
        this.forceDetach = builder.forceDetach;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachAlbServerGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return albServerGroups
     */
    public java.util.List < AlbServerGroups> getAlbServerGroups() {
        return this.albServerGroups;
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

    public static final class Builder extends Request.Builder<DetachAlbServerGroupsRequest, Builder> {
        private java.util.List < AlbServerGroups> albServerGroups; 
        private String clientToken; 
        private Boolean forceDetach; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DetachAlbServerGroupsRequest request) {
            super(request);
            this.albServerGroups = request.albServerGroups;
            this.clientToken = request.clientToken;
            this.forceDetach = request.forceDetach;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * Details of the ALB server groups.
         */
        public Builder albServerGroups(java.util.List < AlbServerGroups> albServerGroups) {
            this.putQueryParameter("AlbServerGroups", albServerGroups);
            this.albServerGroups = albServerGroups;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests.
         * <p>
         * 
         * The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure the idempotence of a request](~~25965~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to remove the existing ECS instances from the ALB server group. Valid values:
         * <p>
         * 
         * *   true: removes the existing ECS instances from the ALB server group and returns the value of `ScalingActivityId`. You can query the value of ScalingActivityId to check whether the existing ECS instances are removed from the ALB server group.
         * *   false: does not remove the existing ECS instances from the ALB server group.
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

        @Override
        public DetachAlbServerGroupsRequest build() {
            return new DetachAlbServerGroupsRequest(this);
        } 

    } 

    public static class AlbServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbServerGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String albServerGroupId;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer port;

        private AlbServerGroups(Builder builder) {
            this.albServerGroupId = builder.albServerGroupId;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlbServerGroups create() {
            return builder().build();
        }

        /**
         * @return albServerGroupId
         */
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String albServerGroupId; 
            private Integer port; 

            /**
             * The ID of the ALB server group.
             */
            public Builder albServerGroupId(String albServerGroupId) {
                this.albServerGroupId = albServerGroupId;
                return this;
            }

            /**
             * The port number used by the ECS instances in the ALB server group.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public AlbServerGroups build() {
                return new AlbServerGroups(this);
            } 

        } 

    }
}
