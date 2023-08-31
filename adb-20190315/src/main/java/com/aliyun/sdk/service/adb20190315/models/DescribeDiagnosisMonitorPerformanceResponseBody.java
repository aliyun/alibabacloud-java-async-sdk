// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisMonitorPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisMonitorPerformanceResponseBody</p>
 */
public class DescribeDiagnosisMonitorPerformanceResponseBody extends TeaModel {
    @NameInMap("Performances")
    private java.util.List < Performances> performances;

    @NameInMap("PerformancesThreshold")
    private Integer performancesThreshold;

    @NameInMap("PerformancesTruncated")
    private Boolean performancesTruncated;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDiagnosisMonitorPerformanceResponseBody(Builder builder) {
        this.performances = builder.performances;
        this.performancesThreshold = builder.performancesThreshold;
        this.performancesTruncated = builder.performancesTruncated;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisMonitorPerformanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return performances
     */
    public java.util.List < Performances> getPerformances() {
        return this.performances;
    }

    /**
     * @return performancesThreshold
     */
    public Integer getPerformancesThreshold() {
        return this.performancesThreshold;
    }

    /**
     * @return performancesTruncated
     */
    public Boolean getPerformancesTruncated() {
        return this.performancesTruncated;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Performances> performances; 
        private Integer performancesThreshold; 
        private Boolean performancesTruncated; 
        private String requestId; 

        /**
         * The monitoring information of queries displayed in Gantt charts.
         */
        public Builder performances(java.util.List < Performances> performances) {
            this.performances = performances;
            return this;
        }

        /**
         * The threshold for the number of queries displayed in a Gantt chart. The default value is 10000.
         * <p>
         * 
         * >  A maximum of 10,000 queries can be displayed in a Gantt chart even if more queries exist.
         */
        public Builder performancesThreshold(Integer performancesThreshold) {
            this.performancesThreshold = performancesThreshold;
            return this;
        }

        /**
         * Indicates whether all queries are returned. Valid values:
         * <p>
         * 
         * *   true: All queries are returned.
         * *   false: Only a specified number of queries are returned.
         */
        public Builder performancesTruncated(Boolean performancesTruncated) {
            this.performancesTruncated = performancesTruncated;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBody build() {
            return new DescribeDiagnosisMonitorPerformanceResponseBody(this);
        } 

    } 

    public static class Performances extends TeaModel {
        @NameInMap("Cost")
        private Long cost;

        @NameInMap("PeakMemory")
        private Long peakMemory;

        @NameInMap("ProcessId")
        private String processId;

        @NameInMap("RcHost")
        private String rcHost;

        @NameInMap("ScanRows")
        private Long scanRows;

        @NameInMap("ScanSize")
        private Long scanSize;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserName")
        private String userName;

        private Performances(Builder builder) {
            this.cost = builder.cost;
            this.peakMemory = builder.peakMemory;
            this.processId = builder.processId;
            this.rcHost = builder.rcHost;
            this.scanRows = builder.scanRows;
            this.scanSize = builder.scanSize;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performances create() {
            return builder().build();
        }

        /**
         * @return cost
         */
        public Long getCost() {
            return this.cost;
        }

        /**
         * @return peakMemory
         */
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return rcHost
         */
        public String getRcHost() {
            return this.rcHost;
        }

        /**
         * @return scanRows
         */
        public Long getScanRows() {
            return this.scanRows;
        }

        /**
         * @return scanSize
         */
        public Long getScanSize() {
            return this.scanSize;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long cost; 
            private Long peakMemory; 
            private String processId; 
            private String rcHost; 
            private Long scanRows; 
            private Long scanSize; 
            private Long startTime; 
            private String status; 
            private String userName; 

            /**
             * The total amount of time consumed by the query. Unit: milliseconds.
             * <p>
             * 
             * >  This parameter indicates the sum of `QueuedTime`, `TotalPlanningTime`, and `ExecutionTime`.
             */
            public Builder cost(Long cost) {
                this.cost = cost;
                return this;
            }

            /**
             * The peak memory of the query. Unit: bytes.
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * The ID of the query.
             * <p>
             * 
             * >  You can call the [DescribeProcessList](~~143382~~) operation to query the IDs of queries that are being executed.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * The IP address of the AnalyticDB for MySQL frontend node on which the SQL statement is executed.
             */
            public Builder rcHost(String rcHost) {
                this.rcHost = rcHost;
                return this;
            }

            /**
             * The number of entries scanned.
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * The amount of scanned data. Unit: bytes.
             */
            public Builder scanSize(Long scanSize) {
                this.scanSize = scanSize;
                return this;
            }

            /**
             * The execution start time of the SQL statement. The time is in the UNIX timestamp format. Unit: milliseconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the SQL statement. Valid values:
             * <p>
             * 
             * *   **running**
             * *   **finished**
             * *   **failed**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The database account that is used to submit the query.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Performances build() {
                return new Performances(this);
            } 

        } 

    }
}
