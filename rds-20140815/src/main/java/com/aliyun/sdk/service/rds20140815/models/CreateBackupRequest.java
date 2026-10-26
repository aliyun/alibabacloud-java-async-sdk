// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateBackupRequest} extends {@link RequestModel}
 *
 * <p>CreateBackupRequest</p>
 */
public class CreateBackupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMethod")
    private String backupMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
    private Long backupRetentionPeriod;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateBackupRequest(Builder builder) {
        super(builder);
        this.backupMethod = builder.backupMethod;
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.backupStrategy = builder.backupStrategy;
        this.backupType = builder.backupType;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
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
     * @return backupRetentionPeriod
     */
    public Long getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateBackupRequest, Builder> {
        private String backupMethod; 
        private Long backupRetentionPeriod; 
        private String backupStrategy; 
        private String backupType; 
        private String DBInstanceId; 
        private String DBName; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackupRequest request) {
            super(request);
            this.backupMethod = request.backupMethod;
            this.backupRetentionPeriod = request.backupRetentionPeriod;
            this.backupStrategy = request.backupStrategy;
            this.backupType = request.backupType;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The backup method. Valid values:</p>
         * <ul>
         * <li><strong>Logical</strong>: logical backup (supported only for ApsaraDB RDS for MySQL instances with local SSDs)</li>
         * <li><strong>Physical</strong>: physical backup (supported for ApsaraDB RDS for MySQL instances with local SSDs, ApsaraDB RDS for SQL Server, and ApsaraDB RDS for PostgreSQL)</li>
         * <li><strong>Snapshot</strong>: snapshot backup (supported for ApsaraDB RDS for MySQL instances with cloud disks, ApsaraDB RDS for SQL Server, ApsaraDB RDS for PostgreSQL, and ApsaraDB RDS for MariaDB)</li>
         * </ul>
         * <p>Default value: <strong>Physical</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>When you use logical backup, the database must contain data.</li>
         * <li>ApsaraDB RDS for MariaDB instances support only snapshot backup, but you must set this parameter to <strong>Physical</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Physical</p>
         */
        public Builder backupMethod(String backupMethod) {
            this.putQueryParameter("BackupMethod", backupMethod);
            this.backupMethod = backupMethod;
            return this;
        }

        /**
         * <ul>
         * <li><strong>SQL Server</strong>: When the BackupStrategy parameter is set to db, the BackupMethod parameter is set to Physical, and the BackupType parameter is set to FullBackup, you can specify the retention period of the backup set. Valid values: 7 to 730 days, and -1 (long-term retention (LTR)).</li>
         * <li><strong>MySQL</strong>: You can specify the retention period of the backup set. Valid values: 7 to 730 days, and -1 (long-term retention (LTR)).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder backupRetentionPeriod(Long backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * <p>The backup strategy. Valid values:</p>
         * <ul>
         * <li><strong>db</strong>: database-level backup</li>
         * <li><strong>instance</strong>: instance-level backup</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when the following conditions are met:</p>
         * <ul>
         * <li>For ApsaraDB RDS for MySQL: The <strong>BackupMethod</strong> parameter is set to <strong>Logical</strong>.</li>
         * <li>For ApsaraDB RDS for SQL Server: The <strong>BackupType</strong> parameter is set to <strong>FullBackup</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        public Builder backupStrategy(String backupStrategy) {
            this.putQueryParameter("BackupStrategy", backupStrategy);
            this.backupStrategy = backupStrategy;
            return this;
        }

        /**
         * <p>The backup type for ApsaraDB RDS for SQL Server instances. Valid values:</p>
         * <ul>
         * <li><strong>Auto</strong> (default): automatically selects full backup or incremental backup</li>
         * <li><strong>FullBackup</strong>: full backup</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when the <strong>BackupMethod</strong> parameter is set to <strong>Physical</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to obtain the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The list of databases. Separate multiple databases with commas (,).</p>
         * <blockquote>
         * <p>This parameter takes effect only when the <strong>BackupStrategy</strong> parameter is set to <strong>db</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rds_mysql</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
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
