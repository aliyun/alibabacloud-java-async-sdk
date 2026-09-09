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
 * {@link ListMmsTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListMmsTasksResponseBody</p>
 */
public class ListMmsTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMmsTasksResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMmsTasksResponseBody create() {
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

        private Builder(ListMmsTasksResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>373A5CB2-8570-53BE-A98F-729B11D7A8B0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMmsTasksResponseBody build() {
            return new ListMmsTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMmsTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsTasksResponseBody</p>
     */
    public static class ObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("dstDbName")
        private String dstDbName;

        @com.aliyun.core.annotation.NameInMap("dstSchemaName")
        private String dstSchemaName;

        @com.aliyun.core.annotation.NameInMap("dstTableName")
        private String dstTableName;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("jobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("retriedTimes")
        private Integer retriedTimes;

        @com.aliyun.core.annotation.NameInMap("running")
        private Boolean running;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("sourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("srcDbName")
        private String srcDbName;

        @com.aliyun.core.annotation.NameInMap("srcSchemaName")
        private String srcSchemaName;

        @com.aliyun.core.annotation.NameInMap("srcTableName")
        private String srcTableName;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("stopped")
        private Boolean stopped;

        @com.aliyun.core.annotation.NameInMap("tableId")
        private Long tableId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ObjectList(Builder builder) {
            this.createTime = builder.createTime;
            this.dbId = builder.dbId;
            this.dstDbName = builder.dstDbName;
            this.dstSchemaName = builder.dstSchemaName;
            this.dstTableName = builder.dstTableName;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.retriedTimes = builder.retriedTimes;
            this.running = builder.running;
            this.sourceId = builder.sourceId;
            this.sourceName = builder.sourceName;
            this.srcDbName = builder.srcDbName;
            this.srcSchemaName = builder.srcSchemaName;
            this.srcTableName = builder.srcTableName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.stopped = builder.stopped;
            this.tableId = builder.tableId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dstDbName
         */
        public String getDstDbName() {
            return this.dstDbName;
        }

        /**
         * @return dstSchemaName
         */
        public String getDstSchemaName() {
            return this.dstSchemaName;
        }

        /**
         * @return dstTableName
         */
        public String getDstTableName() {
            return this.dstTableName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return retriedTimes
         */
        public Integer getRetriedTimes() {
            return this.retriedTimes;
        }

        /**
         * @return running
         */
        public Boolean getRunning() {
            return this.running;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return srcDbName
         */
        public String getSrcDbName() {
            return this.srcDbName;
        }

        /**
         * @return srcSchemaName
         */
        public String getSrcSchemaName() {
            return this.srcSchemaName;
        }

        /**
         * @return srcTableName
         */
        public String getSrcTableName() {
            return this.srcTableName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stopped
         */
        public Boolean getStopped() {
            return this.stopped;
        }

        /**
         * @return tableId
         */
        public Long getTableId() {
            return this.tableId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private Long dbId; 
            private String dstDbName; 
            private String dstSchemaName; 
            private String dstTableName; 
            private String endTime; 
            private Long id; 
            private Long jobId; 
            private String jobName; 
            private Integer retriedTimes; 
            private Boolean running; 
            private Long sourceId; 
            private String sourceName; 
            private String srcDbName; 
            private String srcSchemaName; 
            private String srcTableName; 
            private String startTime; 
            private String status; 
            private Boolean stopped; 
            private Long tableId; 
            private String type; 

            private Builder() {
            } 

            private Builder(ObjectList model) {
                this.createTime = model.createTime;
                this.dbId = model.dbId;
                this.dstDbName = model.dstDbName;
                this.dstSchemaName = model.dstSchemaName;
                this.dstTableName = model.dstTableName;
                this.endTime = model.endTime;
                this.id = model.id;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.retriedTimes = model.retriedTimes;
                this.running = model.running;
                this.sourceId = model.sourceId;
                this.sourceName = model.sourceName;
                this.srcDbName = model.srcDbName;
                this.srcSchemaName = model.srcSchemaName;
                this.srcTableName = model.srcTableName;
                this.startTime = model.startTime;
                this.status = model.status;
                this.stopped = model.stopped;
                this.tableId = model.tableId;
                this.type = model.type;
            } 

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-25 04:21:01</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The source database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>196</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The destination MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>mms_test</p>
             */
            public Builder dstDbName(String dstDbName) {
                this.dstDbName = dstDbName;
                return this;
            }

            /**
             * <p>The destination MaxCompute schema.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder dstSchemaName(String dstSchemaName) {
                this.dstSchemaName = dstSchemaName;
                return this;
            }

            /**
             * <p>The destination MaxCompute table.</p>
             * 
             * <strong>example:</strong>
             * <p>table_1</p>
             */
            public Builder dstTableName(String dstTableName) {
                this.dstTableName = dstTableName;
                return this;
            }

            /**
             * <p>The end time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-25 07:21:01</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The migration task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2323</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The migration job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>87</p>
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The migration job name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_odps_spark</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The number of retries that have been performed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retriedTimes(Integer retriedTimes) {
                this.retriedTimes = retriedTimes;
                return this;
            }

            /**
             * <p>Indicates whether the task is running.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder running(Boolean running) {
                this.running = running;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2000028</p>
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The data source name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * <p>The source database name.</p>
             * 
             * <strong>example:</strong>
             * <p>db_1</p>
             */
            public Builder srcDbName(String srcDbName) {
                this.srcDbName = srcDbName;
                return this;
            }

            /**
             * <p>The source schema name in a three-level namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder srcSchemaName(String srcSchemaName) {
                this.srcSchemaName = srcSchemaName;
                return this;
            }

            /**
             * <p>The source table name.</p>
             * 
             * <strong>example:</strong>
             * <p>table_1</p>
             */
            public Builder srcTableName(String srcTableName) {
                this.srcTableName = srcTableName;
                return this;
            }

            /**
             * <p>The start time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-25 06:21:01</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The migration task status.</p>
             * 
             * <strong>example:</strong>
             * <p>DATA_DOING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the task is stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder stopped(Boolean stopped) {
                this.stopped = stopped;
                return this;
            }

            /**
             * <p>The source table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder tableId(Long tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>BIGQUERY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ObjectList build() {
                return new ObjectList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMmsTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMmsTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("objectList")
        private java.util.List<ObjectList> objectList;

        @com.aliyun.core.annotation.NameInMap("pageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.objectList = builder.objectList;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return objectList
         */
        public java.util.List<ObjectList> getObjectList() {
            return this.objectList;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<ObjectList> objectList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.objectList = model.objectList;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The list of migration tasks.</p>
             */
            public Builder objectList(java.util.List<ObjectList> objectList) {
                this.objectList = objectList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
