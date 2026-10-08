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
         * <p>The instance ID. You can invoke DescribeDBInstances to query the instance ID.</p>
         * <blockquote>
         * <ul>
         * <li>The storage type of the ApsaraDB RDS for PostgreSQL instance must be <strong>cloud disks</strong>. For an instance with Premium Local SSDs, you can invoke the <a href="https://help.aliyun.com/document_detail/26230.html">RestartDBInstance</a> operation to restart the instance, which automatically upgrades the instance to the latest minor engine version.</li>
         * <li>Only the 2019 version of ApsaraDB RDS for SQL Server supports minor engine version upgrades.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp****</p>
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
         * <p>The specified time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>UpgradeTime</strong> is set to <strong>SpecifyTime</strong>.</p>
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
         * <p>The minor database engine version to which you want to upgrade. Format:</p>
         * <ul>
         * <li><strong>PostgreSQL</strong>: <code>rds_postgres_&lt;Major version number&gt;00_&lt;Minor version number&gt;</code>. Example for version 12 with minor version 20200830: <code>rds_postgres_1200_20200830</code>.</li>
         * <li><strong>MySQL</strong>: <code>&lt;Instance version&gt;_&lt;Minor version number&gt;</code>. Examples: <code>rds_20200229</code>, <code>xcluster_20200229</code>, or <code>xcluster80_20200229</code>. The instance version can be one of the following:<ul>
         * <li><strong>rds</strong>: high-availability series or Basic Edition.</li>
         * <li><strong>xcluster</strong>: MySQL 5.7 RDS Enterprise Edition.</li>
         * <li><strong>xcluster80</strong>: MySQL 8.0 RDS Enterprise Edition.</li>
         * </ul>
         * </li>
         * <li><strong>SQLServer</strong>: <code>&lt;Minor version number&gt;</code>. Example: <code>15.0.4073.23</code>.</li>
         * </ul>
         * <p>If you do not specify this parameter, the instance is upgraded to the latest minor engine version by default.</p>
         * <blockquote>
         * <p>For minor engine version numbers, see <a href="https://help.aliyun.com/document_detail/126002.html">Release notes of ApsaraDB RDS for PostgreSQL minor engine versions</a>, <a href="https://help.aliyun.com/document_detail/96060.html">Release notes of ApsaraDB RDS for MySQL minor engine versions</a>, and <a href="https://help.aliyun.com/document_detail/213577.html">Release notes of ApsaraDB RDS for SQL Server minor engine versions</a>.</p>
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
         * <p>The upgrade time. Valid values:</p>
         * <ul>
         * <li><strong>Immediate</strong> (default): The upgrade takes effect immediately.</li>
         * <li><strong>MaintainTime</strong>: The upgrade takes effect during the maintenance window. To modify the maintenance window, call ModifyDBInstanceMaintainTime.</li>
         * <li><strong>SpecifyTime</strong>: The upgrade takes effect at a specified time.</li>
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
