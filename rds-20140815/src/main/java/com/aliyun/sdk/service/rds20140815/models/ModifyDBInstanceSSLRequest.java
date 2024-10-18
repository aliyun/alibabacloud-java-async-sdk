// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDBInstanceSSLRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceSSLRequest</p>
 */
public class ModifyDBInstanceSSLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ACL")
    private String ACL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CAType")
    private String CAType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Certificate")
    private String certificate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientCACert")
    private String clientCACert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientCAEnabled")
    private Integer clientCAEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientCertRevocationList")
    private String clientCertRevocationList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientCrlEnabled")
    private Integer clientCrlEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionString")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceEncryption")
    private String forceEncryption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PassWord")
    private String passWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationACL")
    private String replicationACL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLEnabled")
    private Integer SSLEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerCert")
    private String serverCert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerKey")
    private String serverKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TlsVersion")
    private String tlsVersion;

    private ModifyDBInstanceSSLRequest(Builder builder) {
        super(builder);
        this.ACL = builder.ACL;
        this.CAType = builder.CAType;
        this.certificate = builder.certificate;
        this.clientCACert = builder.clientCACert;
        this.clientCAEnabled = builder.clientCAEnabled;
        this.clientCertRevocationList = builder.clientCertRevocationList;
        this.clientCrlEnabled = builder.clientCrlEnabled;
        this.connectionString = builder.connectionString;
        this.DBInstanceId = builder.DBInstanceId;
        this.forceEncryption = builder.forceEncryption;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.passWord = builder.passWord;
        this.replicationACL = builder.replicationACL;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.SSLEnabled = builder.SSLEnabled;
        this.serverCert = builder.serverCert;
        this.serverKey = builder.serverKey;
        this.tlsVersion = builder.tlsVersion;
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
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
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
     * @return forceEncryption
     */
    public String getForceEncryption() {
        return this.forceEncryption;
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
     * @return passWord
     */
    public String getPassWord() {
        return this.passWord;
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

    /**
     * @return tlsVersion
     */
    public String getTlsVersion() {
        return this.tlsVersion;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceSSLRequest, Builder> {
        private String ACL; 
        private String CAType; 
        private String certificate; 
        private String clientCACert; 
        private Integer clientCAEnabled; 
        private String clientCertRevocationList; 
        private Integer clientCrlEnabled; 
        private String connectionString; 
        private String DBInstanceId; 
        private String forceEncryption; 
        private String ownerAccount; 
        private Long ownerId; 
        private String passWord; 
        private String replicationACL; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer SSLEnabled; 
        private String serverCert; 
        private String serverKey; 
        private String tlsVersion; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceSSLRequest request) {
            super(request);
            this.ACL = request.ACL;
            this.CAType = request.CAType;
            this.certificate = request.certificate;
            this.clientCACert = request.clientCACert;
            this.clientCAEnabled = request.clientCAEnabled;
            this.clientCertRevocationList = request.clientCertRevocationList;
            this.clientCrlEnabled = request.clientCrlEnabled;
            this.connectionString = request.connectionString;
            this.DBInstanceId = request.DBInstanceId;
            this.forceEncryption = request.forceEncryption;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.passWord = request.passWord;
            this.replicationACL = request.replicationACL;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.SSLEnabled = request.SSLEnabled;
            this.serverCert = request.serverCert;
            this.serverKey = request.serverKey;
            this.tlsVersion = request.tlsVersion;
        } 

        /**
         * <p>The method that is used to verify the identities of clients. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:</p>
         * <ul>
         * <li><strong>cert</strong></li>
         * <li><strong>prefer</strong></li>
         * <li><strong>verify-ca</strong></li>
         * <li><strong>verify-full</strong> (supported only when the instance runs PostgreSQL 12 or later)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cert</p>
         */
        public Builder ACL(String ACL) {
            this.putQueryParameter("ACL", ACL);
            this.ACL = ACL;
            return this;
        }

        /**
         * <p>The type of the server certificate. This parameter is supported only when the instance runs MySQL or PostgreSQL with cloud disks. If you set SSLEnabled to <strong>1</strong>, the default value of this parameter is <strong>aliyun</strong>. Valid values:</p>
         * <ul>
         * <li><strong>aliyun</strong>: a cloud certificate</li>
         * <li><strong>custom</strong>: a custom certificate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder CAType(String CAType) {
            this.putQueryParameter("CAType", CAType);
            this.CAType = CAType;
            return this;
        }

        /**
         * <p>The custom certificate. The custom certificate is in the <code>PFX</code> format.</p>
         * <ul>
         * <li>Public endpoint: <code>oss-&lt;The ID of the region&gt;.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the certificate file (The file name contains the extension.)&gt;</code></li>
         * <li>Internal endpoint: <code>oss-&lt;The ID of the region&gt;-internal.aliyuncs.com:&lt;The name of the bucket&gt;:&lt;The name of the certificate file (The file name contains the extension.)&gt;</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-beijing-internal.aliyuncs.com:zhttest:test.pfx</p>
         */
        public Builder certificate(String certificate) {
            this.putQueryParameter("Certificate", certificate);
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>The public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when ClientCAEbabled is set to <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----MIID*****viXk=-----END CERTIFICATE-----</p>
         */
        public Builder clientCACert(String clientCACert) {
            this.putQueryParameter("ClientCACert", clientCACert);
            this.clientCACert = clientCACert;
            return this;
        }

        /**
         * <p>Specifies whether to enable the public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables the public key.</li>
         * <li><strong>0</strong>: disables the public key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientCAEnabled(Integer clientCAEnabled) {
            this.putQueryParameter("ClientCAEnabled", clientCAEnabled);
            this.clientCAEnabled = clientCAEnabled;
            return this;
        }

        /**
         * <p>The CRL that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when ClientCrlEnabled is set to <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN X509 CRL-----MIIB****19mg==-----END X509 CRL-----</p>
         */
        public Builder clientCertRevocationList(String clientCertRevocationList) {
            this.putQueryParameter("ClientCertRevocationList", clientCertRevocationList);
            this.clientCertRevocationList = clientCertRevocationList;
            return this;
        }

        /**
         * <p>Specifies whether to enable a certificate revocation list (CRL) that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables the CRL.</li>
         * <li><strong>0</strong>: disables the CRL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientCrlEnabled(Integer clientCrlEnabled) {
            this.putQueryParameter("ClientCrlEnabled", clientCrlEnabled);
            this.clientCrlEnabled = clientCrlEnabled;
            return this;
        }

        /**
         * <p>The internal or public endpoint for which the server certificate needs to be created or updated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxx.mysql.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.putQueryParameter("ConnectionString", connectionString);
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the forceful SSL encryption feature. This parameter is supported only for ApsaraDB RDS for SQL Server instances. For more information, see <a href="https://help.aliyun.com/document_detail/95715.html">Configure the SSL encryption feature</a>. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables the feature.</li>
         * <li><strong>0</strong>: disables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder forceEncryption(String forceEncryption) {
            this.putQueryParameter("ForceEncryption", forceEncryption);
            this.forceEncryption = forceEncryption;
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
         * <p>The password of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>zht123456</p>
         */
        public Builder passWord(String passWord) {
            this.putQueryParameter("PassWord", passWord);
            this.passWord = passWord;
            return this;
        }

        /**
         * <p>The method that is used to verify the replication permission. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is available only when the public key of the CA that issues client certificates is enabled. Valid values:</p>
         * <ul>
         * <li><strong>cert</strong></li>
         * <li><strong>prefer</strong></li>
         * <li><strong>verify-ca</strong></li>
         * <li><strong>verify-full</strong> (supported only when the instance runs PostgreSQL 12 or later)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cert</p>
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
         * <p>Specifies whether to enable or disable the SSL encryption feature. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables the feature.</li>
         * <li><strong>0</strong>: disables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder SSLEnabled(Integer SSLEnabled) {
            this.putQueryParameter("SSLEnabled", SSLEnabled);
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        /**
         * <p>The content of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when CAType is set to <strong>custom</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----MIID*****QqEP-----END CERTIFICATE-----</p>
         */
        public Builder serverCert(String serverCert) {
            this.putQueryParameter("ServerCert", serverCert);
            this.serverCert = serverCert;
            return this;
        }

        /**
         * <p>The private key of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. This parameter must be specified when CAType is set to <strong>custom</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PRIVATE KEY-----MIIE****ihfg==-----END PRIVATE KEY-----</p>
         */
        public Builder serverKey(String serverKey) {
            this.putQueryParameter("ServerKey", serverKey);
            this.serverKey = serverKey;
            return this;
        }

        /**
         * <p>The minimum Transport Layer Security (TLS) version. Valid values: 1.0, 1.1, and 1.2. This parameter is supported only for ApsaraDB RDS for SQL Server instances. For more information, see <a href="https://help.aliyun.com/document_detail/95715.html">Configure the SSL encryption feature</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1</p>
         */
        public Builder tlsVersion(String tlsVersion) {
            this.putQueryParameter("TlsVersion", tlsVersion);
            this.tlsVersion = tlsVersion;
            return this;
        }

        @Override
        public ModifyDBInstanceSSLRequest build() {
            return new ModifyDBInstanceSSLRequest(this);
        } 

    } 

}
