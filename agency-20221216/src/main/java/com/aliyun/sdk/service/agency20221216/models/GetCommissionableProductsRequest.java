// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link GetCommissionableProductsRequest} extends {@link RequestModel}
 *
 * <p>GetCommissionableProductsRequest</p>
 */
public class GetCommissionableProductsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCodeList")
    private String commodityCodeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FiscalYear")
    private String fiscalYear;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListShowStatusList")
    private java.util.List<String> listShowStatusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipCodeList")
    private String pipCodeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealEndMonth")
    private String realEndMonth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealStartMonth")
    private String realStartMonth;

    private GetCommissionableProductsRequest(Builder builder) {
        super(builder);
        this.commodityCodeList = builder.commodityCodeList;
        this.fiscalYear = builder.fiscalYear;
        this.listShowStatusList = builder.listShowStatusList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.pipCodeList = builder.pipCodeList;
        this.realEndMonth = builder.realEndMonth;
        this.realStartMonth = builder.realStartMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommissionableProductsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCodeList
     */
    public String getCommodityCodeList() {
        return this.commodityCodeList;
    }

    /**
     * @return fiscalYear
     */
    public String getFiscalYear() {
        return this.fiscalYear;
    }

    /**
     * @return listShowStatusList
     */
    public java.util.List<String> getListShowStatusList() {
        return this.listShowStatusList;
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
     * @return pipCodeList
     */
    public String getPipCodeList() {
        return this.pipCodeList;
    }

    /**
     * @return realEndMonth
     */
    public String getRealEndMonth() {
        return this.realEndMonth;
    }

    /**
     * @return realStartMonth
     */
    public String getRealStartMonth() {
        return this.realStartMonth;
    }

    public static final class Builder extends Request.Builder<GetCommissionableProductsRequest, Builder> {
        private String commodityCodeList; 
        private String fiscalYear; 
        private java.util.List<String> listShowStatusList; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String pipCodeList; 
        private String realEndMonth; 
        private String realStartMonth; 

        private Builder() {
            super();
        } 

        private Builder(GetCommissionableProductsRequest request) {
            super(request);
            this.commodityCodeList = request.commodityCodeList;
            this.fiscalYear = request.fiscalYear;
            this.listShowStatusList = request.listShowStatusList;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.pipCodeList = request.pipCodeList;
            this.realEndMonth = request.realEndMonth;
            this.realStartMonth = request.realStartMonth;
        } 

        /**
         * CommodityCodeList.
         */
        public Builder commodityCodeList(String commodityCodeList) {
            this.putQueryParameter("CommodityCodeList", commodityCodeList);
            this.commodityCodeList = commodityCodeList;
            return this;
        }

        /**
         * FiscalYear.
         */
        public Builder fiscalYear(String fiscalYear) {
            this.putQueryParameter("FiscalYear", fiscalYear);
            this.fiscalYear = fiscalYear;
            return this;
        }

        /**
         * ListShowStatusList.
         */
        public Builder listShowStatusList(java.util.List<String> listShowStatusList) {
            String listShowStatusListShrink = shrink(listShowStatusList, "ListShowStatusList", "simple");
            this.putQueryParameter("ListShowStatusList", listShowStatusListShrink);
            this.listShowStatusList = listShowStatusList;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PipCodeList.
         */
        public Builder pipCodeList(String pipCodeList) {
            this.putQueryParameter("PipCodeList", pipCodeList);
            this.pipCodeList = pipCodeList;
            return this;
        }

        /**
         * RealEndMonth.
         */
        public Builder realEndMonth(String realEndMonth) {
            this.putQueryParameter("RealEndMonth", realEndMonth);
            this.realEndMonth = realEndMonth;
            return this;
        }

        /**
         * RealStartMonth.
         */
        public Builder realStartMonth(String realStartMonth) {
            this.putQueryParameter("RealStartMonth", realStartMonth);
            this.realStartMonth = realStartMonth;
            return this;
        }

        @Override
        public GetCommissionableProductsRequest build() {
            return new GetCommissionableProductsRequest(this);
        } 

    } 

}
