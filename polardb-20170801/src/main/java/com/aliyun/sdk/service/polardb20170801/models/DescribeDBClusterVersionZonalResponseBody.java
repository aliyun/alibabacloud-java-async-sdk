// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterVersionZonalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterVersionZonalResponseBody</p>
 */
public class DescribeDBClusterVersionZonalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBLatestVersion")
    private String DBLatestVersion;

    @com.aliyun.core.annotation.NameInMap("DBMinorVersion")
    private String DBMinorVersion;

    @com.aliyun.core.annotation.NameInMap("DBRevisionVersion")
    private String DBRevisionVersion;

    @com.aliyun.core.annotation.NameInMap("DBRevisionVersionList")
    private java.util.List<DBRevisionVersionList> DBRevisionVersionList;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("DBVersionStatus")
    private String DBVersionStatus;

    @com.aliyun.core.annotation.NameInMap("IsLatestVersion")
    private String isLatestVersion;

    @com.aliyun.core.annotation.NameInMap("IsProxyLatestVersion")
    private String isProxyLatestVersion;

    @com.aliyun.core.annotation.NameInMap("ProxyLatestVersion")
    private String proxyLatestVersion;

    @com.aliyun.core.annotation.NameInMap("ProxyRevisionVersion")
    private String proxyRevisionVersion;

    @com.aliyun.core.annotation.NameInMap("ProxyRevisionVersionList")
    private java.util.List<ProxyRevisionVersionList> proxyRevisionVersionList;

    @com.aliyun.core.annotation.NameInMap("ProxyVersionStatus")
    private String proxyVersionStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterVersionZonalResponseBody(Builder builder) {
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
        this.proxyRevisionVersionList = builder.proxyRevisionVersionList;
        this.proxyVersionStatus = builder.proxyVersionStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterVersionZonalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<DBRevisionVersionList> getDBRevisionVersionList() {
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
     * @return proxyRevisionVersionList
     */
    public java.util.List<ProxyRevisionVersionList> getProxyRevisionVersionList() {
        return this.proxyRevisionVersionList;
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
        private java.util.List<DBRevisionVersionList> DBRevisionVersionList; 
        private String DBVersion; 
        private String DBVersionStatus; 
        private String isLatestVersion; 
        private String isProxyLatestVersion; 
        private String proxyLatestVersion; 
        private String proxyRevisionVersion; 
        private java.util.List<ProxyRevisionVersionList> proxyRevisionVersionList; 
        private String proxyVersionStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterVersionZonalResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.DBLatestVersion = model.DBLatestVersion;
            this.DBMinorVersion = model.DBMinorVersion;
            this.DBRevisionVersion = model.DBRevisionVersion;
            this.DBRevisionVersionList = model.DBRevisionVersionList;
            this.DBVersion = model.DBVersion;
            this.DBVersionStatus = model.DBVersionStatus;
            this.isLatestVersion = model.isLatestVersion;
            this.isProxyLatestVersion = model.isProxyLatestVersion;
            this.proxyLatestVersion = model.proxyLatestVersion;
            this.proxyRevisionVersion = model.proxyRevisionVersion;
            this.proxyRevisionVersionList = model.proxyRevisionVersionList;
            this.proxyVersionStatus = model.proxyVersionStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The latest version of the database kernel.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0.1.1.16</p>
         */
        public Builder DBLatestVersion(String DBLatestVersion) {
            this.DBLatestVersion = DBLatestVersion;
            return this;
        }

        /**
         * <p>The minor version of the database engine.</p>
         * <ul>
         * <li><p>If <code>DBVersion</code> is <strong>8.0</strong>, the valid values are:</p>
         * <ul>
         * <li><p><strong>8.0.2</strong></p>
         * </li>
         * <li><p><strong>8.0.1</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <code>DBVersion</code> is <strong>5.7</strong>, the value is <strong>5.7.28</strong>.</p>
         * </li>
         * <li><p>If <code>DBVersion</code> is <strong>5.6</strong>, the value is <strong>5.6.16</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8.0.1</p>
         */
        public Builder DBMinorVersion(String DBMinorVersion) {
            this.DBMinorVersion = DBMinorVersion;
            return this;
        }

        /**
         * <p>The patch version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0.1.1.7</p>
         */
        public Builder DBRevisionVersion(String DBRevisionVersion) {
            this.DBRevisionVersion = DBRevisionVersion;
            return this;
        }

        /**
         * <p>The list of upgradable versions.</p>
         */
        public Builder DBRevisionVersionList(java.util.List<DBRevisionVersionList> DBRevisionVersionList) {
            this.DBRevisionVersionList = DBRevisionVersionList;
            return this;
        }

        /**
         * <p>The major version of the database engine. Valid values:</p>
         * <ul>
         * <li><p>8.0</p>
         * </li>
         * <li><p>5.7</p>
         * </li>
         * <li><p>5.6</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The status of the current minor version of the database. Valid values:</p>
         * <ul>
         * <li><p>Stable: The current version is stable.</p>
         * </li>
         * <li><p>Old: The current version is outdated. Upgrade to the latest version.</p>
         * </li>
         * <li><p>HighRisk: The current version has critical bugs. Upgrade to the latest version immediately.</p>
         * </li>
         * <li><p>Beta: The current version is a beta version.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stable</p>
         */
        public Builder DBVersionStatus(String DBVersionStatus) {
            this.DBVersionStatus = DBVersionStatus;
            return this;
        }

        /**
         * <p>Indicates whether the current database kernel version is the latest version. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isLatestVersion(String isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * <p>Indicates whether the current database proxy version is the latest version. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isProxyLatestVersion(String isProxyLatestVersion) {
            this.isProxyLatestVersion = isProxyLatestVersion;
            return this;
        }

        /**
         * <p>The latest version of the database proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4.17</p>
         */
        public Builder proxyLatestVersion(String proxyLatestVersion) {
            this.proxyLatestVersion = proxyLatestVersion;
            return this;
        }

        /**
         * <p>The version of the database proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4.15</p>
         */
        public Builder proxyRevisionVersion(String proxyRevisionVersion) {
            this.proxyRevisionVersion = proxyRevisionVersion;
            return this;
        }

        /**
         * <p>The list of upgradable database proxy versions.</p>
         * <ul>
         * <li><p><strong>Stable</strong>: The current version is stable.</p>
         * </li>
         * <li><p><strong>Old</strong>: The current version is outdated. Do not upgrade to this version.</p>
         * </li>
         * <li><p><strong>HighRisk</strong>: The current version has critical bugs. Do not upgrade to this version.</p>
         * </li>
         * <li><p><strong>Beta</strong>: The current version is a beta version.</p>
         * </li>
         * </ul>
         */
        public Builder proxyRevisionVersionList(java.util.List<ProxyRevisionVersionList> proxyRevisionVersionList) {
            this.proxyRevisionVersionList = proxyRevisionVersionList;
            return this;
        }

        /**
         * <p>The status of the database proxy version. Valid values:</p>
         * <ul>
         * <li><p>Stable: The current version is stable.</p>
         * </li>
         * <li><p>Old: The current version is outdated. Upgrade to the latest version.</p>
         * </li>
         * <li><p>HighRisk: The current version has critical bugs. Upgrade to the latest version immediately.</p>
         * </li>
         * <li><p>Beta: The current version is a beta version.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stable</p>
         */
        public Builder proxyVersionStatus(String proxyVersionStatus) {
            this.proxyVersionStatus = proxyVersionStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>47921222-0D37-4133-8C0D-017DC3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterVersionZonalResponseBody build() {
            return new DescribeDBClusterVersionZonalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterVersionZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterVersionZonalResponseBody</p>
     */
    public static class DBRevisionVersionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("ReleaseType")
        private String releaseType;

        @com.aliyun.core.annotation.NameInMap("RevisionVersionCode")
        private String revisionVersionCode;

        @com.aliyun.core.annotation.NameInMap("RevisionVersionName")
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

            private Builder() {
            } 

            private Builder(DBRevisionVersionList model) {
                this.releaseNote = model.releaseNote;
                this.releaseType = model.releaseType;
                this.revisionVersionCode = model.revisionVersionCode;
                this.revisionVersionName = model.revisionVersionName;
            } 

            /**
             * <p>The release notes.</p>
             * 
             * <strong>example:</strong>
             * <p>ReleaseNote</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * <p>The release status of the database version. Valid values:</p>
             * <ul>
             * <li><p><strong>Stable</strong>: The current version is stable.</p>
             * </li>
             * <li><p><strong>Old</strong>: The current version is outdated. Do not upgrade to this version.</p>
             * </li>
             * <li><p><strong>HighRisk</strong>: The current version has critical bugs. Do not upgrade to this version.</p>
             * </li>
             * <li><p><strong>Beta</strong>: The current version is a beta version.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Stable</p>
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * <p>The code of the patch version for the database engine. Use this code to specify the target version for an upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>20230707</p>
             */
            public Builder revisionVersionCode(String revisionVersionCode) {
                this.revisionVersionCode = revisionVersionCode;
                return this;
            }

            /**
             * <p>The patch version of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0.1.1.35.1</p>
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
    /**
     * 
     * {@link DescribeDBClusterVersionZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterVersionZonalResponseBody</p>
     */
    public static class ProxyRevisionVersionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("ReleaseType")
        private String releaseType;

        @com.aliyun.core.annotation.NameInMap("RevisionVersionCode")
        private String revisionVersionCode;

        @com.aliyun.core.annotation.NameInMap("RevisionVersionName")
        private String revisionVersionName;

        private ProxyRevisionVersionList(Builder builder) {
            this.releaseNote = builder.releaseNote;
            this.releaseType = builder.releaseType;
            this.revisionVersionCode = builder.revisionVersionCode;
            this.revisionVersionName = builder.revisionVersionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyRevisionVersionList create() {
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

            private Builder() {
            } 

            private Builder(ProxyRevisionVersionList model) {
                this.releaseNote = model.releaseNote;
                this.releaseType = model.releaseType;
                this.revisionVersionCode = model.revisionVersionCode;
                this.revisionVersionName = model.revisionVersionName;
            } 

            /**
             * <p>The release notes.</p>
             * 
             * <strong>example:</strong>
             * <p>ReleaseNote</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * <p>The release type. Valid values:</p>
             * <ul>
             * <li><p><strong>LTS</strong>: Long-Term Support (LTS) version.</p>
             * </li>
             * <li><p><strong>BETA</strong>: Preview version.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LTS</p>
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * <p>The code of the patch version for the database proxy. Use this code to specify the target version for an upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>20230707</p>
             */
            public Builder revisionVersionCode(String revisionVersionCode) {
                this.revisionVersionCode = revisionVersionCode;
                return this;
            }

            /**
             * <p>The patch version of the database proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>2.8.24</p>
             */
            public Builder revisionVersionName(String revisionVersionName) {
                this.revisionVersionName = revisionVersionName;
                return this;
            }

            public ProxyRevisionVersionList build() {
                return new ProxyRevisionVersionList(this);
            } 

        } 

    }
}
