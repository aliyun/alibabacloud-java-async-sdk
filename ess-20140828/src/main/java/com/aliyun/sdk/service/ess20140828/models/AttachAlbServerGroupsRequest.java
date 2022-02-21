// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachAlbServerGroupsRequest} extends {@link RequestModel}
 *
 * <p>AttachAlbServerGroupsRequest</p>
 */
public class AttachAlbServerGroupsRequest extends Request {
    @Query
    @NameInMap("AlbServerGroup")
    @Validation(required = true)
    private java.util.List < AlbServerGroup> albServerGroup;

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

    private AttachAlbServerGroupsRequest(Builder builder) {
        super(builder);
        this.albServerGroup = builder.albServerGroup;
        this.clientToken = builder.clientToken;
        this.forceAttach = builder.forceAttach;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachAlbServerGroupsRequest create() {
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

    public static final class Builder extends Request.Builder<AttachAlbServerGroupsRequest, Builder> {
        private java.util.List < AlbServerGroup> albServerGroup; 
        private String clientToken; 
        private Boolean forceAttach; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachAlbServerGroupsRequest response) {
            super(response);
            this.albServerGroup = response.albServerGroup;
            this.clientToken = response.clientToken;
            this.forceAttach = response.forceAttach;
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

        @Override
        public AttachAlbServerGroupsRequest build() {
            return new AttachAlbServerGroupsRequest(this);
        } 

    } 

    public static class AlbServerGroup extends TeaModel {
        @NameInMap("AlbServerGroupId")
        @Validation(required = true)
        private String albServerGroupId;

        @NameInMap("Port")
        @Validation(required = true)
        private Integer port;

        @NameInMap("Weight")
        @Validation(required = true)
        private Integer weight;

        private AlbServerGroup(Builder builder) {
            this.albServerGroupId = builder.albServerGroupId;
            this.port = builder.port;
            this.weight = builder.weight;
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

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String albServerGroupId; 
            private Integer port; 
            private Integer weight; 

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

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public AlbServerGroup build() {
                return new AlbServerGroup(this);
            } 

        } 

    }
}
