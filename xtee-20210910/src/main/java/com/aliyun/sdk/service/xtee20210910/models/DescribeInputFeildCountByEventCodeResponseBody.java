// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInputFeildCountByEventCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInputFeildCountByEventCodeResponseBody</p>
 */
public class DescribeInputFeildCountByEventCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeInputFeildCountByEventCodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInputFeildCountByEventCodeResponseBody create() {
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
         * RequestId.
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

        public DescribeInputFeildCountByEventCodeResponseBody build() {
            return new DescribeInputFeildCountByEventCodeResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limit")
        private Boolean limit;

        @com.aliyun.core.annotation.NameInMap("maxTotalItem")
        private Integer maxTotalItem;

        @com.aliyun.core.annotation.NameInMap("totalItem")
        private Integer totalItem;

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
        public Integer getMaxTotalItem() {
            return this.maxTotalItem;
        }

        /**
         * @return totalItem
         */
        public Integer getTotalItem() {
            return this.totalItem;
        }

        public static final class Builder {
            private Boolean limit; 
            private Integer maxTotalItem; 
            private Integer totalItem; 

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
            public Builder maxTotalItem(Integer maxTotalItem) {
                this.maxTotalItem = maxTotalItem;
                return this;
            }

            /**
             * totalItem.
             */
            public Builder totalItem(Integer totalItem) {
                this.totalItem = totalItem;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
