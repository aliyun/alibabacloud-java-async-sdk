// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQuotaResponseBody</p>
 */
public class DescribeQuotaResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

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

        public DescribeQuotaResponseBody build() {
            return new DescribeQuotaResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("CurrentQps")
        private Integer currentQps;

        @NameInMap("ItemCount")
        private Long itemCount;

        @NameInMap("ItemCountUsed")
        private Long itemCountUsed;

        @NameInMap("Qps")
        private Integer qps;

        @NameInMap("UserCount")
        private Long userCount;

        @NameInMap("UserCountUsed")
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
             * CurrentQps.
             */
            public Builder currentQps(Integer currentQps) {
                this.currentQps = currentQps;
                return this;
            }

            /**
             * ItemCount.
             */
            public Builder itemCount(Long itemCount) {
                this.itemCount = itemCount;
                return this;
            }

            /**
             * ItemCountUsed.
             */
            public Builder itemCountUsed(Long itemCountUsed) {
                this.itemCountUsed = itemCountUsed;
                return this;
            }

            /**
             * Qps.
             */
            public Builder qps(Integer qps) {
                this.qps = qps;
                return this;
            }

            /**
             * UserCount.
             */
            public Builder userCount(Long userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * UserCountUsed.
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
