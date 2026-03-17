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
 * {@link ModifySagHaRequest} extends {@link RequestModel}
 *
 * <p>ModifySagHaRequest</p>
 */
public class ModifySagHaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortName")
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
    @com.aliyun.core.annotation.NameInMap("VirtualIp")
    private String virtualIp;

    private ModifySagHaRequest(Builder builder) {
        super(builder);
        this.mode = builder.mode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portName = builder.portName;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.smartAGId = builder.smartAGId;
        this.smartAGSn = builder.smartAGSn;
        this.virtualIp = builder.virtualIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySagHaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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
     * @return virtualIp
     */
    public String getVirtualIp() {
        return this.virtualIp;
    }

    public static final class Builder extends Request.Builder<ModifySagHaRequest, Builder> {
        private String mode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String portName; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String smartAGId; 
        private String smartAGSn; 
        private String virtualIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifySagHaRequest request) {
            super(request);
            this.mode = request.mode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portName = request.portName;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.smartAGId = request.smartAGId;
            this.smartAGSn = request.smartAGSn;
            this.virtualIp = request.virtualIp;
        } 

        /**
         * <p>The HA mode. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong>: disables HA.</li>
         * <li><strong>STATIC</strong>: enables static HA.</li>
         * <li><strong>DYNAMIC</strong>: enables dynamic HA.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
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
         * <p>The port name.</p>
         * <blockquote>
         * <p> If Mode is set to STATIC, you must specify a port name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder portName(String portName) {
            this.putQueryParameter("PortName", portName);
            this.portName = portName;
            return this;
        }

        /**
         * <p>The region ID of the SAG instance.</p>
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
         * <p>The SAG instance ID.</p>
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
         * <p>The virtual IP address.</p>
         * <blockquote>
         * <p> If Mode is set to STATIC, you must specify a virtual IP address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.5</p>
         */
        public Builder virtualIp(String virtualIp) {
            this.putQueryParameter("VirtualIp", virtualIp);
            this.virtualIp = virtualIp;
            return this;
        }

        @Override
        public ModifySagHaRequest build() {
            return new ModifySagHaRequest(this);
        } 

    } 

}
