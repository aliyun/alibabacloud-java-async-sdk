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
 * {@link ModifySmartAccessGatewayRequest} extends {@link RequestModel}
 *
 * <p>ModifySmartAccessGatewayRequest</p>
 */
public class ModifySmartAccessGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSoftwareConnectionAudit")
    private Boolean enableSoftwareConnectionAudit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Position")
    private String position;

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
    @com.aliyun.core.annotation.NameInMap("RoutingStrategy")
    private String routingStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityLockThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Integer securityLockThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    private ModifySmartAccessGatewayRequest(Builder builder) {
        super(builder);
        this.cidrBlock = builder.cidrBlock;
        this.description = builder.description;
        this.enableSoftwareConnectionAudit = builder.enableSoftwareConnectionAudit;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.position = builder.position;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routingStrategy = builder.routingStrategy;
        this.securityLockThreshold = builder.securityLockThreshold;
        this.smartAGId = builder.smartAGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySmartAccessGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableSoftwareConnectionAudit
     */
    public Boolean getEnableSoftwareConnectionAudit() {
        return this.enableSoftwareConnectionAudit;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return position
     */
    public String getPosition() {
        return this.position;
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
     * @return routingStrategy
     */
    public String getRoutingStrategy() {
        return this.routingStrategy;
    }

    /**
     * @return securityLockThreshold
     */
    public Integer getSecurityLockThreshold() {
        return this.securityLockThreshold;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public static final class Builder extends Request.Builder<ModifySmartAccessGatewayRequest, Builder> {
        private String cidrBlock; 
        private String description; 
        private Boolean enableSoftwareConnectionAudit; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String position; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routingStrategy; 
        private Integer securityLockThreshold; 
        private String smartAGId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySmartAccessGatewayRequest request) {
            super(request);
            this.cidrBlock = request.cidrBlock;
            this.description = request.description;
            this.enableSoftwareConnectionAudit = request.enableSoftwareConnectionAudit;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.position = request.position;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routingStrategy = request.routingStrategy;
            this.securityLockThreshold = request.securityLockThreshold;
            this.smartAGId = request.smartAGId;
        } 

        /**
         * <p>The CIDR blocks of terminals in the private network. Make sure that the CIDR blocks do not overlap with each other.</p>
         * <p>If the LAN ports of the terminals use dynamic routing, the IP addresses within the first private CIDR block are allocated to the terminals that have Dynamic Host Configuration Protocol (DHCP) enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The description of the SAG instance.</p>
         * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to audit the network connection logs of the SAS app instance.</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSoftwareConnectionAudit(Boolean enableSoftwareConnectionAudit) {
            this.putQueryParameter("EnableSoftwareConnectionAudit", enableSoftwareConnectionAudit);
            this.enableSoftwareConnectionAudit = enableSoftwareConnectionAudit;
            return this;
        }

        /**
         * <p>The name of the SAG instance.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>SAG</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The location where the SAG instance is deployed.</p>
         */
        public Builder position(String position) {
            this.putQueryParameter("Position", position);
            this.position = position;
            return this;
        }

        /**
         * <p>The ID of the region where the SAG instance is deployed.</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The policy that is used to advertise routes to Alibaba Cloud. Valid values:</p>
         * <ul>
         * <li><strong>static</strong>: static routing</li>
         * <li><strong>dynamic</strong>: dynamic routing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        public Builder routingStrategy(String routingStrategy) {
            this.putQueryParameter("RoutingStrategy", routingStrategy);
            this.routingStrategy = routingStrategy;
            return this;
        }

        /**
         * <p>The time during which the disconnected SAG instance remains locked. Valid values: an integer that is greater than or equal to 0.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder securityLockThreshold(Integer securityLockThreshold) {
            this.putQueryParameter("SecurityLockThreshold", securityLockThreshold);
            this.securityLockThreshold = securityLockThreshold;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-0ovhf732a9j0******</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        @Override
        public ModifySmartAccessGatewayRequest build() {
            return new ModifySmartAccessGatewayRequest(this);
        } 

    } 

}
