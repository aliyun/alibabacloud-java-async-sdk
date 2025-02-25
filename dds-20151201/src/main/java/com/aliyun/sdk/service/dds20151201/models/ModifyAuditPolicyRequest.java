// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link ModifyAuditPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyAuditPolicyRequest</p>
 */
public class ModifyAuditPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditLogSwitchSource")
    private String auditLogSwitchSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String auditStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoragePeriod")
    @com.aliyun.core.annotation.Validation(maximum = 365, minimum = 1)
    private Integer storagePeriod;

    private ModifyAuditPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.auditLogSwitchSource = builder.auditLogSwitchSource;
        this.auditStatus = builder.auditStatus;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceType = builder.serviceType;
        this.storagePeriod = builder.storagePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAuditPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return auditLogSwitchSource
     */
    public String getAuditLogSwitchSource() {
        return this.auditLogSwitchSource;
    }

    /**
     * @return auditStatus
     */
    public String getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return storagePeriod
     */
    public Integer getStoragePeriod() {
        return this.storagePeriod;
    }

    public static final class Builder extends Request.Builder<ModifyAuditPolicyRequest, Builder> {
        private String regionId; 
        private String auditLogSwitchSource; 
        private String auditStatus; 
        private String DBInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String serviceType; 
        private Integer storagePeriod; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAuditPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.auditLogSwitchSource = request.auditLogSwitchSource;
            this.auditStatus = request.auditStatus;
            this.DBInstanceId = request.DBInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serviceType = request.serviceType;
            this.storagePeriod = request.storagePeriod;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request source for the audit log feature. Set the value to <strong>Console</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Console</p>
         */
        public Builder auditLogSwitchSource(String auditLogSwitchSource) {
            this.putQueryParameter("AuditLogSwitchSource", auditLogSwitchSource);
            this.auditLogSwitchSource = auditLogSwitchSource;
            return this;
        }

        /**
         * <p>Specifies whether to enable the audit log feature. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong></li>
         * <li><strong>disabled</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder auditStatus(String auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp1785659e3f****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
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
         * <p>The type of the audit log feature. Valid values:</p>
         * <ul>
         * <li><strong>Trail</strong>: free trial edition.</li>
         * <li><strong>Standard</strong>: official edition.</li>
         * </ul>
         * <blockquote>
         * <p>The default value is <strong>Trail</strong>. Starting from January 6, 2022, the official edition of the audit log feature has been launched in all regions, and the free trial edition of the feature can no longer be applied for. We recommend that you set this parameter to <strong>Standard</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>The log retention period. Valid values: 1 to 365 days. Default value: 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder storagePeriod(Integer storagePeriod) {
            this.putQueryParameter("StoragePeriod", storagePeriod);
            this.storagePeriod = storagePeriod;
            return this;
        }

        @Override
        public ModifyAuditPolicyRequest build() {
            return new ModifyAuditPolicyRequest(this);
        } 

    } 

}
