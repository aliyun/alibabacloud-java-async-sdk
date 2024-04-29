// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckSaleResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckSaleResponseBody</p>
 */
public class GetCheckSaleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckSale")
    private CheckSale checkSale;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The sales information about the configuration assessment quota.
         */
        public Builder checkSale(CheckSale checkSale) {
            this.checkSale = checkSale;
            return this;
        }

        /**
         * The request ID.
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
        @com.aliyun.core.annotation.NameInMap("ConsumeCount")
        private Long consumeCount;

        @com.aliyun.core.annotation.NameInMap("LoyalUser")
        private Boolean loyalUser;

        @com.aliyun.core.annotation.NameInMap("PurchaseCount")
        private Long purchaseCount;

        @com.aliyun.core.annotation.NameInMap("SaleUserType")
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
             * The consumed quota.
             */
            public Builder consumeCount(Long consumeCount) {
                this.consumeCount = consumeCount;
                return this;
            }

            /**
             * Indicates whether the user is an existing user and whether the user uses the configuration assessment feature before the feature is released for sale on July 07, 2023. Valid values:
             * <p>
             * 
             * *   **true**: existing user
             * *   **false**: new user
             */
            public Builder loyalUser(Boolean loyalUser) {
                this.loyalUser = loyalUser;
                return this;
            }

            /**
             * The purchased quota.
             */
            public Builder purchaseCount(Long purchaseCount) {
                this.purchaseCount = purchaseCount;
                return this;
            }

            /**
             * The type of the user. Valid values:
             * <p>
             * 
             * *   **1**: a user who can use all check items.
             * *   **2**: an user who can only use the check items before the release of the feature on July 07, 2023. This type of users must upgrade Security Center before the users can use all check items.
             * *   **3**: a new user who cannot use the configuration assessment feature. This type of users must make a purchase before the users can use the feature.
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
