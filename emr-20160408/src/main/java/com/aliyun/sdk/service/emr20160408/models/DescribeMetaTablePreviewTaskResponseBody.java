// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetaTablePreviewTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetaTablePreviewTaskResponseBody</p>
 */
public class DescribeMetaTablePreviewTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("ExecuteTime")
    private Long executeTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskProcess")
    private Integer taskProcess;

    @NameInMap("TaskStatus")
    private String taskStatus;

    private DescribeMetaTablePreviewTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.endTime = builder.endTime;
        this.executeTime = builder.executeTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.taskId = builder.taskId;
        this.taskProcess = builder.taskProcess;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetaTablePreviewTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return executeTime
     */
    public Long getExecuteTime() {
        return this.executeTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskProcess
     */
    public Integer getTaskProcess() {
        return this.taskProcess;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder {
        private Data data; 
        private Long endTime; 
        private Long executeTime; 
        private String requestId; 
        private Long startTime; 
        private String taskId; 
        private Integer taskProcess; 
        private String taskStatus; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * ExecuteTime.
         */
        public Builder executeTime(Long executeTime) {
            this.executeTime = executeTime;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskProcess.
         */
        public Builder taskProcess(Integer taskProcess) {
            this.taskProcess = taskProcess;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public DescribeMetaTablePreviewTaskResponseBody build() {
            return new DescribeMetaTablePreviewTaskResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("Header")
        private java.util.List < String > header;

        private Headers(Builder builder) {
            this.header = builder.header;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return header
         */
        public java.util.List < String > getHeader() {
            return this.header;
        }

        public static final class Builder {
            private java.util.List < String > header; 

            /**
             * Header.
             */
            public Builder header(java.util.List < String > header) {
                this.header = header;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class Columns extends TeaModel {
        @NameInMap("Column")
        private java.util.List < String > column;

        private Columns(Builder builder) {
            this.column = builder.column;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public java.util.List < String > getColumn() {
            return this.column;
        }

        public static final class Builder {
            private java.util.List < String > column; 

            /**
             * Column.
             */
            public Builder column(java.util.List < String > column) {
                this.column = column;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    public static class Row extends TeaModel {
        @NameInMap("Columns")
        private Columns columns;

        private Row(Builder builder) {
            this.columns = builder.columns;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Row create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public Columns getColumns() {
            return this.columns;
        }

        public static final class Builder {
            private Columns columns; 

            /**
             * Columns.
             */
            public Builder columns(Columns columns) {
                this.columns = columns;
                return this;
            }

            public Row build() {
                return new Row(this);
            } 

        } 

    }
    public static class Rows extends TeaModel {
        @NameInMap("Row")
        private java.util.List < Row> row;

        private Rows(Builder builder) {
            this.row = builder.row;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rows create() {
            return builder().build();
        }

        /**
         * @return row
         */
        public java.util.List < Row> getRow() {
            return this.row;
        }

        public static final class Builder {
            private java.util.List < Row> row; 

            /**
             * Row.
             */
            public Builder row(java.util.List < Row> row) {
                this.row = row;
                return this;
            }

            public Rows build() {
                return new Rows(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Headers")
        private Headers headers;

        @NameInMap("Rows")
        private Rows rows;

        private Data(Builder builder) {
            this.headers = builder.headers;
            this.rows = builder.rows;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public Headers getHeaders() {
            return this.headers;
        }

        /**
         * @return rows
         */
        public Rows getRows() {
            return this.rows;
        }

        public static final class Builder {
            private Headers headers; 
            private Rows rows; 

            /**
             * Headers.
             */
            public Builder headers(Headers headers) {
                this.headers = headers;
                return this;
            }

            /**
             * Rows.
             */
            public Builder rows(Rows rows) {
                this.rows = rows;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
