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
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4n3a****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The network type of the database proxy endpoint. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong></li>
         * <li><strong>VPC</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p> If the RDS instance runs MySQL, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder DBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
            this.putQueryParameter("DBProxyConnectStringNetType", DBProxyConnectStringNetType);
            this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
            return this;
        }

        /**
         * <p>The ID of the database proxy endpoint. You can call the DescribeDBProxyEndpoint operation to query the ID of the database proxy endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ta9um4****</p>
         */
        public Builder DBProxyEndpointId(String DBProxyEndpointId) {
            this.putQueryParameter("DBProxyEndpointId", DBProxyEndpointId);
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
        }

        /**
         * <p>A deprecated parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * <p>The prefix of the new database proxy endpoint. A custom value is supported.</p>
         * <blockquote>
         * <p> You must specify at least one of the <strong>DBProxyNewConnectString</strong> and <strong>DBProxyNewConnectStringPort</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test123456</p>
         */
        public Builder DBProxyNewConnectString(String DBProxyNewConnectString) {
            this.putQueryParameter("DBProxyNewConnectString", DBProxyNewConnectString);
            this.DBProxyNewConnectString = DBProxyNewConnectString;
            return this;
        }

        /**
         * <p>The port number that is associated with the database proxy endpoint. A custom value is supported.</p>
         * <blockquote>
         * <p> You must specify at least one of the <strong>DBProxyNewConnectString</strong> and <strong>DBProxyNewConnectStringPort</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3307</p>
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
