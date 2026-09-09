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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetFundAccountCanAllocateCreditAmountResponseBody model) {
            this.ecid = model.ecid;
            this.ecidAllocatedCreditAmount = model.ecidAllocatedCreditAmount;
            this.ecidCreditAmount = model.ecidCreditAmount;
            this.fundAccountEcid = model.fundAccountEcid;
            this.fundAccountId = model.fundAccountId;
            this.fundAccountName = model.fundAccountName;
            this.fundAccountOwnerAccountId = model.fundAccountOwnerAccountId;
            this.maxCanAllocateCreditAmount = model.maxCanAllocateCreditAmount;
            this.metadata = model.metadata;
            this.minCanAllocateCreditAmount = model.minCanAllocateCreditAmount;
            this.nbid = model.nbid;
            this.requestId = model.requestId;
            this.site = model.site;
        } 

        /**
         * <p>The enterprise entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2032123221</p>
         */
        public Builder ecid(String ecid) {
            this.ecid = ecid;
            return this;
        }

        /**
         * <p>The allocated credit limit of the enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder ecidAllocatedCreditAmount(String ecidAllocatedCreditAmount) {
            this.ecidAllocatedCreditAmount = ecidAllocatedCreditAmount;
            return this;
        }

        /**
         * <p>The enterprise credit quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder ecidCreditAmount(String ecidCreditAmount) {
            this.ecidCreditAmount = ecidCreditAmount;
            return this;
        }

        /**
         * <p>The account ECID.</p>
         * 
         * <strong>example:</strong>
         * <p>202321232</p>
         */
        public Builder fundAccountEcid(String fundAccountEcid) {
            this.fundAccountEcid = fundAccountEcid;
            return this;
        }

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12332112</p>
         */
        public Builder fundAccountId(Long fundAccountId) {
            this.fundAccountId = fundAccountId;
            return this;
        }

        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>云某的名称</p>
         */
        public Builder fundAccountName(String fundAccountName) {
            this.fundAccountName = fundAccountName;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the account owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123433121</p>
         */
        public Builder fundAccountOwnerAccountId(Long fundAccountOwnerAccountId) {
            this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
            return this;
        }

        /**
         * <p>The maximum allocatable credit limit of the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        public Builder maxCanAllocateCreditAmount(String maxCanAllocateCreditAmount) {
            this.maxCanAllocateCreditAmount = maxCanAllocateCreditAmount;
            return this;
        }

        /**
         * <p>Response structure metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The minimum allocatable credit limit of the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder minCanAllocateCreditAmount(String minCanAllocateCreditAmount) {
            this.minCanAllocateCreditAmount = minCanAllocateCreditAmount;
            return this;
        }

        /**
         * <p>The primary marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>2684210001</p>
         */
        public Builder nbid(String nbid) {
            this.nbid = nbid;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CC706AAC-75A6-55B5-9AB7-7D171C6C7655</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The site.</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
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
