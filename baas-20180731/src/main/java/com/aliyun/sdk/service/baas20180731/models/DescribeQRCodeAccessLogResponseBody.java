// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQRCodeAccessLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQRCodeAccessLogResponseBody</p>
 */
public class DescribeQRCodeAccessLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeQRCodeAccessLogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQRCodeAccessLogResponseBody create() {
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

        public DescribeQRCodeAccessLogResponseBody build() {
            return new DescribeQRCodeAccessLogResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessAlipayAccountCount")
        private Long accessAlipayAccountCount;

        @com.aliyun.core.annotation.NameInMap("AccessCount")
        private Long accessCount;

        private Result(Builder builder) {
            this.accessAlipayAccountCount = builder.accessAlipayAccountCount;
            this.accessCount = builder.accessCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accessAlipayAccountCount
         */
        public Long getAccessAlipayAccountCount() {
            return this.accessAlipayAccountCount;
        }

        /**
         * @return accessCount
         */
        public Long getAccessCount() {
            return this.accessCount;
        }

        public static final class Builder {
            private Long accessAlipayAccountCount; 
            private Long accessCount; 

            /**
             * AccessAlipayAccountCount.
             */
            public Builder accessAlipayAccountCount(Long accessAlipayAccountCount) {
                this.accessAlipayAccountCount = accessAlipayAccountCount;
                return this;
            }

            /**
             * AccessCount.
             */
            public Builder accessCount(Long accessCount) {
                this.accessCount = accessCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
