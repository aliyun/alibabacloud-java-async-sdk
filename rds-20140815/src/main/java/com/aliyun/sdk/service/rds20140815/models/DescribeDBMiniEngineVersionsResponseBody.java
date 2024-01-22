// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBMiniEngineVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBMiniEngineVersionsResponseBody</p>
 */
public class DescribeDBMiniEngineVersionsResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("MaxRecordsPerPage")
    private Integer maxRecordsPerPage;

    @NameInMap("MinorVersionItems")
    private java.util.List < MinorVersionItems> minorVersionItems;

    @NameInMap("PageNumbers")
    private Integer pageNumbers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDBMiniEngineVersionsResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.maxRecordsPerPage = builder.maxRecordsPerPage;
        this.minorVersionItems = builder.minorVersionItems;
        this.pageNumbers = builder.pageNumbers;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBMiniEngineVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return maxRecordsPerPage
     */
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    /**
     * @return minorVersionItems
     */
    public java.util.List < MinorVersionItems> getMinorVersionItems() {
        return this.minorVersionItems;
    }

    /**
     * @return pageNumbers
     */
    public Integer getPageNumbers() {
        return this.pageNumbers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private Integer maxRecordsPerPage; 
        private java.util.List < MinorVersionItems> minorVersionItems; 
        private Integer pageNumbers; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }

        /**
         * The details of the minor engine version.
         */
        public Builder minorVersionItems(java.util.List < MinorVersionItems> minorVersionItems) {
            this.minorVersionItems = minorVersionItems;
            return this;
        }

        /**
         * The page number returned.
         */
        public Builder pageNumbers(Integer pageNumbers) {
            this.pageNumbers = pageNumbers;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBMiniEngineVersionsResponseBody build() {
            return new DescribeDBMiniEngineVersionsResponseBody(this);
        } 

    } 

    public static class MinorVersionItems extends TeaModel {
        @NameInMap("CommunityMinorVersion")
        private String communityMinorVersion;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ExpireDate")
        private String expireDate;

        @NameInMap("ExpireStatus")
        private String expireStatus;

        @NameInMap("IsHotfixVersion")
        private Boolean isHotfixVersion;

        @NameInMap("MinorVersion")
        private String minorVersion;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("ReleaseNote")
        private String releaseNote;

        @NameInMap("ReleaseType")
        private String releaseType;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("Tag")
        private String tag;

        private MinorVersionItems(Builder builder) {
            this.communityMinorVersion = builder.communityMinorVersion;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireDate = builder.expireDate;
            this.expireStatus = builder.expireStatus;
            this.isHotfixVersion = builder.isHotfixVersion;
            this.minorVersion = builder.minorVersion;
            this.nodeType = builder.nodeType;
            this.releaseNote = builder.releaseNote;
            this.releaseType = builder.releaseType;
            this.statusDesc = builder.statusDesc;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MinorVersionItems create() {
            return builder().build();
        }

        /**
         * @return communityMinorVersion
         */
        public String getCommunityMinorVersion() {
            return this.communityMinorVersion;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return expireStatus
         */
        public String getExpireStatus() {
            return this.expireStatus;
        }

        /**
         * @return isHotfixVersion
         */
        public Boolean getIsHotfixVersion() {
            return this.isHotfixVersion;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
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
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String communityMinorVersion; 
            private String engine; 
            private String engineVersion; 
            private String expireDate; 
            private String expireStatus; 
            private Boolean isHotfixVersion; 
            private String minorVersion; 
            private String nodeType; 
            private String releaseNote; 
            private String releaseType; 
            private String statusDesc; 
            private String tag; 

            /**
             * The PostgreSQL version to which the minor engine version corresponds. For more information, see [Release notes for AliPG](~~126002~~).
             * <p>
             * 
             * >  This parameter is available only for instances that run **PostgreSQL**.
             */
            public Builder communityMinorVersion(String communityMinorVersion) {
                this.communityMinorVersion = communityMinorVersion;
                return this;
            }

            /**
             * The database engine that corresponds to the minor engine version.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version that corresponds to the minor engine version.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The expiration time of the minor engine version.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * The expiration status of the minor engine version. Valid values:
             * <p>
             * 
             * *   **vaild**
             * *   **expired**
             * 
             * >  If the minor engine version is in the Offline state, the minor engine version is discontinued. In this case, ignore the expiration status. If the minor engine version is in the Online state and the expiration state is expired, the minor engine version expires. If the expiration state is vaild, the minor engine version is still in its lifecycle.
             */
            public Builder expireStatus(String expireStatus) {
                this.expireStatus = expireStatus;
                return this;
            }

            /**
             * An internal parameter. You do not need to specify this parameter.
             */
            public Builder isHotfixVersion(Boolean isHotfixVersion) {
                this.isHotfixVersion = isHotfixVersion;
                return this;
            }

            /**
             * The minor engine version.
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * The RDS edition of the instance that runs the minor engine version. Valid values:
             * <p>
             * 
             * *   **Basic**: RDS Basic Edition.
             * *   **HighAvailability**: RDS High-availability Edition.
             * *   **Finance**: RDS Enterprise Edition.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The URL of the release notes for the minor engine version.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * The release type. Valid values:
             * <p>
             * 
             * *   **LTS**: a long-term version
             * *   **BETA**: a preview version
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * The status of the minor engine version. Valid values:
             * <p>
             * 
             * *   **Offline**
             * *   **online**
             * 
             * >  If the minor engine version is in the Offline state, the minor engine version is discontinued. In this case, ignore the expiration status. If the minor engine version is in the Online state and the expiration state is expired, the minor engine version expires. If the expiration state is vaild, the minor engine version is still in its lifecycle.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The tag that corresponds to the minor engine version. Valid values:
             * <p>
             * 
             * *   **pgsql_docker_image**: tag of the common instance
             * *   **pgsql_babelfish_image**: tag of the instance for which Babelfish is enabled
             * 
             * >  This parameter is available only for instances that run **PostgreSQL**.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public MinorVersionItems build() {
                return new MinorVersionItems(this);
            } 

        } 

    }
}
