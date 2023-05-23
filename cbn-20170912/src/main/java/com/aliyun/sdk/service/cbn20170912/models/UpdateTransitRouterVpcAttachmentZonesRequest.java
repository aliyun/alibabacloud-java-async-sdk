// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTransitRouterVpcAttachmentZonesRequest} extends {@link RequestModel}
 *
 * <p>UpdateTransitRouterVpcAttachmentZonesRequest</p>
 */
public class UpdateTransitRouterVpcAttachmentZonesRequest extends Request {
    @Query
    @NameInMap("AddZoneMappings")
    private java.util.List < AddZoneMappings> addZoneMappings;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RemoveZoneMappings")
    private java.util.List < RemoveZoneMappings> removeZoneMappings;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TransitRouterAttachmentId")
    @Validation(required = true)
    private String transitRouterAttachmentId;

    private UpdateTransitRouterVpcAttachmentZonesRequest(Builder builder) {
        super(builder);
        this.addZoneMappings = builder.addZoneMappings;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.removeZoneMappings = builder.removeZoneMappings;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransitRouterVpcAttachmentZonesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addZoneMappings
     */
    public java.util.List < AddZoneMappings> getAddZoneMappings() {
        return this.addZoneMappings;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return removeZoneMappings
     */
    public java.util.List < RemoveZoneMappings> getRemoveZoneMappings() {
        return this.removeZoneMappings;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return transitRouterAttachmentId
     */
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public static final class Builder extends Request.Builder<UpdateTransitRouterVpcAttachmentZonesRequest, Builder> {
        private java.util.List < AddZoneMappings> addZoneMappings; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.List < RemoveZoneMappings> removeZoneMappings; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterAttachmentId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTransitRouterVpcAttachmentZonesRequest request) {
            super(request);
            this.addZoneMappings = request.addZoneMappings;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.removeZoneMappings = request.removeZoneMappings;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouterAttachmentId = request.transitRouterAttachmentId;
        } 

        /**
         * The zones and vSwitches that you want to add to the VPC connection.
         */
        public Builder addZoneMappings(java.util.List < AddZoneMappings> addZoneMappings) {
            this.putQueryParameter("AddZoneMappings", addZoneMappings);
            this.addZoneMappings = addZoneMappings;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and sends the request.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * The zones and vSwitches that you want to remove from the VPC connection.
         */
        public Builder removeZoneMappings(java.util.List < RemoveZoneMappings> removeZoneMappings) {
            this.putQueryParameter("RemoveZoneMappings", removeZoneMappings);
            this.removeZoneMappings = removeZoneMappings;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the VPC connection.
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        @Override
        public UpdateTransitRouterVpcAttachmentZonesRequest build() {
            return new UpdateTransitRouterVpcAttachmentZonesRequest(this);
        } 

    } 

    public static class AddZoneMappings extends TeaModel {
        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private AddZoneMappings(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddZoneMappings create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vSwitchId; 
            private String zoneId; 

            /**
             * The ID of the vSwitch that you want to add to the VPC connection.
             * <p>
             * 
             * You can specify at most 10 vSwitches in each call.
             * 
             * *   If the VPC connection belongs to the current Alibaba Cloud account, you can call the [DescribeVSwitches](~~35748~~) operation to query the IDs of the vSwitches and zones of the VPC.
             * *   If the VPC connection belongs to another Alibaba Cloud account, you can call the [ListGrantVSwitchesToCen](~~427599~~) operation to query the IDs of the vSwitches and zones of the VPC.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the zone where the vSwitch that you want to add to the VPC connection is deployed.
             * <p>
             * 
             * You can specify at most 10 vSwitches in each call.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AddZoneMappings build() {
                return new AddZoneMappings(this);
            } 

        } 

    }
    public static class RemoveZoneMappings extends TeaModel {
        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private RemoveZoneMappings(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveZoneMappings create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vSwitchId; 
            private String zoneId; 

            /**
             * The ID of the vSwitch that you want to remove from the VPC connection.
             * <p>
             * 
             * You can remove at most 10 vSwitches from a VPC in each call.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the zone where the vSwitch that you want to remove from the VPC connection is deployed.
             * <p>
             * 
             * You can remove at most 10 vSwitches from a VPC in each call.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public RemoveZoneMappings build() {
                return new RemoveZoneMappings(this);
            } 

        } 

    }
}
