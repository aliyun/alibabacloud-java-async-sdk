// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlaybookNumberMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybookNumberMetricsResponseBody</p>
 */
public class DescribePlaybookNumberMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    private Metrics metrics;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePlaybookNumberMetricsResponseBody(Builder builder) {
        this.metrics = builder.metrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlaybookNumberMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return metrics
     */
    public Metrics getMetrics() {
        return this.metrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Metrics metrics; 
        private String requestId; 

        /**
         * Metrics.
         */
        public Builder metrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybookNumberMetricsResponseBody build() {
            return new DescribePlaybookNumberMetricsResponseBody(this);
        } 

    } 

    public static class Metrics extends TeaModel {
        @NameInMap("StartUpNum")
        private Integer startUpNum;

        @NameInMap("TotalNum")
        private Integer totalNum;

        private Metrics(Builder builder) {
            this.startUpNum = builder.startUpNum;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return startUpNum
         */
        public Integer getStartUpNum() {
            return this.startUpNum;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private Integer startUpNum; 
            private Integer totalNum; 

            /**
             * StartUpNum.
             */
            public Builder startUpNum(Integer startUpNum) {
                this.startUpNum = startUpNum;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
}
