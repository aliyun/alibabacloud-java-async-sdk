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
 * {@link ModifyDBInstanceCLSRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceCLSRequest</p>
 */
public class ModifyDBInstanceCLSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionAlgorithm")
    private String encryptionAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKeyMode")
    private String encryptionKeyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encryptionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRotate")
    private Boolean isRotate;

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
    @com.aliyun.core.annotation.NameInMap("WhiteListMode")
    private Boolean whiteListMode;

    private ModifyDBInstanceCLSRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.encryptionAlgorithm = builder.encryptionAlgorithm;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionKeyMode = builder.encryptionKeyMode;
        this.encryptionStatus = builder.encryptionStatus;
        this.isRotate = builder.isRotate;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleArn = builder.roleArn;
        this.whiteListMode = builder.whiteListMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceCLSRequest create() {
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
     * @return encryptionAlgorithm
     */
    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptionKeyMode
     */
    public String getEncryptionKeyMode() {
        return this.encryptionKeyMode;
    }

    /**
     * @return encryptionStatus
     */
    public String getEncryptionStatus() {
        return this.encryptionStatus;
    }

    /**
     * @return isRotate
     */
    public Boolean getIsRotate() {
        return this.isRotate;
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
     * @return whiteListMode
     */
    public Boolean getWhiteListMode() {
        return this.whiteListMode;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceCLSRequest, Builder> {
        private String DBInstanceId; 
        private String encryptionAlgorithm; 
        private String encryptionKey; 
        private String encryptionKeyMode; 
        private String encryptionStatus; 
        private Boolean isRotate; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String roleArn; 
        private Boolean whiteListMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceCLSRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.encryptionAlgorithm = request.encryptionAlgorithm;
            this.encryptionKey = request.encryptionKey;
            this.encryptionKeyMode = request.encryptionKeyMode;
            this.encryptionStatus = request.encryptionStatus;
            this.isRotate = request.isRotate;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.roleArn = request.roleArn;
            this.whiteListMode = request.whiteListMode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4n8t18o******6d5</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * EncryptionAlgorithm.
         */
        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            this.putQueryParameter("EncryptionAlgorithm", encryptionAlgorithm);
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }

        /**
         * EncryptionKey.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * EncryptionKeyMode.
         */
        public Builder encryptionKeyMode(String encryptionKeyMode) {
            this.putQueryParameter("EncryptionKeyMode", encryptionKeyMode);
            this.encryptionKeyMode = encryptionKeyMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder encryptionStatus(String encryptionStatus) {
            this.putQueryParameter("EncryptionStatus", encryptionStatus);
            this.encryptionStatus = encryptionStatus;
            return this;
        }

        /**
         * IsRotate.
         */
        public Builder isRotate(Boolean isRotate) {
            this.putQueryParameter("IsRotate", isRotate);
            this.isRotate = isRotate;
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
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * WhiteListMode.
         */
        public Builder whiteListMode(Boolean whiteListMode) {
            this.putQueryParameter("WhiteListMode", whiteListMode);
            this.whiteListMode = whiteListMode;
            return this;
        }

        @Override
        public ModifyDBInstanceCLSRequest build() {
            return new ModifyDBInstanceCLSRequest(this);
        } 

    } 

}
