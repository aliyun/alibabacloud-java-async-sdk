// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The sales information about the configuration assessment quota.</p>
         */
        public Builder checkSale(CheckSale checkSale) {
            this.checkSale = checkSale;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCheckSaleResponseBody build() {
            return new GetCheckSaleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCheckSaleResponseBody} extends {@link TeaModel}
     *
     * <p>GetCheckSaleResponseBody</p>
     */
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
             * <p>The consumed quota.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder consumeCount(Long consumeCount) {
                this.consumeCount = consumeCount;
                return this;
            }

            /**
             * <p>Indicates whether the user is an existing user and whether the user uses the configuration assessment feature before the feature is released for sale on July 07, 2023. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: existing user</li>
             * <li><strong>false</strong>: new user</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder loyalUser(Boolean loyalUser) {
                this.loyalUser = loyalUser;
                return this;
            }

            /**
             * <p>The purchased quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder purchaseCount(Long purchaseCount) {
                this.purchaseCount = purchaseCount;
                return this;
            }

            /**
             * <p>The type of the user. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: a user who can use all check items.</li>
             * <li><strong>2</strong>: an user who can only use the check items before the release of the feature on July 07, 2023. This type of users must upgrade Security Center before the users can use all check items.</li>
             * <li><strong>3</strong>: a new user who cannot use the configuration assessment feature. This type of users must make a purchase before the users can use the feature.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
