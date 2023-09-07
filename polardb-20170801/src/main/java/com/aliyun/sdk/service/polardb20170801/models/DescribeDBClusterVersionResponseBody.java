// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterVersionResponseBody</p>
 */
public class DescribeDBClusterVersionResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("DBLatestVersion")
    private String DBLatestVersion;

    @NameInMap("DBMinorVersion")
    private String DBMinorVersion;

    @NameInMap("DBRevisionVersion")
    private String DBRevisionVersion;

    @NameInMap("DBRevisionVersionList")
    private java.util.List < DBRevisionVersionList> DBRevisionVersionList;

    @NameInMap("DBVersion")
    private String DBVersion;

    @NameInMap("DBVersionStatus")
    private String DBVersionStatus;

    @NameInMap("IsLatestVersion")
    private String isLatestVersion;

    @NameInMap("IsProxyLatestVersion")
    private String isProxyLatestVersion;

    @NameInMap("ProxyLatestVersion")
    private String proxyLatestVersion;

    @NameInMap("ProxyRevisionVersion")
    private String proxyRevisionVersion;

    @NameInMap("ProxyVersionStatus")
    private String proxyVersionStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterVersionResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.DBLatestVersion = builder.DBLatestVersion;
        this.DBMinorVersion = builder.DBMinorVersion;
        this.DBRevisionVersion = builder.DBRevisionVersion;
        this.DBRevisionVersionList = builder.DBRevisionVersionList;
        this.DBVersion = builder.DBVersion;
        this.DBVersionStatus = builder.DBVersionStatus;
        this.isLatestVersion = builder.isLatestVersion;
        this.isProxyLatestVersion = builder.isProxyLatestVersion;
        this.proxyLatestVersion = builder.proxyLatestVersion;
        this.proxyRevisionVersion = builder.proxyRevisionVersion;
        this.proxyVersionStatus = builder.proxyVersionStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBLatestVersion
     */
    public String getDBLatestVersion() {
        return this.DBLatestVersion;
    }

    /**
     * @return DBMinorVersion
     */
    public String getDBMinorVersion() {
        return this.DBMinorVersion;
    }

    /**
     * @return DBRevisionVersion
     */
    public String getDBRevisionVersion() {
        return this.DBRevisionVersion;
    }

    /**
     * @return DBRevisionVersionList
     */
    public java.util.List < DBRevisionVersionList> getDBRevisionVersionList() {
        return this.DBRevisionVersionList;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return DBVersionStatus
     */
    public String getDBVersionStatus() {
        return this.DBVersionStatus;
    }

    /**
     * @return isLatestVersion
     */
    public String getIsLatestVersion() {
        return this.isLatestVersion;
    }

    /**
     * @return isProxyLatestVersion
     */
    public String getIsProxyLatestVersion() {
        return this.isProxyLatestVersion;
    }

    /**
     * @return proxyLatestVersion
     */
    public String getProxyLatestVersion() {
        return this.proxyLatestVersion;
    }

    /**
     * @return proxyRevisionVersion
     */
    public String getProxyRevisionVersion() {
        return this.proxyRevisionVersion;
    }

    /**
     * @return proxyVersionStatus
     */
    public String getProxyVersionStatus() {
        return this.proxyVersionStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String DBLatestVersion; 
        private String DBMinorVersion; 
        private String DBRevisionVersion; 
        private java.util.List < DBRevisionVersionList> DBRevisionVersionList; 
        private String DBVersion; 
        private String DBVersionStatus; 
        private String isLatestVersion; 
        private String isProxyLatestVersion; 
        private String proxyLatestVersion; 
        private String proxyRevisionVersion; 
        private String proxyVersionStatus; 
        private String requestId; 

        /**
         * The ID of the cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The latest version of the database engine.
         */
        public Builder DBLatestVersion(String DBLatestVersion) {
            this.DBLatestVersion = DBLatestVersion;
            return this;
        }

        /**
         * The minor version of the database engine.
         * <p>
         * 
         * *   If `DBVersion` is **8.0**, the valid values of this parameter are:
         * 
         *     *   **8.0.2**
         *     *   **8.0.1**
         * 
         * *   If `DBVersion` is **5.7**, set the value of this parameter to **5.7.28**.
         * 
         * *   If `DBVersion` is **5.6**, the value of this parameter is **5.6.16**.
         */
        public Builder DBMinorVersion(String DBMinorVersion) {
            this.DBMinorVersion = DBMinorVersion;
            return this;
        }

        /**
         * The revision version of the database engine.
         * <p>
         * 
         * > For a cluster of the PolarDB for MySQL 5.6, the `DBRevisionVersion` parameter returns the revision version information only if the revision version is released later than August 31, 2020. Otherwise, this parameter returns an empty value. For more information about the kernel version of a cluster that runs the PolarDB for MySQL, see [PolarDB for MySQL](~~423884~~).
         */
        public Builder DBRevisionVersion(String DBRevisionVersion) {
            this.DBRevisionVersion = DBRevisionVersion;
            return this;
        }

        /**
         * 可升级的版本信息列表。
         */
        public Builder DBRevisionVersionList(java.util.List < DBRevisionVersionList> DBRevisionVersionList) {
            this.DBRevisionVersionList = DBRevisionVersionList;
            return this;
        }

        /**
         * The major version of the database engine. Valid values:
         * <p>
         * 
         * *   **8.0**
         * *   **5.7**
         * *   **5.6**
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * The status of the minor version. Valid values:
         * <p>
         * 
         * *   **Stable**: The minor version is stable.
         * *   **Old**: The minor version is outdated. We recommend that you upgrade the cluster to the latest version.
         * *   **HighRisk**: The minor version has critical defects. We recommend that you immediately upgrade the cluster to the latest version.
         * 
         * > For more information about how to upgrade the minor version, see [Upgrade versions](~~158572~~).
         */
        public Builder DBVersionStatus(String DBVersionStatus) {
            this.DBVersionStatus = DBVersionStatus;
            return this;
        }

        /**
         * Indicates whether the kernel version is the latest version. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder isLatestVersion(String isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * Indicates whether PolarProxy is the latest version. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder isProxyLatestVersion(String isProxyLatestVersion) {
            this.isProxyLatestVersion = isProxyLatestVersion;
            return this;
        }

        /**
         * The latest version of PolarProxy.
         */
        public Builder proxyLatestVersion(String proxyLatestVersion) {
            this.proxyLatestVersion = proxyLatestVersion;
            return this;
        }

        /**
         * The version of PolarProxy.
         */
        public Builder proxyRevisionVersion(String proxyRevisionVersion) {
            this.proxyRevisionVersion = proxyRevisionVersion;
            return this;
        }

        /**
         * The status of PolarProxy. Valid values:
         * <p>
         * 
         * *   **Stable**: The minor version is stable.
         * *   **Old**: The minor version is outdated. We recommend that you upgrade the cluster to the latest version.
         * *   **HighRisk**: The minor version has critical defects. We recommend that you immediately upgrade the cluster to the latest version.
         * 
         * > For more information about how to upgrade the PolarProxy version, see [Upgrade versions](~~158572~~).
         */
        public Builder proxyVersionStatus(String proxyVersionStatus) {
            this.proxyVersionStatus = proxyVersionStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterVersionResponseBody build() {
            return new DescribeDBClusterVersionResponseBody(this);
        } 

    } 

    public static class DBRevisionVersionList extends TeaModel {
        @NameInMap("ReleaseNote")
        private String releaseNote;

        @NameInMap("ReleaseType")
        private String releaseType;

        @NameInMap("RevisionVersionCode")
        private String revisionVersionCode;

        @NameInMap("RevisionVersionName")
        private String revisionVersionName;

        private DBRevisionVersionList(Builder builder) {
            this.releaseNote = builder.releaseNote;
            this.releaseType = builder.releaseType;
            this.revisionVersionCode = builder.revisionVersionCode;
            this.revisionVersionName = builder.revisionVersionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBRevisionVersionList create() {
            return builder().build();
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return releaseType
         */
        public String getReleaseType() {
            return this.releaseType;
        }

        /**
         * @return revisionVersionCode
         */
        public String getRevisionVersionCode() {
            return this.revisionVersionCode;
        }

        /**
         * @return revisionVersionName
         */
        public String getRevisionVersionName() {
            return this.revisionVersionName;
        }

        public static final class Builder {
            private String releaseNote; 
            private String releaseType; 
            private String revisionVersionCode; 
            private String revisionVersionName; 

            /**
             * 版本发布说明。
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * 数据库版本发布状态。取值范围如下：
             * <p>
             * * **Stable**：当前版本状态稳定。
             * * **Old**：当前版本过旧，不建议升级到该版本。
             * * **HighRisk**：当前版本有严重缺陷，不建议升级到该版本。
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * 数据库引擎的修订版本Code，用于指定升级到该目标版本。
             */
            public Builder revisionVersionCode(String revisionVersionCode) {
                this.revisionVersionCode = revisionVersionCode;
                return this;
            }

            /**
             * 数据库引擎的修订版本号。
             */
            public Builder revisionVersionName(String revisionVersionName) {
                this.revisionVersionName = revisionVersionName;
                return this;
            }

            public DBRevisionVersionList build() {
                return new DBRevisionVersionList(this);
            } 

        } 

    }
}
