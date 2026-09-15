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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetCheckSaleResponseBody model) {
            this.checkSale = model.checkSale;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The sales information of cloud service configuration check.</p>
         */
        public Builder checkSale(CheckSale checkSale) {
            this.checkSale = checkSale;
            return this;
        }

        /**
         * <p>The ID of the request. The China Cloud generates a unique identifier for the request, which can be used for troubleshooting and diagnostics.</p>
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

        @com.aliyun.core.annotation.NameInMap("InstanceConsumeCount")
        private Long instanceConsumeCount;

        @com.aliyun.core.annotation.NameInMap("InstanceHybridPostLatestCycledResourceCount")
        private Long instanceHybridPostLatestCycledResourceCount;

        @com.aliyun.core.annotation.NameInMap("InstancePostConsumeCount")
        private Long instancePostConsumeCount;

        @com.aliyun.core.annotation.NameInMap("InstancePurchaseCount")
        private Long instancePurchaseCount;

        @com.aliyun.core.annotation.NameInMap("LoyalUser")
        private Boolean loyalUser;

        @com.aliyun.core.annotation.NameInMap("PurchaseCount")
        private Long purchaseCount;

        @com.aliyun.core.annotation.NameInMap("SaleUserType")
        private Integer saleUserType;

        private CheckSale(Builder builder) {
            this.consumeCount = builder.consumeCount;
            this.instanceConsumeCount = builder.instanceConsumeCount;
            this.instanceHybridPostLatestCycledResourceCount = builder.instanceHybridPostLatestCycledResourceCount;
            this.instancePostConsumeCount = builder.instancePostConsumeCount;
            this.instancePurchaseCount = builder.instancePurchaseCount;
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
         * @return instanceConsumeCount
         */
        public Long getInstanceConsumeCount() {
            return this.instanceConsumeCount;
        }

        /**
         * @return instanceHybridPostLatestCycledResourceCount
         */
        public Long getInstanceHybridPostLatestCycledResourceCount() {
            return this.instanceHybridPostLatestCycledResourceCount;
        }

        /**
         * @return instancePostConsumeCount
         */
        public Long getInstancePostConsumeCount() {
            return this.instancePostConsumeCount;
        }

        /**
         * @return instancePurchaseCount
         */
        public Long getInstancePurchaseCount() {
            return this.instancePurchaseCount;
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
            private Long instanceConsumeCount; 
            private Long instanceHybridPostLatestCycledResourceCount; 
            private Long instancePostConsumeCount; 
            private Long instancePurchaseCount; 
            private Boolean loyalUser; 
            private Long purchaseCount; 
            private Integer saleUserType; 

            private Builder() {
            } 

            private Builder(CheckSale model) {
                this.consumeCount = model.consumeCount;
                this.instanceConsumeCount = model.instanceConsumeCount;
                this.instanceHybridPostLatestCycledResourceCount = model.instanceHybridPostLatestCycledResourceCount;
                this.instancePostConsumeCount = model.instancePostConsumeCount;
                this.instancePurchaseCount = model.instancePurchaseCount;
                this.loyalUser = model.loyalUser;
                this.purchaseCount = model.purchaseCount;
                this.saleUserType = model.saleUserType;
            } 

            /**
             * <p>The number of consumed authorized quotas.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder consumeCount(Long consumeCount) {
                this.consumeCount = consumeCount;
                return this;
            }

            /**
             * InstanceConsumeCount.
             */
            public Builder instanceConsumeCount(Long instanceConsumeCount) {
                this.instanceConsumeCount = instanceConsumeCount;
                return this;
            }

            /**
             * InstanceHybridPostLatestCycledResourceCount.
             */
            public Builder instanceHybridPostLatestCycledResourceCount(Long instanceHybridPostLatestCycledResourceCount) {
                this.instanceHybridPostLatestCycledResourceCount = instanceHybridPostLatestCycledResourceCount;
                return this;
            }

            /**
             * InstancePostConsumeCount.
             */
            public Builder instancePostConsumeCount(Long instancePostConsumeCount) {
                this.instancePostConsumeCount = instancePostConsumeCount;
                return this;
            }

            /**
             * InstancePurchaseCount.
             */
            public Builder instancePurchaseCount(Long instancePurchaseCount) {
                this.instancePurchaseCount = instancePurchaseCount;
                return this;
            }

            /**
             * <p>Indicates whether the user is an existing user who used the cloud service configuration check feature before the sales feature was released (July 7, 2023). Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The user is an existing user.</li>
             * <li><strong>false</strong>: The user is not an existing user.</li>
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
             * <p>The number of purchased authorized quotas.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder purchaseCount(Long purchaseCount) {
                this.purchaseCount = purchaseCount;
                return this;
            }

            /**
             * <p>The sales user type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Full-feature user. The user can use all check items.</li>
             * <li><strong>2</strong>: Upgrade-required user. The user can use only the check items that were available before the sales feature was released (July 7, 2023).</li>
             * <li><strong>3</strong>: Purchase-required user. The user cannot use the cloud service configuration check feature.</li>
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
