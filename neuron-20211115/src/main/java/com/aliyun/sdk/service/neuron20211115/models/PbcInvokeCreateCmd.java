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
 * {@link PbcInvokeCreateCmd} extends {@link TeaModel}
 *
 * <p>PbcInvokeCreateCmd</p>
 */
public class PbcInvokeCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applicant")
    private String applicant;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("invokePbcId")
    private Long invokePbcId;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    @com.aliyun.core.annotation.NameInMap("reviewer")
    private String reviewer;

    @com.aliyun.core.annotation.NameInMap("usage")
    private String usage;

    @com.aliyun.core.annotation.NameInMap("visible")
    private Boolean visible;

    private PbcInvokeCreateCmd(Builder builder) {
        this.applicant = builder.applicant;
        this.companyId = builder.companyId;
        this.invokePbcId = builder.invokePbcId;
        this.marketId = builder.marketId;
        this.pbcId = builder.pbcId;
        this.reviewer = builder.reviewer;
        this.usage = builder.usage;
        this.visible = builder.visible;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcInvokeCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicant
     */
    public String getApplicant() {
        return this.applicant;
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
     * @return reviewer
     */
    public String getReviewer() {
        return this.reviewer;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    /**
     * @return visible
     */
    public Boolean getVisible() {
        return this.visible;
    }

    public static final class Builder {
        private String applicant; 
        private Long companyId; 
        private Long invokePbcId; 
        private Long marketId; 
        private Long pbcId; 
        private String reviewer; 
        private String usage; 
        private Boolean visible; 

        private Builder() {
        } 

        private Builder(PbcInvokeCreateCmd model) {
            this.applicant = model.applicant;
            this.companyId = model.companyId;
            this.invokePbcId = model.invokePbcId;
            this.marketId = model.marketId;
            this.pbcId = model.pbcId;
            this.reviewer = model.reviewer;
            this.usage = model.usage;
            this.visible = model.visible;
        } 

        /**
         * applicant.
         */
        public Builder applicant(String applicant) {
            this.applicant = applicant;
            return this;
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
         * reviewer.
         */
        public Builder reviewer(String reviewer) {
            this.reviewer = reviewer;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(String usage) {
            this.usage = usage;
            return this;
        }

        /**
         * visible.
         */
        public Builder visible(Boolean visible) {
            this.visible = visible;
            return this;
        }

        public PbcInvokeCreateCmd build() {
            return new PbcInvokeCreateCmd(this);
        } 

    } 

}
