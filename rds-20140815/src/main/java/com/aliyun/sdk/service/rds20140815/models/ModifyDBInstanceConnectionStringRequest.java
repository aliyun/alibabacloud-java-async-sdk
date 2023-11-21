// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceConnectionStringRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceConnectionStringRequest</p>
 */
public class ModifyDBInstanceConnectionStringRequest extends Request {
    @Query
    @NameInMap("BabelfishPort")
    private String babelfishPort;

    @Query
    @NameInMap("ConnectionStringPrefix")
    @Validation(required = true)
    private String connectionStringPrefix;

    @Query
    @NameInMap("CurrentConnectionString")
    @Validation(required = true)
    private String currentConnectionString;

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

    private ModifyDBInstanceConnectionStringRequest(Builder builder) {
        super(builder);
        this.babelfishPort = builder.babelfishPort;
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.currentConnectionString = builder.currentConnectionString;
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

    public static ModifyDBInstanceConnectionStringRequest create() {
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
     * @return currentConnectionString
     */
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
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

    public static final class Builder extends Request.Builder<ModifyDBInstanceConnectionStringRequest, Builder> {
        private String babelfishPort; 
        private String connectionStringPrefix; 
        private String currentConnectionString; 
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

        private Builder(ModifyDBInstanceConnectionStringRequest request) {
            super(request);
            this.babelfishPort = request.babelfishPort;
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.currentConnectionString = request.currentConnectionString;
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
         * The prefix of the endpoint after the change. Only the prefix of the value of **CurrentConnectionString** can be changed.
         * <p>
         * 
         * > The value must be 8 to 64 characters in length and can contain letters, digits, and hyphens (-). The value cannot contain any of the following special characters: ! # % ^ & \* = + | {} ; : \" " ,<> / ?
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * The endpoint of the instance. It can be an internal endpoint, a public endpoint, or a classic network endpoint in hybrid access mode.
         * <p>
         * 
         * > The read/write splitting endpoint cannot be changed.
         */
        public Builder currentConnectionString(String currentConnectionString) {
            this.putQueryParameter("CurrentConnectionString", currentConnectionString);
            this.currentConnectionString = currentConnectionString;
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
         * The name of the dedicated cluster to which the instance belongs. This parameter is returned only when the instance is created in an ApsaraDB MyBase cluster that runs MySQL on Standard Edition.
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
         * The PgBouncer port.
         * <p>
         * 
         * > This parameter is suitable only for ApsaraDB RDS for PostgreSQL instances. If you enable PgBouncer for your instance, you can change the PgBouncer port of the instance.
         */
        public Builder PGBouncerPort(String PGBouncerPort) {
            this.putQueryParameter("PGBouncerPort", PGBouncerPort);
            this.PGBouncerPort = PGBouncerPort;
            return this;
        }

        /**
         * The port number after the change.
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
        public ModifyDBInstanceConnectionStringRequest build() {
            return new ModifyDBInstanceConnectionStringRequest(this);
        } 

    } 

}
