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
 * {@link DescribeDBMiniEngineVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBMiniEngineVersionsResponseBody</p>
 */
public class DescribeDBMiniEngineVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("MaxRecordsPerPage")
    private Integer maxRecordsPerPage;

    @com.aliyun.core.annotation.NameInMap("MinorVersionItems")
    private java.util.List<MinorVersionItems> minorVersionItems;

    @com.aliyun.core.annotation.NameInMap("PageNumbers")
    private Integer pageNumbers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<MinorVersionItems> getMinorVersionItems() {
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
        private java.util.List<MinorVersionItems> minorVersionItems; 
        private Integer pageNumbers; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }

        /**
         * <p>The details of the minor engine version.</p>
         */
        public Builder minorVersionItems(java.util.List<MinorVersionItems> minorVersionItems) {
            this.minorVersionItems = minorVersionItems;
            return this;
        }

        /**
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumbers(Integer pageNumbers) {
            this.pageNumbers = pageNumbers;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EFB6083A-7699-489B-8278-C0CB4793A96E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBMiniEngineVersionsResponseBody build() {
            return new DescribeDBMiniEngineVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBMiniEngineVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBMiniEngineVersionsResponseBody</p>
     */
    public static class MinorVersionItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommunityMinorVersion")
        private String communityMinorVersion;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("ExpireStatus")
        private String expireStatus;

        @com.aliyun.core.annotation.NameInMap("IsHotfixVersion")
        private Boolean isHotfixVersion;

        @com.aliyun.core.annotation.NameInMap("MinorVersion")
        private String minorVersion;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("ReleaseNote")
        private String releaseNote;

        @com.aliyun.core.annotation.NameInMap("ReleaseType")
        private String releaseType;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("Tag")
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
             * <p>The PostgreSQL version to which the minor engine version corresponds. For more information, see <a href="https://help.aliyun.com/document_detail/126002.html">Release notes for AliPG</a>.</p>
             * <blockquote>
             * <p> This parameter is available only for instances that run <strong>PostgreSQL</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>13.6</p>
             */
            public Builder communityMinorVersion(String communityMinorVersion) {
                this.communityMinorVersion = communityMinorVersion;
                return this;
            }

            /**
             * <p>The database engine that corresponds to the minor engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version that corresponds to the minor engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The expiration time of the minor engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>20231213</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The expiration status of the minor engine version. Valid values:</p>
             * <ul>
             * <li><strong>vaild</strong></li>
             * <li><strong>expired</strong></li>
             * </ul>
             * <blockquote>
             * <p> If the minor engine version is in the Offline state, the minor engine version is discontinued. In this case, ignore the expiration status. If the minor engine version is in the Online state and the expiration state is expired, the minor engine version expires. If the expiration state is vaild, the minor engine version is still in its lifecycle.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vaild</p>
             */
            public Builder expireStatus(String expireStatus) {
                this.expireStatus = expireStatus;
                return this;
            }

            /**
             * <p>An internal parameter. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isHotfixVersion(Boolean isHotfixVersion) {
                this.isHotfixVersion = isHotfixVersion;
                return this;
            }

            /**
             * <p>The minor engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>rds_20220731</p>
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
                return this;
            }

            /**
             * <p>The RDS edition of the instance that runs the minor engine version. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong>: RDS Basic Edition</li>
             * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
             * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HighAvailability</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The URL of the release notes for the minor engine version.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com">https://example.com</a></p>
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
             * <p>BETA</p>
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * <p>The status of the minor engine version. Valid values:</p>
             * <ul>
             * <li><strong>Offline</strong>: discontinued</li>
             * <li><strong>Online</strong>: available</li>
             * </ul>
             * <blockquote>
             * <p> If the minor engine version is in the Offline state, the minor engine version is discontinued. In this case, ignore the expiration status. If the minor engine version is in the Online state and the expiration state is expired, the minor engine version expires. If the expiration state is vaild, the minor engine version is still in its lifecycle.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The tag that corresponds to the minor engine version. Valid values:</p>
             * <ul>
             * <li><strong>pgsql_docker_image</strong>: tag of common instances</li>
             * <li><strong>pgsql_babelfish_image</strong>: tag of instances for which Babelfish is enabled</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is available only for instances that run <strong>PostgreSQL</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pgsql_babelfish_image</p>
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
