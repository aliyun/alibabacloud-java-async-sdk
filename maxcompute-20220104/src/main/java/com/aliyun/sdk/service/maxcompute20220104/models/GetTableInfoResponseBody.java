// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetTableInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableInfoResponseBody</p>
 */
public class GetTableInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetTableInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTableInfoResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0a06dd4516687375802853481ec9fd</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTableInfoResponseBody build() {
            return new GetTableInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTableInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableInfoResponseBody</p>
     */
    public static class SortCols extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("order")
        private String order;

        private SortCols(Builder builder) {
            this.name = builder.name;
            this.order = builder.order;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SortCols create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return order
         */
        public String getOrder() {
            return this.order;
        }

        public static final class Builder {
            private String name; 
            private String order; 

            private Builder() {
            } 

            private Builder(SortCols model) {
                this.name = model.name;
                this.order = model.order;
            } 

            /**
             * <p>The name of the sorting field.</p>
             * 
             * <strong>example:</strong>
             * <p>col_2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The sorting order.</p>
             * 
             * <strong>example:</strong>
             * <p>DESC</p>
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            public SortCols build() {
                return new SortCols(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableInfoResponseBody</p>
     */
    public static class ClusterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketNum")
        private Long bucketNum;

        @com.aliyun.core.annotation.NameInMap("clusterCols")
        private java.util.List<String> clusterCols;

        @com.aliyun.core.annotation.NameInMap("clusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("sortCols")
        private java.util.List<SortCols> sortCols;

        private ClusterInfo(Builder builder) {
            this.bucketNum = builder.bucketNum;
            this.clusterCols = builder.clusterCols;
            this.clusterType = builder.clusterType;
            this.sortCols = builder.sortCols;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfo create() {
            return builder().build();
        }

        /**
         * @return bucketNum
         */
        public Long getBucketNum() {
            return this.bucketNum;
        }

        /**
         * @return clusterCols
         */
        public java.util.List<String> getClusterCols() {
            return this.clusterCols;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return sortCols
         */
        public java.util.List<SortCols> getSortCols() {
            return this.sortCols;
        }

        public static final class Builder {
            private Long bucketNum; 
            private java.util.List<String> clusterCols; 
            private String clusterType; 
            private java.util.List<SortCols> sortCols; 

            private Builder() {
            } 

            private Builder(ClusterInfo model) {
                this.bucketNum = model.bucketNum;
                this.clusterCols = model.clusterCols;
                this.clusterType = model.clusterType;
                this.sortCols = model.sortCols;
            } 

            /**
             * <p>Optional. The number of buckets in the clustered table. The value 0 indicates that the number of buckets dynamically changes when a job is running.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder bucketNum(Long bucketNum) {
                this.bucketNum = bucketNum;
                return this;
            }

            /**
             * <p>The cluster keys.</p>
             */
            public Builder clusterCols(java.util.List<String> clusterCols) {
                this.clusterCols = clusterCols;
                return this;
            }

            /**
             * <p>The clustering type of the table. MaxCompute supports <a href="https://www.alibabacloud.com/help/maxcompute/use-cases/hash-clustering">hash clustering</a> and</p>
             * <p><a href="https://www.alibabacloud.com/help/maxcompute/use-cases/range-clustering">range clustering</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Hash</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The condition by which the results are sorted.</p>
             */
            public Builder sortCols(java.util.List<SortCols> sortCols) {
                this.sortCols = sortCols;
                return this;
            }

            public ClusterInfo build() {
                return new ClusterInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableInfoResponseBody</p>
     */
    public static class NativeColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private NativeColumns(Builder builder) {
            this.comment = builder.comment;
            this.label = builder.label;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NativeColumns create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comment; 
            private String label; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(NativeColumns model) {
                this.comment = model.comment;
                this.label = model.label;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The column comments.</p>
             * 
             * <strong>example:</strong>
             * <p>The name of shop.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The sensitivity-level label of the column. For more information, see <a href="https://www.alibabacloud.com/help/maxcompute/user-guide/label-based-access-control">Label-based access control</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>shop_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The column type.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NativeColumns build() {
                return new NativeColumns(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableInfoResponseBody</p>
     */
    public static class PartitionColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PartitionColumns(Builder builder) {
            this.comment = builder.comment;
            this.label = builder.label;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartitionColumns create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comment; 
            private String label; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(PartitionColumns model) {
                this.comment = model.comment;
                this.label = model.label;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The comments of the partition key column.</p>
             * 
             * <strong>example:</strong>
             * <p>Sale date.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The sensitivity-level label of the column. For more information, see <a href="https://www.alibabacloud.com/help/maxcompute/user-guide/label-based-access-control">Label-based access control</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The partition name.</p>
             * 
             * <strong>example:</strong>
             * <p>sale_date</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The partition column type.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PartitionColumns build() {
                return new PartitionColumns(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoRefreshEnabled")
        private Boolean autoRefreshEnabled;

        @com.aliyun.core.annotation.NameInMap("clusterInfo")
        private ClusterInfo clusterInfo;

        @com.aliyun.core.annotation.NameInMap("comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("createTableDDL")
        private String createTableDDL;

        @com.aliyun.core.annotation.NameInMap("creationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("fileNum")
        private Long fileNum;

        @com.aliyun.core.annotation.NameInMap("isExternalTable")
        private Boolean isExternalTable;

        @com.aliyun.core.annotation.NameInMap("isOutdated")
        private Boolean isOutdated;

        @com.aliyun.core.annotation.NameInMap("lastAccessTime")
        private Long lastAccessTime;

        @com.aliyun.core.annotation.NameInMap("lastDDLTime")
        private Long lastDDLTime;

        @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
        private Long lastModifiedTime;

        @com.aliyun.core.annotation.NameInMap("lifecycle")
        private String lifecycle;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("materializedView")
        private Boolean materializedView;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nativeColumns")
        private java.util.List<NativeColumns> nativeColumns;

        @com.aliyun.core.annotation.NameInMap("odpsPropertiesRolearn")
        private String odpsPropertiesRolearn;

        @com.aliyun.core.annotation.NameInMap("odpsSqlTextOptionFlushHeader")
        private Boolean odpsSqlTextOptionFlushHeader;

        @com.aliyun.core.annotation.NameInMap("odpsTextOptionHeaderLinesCount")
        private Long odpsTextOptionHeaderLinesCount;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("partitionColumns")
        private java.util.List<PartitionColumns> partitionColumns;

        @com.aliyun.core.annotation.NameInMap("physicalSize")
        private Long physicalSize;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("rewriteEnabled")
        private Boolean rewriteEnabled;

        @com.aliyun.core.annotation.NameInMap("schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("storageHandler")
        private String storageHandler;

        @com.aliyun.core.annotation.NameInMap("tableLabel")
        private String tableLabel;

        @com.aliyun.core.annotation.NameInMap("tablesotreTableName")
        private String tablesotreTableName;

        @com.aliyun.core.annotation.NameInMap("tablestoreColumnsMapping")
        private String tablestoreColumnsMapping;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("viewText")
        private String viewText;

        private Data(Builder builder) {
            this.autoRefreshEnabled = builder.autoRefreshEnabled;
            this.clusterInfo = builder.clusterInfo;
            this.comment = builder.comment;
            this.createTableDDL = builder.createTableDDL;
            this.creationTime = builder.creationTime;
            this.displayName = builder.displayName;
            this.fileNum = builder.fileNum;
            this.isExternalTable = builder.isExternalTable;
            this.isOutdated = builder.isOutdated;
            this.lastAccessTime = builder.lastAccessTime;
            this.lastDDLTime = builder.lastDDLTime;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.lifecycle = builder.lifecycle;
            this.location = builder.location;
            this.materializedView = builder.materializedView;
            this.name = builder.name;
            this.nativeColumns = builder.nativeColumns;
            this.odpsPropertiesRolearn = builder.odpsPropertiesRolearn;
            this.odpsSqlTextOptionFlushHeader = builder.odpsSqlTextOptionFlushHeader;
            this.odpsTextOptionHeaderLinesCount = builder.odpsTextOptionHeaderLinesCount;
            this.owner = builder.owner;
            this.partitionColumns = builder.partitionColumns;
            this.physicalSize = builder.physicalSize;
            this.projectName = builder.projectName;
            this.rewriteEnabled = builder.rewriteEnabled;
            this.schema = builder.schema;
            this.size = builder.size;
            this.storageHandler = builder.storageHandler;
            this.tableLabel = builder.tableLabel;
            this.tablesotreTableName = builder.tablesotreTableName;
            this.tablestoreColumnsMapping = builder.tablestoreColumnsMapping;
            this.type = builder.type;
            this.viewText = builder.viewText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoRefreshEnabled
         */
        public Boolean getAutoRefreshEnabled() {
            return this.autoRefreshEnabled;
        }

        /**
         * @return clusterInfo
         */
        public ClusterInfo getClusterInfo() {
            return this.clusterInfo;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTableDDL
         */
        public String getCreateTableDDL() {
            return this.createTableDDL;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return fileNum
         */
        public Long getFileNum() {
            return this.fileNum;
        }

        /**
         * @return isExternalTable
         */
        public Boolean getIsExternalTable() {
            return this.isExternalTable;
        }

        /**
         * @return isOutdated
         */
        public Boolean getIsOutdated() {
            return this.isOutdated;
        }

        /**
         * @return lastAccessTime
         */
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        /**
         * @return lastDDLTime
         */
        public Long getLastDDLTime() {
            return this.lastDDLTime;
        }

        /**
         * @return lastModifiedTime
         */
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return lifecycle
         */
        public String getLifecycle() {
            return this.lifecycle;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return materializedView
         */
        public Boolean getMaterializedView() {
            return this.materializedView;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nativeColumns
         */
        public java.util.List<NativeColumns> getNativeColumns() {
            return this.nativeColumns;
        }

        /**
         * @return odpsPropertiesRolearn
         */
        public String getOdpsPropertiesRolearn() {
            return this.odpsPropertiesRolearn;
        }

        /**
         * @return odpsSqlTextOptionFlushHeader
         */
        public Boolean getOdpsSqlTextOptionFlushHeader() {
            return this.odpsSqlTextOptionFlushHeader;
        }

        /**
         * @return odpsTextOptionHeaderLinesCount
         */
        public Long getOdpsTextOptionHeaderLinesCount() {
            return this.odpsTextOptionHeaderLinesCount;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return partitionColumns
         */
        public java.util.List<PartitionColumns> getPartitionColumns() {
            return this.partitionColumns;
        }

        /**
         * @return physicalSize
         */
        public Long getPhysicalSize() {
            return this.physicalSize;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return rewriteEnabled
         */
        public Boolean getRewriteEnabled() {
            return this.rewriteEnabled;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return storageHandler
         */
        public String getStorageHandler() {
            return this.storageHandler;
        }

        /**
         * @return tableLabel
         */
        public String getTableLabel() {
            return this.tableLabel;
        }

        /**
         * @return tablesotreTableName
         */
        public String getTablesotreTableName() {
            return this.tablesotreTableName;
        }

        /**
         * @return tablestoreColumnsMapping
         */
        public String getTablestoreColumnsMapping() {
            return this.tablestoreColumnsMapping;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return viewText
         */
        public String getViewText() {
            return this.viewText;
        }

        public static final class Builder {
            private Boolean autoRefreshEnabled; 
            private ClusterInfo clusterInfo; 
            private String comment; 
            private String createTableDDL; 
            private Long creationTime; 
            private String displayName; 
            private Long fileNum; 
            private Boolean isExternalTable; 
            private Boolean isOutdated; 
            private Long lastAccessTime; 
            private Long lastDDLTime; 
            private Long lastModifiedTime; 
            private String lifecycle; 
            private String location; 
            private Boolean materializedView; 
            private String name; 
            private java.util.List<NativeColumns> nativeColumns; 
            private String odpsPropertiesRolearn; 
            private Boolean odpsSqlTextOptionFlushHeader; 
            private Long odpsTextOptionHeaderLinesCount; 
            private String owner; 
            private java.util.List<PartitionColumns> partitionColumns; 
            private Long physicalSize; 
            private String projectName; 
            private Boolean rewriteEnabled; 
            private String schema; 
            private Long size; 
            private String storageHandler; 
            private String tableLabel; 
            private String tablesotreTableName; 
            private String tablestoreColumnsMapping; 
            private String type; 
            private String viewText; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoRefreshEnabled = model.autoRefreshEnabled;
                this.clusterInfo = model.clusterInfo;
                this.comment = model.comment;
                this.createTableDDL = model.createTableDDL;
                this.creationTime = model.creationTime;
                this.displayName = model.displayName;
                this.fileNum = model.fileNum;
                this.isExternalTable = model.isExternalTable;
                this.isOutdated = model.isOutdated;
                this.lastAccessTime = model.lastAccessTime;
                this.lastDDLTime = model.lastDDLTime;
                this.lastModifiedTime = model.lastModifiedTime;
                this.lifecycle = model.lifecycle;
                this.location = model.location;
                this.materializedView = model.materializedView;
                this.name = model.name;
                this.nativeColumns = model.nativeColumns;
                this.odpsPropertiesRolearn = model.odpsPropertiesRolearn;
                this.odpsSqlTextOptionFlushHeader = model.odpsSqlTextOptionFlushHeader;
                this.odpsTextOptionHeaderLinesCount = model.odpsTextOptionHeaderLinesCount;
                this.owner = model.owner;
                this.partitionColumns = model.partitionColumns;
                this.physicalSize = model.physicalSize;
                this.projectName = model.projectName;
                this.rewriteEnabled = model.rewriteEnabled;
                this.schema = model.schema;
                this.size = model.size;
                this.storageHandler = model.storageHandler;
                this.tableLabel = model.tableLabel;
                this.tablesotreTableName = model.tablesotreTableName;
                this.tablestoreColumnsMapping = model.tablestoreColumnsMapping;
                this.type = model.type;
                this.viewText = model.viewText;
            } 

            /**
             * <p>Indicates whether the materialized view is automatically refreshed. This response parameter is returned when type is set to materializedView.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRefreshEnabled(Boolean autoRefreshEnabled) {
                this.autoRefreshEnabled = autoRefreshEnabled;
                return this;
            }

            /**
             * <p>The clustering attribute. This response parameter is returned when the table is a clustered table.</p>
             */
            public Builder clusterInfo(ClusterInfo clusterInfo) {
                this.clusterInfo = clusterInfo;
                return this;
            }

            /**
             * <p>The comments of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>sale_detail</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>DDL statement to create a table.</p>
             * 
             * <strong>example:</strong>
             * <p>create table if not exists sale_detail( shop_name STRING, customer_id STRING, total_price DOUBLE) partitioned by (sale_date STRING, region STRING);</p>
             */
            public Builder createTableDDL(String createTableDDL) {
                this.createTableDDL = createTableDDL;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-17T07:07:47Z</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>project_name.schema_name.table_name</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The number of file of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder fileNum(Long fileNum) {
                this.fileNum = fileNum;
                return this;
            }

            /**
             * <p>Indicates whether the table is an external table. This response parameter is returned when type is set to external.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isExternalTable(Boolean isExternalTable) {
                this.isExternalTable = isExternalTable;
                return this;
            }

            /**
             * <p>Indicates whether data of the materialized view is invalid due to changes in the data of the source table. This response parameter is returned when type is set to materializedView.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isOutdated(Boolean isOutdated) {
                this.isOutdated = isOutdated;
                return this;
            }

            /**
             * <p>The time when data of the table or view was last accessed.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-21T02:05:56Z</p>
             */
            public Builder lastAccessTime(Long lastAccessTime) {
                this.lastAccessTime = lastAccessTime;
                return this;
            }

            /**
             * <p>The time when the data definition language (DDL) statement of the table or view was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-21T02:05:56Z</p>
             */
            public Builder lastDDLTime(Long lastDDLTime) {
                this.lastDDLTime = lastDDLTime;
                return this;
            }

            /**
             * <p>The time when data of the table or view was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-21T02:05:56Z</p>
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * <p>The lifecycle. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder lifecycle(String lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * <p>The path of the external table. This response parameter is returned when type is set to external.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://oss-cn-hangzhou-internal.aliyuncs.com/oss-mc-test/Demo1/</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>Indicates whether the table or view is a <a href="https://www.alibabacloud.com/help/maxcompute/user-guide/materialized-view-operations">materialize view</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder materializedView(Boolean materializedView) {
                this.materializedView = materializedView;
                return this;
            }

            /**
             * <p>The name of the table or view.</p>
             * 
             * <strong>example:</strong>
             * <p>sale_detail</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The field information.</p>
             */
            public Builder nativeColumns(java.util.List<NativeColumns> nativeColumns) {
                this.nativeColumns = nativeColumns;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the role AliyunODPSDefaultRole in Resource Access Management (RAM). This response parameter is returned when type is set to external.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::xxxxx:role/aliyunodpsdefaultrole</p>
             */
            public Builder odpsPropertiesRolearn(String odpsPropertiesRolearn) {
                this.odpsPropertiesRolearn = odpsPropertiesRolearn;
                return this;
            }

            /**
             * <p>Indicates whether the table header is ignored. This response parameter is returned when type is set to external.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder odpsSqlTextOptionFlushHeader(Boolean odpsSqlTextOptionFlushHeader) {
                this.odpsSqlTextOptionFlushHeader = odpsSqlTextOptionFlushHeader;
                return this;
            }

            /**
             * <p>The first N rows that were ignored in the table header. This response parameter is returned when type is set to external.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder odpsTextOptionHeaderLinesCount(Long odpsTextOptionHeaderLinesCount) {
                this.odpsTextOptionHeaderLinesCount = odpsTextOptionHeaderLinesCount;
                return this;
            }

            /**
             * <p>The account information of the table or view owner.</p>
             * 
             * <strong>example:</strong>
             * <p>188785396123****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The information about partition key columns. This response parameter is returned only for partitioned tables.</p>
             */
            public Builder partitionColumns(java.util.List<PartitionColumns> partitionColumns) {
                this.partitionColumns = partitionColumns;
                return this;
            }

            /**
             * <p>The physical size of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>2763</p>
             */
            public Builder physicalSize(Long physicalSize) {
                this.physicalSize = physicalSize;
                return this;
            }

            /**
             * <p>The name of the project to which the table or view belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>projectA</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>Indicates whether the query rewrite operation can be performed by using the materialized view. This response parameter is returned when type is set to materializedView.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder rewriteEnabled(Boolean rewriteEnabled) {
                this.rewriteEnabled = rewriteEnabled;
                return this;
            }

            /**
             * <p>The name of the schema to which the table or the view belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The data size of the non-partitioned table. If the table is a partitioned table, the system does not calculate the data size of the table. In this case, the value of this parameter is NULL. The PARTITIONS view includes the data size of each partition in a partitioned table. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>5372</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The storage handler of the external table. This response parameter is returned when type is set to external.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliyun.odps.CsvStorageHandler</p>
             */
            public Builder storageHandler(String storageHandler) {
                this.storageHandler = storageHandler;
                return this;
            }

            /**
             * <p>The sensitivity-level label of the table. For more information, see <a href="https://www.alibabacloud.com/help/maxcompute/user-guide/label-based-access-control">Label-based access control</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tableLabel(String tableLabel) {
                this.tableLabel = tableLabel;
                return this;
            }

            /**
             * <p>The name of the Tablestore table to be accessed. This response parameter is returned when type is set to external.</p>
             * 
             * <strong>example:</strong>
             * <p>ots_tpch_orders</p>
             */
            public Builder tablesotreTableName(String tablesotreTableName) {
                this.tablesotreTableName = tablesotreTableName;
                return this;
            }

            /**
             * <p>The columns of the Tablestore table to be accessed, including the primary key column and attribute column. This response parameter is returned when type is set to external.</p>
             * 
             * <strong>example:</strong>
             * <p>:o_orderkey,:o_orderdate,o_custkey,o_orderstatus,o_totalprice</p>
             */
            public Builder tablestoreColumnsMapping(String tablestoreColumnsMapping) {
                this.tablestoreColumnsMapping = tablestoreColumnsMapping;
                return this;
            }

            /**
             * <p>The type of the table or view. Valid values:</p>
             * <ul>
             * <li><strong>internal</strong>: internal table</li>
             * <li><strong>external</strong>: external table</li>
             * <li><strong>view</strong>: view</li>
             * <li><strong>materializedView</strong>: <a href="https://www.alibabacloud.com/help/maxcompute/user-guide/materialized-view-operations">materialize view</a></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>internal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The statement that generates the view. This response parameter is returned when type is set to view.</p>
             * 
             * <strong>example:</strong>
             * <p>select shop_name, sum(total_price) from sale_detail group by shop_name</p>
             */
            public Builder viewText(String viewText) {
                this.viewText = viewText;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
