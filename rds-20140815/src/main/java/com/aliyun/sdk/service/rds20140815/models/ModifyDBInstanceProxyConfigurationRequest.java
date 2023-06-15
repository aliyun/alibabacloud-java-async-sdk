// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceProxyConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceProxyConfigurationRequest</p>
 */
public class ModifyDBInstanceProxyConfigurationRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProxyConfigurationKey")
    @Validation(required = true)
    private String proxyConfigurationKey;

    @Query
    @NameInMap("ProxyConfigurationValue")
    @Validation(required = true)
    private String proxyConfigurationValue;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
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
         * The value of the **configuration item** for the database proxy. Valid values:
         * <p>
         * 
         * *   If you set the ProxyConfigurationKey parameter to **TransparentSwitch**, you can set this parameter to one of the following values:
         * 
         *     *   **Enable**. This is the default value.
         *     *   **Disable**. Example: {"status":"Enable"}.
         * 
         * *   If you set the ProxyConfigurationKey parameter to **PersistentConnections**, you can set this parameter to one of the following values:
         * 
         *     *   **Enable**.
         *     *   **Disable**. This is the default value. Example: {"status":"Disable"}.
         * 
         * *   If you set the ProxyConfigurationKey parameter to **AttacksProtection**, you can set this parameter to one of the following values:
         * 
         *     *   **Enable**.
         *     *   **Disable**. This is the default value. Example: {"status":"Disable"}.
         * 
         * In this case, the return value is a JSON string. Example:
         * 
         *     {"status":"Disable", "check_interval_seconds": 60,
         *                     "max_failed_login_attempts": 60, "blocking_seconds": 600}
         * 
         * Description and valid values:
         * 
         * *   Each client allows {max_failed_login_attempts} logon attempts upon failure within {check_interval_seconds} seconds. If the number of logon attempts exceeds the limit, the client is disabled for {blocking_seconds} seconds before the client can try again.
         * *   The following list describes the valid values of each field in the preceding example.
         * 
         * check_interval_seconds: **30 to 600**. Unit: seconds. max_failed_login_attempts: **10 to 5000**. Unit: number of times. blocking_seconds: **30 to 3600**. Unit: seconds.
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
