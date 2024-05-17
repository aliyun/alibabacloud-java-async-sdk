// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalDatabaseNetworksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDatabaseNetworksResponseBody</p>
 */
public class DescribeGlobalDatabaseNetworksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

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

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
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
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * Details about the GDNs.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of records on the current page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * The total number of returned entries.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeGlobalDatabaseNetworksResponseBody build() {
            return new DescribeGlobalDatabaseNetworksResponseBody(this);
        } 

    } 

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

            /**
             * The ID of the cluster.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The region ID of the cluster.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The role of the cluster. Valid values:
             * <p>
             * 
             * *   **Primary**: the primary cluster
             * *   **standby**: the secondary cluster
             * 
             * > A GDN consists of one primary cluster and up to four secondary clusters. For more information, see [GDN](~~160381~~).
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
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusters")
        private java.util.List < DBClusters> DBClusters;

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

        private Items(Builder builder) {
            this.createTime = builder.createTime;
            this.DBClusters = builder.DBClusters;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.GDNDescription = builder.GDNDescription;
            this.GDNId = builder.GDNId;
            this.GDNStatus = builder.GDNStatus;
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
        public java.util.List < DBClusters> getDBClusters() {
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

        public static final class Builder {
            private String createTime; 
            private java.util.List < DBClusters> DBClusters; 
            private String DBType; 
            private String DBVersion; 
            private String GDNDescription; 
            private String GDNId; 
            private String GDNStatus; 

            /**
             * The time when the GDN was created. The time is in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Details about clusters in the GDN.
             */
            public Builder DBClusters(java.util.List < DBClusters> DBClusters) {
                this.DBClusters = DBClusters;
                return this;
            }

            /**
             * The type of the database engine. Only **MySQL** is supported.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * The version of the database engine. Only the **8.0** version is supported.
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * The description of the GDN. The description must meet the following requirements:
             * <p>
             * 
             * *   It cannot start with `http://` or `https://`.
             * *   It must start with a letter.
             * *   It can contain letters, digits, underscores (\_), and hyphens (-).
             * *   It must be 2 to 126 characters in length.
             */
            public Builder GDNDescription(String GDNDescription) {
                this.GDNDescription = GDNDescription;
                return this;
            }

            /**
             * The ID of the GDN.
             */
            public Builder GDNId(String GDNId) {
                this.GDNId = GDNId;
                return this;
            }

            /**
             * The status of the GDN. Valid values:
             * <p>
             * 
             * *   **Creating**: The GDN is being created.
             * *   **active**: The GDN is running.
             * *   **deleting**: The GDN is being deleted.
             * *   **locked**: The GDN is locked. If the GDN is locked, you cannot perform operations on clusters in the GDN.
             * *   **removing_member**: The secondary cluster is being removed from the GDN.
             */
            public Builder GDNStatus(String GDNStatus) {
                this.GDNStatus = GDNStatus;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
