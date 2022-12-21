// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrdersResponseBody</p>
 */
public class ListOrdersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Orders")
    private Orders orders;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListOrdersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.orders = builder.orders;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrdersResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return orders
     */
    public Orders getOrders() {
        return this.orders;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Orders orders; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The details about the tickets.
         */
        public Builder orders(Orders orders) {
            this.orders = orders;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * - **true**: The request was successful.
         * - **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries that are returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOrdersResponseBody build() {
            return new ListOrdersResponseBody(this);
        } 

    } 

    public static class Order extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("Committer")
        private String committer;

        @NameInMap("CommitterId")
        private Long committerId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("LastModifyTime")
        private String lastModifyTime;

        @NameInMap("OrderId")
        private Long orderId;

        @NameInMap("PluginType")
        private String pluginType;

        @NameInMap("StatusCode")
        private String statusCode;

        @NameInMap("StatusDesc")
        private String statusDesc;

        private Order(Builder builder) {
            this.comment = builder.comment;
            this.committer = builder.committer;
            this.committerId = builder.committerId;
            this.createTime = builder.createTime;
            this.lastModifyTime = builder.lastModifyTime;
            this.orderId = builder.orderId;
            this.pluginType = builder.pluginType;
            this.statusCode = builder.statusCode;
            this.statusDesc = builder.statusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return committer
         */
        public String getCommitter() {
            return this.committer;
        }

        /**
         * @return committerId
         */
        public Long getCommitterId() {
            return this.committerId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastModifyTime
         */
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return pluginType
         */
        public String getPluginType() {
            return this.pluginType;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public static final class Builder {
            private String comment; 
            private String committer; 
            private Long committerId; 
            private String createTime; 
            private String lastModifyTime; 
            private Long orderId; 
            private String pluginType; 
            private String statusCode; 
            private String statusDesc; 

            /**
             * The remarks of the ticket.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The user who submitted the ticket.
             */
            public Builder committer(String committer) {
                this.committer = committer;
                return this;
            }

            /**
             * The ID of the user who submitted the ticket.
             */
            public Builder committerId(Long committerId) {
                this.committerId = committerId;
                return this;
            }

            /**
             * The time when the ticket was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the ticket was last modified.
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * The ID of the ticket.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The type of the ticket.
             */
            public Builder pluginType(String pluginType) {
                this.pluginType = pluginType;
                return this;
            }

            /**
             * The status code of the ticket. Valid values:
             * <p>
             * 
             * *   **fail**: The ticket fails to be executed.
             * *   **toaudit**: The ticket is waiting for approval.
             * *   **cancel**: The ticket is cancelled.
             * *   **processing**: The ticket is being executed.
             * *   **approved**: The ticket is approved.
             * *   **reject**: The ticket is rejected.
             * *   **success**: The ticket is executed.
             * *   **closed**: The ticket is closed.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * The status description of the ticket.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
    public static class Orders extends TeaModel {
        @NameInMap("Order")
        private java.util.List < Order> order;

        private Orders(Builder builder) {
            this.order = builder.order;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Orders create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public java.util.List < Order> getOrder() {
            return this.order;
        }

        public static final class Builder {
            private java.util.List < Order> order; 

            /**
             * Order.
             */
            public Builder order(java.util.List < Order> order) {
                this.order = order;
                return this;
            }

            public Orders build() {
                return new Orders(this);
            } 

        } 

    }
}
