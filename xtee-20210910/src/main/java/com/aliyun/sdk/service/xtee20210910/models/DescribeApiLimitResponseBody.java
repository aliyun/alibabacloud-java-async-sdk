// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiLimitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiLimitResponseBody</p>
 */
public class DescribeApiLimitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeApiLimitResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiLimitResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeApiLimitResponseBody build() {
            return new DescribeApiLimitResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limit")
        private Boolean limit;

        @com.aliyun.core.annotation.NameInMap("maxTotalItem")
        private Long maxTotalItem;

        @com.aliyun.core.annotation.NameInMap("totalItem")
        private Long totalItem;

        private ResultObject(Builder builder) {
            this.limit = builder.limit;
            this.maxTotalItem = builder.maxTotalItem;
            this.totalItem = builder.totalItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Boolean getLimit() {
            return this.limit;
        }

        /**
         * @return maxTotalItem
         */
        public Long getMaxTotalItem() {
            return this.maxTotalItem;
        }

        /**
         * @return totalItem
         */
        public Long getTotalItem() {
            return this.totalItem;
        }

        public static final class Builder {
            private Boolean limit; 
            private Long maxTotalItem; 
            private Long totalItem; 

            /**
             * limit.
             */
            public Builder limit(Boolean limit) {
                this.limit = limit;
                return this;
            }

            /**
             * maxTotalItem.
             */
            public Builder maxTotalItem(Long maxTotalItem) {
                this.maxTotalItem = maxTotalItem;
                return this;
            }

            /**
             * totalItem.
             */
            public Builder totalItem(Long totalItem) {
                this.totalItem = totalItem;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
