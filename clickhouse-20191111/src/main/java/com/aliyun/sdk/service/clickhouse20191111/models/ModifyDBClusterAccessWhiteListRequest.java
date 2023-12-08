// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterAccessWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterAccessWhiteListRequest</p>
 */
public class ModifyDBClusterAccessWhiteListRequest extends Request {
    @Query
    @NameInMap("DBClusterIPArrayAttribute")
    private String DBClusterIPArrayAttribute;

    @Query
    @NameInMap("DBClusterIPArrayName")
    private String DBClusterIPArrayName;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("ModifyMode")
    private String modifyMode;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityIps")
    @Validation(required = true)
    private String securityIps;

    private ModifyDBClusterAccessWhiteListRequest(Builder builder) {
        super(builder);
        this.DBClusterIPArrayAttribute = builder.DBClusterIPArrayAttribute;
        this.DBClusterIPArrayName = builder.DBClusterIPArrayName;
        this.DBClusterId = builder.DBClusterId;
        this.modifyMode = builder.modifyMode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityIps = builder.securityIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterAccessWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterIPArrayAttribute
     */
    public String getDBClusterIPArrayAttribute() {
        return this.DBClusterIPArrayAttribute;
    }

    /**
     * @return DBClusterIPArrayName
     */
    public String getDBClusterIPArrayName() {
        return this.DBClusterIPArrayName;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
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
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterAccessWhiteListRequest, Builder> {
        private String DBClusterIPArrayAttribute; 
        private String DBClusterIPArrayName; 
        private String DBClusterId; 
        private String modifyMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityIps; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterAccessWhiteListRequest request) {
            super(request);
            this.DBClusterIPArrayAttribute = request.DBClusterIPArrayAttribute;
            this.DBClusterIPArrayName = request.DBClusterIPArrayName;
            this.DBClusterId = request.DBClusterId;
            this.modifyMode = request.modifyMode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityIps = request.securityIps;
        } 

        /**
         * DBClusterIPArrayAttribute.
         */
        public Builder DBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
            this.putQueryParameter("DBClusterIPArrayAttribute", DBClusterIPArrayAttribute);
            this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
            return this;
        }

        /**
         * DBClusterIPArrayName.
         */
        public Builder DBClusterIPArrayName(String DBClusterIPArrayName) {
            this.putQueryParameter("DBClusterIPArrayName", DBClusterIPArrayName);
            this.DBClusterIPArrayName = DBClusterIPArrayName;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * ModifyMode.
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
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
         * SecurityIps.
         */
        public Builder securityIps(String securityIps) {
            this.putQueryParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
            return this;
        }

        @Override
        public ModifyDBClusterAccessWhiteListRequest build() {
            return new ModifyDBClusterAccessWhiteListRequest(this);
        } 

    } 

}
