// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstanceEndpointAddressRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceEndpointAddressRequest</p>
 */
public class CreateDBInstanceEndpointAddressRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ConnectionStringPrefix")
    @Validation(required = true)
    private String connectionStringPrefix;

    @Query
    @NameInMap("DBInstanceEndpointId")
    @Validation(required = true)
    private String DBInstanceEndpointId;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("IpType")
    @Validation(required = true)
    private String ipType;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private String port;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateDBInstanceEndpointAddressRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBInstanceEndpointId = builder.DBInstanceEndpointId;
        this.DBInstanceId = builder.DBInstanceId;
        this.ipType = builder.ipType;
        this.port = builder.port;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceEndpointAddressRequest create() {
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
     * @return DBInstanceEndpointId
     */
    public String getDBInstanceEndpointId() {
        return this.DBInstanceEndpointId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return ipType
     */
    public String getIpType() {
        return this.ipType;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceEndpointAddressRequest, Builder> {
        private String clientToken; 
        private String connectionStringPrefix; 
        private String DBInstanceEndpointId; 
        private String DBInstanceId; 
        private String ipType; 
        private String port; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceEndpointAddressRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBInstanceEndpointId = request.DBInstanceEndpointId;
            this.DBInstanceId = request.DBInstanceId;
            this.ipType = request.ipType;
            this.port = request.port;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.
         * <p>
         * 
         * The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The prefix of the public endpoint.
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * The endpoint ID of the instance. You can call the [DescribeDBInstanceEndpoints](~~464397~~) operation to query the endpoint ID of the instance.
         */
        public Builder DBInstanceEndpointId(String DBInstanceEndpointId) {
            this.putQueryParameter("DBInstanceEndpointId", DBInstanceEndpointId);
            this.DBInstanceEndpointId = DBInstanceEndpointId;
            return this;
        }

        /**
         * The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The network type of the endpoint. Only Internet is supported. Set the value to **Public**.
         */
        public Builder ipType(String ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * The port number of the public endpoint.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public CreateDBInstanceEndpointAddressRequest build() {
            return new CreateDBInstanceEndpointAddressRequest(this);
        } 

    } 

}
