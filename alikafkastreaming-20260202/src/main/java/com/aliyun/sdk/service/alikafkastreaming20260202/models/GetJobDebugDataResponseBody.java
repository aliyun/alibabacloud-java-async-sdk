// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link GetJobDebugDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobDebugDataResponseBody</p>
 */
public class GetJobDebugDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetJobDebugDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobDebugDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetJobDebugDataResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetJobDebugDataResponseBody build() {
            return new GetJobDebugDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobDebugDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobDebugDataResponseBody</p>
     */
    public static class DataRows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlinkInstanceId")
        private String flinkInstanceId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Long offset;

        @com.aliyun.core.annotation.NameInMap("Partition")
        private Integer partition;

        @com.aliyun.core.annotation.NameInMap("ProcessedValue")
        private String processedValue;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private DataRows(Builder builder) {
            this.flinkInstanceId = builder.flinkInstanceId;
            this.jobName = builder.jobName;
            this.offset = builder.offset;
            this.partition = builder.partition;
            this.processedValue = builder.processedValue;
            this.timestamp = builder.timestamp;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataRows create() {
            return builder().build();
        }

        /**
         * @return flinkInstanceId
         */
        public String getFlinkInstanceId() {
            return this.flinkInstanceId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return offset
         */
        public Long getOffset() {
            return this.offset;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        /**
         * @return processedValue
         */
        public String getProcessedValue() {
            return this.processedValue;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String flinkInstanceId; 
            private String jobName; 
            private Long offset; 
            private Integer partition; 
            private String processedValue; 
            private Long timestamp; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(DataRows model) {
                this.flinkInstanceId = model.flinkInstanceId;
                this.jobName = model.jobName;
                this.offset = model.offset;
                this.partition = model.partition;
                this.processedValue = model.processedValue;
                this.timestamp = model.timestamp;
                this.uuid = model.uuid;
            } 

            /**
             * FlinkInstanceId.
             */
            public Builder flinkInstanceId(String flinkInstanceId) {
                this.flinkInstanceId = flinkInstanceId;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * Offset.
             */
            public Builder offset(Long offset) {
                this.offset = offset;
                return this;
            }

            /**
             * Partition.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * ProcessedValue.
             */
            public Builder processedValue(String processedValue) {
                this.processedValue = processedValue;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public DataRows build() {
                return new DataRows(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobDebugDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobDebugDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataRows")
        private java.util.List<DataRows> dataRows;

        @com.aliyun.core.annotation.NameInMap("DebugField")
        private String debugField;

        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("Limit")
        private String limit;

        @com.aliyun.core.annotation.NameInMap("NextCursor")
        private String nextCursor;

        private Data(Builder builder) {
            this.dataRows = builder.dataRows;
            this.debugField = builder.debugField;
            this.hasMore = builder.hasMore;
            this.limit = builder.limit;
            this.nextCursor = builder.nextCursor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataRows
         */
        public java.util.List<DataRows> getDataRows() {
            return this.dataRows;
        }

        /**
         * @return debugField
         */
        public String getDebugField() {
            return this.debugField;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return limit
         */
        public String getLimit() {
            return this.limit;
        }

        /**
         * @return nextCursor
         */
        public String getNextCursor() {
            return this.nextCursor;
        }

        public static final class Builder {
            private java.util.List<DataRows> dataRows; 
            private String debugField; 
            private Boolean hasMore; 
            private String limit; 
            private String nextCursor; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataRows = model.dataRows;
                this.debugField = model.debugField;
                this.hasMore = model.hasMore;
                this.limit = model.limit;
                this.nextCursor = model.nextCursor;
            } 

            /**
             * DataRows.
             */
            public Builder dataRows(java.util.List<DataRows> dataRows) {
                this.dataRows = dataRows;
                return this;
            }

            /**
             * DebugField.
             */
            public Builder debugField(String debugField) {
                this.debugField = debugField;
                return this;
            }

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * Limit.
             */
            public Builder limit(String limit) {
                this.limit = limit;
                return this;
            }

            /**
             * NextCursor.
             */
            public Builder nextCursor(String nextCursor) {
                this.nextCursor = nextCursor;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
