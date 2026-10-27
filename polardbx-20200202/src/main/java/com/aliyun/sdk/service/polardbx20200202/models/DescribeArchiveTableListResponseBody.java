// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeArchiveTableListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeArchiveTableListResponseBody</p>
 */
public class DescribeArchiveTableListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeArchiveTableListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeArchiveTableListResponseBody create() {
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

        private Builder(DescribeArchiveTableListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>1A6D328C-84B8-40DC-BF49-6C73984D7494</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeArchiveTableListResponseBody build() {
            return new DescribeArchiveTableListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeArchiveTableListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeArchiveTableListResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveStatus")
        private String archiveStatus;

        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private Long createdDate;

        @com.aliyun.core.annotation.NameInMap("FileCount")
        private Integer fileCount;

        @com.aliyun.core.annotation.NameInMap("LastSuccessArchiveTime")
        private Long lastSuccessArchiveTime;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SpaceSize")
        private Double spaceSize;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Tables(Builder builder) {
            this.archiveStatus = builder.archiveStatus;
            this.createdDate = builder.createdDate;
            this.fileCount = builder.fileCount;
            this.lastSuccessArchiveTime = builder.lastSuccessArchiveTime;
            this.schemaName = builder.schemaName;
            this.spaceSize = builder.spaceSize;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return archiveStatus
         */
        public String getArchiveStatus() {
            return this.archiveStatus;
        }

        /**
         * @return createdDate
         */
        public Long getCreatedDate() {
            return this.createdDate;
        }

        /**
         * @return fileCount
         */
        public Integer getFileCount() {
            return this.fileCount;
        }

        /**
         * @return lastSuccessArchiveTime
         */
        public Long getLastSuccessArchiveTime() {
            return this.lastSuccessArchiveTime;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return spaceSize
         */
        public Double getSpaceSize() {
            return this.spaceSize;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String archiveStatus; 
            private Long createdDate; 
            private Integer fileCount; 
            private Long lastSuccessArchiveTime; 
            private String schemaName; 
            private Double spaceSize; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.archiveStatus = model.archiveStatus;
                this.createdDate = model.createdDate;
                this.fileCount = model.fileCount;
                this.lastSuccessArchiveTime = model.lastSuccessArchiveTime;
                this.schemaName = model.schemaName;
                this.spaceSize = model.spaceSize;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The archiving status. Valid values: SUCCESS, PAUSE, and RUNNING.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder archiveStatus(String archiveStatus) {
                this.archiveStatus = archiveStatus;
                return this;
            }

            /**
             * <p>The time when the table was created.</p>
             */
            public Builder createdDate(Long createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * <p>The number of files.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fileCount(Integer fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * <p>The time of the last successful archiving.</p>
             */
            public Builder lastSuccessArchiveTime(Long lastSuccessArchiveTime) {
                this.lastSuccessArchiveTime = lastSuccessArchiveTime;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The amount of storage space used.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder spaceSize(Double spaceSize) {
                this.spaceSize = spaceSize;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link DescribeArchiveTableListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeArchiveTableListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageIndex")
        private Long pageIndex;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("PausedCount")
        private Integer pausedCount;

        @com.aliyun.core.annotation.NameInMap("RunningCount")
        private Integer runningCount;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<Tables> tables;

        @com.aliyun.core.annotation.NameInMap("TobeArchivedConut")
        private Integer tobeArchivedConut;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.pausedCount = builder.pausedCount;
            this.runningCount = builder.runningCount;
            this.successCount = builder.successCount;
            this.tables = builder.tables;
            this.tobeArchivedConut = builder.tobeArchivedConut;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageIndex
         */
        public Long getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pausedCount
         */
        public Integer getPausedCount() {
            return this.pausedCount;
        }

        /**
         * @return runningCount
         */
        public Integer getRunningCount() {
            return this.runningCount;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return tables
         */
        public java.util.List<Tables> getTables() {
            return this.tables;
        }

        /**
         * @return tobeArchivedConut
         */
        public Integer getTobeArchivedConut() {
            return this.tobeArchivedConut;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long pageIndex; 
            private Long pageSize; 
            private Integer pausedCount; 
            private Integer runningCount; 
            private Integer successCount; 
            private java.util.List<Tables> tables; 
            private Integer tobeArchivedConut; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageIndex = model.pageIndex;
                this.pageSize = model.pageSize;
                this.pausedCount = model.pausedCount;
                this.runningCount = model.runningCount;
                this.successCount = model.successCount;
                this.tables = model.tables;
                this.tobeArchivedConut = model.tobeArchivedConut;
                this.total = model.total;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The number of tables in the PAUSE state.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pausedCount(Integer pausedCount) {
                this.pausedCount = pausedCount;
                return this;
            }

            /**
             * <p>The number of tables being archived.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder runningCount(Integer runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * <p>The number of successfully archived tables.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>The list of archived tables.</p>
             */
            public Builder tables(java.util.List<Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The number of tables to be archived.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tobeArchivedConut(Integer tobeArchivedConut) {
                this.tobeArchivedConut = tobeArchivedConut;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
