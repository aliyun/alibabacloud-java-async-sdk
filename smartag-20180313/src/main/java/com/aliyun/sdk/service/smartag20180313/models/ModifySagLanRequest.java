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
 * {@link ModifySagLanRequest} extends {@link RequestModel}
 *
 * <p>ModifySagLanRequest</p>
 */
public class ModifySagLanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndIp")
    private String endIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IP")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String IPType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lease")
    private String lease;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mask")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mask;

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
    @com.aliyun.core.annotation.NameInMap("StartIp")
    private String startIp;

    private ModifySagLanRequest(Builder builder) {
        super(builder);
        this.endIp = builder.endIp;
        this.ip = builder.ip;
        this.IPType = builder.IPType;
        this.lease = builder.lease;
        this.mask = builder.mask;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portName = builder.portName;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.smartAGId = builder.smartAGId;
        this.smartAGSn = builder.smartAGSn;
        this.startIp = builder.startIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySagLanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endIp
     */
    public String getEndIp() {
        return this.endIp;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return IPType
     */
    public String getIPType() {
        return this.IPType;
    }

    /**
     * @return lease
     */
    public String getLease() {
        return this.lease;
    }

    /**
     * @return mask
     */
    public String getMask() {
        return this.mask;
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
     * @return startIp
     */
    public String getStartIp() {
        return this.startIp;
    }

    public static final class Builder extends Request.Builder<ModifySagLanRequest, Builder> {
        private String endIp; 
        private String ip; 
        private String IPType; 
        private String lease; 
        private String mask; 
        private String ownerAccount; 
        private Long ownerId; 
        private String portName; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String smartAGId; 
        private String smartAGSn; 
        private String startIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifySagLanRequest request) {
            super(request);
            this.endIp = request.endIp;
            this.ip = request.ip;
            this.IPType = request.IPType;
            this.lease = request.lease;
            this.mask = request.mask;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portName = request.portName;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.smartAGId = request.smartAGId;
            this.smartAGSn = request.smartAGSn;
            this.startIp = request.startIp;
        } 

        /**
         * <p>The last IP address of the DHCP pool.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.254</p>
         */
        public Builder endIp(String endIp) {
            this.putQueryParameter("EndIp", endIp);
            this.endIp = endIp;
            return this;
        }

        /**
         * <p>The IP address of the LAN port.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.1</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("IP", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The connection type of the LAN port. Valid values:</p>
         * <ul>
         * <li><strong>DHCP</strong>: a dynamic IP address. Uses the Dynamic Host Configuration Protocol (DHCP) to dynamically assign an IP address to a connected device.</li>
         * <li><strong>STATIC</strong>: a static IP address. Specifies a static IP address for the LAN port.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STATIC</p>
         */
        public Builder IPType(String IPType) {
            this.putQueryParameter("IPType", IPType);
            this.IPType = IPType;
            return this;
        }

        /**
         * <p>The time duration that the IP address is retained after it is assigned through DHCP. Unit: minute.</p>
         * <p>Valid values: <strong>1 to 43200</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder lease(String lease) {
            this.putQueryParameter("Lease", lease);
            this.lease = lease;
            return this;
        }

        /**
         * <p>The subnet mask of the LAN port IP address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.0</p>
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
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
         * <p>The name of the LAN port.</p>
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
         * <p>The ID of the region where the SAG instance is deployed.</p>
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
         * <p>The ID of the SAG instance.</p>
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
         * <p>The serial number of the SAG device that is associated with the SAG instance.</p>
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
         * <p>The first IP address of the DHCP pool.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.2</p>
         */
        public Builder startIp(String startIp) {
            this.putQueryParameter("StartIp", startIp);
            this.startIp = startIp;
            return this;
        }

        @Override
        public ModifySagLanRequest build() {
            return new ModifySagLanRequest(this);
        } 

    } 

}
