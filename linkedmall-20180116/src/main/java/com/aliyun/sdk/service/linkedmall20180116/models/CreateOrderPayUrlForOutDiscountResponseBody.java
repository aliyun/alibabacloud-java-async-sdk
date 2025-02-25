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
 * {@link CreateOrderPayUrlForOutDiscountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrderPayUrlForOutDiscountResponseBody</p>
 */
public class CreateOrderPayUrlForOutDiscountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateOrderPayUrlForOutDiscountResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderPayUrlForOutDiscountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateOrderPayUrlForOutDiscountResponseBody build() {
            return new CreateOrderPayUrlForOutDiscountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrderPayUrlForOutDiscountResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrderPayUrlForOutDiscountResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllIdsMap")
        private java.util.Map<String, java.util.Map<String, ?>> allIdsMap;

        @com.aliyun.core.annotation.NameInMap("LmOrderList")
        private java.util.List<String> lmOrderList;

        @com.aliyun.core.annotation.NameInMap("OrderIds")
        private java.util.List<String> orderIds;

        @com.aliyun.core.annotation.NameInMap("PayTradeIds")
        private java.util.List<String> payTradeIds;

        @com.aliyun.core.annotation.NameInMap("RedirectUrl")
        private String redirectUrl;

        private Model(Builder builder) {
            this.allIdsMap = builder.allIdsMap;
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
         * @return allIdsMap
         */
        public java.util.Map<String, java.util.Map<String, ?>> getAllIdsMap() {
            return this.allIdsMap;
        }

        /**
         * @return lmOrderList
         */
        public java.util.List<String> getLmOrderList() {
            return this.lmOrderList;
        }

        /**
         * @return orderIds
         */
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

        /**
         * @return payTradeIds
         */
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

        /**
         * @return redirectUrl
         */
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public static final class Builder {
            private java.util.Map<String, java.util.Map<String, ?>> allIdsMap; 
            private java.util.List<String> lmOrderList; 
            private java.util.List<String> orderIds; 
            private java.util.List<String> payTradeIds; 
            private String redirectUrl; 

            /**
             * AllIdsMap.
             */
            public Builder allIdsMap(java.util.Map<String, java.util.Map<String, ?>> allIdsMap) {
                this.allIdsMap = allIdsMap;
                return this;
            }

            /**
             * LmOrderList.
             */
            public Builder lmOrderList(java.util.List<String> lmOrderList) {
                this.lmOrderList = lmOrderList;
                return this;
            }

            /**
             * OrderIds.
             */
            public Builder orderIds(java.util.List<String> orderIds) {
                this.orderIds = orderIds;
                return this;
            }

            /**
             * PayTradeIds.
             */
            public Builder payTradeIds(java.util.List<String> payTradeIds) {
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
