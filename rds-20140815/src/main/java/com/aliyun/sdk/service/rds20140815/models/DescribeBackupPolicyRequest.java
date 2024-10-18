// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupPolicyRequest</p>
 */
public class DescribeBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPolicyMode")
    private String backupPolicyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompressType")
    private String compressType;

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
    @com.aliyun.core.annotation.NameInMap("ReleasedKeepPolicy")
    private String releasedKeepPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeBackupPolicyRequest(Builder builder) {
        super(builder);
        this.backupPolicyMode = builder.backupPolicyMode;
        this.compressType = builder.compressType;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.releasedKeepPolicy = builder.releasedKeepPolicy;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupPolicyMode
     */
    public String getBackupPolicyMode() {
        return this.backupPolicyMode;
    }

    /**
     * @return compressType
     */
    public String getCompressType() {
        return this.compressType;
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
     * @return releasedKeepPolicy
     */
    public String getReleasedKeepPolicy() {
        return this.releasedKeepPolicy;
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

    public static final class Builder extends Request.Builder<DescribeBackupPolicyRequest, Builder> {
        private String backupPolicyMode; 
        private String compressType; 
        private String DBInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String releasedKeepPolicy; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupPolicyRequest request) {
            super(request);
            this.backupPolicyMode = request.backupPolicyMode;
            this.compressType = request.compressType;
            this.DBInstanceId = request.DBInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.releasedKeepPolicy = request.releasedKeepPolicy;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>DataBackupPolicy</strong>: data backup</li>
         * <li><strong>LogBackupPolicy</strong>: log backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataBackupPolicy</p>
         */
        public Builder backupPolicyMode(String backupPolicyMode) {
            this.putQueryParameter("BackupPolicyMode", backupPolicyMode);
            this.backupPolicyMode = backupPolicyMode;
            return this;
        }

        /**
         * <p>The method that is used to compress backup data. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Backup data is not compressed.</li>
         * <li><strong>1</strong>: Backup data is compressed by using zlib.</li>
         * <li><strong>2</strong>: Backup data is compressed by using zlib that invokes more than one thread in parallel for each backup.</li>
         * <li><strong>4</strong>: Backup data is compressed by using QuickLZ and can be used to restore individual databases or tables.</li>
         * <li><strong>8</strong>: Backup data is compressed by using QuickLZ but cannot be used to restore individual databases or tables.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder compressType(String compressType) {
            this.putQueryParameter("CompressType", compressType);
            this.compressType = compressType;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
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
         * <p>The policy that is used to retain archived backup files if the instance is released. Valid values:</p>
         * <ul>
         * <li><strong>None</strong>: No archived backup files are retained.</li>
         * <li><strong>Lastest</strong>: Only the last archived backup file is retained.</li>
         * <li><strong>All</strong>: All archived backup files are retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Lastest</p>
         */
        public Builder releasedKeepPolicy(String releasedKeepPolicy) {
            this.putQueryParameter("ReleasedKeepPolicy", releasedKeepPolicy);
            this.releasedKeepPolicy = releasedKeepPolicy;
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
        public DescribeBackupPolicyRequest build() {
            return new DescribeBackupPolicyRequest(this);
        } 

    } 

}
