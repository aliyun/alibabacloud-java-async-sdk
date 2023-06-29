// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateInstancePublicConnectionRequest} extends {@link RequestModel}
 *
 * <p>AllocateInstancePublicConnectionRequest</p>
 */
public class AllocateInstancePublicConnectionRequest extends Request {
    @Query
    @NameInMap("BabelfishPort")
    private String babelfishPort;

    @Query
    @NameInMap("ConnectionStringPrefix")
    @Validation(required = true)
    private String connectionStringPrefix;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("GeneralGroupName")
    private String generalGroupName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PGBouncerPort")
    private String PGBouncerPort;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private String port;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private AllocateInstancePublicConnectionRequest(Builder builder) {
        super(builder);
        this.babelfishPort = builder.babelfishPort;
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBInstanceId = builder.DBInstanceId;
        this.generalGroupName = builder.generalGroupName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.PGBouncerPort = builder.PGBouncerPort;
        this.port = builder.port;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateInstancePublicConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return babelfishPort
     */
    public String getBabelfishPort() {
        return this.babelfishPort;
    }

    /**
     * @return connectionStringPrefix
     */
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return generalGroupName
     */
    public String getGeneralGroupName() {
        return this.generalGroupName;
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
     * @return PGBouncerPort
     */
    public String getPGBouncerPort() {
        return this.PGBouncerPort;
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

    public static final class Builder extends Request.Builder<AllocateInstancePublicConnectionRequest, Builder> {
        private String babelfishPort; 
        private String connectionStringPrefix; 
        private String DBInstanceId; 
        private String generalGroupName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String PGBouncerPort; 
        private String port; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AllocateInstancePublicConnectionRequest request) {
            super(request);
            this.babelfishPort = request.babelfishPort;
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBInstanceId = request.DBInstanceId;
            this.generalGroupName = request.generalGroupName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.PGBouncerPort = request.PGBouncerPort;
            this.port = request.port;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The Tabular Data Stream (TDS) port of the instance for which Babelfish is enabled.
         * <p>
         * 
         * > This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](~~428613~~).
         */
        public Builder babelfishPort(String babelfishPort) {
            this.putQueryParameter("BabelfishPort", babelfishPort);
            this.babelfishPort = babelfishPort;
            return this;
        }

        /**
         * The prefix of the public endpoint. A valid public endpoint is in the following format: Prefix.Database engine.rds.aliyuncs.com. Example: test1234.mysql.rds.aliyuncs.com.
         * <p>
         * 
         * > The value can be 5 to 40 characters in length and can contain letters, digits, and hyphens (-). The value cannot contain any of the following characters: ~ ! # % ^ & \* = + | {} ; : \" " , <> / ?
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
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
         * The name of the dedicated cluster to which the instance belongs. This parameter takes effect only when the instance runs MySQL on RDS Standard Edition and is created in a dedicated cluster.
         */
        public Builder generalGroupName(String generalGroupName) {
            this.putQueryParameter("GeneralGroupName", generalGroupName);
            this.generalGroupName = generalGroupName;
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
         * PGBouncerPort.
         */
        public Builder PGBouncerPort(String PGBouncerPort) {
            this.putQueryParameter("PGBouncerPort", PGBouncerPort);
            this.PGBouncerPort = PGBouncerPort;
            return this;
        }

        /**
         * The public port of the instance. Valid values: **1000 to 5999**.
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
        public AllocateInstancePublicConnectionRequest build() {
            return new AllocateInstancePublicConnectionRequest(this);
        } 

    } 

}
