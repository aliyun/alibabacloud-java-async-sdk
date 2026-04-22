// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeInterAuthStatisticsGlobalOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInterAuthStatisticsGlobalOverviewResponseBody</p>
 */
public class DescribeInterAuthStatisticsGlobalOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInterAuthStatisticsGlobalOverviewResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInterAuthStatisticsGlobalOverviewResponseBody create() {
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

        private Builder(DescribeInterAuthStatisticsGlobalOverviewResponseBody model) {
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
         * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInterAuthStatisticsGlobalOverviewResponseBody build() {
            return new DescribeInterAuthStatisticsGlobalOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInterAuthStatisticsGlobalOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInterAuthStatisticsGlobalOverviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgSuccessRatio")
        private Long avgSuccessRatio;

        @com.aliyun.core.annotation.NameInMap("AvgSuccessRatioTrend")
        private Long avgSuccessRatioTrend;

        @com.aliyun.core.annotation.NameInMap("TotalResolveCount")
        private Long totalResolveCount;

        @com.aliyun.core.annotation.NameInMap("TotalResolveCountTrend")
        private Long totalResolveCountTrend;

        private Data(Builder builder) {
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
            private Long avgSuccessRatio; 
            private Long avgSuccessRatioTrend; 
            private Long totalResolveCount; 
            private Long totalResolveCountTrend; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.avgSuccessRatio = model.avgSuccessRatio;
                this.avgSuccessRatioTrend = model.avgSuccessRatioTrend;
                this.totalResolveCount = model.totalResolveCount;
                this.totalResolveCountTrend = model.totalResolveCountTrend;
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
