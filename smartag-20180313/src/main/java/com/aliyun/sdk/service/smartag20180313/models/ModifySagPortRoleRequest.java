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
 * {@link ModifySagPortRoleRequest} extends {@link RequestModel}
 *
 * <p>ModifySagPortRoleRequest</p>
 */
public class ModifySagPortRoleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Role")
    @com.aliyun.core.annotation.Validation(required = true)
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGSn;

    private ModifySagPortRoleRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portName = builder.portName;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.role = builder.role;
        this.smartAGId = builder.smartAGId;
        this.smartAGSn = builder.smartAGSn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySagPortRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return role
     */
    public String getRole() {
        return this.role;
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

    public static final class Builder extends Request.Builder<ModifySagPortRoleRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String portName; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String role; 
        private String smartAGId; 
        private String smartAGSn; 

        private Builder() {
            super();
        } 

        private Builder(ModifySagPortRoleRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portName = request.portName;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.role = request.role;
            this.smartAGId = request.smartAGId;
            this.smartAGSn = request.smartAGSn;
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
         * <p>The ID of the region where the Smart Access Gateway (SAG) instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The role of the port. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong>: No role is assigned to the port.</li>
         * <li><strong>WAN</strong>: The port is used as a WAN port. By default, port 5 of an SAG device is used as a WAN port and supports access to the Internet by using a Dynamic Host Configuration Protocol (DHCP) client, PPPoE, or a static IP address.</li>
         * <li><strong>LAN</strong>: The port is used as a LAN port. The LAN port allows a DHCP server or a static IP address to connect to an on-premises terminal or switch.</li>
         * <li><strong>ECC</strong>: The port is used as a port to connect to an Express Connect circuit.</li>
         * <li><strong>MGT</strong>: The port is used as the management port. By default, port 2 of an SAG device is used as the management port.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>In exclusive mode, the management traffic is separated from the workload traffic. The management port is only used to access the SAG web console and cannot be used to transfer your workload data. You can access the SAG web console only through the management port.</li>
         * <li>A WAN port can be used when it is connected. If a port is the first one that obtains an IP address over DHCP and can access the Internet, it is set as a WAN port. In the SAG web console, you can set another port as a WAN port.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
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

        @Override
        public ModifySagPortRoleRequest build() {
            return new ModifySagPortRoleRequest(this);
        } 

    } 

}
