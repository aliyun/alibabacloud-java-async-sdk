// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchDBInstanceNetTypeRequest} extends {@link RequestModel}
 *
 * <p>SwitchDBInstanceNetTypeRequest</p>
 */
public class SwitchDBInstanceNetTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStringPrefix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionStringPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStringType")
    private String connectionStringType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private SwitchDBInstanceNetTypeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.connectionStringType = builder.connectionStringType;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.port = builder.port;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchDBInstanceNetTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return connectionStringPrefix
     */
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    /**
     * @return connectionStringType
     */
    public String getConnectionStringType() {
        return this.connectionStringType;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return port
     */
    public String getPort() {
        return this.port;
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

    public static final class Builder extends Request.Builder<SwitchDBInstanceNetTypeRequest, Builder> {
        private String clientToken; 
        private String connectionStringPrefix; 
        private String connectionStringType; 
        private String DBInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String port; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchDBInstanceNetTypeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.connectionStringType = request.connectionStringType;
            this.DBInstanceId = request.DBInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.port = request.port;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The prefix of the custom endpoint. The prefix must be 8 to 64 characters in length and can contain letters and digits. It must start with a lowercase letter. A valid endpoint is in the following format: Prefix.Database engine.rds.aliyuncs.com. Example: test1234.mysql.rds.aliyuncs.com.
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * The type of the endpoint. Valid values:
         * <p>
         * 
         * *   **Normal**
         * *   **ReadWriteSplitting**
         * 
         * By default, the system returns both types of endpoints.
         */
        public Builder connectionStringType(String connectionStringType) {
            this.putQueryParameter("ConnectionStringType", connectionStringType);
            this.connectionStringType = connectionStringType;
            return this;
        }

        /**
         * The instance ID. You can call the DescribeDBInstances operation to query the instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
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
         * The number of the port that is used to connect to the instance. Valid values: **3001 to 3999**.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
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
        public SwitchDBInstanceNetTypeRequest build() {
            return new SwitchDBInstanceNetTypeRequest(this);
        } 

    } 

}
