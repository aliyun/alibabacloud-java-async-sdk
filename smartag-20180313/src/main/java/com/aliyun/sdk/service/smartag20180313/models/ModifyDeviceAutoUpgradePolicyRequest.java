// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ModifyDeviceAutoUpgradePolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyDeviceAutoUpgradePolicyRequest</p>
 */
public class ModifyDeviceAutoUpgradePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 30)
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serialNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upgradeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionType")
    private String versionType;

    private ModifyDeviceAutoUpgradePolicyRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.duration = builder.duration;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serialNumber = builder.serialNumber;
        this.smartAGId = builder.smartAGId;
        this.timeZone = builder.timeZone;
        this.upgradeType = builder.upgradeType;
        this.versionType = builder.versionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDeviceAutoUpgradePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
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
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return upgradeType
     */
    public String getUpgradeType() {
        return this.upgradeType;
    }

    /**
     * @return versionType
     */
    public String getVersionType() {
        return this.versionType;
    }

    public static final class Builder extends Request.Builder<ModifyDeviceAutoUpgradePolicyRequest, Builder> {
        private String cronExpression; 
        private Integer duration; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String serialNumber; 
        private String smartAGId; 
        private String timeZone; 
        private String upgradeType; 
        private String versionType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDeviceAutoUpgradePolicyRequest request) {
            super(request);
            this.cronExpression = request.cronExpression;
            this.duration = request.duration;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serialNumber = request.serialNumber;
            this.smartAGId = request.smartAGId;
            this.timeZone = request.timeZone;
            this.upgradeType = request.upgradeType;
            this.versionType = request.versionType;
        } 

        /**
         * <p>The time when upgrades start. Valid values: Set the parameter in a cron expression.</p>
         * <p>For example, you can use <code>0 0 4 1/1 * ?</code> to specify 04:00:00 (UTC+8) on the first day of each month.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 4 1/1 * ?</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>The time period during which upgrades are performed. Valid values: <strong>30 to 120</strong>.</p>
         * <p>Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
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
         * <p>The ID of the region where the SAG instance is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
         * <p>The serial number of the SAG device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sage62x022502****</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-1um5x5nwhilymw****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>The time zone. Valid values:</p>
         * <p><strong>Asia/Shanghai</strong>: UTC+8 (Beijing)</p>
         * <p><strong>Asia/Hong_Kong</strong>: UTC+8 (Hong Kong)</p>
         * <p><strong>Asia/Tokyo</strong>: UTC+9 (Tokyo)</p>
         * <p><strong>Australia/Sydney</strong>: UTC+10 (Sydney)</p>
         * <p><strong>Asia/Kuala_Lumpur</strong>: UTC+8 (Kuala Lumpur)</p>
         * <p><strong>Europe/Berli</strong>: UTC+1 (Berlin)</p>
         * <p><strong>Asia/Singapore</strong>: UTC+8 (Singapore)</p>
         * <p><strong>Asia/Jakarta</strong>: UTC+7 (Jakarta)</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder timeZone(String timeZone) {
            this.putQueryParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        /**
         * <p>The update type. Valid values:</p>
         * <ul>
         * <li><strong>scheduled</strong>: scheduled upgrade.</li>
         * <li><strong>boot</strong>: automatic upgrade upon device startup.</li>
         * <li><strong>manual</strong>: manual upgrade.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>scheduled</p>
         */
        public Builder upgradeType(String upgradeType) {
            this.putQueryParameter("UpgradeType", upgradeType);
            this.upgradeType = upgradeType;
            return this;
        }

        /**
         * <p>The type of software for which you want to modify the upgrade policy. Valid values:</p>
         * <ul>
         * <li><strong>Device</strong>: The operating system run by the SAG device.</li>
         * <li><strong>Dpi</strong>: The signature database used by the SAG device.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Device</p>
         */
        public Builder versionType(String versionType) {
            this.putQueryParameter("VersionType", versionType);
            this.versionType = versionType;
            return this;
        }

        @Override
        public ModifyDeviceAutoUpgradePolicyRequest build() {
            return new ModifyDeviceAutoUpgradePolicyRequest(this);
        } 

    } 

}
