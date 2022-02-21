// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneThroughputResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSceneThroughputResponseBody</p>
 */
public class DescribeSceneThroughputResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribeSceneThroughputResponseBody(Builder builder) {
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

        public DescribeSceneThroughputResponseBody build() {
            return new DescribeSceneThroughputResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("PvCount")
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
             * PvCount.
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
