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
 * {@link GetFundAccountCanAllocateCreditAmountResponseBody} extends {@link TeaModel}
 *
 * <p>GetFundAccountCanAllocateCreditAmountResponseBody</p>
 */
public class GetFundAccountCanAllocateCreditAmountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ecid")
    private String ecid;

    @com.aliyun.core.annotation.NameInMap("EcidAllocatedCreditAmount")
    private String ecidAllocatedCreditAmount;

    @com.aliyun.core.annotation.NameInMap("EcidCreditAmount")
    private String ecidCreditAmount;

    @com.aliyun.core.annotation.NameInMap("FundAccountEcid")
    private String fundAccountEcid;

    @com.aliyun.core.annotation.NameInMap("FundAccountId")
    private Long fundAccountId;

    @com.aliyun.core.annotation.NameInMap("FundAccountName")
    private String fundAccountName;

    @com.aliyun.core.annotation.NameInMap("FundAccountOwnerAccountId")
    private Long fundAccountOwnerAccountId;

    @com.aliyun.core.annotation.NameInMap("MaxCanAllocateCreditAmount")
    private String maxCanAllocateCreditAmount;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("MinCanAllocateCreditAmount")
    private String minCanAllocateCreditAmount;

    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Site")
    private String site;

    private GetFundAccountCanAllocateCreditAmountResponseBody(Builder builder) {
        this.ecid = builder.ecid;
        this.ecidAllocatedCreditAmount = builder.ecidAllocatedCreditAmount;
        this.ecidCreditAmount = builder.ecidCreditAmount;
        this.fundAccountEcid = builder.fundAccountEcid;
        this.fundAccountId = builder.fundAccountId;
        this.fundAccountName = builder.fundAccountName;
        this.fundAccountOwnerAccountId = builder.fundAccountOwnerAccountId;
        this.maxCanAllocateCreditAmount = builder.maxCanAllocateCreditAmount;
        this.metadata = builder.metadata;
        this.minCanAllocateCreditAmount = builder.minCanAllocateCreditAmount;
        this.nbid = builder.nbid;
        this.requestId = builder.requestId;
        this.site = builder.site;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFundAccountCanAllocateCreditAmountResponseBody create() {
        return builder().build();
    }

    /**
     * @return ecid
     */
    public String getEcid() {
        return this.ecid;
    }

    /**
     * @return ecidAllocatedCreditAmount
     */
    public String getEcidAllocatedCreditAmount() {
        return this.ecidAllocatedCreditAmount;
    }

    /**
     * @return ecidCreditAmount
     */
    public String getEcidCreditAmount() {
        return this.ecidCreditAmount;
    }

    /**
     * @return fundAccountEcid
     */
    public String getFundAccountEcid() {
        return this.fundAccountEcid;
    }

    /**
     * @return fundAccountId
     */
    public Long getFundAccountId() {
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
    public Long getFundAccountOwnerAccountId() {
        return this.fundAccountOwnerAccountId;
    }

    /**
     * @return maxCanAllocateCreditAmount
     */
    public String getMaxCanAllocateCreditAmount() {
        return this.maxCanAllocateCreditAmount;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return minCanAllocateCreditAmount
     */
    public String getMinCanAllocateCreditAmount() {
        return this.minCanAllocateCreditAmount;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return site
     */
    public String getSite() {
        return this.site;
    }

    public static final class Builder {
        private String ecid; 
        private String ecidAllocatedCreditAmount; 
        private String ecidCreditAmount; 
        private String fundAccountEcid; 
        private Long fundAccountId; 
        private String fundAccountName; 
        private Long fundAccountOwnerAccountId; 
        private String maxCanAllocateCreditAmount; 
        private Object metadata; 
        private String minCanAllocateCreditAmount; 
        private String nbid; 
        private String requestId; 
        private String site; 

        /**
         * Ecid.
         */
        public Builder ecid(String ecid) {
            this.ecid = ecid;
            return this;
        }

        /**
         * EcidAllocatedCreditAmount.
         */
        public Builder ecidAllocatedCreditAmount(String ecidAllocatedCreditAmount) {
            this.ecidAllocatedCreditAmount = ecidAllocatedCreditAmount;
            return this;
        }

        /**
         * EcidCreditAmount.
         */
        public Builder ecidCreditAmount(String ecidCreditAmount) {
            this.ecidCreditAmount = ecidCreditAmount;
            return this;
        }

        /**
         * FundAccountEcid.
         */
        public Builder fundAccountEcid(String fundAccountEcid) {
            this.fundAccountEcid = fundAccountEcid;
            return this;
        }

        /**
         * FundAccountId.
         */
        public Builder fundAccountId(Long fundAccountId) {
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
        public Builder fundAccountOwnerAccountId(Long fundAccountOwnerAccountId) {
            this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
            return this;
        }

        /**
         * MaxCanAllocateCreditAmount.
         */
        public Builder maxCanAllocateCreditAmount(String maxCanAllocateCreditAmount) {
            this.maxCanAllocateCreditAmount = maxCanAllocateCreditAmount;
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
         * MinCanAllocateCreditAmount.
         */
        public Builder minCanAllocateCreditAmount(String minCanAllocateCreditAmount) {
            this.minCanAllocateCreditAmount = minCanAllocateCreditAmount;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.nbid = nbid;
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
         * Site.
         */
        public Builder site(String site) {
            this.site = site;
            return this;
        }

        public GetFundAccountCanAllocateCreditAmountResponseBody build() {
            return new GetFundAccountCanAllocateCreditAmountResponseBody(this);
        } 

    } 

}
