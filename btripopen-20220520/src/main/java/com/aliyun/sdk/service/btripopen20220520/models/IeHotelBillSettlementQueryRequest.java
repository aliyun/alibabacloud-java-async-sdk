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
 * {@link IeHotelBillSettlementQueryRequest} extends {@link RequestModel}
 *
 * <p>IeHotelBillSettlementQueryRequest</p>
 */
public class IeHotelBillSettlementQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_batch")
    private String billBatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("category")
    private Integer category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_no")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
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
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private IeHotelBillSettlementQueryRequest(Builder builder) {
        super(builder);
        this.billBatch = builder.billBatch;
        this.category = builder.category;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.periodEnd = builder.periodEnd;
        this.periodStart = builder.periodStart;
        this.scrollId = builder.scrollId;
        this.scrollMod = builder.scrollMod;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IeHotelBillSettlementQueryRequest create() {
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
     * @return category
     */
    public Integer getCategory() {
        return this.category;
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
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<IeHotelBillSettlementQueryRequest, Builder> {
        private String billBatch; 
        private Integer category; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String periodEnd; 
        private String periodStart; 
        private String scrollId; 
        private Boolean scrollMod; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IeHotelBillSettlementQueryRequest request) {
            super(request);
            this.billBatch = request.billBatch;
            this.category = request.category;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.periodEnd = request.periodEnd;
            this.periodStart = request.periodStart;
            this.scrollId = request.scrollId;
            this.scrollMod = request.scrollMod;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
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
         * category.
         */
        public Builder category(Integer category) {
            this.putQueryParameter("category", category);
            this.category = category;
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
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public IeHotelBillSettlementQueryRequest build() {
            return new IeHotelBillSettlementQueryRequest(this);
        } 

    } 

}
