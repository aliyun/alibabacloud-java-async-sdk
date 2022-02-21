// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachAlbServerGroupsRequest} extends {@link RequestModel}
 *
 * <p>DetachAlbServerGroupsRequest</p>
 */
public class DetachAlbServerGroupsRequest extends Request {
    @Query
    @NameInMap("AlbServerGroup")
    @Validation(required = true)
    private java.util.List < AlbServerGroup> albServerGroup;

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

    private DetachAlbServerGroupsRequest(Builder builder) {
        super(builder);
        this.albServerGroup = builder.albServerGroup;
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
     * @return albServerGroup
     */
    public java.util.List < AlbServerGroup> getAlbServerGroup() {
        return this.albServerGroup;
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
        private java.util.List < AlbServerGroup> albServerGroup; 
        private String clientToken; 
        private Boolean forceDetach; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DetachAlbServerGroupsRequest response) {
            super(response);
            this.albServerGroup = response.albServerGroup;
            this.clientToken = response.clientToken;
            this.forceDetach = response.forceDetach;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scalingGroupId = response.scalingGroupId;
        } 

        /**
         * AlbServerGroup.
         */
        public Builder albServerGroup(java.util.List < AlbServerGroup> albServerGroup) {
            this.putQueryParameter("AlbServerGroup", albServerGroup);
            this.albServerGroup = albServerGroup;
            return this;
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

        @Override
        public DetachAlbServerGroupsRequest build() {
            return new DetachAlbServerGroupsRequest(this);
        } 

    } 

    public static class AlbServerGroup extends TeaModel {
        @NameInMap("AlbServerGroupId")
        @Validation(required = true)
        private String albServerGroupId;

        @NameInMap("Port")
        @Validation(required = true)
        private Integer port;

        private AlbServerGroup(Builder builder) {
            this.albServerGroupId = builder.albServerGroupId;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlbServerGroup create() {
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
             * AlbServerGroupId.
             */
            public Builder albServerGroupId(String albServerGroupId) {
                this.albServerGroupId = albServerGroupId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public AlbServerGroup build() {
                return new AlbServerGroup(this);
            } 

        } 

    }
}
