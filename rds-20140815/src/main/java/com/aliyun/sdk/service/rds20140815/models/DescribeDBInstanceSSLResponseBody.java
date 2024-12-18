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
 * {@link DescribeDBInstanceSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSSLResponseBody</p>
 */
public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ACL")
    private String ACL;

    @com.aliyun.core.annotation.NameInMap("CAType")
    private String CAType;

    @com.aliyun.core.annotation.NameInMap("ClientCACert")
    private String clientCACert;

    @com.aliyun.core.annotation.NameInMap("ClientCACertExpireTime")
    private String clientCACertExpireTime;

    @com.aliyun.core.annotation.NameInMap("ClientCertRevocationList")
    private String clientCertRevocationList;

    @com.aliyun.core.annotation.NameInMap("ConnectionString")
    private String connectionString;

    @com.aliyun.core.annotation.NameInMap("ForceEncryption")
    private String forceEncryption;

    @com.aliyun.core.annotation.NameInMap("LastModifyStatus")
    private String lastModifyStatus;

    @com.aliyun.core.annotation.NameInMap("ModifyStatusReason")
    private String modifyStatusReason;

    @com.aliyun.core.annotation.NameInMap("ReplicationACL")
    private String replicationACL;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequireUpdate")
    private String requireUpdate;

    @com.aliyun.core.annotation.NameInMap("RequireUpdateItem")
    private String requireUpdateItem;

    @com.aliyun.core.annotation.NameInMap("RequireUpdateReason")
    private String requireUpdateReason;

    @com.aliyun.core.annotation.NameInMap("SSLCreateTime")
    private String SSLCreateTime;

    @com.aliyun.core.annotation.NameInMap("SSLEnabled")
    private String SSLEnabled;

    @com.aliyun.core.annotation.NameInMap("SSLExpireTime")
    private String SSLExpireTime;

    @com.aliyun.core.annotation.NameInMap("ServerCAUrl")
    private String serverCAUrl;

    @com.aliyun.core.annotation.NameInMap("ServerCert")
    private String serverCert;

    @com.aliyun.core.annotation.NameInMap("ServerKey")
    private String serverKey;

    @com.aliyun.core.annotation.NameInMap("TlsVersion")
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
         * <p>The method that is used to verify the identities of clients. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:</p>
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
            this.ACL = ACL;
            return this;
        }

        /**
         * <p>The type of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:</p>
         * <ul>
         * <li><strong>aliyun</strong>: a cloud certificate</li>
         * <li><strong>custom</strong>: a custom certificate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder CAType(String CAType) {
            this.CAType = CAType;
            return this;
        }

        /**
         * <p>The public key of the CA that issues client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----MIID*****viXk=-----END CERTIFICATE-----</p>
         */
        public Builder clientCACert(String clientCACert) {
            this.clientCACert = clientCACert;
            return this;
        }

        /**
         * <p>The time when the public key of the CA that issues client certificates expires. This parameter is supported only when the instance runs PostgreSQL with cloud disks. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. This parameter is not supported now.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder clientCACertExpireTime(String clientCACertExpireTime) {
            this.clientCACertExpireTime = clientCACertExpireTime;
            return this;
        }

        /**
         * <p>The certificate revocation list (CRL) that contains revoked client certificates. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN X509 CRL-----MIIB****19mg==-----END X509 CRL-----</p>
         */
        public Builder clientCertRevocationList(String clientCertRevocationList) {
            this.clientCertRevocationList = clientCertRevocationList;
            return this;
        }

        /**
         * <p>The endpoint that is protected by SSL encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp162dfr55g47****.mysql.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>Indicates whether the forceful SSL encryption feature is enabled. This parameter is supported only for ApsaraDB RDS for SQL Server instances. For more information, see <a href="https://help.aliyun.com/document_detail/95715.html">Configure the SSL encryption feature</a>.</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: The feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder forceEncryption(String forceEncryption) {
            this.forceEncryption = forceEncryption;
            return this;
        }

        /**
         * <p>The status of the SSL link. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>setting</strong></li>
         * <li><strong>failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>setting</p>
         */
        public Builder lastModifyStatus(String lastModifyStatus) {
            this.lastModifyStatus = lastModifyStatus;
            return this;
        }

        /**
         * <p>The reason why the SSL link stays in the current state. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
         * 
         * <strong>example:</strong>
         * <p>Modify DB Instance SSL Config.</p>
         */
        public Builder modifyStatusReason(String modifyStatusReason) {
            this.modifyStatusReason = modifyStatusReason;
            return this;
        }

        /**
         * <p>The method that is used to verify the replication permission. This parameter is supported only when the instance runs PostgreSQL with cloud disks. Valid values:</p>
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
            this.replicationACL = replicationACL;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7705151C-E242-55AF-9929-2A3C39D979D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the server certificate needs to be updated.</p>
         * <ul>
         * <li><p>Valid values for ApsaraDB RDS for MySQL instances and ApsaraDB RDS for SQL Server instances:</p>
         * <ul>
         * <li><strong>No</strong></li>
         * <li><strong>Yes</strong></li>
         * </ul>
         * </li>
         * <li><p>Valid values for ApsaraDB RDS for PostgreSQL instances:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        public Builder requireUpdate(String requireUpdate) {
            this.requireUpdate = requireUpdate;
            return this;
        }

        /**
         * <p>The server certificate that needs to be updated. This parameter is supported only when the instance runs PostgreSQL with cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder requireUpdateItem(String requireUpdateItem) {
            this.requireUpdateItem = requireUpdateItem;
            return this;
        }

        /**
         * <p>The reason why the server certificate needs to be updated. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder requireUpdateReason(String requireUpdateReason) {
            this.requireUpdateReason = requireUpdateReason;
            return this;
        }

        /**
         * <p>The time when the server certificate was created. This parameter is supported only when the instance runs PostgreSQL with cloud disks. In addition, this parameter is valid only when the CAType parameter value is aliyun.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder SSLCreateTime(String SSLCreateTime) {
            this.SSLCreateTime = SSLCreateTime;
            return this;
        }

        /**
         * <p>Indicates whether SSL encryption is enabled.</p>
         * <ul>
         * <li><p>Valid values for ApsaraDB RDS for MySQL instances and ApsaraDB RDS for SQL Server instances:</p>
         * <ul>
         * <li><strong>Yes</strong></li>
         * <li><strong>No</strong></li>
         * </ul>
         * </li>
         * <li><p>Valid values for ApsaraDB RDS for PostgreSQL instances:</p>
         * <ul>
         * <li><strong>on</strong>: enabled</li>
         * <li><strong>off</strong>: disabled</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        public Builder SSLEnabled(String SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        /**
         * <p>The time when the server certificate expires. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-11T08:16:43Z</p>
         */
        public Builder SSLExpireTime(String SSLExpireTime) {
            this.SSLExpireTime = SSLExpireTime;
            return this;
        }

        /**
         * <p>The URL of the certificate that is used to issue the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder serverCAUrl(String serverCAUrl) {
            this.serverCAUrl = serverCAUrl;
            return this;
        }

        /**
         * <p>The content of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----MIID*****QqEP-----END CERTIFICATE-----</p>
         */
        public Builder serverCert(String serverCert) {
            this.serverCert = serverCert;
            return this;
        }

        /**
         * <p>The private key of the server certificate. This parameter is supported only when the instance runs PostgreSQL with cloud disks.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PRIVATE KEY-----MIIE****ihfg==-----END PRIVATE KEY-----</p>
         */
        public Builder serverKey(String serverKey) {
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
            this.tlsVersion = tlsVersion;
            return this;
        }

        public DescribeDBInstanceSSLResponseBody build() {
            return new DescribeDBInstanceSSLResponseBody(this);
        } 

    } 

}
