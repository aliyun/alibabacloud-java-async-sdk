// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBProxyInstanceKernelVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBProxyInstanceKernelVersionRequest</p>
 */
public class UpgradeDBProxyInstanceKernelVersionRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

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
    @NameInMap("SwitchTime")
    private String switchTime;

    @Query
    @NameInMap("UpgradeTime")
    private String upgradeTime;

    private UpgradeDBProxyInstanceKernelVersionRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.switchTime = builder.switchTime;
        this.upgradeTime = builder.upgradeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBProxyInstanceKernelVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
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
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return upgradeTime
     */
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

    public static final class Builder extends Request.Builder<UpgradeDBProxyInstanceKernelVersionRequest, Builder> {
        private String DBInstanceId; 
        private String DBProxyEngineType; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String switchTime; 
        private String upgradeTime; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBProxyInstanceKernelVersionRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.switchTime = request.switchTime;
            this.upgradeTime = request.upgradeTime;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DBProxyEngineType.
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
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
         * SwitchTime.
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * UpgradeTime.
         */
        public Builder upgradeTime(String upgradeTime) {
            this.putQueryParameter("UpgradeTime", upgradeTime);
            this.upgradeTime = upgradeTime;
            return this;
        }

        @Override
        public UpgradeDBProxyInstanceKernelVersionRequest build() {
            return new UpgradeDBProxyInstanceKernelVersionRequest(this);
        } 

    } 

}
