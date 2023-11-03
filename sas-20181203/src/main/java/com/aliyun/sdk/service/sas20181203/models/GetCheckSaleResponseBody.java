// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckSaleResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckSaleResponseBody</p>
 */
public class GetCheckSaleResponseBody extends TeaModel {
    @NameInMap("CheckSale")
    private CheckSale checkSale;

    @NameInMap("RequestId")
    private String requestId;

    private GetCheckSaleResponseBody(Builder builder) {
        this.checkSale = builder.checkSale;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckSaleResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkSale
     */
    public CheckSale getCheckSale() {
        return this.checkSale;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CheckSale checkSale; 
        private String requestId; 

        /**
         * CheckSale.
         */
        public Builder checkSale(CheckSale checkSale) {
            this.checkSale = checkSale;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCheckSaleResponseBody build() {
            return new GetCheckSaleResponseBody(this);
        } 

    } 

    public static class CheckSale extends TeaModel {
        @NameInMap("ConsumeCount")
        private Long consumeCount;

        @NameInMap("LoyalUser")
        private Boolean loyalUser;

        @NameInMap("PurchaseCount")
        private Long purchaseCount;

        @NameInMap("SaleUserType")
        private Integer saleUserType;

        private CheckSale(Builder builder) {
            this.consumeCount = builder.consumeCount;
            this.loyalUser = builder.loyalUser;
            this.purchaseCount = builder.purchaseCount;
            this.saleUserType = builder.saleUserType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckSale create() {
            return builder().build();
        }

        /**
         * @return consumeCount
         */
        public Long getConsumeCount() {
            return this.consumeCount;
        }

        /**
         * @return loyalUser
         */
        public Boolean getLoyalUser() {
            return this.loyalUser;
        }

        /**
         * @return purchaseCount
         */
        public Long getPurchaseCount() {
            return this.purchaseCount;
        }

        /**
         * @return saleUserType
         */
        public Integer getSaleUserType() {
            return this.saleUserType;
        }

        public static final class Builder {
            private Long consumeCount; 
            private Boolean loyalUser; 
            private Long purchaseCount; 
            private Integer saleUserType; 

            /**
             * ConsumeCount.
             */
            public Builder consumeCount(Long consumeCount) {
                this.consumeCount = consumeCount;
                return this;
            }

            /**
             * LoyalUser.
             */
            public Builder loyalUser(Boolean loyalUser) {
                this.loyalUser = loyalUser;
                return this;
            }

            /**
             * PurchaseCount.
             */
            public Builder purchaseCount(Long purchaseCount) {
                this.purchaseCount = purchaseCount;
                return this;
            }

            /**
             * SaleUserType.
             */
            public Builder saleUserType(Integer saleUserType) {
                this.saleUserType = saleUserType;
                return this;
            }

            public CheckSale build() {
                return new CheckSale(this);
            } 

        } 

    }
}
