// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpgradeDBInstanceKernelVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBInstanceKernelVersionRequest</p>
 */
public class UpgradeDBInstanceKernelVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

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
    @com.aliyun.core.annotation.NameInMap("SwitchTime")
    private String switchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetMinorVersion")
    private String targetMinorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeTime")
    private String upgradeTime;

    private UpgradeDBInstanceKernelVersionRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.switchTime = builder.switchTime;
        this.targetMinorVersion = builder.targetMinorVersion;
        this.upgradeTime = builder.upgradeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBInstanceKernelVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return targetMinorVersion
     */
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    /**
     * @return upgradeTime
     */
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

    public static final class Builder extends Request.Builder<UpgradeDBInstanceKernelVersionRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String switchTime; 
        private String targetMinorVersion; 
        private String upgradeTime; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBInstanceKernelVersionRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.switchTime = request.switchTime;
            this.targetMinorVersion = request.targetMinorVersion;
            this.upgradeTime = request.upgradeTime;
        } 

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance runs PostgreSQL, you must make sure that the instance uses <strong>cloud disks</strong>. If the instance uses local disks, you must call the <a href="https://help.aliyun.com/document_detail/26230.html">RestartDBInstance</a> operation to restart the instance. The system automatically updates the minor engine version of the instance to the latest version during the restart.</li>
         * <li>If your instance runs SQL Server, you must make sure that the instance runs SQL Server 2019.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bpxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
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
         * <p>The update time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <p>This parameter takes effect only when you set <strong>UpgradeTime</strong> to <strong>SpecifyTime</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-01-15T00:00:00Z</p>
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * <p>The minor engine version to which you want to update. Format:</p>
         * <ul>
         * <li><p><strong>PostgreSQL</strong>: <code>rds_postgres_&lt;Major engine version&gt;00_&lt;Minor engine version&gt;</code>. Example: <code>rds_postgres_1200_20200830</code>.</p>
         * </li>
         * <li><p><strong>MySQL</strong>: <code>&lt;RDS edition and MySQL version&gt;_&lt;Minor engine version&gt;</code>. Examples: <code>rds_20200229</code>, <code>xcluster_20200229</code>, and <code>xcluster80_20200229</code>. The following RDS editions and MySQL versions are supported:</p>
         * <ul>
         * <li><strong>rds</strong>: RDS Basic Edition or RDS High-availability Edition</li>
         * <li><strong>xcluster</strong>: MySQL 5.7 on RDS Enterprise Edition</li>
         * <li><strong>xcluster80</strong>: MySQL 8.0 on RDS Enterprise Edition</li>
         * </ul>
         * </li>
         * <li><p><strong>SQLServer</strong>: <code>&lt;Minor engine version&gt;</code>. Example: <code>15.0.4073.23</code>.</p>
         * </li>
         * </ul>
         * <p>If you do not specify this parameter, the instance is updated to the latest minor engine version.</p>
         * <blockquote>
         * <p> For more information about minor engine versions, see <a href="https://help.aliyun.com/document_detail/126002.html">Release notes of AliPG</a>, <a href="https://help.aliyun.com/document_detail/96060.html">Release notes of AliSQL</a>, and <a href="https://help.aliyun.com/document_detail/213577.html">Release notes of minor engine versions of ApsaraDB RDS for SQL Server</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>xcluster80_20210305</p>
         */
        public Builder targetMinorVersion(String targetMinorVersion) {
            this.putQueryParameter("TargetMinorVersion", targetMinorVersion);
            this.targetMinorVersion = targetMinorVersion;
            return this;
        }

        /**
         * <p>The time when the update takes effect. Valid values:</p>
         * <ul>
         * <li><strong>Immediate</strong> (default): The update takes effect immediately.</li>
         * <li><strong>MaintainTime</strong>: The update takes effect during the maintenance window that you specify. For more information about how to change the maintenance window, see ModifyDBInstanceMaintainTime.</li>
         * <li><strong>SpecifyTime</strong>: The update takes effect at the point in time you specify.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Immediate</p>
         */
        public Builder upgradeTime(String upgradeTime) {
            this.putQueryParameter("UpgradeTime", upgradeTime);
            this.upgradeTime = upgradeTime;
            return this;
        }

        @Override
        public UpgradeDBInstanceKernelVersionRequest build() {
            return new UpgradeDBInstanceKernelVersionRequest(this);
        } 

    } 

}
