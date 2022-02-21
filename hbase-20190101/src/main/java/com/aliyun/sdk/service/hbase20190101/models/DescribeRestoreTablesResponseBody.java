// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreTablesResponseBody</p>
 */
public class DescribeRestoreTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RestoreFull")
    private RestoreFull restoreFull;

    @NameInMap("RestoreIncrDetail")
    private RestoreIncrDetail restoreIncrDetail;

    @NameInMap("RestoreSchema")
    private RestoreSchema restoreSchema;

    @NameInMap("RestoreSummary")
    private RestoreSummary restoreSummary;

    @NameInMap("Tables")
    private Tables tables;

    private DescribeRestoreTablesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.restoreFull = builder.restoreFull;
        this.restoreIncrDetail = builder.restoreIncrDetail;
        this.restoreSchema = builder.restoreSchema;
        this.restoreSummary = builder.restoreSummary;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoreFull
     */
    public RestoreFull getRestoreFull() {
        return this.restoreFull;
    }

    /**
     * @return restoreIncrDetail
     */
    public RestoreIncrDetail getRestoreIncrDetail() {
        return this.restoreIncrDetail;
    }

    /**
     * @return restoreSchema
     */
    public RestoreSchema getRestoreSchema() {
        return this.restoreSchema;
    }

    /**
     * @return restoreSummary
     */
    public RestoreSummary getRestoreSummary() {
        return this.restoreSummary;
    }

    /**
     * @return tables
     */
    public Tables getTables() {
        return this.tables;
    }

    public static final class Builder {
        private String requestId; 
        private RestoreFull restoreFull; 
        private RestoreIncrDetail restoreIncrDetail; 
        private RestoreSchema restoreSchema; 
        private RestoreSummary restoreSummary; 
        private Tables tables; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RestoreFull.
         */
        public Builder restoreFull(RestoreFull restoreFull) {
            this.restoreFull = restoreFull;
            return this;
        }

        /**
         * RestoreIncrDetail.
         */
        public Builder restoreIncrDetail(RestoreIncrDetail restoreIncrDetail) {
            this.restoreIncrDetail = restoreIncrDetail;
            return this;
        }

        /**
         * RestoreSchema.
         */
        public Builder restoreSchema(RestoreSchema restoreSchema) {
            this.restoreSchema = restoreSchema;
            return this;
        }

        /**
         * RestoreSummary.
         */
        public Builder restoreSummary(RestoreSummary restoreSummary) {
            this.restoreSummary = restoreSummary;
            return this;
        }

        /**
         * Tables.
         */
        public Builder tables(Tables tables) {
            this.tables = tables;
            return this;
        }

        public DescribeRestoreTablesResponseBody build() {
            return new DescribeRestoreTablesResponseBody(this);
        } 

    } 

    public static class RestoreFullDetail extends TeaModel {
        @NameInMap("DataSize")
        private String dataSize;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Process")
        private String process;

        @NameInMap("Speed")
        private String speed;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("Table")
        private String table;

        private RestoreFullDetail(Builder builder) {
            this.dataSize = builder.dataSize;
            this.endTime = builder.endTime;
            this.message = builder.message;
            this.process = builder.process;
            this.speed = builder.speed;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreFullDetail create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public String getDataSize() {
            return this.dataSize;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String dataSize; 
            private String endTime; 
            private String message; 
            private String process; 
            private String speed; 
            private String startTime; 
            private String state; 
            private String table; 

            /**
             * DataSize.
             */
            public Builder dataSize(String dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Process.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public RestoreFullDetail build() {
                return new RestoreFullDetail(this);
            } 

        } 

    }
    public static class RestoreFullDetails extends TeaModel {
        @NameInMap("RestoreFullDetail")
        private java.util.List < RestoreFullDetail> restoreFullDetail;

        private RestoreFullDetails(Builder builder) {
            this.restoreFullDetail = builder.restoreFullDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreFullDetails create() {
            return builder().build();
        }

        /**
         * @return restoreFullDetail
         */
        public java.util.List < RestoreFullDetail> getRestoreFullDetail() {
            return this.restoreFullDetail;
        }

        public static final class Builder {
            private java.util.List < RestoreFullDetail> restoreFullDetail; 

            /**
             * RestoreFullDetail.
             */
            public Builder restoreFullDetail(java.util.List < RestoreFullDetail> restoreFullDetail) {
                this.restoreFullDetail = restoreFullDetail;
                return this;
            }

            public RestoreFullDetails build() {
                return new RestoreFullDetails(this);
            } 

        } 

    }
    public static class RestoreFull extends TeaModel {
        @NameInMap("DataSize")
        private String dataSize;

        @NameInMap("Fail")
        private Integer fail;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("RestoreFullDetails")
        private RestoreFullDetails restoreFullDetails;

        @NameInMap("Speed")
        private String speed;

        @NameInMap("Succeed")
        private Integer succeed;

        @NameInMap("Total")
        private Long total;

        private RestoreFull(Builder builder) {
            this.dataSize = builder.dataSize;
            this.fail = builder.fail;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.restoreFullDetails = builder.restoreFullDetails;
            this.speed = builder.speed;
            this.succeed = builder.succeed;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreFull create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public String getDataSize() {
            return this.dataSize;
        }

        /**
         * @return fail
         */
        public Integer getFail() {
            return this.fail;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return restoreFullDetails
         */
        public RestoreFullDetails getRestoreFullDetails() {
            return this.restoreFullDetails;
        }

        /**
         * @return speed
         */
        public String getSpeed() {
            return this.speed;
        }

        /**
         * @return succeed
         */
        public Integer getSucceed() {
            return this.succeed;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String dataSize; 
            private Integer fail; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private RestoreFullDetails restoreFullDetails; 
            private String speed; 
            private Integer succeed; 
            private Long total; 

            /**
             * DataSize.
             */
            public Builder dataSize(String dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * Fail.
             */
            public Builder fail(Integer fail) {
                this.fail = fail;
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
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * RestoreFullDetails.
             */
            public Builder restoreFullDetails(RestoreFullDetails restoreFullDetails) {
                this.restoreFullDetails = restoreFullDetails;
                return this;
            }

            /**
             * Speed.
             */
            public Builder speed(String speed) {
                this.speed = speed;
                return this;
            }

            /**
             * Succeed.
             */
            public Builder succeed(Integer succeed) {
                this.succeed = succeed;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public RestoreFull build() {
                return new RestoreFull(this);
            } 

        } 

    }
    public static class RestoreIncrDetail extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Process")
        private String process;

        @NameInMap("RestoreDelay")
        private String restoreDelay;

        @NameInMap("RestoreStartTs")
        private String restoreStartTs;

        @NameInMap("RestoredTs")
        private String restoredTs;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        private RestoreIncrDetail(Builder builder) {
            this.endTime = builder.endTime;
            this.process = builder.process;
            this.restoreDelay = builder.restoreDelay;
            this.restoreStartTs = builder.restoreStartTs;
            this.restoredTs = builder.restoredTs;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreIncrDetail create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return restoreDelay
         */
        public String getRestoreDelay() {
            return this.restoreDelay;
        }

        /**
         * @return restoreStartTs
         */
        public String getRestoreStartTs() {
            return this.restoreStartTs;
        }

        /**
         * @return restoredTs
         */
        public String getRestoredTs() {
            return this.restoredTs;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String endTime; 
            private String process; 
            private String restoreDelay; 
            private String restoreStartTs; 
            private String restoredTs; 
            private String startTime; 
            private String state; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Process.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * RestoreDelay.
             */
            public Builder restoreDelay(String restoreDelay) {
                this.restoreDelay = restoreDelay;
                return this;
            }

            /**
             * RestoreStartTs.
             */
            public Builder restoreStartTs(String restoreStartTs) {
                this.restoreStartTs = restoreStartTs;
                return this;
            }

            /**
             * RestoredTs.
             */
            public Builder restoredTs(String restoredTs) {
                this.restoredTs = restoredTs;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public RestoreIncrDetail build() {
                return new RestoreIncrDetail(this);
            } 

        } 

    }
    public static class RestoreSchemaDetail extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("Table")
        private String table;

        private RestoreSchemaDetail(Builder builder) {
            this.endTime = builder.endTime;
            this.message = builder.message;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreSchemaDetail create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String endTime; 
            private String message; 
            private String startTime; 
            private String state; 
            private String table; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public RestoreSchemaDetail build() {
                return new RestoreSchemaDetail(this);
            } 

        } 

    }
    public static class RestoreSchemaDetails extends TeaModel {
        @NameInMap("RestoreSchemaDetail")
        private java.util.List < RestoreSchemaDetail> restoreSchemaDetail;

        private RestoreSchemaDetails(Builder builder) {
            this.restoreSchemaDetail = builder.restoreSchemaDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreSchemaDetails create() {
            return builder().build();
        }

        /**
         * @return restoreSchemaDetail
         */
        public java.util.List < RestoreSchemaDetail> getRestoreSchemaDetail() {
            return this.restoreSchemaDetail;
        }

        public static final class Builder {
            private java.util.List < RestoreSchemaDetail> restoreSchemaDetail; 

            /**
             * RestoreSchemaDetail.
             */
            public Builder restoreSchemaDetail(java.util.List < RestoreSchemaDetail> restoreSchemaDetail) {
                this.restoreSchemaDetail = restoreSchemaDetail;
                return this;
            }

            public RestoreSchemaDetails build() {
                return new RestoreSchemaDetails(this);
            } 

        } 

    }
    public static class RestoreSchema extends TeaModel {
        @NameInMap("Fail")
        private Integer fail;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("RestoreSchemaDetails")
        private RestoreSchemaDetails restoreSchemaDetails;

        @NameInMap("Succeed")
        private Integer succeed;

        @NameInMap("Total")
        private Long total;

        private RestoreSchema(Builder builder) {
            this.fail = builder.fail;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.restoreSchemaDetails = builder.restoreSchemaDetails;
            this.succeed = builder.succeed;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreSchema create() {
            return builder().build();
        }

        /**
         * @return fail
         */
        public Integer getFail() {
            return this.fail;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return restoreSchemaDetails
         */
        public RestoreSchemaDetails getRestoreSchemaDetails() {
            return this.restoreSchemaDetails;
        }

        /**
         * @return succeed
         */
        public Integer getSucceed() {
            return this.succeed;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer fail; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private RestoreSchemaDetails restoreSchemaDetails; 
            private Integer succeed; 
            private Long total; 

            /**
             * Fail.
             */
            public Builder fail(Integer fail) {
                this.fail = fail;
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
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * RestoreSchemaDetails.
             */
            public Builder restoreSchemaDetails(RestoreSchemaDetails restoreSchemaDetails) {
                this.restoreSchemaDetails = restoreSchemaDetails;
                return this;
            }

            /**
             * Succeed.
             */
            public Builder succeed(Integer succeed) {
                this.succeed = succeed;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public RestoreSchema build() {
                return new RestoreSchema(this);
            } 

        } 

    }
    public static class RestoreSummary extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("RecordId")
        private String recordId;

        @NameInMap("RestoreToDate")
        private String restoreToDate;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("TargetCluster")
        private String targetCluster;

        private RestoreSummary(Builder builder) {
            this.endTime = builder.endTime;
            this.recordId = builder.recordId;
            this.restoreToDate = builder.restoreToDate;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.targetCluster = builder.targetCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreSummary create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return restoreToDate
         */
        public String getRestoreToDate() {
            return this.restoreToDate;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return targetCluster
         */
        public String getTargetCluster() {
            return this.targetCluster;
        }

        public static final class Builder {
            private String endTime; 
            private String recordId; 
            private String restoreToDate; 
            private String startTime; 
            private String state; 
            private String targetCluster; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * RestoreToDate.
             */
            public Builder restoreToDate(String restoreToDate) {
                this.restoreToDate = restoreToDate;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TargetCluster.
             */
            public Builder targetCluster(String targetCluster) {
                this.targetCluster = targetCluster;
                return this;
            }

            public RestoreSummary build() {
                return new RestoreSummary(this);
            } 

        } 

    }
    public static class Tables extends TeaModel {
        @NameInMap("Table")
        private java.util.List < String > table;

        private Tables(Builder builder) {
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return table
         */
        public java.util.List < String > getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List < String > table; 

            /**
             * Table.
             */
            public Builder table(java.util.List < String > table) {
                this.table = table;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
}
