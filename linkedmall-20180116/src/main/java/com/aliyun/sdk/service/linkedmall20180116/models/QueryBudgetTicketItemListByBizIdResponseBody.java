// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBudgetTicketItemListByBizIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBudgetTicketItemListByBizIdResponseBody</p>
 */
public class QueryBudgetTicketItemListByBizIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private java.util.List < Model> model;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryBudgetTicketItemListByBizIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBudgetTicketItemListByBizIdResponseBody create() {
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
    public java.util.List < Model> getModel() {
        return this.model;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
        private String code; 
        private String message; 
        private java.util.List < Model> model; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(java.util.List < Model> model) {
            this.model = model;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryBudgetTicketItemListByBizIdResponseBody build() {
            return new QueryBudgetTicketItemListByBizIdResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("Invalid")
        private Boolean invalid;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("PoCode")
        private String poCode;

        @NameInMap("PromotionId")
        private String promotionId;

        @NameInMap("RemnantAmount")
        private Long remnantAmount;

        @NameInMap("SecurityCode")
        private String securityCode;

        @NameInMap("SettlementPrice")
        private Long settlementPrice;

        @NameInMap("SkuId")
        private Long skuId;

        @NameInMap("SubsidyAmount")
        private Long subsidyAmount;

        private Model(Builder builder) {
            this.invalid = builder.invalid;
            this.itemId = builder.itemId;
            this.poCode = builder.poCode;
            this.promotionId = builder.promotionId;
            this.remnantAmount = builder.remnantAmount;
            this.securityCode = builder.securityCode;
            this.settlementPrice = builder.settlementPrice;
            this.skuId = builder.skuId;
            this.subsidyAmount = builder.subsidyAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return invalid
         */
        public Boolean getInvalid() {
            return this.invalid;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return poCode
         */
        public String getPoCode() {
            return this.poCode;
        }

        /**
         * @return promotionId
         */
        public String getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return remnantAmount
         */
        public Long getRemnantAmount() {
            return this.remnantAmount;
        }

        /**
         * @return securityCode
         */
        public String getSecurityCode() {
            return this.securityCode;
        }

        /**
         * @return settlementPrice
         */
        public Long getSettlementPrice() {
            return this.settlementPrice;
        }

        /**
         * @return skuId
         */
        public Long getSkuId() {
            return this.skuId;
        }

        /**
         * @return subsidyAmount
         */
        public Long getSubsidyAmount() {
            return this.subsidyAmount;
        }

        public static final class Builder {
            private Boolean invalid; 
            private Long itemId; 
            private String poCode; 
            private String promotionId; 
            private Long remnantAmount; 
            private String securityCode; 
            private Long settlementPrice; 
            private Long skuId; 
            private Long subsidyAmount; 

            /**
             * Invalid.
             */
            public Builder invalid(Boolean invalid) {
                this.invalid = invalid;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * PoCode.
             */
            public Builder poCode(String poCode) {
                this.poCode = poCode;
                return this;
            }

            /**
             * PromotionId.
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * RemnantAmount.
             */
            public Builder remnantAmount(Long remnantAmount) {
                this.remnantAmount = remnantAmount;
                return this;
            }

            /**
             * SecurityCode.
             */
            public Builder securityCode(String securityCode) {
                this.securityCode = securityCode;
                return this;
            }

            /**
             * SettlementPrice.
             */
            public Builder settlementPrice(Long settlementPrice) {
                this.settlementPrice = settlementPrice;
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
             * SubsidyAmount.
             */
            public Builder subsidyAmount(Long subsidyAmount) {
                this.subsidyAmount = subsidyAmount;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
