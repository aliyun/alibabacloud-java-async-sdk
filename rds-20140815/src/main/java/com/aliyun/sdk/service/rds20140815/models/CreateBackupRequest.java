// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupRequest</p>
 */
public class CreateBackupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMethod")
    private String backupMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStrategy")
    private String backupStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupType")
    private String backupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateBackupRequest(Builder builder) {
        super(builder);
        this.backupMethod = builder.backupMethod;
        this.backupStrategy = builder.backupStrategy;
        this.backupType = builder.backupType;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupMethod
     */
    public String getBackupMethod() {
        return this.backupMethod;
    }

    /**
     * @return backupStrategy
     */
    public String getBackupStrategy() {
        return this.backupStrategy;
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateBackupRequest, Builder> {
        private String backupMethod; 
        private String backupStrategy; 
        private String backupType; 
        private String DBInstanceId; 
        private String DBName; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupRequest request) {
            super(request);
            this.backupMethod = request.backupMethod;
            this.backupStrategy = request.backupStrategy;
            this.backupType = request.backupType;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The backup type of the instance. Valid values:
         * <p>
         * 
         * *   **Logical**: logical backup
         * *   **Physical**: physical backup
         * *   **Snapshot**: snapshot backup
         * 
         * Default value: **Physical**.
         * 
         * > *   You can perform a logical backup only when databases are created on the instance.
         * > *   When you perform a snapshot backup on an ApsaraDB RDS for MariaDB instance, you must set this parameter to **Physical**.
         * > *   For more information about the supported backup types, see [Use the data backup feature](~~98818~~).
         * > *   When you perform a snapshot backup on an ApsaraDB RDS for SQL Server instance that uses cloud disks, you must set this parameter to **Snapshot**.
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * The backup policy. Valid values:
         * <p>
         * 
         * *   **db**: a database-level backup.
         * *   **instance**: an instance-level backup.
         * 
         * > You can specify this parameter when you perform a logical backup on an ApsaraDB RDS for MySQL instance. You can also specify this parameter when you perform a full physical backup on an ApsaraDB RDS for SQL Server instance.
         */
        public Builder backupStrategy(String backupStrategy) {
            this.putQueryParameter("BackupStrategy", backupStrategy);
            this.backupStrategy = backupStrategy;
            return this;
        }

        /**
         * The backup method. Valid values:
         * <p>
         * 
         * *   **Auto**: full or incremental backup that is automatically selected
         * *   **FullBackup**: full backup
         * 
         * Default value: **Auto**.
         * 
         * > *   You must set this parameter only when the instance runs SQL Server.
         * > *   This parameter is valid only when you set the **BackupMethod** parameter to **Physical**.
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
         * <p>
         * 
         * > You can specify this parameter when you perform a logical backup on individual databases of an ApsaraDB RDS for MySQL instance. You can also specify this parameter when you perform a full physical backup on individual databases of an ApsaraDB RDS for SQL Server instance.
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * The resource group ID. You can call the DescribeDBInstanceAttribute to query the resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public CreateBackupRequest build() {
            return new CreateBackupRequest(this);
        } 

    } 

}
