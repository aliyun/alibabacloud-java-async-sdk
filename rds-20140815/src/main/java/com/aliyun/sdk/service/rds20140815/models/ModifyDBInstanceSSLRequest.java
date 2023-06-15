// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceSSLRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceSSLRequest</p>
 */
public class ModifyDBInstanceSSLRequest extends Request {
    @Query
    @NameInMap("ACL")
    private String ACL;

    @Query
    @NameInMap("CAType")
    private String CAType;

    @Query
    @NameInMap("ClientCACert")
    private String clientCACert;

    @Query
    @NameInMap("ClientCAEnabled")
    private Integer clientCAEnabled;

    @Query
    @NameInMap("ClientCertRevocationList")
    private String clientCertRevocationList;

    @Query
    @NameInMap("ClientCrlEnabled")
    private Integer clientCrlEnabled;

    @Query
    @NameInMap("ConnectionString")
    @Validation(required = true)
    private String connectionString;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ReplicationACL")
    private String replicationACL;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SSLEnabled")
    private Integer SSLEnabled;

    @Query
    @NameInMap("ServerCert")
    private String serverCert;

    @Query
    @NameInMap("ServerKey")
    private String serverKey;

    private ModifyDBInstanceSSLRequest(Builder builder) {
        super(builder);
        this.ACL = builder.ACL;
        this.CAType = builder.CAType;
        this.clientCACert = builder.clientCACert;
        this.clientCAEnabled = builder.clientCAEnabled;
        this.clientCertRevocationList = builder.clientCertRevocationList;
        this.clientCrlEnabled = builder.clientCrlEnabled;
        this.connectionString = builder.connectionString;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.replicationACL = builder.replicationACL;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.SSLEnabled = builder.SSLEnabled;
        this.serverCert = builder.serverCert;
        this.serverKey = builder.serverKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceSSLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ACL
     */
    public String getACL() {
        return this.ACL;
    }

    /**
     * @return CAType
     */
    public String getCAType() {
        return this.CAType;
    }

    /**
     * @return clientCACert
     */
    public String getClientCACert() {
        return this.clientCACert;
    }

    /**
     * @return clientCAEnabled
     */
    public Integer getClientCAEnabled() {
        return this.clientCAEnabled;
    }

    /**
     * @return clientCertRevocationList
     */
    public String getClientCertRevocationList() {
        return this.clientCertRevocationList;
    }

    /**
     * @return clientCrlEnabled
     */
    public Integer getClientCrlEnabled() {
        return this.clientCrlEnabled;
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
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
     * @return replicationACL
     */
    public String getReplicationACL() {
        return this.replicationACL;
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

    /**
     * @return SSLEnabled
     */
    public Integer getSSLEnabled() {
        return this.SSLEnabled;
    }

    /**
     * @return serverCert
     */
    public String getServerCert() {
        return this.serverCert;
    }

    /**
     * @return serverKey
     */
    public String getServerKey() {
        return this.serverKey;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceSSLRequest, Builder> {
        private String ACL; 
        private String CAType; 
        private String clientCACert; 
        private Integer clientCAEnabled; 
        private String clientCertRevocationList; 
        private Integer clientCrlEnabled; 
        private String connectionString; 
        private String DBInstanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String replicationACL; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer SSLEnabled; 
        private String serverCert; 
        private String serverKey; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceSSLRequest request) {
            super(request);
            this.ACL = request.ACL;
            this.CAType = request.CAType;
            this.clientCACert = request.clientCACert;
            this.clientCAEnabled = request.clientCAEnabled;
            this.clientCertRevocationList = request.clientCertRevocationList;
            this.clientCrlEnabled = request.clientCrlEnabled;
            this.connectionString = request.connectionString;
            this.DBInstanceId = request.DBInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.replicationACL = request.replicationACL;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.SSLEnabled = request.SSLEnabled;
            this.serverCert = request.serverCert;
            this.serverKey = request.serverKey;
        } 

        /**
         * The method that is used to verify the identities of clients. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:
         * <p>
         * 
         * *   **cert**
         * *   **perfer**
         * *   **verify-ca**
         * *   **verify-full** (supported only when the instance runs PostgreSQL 12 or later)
         */
        public Builder ACL(String ACL) {
            this.putQueryParameter("ACL", ACL);
            this.ACL = ACL;
            return this;
        }

        /**
         * The type of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. If you set SSLEnabled to **1**, the default value of this parameter is **aliyun**. Valid values:
         * <p>
         * 
         * *   **aliyun**: a cloud certificate
         * *   **custom**: a custom certificate
         */
        public Builder CAType(String CAType) {
            this.putQueryParameter("CAType", CAType);
            this.CAType = CAType;
            return this;
        }

        /**
         * The public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when ClientCAEbabled is set to **1**.
         */
        public Builder clientCACert(String clientCACert) {
            this.putQueryParameter("ClientCACert", clientCACert);
            this.clientCACert = clientCACert;
            return this;
        }

        /**
         * Specifies whether to enable the public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:
         * <p>
         * 
         * *   **1**: enables the public key.
         * *   **0**: disables the public key.
         */
        public Builder clientCAEnabled(Integer clientCAEnabled) {
            this.putQueryParameter("ClientCAEnabled", clientCAEnabled);
            this.clientCAEnabled = clientCAEnabled;
            return this;
        }

        /**
         * The CRL that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when ClientCrlEnabled is set to **1**.
         */
        public Builder clientCertRevocationList(String clientCertRevocationList) {
            this.putQueryParameter("ClientCertRevocationList", clientCertRevocationList);
            this.clientCertRevocationList = clientCertRevocationList;
            return this;
        }

        /**
         * Specifies whether to enable a certificate revocation list (CRL) that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:
         * <p>
         * 
         * *   **1**: enables the CRL.
         * *   **0**: disables the CRL.
         */
        public Builder clientCrlEnabled(Integer clientCrlEnabled) {
            this.putQueryParameter("ClientCrlEnabled", clientCrlEnabled);
            this.clientCrlEnabled = clientCrlEnabled;
            return this;
        }

        /**
         * The internal or public endpoint for which the server certificate needs to be created or updated.
         */
        public Builder connectionString(String connectionString) {
            this.putQueryParameter("ConnectionString", connectionString);
            this.connectionString = connectionString;
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
         * The method that is used to verify the replication permission. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:
         * <p>
         * 
         * *   **cert**
         * *   **perfer**
         * *   **verify-ca**
         * *   **verify-full** (supported only when the instance runs PostgreSQL 12 or later)
         */
        public Builder replicationACL(String replicationACL) {
            this.putQueryParameter("ReplicationACL", replicationACL);
            this.replicationACL = replicationACL;
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

        /**
         * Specifies whether to enable or disable the SSL encryption feature. Valid values:
         * <p>
         * 
         * *   **1**: enables the feature.
         * *   **0**: disables the feature.
         */
        public Builder SSLEnabled(Integer SSLEnabled) {
            this.putQueryParameter("SSLEnabled", SSLEnabled);
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        /**
         * The content of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when CAType is set to **custom**.
         */
        public Builder serverCert(String serverCert) {
            this.putQueryParameter("ServerCert", serverCert);
            this.serverCert = serverCert;
            return this;
        }

        /**
         * The private key of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when CAType is set to **custom**.
         */
        public Builder serverKey(String serverKey) {
            this.putQueryParameter("ServerKey", serverKey);
            this.serverKey = serverKey;
            return this;
        }

        @Override
        public ModifyDBInstanceSSLRequest build() {
            return new ModifyDBInstanceSSLRequest(this);
        } 

    } 

}
