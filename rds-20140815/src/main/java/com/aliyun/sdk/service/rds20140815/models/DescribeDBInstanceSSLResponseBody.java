// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSSLResponseBody</p>
 */
public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    @NameInMap("ACL")
    private String ACL;

    @NameInMap("CAType")
    private String CAType;

    @NameInMap("ClientCACert")
    private String clientCACert;

    @NameInMap("ClientCACertExpireTime")
    private String clientCACertExpireTime;

    @NameInMap("ClientCertRevocationList")
    private String clientCertRevocationList;

    @NameInMap("ConnectionString")
    private String connectionString;

    @NameInMap("ForceEncryption")
    private String forceEncryption;

    @NameInMap("LastModifyStatus")
    private String lastModifyStatus;

    @NameInMap("ModifyStatusReason")
    private String modifyStatusReason;

    @NameInMap("ReplicationACL")
    private String replicationACL;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequireUpdate")
    private String requireUpdate;

    @NameInMap("RequireUpdateItem")
    private String requireUpdateItem;

    @NameInMap("RequireUpdateReason")
    private String requireUpdateReason;

    @NameInMap("SSLCreateTime")
    private String SSLCreateTime;

    @NameInMap("SSLEnabled")
    private String SSLEnabled;

    @NameInMap("SSLExpireTime")
    private String SSLExpireTime;

    @NameInMap("ServerCAUrl")
    private String serverCAUrl;

    @NameInMap("ServerCert")
    private String serverCert;

    @NameInMap("ServerKey")
    private String serverKey;

    @NameInMap("TlsVersion")
    private String tlsVersion;

    private DescribeDBInstanceSSLResponseBody(Builder builder) {
        this.ACL = builder.ACL;
        this.CAType = builder.CAType;
        this.clientCACert = builder.clientCACert;
        this.clientCACertExpireTime = builder.clientCACertExpireTime;
        this.clientCertRevocationList = builder.clientCertRevocationList;
        this.connectionString = builder.connectionString;
        this.forceEncryption = builder.forceEncryption;
        this.lastModifyStatus = builder.lastModifyStatus;
        this.modifyStatusReason = builder.modifyStatusReason;
        this.replicationACL = builder.replicationACL;
        this.requestId = builder.requestId;
        this.requireUpdate = builder.requireUpdate;
        this.requireUpdateItem = builder.requireUpdateItem;
        this.requireUpdateReason = builder.requireUpdateReason;
        this.SSLCreateTime = builder.SSLCreateTime;
        this.SSLEnabled = builder.SSLEnabled;
        this.SSLExpireTime = builder.SSLExpireTime;
        this.serverCAUrl = builder.serverCAUrl;
        this.serverCert = builder.serverCert;
        this.serverKey = builder.serverKey;
        this.tlsVersion = builder.tlsVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSSLResponseBody create() {
        return builder().build();
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
     * @return clientCACertExpireTime
     */
    public String getClientCACertExpireTime() {
        return this.clientCACertExpireTime;
    }

    /**
     * @return clientCertRevocationList
     */
    public String getClientCertRevocationList() {
        return this.clientCertRevocationList;
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return forceEncryption
     */
    public String getForceEncryption() {
        return this.forceEncryption;
    }

    /**
     * @return lastModifyStatus
     */
    public String getLastModifyStatus() {
        return this.lastModifyStatus;
    }

    /**
     * @return modifyStatusReason
     */
    public String getModifyStatusReason() {
        return this.modifyStatusReason;
    }

    /**
     * @return replicationACL
     */
    public String getReplicationACL() {
        return this.replicationACL;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requireUpdate
     */
    public String getRequireUpdate() {
        return this.requireUpdate;
    }

    /**
     * @return requireUpdateItem
     */
    public String getRequireUpdateItem() {
        return this.requireUpdateItem;
    }

    /**
     * @return requireUpdateReason
     */
    public String getRequireUpdateReason() {
        return this.requireUpdateReason;
    }

    /**
     * @return SSLCreateTime
     */
    public String getSSLCreateTime() {
        return this.SSLCreateTime;
    }

    /**
     * @return SSLEnabled
     */
    public String getSSLEnabled() {
        return this.SSLEnabled;
    }

    /**
     * @return SSLExpireTime
     */
    public String getSSLExpireTime() {
        return this.SSLExpireTime;
    }

    /**
     * @return serverCAUrl
     */
    public String getServerCAUrl() {
        return this.serverCAUrl;
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

    public static final class Builder {
        private String ACL; 
        private String CAType; 
        private String clientCACert; 
        private String clientCACertExpireTime; 
        private String clientCertRevocationList; 
        private String connectionString; 
        private String forceEncryption; 
        private String lastModifyStatus; 
        private String modifyStatusReason; 
        private String replicationACL; 
        private String requestId; 
        private String requireUpdate; 
        private String requireUpdateItem; 
        private String requireUpdateReason; 
        private String SSLCreateTime; 
        private String SSLEnabled; 
        private String SSLExpireTime; 
        private String serverCAUrl; 
        private String serverCert; 
        private String serverKey; 
        private String tlsVersion; 

        /**
         * The method that is used to verify the identities of clients. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:
         * <p>
         * 
         * *   **cert**
         * *   **perfer**
         * *   **verify-ca**
         * *   **verify-full** (supported only when the instance runs PostgreSQL 12 or later)
         */
        public Builder ACL(String ACL) {
            this.ACL = ACL;
            return this;
        }

        /**
         * The type of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:
         * <p>
         * 
         * *   **aliyun**: a cloud certificate
         * *   **custom**: a custom certificate
         */
        public Builder CAType(String CAType) {
            this.CAType = CAType;
            return this;
        }

        /**
         * The public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks.
         */
        public Builder clientCACert(String clientCACert) {
            this.clientCACert = clientCACert;
            return this;
        }

        /**
         * The time when the public key of the CA that issues client certificates expires. This parameter is supported only when the instance runs PostgreSQL with cloud disks. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. This parameter is not supported now.
         */
        public Builder clientCACertExpireTime(String clientCACertExpireTime) {
            this.clientCACertExpireTime = clientCACertExpireTime;
            return this;
        }

        /**
         * The certificate revocation list (CRL) that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks.
         */
        public Builder clientCertRevocationList(String clientCertRevocationList) {
            this.clientCertRevocationList = clientCertRevocationList;
            return this;
        }

        /**
         * The endpoint that is protected by SSL encryption.
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * ForceEncryption.
         */
        public Builder forceEncryption(String forceEncryption) {
            this.forceEncryption = forceEncryption;
            return this;
        }

        /**
         * The status of the SSL link. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:
         * <p>
         * 
         * *   **success**
         * *   **setting**
         * *   **failed**
         */
        public Builder lastModifyStatus(String lastModifyStatus) {
            this.lastModifyStatus = lastModifyStatus;
            return this;
        }

        /**
         * The reason why the SSL link stays in the current state. This parameter is supported only when the instance runs PostgreSQL with cloud disks.
         */
        public Builder modifyStatusReason(String modifyStatusReason) {
            this.modifyStatusReason = modifyStatusReason;
            return this;
        }

        /**
         * The method that is used to verify the replication permission. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:
         * <p>
         * 
         * *   **cert**
         * *   **perfer**
         * *   **verify-ca**
         * *   **verify-full** (supported only when the instance runs PostgreSQL 12 or later)
         */
        public Builder replicationACL(String replicationACL) {
            this.replicationACL = replicationACL;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the server certificate needs to be updated.
         * <p>
         * 
         * *   Valid values for ApsaraDB RDS for MySQL instances and ApsaraDB RDS for SQL Server instances:
         * 
         *     *   **No**
         *     *   **Yes**
         * 
         * *   Valid values for ApsaraDB RDS for PostgreSQL instances:
         * 
         *     *   **0**: no
         *     *   **1**: yes
         */
        public Builder requireUpdate(String requireUpdate) {
            this.requireUpdate = requireUpdate;
            return this;
        }

        /**
         * The server certificate that needs to be updated. This parameter is supported only when the instance runs PostgreSQL with cloud disk.
         */
        public Builder requireUpdateItem(String requireUpdateItem) {
            this.requireUpdateItem = requireUpdateItem;
            return this;
        }

        /**
         * The reason why the server certificate needs to be updated. This parameter is supported only when the instance runs PostgreSQL with cloud disks.
         */
        public Builder requireUpdateReason(String requireUpdateReason) {
            this.requireUpdateReason = requireUpdateReason;
            return this;
        }

        /**
         * The time when the server certificate was created. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is valid only when the CAType parameter value is aliyun.
         */
        public Builder SSLCreateTime(String SSLCreateTime) {
            this.SSLCreateTime = SSLCreateTime;
            return this;
        }

        /**
         * Indicates whether SSL encryption is enabled.
         * <p>
         * 
         * *   Valid values for ApsaraDB RDS for MySQL instances and ApsaraDB RDS for SQL Server instances:
         * 
         *     *   **Yes**
         *     *   **No**
         * 
         * *   Valid values for ApsaraDB RDS for PostgreSQL instances:
         * 
         *     *   **on**: enabled
         *     *   **off**: disabled
         */
        public Builder SSLEnabled(String SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        /**
         * The time when the server certificate expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder SSLExpireTime(String SSLExpireTime) {
            this.SSLExpireTime = SSLExpireTime;
            return this;
        }

        /**
         * The URL of the certificate that is used to issue the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disk.
         */
        public Builder serverCAUrl(String serverCAUrl) {
            this.serverCAUrl = serverCAUrl;
            return this;
        }

        /**
         * The content of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks.
         */
        public Builder serverCert(String serverCert) {
            this.serverCert = serverCert;
            return this;
        }

        /**
         * The private key of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks.
         */
        public Builder serverKey(String serverKey) {
            this.serverKey = serverKey;
            return this;
        }

        /**
         * TlsVersion.
         */
        public Builder tlsVersion(String tlsVersion) {
            this.tlsVersion = tlsVersion;
            return this;
        }

        public DescribeDBInstanceSSLResponseBody build() {
            return new DescribeDBInstanceSSLResponseBody(this);
        } 

    } 

}
