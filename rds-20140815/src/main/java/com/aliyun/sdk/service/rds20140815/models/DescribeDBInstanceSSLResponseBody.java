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

    private DescribeDBInstanceSSLResponseBody(Builder builder) {
        this.ACL = builder.ACL;
        this.CAType = builder.CAType;
        this.clientCACert = builder.clientCACert;
        this.clientCACertExpireTime = builder.clientCACertExpireTime;
        this.clientCertRevocationList = builder.clientCertRevocationList;
        this.connectionString = builder.connectionString;
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

    public static final class Builder {
        private String ACL; 
        private String CAType; 
        private String clientCACert; 
        private String clientCACertExpireTime; 
        private String clientCertRevocationList; 
        private String connectionString; 
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

        /**
         * ACL.
         */
        public Builder ACL(String ACL) {
            this.ACL = ACL;
            return this;
        }

        /**
         * CAType.
         */
        public Builder CAType(String CAType) {
            this.CAType = CAType;
            return this;
        }

        /**
         * ClientCACert.
         */
        public Builder clientCACert(String clientCACert) {
            this.clientCACert = clientCACert;
            return this;
        }

        /**
         * ClientCACertExpireTime.
         */
        public Builder clientCACertExpireTime(String clientCACertExpireTime) {
            this.clientCACertExpireTime = clientCACertExpireTime;
            return this;
        }

        /**
         * ClientCertRevocationList.
         */
        public Builder clientCertRevocationList(String clientCertRevocationList) {
            this.clientCertRevocationList = clientCertRevocationList;
            return this;
        }

        /**
         * ConnectionString.
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * LastModifyStatus.
         */
        public Builder lastModifyStatus(String lastModifyStatus) {
            this.lastModifyStatus = lastModifyStatus;
            return this;
        }

        /**
         * ModifyStatusReason.
         */
        public Builder modifyStatusReason(String modifyStatusReason) {
            this.modifyStatusReason = modifyStatusReason;
            return this;
        }

        /**
         * ReplicationACL.
         */
        public Builder replicationACL(String replicationACL) {
            this.replicationACL = replicationACL;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RequireUpdate.
         */
        public Builder requireUpdate(String requireUpdate) {
            this.requireUpdate = requireUpdate;
            return this;
        }

        /**
         * RequireUpdateItem.
         */
        public Builder requireUpdateItem(String requireUpdateItem) {
            this.requireUpdateItem = requireUpdateItem;
            return this;
        }

        /**
         * RequireUpdateReason.
         */
        public Builder requireUpdateReason(String requireUpdateReason) {
            this.requireUpdateReason = requireUpdateReason;
            return this;
        }

        /**
         * SSLCreateTime.
         */
        public Builder SSLCreateTime(String SSLCreateTime) {
            this.SSLCreateTime = SSLCreateTime;
            return this;
        }

        /**
         * SSLEnabled.
         */
        public Builder SSLEnabled(String SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        /**
         * SSLExpireTime.
         */
        public Builder SSLExpireTime(String SSLExpireTime) {
            this.SSLExpireTime = SSLExpireTime;
            return this;
        }

        /**
         * ServerCAUrl.
         */
        public Builder serverCAUrl(String serverCAUrl) {
            this.serverCAUrl = serverCAUrl;
            return this;
        }

        /**
         * ServerCert.
         */
        public Builder serverCert(String serverCert) {
            this.serverCert = serverCert;
            return this;
        }

        /**
         * ServerKey.
         */
        public Builder serverKey(String serverKey) {
            this.serverKey = serverKey;
            return this;
        }

        public DescribeDBInstanceSSLResponseBody build() {
            return new DescribeDBInstanceSSLResponseBody(this);
        } 

    } 

}
