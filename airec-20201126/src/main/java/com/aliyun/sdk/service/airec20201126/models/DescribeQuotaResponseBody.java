// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQuotaResponseBody</p>
 */
public class DescribeQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DescribeQuotaResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQuotaResponseBody create() {
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalServerError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>An internal server error occurred</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The quotas of the instance.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeQuotaResponseBody build() {
            return new DescribeQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQuotaResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentQps")
        private Integer currentQps;

        @com.aliyun.core.annotation.NameInMap("itemCount")
        private Long itemCount;

        @com.aliyun.core.annotation.NameInMap("itemCountUsed")
        private Long itemCountUsed;

        @com.aliyun.core.annotation.NameInMap("qps")
        private Integer qps;

        @com.aliyun.core.annotation.NameInMap("userCount")
        private Long userCount;

        @com.aliyun.core.annotation.NameInMap("userCountUsed")
        private Long userCountUsed;

        private Result(Builder builder) {
            this.currentQps = builder.currentQps;
            this.itemCount = builder.itemCount;
            this.itemCountUsed = builder.itemCountUsed;
            this.qps = builder.qps;
            this.userCount = builder.userCount;
            this.userCountUsed = builder.userCountUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return currentQps
         */
        public Integer getCurrentQps() {
            return this.currentQps;
        }

        /**
         * @return itemCount
         */
        public Long getItemCount() {
            return this.itemCount;
        }

        /**
         * @return itemCountUsed
         */
        public Long getItemCountUsed() {
            return this.itemCountUsed;
        }

        /**
         * @return qps
         */
        public Integer getQps() {
            return this.qps;
        }

        /**
         * @return userCount
         */
        public Long getUserCount() {
            return this.userCount;
        }

        /**
         * @return userCountUsed
         */
        public Long getUserCountUsed() {
            return this.userCountUsed;
        }

        public static final class Builder {
            private Integer currentQps; 
            private Long itemCount; 
            private Long itemCountUsed; 
            private Integer qps; 
            private Long userCount; 
            private Long userCountUsed; 

            /**
             * <p>The current QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder currentQps(Integer currentQps) {
                this.currentQps = currentQps;
                return this;
            }

            /**
             * <p>The number of documents in the item table. Valid values:</p>
             * <p>1000000 to 10000000.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder itemCount(Long itemCount) {
                this.itemCount = itemCount;
                return this;
            }

            /**
             * <p>The number of items that are used in the item table.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder itemCountUsed(Long itemCountUsed) {
                this.itemCountUsed = itemCountUsed;
                return this;
            }

            /**
             * <p>The queries per second (QPS). Valid values:</p>
             * <p>10 to 500.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder qps(Integer qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The number of documents in the user table. Valid values:</p>
             * <p>1000000 to 10000000.</p>
             * 
             * <strong>example:</strong>
             * <p>1000000</p>
             */
            public Builder userCount(Long userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * <p>The number of users that are used in the user table.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder userCountUsed(Long userCountUsed) {
                this.userCountUsed = userCountUsed;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
