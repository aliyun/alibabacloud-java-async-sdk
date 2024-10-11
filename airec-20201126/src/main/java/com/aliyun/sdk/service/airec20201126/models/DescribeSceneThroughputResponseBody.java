// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSceneThroughputResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSceneThroughputResponseBody</p>
 */
public class DescribeSceneThroughputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DescribeSceneThroughputResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneThroughputResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeSceneThroughputResponseBody build() {
            return new DescribeSceneThroughputResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSceneThroughputResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSceneThroughputResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pvCount")
        private Long pvCount;

        private Result(Builder builder) {
            this.pvCount = builder.pvCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return pvCount
         */
        public Long getPvCount() {
            return this.pvCount;
        }

        public static final class Builder {
            private Long pvCount; 

            /**
             * pvCount.
             */
            public Builder pvCount(Long pvCount) {
                this.pvCount = pvCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
