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

        private Builder(ModifyDBInstanceProxyConfigurationRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.ownerId = response.ownerId;
            this.proxyConfigurationKey = response.proxyConfigurationKey;
            this.proxyConfigurationValue = response.proxyConfigurationValue;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * DBInstanceId.
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
         * ProxyConfigurationKey.
         */
        public Builder proxyConfigurationKey(String proxyConfigurationKey) {
            this.putQueryParameter("ProxyConfigurationKey", proxyConfigurationKey);
            this.proxyConfigurationKey = proxyConfigurationKey;
            return this;
        }

        /**
         * ProxyConfigurationValue.
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
