// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateToOtherZoneRequest} extends {@link RequestModel}
 *
 * <p>MigrateToOtherZoneRequest</p>
 */
public class MigrateToOtherZoneRequest extends Request {
    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DBInstanceStorage")
    private Long DBInstanceStorage;

    @Query
    @NameInMap("EffectiveTime")
    private String effectiveTime;

    @Query
    @NameInMap("IoAccelerationEnabled")
    private String ioAccelerationEnabled;

    @Query
    @NameInMap("IsModifySpec")
    private String isModifySpec;

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
    @NameInMap("SwitchTime")
    private String switchTime;

    @Query
    @NameInMap("VPCId")
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    @Query
    @NameInMap("ZoneIdSlave1")
    private String zoneIdSlave1;

    @Query
    @NameInMap("ZoneIdSlave2")
    private String zoneIdSlave2;

    private MigrateToOtherZoneRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.effectiveTime = builder.effectiveTime;
        this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
        this.isModifySpec = builder.isModifySpec;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.switchTime = builder.switchTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
        this.zoneIdSlave1 = builder.zoneIdSlave1;
        this.zoneIdSlave2 = builder.zoneIdSlave2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateToOtherZoneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceStorage
     */
    public Long getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return ioAccelerationEnabled
     */
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
    }

    /**
     * @return isModifySpec
     */
    public String getIsModifySpec() {
        return this.isModifySpec;
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
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneIdSlave1
     */
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    /**
     * @return zoneIdSlave2
     */
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public static final class Builder extends Request.Builder<MigrateToOtherZoneRequest, Builder> {
        private String category; 
        private String DBInstanceClass; 
        private String DBInstanceId; 
        private Long DBInstanceStorage; 
        private String effectiveTime; 
        private String ioAccelerationEnabled; 
        private String isModifySpec; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String switchTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 
        private String zoneIdSlave1; 
        private String zoneIdSlave2; 

        private Builder() {
            super();
        } 

        private Builder(MigrateToOtherZoneRequest request) {
            super(request);
            this.category = request.category;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.effectiveTime = request.effectiveTime;
            this.ioAccelerationEnabled = request.ioAccelerationEnabled;
            this.isModifySpec = request.isModifySpec;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.switchTime = request.switchTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
            this.zoneIdSlave1 = request.zoneIdSlave1;
            this.zoneIdSlave2 = request.zoneIdSlave2;
        } 

        /**
         * The RDS edition of the instance. Valid values:
         * <p>
         * 
         * *   **Basic**: RDS Basic Edition
         * *   **HighAvailability**: RDS High-availability Edition
         * *   **AlwaysOn**: SQL Server on RDS Cluster Edition
         * *   **cluster**: MySQL on RDS Cluster Edition
         * *   **Finance**: RDS Enterprise Edition
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The new instance type of the instance. You can change the instance type of the instance. You cannot change the storage type of the instance. If you set **IsModifySpec** to **true**, you must specify at least one of DBInstanceClass and **DBInstanceStorage**.
         * <p>
         * 
         * For more information about instance types, see [Primary ApsaraDB RDS for MySQL instance types](~~276975~~).
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
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
         * The new storage capacity of the instance. If you set **IsModifySpec** to **true**, you must specify at least one of DBInstanceStorage and **DBInstanceClass**.
         * <p>
         * 
         * Unit: GB. The available storage capacity range varies based on the instance type of the instance. For more information, see [Primary ApsaraDB RDS for MySQL instance types](~~276975~~).
         */
        public Builder DBInstanceStorage(Long DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * The time when you want the change to take effect. Valid values:
         * <p>
         * 
         * *   **Immediately** (default): The change immediately takes effect.
         * *   **MaintainTime**: The change takes effect during the maintenance window. For more information, see ModifyDBInstanceMaintainTime.
         * *   **ScheduleTime**: The change takes effect at the point in time that you specify.
         * 
         * >  If you set this parameter to **ScheduleTime**, you must specify the **SwitchTime** parameter.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * IoAccelerationEnabled.
         */
        public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
            this.putQueryParameter("IoAccelerationEnabled", ioAccelerationEnabled);
            this.ioAccelerationEnabled = ioAccelerationEnabled;
            return this;
        }

        /**
         * Specifies whether to change the specifications of the instance during the cross-zone migration. Valid values:
         * <p>
         * 
         * *   **true**: You want to change the specifications of the instance during the cross-zone migration. If you set this parameter to **true**, you must specify at least one of **DBInstanceClass** and **DBInstanceStorage**.
         * *   **false** (default): You do not want to change the specifications of the instance during the cross-zone migration.
         * 
         * > This parameter applies only to instances that run MySQL.
         */
        public Builder isModifySpec(String isModifySpec) {
            this.putQueryParameter("IsModifySpec", isModifySpec);
            this.isModifySpec = isModifySpec;
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
         * The migration time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         * <p>
         * 
         * > This parameter is used with **EffectiveTime**. You must specify this parameter only when **EffectiveTime** is set to **ScheduleTime**.
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC). Do not change the VPC of the instance when you migrate the instance across zones.
         * <p>
         * 
         * *   This parameter must be specified when the instance resides in a VPC.
         * *   If the instance runs SQL Server, you can change the VPC of the instance.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * The vSwitch ID.
         * <p>
         * 
         * *   This parameter must be specified when the instance resides in a VPC. You can call the DescribeVSwitches operation to query existing vSwitches.
         * *   If the instance runs PostgreSQL or SQL Server and a secondary zone is specified for the instance, you can specify multiple vSwitch IDs, each of which corresponds to a zone. Separate the vSwitch IDs with commas (,).
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the destination zone. You can call the DescribeRegions operation to query the most recent region list.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The secondary zone 1 of the instance.
         * <p>
         * 
         * >  This parameter must be configured if the instance runs RDS editions other than RDS Basic Edition.
         */
        public Builder zoneIdSlave1(String zoneIdSlave1) {
            this.putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
            this.zoneIdSlave1 = zoneIdSlave1;
            return this;
        }

        /**
         * The secondary zone 2 of the instance.
         * <p>
         * 
         * >  You can specify this parameter only for instances that run RDS Enterprise Edition.
         */
        public Builder zoneIdSlave2(String zoneIdSlave2) {
            this.putQueryParameter("ZoneIdSlave2", zoneIdSlave2);
            this.zoneIdSlave2 = zoneIdSlave2;
            return this;
        }

        @Override
        public MigrateToOtherZoneRequest build() {
            return new MigrateToOtherZoneRequest(this);
        } 

    } 

}
