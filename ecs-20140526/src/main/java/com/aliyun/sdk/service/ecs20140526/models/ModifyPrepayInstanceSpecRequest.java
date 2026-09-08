// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ModifyPrepayInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrepayInstanceSpecRequest</p>
 */
public class ModifyPrepayInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Disk")
    private java.util.List<Disk> disk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrateAcrossZone")
    private Boolean migrateAcrossZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyMode")
    private String modifyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorType")
    private String operatorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RebootTime")
    private String rebootTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RebootWhenFinished")
    private Boolean rebootWhenFinished;

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

    private ModifyPrepayInstanceSpecRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.autoPay = builder.autoPay;
        this.clientToken = builder.clientToken;
        this.disk = builder.disk;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.migrateAcrossZone = builder.migrateAcrossZone;
        this.modifyMode = builder.modifyMode;
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
     * @return disk
     */
    public java.util.List<Disk> getDisk() {
        return this.disk;
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
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
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
        private java.util.List<Disk> disk; 
        private String endTime; 
        private String instanceId; 
        private String instanceType; 
        private Boolean migrateAcrossZone; 
        private String modifyMode; 
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
            this.disk = request.disk;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.migrateAcrossZone = request.migrateAcrossZone;
            this.modifyMode = request.modifyMode;
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
         * <p>Specifies whether to automatically complete the payment when you upgrade the instance type. Valid values:</p>
         * <ul>
         * <li>true: The payment is automatically completed.</li>
         * <li>false: An order is created but the payment is not completed.</li>
         * </ul>
         * <p>Default value: true.</p>
         * <blockquote>
         * <ul>
         * <li>If automatic payment is enabled, make sure that the balance of your payment method is sufficient. Otherwise, an abnormal order is generated and can only be voided.</li>
         * <li>If the balance of your payment method is insufficient, set <code>AutoPay</code> to <code>false</code>. An unpaid order is generated. You can log on to the ECS console to complete the payment.</li>
         * <li>When <code>OperatorType</code> is set to <code>downgrade</code>, the <code>AutoPay</code> parameter is ignored.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         */
        public Builder disk(java.util.List<Disk> disk) {
            this.putQueryParameter("Disk", disk);
            this.disk = disk;
            return this;
        }

        /**
         * <p>The end time of the temporary instance type change. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-01T12:05Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4ph****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The target instance type for the Upgrade/Downgrade. For valid values, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance family</a> or invoke <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.xlarge</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Specifies whether to support cross-cluster Upgrade/Downgrade of instance types. Valid values:</p>
         * <ul>
         * <li>true: Cross-cluster instance type changes are supported.</li>
         * <li>false: Cross-cluster instance type changes are not supported.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <p>When the <code>MigrateAcrossZone</code> parameter is set to <code>true</code>, take note of the following items after you upgrade the Elastic Compute Service instance based on the response:</p>
         * <p>VPC-type instances: For <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>, when a non-I/O optimized instance is changed to an I/O optimized instance, the disk device names and software authorization codes of the server change. For Linux instances, basic disks (cloud) are identified as xvda or xvdb. Ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vda or vdb.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder migrateAcrossZone(Boolean migrateAcrossZone) {
            this.putQueryParameter("MigrateAcrossZone", migrateAcrossZone);
            this.migrateAcrossZone = migrateAcrossZone;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * <p>The type of the operation. Valid values:</p>
         * <blockquote>
         * <p>This parameter is optional. The system can automatically determine whether the operation is an upgrade or a downgrade. If you specify this parameter, follow the rules below.</p>
         * </blockquote>
         * <ul>
         * <li><p>upgrade: upgrades the instance type. Make sure that the balance of your payment method is sufficient.</p>
         * </li>
         * <li><p>downgrade: downgrades the instance type. Set <code>OperatorType</code> to <code>downgrade</code> when the instance type specified by <code>InstanceType</code> is lower than the current instance type.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For precautions about upgrading or downgrading instance types, see the operation description section above.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>upgrade</p>
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
         * <p>The restart time of the instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-01T12:05Z</p>
         */
        public Builder rebootTime(String rebootTime) {
            this.putQueryParameter("RebootTime", rebootTime);
            this.rebootTime = rebootTime;
            return this;
        }

        /**
         * <p>Specifies whether to immediately restart the instance after the instance type change is complete. Valid values:</p>
         * <ul>
         * <li>true: The instance is immediately restarted.</li>
         * <li>false: The instance is not immediately restarted.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>If the instance is in the <strong>Stopped</strong> state, the instance remains stopped even if you set <code>RebootWhenFinished</code> to <code>true</code>. No operation is performed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder rebootWhenFinished(Boolean rebootWhenFinished) {
            this.putQueryParameter("RebootWhenFinished", rebootWhenFinished);
            this.rebootWhenFinished = rebootWhenFinished;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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

        @Override
        public ModifyPrepayInstanceSpecRequest build() {
            return new ModifyPrepayInstanceSpecRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyPrepayInstanceSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyPrepayInstanceSpecRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
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

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.category = model.category;
            } 

            /**
             * <p>The new system disk category. Valid values:</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: standard SSD.<blockquote>
             * <p>This parameter is valid only when you upgrade from a <a href="https://help.aliyun.com/document_detail/55263.html">retired instance type</a> to an <a href="https://help.aliyun.com/document_detail/25378.html">instance family that is available for purchase</a> and change a non-I/O optimized instance to an I/O optimized instance.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
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
    /**
     * 
     * {@link ModifyPrepayInstanceSpecRequest} extends {@link TeaModel}
     *
     * <p>ModifyPrepayInstanceSpecRequest</p>
     */
    public static class Disk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        private Disk(Builder builder) {
            this.category = builder.category;
            this.diskId = builder.diskId;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private String category; 
            private String diskId; 
            private String performanceLevel; 

            private Builder() {
            } 

            private Builder(Disk model) {
                this.category = model.category;
                this.diskId = model.diskId;
                this.performanceLevel = model.performanceLevel;
            } 

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
}
