// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrderResponseBody</p>
 */
public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private CreateOrderResponseBody(Builder builder) {
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

    public static CreateOrderResponseBody create() {
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

        public CreateOrderResponseBody build() {
            return new CreateOrderResponseBody(this);
        } 

    } 

    public static class LmOrderList extends TeaModel {
        @NameInMap("LmOrderId")
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
    public static class ModelLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        private java.util.List < LmOrderList> lmOrderList;

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
        public java.util.List < LmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

        public static final class Builder {
            private java.util.List < LmOrderList> lmOrderList; 

            /**
             * LmOrderList.
             */
            public Builder lmOrderList(java.util.List < LmOrderList> lmOrderList) {
                this.lmOrderList = lmOrderList;
                return this;
            }

            public ModelLmOrderList build() {
                return new ModelLmOrderList(this);
            } 

        } 

    }
    public static class OrderIds extends TeaModel {
        @NameInMap("OrderIds")
        private java.util.List < String > orderIds;

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
        public java.util.List < String > getOrderIds() {
            return this.orderIds;
        }

        public static final class Builder {
            private java.util.List < String > orderIds; 

            /**
             * OrderIds.
             */
            public Builder orderIds(java.util.List < String > orderIds) {
                this.orderIds = orderIds;
                return this;
            }

            public OrderIds build() {
                return new OrderIds(this);
            } 

        } 

    }
    public static class PayTradeIds extends TeaModel {
        @NameInMap("PayTradeIds")
        private java.util.List < String > payTradeIds;

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
        public java.util.List < String > getPayTradeIds() {
            return this.payTradeIds;
        }

        public static final class Builder {
            private java.util.List < String > payTradeIds; 

            /**
             * PayTradeIds.
             */
            public Builder payTradeIds(java.util.List < String > payTradeIds) {
                this.payTradeIds = payTradeIds;
                return this;
            }

            public PayTradeIds build() {
                return new PayTradeIds(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("LmOrderList")
        private ModelLmOrderList lmOrderList;

        @NameInMap("OrderIds")
        private OrderIds orderIds;

        @NameInMap("PayTradeIds")
        private PayTradeIds payTradeIds;

        @NameInMap("RedirectUrl")
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
