// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewInstanceRequest} extends {@link RequestModel}
 *
 * <p>RenewInstanceRequest</p>
 */
public class RenewInstanceRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private String autoPay;

    @Query
    @NameInMap("AutoRenew")
    private String autoRenew;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private Integer period;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private RenewInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public String getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
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

    public static final class Builder extends Request.Builder<RenewInstanceRequest, Builder> {
        private String autoPay; 
        private String autoRenew; 
        private String clientToken; 
        private String DBInstanceId; 
        private Long ownerId; 
        private Integer period; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(RenewInstanceRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * Specifies whether to enable automatic payment during the renewal. Valid values:
         * <p>
         * 
         * *   **True**: enables automatic payment. Make sure that your Alibaba Cloud account has adequate balance.
         * *   **False** (default): disables automatic payment. You have to manually pay the order in the console.
         * 
         * >  For more information about manual renewal in the console, see the following topics:
         * 
         * *   [Manually renew an ApsaraDB RDS for MySQL instance](~~96050~~)
         * 
         * *   [Manually renew an ApsaraDB RDS for PostgreSQL instance](~~96741~~)
         * 
         * *   [Manually renew an ApsaraDB RDS for SQL Server instance](~~95637~~)
         * 
         * *   [Manually renew an ApsaraDB RDS for MariaDB instance](~~97122~~)
         */
        public Builder autoPay(String autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the instance. Valid values:
         * <p>
         * 
         * *   **true**.
         * *   **false** (default)
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the generated token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The instance ID You can call the DescribeDBInstances operation to query the instance ID.
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
         * The duration of the subscription renewal. Unit: month. Valid values:
         * <p>
         * 
         * *   **1~9**
         * *   **12**
         * *   **24**
         * *   **36**
         * *   **48**
         * *   **60**
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
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
        public RenewInstanceRequest build() {
            return new RenewInstanceRequest(this);
        } 

    } 

}
