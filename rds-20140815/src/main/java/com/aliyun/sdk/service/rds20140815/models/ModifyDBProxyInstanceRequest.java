// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBProxyInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBProxyInstanceRequest</p>
 */
public class ModifyDBProxyInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBProxyInstanceNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBProxyInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveSpecificTime")
    private String effectiveSpecificTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private String vSwitchIds;

    private ModifyDBProxyInstanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.DBProxyInstanceNum = builder.DBProxyInstanceNum;
        this.DBProxyInstanceType = builder.DBProxyInstanceType;
        this.effectiveSpecificTime = builder.effectiveSpecificTime;
        this.effectiveTime = builder.effectiveTime;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vSwitchIds = builder.vSwitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBProxyInstanceRequest create() {
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
     * @return DBProxyInstanceNum
     */
    public String getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    /**
     * @return DBProxyInstanceType
     */
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    /**
     * @return effectiveSpecificTime
     */
    public String getEffectiveSpecificTime() {
        return this.effectiveSpecificTime;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
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
     * @return vSwitchIds
     */
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static final class Builder extends Request.Builder<ModifyDBProxyInstanceRequest, Builder> {
        private String DBInstanceId; 
        private String DBProxyEngineType; 
        private String DBProxyInstanceNum; 
        private String DBProxyInstanceType; 
        private String effectiveSpecificTime; 
        private String effectiveTime; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vSwitchIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBProxyInstanceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.DBProxyInstanceNum = request.DBProxyInstanceNum;
            this.DBProxyInstanceType = request.DBProxyInstanceType;
            this.effectiveSpecificTime = request.effectiveSpecificTime;
            this.effectiveTime = request.effectiveTime;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vSwitchIds = request.vSwitchIds;
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
         * A deprecated parameter. You do not need to specify this parameter.
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * The number of database proxies. If you set this parameter to 0, the database proxy feature is disabled for the instance. Valid values: **1** to **16**.
         * <p>
         * 
         * >  The capability of the database proxy feature to process requests increases with the number of database proxies that are enabled. You can monitor the load on the instance and specify an appropriate number of database proxies based on the load monitoring data.
         */
        public Builder DBProxyInstanceNum(String DBProxyInstanceNum) {
            this.putQueryParameter("DBProxyInstanceNum", DBProxyInstanceNum);
            this.DBProxyInstanceNum = DBProxyInstanceNum;
            return this;
        }

        /**
         * The database proxy type. Valid values:
         * <p>
         * 
         * *   **common**: general-purpose database proxy
         * *   **exclusive** (default): dedicated database proxy
         */
        public Builder DBProxyInstanceType(String DBProxyInstanceType) {
            this.putQueryParameter("DBProxyInstanceType", DBProxyInstanceType);
            this.DBProxyInstanceType = DBProxyInstanceType;
            return this;
        }

        /**
         * The point in time that you want to specify. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         * <p>
         * 
         * >  If the **EffectiveTime** parameter is set to **SpecificTime**, you must specify this parameter.
         */
        public Builder effectiveSpecificTime(String effectiveSpecificTime) {
            this.putQueryParameter("EffectiveSpecificTime", effectiveSpecificTime);
            this.effectiveSpecificTime = effectiveSpecificTime;
            return this;
        }

        /**
         * The effective time. Valid values:
         * <p>
         * 
         * *   **Immediate**: The effective time is immediate.
         * *   **MaintainTime**: The effective time is within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.
         * *   **SpecificTime**: The effective time is a specified point in time.
         * 
         * Default value: **MaintainTime**.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
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

        /**
         * The ID of the vSwitch in the destination zone. You can call the [DescribeVSwitches](~~610431~~) operation to query existing vSwitches.
         * <p>
         * 
         * >  Only database proxies for ApsaraDB RDS for MySQL instances that use cloud disks can be migrated to different zones.
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        @Override
        public ModifyDBProxyInstanceRequest build() {
            return new ModifyDBProxyInstanceRequest(this);
        } 

    } 

}
