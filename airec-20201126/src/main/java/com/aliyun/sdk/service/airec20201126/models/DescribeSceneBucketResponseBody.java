// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSceneBucketResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSceneBucketResponseBody</p>
 */
public class DescribeSceneBucketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DescribeSceneBucketResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneBucketResponseBody create() {
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

        public DescribeSceneBucketResponseBody build() {
            return new DescribeSceneBucketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSceneBucketResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSceneBucketResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private java.util.Map < String, ? > detail;

        @com.aliyun.core.annotation.NameInMap("inUse")
        private String inUse;

        @com.aliyun.core.annotation.NameInMap("num")
        private Integer num;

        private Result(Builder builder) {
            this.detail = builder.detail;
            this.inUse = builder.inUse;
            this.num = builder.num;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.Map < String, ? > getDetail() {
            return this.detail;
        }

        /**
         * @return inUse
         */
        public String getInUse() {
            return this.inUse;
        }

        /**
         * @return num
         */
        public Integer getNum() {
            return this.num;
        }

        public static final class Builder {
            private java.util.Map < String, ? > detail; 
            private String inUse; 
            private Integer num; 

            /**
             * detail.
             */
            public Builder detail(java.util.Map < String, ? > detail) {
                this.detail = detail;
                return this;
            }

            /**
             * inUse.
             */
            public Builder inUse(String inUse) {
                this.inUse = inUse;
                return this;
            }

            /**
             * num.
             */
            public Builder num(Integer num) {
                this.num = num;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
