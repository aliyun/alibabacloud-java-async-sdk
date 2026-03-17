// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeUserFlowStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserFlowStatisticsResponseBody</p>
 */
public class DescribeUserFlowStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SagStatistics")
    private SagStatistics sagStatistics;

    private DescribeUserFlowStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sagStatistics = builder.sagStatistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserFlowStatisticsResponseBody create() {
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
     * @return sagStatistics
     */
    public SagStatistics getSagStatistics() {
        return this.sagStatistics;
    }

    public static final class Builder {
        private String requestId; 
        private SagStatistics sagStatistics; 

        private Builder() {
        } 

        private Builder(DescribeUserFlowStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.sagStatistics = model.sagStatistics;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9552AD68-18EA-4074-B27D-40040FBA9683</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics of data transfer.</p>
         */
        public Builder sagStatistics(SagStatistics sagStatistics) {
            this.sagStatistics = sagStatistics;
            return this;
        }

        public DescribeUserFlowStatisticsResponseBody build() {
            return new DescribeUserFlowStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserFlowStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserFlowStatisticsResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private String totalBytes;

        @com.aliyun.core.annotation.NameInMap("TotalLeaveBytes")
        private String totalLeaveBytes;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Statistics(Builder builder) {
            this.totalBytes = builder.totalBytes;
            this.totalLeaveBytes = builder.totalLeaveBytes;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return totalBytes
         */
        public String getTotalBytes() {
            return this.totalBytes;
        }

        /**
         * @return totalLeaveBytes
         */
        public String getTotalLeaveBytes() {
            return this.totalLeaveBytes;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String totalBytes; 
            private String totalLeaveBytes; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Statistics model) {
                this.totalBytes = model.totalBytes;
                this.totalLeaveBytes = model.totalLeaveBytes;
                this.userName = model.userName;
            } 

            /**
             * <p>The amount of data consumed. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalBytes(String totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            /**
             * <p>The remaining quota of the free data transfer plan. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder totalLeaveBytes(String totalLeaveBytes) {
                this.totalLeaveBytes = totalLeaveBytes;
                return this;
            }

            /**
             * <p>The username of the client account.</p>
             * 
             * <strong>example:</strong>
             * <p>doctest</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserFlowStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserFlowStatisticsResponseBody</p>
     */
    public static class SagStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Statistics")
        private java.util.List<Statistics> statistics;

        private SagStatistics(Builder builder) {
            this.statistics = builder.statistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SagStatistics create() {
            return builder().build();
        }

        /**
         * @return statistics
         */
        public java.util.List<Statistics> getStatistics() {
            return this.statistics;
        }

        public static final class Builder {
            private java.util.List<Statistics> statistics; 

            private Builder() {
            } 

            private Builder(SagStatistics model) {
                this.statistics = model.statistics;
            } 

            /**
             * Statistics.
             */
            public Builder statistics(java.util.List<Statistics> statistics) {
                this.statistics = statistics;
                return this;
            }

            public SagStatistics build() {
                return new SagStatistics(this);
            } 

        } 

    }
}
