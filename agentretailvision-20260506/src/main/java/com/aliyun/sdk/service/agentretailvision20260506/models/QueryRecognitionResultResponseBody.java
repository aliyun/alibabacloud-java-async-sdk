// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentretailvision20260506.models;

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
 * {@link QueryRecognitionResultResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRecognitionResultResponseBody</p>
 */
public class QueryRecognitionResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryRecognitionResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecognitionResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryRecognitionResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryRecognitionResultResponseBody build() {
            return new QueryRecognitionResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRecognitionResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRecognitionResultResponseBody</p>
     */
    public static class CheckoutInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckoutStatus")
        private String checkoutStatus;

        private CheckoutInfo(Builder builder) {
            this.checkoutStatus = builder.checkoutStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckoutInfo create() {
            return builder().build();
        }

        /**
         * @return checkoutStatus
         */
        public String getCheckoutStatus() {
            return this.checkoutStatus;
        }

        public static final class Builder {
            private String checkoutStatus; 

            private Builder() {
            } 

            private Builder(CheckoutInfo model) {
                this.checkoutStatus = model.checkoutStatus;
            } 

            /**
             * CheckoutStatus.
             */
            public Builder checkoutStatus(String checkoutStatus) {
                this.checkoutStatus = checkoutStatus;
                return this;
            }

            public CheckoutInfo build() {
                return new CheckoutInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRecognitionResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRecognitionResultResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemUniqueId")
        private String itemUniqueId;

        @com.aliyun.core.annotation.NameInMap("PlatformItemId")
        private String platformItemId;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        private Items(Builder builder) {
            this.itemUniqueId = builder.itemUniqueId;
            this.platformItemId = builder.platformItemId;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return itemUniqueId
         */
        public String getItemUniqueId() {
            return this.itemUniqueId;
        }

        /**
         * @return platformItemId
         */
        public String getPlatformItemId() {
            return this.platformItemId;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private String itemUniqueId; 
            private String platformItemId; 
            private Integer quantity; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.itemUniqueId = model.itemUniqueId;
                this.platformItemId = model.platformItemId;
                this.quantity = model.quantity;
            } 

            /**
             * ItemUniqueId.
             */
            public Builder itemUniqueId(String itemUniqueId) {
                this.itemUniqueId = itemUniqueId;
                return this;
            }

            /**
             * PlatformItemId.
             */
            public Builder platformItemId(String platformItemId) {
                this.platformItemId = platformItemId;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRecognitionResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRecognitionResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckoutInfo")
        private CheckoutInfo checkoutInfo;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private Result(Builder builder) {
            this.checkoutInfo = builder.checkoutInfo;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return checkoutInfo
         */
        public CheckoutInfo getCheckoutInfo() {
            return this.checkoutInfo;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private CheckoutInfo checkoutInfo; 
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.checkoutInfo = model.checkoutInfo;
                this.items = model.items;
            } 

            /**
             * CheckoutInfo.
             */
            public Builder checkoutInfo(CheckoutInfo checkoutInfo) {
                this.checkoutInfo = checkoutInfo;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRecognitionResultResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRecognitionResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderUniqueId")
        private String orderUniqueId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private Data(Builder builder) {
            this.orderUniqueId = builder.orderUniqueId;
            this.result = builder.result;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return orderUniqueId
         */
        public String getOrderUniqueId() {
            return this.orderUniqueId;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String orderUniqueId; 
            private Result result; 
            private String taskId; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.orderUniqueId = model.orderUniqueId;
                this.result = model.result;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * OrderUniqueId.
             */
            public Builder orderUniqueId(String orderUniqueId) {
                this.orderUniqueId = orderUniqueId;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
