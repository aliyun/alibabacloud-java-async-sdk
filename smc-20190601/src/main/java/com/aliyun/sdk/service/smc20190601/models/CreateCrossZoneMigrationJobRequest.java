// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCrossZoneMigrationJobRequest} extends {@link RequestModel}
 *
 * <p>CreateCrossZoneMigrationJobRequest</p>
 */
public class CreateCrossZoneMigrationJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Disk")
    private java.util.List < Disk> disk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInstanceType")
    private String targetInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetVSwitchId")
    private String targetVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetZoneId")
    private String targetZoneId;

    private CreateCrossZoneMigrationJobRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.clientToken = builder.clientToken;
        this.disk = builder.disk;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.targetInstanceType = builder.targetInstanceType;
        this.targetVSwitchId = builder.targetVSwitchId;
        this.targetZoneId = builder.targetZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCrossZoneMigrationJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List < Disk> getDisk() {
        return this.disk;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return targetInstanceType
     */
    public String getTargetInstanceType() {
        return this.targetInstanceType;
    }

    /**
     * @return targetVSwitchId
     */
    public String getTargetVSwitchId() {
        return this.targetVSwitchId;
    }

    /**
     * @return targetZoneId
     */
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

    public static final class Builder extends Request.Builder<CreateCrossZoneMigrationJobRequest, Builder> {
        private Boolean autoPay; 
        private String clientToken; 
        private java.util.List < Disk> disk; 
        private String instanceId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private String targetInstanceType; 
        private String targetVSwitchId; 
        private String targetZoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCrossZoneMigrationJobRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.clientToken = request.clientToken;
            this.disk = request.disk;
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.targetInstanceType = request.targetInstanceType;
            this.targetVSwitchId = request.targetVSwitchId;
            this.targetZoneId = request.targetZoneId;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Disk.
         */
        public Builder disk(java.util.List < Disk> disk) {
            this.putQueryParameter("Disk", disk);
            this.disk = disk;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * TargetInstanceType.
         */
        public Builder targetInstanceType(String targetInstanceType) {
            this.putQueryParameter("TargetInstanceType", targetInstanceType);
            this.targetInstanceType = targetInstanceType;
            return this;
        }

        /**
         * TargetVSwitchId.
         */
        public Builder targetVSwitchId(String targetVSwitchId) {
            this.putQueryParameter("TargetVSwitchId", targetVSwitchId);
            this.targetVSwitchId = targetVSwitchId;
            return this;
        }

        /**
         * TargetZoneId.
         */
        public Builder targetZoneId(String targetZoneId) {
            this.putQueryParameter("TargetZoneId", targetZoneId);
            this.targetZoneId = targetZoneId;
            return this;
        }

        @Override
        public CreateCrossZoneMigrationJobRequest build() {
            return new CreateCrossZoneMigrationJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCrossZoneMigrationJobRequest} extends {@link TeaModel}
     *
     * <p>CreateCrossZoneMigrationJobRequest</p>
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

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * PerformanceLevel.
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
