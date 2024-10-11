// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSparkAppMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkAppMetricsResponseBody</p>
 */
public class GetSparkAppMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSparkAppMetricsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppMetricsResponseBody create() {
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
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkAppMetricsResponseBody build() {
            return new GetSparkAppMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSparkAppMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetSparkAppMetricsResponseBody</p>
     */
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
             * <p>The number of scanned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder outputRowsCount(Long outputRowsCount) {
                this.outputRowsCount = outputRowsCount;
                return this;
            }

            /**
             * <p>The number of scanned bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
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
    /**
     * 
     * {@link GetSparkAppMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetSparkAppMetricsResponseBody</p>
     */
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
             * <p>The ID of the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p>s202302051515shfa865f80003691</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The attempt ID of the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p>s202301061000hz57d797b0000201-0001</p>
             */
            public Builder attemptId(String attemptId) {
                this.attemptId = attemptId;
                return this;
            }

            /**
             * <p>The path of the event log.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://path/to/eventLog</p>
             */
            public Builder eventLogPath(String eventLogPath) {
                this.eventLogPath = eventLogPath;
                return this;
            }

            /**
             * <p>Indicates whether parsing is complete. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
                return this;
            }

            /**
             * <p>The metrics.</p>
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
