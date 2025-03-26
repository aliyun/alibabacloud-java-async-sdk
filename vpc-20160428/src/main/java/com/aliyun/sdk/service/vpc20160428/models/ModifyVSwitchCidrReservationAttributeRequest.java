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
 * {@link ModifyVSwitchCidrReservationAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyVSwitchCidrReservationAttributeRequest</p>
 */
public class ModifyVSwitchCidrReservationAttributeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationDescription")
    private String vSwitchCidrReservationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchCidrReservationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchCidrReservationName")
    private String vSwitchCidrReservationName;

    private ModifyVSwitchCidrReservationAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vSwitchCidrReservationDescription = builder.vSwitchCidrReservationDescription;
        this.vSwitchCidrReservationId = builder.vSwitchCidrReservationId;
        this.vSwitchCidrReservationName = builder.vSwitchCidrReservationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVSwitchCidrReservationAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return vSwitchCidrReservationDescription
     */
    public String getVSwitchCidrReservationDescription() {
        return this.vSwitchCidrReservationDescription;
    }

    /**
     * @return vSwitchCidrReservationId
     */
    public String getVSwitchCidrReservationId() {
        return this.vSwitchCidrReservationId;
    }

    /**
     * @return vSwitchCidrReservationName
     */
    public String getVSwitchCidrReservationName() {
        return this.vSwitchCidrReservationName;
    }

    public static final class Builder extends Request.Builder<ModifyVSwitchCidrReservationAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vSwitchCidrReservationDescription; 
        private String vSwitchCidrReservationId; 
        private String vSwitchCidrReservationName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVSwitchCidrReservationAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vSwitchCidrReservationDescription = request.vSwitchCidrReservationDescription;
            this.vSwitchCidrReservationId = request.vSwitchCidrReservationId;
            this.vSwitchCidrReservationName = request.vSwitchCidrReservationName;
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
         * DryRun.
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
         * <p>The ID of the region where the vSwitch is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The new description of the reserved CIDR block. The default value is empty.</p>
         * <p>The description must be 2 to 256 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ReservationDescription</p>
         */
        public Builder vSwitchCidrReservationDescription(String vSwitchCidrReservationDescription) {
            this.putQueryParameter("VSwitchCidrReservationDescription", vSwitchCidrReservationDescription);
            this.vSwitchCidrReservationDescription = vSwitchCidrReservationDescription;
            return this;
        }

        /**
         * <p>The ID of the reserved CIDR block.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vcr-bp1m12saqteraw3rp****</p>
         */
        public Builder vSwitchCidrReservationId(String vSwitchCidrReservationId) {
            this.putQueryParameter("VSwitchCidrReservationId", vSwitchCidrReservationId);
            this.vSwitchCidrReservationId = vSwitchCidrReservationId;
            return this;
        }

        /**
         * <p>The new name of the reserved CIDR block.</p>
         * <p>The name must be 2 to 128 characters in length and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>ReservationName</p>
         */
        public Builder vSwitchCidrReservationName(String vSwitchCidrReservationName) {
            this.putQueryParameter("VSwitchCidrReservationName", vSwitchCidrReservationName);
            this.vSwitchCidrReservationName = vSwitchCidrReservationName;
            return this;
        }

        @Override
        public ModifyVSwitchCidrReservationAttributeRequest build() {
            return new ModifyVSwitchCidrReservationAttributeRequest(this);
        } 

    } 

}
