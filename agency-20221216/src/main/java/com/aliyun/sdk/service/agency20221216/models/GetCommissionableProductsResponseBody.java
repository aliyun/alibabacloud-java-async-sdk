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
 * {@link GetCommissionableProductsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCommissionableProductsResponseBody</p>
 */
public class GetCommissionableProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private GetCommissionableProductsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommissionableProductsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(GetCommissionableProductsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetCommissionableProductsResponseBody build() {
            return new GetCommissionableProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCommissionableProductsResponseBody} extends {@link TeaModel}
     *
     * <p>GetCommissionableProductsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualStartMonth")
        private String actualStartMonth;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("EligibleForCommission")
        private String eligibleForCommission;

        @com.aliyun.core.annotation.NameInMap("EligibleForDiscount")
        private String eligibleForDiscount;

        @com.aliyun.core.annotation.NameInMap("EndMonth")
        private String endMonth;

        @com.aliyun.core.annotation.NameInMap("ProductCampaign")
        private String productCampaign;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("SevenCoreProducts")
        private String sevenCoreProducts;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.actualStartMonth = builder.actualStartMonth;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.eligibleForCommission = builder.eligibleForCommission;
            this.eligibleForDiscount = builder.eligibleForDiscount;
            this.endMonth = builder.endMonth;
            this.productCampaign = builder.productCampaign;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.sevenCoreProducts = builder.sevenCoreProducts;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actualStartMonth
         */
        public String getActualStartMonth() {
            return this.actualStartMonth;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return eligibleForCommission
         */
        public String getEligibleForCommission() {
            return this.eligibleForCommission;
        }

        /**
         * @return eligibleForDiscount
         */
        public String getEligibleForDiscount() {
            return this.eligibleForDiscount;
        }

        /**
         * @return endMonth
         */
        public String getEndMonth() {
            return this.endMonth;
        }

        /**
         * @return productCampaign
         */
        public String getProductCampaign() {
            return this.productCampaign;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return sevenCoreProducts
         */
        public String getSevenCoreProducts() {
            return this.sevenCoreProducts;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String actualStartMonth; 
            private String commodityCode; 
            private String commodityName; 
            private String eligibleForCommission; 
            private String eligibleForDiscount; 
            private String endMonth; 
            private String productCampaign; 
            private String productCode; 
            private String productName; 
            private String sevenCoreProducts; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.actualStartMonth = model.actualStartMonth;
                this.commodityCode = model.commodityCode;
                this.commodityName = model.commodityName;
                this.eligibleForCommission = model.eligibleForCommission;
                this.eligibleForDiscount = model.eligibleForDiscount;
                this.endMonth = model.endMonth;
                this.productCampaign = model.productCampaign;
                this.productCode = model.productCode;
                this.productName = model.productName;
                this.sevenCoreProducts = model.sevenCoreProducts;
                this.status = model.status;
            } 

            /**
             * ActualStartMonth.
             */
            public Builder actualStartMonth(String actualStartMonth) {
                this.actualStartMonth = actualStartMonth;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CommodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * EligibleForCommission.
             */
            public Builder eligibleForCommission(String eligibleForCommission) {
                this.eligibleForCommission = eligibleForCommission;
                return this;
            }

            /**
             * EligibleForDiscount.
             */
            public Builder eligibleForDiscount(String eligibleForDiscount) {
                this.eligibleForDiscount = eligibleForDiscount;
                return this;
            }

            /**
             * EndMonth.
             */
            public Builder endMonth(String endMonth) {
                this.endMonth = endMonth;
                return this;
            }

            /**
             * ProductCampaign.
             */
            public Builder productCampaign(String productCampaign) {
                this.productCampaign = productCampaign;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * SevenCoreProducts.
             */
            public Builder sevenCoreProducts(String sevenCoreProducts) {
                this.sevenCoreProducts = sevenCoreProducts;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
