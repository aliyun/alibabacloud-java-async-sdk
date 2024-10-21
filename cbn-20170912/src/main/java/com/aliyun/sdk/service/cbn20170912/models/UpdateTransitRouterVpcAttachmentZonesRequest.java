// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTransitRouterVpcAttachmentZonesRequest} extends {@link RequestModel}
 *
 * <p>UpdateTransitRouterVpcAttachmentZonesRequest</p>
 */
public class UpdateTransitRouterVpcAttachmentZonesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddZoneMappings")
    private java.util.List < AddZoneMappings> addZoneMappings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveZoneMappings")
    private java.util.List < RemoveZoneMappings> removeZoneMappings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The zones and vSwitches that you want to add to the VPC connection.</p>
         */
        public Builder addZoneMappings(java.util.List < AddZoneMappings> addZoneMappings) {
            this.putQueryParameter("AddZoneMappings", addZoneMappings);
            this.addZoneMappings = addZoneMappings;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.</p>
         * </blockquote>
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
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The zones and vSwitches that you want to remove from the VPC connection.</p>
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
         * <p>The ID of the VPC connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-9bbqyygouv4cpn****</p>
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

    /**
     * 
     * {@link UpdateTransitRouterVpcAttachmentZonesRequest} extends {@link TeaModel}
     *
     * <p>UpdateTransitRouterVpcAttachmentZonesRequest</p>
     */
    public static class AddZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>The ID of the vSwitch that you want to add to the VPC connection.</p>
             * <p>You can specify at most 10 vSwitches in each call.</p>
             * <ul>
             * <li>If the VPC connection belongs to the current Alibaba Cloud account, you can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query the IDs of the vSwitches and zones of the VPC.</li>
             * <li>If the VPC connection belongs to another Alibaba Cloud account, you can call the <a href="https://help.aliyun.com/document_detail/427599.html">ListGrantVSwitchesToCen</a> operation to query the IDs of the vSwitches and zones of the VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vsw-wz988dda8ldm4uvmx****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the zone where the vSwitch that you want to add to the VPC connection is deployed.</p>
             * <p>You can specify at most 10 vSwitches in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
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
    /**
     * 
     * {@link UpdateTransitRouterVpcAttachmentZonesRequest} extends {@link TeaModel}
     *
     * <p>UpdateTransitRouterVpcAttachmentZonesRequest</p>
     */
    public static class RemoveZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>The ID of the vSwitch that you want to remove from the VPC connection.</p>
             * <p>You can remove at most 10 vSwitches from a VPC in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-wz9f5izl6wshndmta****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the zone where the vSwitch that you want to remove from the VPC connection is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
