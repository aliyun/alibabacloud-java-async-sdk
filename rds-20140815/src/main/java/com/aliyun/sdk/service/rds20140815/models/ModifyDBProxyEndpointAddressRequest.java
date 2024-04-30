// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBProxyEndpointAddressRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBProxyEndpointAddressRequest</p>
 */
public class ModifyDBProxyEndpointAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyConnectStringNetType")
    private String DBProxyConnectStringNetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBProxyEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyNewConnectString")
    private String DBProxyNewConnectString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBProxyNewConnectStringPort")
    private String DBProxyNewConnectStringPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBProxyEndpointAddressRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBProxyConnectStringNetType = builder.DBProxyConnectStringNetType;
        this.DBProxyEndpointId = builder.DBProxyEndpointId;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.DBProxyNewConnectString = builder.DBProxyNewConnectString;
        this.DBProxyNewConnectStringPort = builder.DBProxyNewConnectStringPort;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBProxyEndpointAddressRequest create() {
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
     * @return DBProxyConnectStringNetType
     */
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

    /**
     * @return DBProxyEndpointId
     */
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    /**
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    /**
     * @return DBProxyNewConnectString
     */
    public String getDBProxyNewConnectString() {
        return this.DBProxyNewConnectString;
    }

    /**
     * @return DBProxyNewConnectStringPort
     */
    public String getDBProxyNewConnectStringPort() {
        return this.DBProxyNewConnectStringPort;
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

    public static final class Builder extends Request.Builder<ModifyDBProxyEndpointAddressRequest, Builder> {
        private String DBInstanceId; 
        private String DBProxyConnectStringNetType; 
        private String DBProxyEndpointId; 
        private String DBProxyEngineType; 
        private String DBProxyNewConnectString; 
        private String DBProxyNewConnectStringPort; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBProxyEndpointAddressRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.DBProxyConnectStringNetType = request.DBProxyConnectStringNetType;
            this.DBProxyEndpointId = request.DBProxyEndpointId;
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.DBProxyNewConnectString = request.DBProxyNewConnectString;
            this.DBProxyNewConnectStringPort = request.DBProxyNewConnectStringPort;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * The network type of the proxy endpoint. Valid values:
         * <p>
         * 
         * *   **Public**: Internet
         * *   **VPC**: virtual private cloud (VPC)
         * *   **Classic**: classic network
         * 
         * If the instance runs MySQL, the default value of this parameter is **Classic**.
         * 
         * > If the instance runs PostgreSQL, you must set this parameter to **Public** or **VPC**.
         */
        public Builder DBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
            this.putQueryParameter("DBProxyConnectStringNetType", DBProxyConnectStringNetType);
            this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
            return this;
        }

        /**
         * The ID of the dedicated proxy endpoint. You can call the DescribeDBProxyEndpoint operation to query the ID of the proxy endpoint.
         */
        public Builder DBProxyEndpointId(String DBProxyEndpointId) {
            this.putQueryParameter("DBProxyEndpointId", DBProxyEndpointId);
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
        }

        /**
         * A reserved parameter. You do not need to specify this parameter.
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * The new prefix of the proxy endpoint. Enter a prefix.
         * <p>
         * 
         * > You must specify at least one of the **DBProxyNewConnectString** and **DBProxyNewConnectStringPort** parameters.
         */
        public Builder DBProxyNewConnectString(String DBProxyNewConnectString) {
            this.putQueryParameter("DBProxyNewConnectString", DBProxyNewConnectString);
            this.DBProxyNewConnectString = DBProxyNewConnectString;
            return this;
        }

        /**
         * The port number that is associated with the proxy endpoint. Enter a port number.
         * <p>
         * 
         * > You must specify at least one of the **DBProxyNewConnectString** and **DBProxyNewConnectStringPort** parameters.
         */
        public Builder DBProxyNewConnectStringPort(String DBProxyNewConnectStringPort) {
            this.putQueryParameter("DBProxyNewConnectStringPort", DBProxyNewConnectStringPort);
            this.DBProxyNewConnectStringPort = DBProxyNewConnectStringPort;
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

        @Override
        public ModifyDBProxyEndpointAddressRequest build() {
            return new ModifyDBProxyEndpointAddressRequest(this);
        } 

    } 

}
