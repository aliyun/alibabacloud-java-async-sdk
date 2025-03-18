// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeProcessStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProcessStatisticsResponseBody</p>
 */
public class DescribeProcessStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private Metrics metrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProcessStatisticsResponseBody(Builder builder) {
        this.metrics = builder.metrics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeProcessStatisticsResponseBody model) {
            this.metrics = model.metrics;
            this.requestId = model.requestId;
        } 

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

        public DescribeProcessStatisticsResponseBody build() {
            return new DescribeProcessStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProcessStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProcessStatisticsResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BanFileNum")
        private Integer banFileNum;

        @com.aliyun.core.annotation.NameInMap("BanIpNum")
        private Integer banIpNum;

        @com.aliyun.core.annotation.NameInMap("BanProcessNum")
        private Integer banProcessNum;

        @com.aliyun.core.annotation.NameInMap("TaskNum")
        private Integer taskNum;

        private Metrics(Builder builder) {
            this.banFileNum = builder.banFileNum;
            this.banIpNum = builder.banIpNum;
            this.banProcessNum = builder.banProcessNum;
            this.taskNum = builder.taskNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return banFileNum
         */
        public Integer getBanFileNum() {
            return this.banFileNum;
        }

        /**
         * @return banIpNum
         */
        public Integer getBanIpNum() {
            return this.banIpNum;
        }

        /**
         * @return banProcessNum
         */
        public Integer getBanProcessNum() {
            return this.banProcessNum;
        }

        /**
         * @return taskNum
         */
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public static final class Builder {
            private Integer banFileNum; 
            private Integer banIpNum; 
            private Integer banProcessNum; 
            private Integer taskNum; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.banFileNum = model.banFileNum;
                this.banIpNum = model.banIpNum;
                this.banProcessNum = model.banProcessNum;
                this.taskNum = model.taskNum;
            } 

            /**
             * BanFileNum.
             */
            public Builder banFileNum(Integer banFileNum) {
                this.banFileNum = banFileNum;
                return this;
            }

            /**
             * BanIpNum.
             */
            public Builder banIpNum(Integer banIpNum) {
                this.banIpNum = banIpNum;
                return this;
            }

            /**
             * BanProcessNum.
             */
            public Builder banProcessNum(Integer banProcessNum) {
                this.banProcessNum = banProcessNum;
                return this;
            }

            /**
             * TaskNum.
             */
            public Builder taskNum(Integer taskNum) {
                this.taskNum = taskNum;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
}
