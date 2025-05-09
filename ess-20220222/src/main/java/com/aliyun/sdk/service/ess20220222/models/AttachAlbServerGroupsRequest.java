// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link AttachAlbServerGroupsRequest} extends {@link RequestModel}
 *
 * <p>AttachAlbServerGroupsRequest</p>
 */
public class AttachAlbServerGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlbServerGroups")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AlbServerGroups> albServerGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceAttach")
    private Boolean forceAttach;

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

    private AttachAlbServerGroupsRequest(Builder builder) {
        super(builder);
        this.albServerGroups = builder.albServerGroups;
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
     * @return albServerGroups
     */
    public java.util.List<AlbServerGroups> getAlbServerGroups() {
        return this.albServerGroups;
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
        private java.util.List<AlbServerGroups> albServerGroups; 
        private String clientToken; 
        private Boolean forceAttach; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AttachAlbServerGroupsRequest request) {
            super(request);
            this.albServerGroups = request.albServerGroups;
            this.clientToken = request.clientToken;
            this.forceAttach = request.forceAttach;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
        } 

        /**
         * <p>The information about the ALB server groups.</p>
         * <p>This parameter is required.</p>
         */
        public Builder albServerGroups(java.util.List<AlbServerGroups> albServerGroups) {
            this.putQueryParameter("AlbServerGroups", albServerGroups);
            this.albServerGroups = albServerGroups;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to add the existing Elastic Compute Service (ECS) instances or elastic container instances in the scaling group to the new ALB server group. Valid values:</p>
         * <ul>
         * <li>true: adds the existing ECS instances or elastic container instances in the scaling group to the new ALB server group and returns the value of <code>ScalingActivityId</code>. You can query the value of ScalingActivityId to check whether the existing ECS instances are added to the ALB server group.</li>
         * <li>false: does not add the existing ECS instances or elastic container instances in the scaling group to the new ALB server group.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The region ID of the scaling group.</p>
         * <p>Examples: <code>cn-hangzhou</code> and <code>cn-shanghai</code>. For more information about regions and zones, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
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

    /**
     * 
     * {@link AttachAlbServerGroupsRequest} extends {@link TeaModel}
     *
     * <p>AttachAlbServerGroupsRequest</p>
     */
    public static class AlbServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbServerGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String albServerGroupId;

        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Weight")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer weight;

        private AlbServerGroups(Builder builder) {
            this.albServerGroupId = builder.albServerGroupId;
            this.port = builder.port;
            this.weight = builder.weight;
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

            private Builder() {
            } 

            private Builder(AlbServerGroups model) {
                this.albServerGroupId = model.albServerGroupId;
                this.port = model.port;
                this.weight = model.weight;
            } 

            /**
             * <p>The ID of the ALB server group.</p>
             * <p>You can attach only a limited number of ALB server groups to a scaling group. To view the predefined quota limit or manually request a quota increase, go to <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-ddwb0y0g6y9bjm****</p>
             */
            public Builder albServerGroupId(String albServerGroupId) {
                this.albServerGroupId = albServerGroupId;
                return this;
            }

            /**
             * <p>The port used by ECS instances or elastic container instances after being added as backend servers to the ALB server group.</p>
             * <p>Valid values: 1 to 65535.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The weight of an ECS instance or elastic container instance after being added as a backend server to the ALB server group. Valid values: 0 to 100.</p>
             * <p>If you assign a higher weight to an instance, the instance is allocated a larger proportion of access requests. If you assign zero weight to an instance, the instance is allocated no access requests.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public AlbServerGroups build() {
                return new AlbServerGroups(this);
            } 

        } 

    }
}
