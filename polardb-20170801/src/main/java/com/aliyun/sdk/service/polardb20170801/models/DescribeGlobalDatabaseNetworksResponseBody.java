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
 * {@link DescribeGlobalDatabaseNetworksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDatabaseNetworksResponseBody</p>
 */
public class DescribeGlobalDatabaseNetworksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeGlobalDatabaseNetworksResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalDatabaseNetworksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeGlobalDatabaseNetworksResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>Details about the GDNs.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>69A85BAF-1089-4CDF-A82F-0A140F******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeGlobalDatabaseNetworksResponseBody build() {
            return new DescribeGlobalDatabaseNetworksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGlobalDatabaseNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDatabaseNetworksResponseBody</p>
     */
    public static class DBClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private DBClusters(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.regionId = builder.regionId;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusters create() {
            return builder().build();
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String DBClusterId; 
            private String regionId; 
            private String role; 

            private Builder() {
            } 

            private Builder(DBClusters model) {
                this.DBClusterId = model.DBClusterId;
                this.regionId = model.regionId;
                this.role = model.role;
            } 

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-****************</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The region ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The role of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>Primary</strong>: the primary cluster</li>
             * <li><strong>standby</strong>: the secondary cluster</li>
             * </ul>
             * <blockquote>
             * <p>A GDN consists of one primary cluster and up to four secondary clusters. For more information, see <a href="https://help.aliyun.com/document_detail/160381.html">GDN</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>primary</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public DBClusters build() {
                return new DBClusters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalDatabaseNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDatabaseNetworksResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GDNVersion")
        private String GDNVersion;

        private Labels(Builder builder) {
            this.GDNVersion = builder.GDNVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return GDNVersion
         */
        public String getGDNVersion() {
            return this.GDNVersion;
        }

        public static final class Builder {
            private String GDNVersion; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.GDNVersion = model.GDNVersion;
            } 

            /**
             * GDNVersion.
             */
            public Builder GDNVersion(String GDNVersion) {
                this.GDNVersion = GDNVersion;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalDatabaseNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDatabaseNetworksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusters")
        private java.util.List<DBClusters> DBClusters;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("GDNDescription")
        private String GDNDescription;

        @com.aliyun.core.annotation.NameInMap("GDNId")
        private String GDNId;

        @com.aliyun.core.annotation.NameInMap("GDNStatus")
        private String GDNStatus;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private Labels labels;

        private Items(Builder builder) {
            this.createTime = builder.createTime;
            this.DBClusters = builder.DBClusters;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.GDNDescription = builder.GDNDescription;
            this.GDNId = builder.GDNId;
            this.GDNStatus = builder.GDNStatus;
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBClusters
         */
        public java.util.List<DBClusters> getDBClusters() {
            return this.DBClusters;
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return DBVersion
         */
        public String getDBVersion() {
            return this.DBVersion;
        }

        /**
         * @return GDNDescription
         */
        public String getGDNDescription() {
            return this.GDNDescription;
        }

        /**
         * @return GDNId
         */
        public String getGDNId() {
            return this.GDNId;
        }

        /**
         * @return GDNStatus
         */
        public String getGDNStatus() {
            return this.GDNStatus;
        }

        /**
         * @return labels
         */
        public Labels getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List<DBClusters> DBClusters; 
            private String DBType; 
            private String DBVersion; 
            private String GDNDescription; 
            private String GDNId; 
            private String GDNStatus; 
            private Labels labels; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.createTime = model.createTime;
                this.DBClusters = model.DBClusters;
                this.DBType = model.DBType;
                this.DBVersion = model.DBVersion;
                this.GDNDescription = model.GDNDescription;
                this.GDNId = model.GDNId;
                this.GDNStatus = model.GDNStatus;
                this.labels = model.labels;
            } 

            /**
             * <p>The time when the GDN was created. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-03-23T05:46:54Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Details about clusters in the GDN.</p>
             */
            public Builder DBClusters(java.util.List<DBClusters> DBClusters) {
                this.DBClusters = DBClusters;
                return this;
            }

            /**
             * <p>The type of the database engine. Only <strong>MySQL</strong> is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * <p>The version of the database engine. Only the <strong>8.0</strong> version is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * <p>The description of the GDN. The description must meet the following requirements:</p>
             * <ul>
             * <li>It cannot start with <code>http://</code> or <code>https://</code>.</li>
             * <li>It must start with a letter.</li>
             * <li>It can contain letters, digits, underscores (_), and hyphens (-).</li>
             * <li>It must be 2 to 126 characters in length.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder GDNDescription(String GDNDescription) {
                this.GDNDescription = GDNDescription;
                return this;
            }

            /**
             * <p>The ID of the GDN.</p>
             * 
             * <strong>example:</strong>
             * <p>gdn-****************</p>
             */
            public Builder GDNId(String GDNId) {
                this.GDNId = GDNId;
                return this;
            }

            /**
             * <p>The status of the GDN. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The GDN is being created.</li>
             * <li><strong>active</strong>: The GDN is running.</li>
             * <li><strong>deleting</strong>: The GDN is being deleted.</li>
             * <li><strong>locked</strong>: The GDN is locked. If the GDN is locked, you cannot perform operations on clusters in the GDN.</li>
             * <li><strong>removing_member</strong>: The secondary cluster is being removed from the GDN.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder GDNStatus(String GDNStatus) {
                this.GDNStatus = GDNStatus;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(Labels labels) {
                this.labels = labels;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
