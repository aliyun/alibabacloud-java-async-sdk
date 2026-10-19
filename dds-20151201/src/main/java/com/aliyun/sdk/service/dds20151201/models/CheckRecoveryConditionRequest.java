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
 * {@link CheckRecoveryConditionRequest} extends {@link RequestModel}
 *
 * <p>CheckRecoveryConditionRequest</p>
 */
public class CheckRecoveryConditionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseNames")
    private String databaseNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestRegion")
    private String destRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreType")
    private String restoreType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBInstance")
    private String sourceDBInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcRegion")
    private String srcRegion;

    private CheckRecoveryConditionRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.databaseNames = builder.databaseNames;
        this.destRegion = builder.destRegion;
        this.engineVersion = builder.engineVersion;
        this.instanceType = builder.instanceType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.restoreType = builder.restoreType;
        this.sourceDBInstance = builder.sourceDBInstance;
        this.srcRegion = builder.srcRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRecoveryConditionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return databaseNames
     */
    public String getDatabaseNames() {
        return this.databaseNames;
    }

    /**
     * @return destRegion
     */
    public String getDestRegion() {
        return this.destRegion;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
    }

    /**
     * @return sourceDBInstance
     */
    public String getSourceDBInstance() {
        return this.sourceDBInstance;
    }

    /**
     * @return srcRegion
     */
    public String getSrcRegion() {
        return this.srcRegion;
    }

    public static final class Builder extends Request.Builder<CheckRecoveryConditionRequest, Builder> {
        private String backupId; 
        private String databaseNames; 
        private String destRegion; 
        private String engineVersion; 
        private String instanceType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String restoreType; 
        private String sourceDBInstance; 
        private String srcRegion; 

        private Builder() {
            super();
        } 

        private Builder(CheckRecoveryConditionRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.databaseNames = request.databaseNames;
            this.destRegion = request.destRegion;
            this.engineVersion = request.engineVersion;
            this.instanceType = request.instanceType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.restoreType = request.restoreType;
            this.sourceDBInstance = request.sourceDBInstance;
            this.srcRegion = request.srcRegion;
        } 

        /**
         * <p>The ID of the backup set.</p>
         * <blockquote>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/62172.html">DescribeBackups</a> operation to query the backup ID.</li>
         * <li>You must specify either this parameter or the <strong>RestoreTime</strong> parameter.</li>
         * <li>This parameter is not supported for sharded cluster instances.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5664****</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The names of the databases to be restored. The value is a JSON array.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, all databases are restored by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;db1&quot;,&quot;db2&quot;]</p>
         */
        public Builder databaseNames(String databaseNames) {
            this.putQueryParameter("DatabaseNames", databaseNames);
            this.databaseNames = databaseNames;
            return this;
        }

        /**
         * <p>The area where the backup set resides during geo-redundancy recover.</p>
         * <blockquote>
         * <p>This parameter is required when the backup recover type is geo-redundancy cloning.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder destRegion(String destRegion) {
            this.putQueryParameter("DestRegion", destRegion);
            this.destRegion = destRegion;
            return this;
        }

        /**
         * <p>The database version. Valid values:</p>
         * <ul>
         * <li><strong>8.0</strong></li>
         * <li><strong>7.0</strong></li>
         * <li><strong>6.0</strong></li>
         * <li><strong>5.0</strong></li>
         * <li><strong>4.4</strong></li>
         * <li><strong>4.2</strong></li>
         * <li><strong>4.0</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4.2</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>replicate </li>
         * <li>sharding</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is required when the backup recover type is rebuilding a deleted instance.</li>
         * <li>This parameter is required when the backup recover type is geo-redundancy cloning.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>replicate</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp179****</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The point in time to which you want to restore the instance. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li>The value can be any point in time within the last seven days. The value must be earlier than the current time and later than the creation time of the instance.</li>
         * <li>You must specify either this parameter or the <strong>BackupId</strong> parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-08-22T08:00:00Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The backup recover type. Valid values:</p>
         * <blockquote>
         * <ul>
         * <li>0: local backup recover</li>
         * <li>1: local point-in-time recover</li>
         * <li>2: backup recover of a deleted instance using a backup set</li>
         * <li>3: geo-redundancy backup recover using a backup set</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * <p>The instance ID of the source instance to recover.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp1378****</p>
         */
        public Builder sourceDBInstance(String sourceDBInstance) {
            this.putQueryParameter("SourceDBInstance", sourceDBInstance);
            this.sourceDBInstance = sourceDBInstance;
            return this;
        }

        /**
         * <p>The area where the source instance resides.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required when the backup recover type is rebuilding a deleted instance.</li>
         * <li>This parameter is required when the backup recover type is geo-redundancy cloning.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder srcRegion(String srcRegion) {
            this.putQueryParameter("SrcRegion", srcRegion);
            this.srcRegion = srcRegion;
            return this;
        }

        @Override
        public CheckRecoveryConditionRequest build() {
            return new CheckRecoveryConditionRequest(this);
        } 

    } 

}
