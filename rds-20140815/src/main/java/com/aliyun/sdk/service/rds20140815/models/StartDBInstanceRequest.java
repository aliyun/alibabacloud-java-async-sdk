// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link StartDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartDBInstanceRequest</p>
 */
public class StartDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceTransType")
    private Integer DBInstanceTransType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

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
    @com.aliyun.core.annotation.NameInMap("SpecifiedTime")
    private String specifiedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Storage")
    private Integer storage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDBInstanceClass")
    private String targetDBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDedicatedHostIdForLog")
    private String targetDedicatedHostIdForLog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDedicatedHostIdForMaster")
    private String targetDedicatedHostIdForMaster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDedicatedHostIdForSlave")
    private String targetDedicatedHostIdForSlave;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private StartDBInstanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceTransType = builder.DBInstanceTransType;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.effectiveTime = builder.effectiveTime;
        this.engineVersion = builder.engineVersion;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.specifiedTime = builder.specifiedTime;
        this.storage = builder.storage;
        this.targetDBInstanceClass = builder.targetDBInstanceClass;
        this.targetDedicatedHostIdForLog = builder.targetDedicatedHostIdForLog;
        this.targetDedicatedHostIdForMaster = builder.targetDedicatedHostIdForMaster;
        this.targetDedicatedHostIdForSlave = builder.targetDedicatedHostIdForSlave;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDBInstanceRequest create() {
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
     * @return DBInstanceTransType
     */
    public Integer getDBInstanceTransType() {
        return this.DBInstanceTransType;
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
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
     * @return specifiedTime
     */
    public String getSpecifiedTime() {
        return this.specifiedTime;
    }

    /**
     * @return storage
     */
    public Integer getStorage() {
        return this.storage;
    }

    /**
     * @return targetDBInstanceClass
     */
    public String getTargetDBInstanceClass() {
        return this.targetDBInstanceClass;
    }

    /**
     * @return targetDedicatedHostIdForLog
     */
    public String getTargetDedicatedHostIdForLog() {
        return this.targetDedicatedHostIdForLog;
    }

    /**
     * @return targetDedicatedHostIdForMaster
     */
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    /**
     * @return targetDedicatedHostIdForSlave
     */
    public String getTargetDedicatedHostIdForSlave() {
        return this.targetDedicatedHostIdForSlave;
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

    public static final class Builder extends Request.Builder<StartDBInstanceRequest, Builder> {
        private String DBInstanceId; 
        private Integer DBInstanceTransType; 
        private String dedicatedHostGroupId; 
        private String effectiveTime; 
        private String engineVersion; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String specifiedTime; 
        private Integer storage; 
        private String targetDBInstanceClass; 
        private String targetDedicatedHostIdForLog; 
        private String targetDedicatedHostIdForMaster; 
        private String targetDedicatedHostIdForSlave; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(StartDBInstanceRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceTransType = request.DBInstanceTransType;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.effectiveTime = request.effectiveTime;
            this.engineVersion = request.engineVersion;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.specifiedTime = request.specifiedTime;
            this.storage = request.storage;
            this.targetDBInstanceClass = request.targetDBInstanceClass;
            this.targetDedicatedHostIdForLog = request.targetDedicatedHostIdForLog;
            this.targetDedicatedHostIdForMaster = request.targetDedicatedHostIdForMaster;
            this.targetDedicatedHostIdForSlave = request.targetDedicatedHostIdForSlave;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The data migration method of the instance. This parameter is available only for instances that are created in dedicated clusters. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): The system preferentially upgrades or downgrades the instance without a migration. If the resources on the host on which the instance resides are insufficient, the system migrates the instance to another suitable host.</li>
         * <li><strong>1</strong>: The system upgrades or downgrades the instance without a migration. If the upgrade or downgrade is not supported, the system reports an error.</li>
         * <li><strong>2</strong>: The system migrates the data of the instance from the host on which the instance resides to another host. You must also specify <strong>DedicatedHostGroupId</strong>, <strong>TargetDedicatedHostIdForMaster</strong>, and <strong>TargetDedicatedHostIdForSlave</strong>. If you set DBInstanceTransType to 2, you cannot migrate the data of the instance to the host on which the instance resides. If you migrate the data of the instance to the host on which the instance resides, the migration fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder DBInstanceTransType(Integer DBInstanceTransType) {
            this.putQueryParameter("DBInstanceTransType", DBInstanceTransType);
            this.DBInstanceTransType = DBInstanceTransType;
            return this;
        }

        /**
         * <p>The dedicated cluster ID. This parameter is supported if you call this operation to suspend an RDS instance in the dedicated cluster. You can call the DescribeDedicatedHostGroups operation to query the dedicated cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-39****</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>The effective time. This parameter is available only for instances that are created in dedicated clusters.</p>
         * <ul>
         * <li><strong>Immediate</strong></li>
         * <li><strong>MaintainTime</strong>: The change takes effect during the planned maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
         * <li><strong>SpecificTime</strong>: The change takes effect at a specified point in time.</li>
         * </ul>
         * <p>Default value: MaintainTime.</p>
         * 
         * <strong>example:</strong>
         * <p>Immediate</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>The database engine version of the instance. This parameter is available only for instances that are created in dedicated clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
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
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>The switching time. This parameter is available only for instances that are created in dedicated clusters. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p>This parameter must be specified when <strong>EffectiveTime</strong> is set to <strong>Specified</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-10-21T10:00:00Z</p>
         */
        public Builder specifiedTime(String specifiedTime) {
            this.putQueryParameter("SpecifiedTime", specifiedTime);
            this.specifiedTime = specifiedTime;
            return this;
        }

        /**
         * <p>The storage capacity of the instance. This parameter is available only for instances that are created in dedicated clusters. Valid values: <strong>5 to 2000</strong>. Unit: GB. If you do not specify this parameter, the storage capacity of the instance remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder storage(Integer storage) {
            this.putQueryParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        /**
         * <p>The instance type of the required instance. This parameter is available only for instances that are created in dedicated clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.ebmhfc6.20xlarge</p>
         */
        public Builder targetDBInstanceClass(String targetDBInstanceClass) {
            this.putQueryParameter("TargetDBInstanceClass", targetDBInstanceClass);
            this.targetDBInstanceClass = targetDBInstanceClass;
            return this;
        }

        /**
         * <p>A deprecated parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp****</p>
         */
        public Builder targetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
            this.putQueryParameter("TargetDedicatedHostIdForLog", targetDedicatedHostIdForLog);
            this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
            return this;
        }

        /**
         * <p>The ID of the host on which the primary instance is created. This parameter is available only for instances that are created in dedicated clusters.</p>
         * <blockquote>
         * <p>This parameter must be specified when <strong>DBInstanceTransType</strong> is set to <strong>2</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dh-bp****</p>
         */
        public Builder targetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
            this.putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
            this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
            return this;
        }

        /**
         * <p>The ID of the host on which the secondary instance is created. This parameter is available only for instances that are created in dedicated clusters.</p>
         * <blockquote>
         * <p>This parameter must be specified when <strong>DBInstanceTransType</strong> is set to <strong>2</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dh-bp****</p>
         */
        public Builder targetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
            this.putQueryParameter("TargetDedicatedHostIdForSlave", targetDedicatedHostIdForSlave);
            this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
            return this;
        }

        /**
         * <p>The vSwitch ID. This parameter is available only for instances that are created in dedicated clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID. This parameter is available only for instances that are created in dedicated clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public StartDBInstanceRequest build() {
            return new StartDBInstanceRequest(this);
        } 

    } 

}
