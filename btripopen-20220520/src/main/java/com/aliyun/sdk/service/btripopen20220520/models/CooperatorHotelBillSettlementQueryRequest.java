// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CooperatorHotelBillSettlementQueryRequest} extends {@link RequestModel}
 *
 * <p>CooperatorHotelBillSettlementQueryRequest</p>
 */
public class CooperatorHotelBillSettlementQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cooperator_id")
    private String cooperatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_no")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("period_end")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("period_start")
    private String periodStart;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private CooperatorHotelBillSettlementQueryRequest(Builder builder) {
        super(builder);
        this.cooperatorId = builder.cooperatorId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.periodEnd = builder.periodEnd;
        this.periodStart = builder.periodStart;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CooperatorHotelBillSettlementQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cooperatorId
     */
    public String getCooperatorId() {
        return this.cooperatorId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return periodEnd
     */
    public String getPeriodEnd() {
        return this.periodEnd;
    }

    /**
     * @return periodStart
     */
    public String getPeriodStart() {
        return this.periodStart;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<CooperatorHotelBillSettlementQueryRequest, Builder> {
        private String cooperatorId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String periodEnd; 
        private String periodStart; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CooperatorHotelBillSettlementQueryRequest request) {
            super(request);
            this.cooperatorId = request.cooperatorId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.periodEnd = request.periodEnd;
            this.periodStart = request.periodStart;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * cooperator_id.
         */
        public Builder cooperatorId(String cooperatorId) {
            this.putQueryParameter("cooperator_id", cooperatorId);
            this.cooperatorId = cooperatorId;
            return this;
        }

        /**
         * page_no.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("page_no", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * period_end.
         */
        public Builder periodEnd(String periodEnd) {
            this.putQueryParameter("period_end", periodEnd);
            this.periodEnd = periodEnd;
            return this;
        }

        /**
         * period_start.
         */
        public Builder periodStart(String periodStart) {
            this.putQueryParameter("period_start", periodStart);
            this.periodStart = periodStart;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public CooperatorHotelBillSettlementQueryRequest build() {
            return new CooperatorHotelBillSettlementQueryRequest(this);
        } 

    } 

}
