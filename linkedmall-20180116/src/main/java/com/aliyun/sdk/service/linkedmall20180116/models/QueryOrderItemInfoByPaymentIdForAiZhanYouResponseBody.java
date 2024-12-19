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
 * {@link QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody</p>
 */
public class QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LmOrderList")
    private LmOrderList lmOrderList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody(Builder builder) {
        this.code = builder.code;
        this.lmOrderList = builder.lmOrderList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return lmOrderList
     */
    public LmOrderList getLmOrderList() {
        return this.lmOrderList;
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

    public static final class Builder {
        private String code; 
        private LmOrderList lmOrderList; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LmOrderList.
         */
        public Builder lmOrderList(LmOrderList lmOrderList) {
            this.lmOrderList = lmOrderList;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody build() {
            return new QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody</p>
     */
    public static class LmOrderListLmOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("LmItemId")
        private String lmItemId;

        @com.aliyun.core.annotation.NameInMap("LmOrderId")
        private Long lmOrderId;

        @com.aliyun.core.annotation.NameInMap("SkuId")
        private Long skuId;

        @com.aliyun.core.annotation.NameInMap("SkuName")
        private String skuName;

        private LmOrderListLmOrderList(Builder builder) {
            this.itemId = builder.itemId;
            this.itemName = builder.itemName;
            this.lmItemId = builder.lmItemId;
            this.lmOrderId = builder.lmOrderId;
            this.skuId = builder.skuId;
            this.skuName = builder.skuName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmOrderListLmOrderList create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return lmOrderId
         */
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return skuName
         */
        public String getSkuName() {
            return this.skuName;
        }

        public static final class Builder {
            private Long itemId; 
            private String itemName; 
            private String lmItemId; 
            private Long lmOrderId; 
            private Long skuId; 
            private String skuName; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
                return this;
            }

            /**
             * LmOrderId.
             */
            public Builder lmOrderId(Long lmOrderId) {
                this.lmOrderId = lmOrderId;
                return this;
            }

            /**
             * SkuId.
             */
            public Builder skuId(Long skuId) {
                this.skuId = skuId;
                return this;
            }

            /**
             * SkuName.
             */
            public Builder skuName(String skuName) {
                this.skuName = skuName;
                return this;
            }

            public LmOrderListLmOrderList build() {
                return new LmOrderListLmOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderItemInfoByPaymentIdForAiZhanYouResponseBody</p>
     */
    public static class LmOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LmOrderList")
        private java.util.List<LmOrderListLmOrderList> lmOrderList;

        private LmOrderList(Builder builder) {
            this.lmOrderList = builder.lmOrderList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmOrderList create() {
            return builder().build();
        }

        /**
         * @return lmOrderList
         */
        public java.util.List<LmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

        public static final class Builder {
            private java.util.List<LmOrderListLmOrderList> lmOrderList; 

            /**
             * LmOrderList.
             */
            public Builder lmOrderList(java.util.List<LmOrderListLmOrderList> lmOrderList) {
                this.lmOrderList = lmOrderList;
                return this;
            }

            public LmOrderList build() {
                return new LmOrderList(this);
            } 

        } 

    }
}
