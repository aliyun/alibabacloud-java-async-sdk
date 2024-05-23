// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOutlineBindingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutlineBindingResponseBody</p>
 */
public class DescribeOutlineBindingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OutlineBinding")
    private OutlineBinding outlineBinding;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOutlineBindingResponseBody(Builder builder) {
        this.outlineBinding = builder.outlineBinding;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOutlineBindingResponseBody create() {
        return builder().build();
    }

    /**
     * @return outlineBinding
     */
    public OutlineBinding getOutlineBinding() {
        return this.outlineBinding;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OutlineBinding outlineBinding; 
        private String requestId; 

        /**
         * The binding information.
         */
        public Builder outlineBinding(OutlineBinding outlineBinding) {
            this.outlineBinding = outlineBinding;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOutlineBindingResponseBody build() {
            return new DescribeOutlineBindingResponseBody(this);
        } 

    } 

    public static class OutlineBinding extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindIndex")
        private String bindIndex;

        @com.aliyun.core.annotation.NameInMap("BindPlan")
        private String bindPlan;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrent")
        private Integer maxConcurrent;

        @com.aliyun.core.annotation.NameInMap("OutlineId")
        private Long outlineId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private OutlineBinding(Builder builder) {
            this.bindIndex = builder.bindIndex;
            this.bindPlan = builder.bindPlan;
            this.maxConcurrent = builder.maxConcurrent;
            this.outlineId = builder.outlineId;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutlineBinding create() {
            return builder().build();
        }

        /**
         * @return bindIndex
         */
        public String getBindIndex() {
            return this.bindIndex;
        }

        /**
         * @return bindPlan
         */
        public String getBindPlan() {
            return this.bindPlan;
        }

        /**
         * @return maxConcurrent
         */
        public Integer getMaxConcurrent() {
            return this.maxConcurrent;
        }

        /**
         * @return outlineId
         */
        public Long getOutlineId() {
            return this.outlineId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String bindIndex; 
            private String bindPlan; 
            private Integer maxConcurrent; 
            private Long outlineId; 
            private String tableName; 

            /**
             * The bound index.
             */
            public Builder bindIndex(String bindIndex) {
                this.bindIndex = bindIndex;
                return this;
            }

            /**
             * The bound plan.
             */
            public Builder bindPlan(String bindPlan) {
                this.bindPlan = bindPlan;
                return this;
            }

            /**
             * The maximum number of concurrent tasks.
             */
            public Builder maxConcurrent(Integer maxConcurrent) {
                this.maxConcurrent = maxConcurrent;
                return this;
            }

            /**
             * OutlineID.
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            /**
             * 表名称
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public OutlineBinding build() {
                return new OutlineBinding(this);
            } 

        } 

    }
}
