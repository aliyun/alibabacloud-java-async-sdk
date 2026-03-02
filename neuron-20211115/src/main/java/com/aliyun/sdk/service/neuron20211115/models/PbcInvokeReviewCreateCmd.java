// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PbcInvokeReviewCreateCmd} extends {@link TeaModel}
 *
 * <p>PbcInvokeReviewCreateCmd</p>
 */
public class PbcInvokeReviewCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("invokePbcId")
    private Long invokePbcId;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    @com.aliyun.core.annotation.NameInMap("usage")
    private String usage;

    private PbcInvokeReviewCreateCmd(Builder builder) {
        this.companyId = builder.companyId;
        this.invokePbcId = builder.invokePbcId;
        this.marketId = builder.marketId;
        this.pbcId = builder.pbcId;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcInvokeReviewCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return invokePbcId
     */
    public Long getInvokePbcId() {
        return this.invokePbcId;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Long companyId; 
        private Long invokePbcId; 
        private Long marketId; 
        private Long pbcId; 
        private String usage; 

        private Builder() {
        } 

        private Builder(PbcInvokeReviewCreateCmd model) {
            this.companyId = model.companyId;
            this.invokePbcId = model.invokePbcId;
            this.marketId = model.marketId;
            this.pbcId = model.pbcId;
            this.usage = model.usage;
        } 

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * invokePbcId.
         */
        public Builder invokePbcId(Long invokePbcId) {
            this.invokePbcId = invokePbcId;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
            return this;
        }

        /**
         * pbcId.
         */
        public Builder pbcId(Long pbcId) {
            this.pbcId = pbcId;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        public PbcInvokeReviewCreateCmd build() {
            return new PbcInvokeReviewCreateCmd(this);
        } 

    } 

}
