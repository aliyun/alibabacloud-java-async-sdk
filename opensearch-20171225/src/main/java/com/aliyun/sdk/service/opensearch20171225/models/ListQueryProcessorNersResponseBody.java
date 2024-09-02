// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryProcessorNersResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueryProcessorNersResponseBody</p>
 */
public class ListQueryProcessorNersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The priority settings of entity types.
         * <p>
         * 
         * For more information, see [Priority settings of entity types](~~173616~~).
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListQueryProcessorNersResponseBody build() {
            return new ListQueryProcessorNersResponseBody(this);
        } 

    } 

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

            /**
             * The name of the entity type.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The priority of an entity type among entity types that have the same priority level. A smaller value indicates a higher priority. Default value: 0.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * The priority level of the entity type. Valid values:
             * <p>
             * 
             * *   HIGH
             * *   MIDDLE
             * *   LOW
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The internal name of the entity type.
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
