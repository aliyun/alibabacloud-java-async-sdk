// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link CooperatorFlightBillSettlementQueryRequest} extends {@link RequestModel}
 *
 * <p>CooperatorFlightBillSettlementQueryRequest</p>
 */
public class CooperatorFlightBillSettlementQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_batch")
    private String billBatch;

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
    private String periodEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("period_start")
    private String periodStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scroll_id")
    private String scrollId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scroll_mod")
    private Boolean scrollMod;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private CooperatorFlightBillSettlementQueryRequest(Builder builder) {
        super(builder);
        this.billBatch = builder.billBatch;
        this.cooperatorId = builder.cooperatorId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.periodEnd = builder.periodEnd;
        this.periodStart = builder.periodStart;
        this.scrollId = builder.scrollId;
        this.scrollMod = builder.scrollMod;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CooperatorFlightBillSettlementQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billBatch
     */
    public String getBillBatch() {
        return this.billBatch;
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
     * @return scrollId
     */
    public String getScrollId() {
        return this.scrollId;
    }

    /**
     * @return scrollMod
     */
    public Boolean getScrollMod() {
        return this.scrollMod;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<CooperatorFlightBillSettlementQueryRequest, Builder> {
        private String billBatch; 
        private String cooperatorId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String periodEnd; 
        private String periodStart; 
        private String scrollId; 
        private Boolean scrollMod; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CooperatorFlightBillSettlementQueryRequest request) {
            super(request);
            this.billBatch = request.billBatch;
            this.cooperatorId = request.cooperatorId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.periodEnd = request.periodEnd;
            this.periodStart = request.periodStart;
            this.scrollId = request.scrollId;
            this.scrollMod = request.scrollMod;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * bill_batch.
         */
        public Builder billBatch(String billBatch) {
            this.putQueryParameter("bill_batch", billBatch);
            this.billBatch = billBatch;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("page_no", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * scroll_id.
         */
        public Builder scrollId(String scrollId) {
            this.putQueryParameter("scroll_id", scrollId);
            this.scrollId = scrollId;
            return this;
        }

        /**
         * scroll_mod.
         */
        public Builder scrollMod(Boolean scrollMod) {
            this.putQueryParameter("scroll_mod", scrollMod);
            this.scrollMod = scrollMod;
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
        public CooperatorFlightBillSettlementQueryRequest build() {
            return new CooperatorFlightBillSettlementQueryRequest(this);
        } 

    } 

}
