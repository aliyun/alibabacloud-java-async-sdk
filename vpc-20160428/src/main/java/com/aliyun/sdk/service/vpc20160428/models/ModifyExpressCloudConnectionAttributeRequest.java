// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ModifyExpressCloudConnectionAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyExpressCloudConnectionAttributeRequest</p>
 */
public class ModifyExpressCloudConnectionAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgpAs")
    private String bgpAs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CeIp")
    private String ceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EccId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eccId;

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
    @com.aliyun.core.annotation.NameInMap("PeIp")
    private String peIp;

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

    private ModifyExpressCloudConnectionAttributeRequest(Builder builder) {
        super(builder);
        this.bgpAs = builder.bgpAs;
        this.ceIp = builder.ceIp;
        this.description = builder.description;
        this.eccId = builder.eccId;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peIp = builder.peIp;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyExpressCloudConnectionAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bgpAs
     */
    public String getBgpAs() {
        return this.bgpAs;
    }

    /**
     * @return ceIp
     */
    public String getCeIp() {
        return this.ceIp;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eccId
     */
    public String getEccId() {
        return this.eccId;
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
     * @return peIp
     */
    public String getPeIp() {
        return this.peIp;
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

    public static final class Builder extends Request.Builder<ModifyExpressCloudConnectionAttributeRequest, Builder> {
        private String bgpAs; 
        private String ceIp; 
        private String description; 
        private String eccId; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peIp; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyExpressCloudConnectionAttributeRequest request) {
            super(request);
            this.bgpAs = request.bgpAs;
            this.ceIp = request.ceIp;
            this.description = request.description;
            this.eccId = request.eccId;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peIp = request.peIp;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The BGP autonomous system number (ASN) to be configured for the Smart Access Gateway (SAG) device.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-ejfge***</p>
         */
        public Builder bgpAs(String bgpAs) {
            this.putQueryParameter("BgpAs", bgpAs);
            this.bgpAs = bgpAs;
            return this;
        }

        /**
         * <p>The peer IP address when the SAG device is connected to the cloud.</p>
         * 
         * <strong>example:</strong>
         * <p><code>172.16.**.**</code></p>
         */
        public Builder ceIp(String ceIp) {
            this.putQueryParameter("CeIp", ceIp);
            this.ceIp = ceIp;
            return this;
        }

        /**
         * <p>Descriptions of ECC.</p>
         * 
         * <strong>example:</strong>
         * <p>ECC</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the ECC instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecc-bp1t9osmuln*******</p>
         */
        public Builder eccId(String eccId) {
            this.putQueryParameter("EccId", eccId);
            this.eccId = eccId;
            return this;
        }

        /**
         * <p>The name of the ECC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>doctest</p>
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
         * <p>The on-premises IP address when the SAG device is connected to the cloud.</p>
         * 
         * <strong>example:</strong>
         * <p><code>10.10.**.**</code></p>
         */
        public Builder peIp(String peIp) {
            this.putQueryParameter("PeIp", peIp);
            this.peIp = peIp;
            return this;
        }

        /**
         * <p>The region ID of the ECC instance.</p>
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

        @Override
        public ModifyExpressCloudConnectionAttributeRequest build() {
            return new ModifyExpressCloudConnectionAttributeRequest(this);
        } 

    } 

}
