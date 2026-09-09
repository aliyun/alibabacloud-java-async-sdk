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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetFundAccountCanRecycleAmountResponseBody model) {
            this.availableAmount = model.availableAmount;
            this.currency = model.currency;
            this.metadata = model.metadata;
            this.recycleFromFundAccountId = model.recycleFromFundAccountId;
            this.recycleToFundAccountList = model.recycleToFundAccountList;
            this.requestId = model.requestId;
            this.transferAmount = model.transferAmount;
        } 

        /**
         * <p>The available balance of the account from which funds are reclaimed.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder availableAmount(String availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }

        /**
         * <p>The currency.</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * <p>The metadata of the response struct.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The ID of the source account from which funds are reclaimed.</p>
         * 
         * <strong>example:</strong>
         * <p>1232122132</p>
         */
        public Builder recycleFromFundAccountId(String recycleFromFundAccountId) {
            this.recycleFromFundAccountId = recycleFromFundAccountId;
            return this;
        }

        /**
         * <p>The list of accounts to which funds can be reclaimed.</p>
         */
        public Builder recycleToFundAccountList(java.util.List<RecycleToFundAccountList> recycleToFundAccountList) {
            this.recycleToFundAccountList = recycleToFundAccountList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The transfer ledger balance.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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

            private Builder() {
            } 

            private Builder(RecycleToFundAccountList model) {
                this.fundAccountId = model.fundAccountId;
                this.fundAccountName = model.fundAccountName;
                this.fundAccountOwnerAccountId = model.fundAccountOwnerAccountId;
                this.maxRecyclableAmount = model.maxRecyclableAmount;
                this.originalTransferRemainAmount = model.originalTransferRemainAmount;
            } 

            /**
             * <p>The ID of the target account to which funds can be reclaimed.</p>
             * 
             * <strong>example:</strong>
             * <p>122323121</p>
             */
            public Builder fundAccountId(String fundAccountId) {
                this.fundAccountId = fundAccountId;
                return this;
            }

            /**
             * <p>The name of the target account to which funds can be reclaimed.</p>
             * 
             * <strong>example:</strong>
             * <p>云某的账户</p>
             */
            public Builder fundAccountName(String fundAccountName) {
                this.fundAccountName = fundAccountName;
                return this;
            }

            /**
             * <p>The account ID that owns the target account to which funds can be reclaimed.</p>
             * 
             * <strong>example:</strong>
             * <p>183221321</p>
             */
            public Builder fundAccountOwnerAccountId(String fundAccountOwnerAccountId) {
                this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
                return this;
            }

            /**
             * <p>The maximum reclaimable amount.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder maxRecyclableAmount(String maxRecyclableAmount) {
                this.maxRecyclableAmount = maxRecyclableAmount;
                return this;
            }

            /**
             * <p>The remaining transfer amount that can be reclaimed through the original transfer path.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
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
