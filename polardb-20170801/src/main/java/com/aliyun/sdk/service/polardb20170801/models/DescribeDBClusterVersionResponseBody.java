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
 * {@link DescribeDBClusterVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterVersionResponseBody</p>
 */
public class DescribeDBClusterVersionResponseBody extends TeaModel {
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
        this.proxyRevisionVersionList = builder.proxyRevisionVersionList;
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

        /**
         * <p>The ID of cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The latest version of the database engine.</p>
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
         * <li>If DBVersion is 8.0, the valid values of this parameter are:<ul>
         * <li>8.0.2</li>
         * <li>8.0.1</li>
         * </ul>
         * </li>
         * <li>If DBVersion is 5.7, set the value of this parameter to 5.7.28.</li>
         * <li>If DBVersion is 5.6, the value of this parameter is 5.6.16.</li>
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
         * <p>The revision version of the database engine.</p>
         * <blockquote>
         * <p>For a cluster of the PolarDB for MySQL 5.6, the DBRevisionVersion parameter returns the revision version information only if the Revision Version is released later than August 31, 2020. Otherwise, this parameter returns an empty value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8.0.1.1.7</p>
         */
        public Builder DBRevisionVersion(String DBRevisionVersion) {
            this.DBRevisionVersion = DBRevisionVersion;
            return this;
        }

        /**
         * <p>The versions to which the cluster can be upgraded.</p>
         */
        public Builder DBRevisionVersionList(java.util.List<DBRevisionVersionList> DBRevisionVersionList) {
            this.DBRevisionVersionList = DBRevisionVersionList;
            return this;
        }

        /**
         * <p>The version of the database engine. Valid values:</p>
         * <ul>
         * <li>5.6</li>
         * <li>5.7</li>
         * <li>8.0</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The status of the minor version. Valid values:</p>
         * <ul>
         * <li><strong>Stable</strong>: The minor version is stable.</li>
         * <li><strong>Old</strong>: The minor version is outdated. We recommend that you upgrade the cluster to the latest version.</li>
         * <li><strong>HighRisk</strong>: The minor version has critical defects. We recommend that you immediately update the cluster to the latest minor version.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about how to update the minor version, see <a href="https://help.aliyun.com/document_detail/158572.html">Minor version update</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Stable</p>
         */
        public Builder DBVersionStatus(String DBVersionStatus) {
            this.DBVersionStatus = DBVersionStatus;
            return this;
        }

        /**
         * <p>Indicates whether the kernel is of the latest version. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>Indicates whether PolarProxy uses the latest version. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The latest version of PolarProxy.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4.17</p>
         */
        public Builder proxyLatestVersion(String proxyLatestVersion) {
            this.proxyLatestVersion = proxyLatestVersion;
            return this;
        }

        /**
         * <p>The revision version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>2.4.15</p>
         */
        public Builder proxyRevisionVersion(String proxyRevisionVersion) {
            this.proxyRevisionVersion = proxyRevisionVersion;
            return this;
        }

        /**
         * <p>The release status of the PolarProxy version. Valid values:</p>
         * <ul>
         * <li><strong>Stable</strong>: The PolarProxy revision version is stable.</li>
         * <li><strong>Old</strong>: The PolarProxy revision version is outdated. We recommend that you do not update the PolarProxy to this revision version.</li>
         * <li><strong>HighRisk</strong>: The PolarProxy revision version has critical defects. We recommend that you do not update the PolarProxy to this revision version.</li>
         * <li><strong>Beta</strong>: The PolarProxy revision version is a Beta version.</li>
         * </ul>
         */
        public Builder proxyRevisionVersionList(java.util.List<ProxyRevisionVersionList> proxyRevisionVersionList) {
            this.proxyRevisionVersionList = proxyRevisionVersionList;
            return this;
        }

        /**
         * <p>The status of PolarProxy. Valid values:</p>
         * <ul>
         * <li>Stable: The minor version is stable.</li>
         * <li>Old: The minor version is outdated. We recommend that you upgrade the cluster to the latest version.</li>
         * <li>HighRisk: The minor version has critical defects. We recommend that you immediately upgrade the cluster to the latest version.</li>
         * <li>Beta: The minor version is a beta version.</li>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>47921222-0D37-4133-8C0D-017DC3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterVersionResponseBody build() {
            return new DescribeDBClusterVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterVersionResponseBody</p>
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

            /**
             * <p>The release notes for the database engine revision version.</p>
             * 
             * <strong>example:</strong>
             * <p>ReleaseNote</p>
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * <p>The release status of the database engine revision version. Valid values:</p>
             * <ul>
             * <li><strong>Stable</strong>: The database engine revision version is stable.</li>
             * <li><strong>Old</strong>: The database engine revision version is outdated. We recommend that you do not update the database engine to this revision version.</li>
             * <li><strong>HighRisk</strong>: The database engine revision version has critical defects. We recommend that you do not update the database engine to this revision version.</li>
             * <li><strong>Beta</strong>: The database engine revision version is a Beta version.</li>
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
             * <p>The code of the database engine revision version. You can use the code to specify the database engine revision version.</p>
             * 
             * <strong>example:</strong>
             * <p>20230707</p>
             */
            public Builder revisionVersionCode(String revisionVersionCode) {
                this.revisionVersionCode = revisionVersionCode;
                return this;
            }

            /**
             * <p>The database engine revision version number.</p>
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
     * {@link DescribeDBClusterVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterVersionResponseBody</p>
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

            /**
             * <p>The release notes for the PolarProxy revision version.</p>
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
             * <li><strong>LTS</strong>: a long-term version</li>
             * <li><strong>BETA</strong>: a preview version</li>
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
             * <p>The PolarProxy revision version code. You can use this code to specify the PolarProxy revision version.</p>
             * 
             * <strong>example:</strong>
             * <p>20230707</p>
             */
            public Builder revisionVersionCode(String revisionVersionCode) {
                this.revisionVersionCode = revisionVersionCode;
                return this;
            }

            /**
             * <p>The PolarProxy revision version number.</p>
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
