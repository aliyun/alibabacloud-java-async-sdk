// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeExperimentEnvResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExperimentEnvResponseBody</p>
 */
public class DescribeExperimentEnvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DescribeExperimentEnvResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExperimentEnvResponseBody create() {
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

        public DescribeExperimentEnvResponseBody build() {
            return new DescribeExperimentEnvResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExperimentEnvResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExperimentEnvResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketCount")
        private Integer bucketCount;

        @com.aliyun.core.annotation.NameInMap("divideType")
        private String divideType;

        private Result(Builder builder) {
            this.bucketCount = builder.bucketCount;
            this.divideType = builder.divideType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bucketCount
         */
        public Integer getBucketCount() {
            return this.bucketCount;
        }

        /**
         * @return divideType
         */
        public String getDivideType() {
            return this.divideType;
        }

        public static final class Builder {
            private Integer bucketCount; 
            private String divideType; 

            /**
             * bucketCount.
             */
            public Builder bucketCount(Integer bucketCount) {
                this.bucketCount = bucketCount;
                return this;
            }

            /**
             * divideType.
             */
            public Builder divideType(String divideType) {
                this.divideType = divideType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
