// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchDataTrackResultResponseBody} extends {@link TeaModel}
 *
 * <p>SearchDataTrackResultResponseBody</p>
 */
public class SearchDataTrackResultResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TrackResult")
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TrackResult.
         */
        public Builder trackResult(TrackResult trackResult) {
            this.trackResult = trackResult;
            return this;
        }

        public SearchDataTrackResultResponseBody build() {
            return new SearchDataTrackResultResponseBody(this);
        } 

    } 

    public static class EventList extends TeaModel {
        @NameInMap("DataAfter")
        private java.util.List < String > dataAfter;

        @NameInMap("DataBefore")
        private java.util.List < String > dataBefore;

        @NameInMap("EventId")
        private Long eventId;

        @NameInMap("EventLength")
        private Long eventLength;

        @NameInMap("EventTimestamp")
        private String eventTimestamp;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("RollSQL")
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
        public java.util.List < String > getDataAfter() {
            return this.dataAfter;
        }

        /**
         * @return dataBefore
         */
        public java.util.List < String > getDataBefore() {
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
            private java.util.List < String > dataAfter; 
            private java.util.List < String > dataBefore; 
            private Long eventId; 
            private Long eventLength; 
            private String eventTimestamp; 
            private String eventType; 
            private String rollSQL; 

            /**
             * DataAfter.
             */
            public Builder dataAfter(java.util.List < String > dataAfter) {
                this.dataAfter = dataAfter;
                return this;
            }

            /**
             * DataBefore.
             */
            public Builder dataBefore(java.util.List < String > dataBefore) {
                this.dataBefore = dataBefore;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(Long eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventLength.
             */
            public Builder eventLength(Long eventLength) {
                this.eventLength = eventLength;
                return this;
            }

            /**
             * EventTimestamp.
             */
            public Builder eventTimestamp(String eventTimestamp) {
                this.eventTimestamp = eventTimestamp;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * RollSQL.
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
    public static class Columns extends TeaModel {
        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("ColumnPosition")
        private Integer columnPosition;

        @NameInMap("ColumnType")
        private String columnType;

        @NameInMap("Fictive")
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
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * ColumnPosition.
             */
            public Builder columnPosition(Integer columnPosition) {
                this.columnPosition = columnPosition;
                return this;
            }

            /**
             * ColumnType.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * Fictive.
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
    public static class TableInfoList extends TeaModel {
        @NameInMap("Columns")
        private java.util.List < Columns> columns;

        @NameInMap("Description")
        private String description;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("TableName")
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
        public java.util.List < Columns> getColumns() {
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
            private java.util.List < Columns> columns; 
            private String description; 
            private String schemaName; 
            private String tableName; 

            /**
             * Columns.
             */
            public Builder columns(java.util.List < Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * TableName.
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
    public static class TrackResult extends TeaModel {
        @NameInMap("EventList")
        private java.util.List < EventList> eventList;

        @NameInMap("TableInfoList")
        private java.util.List < TableInfoList> tableInfoList;

        @NameInMap("TotalCount")
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
        public java.util.List < EventList> getEventList() {
            return this.eventList;
        }

        /**
         * @return tableInfoList
         */
        public java.util.List < TableInfoList> getTableInfoList() {
            return this.tableInfoList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < EventList> eventList; 
            private java.util.List < TableInfoList> tableInfoList; 
            private Long totalCount; 

            /**
             * EventList.
             */
            public Builder eventList(java.util.List < EventList> eventList) {
                this.eventList = eventList;
                return this;
            }

            /**
             * TableInfoList.
             */
            public Builder tableInfoList(java.util.List < TableInfoList> tableInfoList) {
                this.tableInfoList = tableInfoList;
                return this;
            }

            /**
             * TotalCount.
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
