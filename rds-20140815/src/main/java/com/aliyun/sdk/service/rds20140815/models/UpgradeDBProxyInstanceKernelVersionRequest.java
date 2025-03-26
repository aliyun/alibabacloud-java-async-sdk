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
 * {@link UpgradeDBProxyInstanceKernelVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBProxyInstanceKernelVersionRequest</p>
 */
public class UpgradeDBProxyInstanceKernelVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

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
    @com.aliyun.core.annotation.NameInMap("UpgradeTime")
    private String upgradeTime;

    private UpgradeDBProxyInstanceKernelVersionRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.switchTime = builder.switchTime;
        this.upgradeTime = builder.upgradeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBProxyInstanceKernelVersionRequest create() {
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
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
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
     * @return upgradeTime
     */
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

    public static final class Builder extends Request.Builder<UpgradeDBProxyInstanceKernelVersionRequest, Builder> {
        private String DBInstanceId; 
        private String DBProxyEngineType; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String switchTime; 
        private String upgradeTime; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBProxyInstanceKernelVersionRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.switchTime = request.switchTime;
            this.upgradeTime = request.upgradeTime;
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
         * <p>A reserved parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
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
         * <p>The specific point in time when you want to perform the upgrade. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <p> If you set <strong>UpgradeTime</strong> to <strong>SpecifyTime</strong>, you must specify SwitchTime.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-07-10T13:15:12Z</p>
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * <p>The time when you want to upgrade the database proxy version of the instance. Valid values:</p>
         * <ul>
         * <li><strong>MaintainTime</strong> (default): performs the upgrade during the maintenance window that you specified. For more information, see <a href="https://help.aliyun.com/document_detail/610402.html">Modify the maintenance window</a>.</li>
         * <li><strong>Immediate</strong>: performs the upgrade immediately.</li>
         * <li><strong>SpecifyTime</strong>: performs the upgrade at a specified point in time.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><strong>If the instance runs MySQL, you can set this parameter to <strong>MaintainTime</strong>, <strong>Immediate</strong>, or SpecifyTime</strong>.</li>
         * <li>If the instance runs PostgreSQL, you can set this parameter to <strong>MaintainTime</strong> or <strong>Immediate</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MaintainTime</p>
         */
        public Builder upgradeTime(String upgradeTime) {
            this.putQueryParameter("UpgradeTime", upgradeTime);
            this.upgradeTime = upgradeTime;
            return this;
        }

        @Override
        public UpgradeDBProxyInstanceKernelVersionRequest build() {
            return new UpgradeDBProxyInstanceKernelVersionRequest(this);
        } 

    } 

}
