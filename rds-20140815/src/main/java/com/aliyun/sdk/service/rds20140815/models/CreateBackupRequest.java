// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
            this.backupStrategy = request.backupStrategy;
            this.backupType = request.backupType;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The backup type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Logical</strong>: logical backup</li>
         * <li><strong>Physical</strong>: physical backup</li>
         * <li><strong>Snapshot</strong>: snapshot backup</li>
         * </ul>
         * <p>Default value: <strong>Physical</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>You can perform a logical backup only when databases are created on the instance.</li>
         * <li>When you perform a snapshot backup on an ApsaraDB RDS for MariaDB instance, you must set this parameter to <strong>Physical</strong>.</li>
         * <li>For more information about the supported backup types, see <a href="https://help.aliyun.com/document_detail/98818.html">Use the data backup feature</a>.</li>
         * <li>When you perform a snapshot backup on an ApsaraDB RDS for SQL Server instance that uses cloud disks, you must set this parameter to <strong>Snapshot</strong>.</li>
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
         * <p>The backup policy. Valid values:</p>
         * <ul>
         * <li><strong>db</strong>: a database-level backup.</li>
         * <li><strong>instance</strong>: an instance-level backup.</li>
         * </ul>
         * <blockquote>
         * <p>You can specify this parameter when you perform a logical backup on an ApsaraDB RDS for MySQL instance. You can also specify this parameter when you perform a full physical backup on an ApsaraDB RDS for SQL Server instance.</p>
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
         * <p>The backup method. Valid values:</p>
         * <ul>
         * <li><strong>Auto</strong>: full or incremental backup that is automatically selected</li>
         * <li><strong>FullBackup</strong>: full backup</li>
         * </ul>
         * <p>Default value: <strong>Auto</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>You must set this parameter only when the instance runs SQL Server.</li>
         * <li>This parameter is valid only when you set the <strong>BackupMethod</strong> parameter to <strong>Physical</strong>.</li>
         * </ul>
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
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
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
         * <p>The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).</p>
         * <blockquote>
         * <p>You can specify this parameter when you perform a logical backup on individual databases of an ApsaraDB RDS for MySQL instance. You can also specify this parameter when you perform a full physical backup on individual databases of an ApsaraDB RDS for SQL Server instance.</p>
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
