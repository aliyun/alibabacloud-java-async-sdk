// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link QueryBuyerDomainTradeRecordsRequest} extends {@link RequestModel}
 *
 * <p>QueryBuyerDomainTradeRecordsRequest</p>
 */
public class QueryBuyerDomainTradeRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizIdList")
    private java.util.List<String> bizIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNameList")
    private java.util.List<String> domainNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndPrice")
    private Float endPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sorter")
    private String sorter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartPrice")
    private Float startPrice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuffixList")
    private java.util.List<String> suffixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TradeTypeList")
    private java.util.List<String> tradeTypeList;

    private QueryBuyerDomainTradeRecordsRequest(Builder builder) {
        super(builder);
        this.bizIdList = builder.bizIdList;
        this.domainNameList = builder.domainNameList;
        this.endDate = builder.endDate;
        this.endPrice = builder.endPrice;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sorter = builder.sorter;
        this.startDate = builder.startDate;
        this.startPrice = builder.startPrice;
        this.statusList = builder.statusList;
        this.suffixList = builder.suffixList;
        this.tradeTypeList = builder.tradeTypeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBuyerDomainTradeRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizIdList
     */
    public java.util.List<String> getBizIdList() {
        return this.bizIdList;
    }

    /**
     * @return domainNameList
     */
    public java.util.List<String> getDomainNameList() {
        return this.domainNameList;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return endPrice
     */
    public Float getEndPrice() {
        return this.endPrice;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sorter
     */
    public String getSorter() {
        return this.sorter;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return startPrice
     */
    public Float getStartPrice() {
        return this.startPrice;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    /**
     * @return suffixList
     */
    public java.util.List<String> getSuffixList() {
        return this.suffixList;
    }

    /**
     * @return tradeTypeList
     */
    public java.util.List<String> getTradeTypeList() {
        return this.tradeTypeList;
    }

    public static final class Builder extends Request.Builder<QueryBuyerDomainTradeRecordsRequest, Builder> {
        private java.util.List<String> bizIdList; 
        private java.util.List<String> domainNameList; 
        private String endDate; 
        private Float endPrice; 
        private Long pageNum; 
        private Long pageSize; 
        private String sorter; 
        private String startDate; 
        private Float startPrice; 
        private java.util.List<String> statusList; 
        private java.util.List<String> suffixList; 
        private java.util.List<String> tradeTypeList; 

        private Builder() {
            super();
        } 

        private Builder(QueryBuyerDomainTradeRecordsRequest request) {
            super(request);
            this.bizIdList = request.bizIdList;
            this.domainNameList = request.domainNameList;
            this.endDate = request.endDate;
            this.endPrice = request.endPrice;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sorter = request.sorter;
            this.startDate = request.startDate;
            this.startPrice = request.startPrice;
            this.statusList = request.statusList;
            this.suffixList = request.suffixList;
            this.tradeTypeList = request.tradeTypeList;
        } 

        /**
         * BizIdList.
         */
        public Builder bizIdList(java.util.List<String> bizIdList) {
            String bizIdListShrink = shrink(bizIdList, "BizIdList", "json");
            this.putQueryParameter("BizIdList", bizIdListShrink);
            this.bizIdList = bizIdList;
            return this;
        }

        /**
         * DomainNameList.
         */
        public Builder domainNameList(java.util.List<String> domainNameList) {
            String domainNameListShrink = shrink(domainNameList, "DomainNameList", "json");
            this.putQueryParameter("DomainNameList", domainNameListShrink);
            this.domainNameList = domainNameList;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * EndPrice.
         */
        public Builder endPrice(Float endPrice) {
            this.putQueryParameter("EndPrice", endPrice);
            this.endPrice = endPrice;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Sorter.
         */
        public Builder sorter(String sorter) {
            this.putQueryParameter("Sorter", sorter);
            this.sorter = sorter;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * StartPrice.
         */
        public Builder startPrice(Float startPrice) {
            this.putQueryParameter("StartPrice", startPrice);
            this.startPrice = startPrice;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List<String> statusList) {
            String statusListShrink = shrink(statusList, "StatusList", "json");
            this.putQueryParameter("StatusList", statusListShrink);
            this.statusList = statusList;
            return this;
        }

        /**
         * SuffixList.
         */
        public Builder suffixList(java.util.List<String> suffixList) {
            String suffixListShrink = shrink(suffixList, "SuffixList", "json");
            this.putQueryParameter("SuffixList", suffixListShrink);
            this.suffixList = suffixList;
            return this;
        }

        /**
         * TradeTypeList.
         */
        public Builder tradeTypeList(java.util.List<String> tradeTypeList) {
            String tradeTypeListShrink = shrink(tradeTypeList, "TradeTypeList", "json");
            this.putQueryParameter("TradeTypeList", tradeTypeListShrink);
            this.tradeTypeList = tradeTypeList;
            return this;
        }

        @Override
        public QueryBuyerDomainTradeRecordsRequest build() {
            return new QueryBuyerDomainTradeRecordsRequest(this);
        } 

    } 

}
