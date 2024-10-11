// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFlowControlTaskInvalidItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowControlTaskInvalidItemsResponseBody</p>
 */
public class ListFlowControlTaskInvalidItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListFlowControlTaskInvalidItemsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowControlTaskInvalidItemsResponseBody create() {
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

        public ListFlowControlTaskInvalidItemsResponseBody build() {
            return new ListFlowControlTaskInvalidItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFlowControlTaskInvalidItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskInvalidItemsResponseBody</p>
     */
    public static class InvalidItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("itemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("itemType")
        private String itemType;

        private InvalidItems(Builder builder) {
            this.itemId = builder.itemId;
            this.itemType = builder.itemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidItems create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        public static final class Builder {
            private String itemId; 
            private String itemType; 

            /**
             * itemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * itemType.
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            public InvalidItems build() {
                return new InvalidItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFlowControlTaskInvalidItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskInvalidItemsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("invalidItems")
        private java.util.List < InvalidItems> invalidItems;

        private Result(Builder builder) {
            this.invalidItems = builder.invalidItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return invalidItems
         */
        public java.util.List < InvalidItems> getInvalidItems() {
            return this.invalidItems;
        }

        public static final class Builder {
            private java.util.List < InvalidItems> invalidItems; 

            /**
             * invalidItems.
             */
            public Builder invalidItems(java.util.List < InvalidItems> invalidItems) {
                this.invalidItems = invalidItems;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
