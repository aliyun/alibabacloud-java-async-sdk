// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link EnableOrderResponseBody} extends {@link TeaModel}
 *
 * <p>EnableOrderResponseBody</p>
 */
public class EnableOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private EnableOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
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
        private String code; 
        private String logsId; 
        private String message; 
        private Model model; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public EnableOrderResponseBody build() {
            return new EnableOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnableOrderResponseBody} extends {@link TeaModel}
     *
     * <p>EnableOrderResponseBody</p>
     */
    public static class LmOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LmOrderId")
        private String lmOrderId;

        private LmOrderList(Builder builder) {
            this.lmOrderId = builder.lmOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmOrderList create() {
            return builder().build();
        }

        /**
         * @return lmOrderId
         */
        public String getLmOrderId() {
            return this.lmOrderId;
        }

        public static final class Builder {
            private String lmOrderId; 

            /**
             * LmOrderId.
             */
            public Builder lmOrderId(String lmOrderId) {
                this.lmOrderId = lmOrderId;
                return this;
            }

            public LmOrderList build() {
                return new LmOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnableOrderResponseBody} extends {@link TeaModel}
     *
     * <p>EnableOrderResponseBody</p>
     */
    public static class ModelLmOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LmOrderList")
        private java.util.List<LmOrderList> lmOrderList;

        private ModelLmOrderList(Builder builder) {
            this.lmOrderList = builder.lmOrderList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelLmOrderList create() {
            return builder().build();
        }

        /**
         * @return lmOrderList
         */
        public java.util.List<LmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

        public static final class Builder {
            private java.util.List<LmOrderList> lmOrderList; 

            /**
             * LmOrderList.
             */
            public Builder lmOrderList(java.util.List<LmOrderList> lmOrderList) {
                this.lmOrderList = lmOrderList;
                return this;
            }

            public ModelLmOrderList build() {
                return new ModelLmOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnableOrderResponseBody} extends {@link TeaModel}
     *
     * <p>EnableOrderResponseBody</p>
     */
    public static class OrderIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderIds")
        private java.util.List<String> orderIds;

        private OrderIds(Builder builder) {
            this.orderIds = builder.orderIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderIds create() {
            return builder().build();
        }

        /**
         * @return orderIds
         */
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

        public static final class Builder {
            private java.util.List<String> orderIds; 

            /**
             * OrderIds.
             */
            public Builder orderIds(java.util.List<String> orderIds) {
                this.orderIds = orderIds;
                return this;
            }

            public OrderIds build() {
                return new OrderIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnableOrderResponseBody} extends {@link TeaModel}
     *
     * <p>EnableOrderResponseBody</p>
     */
    public static class PayTradeIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PayTradeIds")
        private java.util.List<String> payTradeIds;

        private PayTradeIds(Builder builder) {
            this.payTradeIds = builder.payTradeIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PayTradeIds create() {
            return builder().build();
        }

        /**
         * @return payTradeIds
         */
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

        public static final class Builder {
            private java.util.List<String> payTradeIds; 

            /**
             * PayTradeIds.
             */
            public Builder payTradeIds(java.util.List<String> payTradeIds) {
                this.payTradeIds = payTradeIds;
                return this;
            }

            public PayTradeIds build() {
                return new PayTradeIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnableOrderResponseBody} extends {@link TeaModel}
     *
     * <p>EnableOrderResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LmOrderList")
        private ModelLmOrderList lmOrderList;

        @com.aliyun.core.annotation.NameInMap("OrderIds")
        private OrderIds orderIds;

        @com.aliyun.core.annotation.NameInMap("PayTradeIds")
        private PayTradeIds payTradeIds;

        @com.aliyun.core.annotation.NameInMap("RedirectUrl")
        private String redirectUrl;

        private Model(Builder builder) {
            this.lmOrderList = builder.lmOrderList;
            this.orderIds = builder.orderIds;
            this.payTradeIds = builder.payTradeIds;
            this.redirectUrl = builder.redirectUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return lmOrderList
         */
        public ModelLmOrderList getLmOrderList() {
            return this.lmOrderList;
        }

        /**
         * @return orderIds
         */
        public OrderIds getOrderIds() {
            return this.orderIds;
        }

        /**
         * @return payTradeIds
         */
        public PayTradeIds getPayTradeIds() {
            return this.payTradeIds;
        }

        /**
         * @return redirectUrl
         */
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public static final class Builder {
            private ModelLmOrderList lmOrderList; 
            private OrderIds orderIds; 
            private PayTradeIds payTradeIds; 
            private String redirectUrl; 

            /**
             * LmOrderList.
             */
            public Builder lmOrderList(ModelLmOrderList lmOrderList) {
                this.lmOrderList = lmOrderList;
                return this;
            }

            /**
             * OrderIds.
             */
            public Builder orderIds(OrderIds orderIds) {
                this.orderIds = orderIds;
                return this;
            }

            /**
             * PayTradeIds.
             */
            public Builder payTradeIds(PayTradeIds payTradeIds) {
                this.payTradeIds = payTradeIds;
                return this;
            }

            /**
             * RedirectUrl.
             */
            public Builder redirectUrl(String redirectUrl) {
                this.redirectUrl = redirectUrl;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
