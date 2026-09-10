// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyDBClusterTDERequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterTDERequest</p>
 */
public class ModifyDBClusterTDERequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAutomaticRotation")
    private String enableAutomaticRotation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptNewTables")
    private String encryptNewTables;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

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
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TDEStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String TDEStatus;

    private ModifyDBClusterTDERequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.enableAutomaticRotation = builder.enableAutomaticRotation;
        this.encryptNewTables = builder.encryptNewTables;
        this.encryptionKey = builder.encryptionKey;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleArn = builder.roleArn;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterTDERequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return enableAutomaticRotation
     */
    public String getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    /**
     * @return encryptNewTables
     */
    public String getEncryptNewTables() {
        return this.encryptNewTables;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
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
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return TDEStatus
     */
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterTDERequest, Builder> {
        private String DBClusterId; 
        private String enableAutomaticRotation; 
        private String encryptNewTables; 
        private String encryptionKey; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String roleArn; 
        private String TDEStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterTDERequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.enableAutomaticRotation = request.enableAutomaticRotation;
            this.encryptNewTables = request.encryptNewTables;
            this.encryptionKey = request.encryptionKey;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.roleArn = request.roleArn;
            this.TDEStatus = request.TDEStatus;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically rotate the TDE key of the instance during the next O\&amp;M window after a new version of the KMS key is available. This parameter is valid only for custom keys.</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when the database engine is compatible with PostgreSQL or Oracle.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableAutomaticRotation(String enableAutomaticRotation) {
            this.putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation);
            this.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * <p>Specifies whether to automatically encrypt all new tables. Valid values:</p>
         * <ul>
         * <li><p><strong>ON</strong></p>
         * </li>
         * <li><p><strong>OFF</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only when the database engine is compatible with MySQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder encryptNewTables(String encryptNewTables) {
            this.putQueryParameter("EncryptNewTables", encryptNewTables);
            this.encryptNewTables = encryptNewTables;
            return this;
        }

        /**
         * <p>The ID of the custom key.</p>
         * 
         * <strong>example:</strong>
         * <p>749c1df7-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong>*****</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
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
         * <p>The Global Resource Descriptor of the role. You can use this parameter to specify a role. For more information, see <a href="https://help.aliyun.com/document_detail/93689.html">Overview of RAM roles</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1406926*****:role/aliyunrdsinstanceencryptiondefaultrole</p>
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The TDE status. Set the value to <strong>Enable</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder TDEStatus(String TDEStatus) {
            this.putQueryParameter("TDEStatus", TDEStatus);
            this.TDEStatus = TDEStatus;
            return this;
        }

        @Override
        public ModifyDBClusterTDERequest build() {
            return new ModifyDBClusterTDERequest(this);
        } 

    } 

}
