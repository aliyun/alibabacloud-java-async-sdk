// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceProxyConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceProxyConfigurationRequest</p>
 */
public class ModifyDBInstanceProxyConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyConfigurationKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyConfigurationKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyConfigurationValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyConfigurationValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBInstanceProxyConfigurationRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.proxyConfigurationKey = builder.proxyConfigurationKey;
        this.proxyConfigurationValue = builder.proxyConfigurationValue;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceProxyConfigurationRequest create() {
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
     * @return proxyConfigurationKey
     */
    public String getProxyConfigurationKey() {
        return this.proxyConfigurationKey;
    }

    /**
     * @return proxyConfigurationValue
     */
    public String getProxyConfigurationValue() {
        return this.proxyConfigurationValue;
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

    public static final class Builder extends Request.Builder<ModifyDBInstanceProxyConfigurationRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private String proxyConfigurationKey; 
        private String proxyConfigurationValue; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceProxyConfigurationRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.proxyConfigurationKey = request.proxyConfigurationKey;
            this.proxyConfigurationValue = request.proxyConfigurationValue;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The ID of the instance.
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
         * The key of the **configuration item** for the database proxy. Valid values:
         * <p>
         * 
         * *   **TransparentSwitch**: transparent switchover
         * *   **PersistentConnections**: short-lived connection optimization
         * *   **AttacksProtection**: brute-force attack protection
         */
        public Builder proxyConfigurationKey(String proxyConfigurationKey) {
            this.putQueryParameter("ProxyConfigurationKey", proxyConfigurationKey);
            this.proxyConfigurationKey = proxyConfigurationKey;
            return this;
        }

        /**
         * The features and status of the database proxy:
         * <p>
         * 
         * *   **TransparentSwitch**: transparent switchover. Valid values:
         * 
         *     *   **Enable**: The feature is enabled. This is the default value.
         *     *   **Disable**: The feature is disabled.
         * 
         * *   **PersistentConnections**: short-lived connection optimization. Valid values:
         * 
         *     *   **Enable**: The feature is enabled.
         *     *   **Disable**: The feature is disabled. This is the default value.
         * 
         * *   **AttacksProtection**: brute-force attack protection. Valid values:
         * 
         *     *   **Enable**: The feature is enabled.
         *     *   **Disable**: The feature is disabled. This is the default value.
         * 
         * Format: {"Feature 1":"Status 1","Feature 2":"Status 2"...}
         */
        public Builder proxyConfigurationValue(String proxyConfigurationValue) {
            this.putQueryParameter("ProxyConfigurationValue", proxyConfigurationValue);
            this.proxyConfigurationValue = proxyConfigurationValue;
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

        @Override
        public ModifyDBInstanceProxyConfigurationRequest build() {
            return new ModifyDBInstanceProxyConfigurationRequest(this);
        } 

    } 

}
