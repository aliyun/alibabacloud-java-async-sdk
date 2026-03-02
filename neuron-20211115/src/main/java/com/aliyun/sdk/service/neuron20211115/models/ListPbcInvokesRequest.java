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
 * {@link ListPbcInvokesRequest} extends {@link RequestModel}
 *
 * <p>ListPbcInvokesRequest</p>
 */
public class ListPbcInvokesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("applicant")
    private String applicant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    private ListPbcInvokesRequest(Builder builder) {
        super(builder);
        this.applicant = builder.applicant;
        this.companyId = builder.companyId;
        this.marketId = builder.marketId;
        this.pbcId = builder.pbcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPbcInvokesRequest create() {
        return builder().build();
    }

@Override
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

    public static final class Builder extends Request.Builder<ListPbcInvokesRequest, Builder> {
        private String applicant; 
        private Long companyId; 
        private Long marketId; 
        private Long pbcId; 

        private Builder() {
            super();
        } 

        private Builder(ListPbcInvokesRequest request) {
            super(request);
            this.applicant = request.applicant;
            this.companyId = request.companyId;
            this.marketId = request.marketId;
            this.pbcId = request.pbcId;
        } 

        /**
         * applicant.
         */
        public Builder applicant(String applicant) {
            this.putQueryParameter("applicant", applicant);
            this.applicant = applicant;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.putQueryParameter("marketId", marketId);
            this.marketId = marketId;
            return this;
        }

        /**
         * pbcId.
         */
        public Builder pbcId(Long pbcId) {
            this.putQueryParameter("pbcId", pbcId);
            this.pbcId = pbcId;
            return this;
        }

        @Override
        public ListPbcInvokesRequest build() {
            return new ListPbcInvokesRequest(this);
        } 

    } 

}
