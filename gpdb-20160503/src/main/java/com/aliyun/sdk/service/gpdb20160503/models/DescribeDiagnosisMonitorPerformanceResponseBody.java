// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeDiagnosisMonitorPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisMonitorPerformanceResponseBody</p>
 */
public class DescribeDiagnosisMonitorPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Performances")
    private java.util.List<Performances> performances;

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
    public java.util.List<Performances> getPerformances() {
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
        private java.util.List<Performances> performances; 
        private Integer performancesThreshold; 
        private Boolean performancesTruncated; 
        private String requestId; 

        /**
         * <p>Details of query execution.</p>
         */
        public Builder performances(java.util.List<Performances> performances) {
            this.performances = performances;
            return this;
        }

        /**
         * <p>The threshold for the number of queries.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder performancesThreshold(Integer performancesThreshold) {
            this.performancesThreshold = performancesThreshold;
            return this;
        }

        /**
         * <p>Indicates whether the queries are truncated when the number of queries exceeds the threshold. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The queries are truncated.</li>
         * <li><strong>false</strong>: The queries are not truncated.</li>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
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
        private Integer cost;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("QueryID")
        private String queryID;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Performances(Builder builder) {
            this.cost = builder.cost;
            this.database = builder.database;
            this.queryID = builder.queryID;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.user = builder.user;
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
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return queryID
         */
        public String getQueryID() {
            return this.queryID;
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
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private Integer cost; 
            private String database; 
            private String queryID; 
            private Long startTime; 
            private String status; 
            private String user; 

            /**
             * <p>The execution duration of the query. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>adbtest</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The ID of the query. It is a unique identifier of the query.</p>
             * 
             * <strong>example:</strong>
             * <p>2022042612465401000000012903151998970</p>
             */
            public Builder queryID(String queryID) {
                this.queryID = queryID;
                return this;
            }

            /**
             * <p>The start time of the query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1651877940000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The execution state of the query. Valid values:</p>
             * <ul>
             * <li><strong>running</strong>: The query is being executed.</li>
             * <li><strong>finished</strong>: The query is complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>adbpguser</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Performances build() {
                return new Performances(this);
            } 

        } 

    }
}
