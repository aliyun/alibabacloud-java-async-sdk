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
    @com.aliyun.core.annotation.NameInMap("HotStoragePeriod")
    @com.aliyun.core.annotation.Validation(maximum = 7)
    private Integer hotStoragePeriod;

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
        this.hotStoragePeriod = builder.hotStoragePeriod;
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
     * @return hotStoragePeriod
     */
    public Integer getHotStoragePeriod() {
        return this.hotStoragePeriod;
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
        private Integer hotStoragePeriod; 
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
            this.hotStoragePeriod = request.hotStoragePeriod;
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
         * <p>The source of the audit log request. Valid value: <strong>Console</strong>.</p>
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
         * <p>The status of audit logging. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: Enables audit logging.</li>
         * <li><strong>disabled</strong>: Disables audit logging.</li>
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
         * <p>This parameter takes effect only in the V2_Standard edition (DAS Enterprise Edition NoSQL-compatible audit logs) and specifies the hot storage duration of audit logs. Valid values: 0 to 7. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder hotStoragePeriod(Integer hotStoragePeriod) {
            this.putQueryParameter("HotStoragePeriod", hotStoragePeriod);
            this.hotStoragePeriod = hotStoragePeriod;
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
         * <p>The edition of audit logging. Valid values:</p>
         * <ul>
         * <li><strong>Trial</strong>: Free Trial edition.</li>
         * <li><strong>Standard</strong>: Standard edition.</li>
         * <li><strong>V2_Standard</strong>: DAS Enterprise Edition (NoSQL-compatible) audit logs.<blockquote>
         * <ul>
         * <li>The default value is <strong>Trial</strong>. Starting from January 6, 2022, the Standard edition of audit logs is gradually rolled out across regions, and applications for the Free Trial edition are no longer accepted.</li>
         * <li>Starting from February 2026, DAS Enterprise Edition (NoSQL-compatible) audit logs are gradually rolled out across regions, and applications for the Standard edition are no longer accepted.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
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
         * <ul>
         * <li><p>In the Standard edition, this parameter specifies the retention period of audit logs. Valid values: 1 to 365. Default value: 30. Unit: days.</p>
         * </li>
         * <li><p>In the V2_Standard edition (DAS Enterprise Edition NoSQL-compatible audit logs), this parameter specifies the cold storage duration of audit logs. Valid values: 30, 180, 365, 1095, and 1825. Unit: days.</p>
         * </li>
         * </ul>
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
