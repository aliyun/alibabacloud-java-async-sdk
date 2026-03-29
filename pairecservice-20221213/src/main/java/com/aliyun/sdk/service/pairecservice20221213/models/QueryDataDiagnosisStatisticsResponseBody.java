// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link QueryDataDiagnosisStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDataDiagnosisStatisticsResponseBody</p>
 */
public class QueryDataDiagnosisStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Statistics")
    private Statistics statistics;

    private QueryDataDiagnosisStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statistics = builder.statistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDataDiagnosisStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statistics
     */
    public Statistics getStatistics() {
        return this.statistics;
    }

    public static final class Builder {
        private String requestId; 
        private Statistics statistics; 

        private Builder() {
        } 

        private Builder(QueryDataDiagnosisStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.statistics = model.statistics;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Statistics.
         */
        public Builder statistics(Statistics statistics) {
            this.statistics = statistics;
            return this;
        }

        public QueryDataDiagnosisStatisticsResponseBody build() {
            return new QueryDataDiagnosisStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDataDiagnosisStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDataDiagnosisStatisticsResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedDates")
        private java.util.List<String> failedDates;

        @com.aliyun.core.annotation.NameInMap("NoDataDates")
        private java.util.List<String> noDataDates;

        private Statistics(Builder builder) {
            this.failedDates = builder.failedDates;
            this.noDataDates = builder.noDataDates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return failedDates
         */
        public java.util.List<String> getFailedDates() {
            return this.failedDates;
        }

        /**
         * @return noDataDates
         */
        public java.util.List<String> getNoDataDates() {
            return this.noDataDates;
        }

        public static final class Builder {
            private java.util.List<String> failedDates; 
            private java.util.List<String> noDataDates; 

            private Builder() {
            } 

            private Builder(Statistics model) {
                this.failedDates = model.failedDates;
                this.noDataDates = model.noDataDates;
            } 

            /**
             * FailedDates.
             */
            public Builder failedDates(java.util.List<String> failedDates) {
                this.failedDates = failedDates;
                return this;
            }

            /**
             * NoDataDates.
             */
            public Builder noDataDates(java.util.List<String> noDataDates) {
                this.noDataDates = noDataDates;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
