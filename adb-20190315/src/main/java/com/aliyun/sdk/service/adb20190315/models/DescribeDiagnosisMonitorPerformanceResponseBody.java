// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDiagnosisMonitorPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisMonitorPerformanceResponseBody</p>
 */
public class DescribeDiagnosisMonitorPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Performances")
    private java.util.List < Performances> performances;

    @com.aliyun.core.annotation.NameInMap("PerformancesThreshold")
    private Integer performancesThreshold;

    @com.aliyun.core.annotation.NameInMap("PerformancesTruncated")
    private Boolean performancesTruncated;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The monitoring information about queries displayed in Gantt charts.</p>
         */
        public Builder performances(java.util.List < Performances> performances) {
            this.performances = performances;
            return this;
        }

        /**
         * <p>The threshold for the number of queries displayed in a Gantt chart. Default value: 10000.</p>
         * <blockquote>
         * <p> Up to 10,000 queries can be displayed in a Gantt chart even if more queries exist.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder performancesThreshold(Integer performancesThreshold) {
            this.performancesThreshold = performancesThreshold;
            return this;
        }

        /**
         * <p>Indicates whether all queries are returned. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder performancesTruncated(Boolean performancesTruncated) {
            this.performancesTruncated = performancesTruncated;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0F1AC5FD-16E9-5399-B81F-5AC434B1D9F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosisMonitorPerformanceResponseBody build() {
            return new DescribeDiagnosisMonitorPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnosisMonitorPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosisMonitorPerformanceResponseBody</p>
     */
    public static class Performances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cost")
        private Long cost;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private Long peakMemory;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("RcHost")
        private String rcHost;

        @com.aliyun.core.annotation.NameInMap("ScanRows")
        private Long scanRows;

        @com.aliyun.core.annotation.NameInMap("ScanSize")
        private Long scanSize;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserName")
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
             * <p>The total execution duration. Unit: milliseconds.</p>
             * <blockquote>
             * <p> This value is the cumulative value of the <code>QueuedTime</code>, <code>TotalPlanningTime</code>, and <code>ExecutionTime</code> parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>252</p>
             */
            public Builder cost(Long cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>The peak memory of the query. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * <p>The query ID.</p>
             * 
             * <strong>example:</strong>
             * <p>202210311015270330101470300315153****</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The IP address of the AnalyticDB for MySQL frontend node on which the SQL statement is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder rcHost(String rcHost) {
                this.rcHost = rcHost;
                return this;
            }

            /**
             * <p>The number of rows scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>2345</p>
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * <p>The amount of scanned data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder scanSize(Long scanSize) {
                this.scanSize = scanSize;
                return this;
            }

            /**
             * <p>The execution start time of the SQL statement. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1669011260000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>running</strong></li>
             * <li><strong>finished</strong></li>
             * <li><strong>failed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The database account that is used to submit the query.</p>
             * 
             * <strong>example:</strong>
             * <p>rpt</p>
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
