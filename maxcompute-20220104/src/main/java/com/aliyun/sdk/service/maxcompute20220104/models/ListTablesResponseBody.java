// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTablesResponseBody</p>
 */
public class ListTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListTablesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablesResponseBody create() {
        return builder().build();
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

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTablesResponseBody build() {
            return new ListTablesResponseBody(this);
        } 

    } 

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

            /**
             * The remarks.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The security level of the column.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The name of the column.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the column.
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

            /**
             * The remarks.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The security level of the partition column.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The name of the partition column.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the partition column.
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
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoRefreshEnabled")
        private Boolean autoRefreshEnabled;

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
        private java.util.List < NativeColumns> nativeColumns;

        @com.aliyun.core.annotation.NameInMap("odpsPropertiesRolearn")
        private String odpsPropertiesRolearn;

        @com.aliyun.core.annotation.NameInMap("odpsSqlTextOptionFlushHeader")
        private Boolean odpsSqlTextOptionFlushHeader;

        @com.aliyun.core.annotation.NameInMap("odpsTextOptionHeaderLinesCount")
        private Long odpsTextOptionHeaderLinesCount;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("partitionColumns")
        private java.util.List < PartitionColumns> partitionColumns;

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

        @com.aliyun.core.annotation.NameInMap("tableComment")
        private String tableComment;

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

        private Tables(Builder builder) {
            this.autoRefreshEnabled = builder.autoRefreshEnabled;
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
            this.tableComment = builder.tableComment;
            this.tableLabel = builder.tableLabel;
            this.tablesotreTableName = builder.tablesotreTableName;
            this.tablestoreColumnsMapping = builder.tablestoreColumnsMapping;
            this.type = builder.type;
            this.viewText = builder.viewText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return autoRefreshEnabled
         */
        public Boolean getAutoRefreshEnabled() {
            return this.autoRefreshEnabled;
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
        public java.util.List < NativeColumns> getNativeColumns() {
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
        public java.util.List < PartitionColumns> getPartitionColumns() {
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
         * @return tableComment
         */
        public String getTableComment() {
            return this.tableComment;
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
            private java.util.List < NativeColumns> nativeColumns; 
            private String odpsPropertiesRolearn; 
            private Boolean odpsSqlTextOptionFlushHeader; 
            private Long odpsTextOptionHeaderLinesCount; 
            private String owner; 
            private java.util.List < PartitionColumns> partitionColumns; 
            private Long physicalSize; 
            private String projectName; 
            private Boolean rewriteEnabled; 
            private String schema; 
            private Long size; 
            private String storageHandler; 
            private String tableComment; 
            private String tableLabel; 
            private String tablesotreTableName; 
            private String tablestoreColumnsMapping; 
            private String type; 
            private String viewText; 

            /**
             * Indicates whether to enable the scheduled update feature for the materialized view.
             */
            public Builder autoRefreshEnabled(Boolean autoRefreshEnabled) {
                this.autoRefreshEnabled = autoRefreshEnabled;
                return this;
            }

            /**
             * The DDL statement that is used to create the table.
             */
            public Builder createTableDDL(String createTableDDL) {
                this.createTableDDL = createTableDDL;
                return this;
            }

            /**
             * The time when the table was created.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The display name of the table.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The number of files.
             */
            public Builder fileNum(Long fileNum) {
                this.fileNum = fileNum;
                return this;
            }

            /**
             * Indicates whether the table is an external table.
             */
            public Builder isExternalTable(Boolean isExternalTable) {
                this.isExternalTable = isExternalTable;
                return this;
            }

            /**
             * Indicates whether the data in the materialized view is invalid due to data changes in the source table.
             */
            public Builder isOutdated(Boolean isOutdated) {
                this.isOutdated = isOutdated;
                return this;
            }

            /**
             * The time when the data was last accessed.
             */
            public Builder lastAccessTime(Long lastAccessTime) {
                this.lastAccessTime = lastAccessTime;
                return this;
            }

            /**
             * The last time when the DDL statement of the table was updated.
             */
            public Builder lastDDLTime(Long lastDDLTime) {
                this.lastDDLTime = lastDDLTime;
                return this;
            }

            /**
             * The time when the data was last updated.
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * The lifecycle of the table.
             */
            public Builder lifecycle(String lifecycle) {
                this.lifecycle = lifecycle;
                return this;
            }

            /**
             * The storage location of the external table.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Indicates whether a materialized view is created.
             */
            public Builder materializedView(Boolean materializedView) {
                this.materializedView = materializedView;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The information about columns.
             */
            public Builder nativeColumns(java.util.List < NativeColumns> nativeColumns) {
                this.nativeColumns = nativeColumns;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of AliyunODPSDefaultRole in Resource Access Management (RAM).
             */
            public Builder odpsPropertiesRolearn(String odpsPropertiesRolearn) {
                this.odpsPropertiesRolearn = odpsPropertiesRolearn;
                return this;
            }

            /**
             * Indicates whether to ignore the table header.
             */
            public Builder odpsSqlTextOptionFlushHeader(Boolean odpsSqlTextOptionFlushHeader) {
                this.odpsSqlTextOptionFlushHeader = odpsSqlTextOptionFlushHeader;
                return this;
            }

            /**
             * Indicates whether to ignore the first N rows of the table header.
             */
            public Builder odpsTextOptionHeaderLinesCount(Long odpsTextOptionHeaderLinesCount) {
                this.odpsTextOptionHeaderLinesCount = odpsTextOptionHeaderLinesCount;
                return this;
            }

            /**
             * The owner of the table.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The information about the partition column.
             */
            public Builder partitionColumns(java.util.List < PartitionColumns> partitionColumns) {
                this.partitionColumns = partitionColumns;
                return this;
            }

            /**
             * The physical size of the table.
             */
            public Builder physicalSize(Long physicalSize) {
                this.physicalSize = physicalSize;
                return this;
            }

            /**
             * The name of the project.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * Indicates whether to enable the query rewrite operation that is performed based on the materialized view.
             */
            public Builder rewriteEnabled(Boolean rewriteEnabled) {
                this.rewriteEnabled = rewriteEnabled;
                return this;
            }

            /**
             * The schema to which the table belongs.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * The size of the table.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The extractor of the external table.
             */
            public Builder storageHandler(String storageHandler) {
                this.storageHandler = storageHandler;
                return this;
            }

            /**
             * The description of the table.
             */
            public Builder tableComment(String tableComment) {
                this.tableComment = tableComment;
                return this;
            }

            /**
             * The security level of the table.
             */
            public Builder tableLabel(String tableLabel) {
                this.tableLabel = tableLabel;
                return this;
            }

            /**
             * The name of the Tablestore table that you want MaxCompute to access.
             */
            public Builder tablesotreTableName(String tablesotreTableName) {
                this.tablesotreTableName = tablesotreTableName;
                return this;
            }

            /**
             * The columns of the Tablestore table that you want MaxCompute to access. The columns include primary key columns and attribute columns.
             */
            public Builder tablestoreColumnsMapping(String tablestoreColumnsMapping) {
                this.tablestoreColumnsMapping = tablestoreColumnsMapping;
                return this;
            }

            /**
             * The type of the table.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The statement that is used to generate the view.
             */
            public Builder viewText(String viewText) {
                this.viewText = viewText;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("marker")
        private String marker;

        @com.aliyun.core.annotation.NameInMap("maxItem")
        private Integer maxItem;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.List < Tables> tables;

        private Data(Builder builder) {
            this.marker = builder.marker;
            this.maxItem = builder.maxItem;
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return marker
         */
        public String getMarker() {
            return this.marker;
        }

        /**
         * @return maxItem
         */
        public Integer getMaxItem() {
            return this.maxItem;
        }

        /**
         * @return tables
         */
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private String marker; 
            private Integer maxItem; 
            private java.util.List < Tables> tables; 

            /**
             * Indicates the marker after which the returned list begins.
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * The maximum number of entries returned per page.
             */
            public Builder maxItem(Integer maxItem) {
                this.maxItem = maxItem;
                return this;
            }

            /**
             * The information about tables.
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
