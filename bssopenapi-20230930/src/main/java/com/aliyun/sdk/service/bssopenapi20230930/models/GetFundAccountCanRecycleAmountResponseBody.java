// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link GetFundAccountCanRecycleAmountResponseBody} extends {@link TeaModel}
 *
 * <p>GetFundAccountCanRecycleAmountResponseBody</p>
 */
public class GetFundAccountCanRecycleAmountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableAmount")
    private String availableAmount;

    @com.aliyun.core.annotation.NameInMap("Currency")
    private String currency;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RecycleFromFundAccountId")
    private String recycleFromFundAccountId;

    @com.aliyun.core.annotation.NameInMap("RecycleToFundAccountList")
    private java.util.List<RecycleToFundAccountList> recycleToFundAccountList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransferAmount")
    private String transferAmount;

    private GetFundAccountCanRecycleAmountResponseBody(Builder builder) {
        this.availableAmount = builder.availableAmount;
        this.currency = builder.currency;
        this.metadata = builder.metadata;
        this.recycleFromFundAccountId = builder.recycleFromFundAccountId;
        this.recycleToFundAccountList = builder.recycleToFundAccountList;
        this.requestId = builder.requestId;
        this.transferAmount = builder.transferAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFundAccountCanRecycleAmountResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableAmount
     */
    public String getAvailableAmount() {
        return this.availableAmount;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return recycleFromFundAccountId
     */
    public String getRecycleFromFundAccountId() {
        return this.recycleFromFundAccountId;
    }

    /**
     * @return recycleToFundAccountList
     */
    public java.util.List<RecycleToFundAccountList> getRecycleToFundAccountList() {
        return this.recycleToFundAccountList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transferAmount
     */
    public String getTransferAmount() {
        return this.transferAmount;
    }

    public static final class Builder {
        private String availableAmount; 
        private String currency; 
        private Object metadata; 
        private String recycleFromFundAccountId; 
        private java.util.List<RecycleToFundAccountList> recycleToFundAccountList; 
        private String requestId; 
        private String transferAmount; 

        /**
         * AvailableAmount.
         */
        public Builder availableAmount(String availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * RecycleFromFundAccountId.
         */
        public Builder recycleFromFundAccountId(String recycleFromFundAccountId) {
            this.recycleFromFundAccountId = recycleFromFundAccountId;
            return this;
        }

        /**
         * RecycleToFundAccountList.
         */
        public Builder recycleToFundAccountList(java.util.List<RecycleToFundAccountList> recycleToFundAccountList) {
            this.recycleToFundAccountList = recycleToFundAccountList;
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
         * TransferAmount.
         */
        public Builder transferAmount(String transferAmount) {
            this.transferAmount = transferAmount;
            return this;
        }

        public GetFundAccountCanRecycleAmountResponseBody build() {
            return new GetFundAccountCanRecycleAmountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFundAccountCanRecycleAmountResponseBody} extends {@link TeaModel}
     *
     * <p>GetFundAccountCanRecycleAmountResponseBody</p>
     */
    public static class RecycleToFundAccountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FundAccountId")
        private String fundAccountId;

        @com.aliyun.core.annotation.NameInMap("FundAccountName")
        private String fundAccountName;

        @com.aliyun.core.annotation.NameInMap("FundAccountOwnerAccountId")
        private String fundAccountOwnerAccountId;

        @com.aliyun.core.annotation.NameInMap("MaxRecyclableAmount")
        private String maxRecyclableAmount;

        @com.aliyun.core.annotation.NameInMap("OriginalTransferRemainAmount")
        private String originalTransferRemainAmount;

        private RecycleToFundAccountList(Builder builder) {
            this.fundAccountId = builder.fundAccountId;
            this.fundAccountName = builder.fundAccountName;
            this.fundAccountOwnerAccountId = builder.fundAccountOwnerAccountId;
            this.maxRecyclableAmount = builder.maxRecyclableAmount;
            this.originalTransferRemainAmount = builder.originalTransferRemainAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecycleToFundAccountList create() {
            return builder().build();
        }

        /**
         * @return fundAccountId
         */
        public String getFundAccountId() {
            return this.fundAccountId;
        }

        /**
         * @return fundAccountName
         */
        public String getFundAccountName() {
            return this.fundAccountName;
        }

        /**
         * @return fundAccountOwnerAccountId
         */
        public String getFundAccountOwnerAccountId() {
            return this.fundAccountOwnerAccountId;
        }

        /**
         * @return maxRecyclableAmount
         */
        public String getMaxRecyclableAmount() {
            return this.maxRecyclableAmount;
        }

        /**
         * @return originalTransferRemainAmount
         */
        public String getOriginalTransferRemainAmount() {
            return this.originalTransferRemainAmount;
        }

        public static final class Builder {
            private String fundAccountId; 
            private String fundAccountName; 
            private String fundAccountOwnerAccountId; 
            private String maxRecyclableAmount; 
            private String originalTransferRemainAmount; 

            /**
             * FundAccountId.
             */
            public Builder fundAccountId(String fundAccountId) {
                this.fundAccountId = fundAccountId;
                return this;
            }

            /**
             * FundAccountName.
             */
            public Builder fundAccountName(String fundAccountName) {
                this.fundAccountName = fundAccountName;
                return this;
            }

            /**
             * FundAccountOwnerAccountId.
             */
            public Builder fundAccountOwnerAccountId(String fundAccountOwnerAccountId) {
                this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
                return this;
            }

            /**
             * MaxRecyclableAmount.
             */
            public Builder maxRecyclableAmount(String maxRecyclableAmount) {
                this.maxRecyclableAmount = maxRecyclableAmount;
                return this;
            }

            /**
             * OriginalTransferRemainAmount.
             */
            public Builder originalTransferRemainAmount(String originalTransferRemainAmount) {
                this.originalTransferRemainAmount = originalTransferRemainAmount;
                return this;
            }

            public RecycleToFundAccountList build() {
                return new RecycleToFundAccountList(this);
            } 

        } 

    }
}
