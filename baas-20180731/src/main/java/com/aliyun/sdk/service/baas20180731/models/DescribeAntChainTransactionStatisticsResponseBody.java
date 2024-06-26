// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainTransactionStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainTransactionStatisticsResponseBody</p>
 */
public class DescribeAntChainTransactionStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private DescribeAntChainTransactionStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainTransactionStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public DescribeAntChainTransactionStatisticsResponseBody build() {
            return new DescribeAntChainTransactionStatisticsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntChainId")
        private String antChainId;

        @com.aliyun.core.annotation.NameInMap("CreatTime")
        private Long creatTime;

        @com.aliyun.core.annotation.NameInMap("Dt")
        private Long dt;

        @com.aliyun.core.annotation.NameInMap("LastSumBlockHeight")
        private Long lastSumBlockHeight;

        @com.aliyun.core.annotation.NameInMap("TransCount")
        private Long transCount;

        private Result(Builder builder) {
            this.antChainId = builder.antChainId;
            this.creatTime = builder.creatTime;
            this.dt = builder.dt;
            this.lastSumBlockHeight = builder.lastSumBlockHeight;
            this.transCount = builder.transCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return antChainId
         */
        public String getAntChainId() {
            return this.antChainId;
        }

        /**
         * @return creatTime
         */
        public Long getCreatTime() {
            return this.creatTime;
        }

        /**
         * @return dt
         */
        public Long getDt() {
            return this.dt;
        }

        /**
         * @return lastSumBlockHeight
         */
        public Long getLastSumBlockHeight() {
            return this.lastSumBlockHeight;
        }

        /**
         * @return transCount
         */
        public Long getTransCount() {
            return this.transCount;
        }

        public static final class Builder {
            private String antChainId; 
            private Long creatTime; 
            private Long dt; 
            private Long lastSumBlockHeight; 
            private Long transCount; 

            /**
             * AntChainId.
             */
            public Builder antChainId(String antChainId) {
                this.antChainId = antChainId;
                return this;
            }

            /**
             * CreatTime.
             */
            public Builder creatTime(Long creatTime) {
                this.creatTime = creatTime;
                return this;
            }

            /**
             * Dt.
             */
            public Builder dt(Long dt) {
                this.dt = dt;
                return this;
            }

            /**
             * LastSumBlockHeight.
             */
            public Builder lastSumBlockHeight(Long lastSumBlockHeight) {
                this.lastSumBlockHeight = lastSumBlockHeight;
                return this;
            }

            /**
             * TransCount.
             */
            public Builder transCount(Long transCount) {
                this.transCount = transCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
