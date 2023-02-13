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
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("MigrateAcrossZone")
    private Boolean migrateAcrossZone;

    @Query
    @NameInMap("OperatorType")
    private String operatorType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RebootTime")
    private String rebootTime;

    @Query
    @NameInMap("RebootWhenFinished")
    private Boolean rebootWhenFinished;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyPrepayInstanceSpecRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.autoPay = builder.autoPay;
        this.clientToken = builder.clientToken;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.migrateAcrossZone = builder.migrateAcrossZone;
        this.operatorType = builder.operatorType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.rebootTime = builder.rebootTime;
        this.rebootWhenFinished = builder.rebootWhenFinished;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
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
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
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
     * @return migrateAcrossZone
     */
    public Boolean getMigrateAcrossZone() {
        return this.migrateAcrossZone;
    }

    /**
     * @return operatorType
     */
    public String getOperatorType() {
        return this.operatorType;
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
     * @return rebootTime
     */
    public String getRebootTime() {
        return this.rebootTime;
    }

    /**
     * @return rebootWhenFinished
     */
    public Boolean getRebootWhenFinished() {
        return this.rebootWhenFinished;
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

    public static final class Builder extends Request.Builder<ModifyPrepayInstanceSpecRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private Boolean autoPay; 
        private String clientToken; 
        private String endTime; 
        private String instanceId; 
        private String instanceType; 
        private Boolean migrateAcrossZone; 
        private String operatorType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String rebootTime; 
        private Boolean rebootWhenFinished; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrepayInstanceSpecRequest request) {
            super(request);
            this.systemDisk = request.systemDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.autoPay = request.autoPay;
            this.clientToken = request.clientToken;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.migrateAcrossZone = request.migrateAcrossZone;
            this.operatorType = request.operatorType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.rebootTime = request.rebootTime;
            this.rebootWhenFinished = request.rebootWhenFinished;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * Specifies whether to enable automatic payment when you upgrade the instance type. Valid values:
         * <p>
         * 
         * *   true: enables automatic payment.
         *     > Make sure that your account balance is sufficient. Otherwise, your order becomes invalid. If your account balance is insufficient, you can set the `AutoPay` parameter to `false` to generate an unpaid order. Then, you can log on to the ECS console to pay for the order.
         * 
         * *   false: An order is generated but no payment is made.
         * 
         * Default value: true.
         * 
         * When `OperatorType` is set to `downgrade`, `AutoPay` is ignored.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The end time of the temporary change. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The new instance type. For information about available instance types, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Specifies whether to support cross-cluster instance type upgrades.
         * <p>
         * 
         * Default value: false.
         * 
         * When the `MigrateAcrossZone` parameter is set to `true` and you upgrade the instance based on the returned information, take note of the following items:
         * 
         * Instances of the classic network type:
         * 
         * *   For retired instance types, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the private IP address, disk device names, and software license codes of the instance are changed. For more information, see [Retired instance types](~~55263~~). For Linux instances, basic disks (cloud) are identified as xvd\* such as xvda and xvdb. Ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vd\* such as vda and vdb.
         * *   For instance families available for purchase, when the instance type of an instance is changed, the private IP address of the instance is also changed. For more information, see [Instance families](~~25378~~).
         * 
         * Instances of the Virtual Private Cloud (VPC) type: For retired instance types, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the disk device names and software license codes of the instance are changed. For Linux instances, basic disks (cloud) are identified as xvd\* such as xvda and xvdb. Ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vd\* such as vda and vdb.
         */
        public Builder migrateAcrossZone(Boolean migrateAcrossZone) {
            this.putQueryParameter("MigrateAcrossZone", migrateAcrossZone);
            this.migrateAcrossZone = migrateAcrossZone;
            return this;
        }

        /**
         * The operation type. Valid values:
         * <p>
         * 
         * >  This parameter is optional. The system can define the operation type. If you want to specify this parameter, take note of the following rules:
         * 
         * *   upgrade: upgrades the instance type. Make sure that the balance in your account is sufficient.
         * *   downgrade: downgrades the instance type. When the new instance type specified by the `InstanceType` parameter has lower specifications than the current instance type, set `OperatorType` to downgrade.
         * 
         * >  For more information about the precautions on upgrading or downgrading instance types, see the preceding "Description" section in this topic.
         */
        public Builder operatorType(String operatorType) {
            this.putQueryParameter("OperatorType", operatorType);
            this.operatorType = operatorType;
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
         * The restart time of the instance. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder rebootTime(String rebootTime) {
            this.putQueryParameter("RebootTime", rebootTime);
            this.rebootTime = rebootTime;
            return this;
        }

        /**
         * Specifies whether to restart the instance immediately after the instance type is changed. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         * 
         * >  If the instance is in the **Stopping** state, the instance state remains unchanged and no operations are performed regardless of whether the `RebootWhenFinished` parameter is set to true.
         */
        public Builder rebootWhenFinished(Boolean rebootWhenFinished) {
            this.putQueryParameter("RebootWhenFinished", rebootWhenFinished);
            this.rebootWhenFinished = rebootWhenFinished;
            return this;
        }

        /**
         * The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
             * The new category of the system disk. This parameter is valid only when you upgrade an instance from a retired instance type to an available instance type or upgrade a non-I/O optimized instance to an I/O optimized instance. For more information, see [Retired instance types](~~55263~~) and [Instance families](~~25378~~). Valid values:
             * <p>
             * 
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
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
