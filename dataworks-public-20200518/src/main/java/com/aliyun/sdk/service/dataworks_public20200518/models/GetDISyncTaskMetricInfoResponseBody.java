// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDISyncTaskMetricInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDISyncTaskMetricInfoResponseBody</p>
 */
public class GetDISyncTaskMetricInfoResponseBody extends TeaModel {
    @NameInMap("MetricInfo")
    private MetricInfo metricInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDISyncTaskMetricInfoResponseBody(Builder builder) {
        this.metricInfo = builder.metricInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDISyncTaskMetricInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return metricInfo
     */
    public MetricInfo getMetricInfo() {
        return this.metricInfo;
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
        private MetricInfo metricInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * MetricInfo.
         */
        public Builder metricInfo(MetricInfo metricInfo) {
            this.metricInfo = metricInfo;
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
         * isSuccess
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDISyncTaskMetricInfoResponseBody build() {
            return new GetDISyncTaskMetricInfoResponseBody(this);
        } 

    } 

    public static class MetricInfo extends TeaModel {
        @NameInMap("DeleteReaderRecords")
        private Long deleteReaderRecords;

        @NameInMap("DeleteWriterRecords")
        private Long deleteWriterRecords;

        @NameInMap("InsertReaderRecords")
        private Long insertReaderRecords;

        @NameInMap("InsertWriterRecords")
        private Long insertWriterRecords;

        @NameInMap("LastTaskDelay")
        private Long lastTaskDelay;

        @NameInMap("Message")
        private String message;

        @NameInMap("SumReaderRecords")
        private Long sumReaderRecords;

        @NameInMap("SumWriterRecords")
        private Long sumWriterRecords;

        @NameInMap("UpdateReaderRecords")
        private Long updateReaderRecords;

        @NameInMap("UpdateWriterRecords")
        private Long updateWriterRecords;

        private MetricInfo(Builder builder) {
            this.deleteReaderRecords = builder.deleteReaderRecords;
            this.deleteWriterRecords = builder.deleteWriterRecords;
            this.insertReaderRecords = builder.insertReaderRecords;
            this.insertWriterRecords = builder.insertWriterRecords;
            this.lastTaskDelay = builder.lastTaskDelay;
            this.message = builder.message;
            this.sumReaderRecords = builder.sumReaderRecords;
            this.sumWriterRecords = builder.sumWriterRecords;
            this.updateReaderRecords = builder.updateReaderRecords;
            this.updateWriterRecords = builder.updateWriterRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricInfo create() {
            return builder().build();
        }

        /**
         * @return deleteReaderRecords
         */
        public Long getDeleteReaderRecords() {
            return this.deleteReaderRecords;
        }

        /**
         * @return deleteWriterRecords
         */
        public Long getDeleteWriterRecords() {
            return this.deleteWriterRecords;
        }

        /**
         * @return insertReaderRecords
         */
        public Long getInsertReaderRecords() {
            return this.insertReaderRecords;
        }

        /**
         * @return insertWriterRecords
         */
        public Long getInsertWriterRecords() {
            return this.insertWriterRecords;
        }

        /**
         * @return lastTaskDelay
         */
        public Long getLastTaskDelay() {
            return this.lastTaskDelay;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return sumReaderRecords
         */
        public Long getSumReaderRecords() {
            return this.sumReaderRecords;
        }

        /**
         * @return sumWriterRecords
         */
        public Long getSumWriterRecords() {
            return this.sumWriterRecords;
        }

        /**
         * @return updateReaderRecords
         */
        public Long getUpdateReaderRecords() {
            return this.updateReaderRecords;
        }

        /**
         * @return updateWriterRecords
         */
        public Long getUpdateWriterRecords() {
            return this.updateWriterRecords;
        }

        public static final class Builder {
            private Long deleteReaderRecords; 
            private Long deleteWriterRecords; 
            private Long insertReaderRecords; 
            private Long insertWriterRecords; 
            private Long lastTaskDelay; 
            private String message; 
            private Long sumReaderRecords; 
            private Long sumWriterRecords; 
            private Long updateReaderRecords; 
            private Long updateWriterRecords; 

            /**
             * DeleteReaderRecords.
             */
            public Builder deleteReaderRecords(Long deleteReaderRecords) {
                this.deleteReaderRecords = deleteReaderRecords;
                return this;
            }

            /**
             * DeleteWriterRecords.
             */
            public Builder deleteWriterRecords(Long deleteWriterRecords) {
                this.deleteWriterRecords = deleteWriterRecords;
                return this;
            }

            /**
             * InsertReaderRecords.
             */
            public Builder insertReaderRecords(Long insertReaderRecords) {
                this.insertReaderRecords = insertReaderRecords;
                return this;
            }

            /**
             * InsertWriterRecords.
             */
            public Builder insertWriterRecords(Long insertWriterRecords) {
                this.insertWriterRecords = insertWriterRecords;
                return this;
            }

            /**
             * LastTaskDelay.
             */
            public Builder lastTaskDelay(Long lastTaskDelay) {
                this.lastTaskDelay = lastTaskDelay;
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
             * SumReaderRecords.
             */
            public Builder sumReaderRecords(Long sumReaderRecords) {
                this.sumReaderRecords = sumReaderRecords;
                return this;
            }

            /**
             * SumWriterRecords.
             */
            public Builder sumWriterRecords(Long sumWriterRecords) {
                this.sumWriterRecords = sumWriterRecords;
                return this;
            }

            /**
             * UpdateReaderRecords.
             */
            public Builder updateReaderRecords(Long updateReaderRecords) {
                this.updateReaderRecords = updateReaderRecords;
                return this;
            }

            /**
             * UpdateWriterRecords.
             */
            public Builder updateWriterRecords(Long updateWriterRecords) {
                this.updateWriterRecords = updateWriterRecords;
                return this;
            }

            public MetricInfo build() {
                return new MetricInfo(this);
            } 

        } 

    }
}
