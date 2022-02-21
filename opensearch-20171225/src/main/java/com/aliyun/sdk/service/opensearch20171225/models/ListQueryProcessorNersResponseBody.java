// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryProcessorNersResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueryProcessorNersResponseBody</p>
 */
public class ListQueryProcessorNersResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
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
        @NameInMap("label")
        private String label;

        @NameInMap("order")
        private Integer order;

        @NameInMap("priority")
        private String priority;

        @NameInMap("tag")
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
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * tag.
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
