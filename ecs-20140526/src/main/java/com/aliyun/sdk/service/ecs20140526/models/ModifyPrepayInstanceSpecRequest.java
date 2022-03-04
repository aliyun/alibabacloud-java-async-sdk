// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @Query
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("MigrateAcrossZone")
    private Boolean migrateAcrossZone;

    @Query
    @NameInMap("RebootWhenFinished")
    private Boolean rebootWhenFinished;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("OperatorType")
    private String operatorType;

    @Query
    @NameInMap("RebootTime")
    private String rebootTime;

    private ModifyPrepayInstanceSpecRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.clientToken = builder.clientToken;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.instanceId = builder.instanceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.regionId = builder.regionId;
        this.autoPay = builder.autoPay;
        this.migrateAcrossZone = builder.migrateAcrossZone;
        this.rebootWhenFinished = builder.rebootWhenFinished;
        this.endTime = builder.endTime;
        this.instanceType = builder.instanceType;
        this.operatorType = builder.operatorType;
        this.rebootTime = builder.rebootTime;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return migrateAcrossZone
     */
    public Boolean getMigrateAcrossZone() {
        return this.migrateAcrossZone;
    }

    /**
     * @return rebootWhenFinished
     */
    public Boolean getRebootWhenFinished() {
        return this.rebootWhenFinished;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return operatorType
     */
    public String getOperatorType() {
        return this.operatorType;
    }

    /**
     * @return rebootTime
     */
    public String getRebootTime() {
        return this.rebootTime;
    }

    public static final class Builder extends Request.Builder<ModifyPrepayInstanceSpecRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String clientToken; 
        private Long resourceOwnerId; 
        private String instanceId; 
        private String resourceOwnerAccount; 
        private String regionId; 
        private Boolean autoPay; 
        private Boolean migrateAcrossZone; 
        private Boolean rebootWhenFinished; 
        private String endTime; 
        private String instanceType; 
        private String operatorType; 
        private String rebootTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrepayInstanceSpecRequest request) {
            super(request);
            this.systemDisk = request.systemDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.clientToken = request.clientToken;
            this.resourceOwnerId = request.resourceOwnerId;
            this.instanceId = request.instanceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.regionId = request.regionId;
            this.autoPay = request.autoPay;
            this.migrateAcrossZone = request.migrateAcrossZone;
            this.rebootWhenFinished = request.rebootWhenFinished;
            this.endTime = request.endTime;
            this.instanceType = request.instanceType;
            this.operatorType = request.operatorType;
            this.rebootTime = request.rebootTime;
        } 

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
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
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * Indicates whether the instance type can be upgraded across clusters.
         * <p>
         * 
         * Default value: false
         * 
         * If the MigrateAcrossZone parameter is set to true, note the following when you upgrade the ECS instance based on the returned information:
         * 
         * Classic network type instance:
         * 
         * * For [phased-out instance types](~~ 55263 ~~), when a non-I/O optimized instance is changed to an I/O optimized instance, the private IP address, disk device name, and software authorization code of the instance change. For Linux instances, basic cloud disks are identified as xvda or xvdb, and ultra cloud disks (cloud_efficiency) and SSD cloud disks (cloud_ssd) are identified as vda or vdb.
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
         * The end time of the temporary change. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mmZ.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * The operation type. Valid values:
         * <p>
         * 
         * -upgrade: upgrades the instance type. Make sure that your account balance is sufficient.
         * 
         * -downgrade: downgrade the instance type. When the instance type set by "InstanceType" is lower than the current instance type, you must set "OperatorType = downgrade ".
         * 
         * > for more information about how to upgrade or downgrade an instance type, see the preceding section.
         */
        public Builder operatorType(String operatorType) {
            this.putQueryParameter("OperatorType", operatorType);
            this.operatorType = operatorType;
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
             * Change the system disk type. This parameter is valid only when the instance type is upgraded from [phased-out instance type](~~ 55263 ~~) to [normal instance type family](~~ 25378 ~~), and the non-I/O optimized instance type is upgraded to the I/O optimized instance type. Valid values:
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
