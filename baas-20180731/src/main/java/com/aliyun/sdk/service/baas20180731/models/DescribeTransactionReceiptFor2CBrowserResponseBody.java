// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransactionReceiptFor2CBrowserResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransactionReceiptFor2CBrowserResponseBody</p>
 */
public class DescribeTransactionReceiptFor2CBrowserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeTransactionReceiptFor2CBrowserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransactionReceiptFor2CBrowserResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

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
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeTransactionReceiptFor2CBrowserResponseBody build() {
            return new DescribeTransactionReceiptFor2CBrowserResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("GasUsed")
        private String gasUsed;

        @NameInMap("Logs")
        private java.util.List < String > logs;

        @NameInMap("Result")
        private Long result;

        private Result(Builder builder) {
            this.data = builder.data;
            this.gasUsed = builder.gasUsed;
            this.logs = builder.logs;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return gasUsed
         */
        public String getGasUsed() {
            return this.gasUsed;
        }

        /**
         * @return logs
         */
        public java.util.List < String > getLogs() {
            return this.logs;
        }

        /**
         * @return result
         */
        public Long getResult() {
            return this.result;
        }

        public static final class Builder {
            private String data; 
            private String gasUsed; 
            private java.util.List < String > logs; 
            private Long result; 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * GasUsed.
             */
            public Builder gasUsed(String gasUsed) {
                this.gasUsed = gasUsed;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(java.util.List < String > logs) {
                this.logs = logs;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Long result) {
                this.result = result;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
