// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

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
 * {@link DescribePvtzStatisticsGlobalOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePvtzStatisticsGlobalOverviewResponseBody</p>
 */
public class DescribePvtzStatisticsGlobalOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePvtzStatisticsGlobalOverviewResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePvtzStatisticsGlobalOverviewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribePvtzStatisticsGlobalOverviewResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0B7AD377-7E86-44A8-B9A8-53E8666E72FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePvtzStatisticsGlobalOverviewResponseBody build() {
            return new DescribePvtzStatisticsGlobalOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePvtzStatisticsGlobalOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePvtzStatisticsGlobalOverviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgResolveLatency")
        private Long avgResolveLatency;

        @com.aliyun.core.annotation.NameInMap("AvgResolveLatencyTrend")
        private Long avgResolveLatencyTrend;

        @com.aliyun.core.annotation.NameInMap("AvgSuccessRatio")
        private Long avgSuccessRatio;

        @com.aliyun.core.annotation.NameInMap("AvgSuccessRatioTrend")
        private Long avgSuccessRatioTrend;

        @com.aliyun.core.annotation.NameInMap("TotalResolveCount")
        private Long totalResolveCount;

        @com.aliyun.core.annotation.NameInMap("TotalResolveCountTrend")
        private Long totalResolveCountTrend;

        private Data(Builder builder) {
            this.avgResolveLatency = builder.avgResolveLatency;
            this.avgResolveLatencyTrend = builder.avgResolveLatencyTrend;
            this.avgSuccessRatio = builder.avgSuccessRatio;
            this.avgSuccessRatioTrend = builder.avgSuccessRatioTrend;
            this.totalResolveCount = builder.totalResolveCount;
            this.totalResolveCountTrend = builder.totalResolveCountTrend;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avgResolveLatency
         */
        public Long getAvgResolveLatency() {
            return this.avgResolveLatency;
        }

        /**
         * @return avgResolveLatencyTrend
         */
        public Long getAvgResolveLatencyTrend() {
            return this.avgResolveLatencyTrend;
        }

        /**
         * @return avgSuccessRatio
         */
        public Long getAvgSuccessRatio() {
            return this.avgSuccessRatio;
        }

        /**
         * @return avgSuccessRatioTrend
         */
        public Long getAvgSuccessRatioTrend() {
            return this.avgSuccessRatioTrend;
        }

        /**
         * @return totalResolveCount
         */
        public Long getTotalResolveCount() {
            return this.totalResolveCount;
        }

        /**
         * @return totalResolveCountTrend
         */
        public Long getTotalResolveCountTrend() {
            return this.totalResolveCountTrend;
        }

        public static final class Builder {
            private Long avgResolveLatency; 
            private Long avgResolveLatencyTrend; 
            private Long avgSuccessRatio; 
            private Long avgSuccessRatioTrend; 
            private Long totalResolveCount; 
            private Long totalResolveCountTrend; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.avgResolveLatency = model.avgResolveLatency;
                this.avgResolveLatencyTrend = model.avgResolveLatencyTrend;
                this.avgSuccessRatio = model.avgSuccessRatio;
                this.avgSuccessRatioTrend = model.avgSuccessRatioTrend;
                this.totalResolveCount = model.totalResolveCount;
                this.totalResolveCountTrend = model.totalResolveCountTrend;
            } 

            /**
             * AvgResolveLatency.
             */
            public Builder avgResolveLatency(Long avgResolveLatency) {
                this.avgResolveLatency = avgResolveLatency;
                return this;
            }

            /**
             * AvgResolveLatencyTrend.
             */
            public Builder avgResolveLatencyTrend(Long avgResolveLatencyTrend) {
                this.avgResolveLatencyTrend = avgResolveLatencyTrend;
                return this;
            }

            /**
             * AvgSuccessRatio.
             */
            public Builder avgSuccessRatio(Long avgSuccessRatio) {
                this.avgSuccessRatio = avgSuccessRatio;
                return this;
            }

            /**
             * AvgSuccessRatioTrend.
             */
            public Builder avgSuccessRatioTrend(Long avgSuccessRatioTrend) {
                this.avgSuccessRatioTrend = avgSuccessRatioTrend;
                return this;
            }

            /**
             * TotalResolveCount.
             */
            public Builder totalResolveCount(Long totalResolveCount) {
                this.totalResolveCount = totalResolveCount;
                return this;
            }

            /**
             * TotalResolveCountTrend.
             */
            public Builder totalResolveCountTrend(Long totalResolveCountTrend) {
                this.totalResolveCountTrend = totalResolveCountTrend;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
