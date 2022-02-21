// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalDatabaseNetworksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDatabaseNetworksResponseBody</p>
 */
public class DescribeGlobalDatabaseNetworksResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
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
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
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
        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Role")
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
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Role.
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
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBClusters")
        private java.util.List < DBClusters> DBClusters;

        @NameInMap("DBType")
        private String DBType;

        @NameInMap("DBVersion")
        private String DBVersion;

        @NameInMap("GDNDescription")
        private String GDNDescription;

        @NameInMap("GDNId")
        private String GDNId;

        @NameInMap("GDNStatus")
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DBClusters.
             */
            public Builder DBClusters(java.util.List < DBClusters> DBClusters) {
                this.DBClusters = DBClusters;
                return this;
            }

            /**
             * DBType.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * DBVersion.
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * GDNDescription.
             */
            public Builder GDNDescription(String GDNDescription) {
                this.GDNDescription = GDNDescription;
                return this;
            }

            /**
             * GDNId.
             */
            public Builder GDNId(String GDNId) {
                this.GDNId = GDNId;
                return this;
            }

            /**
             * GDNStatus.
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
