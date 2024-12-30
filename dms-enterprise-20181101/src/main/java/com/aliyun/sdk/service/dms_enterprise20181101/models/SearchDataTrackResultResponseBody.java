// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link SearchDataTrackResultResponseBody} extends {@link TeaModel}
 *
 * <p>SearchDataTrackResultResponseBody</p>
 */
public class SearchDataTrackResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TrackResult")
    private TrackResult trackResult;

    private SearchDataTrackResultResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.trackResult = builder.trackResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchDataTrackResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return trackResult
     */
    public TrackResult getTrackResult() {
        return this.trackResult;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private TrackResult trackResult; 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The parsing result of the data tracking task.</p>
         */
        public Builder trackResult(TrackResult trackResult) {
            this.trackResult = trackResult;
            return this;
        }

        public SearchDataTrackResultResponseBody build() {
            return new SearchDataTrackResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchDataTrackResultResponseBody} extends {@link TeaModel}
     *
     * <p>SearchDataTrackResultResponseBody</p>
     */
    public static class EventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataAfter")
        private java.util.List<String> dataAfter;

        @com.aliyun.core.annotation.NameInMap("DataBefore")
        private java.util.List<String> dataBefore;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private Long eventId;

        @com.aliyun.core.annotation.NameInMap("EventLength")
        private Long eventLength;

        @com.aliyun.core.annotation.NameInMap("EventTimestamp")
        private String eventTimestamp;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("RollSQL")
        private String rollSQL;

        private EventList(Builder builder) {
            this.dataAfter = builder.dataAfter;
            this.dataBefore = builder.dataBefore;
            this.eventId = builder.eventId;
            this.eventLength = builder.eventLength;
            this.eventTimestamp = builder.eventTimestamp;
            this.eventType = builder.eventType;
            this.rollSQL = builder.rollSQL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return dataAfter
         */
        public java.util.List<String> getDataAfter() {
            return this.dataAfter;
        }

        /**
         * @return dataBefore
         */
        public java.util.List<String> getDataBefore() {
            return this.dataBefore;
        }

        /**
         * @return eventId
         */
        public Long getEventId() {
            return this.eventId;
        }

        /**
         * @return eventLength
         */
        public Long getEventLength() {
            return this.eventLength;
        }

        /**
         * @return eventTimestamp
         */
        public String getEventTimestamp() {
            return this.eventTimestamp;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return rollSQL
         */
        public String getRollSQL() {
            return this.rollSQL;
        }

        public static final class Builder {
            private java.util.List<String> dataAfter; 
            private java.util.List<String> dataBefore; 
            private Long eventId; 
            private Long eventLength; 
            private String eventTimestamp; 
            private String eventType; 
            private String rollSQL; 

            /**
             * <p>The data records after you perform data operations in the database.</p>
             */
            public Builder dataAfter(java.util.List<String> dataAfter) {
                this.dataAfter = dataAfter;
                return this;
            }

            /**
             * <p>The data records before you perform data operations in the database.</p>
             */
            public Builder dataBefore(java.util.List<String> dataBefore) {
                this.dataBefore = dataBefore;
                return this;
            }

            /**
             * <p>The ID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eventId(Long eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The length of the event content. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>4324</p>
             */
            public Builder eventLength(Long eventLength) {
                this.eventLength = eventLength;
                return this;
            }

            /**
             * <p>The event time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-23 10:25:47</p>
             */
            public Builder eventTimestamp(String eventTimestamp) {
                this.eventTimestamp = eventTimestamp;
                return this;
            }

            /**
             * <p>The type of the event. Valid values:</p>
             * <ul>
             * <li><strong>WRITE_ROWS</strong>: indicates an INSERT operation.</li>
             * <li><strong>UPDATE_ROWS</strong>: indicates an UPDATE operation.</li>
             * <li><strong>DELETE_ROWS</strong>: indicates a DELETE operation.</li>
             * <li><strong>EXT_WRITE_ROWS</strong>: indicates an INSERT operation, which is equivalent to WRITE_ROWS.</li>
             * <li><strong>EXT_UPDATE_ROWS</strong>: indicates an UPDATE operation, which is equivalent to UPDATE_ROWS.</li>
             * <li><strong>EXT_DELETE_ROWS</strong>: indicates a DELETE operation, which is equivalent to DELETE_ROWS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UPDATE_ROWS</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The SQL statements used to roll back the data change.</p>
             * 
             * <strong>example:</strong>
             * <p>-- Timestamp:2023-04-23 10:25:47 #1\r\nUPDATE <code>dc_test</code>.<code>tb_chunk_dml</code> SET <code>id</code>=1 , <code>gmt_create</code>=&quot;2021-09-30T00:00:00&quot; , <code>content</code>=&quot;2023-03-30 14:51:50&quot; , <code>c1</code>=&quot;2023-04-17 13:42:03&quot; , <code>c_id</code>=1 , <code>c13425</code>=&quot;b\&quot;&quot; , <code>c432532535</code>= null , <code>c1432</code>= null , <code>c143243253</code>= null , <code>c1432535</code>= null , <code>c43125325</code>= null , <code>c3425325</code>= null WHERE  (<code>id</code>=1)&quot;</p>
             */
            public Builder rollSQL(String rollSQL) {
                this.rollSQL = rollSQL;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchDataTrackResultResponseBody} extends {@link TeaModel}
     *
     * <p>SearchDataTrackResultResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnPosition")
        private Integer columnPosition;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("Fictive")
        private Boolean fictive;

        private Columns(Builder builder) {
            this.columnName = builder.columnName;
            this.columnPosition = builder.columnPosition;
            this.columnType = builder.columnType;
            this.fictive = builder.fictive;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnPosition
         */
        public Integer getColumnPosition() {
            return this.columnPosition;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        /**
         * @return fictive
         */
        public Boolean getFictive() {
            return this.fictive;
        }

        public static final class Builder {
            private String columnName; 
            private Integer columnPosition; 
            private String columnType; 
            private Boolean fictive; 

            /**
             * <p>The name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>basic_platform</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The position of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder columnPosition(Integer columnPosition) {
                this.columnPosition = columnPosition;
                return this;
            }

            /**
             * <p>The data type of the column. Examples: BIGINT, INT, and VARCHAR.</p>
             * 
             * <strong>example:</strong>
             * <p>BIGINT</p>
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * <p>Indicates whether the column is a virtual column. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder fictive(Boolean fictive) {
                this.fictive = fictive;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchDataTrackResultResponseBody} extends {@link TeaModel}
     *
     * <p>SearchDataTrackResultResponseBody</p>
     */
    public static class TableInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<Columns> columns;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private TableInfoList(Builder builder) {
            this.columns = builder.columns;
            this.description = builder.description;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableInfoList create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<Columns> getColumns() {
            return this.columns;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List<Columns> columns; 
            private String description; 
            private String schemaName; 
            private String tableName; 

            /**
             * <p>The information about columns.</p>
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The description of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>auto-description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>prod_eb_vas</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>import_table_test1</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableInfoList build() {
                return new TableInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchDataTrackResultResponseBody} extends {@link TeaModel}
     *
     * <p>SearchDataTrackResultResponseBody</p>
     */
    public static class TrackResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventList")
        private java.util.List<EventList> eventList;

        @com.aliyun.core.annotation.NameInMap("TableInfoList")
        private java.util.List<TableInfoList> tableInfoList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private TrackResult(Builder builder) {
            this.eventList = builder.eventList;
            this.tableInfoList = builder.tableInfoList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrackResult create() {
            return builder().build();
        }

        /**
         * @return eventList
         */
        public java.util.List<EventList> getEventList() {
            return this.eventList;
        }

        /**
         * @return tableInfoList
         */
        public java.util.List<TableInfoList> getTableInfoList() {
            return this.tableInfoList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<EventList> eventList; 
            private java.util.List<TableInfoList> tableInfoList; 
            private Long totalCount; 

            /**
             * <p>The details of the event logs.</p>
             */
            public Builder eventList(java.util.List<EventList> eventList) {
                this.eventList = eventList;
                return this;
            }

            /**
             * <p>The metadata of tables for which you track data operations.</p>
             */
            public Builder tableInfoList(java.util.List<TableInfoList> tableInfoList) {
                this.tableInfoList = tableInfoList;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>109</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public TrackResult build() {
                return new TrackResult(this);
            } 

        } 

    }
}
