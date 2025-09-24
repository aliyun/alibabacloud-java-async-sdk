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
 * {@link DescribeColdStorageInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeColdStorageInstanceResponseBody</p>
 */
public class DescribeColdStorageInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("OssClusterEnabled")
    private String ossClusterEnabled;

    @com.aliyun.core.annotation.NameInMap("OssClusterInfoList")
    private java.util.List<OssClusterInfoList> ossClusterInfoList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportOssCluster")
    private String supportOssCluster;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private java.util.List<Tables> tables;

    @com.aliyun.core.annotation.NameInMap("TotalRecord")
    private Integer totalRecord;

    private DescribeColdStorageInstanceResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.objectType = builder.objectType;
        this.ossClusterEnabled = builder.ossClusterEnabled;
        this.ossClusterInfoList = builder.ossClusterInfoList;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.supportOssCluster = builder.supportOssCluster;
        this.tables = builder.tables;
        this.totalRecord = builder.totalRecord;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeColdStorageInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return ossClusterEnabled
     */
    public String getOssClusterEnabled() {
        return this.ossClusterEnabled;
    }

    /**
     * @return ossClusterInfoList
     */
    public java.util.List<OssClusterInfoList> getOssClusterInfoList() {
        return this.ossClusterInfoList;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportOssCluster
     */
    public String getSupportOssCluster() {
        return this.supportOssCluster;
    }

    /**
     * @return tables
     */
    public java.util.List<Tables> getTables() {
        return this.tables;
    }

    /**
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return this.totalRecord;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String objectType; 
        private String ossClusterEnabled; 
        private java.util.List<OssClusterInfoList> ossClusterInfoList; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private String supportOssCluster; 
        private java.util.List<Tables> tables; 
        private Integer totalRecord; 

        private Builder() {
        } 

        private Builder(DescribeColdStorageInstanceResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.objectType = model.objectType;
            this.ossClusterEnabled = model.ossClusterEnabled;
            this.ossClusterInfoList = model.ossClusterInfoList;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.supportOssCluster = model.supportOssCluster;
            this.tables = model.tables;
            this.totalRecord = model.totalRecord;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * OssClusterEnabled.
         */
        public Builder ossClusterEnabled(String ossClusterEnabled) {
            this.ossClusterEnabled = ossClusterEnabled;
            return this;
        }

        /**
         * OssClusterInfoList.
         */
        public Builder ossClusterInfoList(java.util.List<OssClusterInfoList> ossClusterInfoList) {
            this.ossClusterInfoList = ossClusterInfoList;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * SupportOssCluster.
         */
        public Builder supportOssCluster(String supportOssCluster) {
            this.supportOssCluster = supportOssCluster;
            return this;
        }

        /**
         * Tables.
         */
        public Builder tables(java.util.List<Tables> tables) {
            this.tables = tables;
            return this;
        }

        /**
         * TotalRecord.
         */
        public Builder totalRecord(Integer totalRecord) {
            this.totalRecord = totalRecord;
            return this;
        }

        public DescribeColdStorageInstanceResponseBody build() {
            return new DescribeColdStorageInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeColdStorageInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeColdStorageInstanceResponseBody</p>
     */
    public static class OssClusterInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("OssClusterId")
        private String ossClusterId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        private OssClusterInfoList(Builder builder) {
            this.createdTime = builder.createdTime;
            this.ossClusterId = builder.ossClusterId;
            this.region = builder.region;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssClusterInfoList create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return ossClusterId
         */
        public String getOssClusterId() {
            return this.ossClusterId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String createdTime; 
            private String ossClusterId; 
            private String region; 
            private String size; 

            private Builder() {
            } 

            private Builder(OssClusterInfoList model) {
                this.createdTime = model.createdTime;
                this.ossClusterId = model.ossClusterId;
                this.region = model.region;
                this.size = model.size;
            } 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * OssClusterId.
             */
            public Builder ossClusterId(String ossClusterId) {
                this.ossClusterId = ossClusterId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public OssClusterInfoList build() {
                return new OssClusterInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeColdStorageInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeColdStorageInstanceResponseBody</p>
     */
    public static class ChildObjects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ChildObjects(Builder builder) {
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
            this.size = builder.size;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildObjects create() {
            return builder().build();
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String objectName; 
            private String objectType; 
            private String size; 
            private String status; 

            private Builder() {
            } 

            private Builder(ChildObjects model) {
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.size = model.size;
                this.status = model.status;
            } 

            /**
             * ObjectName.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ChildObjects build() {
                return new ChildObjects(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeColdStorageInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeColdStorageInstanceResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildObjects")
        private java.util.List<ChildObjects> childObjects;

        @com.aliyun.core.annotation.NameInMap("DB")
        private String db;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("OssClusterId")
        private String ossClusterId;

        @com.aliyun.core.annotation.NameInMap("Partion")
        private String partion;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Tables(Builder builder) {
            this.childObjects = builder.childObjects;
            this.db = builder.db;
            this.DBName = builder.DBName;
            this.fieldName = builder.fieldName;
            this.ossClusterId = builder.ossClusterId;
            this.partion = builder.partion;
            this.size = builder.size;
            this.status = builder.status;
            this.table = builder.table;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return childObjects
         */
        public java.util.List<ChildObjects> getChildObjects() {
            return this.childObjects;
        }

        /**
         * @return db
         */
        public String getDb() {
            return this.db;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return ossClusterId
         */
        public String getOssClusterId() {
            return this.ossClusterId;
        }

        /**
         * @return partion
         */
        public String getPartion() {
            return this.partion;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List<ChildObjects> childObjects; 
            private String db; 
            private String DBName; 
            private String fieldName; 
            private String ossClusterId; 
            private String partion; 
            private String size; 
            private String status; 
            private String table; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.childObjects = model.childObjects;
                this.db = model.db;
                this.DBName = model.DBName;
                this.fieldName = model.fieldName;
                this.ossClusterId = model.ossClusterId;
                this.partion = model.partion;
                this.size = model.size;
                this.status = model.status;
                this.table = model.table;
                this.tableName = model.tableName;
            } 

            /**
             * ChildObjects.
             */
            public Builder childObjects(java.util.List<ChildObjects> childObjects) {
                this.childObjects = childObjects;
                return this;
            }

            /**
             * DB.
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * OssClusterId.
             */
            public Builder ossClusterId(String ossClusterId) {
                this.ossClusterId = ossClusterId;
                return this;
            }

            /**
             * Partion.
             */
            public Builder partion(String partion) {
                this.partion = partion;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
}
