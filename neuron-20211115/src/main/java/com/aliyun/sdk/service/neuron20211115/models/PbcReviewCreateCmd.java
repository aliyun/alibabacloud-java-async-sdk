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
 * {@link PbcReviewCreateCmd} extends {@link TeaModel}
 *
 * <p>PbcReviewCreateCmd</p>
 */
public class PbcReviewCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("marketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("pbcUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pbcUrl;

    @com.aliyun.core.annotation.NameInMap("pbcVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pbcVersionId;

    @com.aliyun.core.annotation.NameInMap("reviewerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reviewerId;

    private PbcReviewCreateCmd(Builder builder) {
        this.marketId = builder.marketId;
        this.pbcUrl = builder.pbcUrl;
        this.pbcVersionId = builder.pbcVersionId;
        this.reviewerId = builder.reviewerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcReviewCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return pbcUrl
     */
    public String getPbcUrl() {
        return this.pbcUrl;
    }

    /**
     * @return pbcVersionId
     */
    public Long getPbcVersionId() {
        return this.pbcVersionId;
    }

    /**
     * @return reviewerId
     */
    public Long getReviewerId() {
        return this.reviewerId;
    }

    public static final class Builder {
        private Long marketId; 
        private String pbcUrl; 
        private Long pbcVersionId; 
        private Long reviewerId; 

        private Builder() {
        } 

        private Builder(PbcReviewCreateCmd model) {
            this.marketId = model.marketId;
            this.pbcUrl = model.pbcUrl;
            this.pbcVersionId = model.pbcVersionId;
            this.reviewerId = model.reviewerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://catalog.e2.aliyun.com/pbc/product">https://catalog.e2.aliyun.com/pbc/product</a></p>
         */
        public Builder pbcUrl(String pbcUrl) {
            this.pbcUrl = pbcUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pbcVersionId(Long pbcVersionId) {
            this.pbcVersionId = pbcVersionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reviewerId(Long reviewerId) {
            this.reviewerId = reviewerId;
            return this;
        }

        public PbcReviewCreateCmd build() {
            return new PbcReviewCreateCmd(this);
        } 

    } 

}
