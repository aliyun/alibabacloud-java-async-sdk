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
 * {@link ModifyDBInstanceEndpointAddressRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceEndpointAddressRequest</p>
 */
public class ModifyDBInstanceEndpointAddressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionString")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStringPrefix")
    private String connectionStringPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private ModifyDBInstanceEndpointAddressRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.connectionString = builder.connectionString;
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBInstanceEndpointId = builder.DBInstanceEndpointId;
        this.DBInstanceId = builder.DBInstanceId;
        this.port = builder.port;
        this.privateIpAddress = builder.privateIpAddress;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceEndpointAddressRequest create() {
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
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
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
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceEndpointAddressRequest, Builder> {
        private String clientToken; 
        private String connectionString; 
        private String connectionStringPrefix; 
        private String DBInstanceEndpointId; 
        private String DBInstanceId; 
        private String port; 
        private String privateIpAddress; 
        private Long resourceOwnerId; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceEndpointAddressRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.connectionString = request.connectionString;
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBInstanceEndpointId = request.DBInstanceEndpointId;
            this.DBInstanceId = request.DBInstanceId;
            this.port = request.port;
            this.privateIpAddress = request.privateIpAddress;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>6000170000591aed949d0f****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The endpoint that you want to modify. The endpoint can be a public endpoint or an internal endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****.mysql.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.putQueryParameter("ConnectionString", connectionString);
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The prefix of the new endpoint. You can modify only the prefix of the endpoint that is specified by the ConnectionString parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp181qoj4s34m33****</p>
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * <p>The endpoint ID of the instance. You can call the DescribeDBInstanceEndpoints operation to query the endpoint ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-****</p>
         */
        public Builder DBInstanceEndpointId(String DBInstanceEndpointId) {
            this.putQueryParameter("DBInstanceEndpointId", DBInstanceEndpointId);
            this.DBInstanceEndpointId = DBInstanceEndpointId;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The port number of the new endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The IP address of the internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
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
         * <p>The vSwitch ID of the internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp12u14ecz****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPC ID of the internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp17xdic25d****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ModifyDBInstanceEndpointAddressRequest build() {
            return new ModifyDBInstanceEndpointAddressRequest(this);
        } 

    } 

}
