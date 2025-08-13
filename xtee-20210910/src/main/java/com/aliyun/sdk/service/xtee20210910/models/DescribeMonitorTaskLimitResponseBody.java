// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitorTaskLimitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorTaskLimitResponseBody</p>
 */
public class DescribeMonitorTaskLimitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeMonitorTaskLimitResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorTaskLimitResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeMonitorTaskLimitResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeMonitorTaskLimitResponseBody build() {
            return new DescribeMonitorTaskLimitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitorTaskLimitResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorTaskLimitResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.limit = model.limit;
                this.maxTotalItem = model.maxTotalItem;
                this.totalItem = model.totalItem;
            } 

            /**
             * <p>Whether the maximum limit has been reached</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder limit(Boolean limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>Maximum number of items</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxTotalItem(Integer maxTotalItem) {
                this.maxTotalItem = maxTotalItem;
                return this;
            }

            /**
             * <p>Total number of items</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
