// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHASwitchConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyHASwitchConfigRequest</p>
 */
public class ModifyHASwitchConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HAConfig")
    private String HAConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManualHATime")
    private String manualHATime;

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

    private ModifyHASwitchConfigRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.HAConfig = builder.HAConfig;
        this.manualHATime = builder.manualHATime;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHASwitchConfigRequest create() {
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
     * @return HAConfig
     */
    public String getHAConfig() {
        return this.HAConfig;
    }

    /**
     * @return manualHATime
     */
    public String getManualHATime() {
        return this.manualHATime;
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

    public static final class Builder extends Request.Builder<ModifyHASwitchConfigRequest, Builder> {
        private String DBInstanceId; 
        private String HAConfig; 
        private String manualHATime; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHASwitchConfigRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.HAConfig = request.HAConfig;
            this.manualHATime = request.manualHATime;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The mode of the automatic primary/secondary switchover feature. Valid values:
         * <p>
         * 
         * *   **Auto**: The automatic primary/secondary switchover feature is enabled. The system automatically switches your workloads over from the instance to its secondary instance in the event of a fault.
         * *   **Manual**: The automatic primary/secondary switchover feature is disabled. You must manually switch your workloads over from the instance to its secondary instance in the event of a fault.
         * 
         * Default value: **Auto**.
         * 
         * >  If you set this parameter to **Manual**, you must specify the **ManualHATime** parameter.
         */
        public Builder HAConfig(String HAConfig) {
            this.putQueryParameter("HAConfig", HAConfig);
            this.HAConfig = HAConfig;
            return this;
        }

        /**
         * The time to disable the automatic primary/secondary switchover feature. The time can range from the current time to 23:59:59 seven days later. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         * <p>
         * 
         * >  This parameter takes effect only when you set the **HAConfig** parameter to **Manual**.
         */
        public Builder manualHATime(String manualHATime) {
            this.putQueryParameter("ManualHATime", manualHATime);
            this.manualHATime = manualHATime;
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
         * The region ID. You can call the DescribeRegions operation to query the most recent region list.
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
        public ModifyHASwitchConfigRequest build() {
            return new ModifyHASwitchConfigRequest(this);
        } 

    } 

}
