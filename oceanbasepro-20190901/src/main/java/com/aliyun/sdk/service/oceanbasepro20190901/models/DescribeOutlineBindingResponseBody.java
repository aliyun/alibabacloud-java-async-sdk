// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOutlineBindingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOutlineBindingResponseBody</p>
 */
public class DescribeOutlineBindingResponseBody extends TeaModel {
    @NameInMap("OutlineBinding")
    private OutlineBinding outlineBinding;

    @NameInMap("RequestId")
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
         * 绑定信息
         */
        public Builder outlineBinding(OutlineBinding outlineBinding) {
            this.outlineBinding = outlineBinding;
            return this;
        }

        /**
         * 请求ID
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
        @NameInMap("BindIndex")
        private String bindIndex;

        @NameInMap("BindPlan")
        private String bindPlan;

        @NameInMap("MaxConcurrent")
        private Integer maxConcurrent;

        @NameInMap("OutlineId")
        private Long outlineId;

        private OutlineBinding(Builder builder) {
            this.bindIndex = builder.bindIndex;
            this.bindPlan = builder.bindPlan;
            this.maxConcurrent = builder.maxConcurrent;
            this.outlineId = builder.outlineId;
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

        public static final class Builder {
            private String bindIndex; 
            private String bindPlan; 
            private Integer maxConcurrent; 
            private Long outlineId; 

            /**
             * 绑定索引
             */
            public Builder bindIndex(String bindIndex) {
                this.bindIndex = bindIndex;
                return this;
            }

            /**
             * 绑定计划
             */
            public Builder bindPlan(String bindPlan) {
                this.bindPlan = bindPlan;
                return this;
            }

            /**
             * 最大并发
             */
            public Builder maxConcurrent(Integer maxConcurrent) {
                this.maxConcurrent = maxConcurrent;
                return this;
            }

            /**
             * OutlineID
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            public OutlineBinding build() {
                return new OutlineBinding(this);
            } 

        } 

    }
}
