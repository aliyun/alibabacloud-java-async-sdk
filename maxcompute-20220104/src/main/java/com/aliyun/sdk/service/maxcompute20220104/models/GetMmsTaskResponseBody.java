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
 * {@link GetMmsTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetMmsTaskResponseBody</p>
 */
public class GetMmsTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMmsTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsTaskResponseBody create() {
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

        private Builder(GetMmsTaskResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMmsTaskResponseBody build() {
            return new GetMmsTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMmsTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetMmsTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            private Builder(Data model) {
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
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * dbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * dstDbName.
             */
            public Builder dstDbName(String dstDbName) {
                this.dstDbName = dstDbName;
                return this;
            }

            /**
             * dstSchemaName.
             */
            public Builder dstSchemaName(String dstSchemaName) {
                this.dstSchemaName = dstSchemaName;
                return this;
            }

            /**
             * dstTableName.
             */
            public Builder dstTableName(String dstTableName) {
                this.dstTableName = dstTableName;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * jobId.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * jobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * retriedTimes.
             */
            public Builder retriedTimes(Integer retriedTimes) {
                this.retriedTimes = retriedTimes;
                return this;
            }

            /**
             * running.
             */
            public Builder running(Boolean running) {
                this.running = running;
                return this;
            }

            /**
             * sourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * sourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * srcDbName.
             */
            public Builder srcDbName(String srcDbName) {
                this.srcDbName = srcDbName;
                return this;
            }

            /**
             * srcSchemaName.
             */
            public Builder srcSchemaName(String srcSchemaName) {
                this.srcSchemaName = srcSchemaName;
                return this;
            }

            /**
             * srcTableName.
             */
            public Builder srcTableName(String srcTableName) {
                this.srcTableName = srcTableName;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * stopped.
             */
            public Builder stopped(Boolean stopped) {
                this.stopped = stopped;
                return this;
            }

            /**
             * tableId.
             */
            public Builder tableId(Long tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
