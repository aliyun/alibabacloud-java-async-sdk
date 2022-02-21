// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms_export20211101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetResponseBody</p>
 */
public class BatchGetResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchGetResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public BatchGetResponseBody build() {
            return new BatchGetResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("LabelValues")
        private java.util.List < String > labelValues;

        @NameInMap("Labels")
        private java.util.List < String > labels;

        @NameInMap("MeasureLabels")
        private java.util.List < String > measureLabels;

        @NameInMap("MeasureValues")
        private java.util.List < String > measureValues;

        @NameInMap("Metric")
        private String metric;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("TagValues")
        private java.util.List < String > tagValues;

        @NameInMap("Tags")
        private java.util.List < String > tags;

        @NameInMap("Timestamp")
        private Long timestamp;

        private Records(Builder builder) {
            this.labelValues = builder.labelValues;
            this.labels = builder.labels;
            this.measureLabels = builder.measureLabels;
            this.measureValues = builder.measureValues;
            this.metric = builder.metric;
            this.namespace = builder.namespace;
            this.period = builder.period;
            this.tagValues = builder.tagValues;
            this.tags = builder.tags;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return labelValues
         */
        public java.util.List < String > getLabelValues() {
            return this.labelValues;
        }

        /**
         * @return labels
         */
        public java.util.List < String > getLabels() {
            return this.labels;
        }

        /**
         * @return measureLabels
         */
        public java.util.List < String > getMeasureLabels() {
            return this.measureLabels;
        }

        /**
         * @return measureValues
         */
        public java.util.List < String > getMeasureValues() {
            return this.measureValues;
        }

        /**
         * @return metric
         */
        public String getMetric() {
            return this.metric;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return tagValues
         */
        public java.util.List < String > getTagValues() {
            return this.tagValues;
        }

        /**
         * @return tags
         */
        public java.util.List < String > getTags() {
            return this.tags;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private java.util.List < String > labelValues; 
            private java.util.List < String > labels; 
            private java.util.List < String > measureLabels; 
            private java.util.List < String > measureValues; 
            private String metric; 
            private String namespace; 
            private Integer period; 
            private java.util.List < String > tagValues; 
            private java.util.List < String > tags; 
            private Long timestamp; 

            /**
             * LabelValues.
             */
            public Builder labelValues(java.util.List < String > labelValues) {
                this.labelValues = labelValues;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List < String > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * MeasureLabels.
             */
            public Builder measureLabels(java.util.List < String > measureLabels) {
                this.measureLabels = measureLabels;
                return this;
            }

            /**
             * MeasureValues.
             */
            public Builder measureValues(java.util.List < String > measureValues) {
                this.measureValues = measureValues;
                return this;
            }

            /**
             * Metric.
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * TagValues.
             */
            public Builder tagValues(java.util.List < String > tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("CompressionKeys")
        private java.util.List < String > compressionKeys;

        @NameInMap("CompressionValues")
        private java.util.List < java.util.List < java.util.Map<String, ?>> > compressionValues;

        @NameInMap("Cursor")
        private String cursor;

        @NameInMap("Length")
        private Long length;

        @NameInMap("Records")
        private java.util.List < Records> records;

        private Data(Builder builder) {
            this.compressionKeys = builder.compressionKeys;
            this.compressionValues = builder.compressionValues;
            this.cursor = builder.cursor;
            this.length = builder.length;
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return compressionKeys
         */
        public java.util.List < String > getCompressionKeys() {
            return this.compressionKeys;
        }

        /**
         * @return compressionValues
         */
        public java.util.List < java.util.List < java.util.Map<String, ?>> > getCompressionValues() {
            return this.compressionValues;
        }

        /**
         * @return cursor
         */
        public String getCursor() {
            return this.cursor;
        }

        /**
         * @return length
         */
        public Long getLength() {
            return this.length;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private java.util.List < String > compressionKeys; 
            private java.util.List < java.util.List < java.util.Map<String, ?>> > compressionValues; 
            private String cursor; 
            private Long length; 
            private java.util.List < Records> records; 

            /**
             * CompressionKeys.
             */
            public Builder compressionKeys(java.util.List < String > compressionKeys) {
                this.compressionKeys = compressionKeys;
                return this;
            }

            /**
             * CompressionValues.
             */
            public Builder compressionValues(java.util.List < java.util.List < java.util.Map<String, ?>> > compressionValues) {
                this.compressionValues = compressionValues;
                return this;
            }

            /**
             * Cursor.
             */
            public Builder cursor(String cursor) {
                this.cursor = cursor;
                return this;
            }

            /**
             * Length.
             */
            public Builder length(Long length) {
                this.length = length;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
