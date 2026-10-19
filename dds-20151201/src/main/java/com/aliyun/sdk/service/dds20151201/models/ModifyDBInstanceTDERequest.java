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
 * {@link ModifyDBInstanceTDERequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceTDERequest</p>
 */
public class ModifyDBInstanceTDERequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptorName")
    private String encryptorName;

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
    @com.aliyun.core.annotation.NameInMap("RoleARN")
    private String roleARN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchMode")
    private String switchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TDEStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String TDEStatus;

    private ModifyDBInstanceTDERequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DBInstanceId = builder.DBInstanceId;
        this.encryptionKey = builder.encryptionKey;
        this.encryptorName = builder.encryptorName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleARN = builder.roleARN;
        this.switchMode = builder.switchMode;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceTDERequest create() {
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptorName
     */
    public String getEncryptorName() {
        return this.encryptorName;
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
     * @return roleARN
     */
    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * @return switchMode
     */
    public String getSwitchMode() {
        return this.switchMode;
    }

    /**
     * @return TDEStatus
     */
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceTDERequest, Builder> {
        private String regionId; 
        private String DBInstanceId; 
        private String encryptionKey; 
        private String encryptorName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String roleARN; 
        private String switchMode; 
        private String TDEStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceTDERequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DBInstanceId = request.DBInstanceId;
            this.encryptionKey = request.encryptionKey;
            this.encryptorName = request.encryptorName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.roleARN = request.roleARN;
            this.switchMode = request.switchMode;
            this.TDEStatus = request.TDEStatus;
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bpxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The ID of the custom key.
         * Custom keys are supported only in the following regions. In other regions, the default key is used for encryption.</p>
         * <ul>
         * <li>Singapore (ap-southeast-1)</li>
         * <li>Hangzhou (cn-hangzhou)</li>
         * <li>Shanghai (cn-shanghai)</li>
         * <li>Beijing (cn-beijing)</li>
         * <li>Shenzhen (cn-shenzhen)</li>
         * <li>Hong Kong (China) (cn-hongkong)</li>
         * <li>Malaysia (ap-southeast-3)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>749c1df7-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The encryption method. Valid values: <strong>aes-256-cbc</strong>.</p>
         * <blockquote>
         * <p>This parameter is available only when the <strong>TDEStatus</strong> parameter is set to <strong>enabled</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aes-256-cbc</p>
         */
        public Builder encryptorName(String encryptorName) {
            this.putQueryParameter("EncryptorName", encryptorName);
            this.encryptorName = encryptorName;
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
         * <p>The ARN of the specified role. Format: <code>acs:ram::$accountID:role/$roleName</code>.</p>
         * <blockquote>
         * <ul>
         * <li><code>$accountID</code>: the ID of the Alibaba Cloud account. You can view the ID by logging on to the Alibaba Cloud Management Console, moving the pointer over the profile picture in the upper-right corner, and clicking Security Settings.</li>
         * <li><code>$roleName</code>: the name of the RAM role. You can view the name by logging on to the Resource Access Management (RAM) console, clicking RAM Roles in the left-side navigation pane, and viewing the RAM role name list.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole</p>
         */
        public Builder roleARN(String roleARN) {
            this.putQueryParameter("RoleARN", roleARN);
            this.roleARN = roleARN;
            return this;
        }

        /**
         * <p>The time to modify the Transparent Data Encryption (TDE) status of the MongoDB instance. Valid values:</p>
         * <ul>
         * <li><p>0: immediately.</p>
         * </li>
         * <li><p>1: within the O&amp;M window.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder switchMode(String switchMode) {
            this.putQueryParameter("SwitchMode", switchMode);
            this.switchMode = switchMode;
            return this;
        }

        /**
         * <p>The TDE status. Valid values: <strong>enabled</strong>, which indicates that TDE is enabled.</p>
         * <blockquote>
         * <p>You cannot disable TDE after it is enabled. Proceed with caution.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder TDEStatus(String TDEStatus) {
            this.putQueryParameter("TDEStatus", TDEStatus);
            this.TDEStatus = TDEStatus;
            return this;
        }

        @Override
        public ModifyDBInstanceTDERequest build() {
            return new ModifyDBInstanceTDERequest(this);
        } 

    } 

}
