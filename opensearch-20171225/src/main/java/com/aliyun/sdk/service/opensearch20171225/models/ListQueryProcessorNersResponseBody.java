// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ListQueryProcessorNersResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueryProcessorNersResponseBody</p>
 */
public class ListQueryProcessorNersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    private ListQueryProcessorNersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryProcessorNersResponseBody create() {
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListQueryProcessorNersResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The priority settings of entity types.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/173616.html">Priority settings of entity types</a>.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListQueryProcessorNersResponseBody build() {
            return new ListQueryProcessorNersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQueryProcessorNersResponseBody} extends {@link TeaModel}
     *
     * <p>ListQueryProcessorNersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("tag")
        private String tag;

        private Result(Builder builder) {
            this.label = builder.label;
            this.order = builder.order;
            this.priority = builder.priority;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String label; 
            private Integer order; 
            private String priority; 
            private String tag; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.label = model.label;
                this.order = model.order;
                this.priority = model.priority;
                this.tag = model.tag;
            } 

            /**
             * <p>The name of the entity type.</p>
             * 
             * <strong>example:</strong>
             * <p>brand</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The priority of an entity type among entity types that have the same priority level. A smaller value indicates a higher priority. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The priority level of the entity type. Valid values:</p>
             * <ul>
             * <li>HIGH</li>
             * <li>MIDDLE</li>
             * <li>LOW</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The internal name of the entity type.</p>
             * 
             * <strong>example:</strong>
             * <p>brand</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
