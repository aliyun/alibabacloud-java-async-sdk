// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrepayInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrepayInstanceSpecRequest</p>
 */
public class ModifyPrepayInstanceSpecRequest extends Request {
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("MigrateAcrossZone")
    private Boolean migrateAcrossZone;

    @Query
    @NameInMap("RebootTime")
    private String rebootTime;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("RebootWhenFinished")
    private Boolean rebootWhenFinished;

    @Query
    @NameInMap("OperatorType")
    private String operatorType;

    private ModifyPrepayInstanceSpecRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.endTime = builder.endTime;
        this.migrateAcrossZone = builder.migrateAcrossZone;
        this.rebootTime = builder.rebootTime;
        this.autoPay = builder.autoPay;
        this.rebootWhenFinished = builder.rebootWhenFinished;
        this.operatorType = builder.operatorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPrepayInstanceSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return migrateAcrossZone
     */
    public Boolean getMigrateAcrossZone() {
        return this.migrateAcrossZone;
    }

    /**
     * @return rebootTime
     */
    public String getRebootTime() {
        return this.rebootTime;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return rebootWhenFinished
     */
    public Boolean getRebootWhenFinished() {
        return this.rebootWhenFinished;
    }

    /**
     * @return operatorType
     */
    public String getOperatorType() {
        return this.operatorType;
    }

    public static final class Builder extends Request.Builder<ModifyPrepayInstanceSpecRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private String ownerAccount; 
        private String resourceOwnerAccount; 
        private Long ownerId; 
        private Long resourceOwnerId; 
        private String instanceId; 
        private String instanceType; 
        private String regionId; 
        private String clientToken; 
        private String endTime; 
        private Boolean migrateAcrossZone; 
        private String rebootTime; 
        private Boolean autoPay; 
        private Boolean rebootWhenFinished; 
        private String operatorType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrepayInstanceSpecRequest response) {
            super(response);
            this.systemDisk = response.systemDisk;
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.instanceId = response.instanceId;
            this.instanceType = response.instanceType;
            this.regionId = response.regionId;
            this.clientToken = response.clientToken;
            this.endTime = response.endTime;
            this.migrateAcrossZone = response.migrateAcrossZone;
            this.rebootTime = response.rebootTime;
            this.autoPay = response.autoPay;
            this.rebootWhenFinished = response.rebootWhenFinished;
            this.operatorType = response.operatorType;
        } 

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
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
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The specification of the target instance. For more information, see [instance type family](~~ 25378 ~~) or call [DescribeInstanceTypes](~~ 25620 ~~).
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The end time of the temporary change. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mmZ.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Indicates whether the instance type can be upgraded across clusters.
         * <p>
         * 
         * Default value: false
         * 
         * If the MigrateAcrossZone parameter is set to true, note the following when you upgrade the ECS instance based on the returned information:
         * 
         * Classic network type instance:
         * 
         * * For [phased-out instance types](~~ 55263 ~~), when a non-I/O optimized instance is changed to an I/O optimized instance, the private IP address of the instance, the disk device name and software authorization code change. For Linux instances, basic cloud disks are identified as xvda or xvdb, and ultra cloud disks (cloud_efficiency) and SSD cloud disks (cloud_ssd) are identified as vda or vdb.
         * 
         * * For [normal instance type families](~~ 25378 ~~), the private IP address of the instance changes.
         * 
         * VPC instances: for phased-out instance types, when a non-I/O optimized instance is changed to an I/O optimized instance, the disk device name and software authorization code of the ECS instance change. For Linux instances, basic cloud disks are identified as xvda or xvdb, and ultra cloud disks (cloud_efficiency) and SSD cloud disks (cloud_ssd) are identified as vda or vdb.
         */
        public Builder migrateAcrossZone(Boolean migrateAcrossZone) {
            this.putQueryParameter("MigrateAcrossZone", migrateAcrossZone);
            this.migrateAcrossZone = migrateAcrossZone;
            return this;
        }

        /**
         * The restart time of the instance. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mmZ.
         */
        public Builder rebootTime(String rebootTime) {
            this.putQueryParameter("RebootTime", rebootTime);
            this.rebootTime = rebootTime;
            return this;
        }

        /**
         * Specifies whether to pay automatically when you upgrade the instance type. Valid values:
         * <p>
         * 
         * -true (default): automatic payment.
         * 
         * > make sure that the balance of the payment method is sufficient. Otherwise, an abnormal order will be generated and the order can only be canceled. If the balance of your payment method is insufficient, you can set the parameter "AutoPay" to "false" to generate an unpaid order. You can log on to the ECS console to pay by yourself.
         * 
         * -false: only generated orders are billed.
         * 
         * When the "OperatorType" parameter is set to "downgrade", the "AutoPay" parameter is ignored ".
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Indicates whether to restart the instance immediately after the configuration change. Valid values:
         * <p>
         * -true: Yes
         * -false: no
         * 
         * Default value: false
         * 
         * > If the instance is in the **stopped** state, even if you set "rebootwherefinished = true", it remains unchanged and does not perform any operations.
         */
        public Builder rebootWhenFinished(Boolean rebootWhenFinished) {
            this.putQueryParameter("RebootWhenFinished", rebootWhenFinished);
            this.rebootWhenFinished = rebootWhenFinished;
            return this;
        }

        /**
         * The operation type. Valid values:
         * <p>
         * 
         * -upgrade: upgrades the instance type. Make sure that your account balance is sufficient.
         * 
         * -downgrade: downgrade the instance type. When the instance type set by "InstanceType" is lower than the current instance type, you must set "OperatorType = downgrade ".
         * 
         * > For more information about how to upgrade or downgrade an instance type, see the preceding section.
         */
        public Builder operatorType(String operatorType) {
            this.putQueryParameter("OperatorType", operatorType);
            this.operatorType = operatorType;
            return this;
        }

        @Override
        public ModifyPrepayInstanceSpecRequest build() {
            return new ModifyPrepayInstanceSpecRequest(this);
        } 

    } 

    public static class SystemDisk extends TeaModel {
        @NameInMap("Category")
        private String category;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        public static final class Builder {
            private String category; 

            /**
             * Replacement System disk type. This parameter is only in [stop an instance of dimension](~~ 55263 ~~) upgrade to [normal sold instance dimension family](~~ 25378 ~~), and non-I/O optimization instance dimension upgrade for the I/O optimization instance dimension when effective. Valid values:
             * <p>
             * 
             * -cloud_efficiency: Ultra disk
             * 
             * -cloud_ssd:SSD cloud disk
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
}
