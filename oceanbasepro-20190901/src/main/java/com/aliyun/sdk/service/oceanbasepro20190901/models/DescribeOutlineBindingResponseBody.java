// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeOutlineBindingResponseBody model) {
            this.outlineBinding = model.outlineBinding;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The binding information.</p>
         */
        public Builder outlineBinding(OutlineBinding outlineBinding) {
            this.outlineBinding = outlineBinding;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOutlineBindingResponseBody build() {
            return new DescribeOutlineBindingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOutlineBindingResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOutlineBindingResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(OutlineBinding model) {
                this.bindIndex = model.bindIndex;
                this.bindPlan = model.bindPlan;
                this.maxConcurrent = model.maxConcurrent;
                this.outlineId = model.outlineId;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The bound index.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIMARY</p>
             */
            public Builder bindIndex(String bindIndex) {
                this.bindIndex = bindIndex;
                return this;
            }

            /**
             * <p>The bound plan.</p>
             * 
             * <strong>example:</strong>
             * <p>PHY_TABLE_SCAN | bmsql_order_line | 40 ******</p>
             */
            public Builder bindPlan(String bindPlan) {
                this.bindPlan = bindPlan;
                return this;
            }

            /**
             * <p>The maximum number of concurrent tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxConcurrent(Integer maxConcurrent) {
                this.maxConcurrent = maxConcurrent;
                return this;
            }

            /**
             * <p>OutlineID.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            /**
             * <p>The name of the tenant. The tenant name must start with a letter or an underscore (<em>), and contain 2 to 20 characters, which can be uppercase letters, lowercase letters, digits, and underscores (</em>). It cannot be set to sys.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster_info</p>
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
