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
         * <p>The ID of the instance.</p>
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
         * <p>The ID of the custom key.</p>
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
         * <p>The encryption method. Set the value to <strong>aes-256-cbc</strong>.</p>
         * <blockquote>
         * <p>This parameter is valid only when the <strong>TEDStatus</strong> parameter is set to <strong>enabled</strong>.</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the specified Resource Access Management (RAM) role. The ARN is displayed in the <code>acs:ram::$accountID:role/$roleName</code> format.</p>
         * <blockquote>
         * <ul>
         * <li><code>$accountID</code>: specifies the ID of the Alibaba Cloud account. To view the account ID, log on to the Alibaba Cloud Management Console, move your pointer over your profile picture in the upper-right corner, and then click Security Settings.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <ul>
         * <li><code>$roleName</code>: specifies the name of the RAM role. To view the RAM role name, log on to the RAM console. In the left-side navigation pane, choose Identities &gt; Roles. On the Roles page, view the name of the RAM role.</li>
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
         * <p>The TDE status. When the value of this parameter is set to <strong>Enabled</strong>, TDE is enabled.</p>
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
