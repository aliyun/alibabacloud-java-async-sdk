// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreloadSparkAppMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>PreloadSparkAppMetricsResponseBody</p>
 */
public class PreloadSparkAppMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PreloadSparkAppMetricsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadSparkAppMetricsResponseBody create() {
        return builder().build();
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

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreloadSparkAppMetricsResponseBody build() {
            return new PreloadSparkAppMetricsResponseBody(this);
        } 

    } 

    public static class ScanMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutputRowsCount")
        private Long outputRowsCount;

        @com.aliyun.core.annotation.NameInMap("TotalReadFileSizeInByte")
        private Long totalReadFileSizeInByte;

        private ScanMetrics(Builder builder) {
            this.outputRowsCount = builder.outputRowsCount;
            this.totalReadFileSizeInByte = builder.totalReadFileSizeInByte;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScanMetrics create() {
            return builder().build();
        }

        /**
         * @return outputRowsCount
         */
        public Long getOutputRowsCount() {
            return this.outputRowsCount;
        }

        /**
         * @return totalReadFileSizeInByte
         */
        public Long getTotalReadFileSizeInByte() {
            return this.totalReadFileSizeInByte;
        }

        public static final class Builder {
            private Long outputRowsCount; 
            private Long totalReadFileSizeInByte; 

            /**
             * The number of rows scanned.
             */
            public Builder outputRowsCount(Long outputRowsCount) {
                this.outputRowsCount = outputRowsCount;
                return this;
            }

            /**
             * The size of the scanned data. Unit: bytes.
             */
            public Builder totalReadFileSizeInByte(Long totalReadFileSizeInByte) {
                this.totalReadFileSizeInByte = totalReadFileSizeInByte;
                return this;
            }

            public ScanMetrics build() {
                return new ScanMetrics(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AttemptId")
        private String attemptId;

        @com.aliyun.core.annotation.NameInMap("EventLogPath")
        private String eventLogPath;

        @com.aliyun.core.annotation.NameInMap("Finished")
        private Boolean finished;

        @com.aliyun.core.annotation.NameInMap("ScanMetrics")
        private ScanMetrics scanMetrics;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.attemptId = builder.attemptId;
            this.eventLogPath = builder.eventLogPath;
            this.finished = builder.finished;
            this.scanMetrics = builder.scanMetrics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return attemptId
         */
        public String getAttemptId() {
            return this.attemptId;
        }

        /**
         * @return eventLogPath
         */
        public String getEventLogPath() {
            return this.eventLogPath;
        }

        /**
         * @return finished
         */
        public Boolean getFinished() {
            return this.finished;
        }

        /**
         * @return scanMetrics
         */
        public ScanMetrics getScanMetrics() {
            return this.scanMetrics;
        }

        public static final class Builder {
            private String appId; 
            private String attemptId; 
            private String eventLogPath; 
            private Boolean finished; 
            private ScanMetrics scanMetrics; 

            /**
             * The ID of the Spark application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The retry ID of the Spark application.
             */
            public Builder attemptId(String attemptId) {
                this.attemptId = attemptId;
                return this;
            }

            /**
             * The event log path.
             */
            public Builder eventLogPath(String eventLogPath) {
                this.eventLogPath = eventLogPath;
                return this;
            }

            /**
             * Indicates whether parsing is complete. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
                return this;
            }

            /**
             * The metrics.
             */
            public Builder scanMetrics(ScanMetrics scanMetrics) {
                this.scanMetrics = scanMetrics;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
