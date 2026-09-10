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
         * <p>The maximum number of entries returned. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token to retrieve the next page of results. If this parameter is not returned, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>c2FpXzIwMjIwNjI5X2Jhay9zYWlfc3VtbWVyX3RyZWFzdXJlX3Bvb2xfbG9nLkNTVg==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The object type.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>Indicates whether the OSS bucket is enabled.</p>
         * <ul>
         * <li><p><strong>true</strong>: enabled</p>
         * </li>
         * <li><p><strong>false</strong>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ossClusterEnabled(String ossClusterEnabled) {
            this.ossClusterEnabled = ossClusterEnabled;
            return this;
        }

        /**
         * <p>The list of OSS addresses for the cold storage instances.</p>
         */
        public Builder ossClusterInfoList(java.util.List<OssClusterInfoList> ossClusterInfoList) {
            this.ossClusterInfoList = ossClusterInfoList;
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
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7A8EA8E-A140-5226-90D7-5BCB304D3DB6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the cluster supports cold storage. If the cluster does not support cold storage, the switch is not displayed on the console.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportOssCluster(String supportOssCluster) {
            this.supportOssCluster = supportOssCluster;
            return this;
        }

        /**
         * <p>The list of cold storage instances.</p>
         */
        public Builder tables(java.util.List<Tables> tables) {
            this.tables = tables;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-10T17:01:16Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The ID of the cold storage instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-*****************</p>
             */
            public Builder ossClusterId(String ossClusterId) {
                this.ossClusterId = ossClusterId;
                return this;
            }

            /**
             * <p>The ID of the region where the task is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The size of the cold storage table. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
             * <p>The object name.</p>
             * 
             * <strong>example:</strong>
             * <p>img/1728554006462.png</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>The object type.</p>
             * 
             * <strong>example:</strong>
             * <p>File</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The disk size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><p><strong>Scheduled</strong>: The task is waiting to be executed.</p>
             * </li>
             * <li><p><strong>Running</strong>: The task is in progress.</p>
             * </li>
             * <li><p><strong>Succeed</strong>: The task is successful.</p>
             * </li>
             * <li><p><strong>Cancelling</strong>: The task is being stopped.</p>
             * </li>
             * <li><p><strong>Canceled</strong>: The task is stopped.</p>
             * </li>
             * <li><p><strong>Waiting</strong>: The task is waiting for a preset time.</p>
             * </li>
             * </ul>
             * <p>To query multiple statuses, separate them with commas (,). If you do not specify this parameter, all statuses are queried.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
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
             * <p>The list of child objects.</p>
             */
            public Builder childObjects(java.util.List<ChildObjects> childObjects) {
                this.childObjects = childObjects;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db</p>
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The name of the large object (LOB) field.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>The ID of the OSS-based cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-*****************</p>
             */
            public Builder ossClusterId(String ossClusterId) {
                this.ossClusterId = ossClusterId;
                return this;
            }

            /**
             * <p>The partition of the cold storage instance.</p>
             * 
             * <strong>example:</strong>
             * <p>202509</p>
             */
            public Builder partion(String partion) {
                this.partion = partion;
                return this;
            }

            /**
             * <p>The disk size of the cold storage instance. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The status of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_table</p>
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
