// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResult4QueryInstancePrice4ModifyResponseBody} extends {@link TeaModel}
 *
 * <p>GetResult4QueryInstancePrice4ModifyResponseBody</p>
 */
public class GetResult4QueryInstancePrice4ModifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetResult4QueryInstancePrice4ModifyResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResult4QueryInstancePrice4ModifyResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResult4QueryInstancePrice4ModifyResponseBody build() {
            return new GetResult4QueryInstancePrice4ModifyResponseBody(this);
        } 

    } 

    public static class PriceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Double discountAmount;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Double originalAmount;

        @com.aliyun.core.annotation.NameInMap("PriceUnit")
        private String priceUnit;

        @com.aliyun.core.annotation.NameInMap("PromotionName")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private Double tradeAmount;

        private PriceList(Builder builder) {
            this.discountAmount = builder.discountAmount;
            this.error = builder.error;
            this.nodeType = builder.nodeType;
            this.originalAmount = builder.originalAmount;
            this.priceUnit = builder.priceUnit;
            this.promotionName = builder.promotionName;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceList create() {
            return builder().build();
        }

        /**
         * @return discountAmount
         */
        public Double getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return originalAmount
         */
        public Double getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return tradeAmount
         */
        public Double getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private Double discountAmount; 
            private String error; 
            private String nodeType; 
            private Double originalAmount; 
            private String priceUnit; 
            private String promotionName; 
            private Double tradeAmount; 

            /**
             * DiscountAmount.
             */
            public Builder discountAmount(Double discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * OriginalAmount.
             */
            public Builder originalAmount(Double originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * PriceUnit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * PromotionName.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * TradeAmount.
             */
            public Builder tradeAmount(Double tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public PriceList build() {
                return new PriceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PriceList")
        private java.util.List < PriceList> priceList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.priceList = builder.priceList;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return priceList
         */
        public java.util.List < PriceList> getPriceList() {
            return this.priceList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private java.util.List < PriceList> priceList; 
            private String status; 
            private String taskId; 

            /**
             * PriceList.
             */
            public Builder priceList(java.util.List < PriceList> priceList) {
                this.priceList = priceList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
