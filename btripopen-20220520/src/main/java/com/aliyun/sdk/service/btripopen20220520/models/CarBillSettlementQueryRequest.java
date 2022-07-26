// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarBillSettlementQueryRequest} extends {@link RequestModel}
 *
 * <p>CarBillSettlementQueryRequest</p>
 */
public class CarBillSettlementQueryRequest extends Request {
    @Query
    @NameInMap("page_no")
    private Integer pageNo;

    @Query
    @NameInMap("page_size")
    private Integer pageSize;

    @Query
    @NameInMap("period_end")
    private String periodEnd;

    @Query
    @NameInMap("period_start")
    private String periodStart;

    private CarBillSettlementQueryRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.periodEnd = builder.periodEnd;
        this.periodStart = builder.periodStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CarBillSettlementQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CarBillSettlementQueryRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private String periodEnd; 
        private String periodStart; 

        private Builder() {
            super();
        } 

        private Builder(CarBillSettlementQueryRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.periodEnd = request.periodEnd;
            this.periodStart = request.periodStart;
        } 

        /**
         * 分页页数（第几页）
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("page_no", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * 分页数量（每页多少条）
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 记账更新日期止 yyyy-MM-dd
         */
        public Builder periodEnd(String periodEnd) {
            this.putQueryParameter("period_end", periodEnd);
            this.periodEnd = periodEnd;
            return this;
        }

        /**
         * 记账更新日期起 yyyy-MM-dd
         */
        public Builder periodStart(String periodStart) {
            this.putQueryParameter("period_start", periodStart);
            this.periodStart = periodStart;
            return this;
        }

        @Override
        public CarBillSettlementQueryRequest build() {
            return new CarBillSettlementQueryRequest(this);
        } 

    } 

}
