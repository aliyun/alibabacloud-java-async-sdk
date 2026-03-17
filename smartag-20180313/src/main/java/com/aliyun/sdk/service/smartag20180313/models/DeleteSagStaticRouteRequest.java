// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DeleteSagStaticRouteRequest} extends {@link RequestModel}
 *
 * <p>DeleteSagStaticRouteRequest</p>
 */
public class DeleteSagStaticRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGSn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vlan")
    private String vlan;

    private DeleteSagStaticRouteRequest(Builder builder) {
        super(builder);
        this.destinationCidr = builder.destinationCidr;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portName = builder.portName;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.smartAGId = builder.smartAGId;
        this.smartAGSn = builder.smartAGSn;
        this.vlan = builder.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSagStaticRouteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationCidr
     */
    public String getDestinationCidr() {
        return this.destinationCidr;
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
     * @return portName
     */
    public String getPortName() {
        return this.portName;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    /**
     * @return smartAGSn
     */
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

    /**
     * @return vlan
     */
    public String getVlan() {
        return this.vlan;
    }

    public static final class Builder extends Request.Builder<DeleteSagStaticRouteRequest, Builder> {
        private String destinationCidr; 
        private String ownerAccount; 
        private Long ownerId; 
        private String portName; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String smartAGId; 
        private String smartAGSn; 
        private String vlan; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSagStaticRouteRequest request) {
            super(request);
            this.destinationCidr = request.destinationCidr;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portName = request.portName;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.smartAGId = request.smartAGId;
            this.smartAGSn = request.smartAGSn;
            this.vlan = request.vlan;
        } 

        /**
         * <p>The destination CIDR block.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.0/24</p>
         */
        public Builder destinationCidr(String destinationCidr) {
            this.putQueryParameter("DestinationCidr", destinationCidr);
            this.destinationCidr = destinationCidr;
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
         * <p>The name of the port.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder portName(String portName) {
            this.putQueryParameter("PortName", portName);
            this.portName = portName;
            return this;
        }

        /**
         * <p>The ID of the region where the SAG app instance is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the SAG app instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-whfn****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>The serial number of the SAG device associated with the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag32a30****</p>
         */
        public Builder smartAGSn(String smartAGSn) {
            this.putQueryParameter("SmartAGSn", smartAGSn);
            this.smartAGSn = smartAGSn;
            return this;
        }

        /**
         * <p>The VLAN ID.</p>
         * <p>Valid values: <strong>0</strong> (physical port) and <strong>1 to 4094</strong> (VLAN).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder vlan(String vlan) {
            this.putQueryParameter("Vlan", vlan);
            this.vlan = vlan;
            return this;
        }

        @Override
        public DeleteSagStaticRouteRequest build() {
            return new DeleteSagStaticRouteRequest(this);
        } 

    } 

}
