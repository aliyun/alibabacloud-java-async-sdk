// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrdersResponseBody</p>
 */
public class ListOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Orders")
    private Orders orders;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The details about the tickets.</p>
         */
        public Builder orders(Orders orders) {
            this.orders = orders;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>427688B8-ADFB-4C4E-9D45-EF5C1FD6E23D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOrdersResponseBody build() {
            return new ListOrdersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrdersResponseBody</p>
     */
    public static class Order extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Committer")
        private String committer;

        @com.aliyun.core.annotation.NameInMap("CommitterId")
        private Long committerId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private String lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("PluginType")
        private String pluginType;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
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
             * <p>The remarks of the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The user who submitted the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder committer(String committer) {
                this.committer = committer;
                return this;
            }

            /**
             * <p>The ID of the user who submitted the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder committerId(Long committerId) {
                this.committerId = committerId;
                return this;
            }

            /**
             * <p>The time when the ticket was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-08 11:15:46</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the ticket was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-08 11:27:45</p>
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>The ID of the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The type of the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>DC_COMMON</p>
             */
            public Builder pluginType(String pluginType) {
                this.pluginType = pluginType;
                return this;
            }

            /**
             * <p>The status code of the ticket. Valid values:</p>
             * <ul>
             * <li><strong>fail</strong>: The ticket fails to be executed.</li>
             * <li><strong>toaudit</strong>: The ticket is waiting for approval.</li>
             * <li><strong>cancel</strong>: The ticket is cancelled.</li>
             * <li><strong>processing</strong>: The ticket is being executed.</li>
             * <li><strong>approved</strong>: The ticket is approved.</li>
             * <li><strong>reject</strong>: The ticket is rejected.</li>
             * <li><strong>success</strong>: The ticket is executed.</li>
             * <li><strong>closed</strong>: The ticket is closed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The status description of the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>changed successfully</p>
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
    /**
     * 
     * {@link ListOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrdersResponseBody</p>
     */
    public static class Orders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
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
