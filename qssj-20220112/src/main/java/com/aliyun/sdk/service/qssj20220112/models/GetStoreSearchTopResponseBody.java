// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStoreSearchTopResponseBody} extends {@link TeaModel}
 *
 * <p>GetStoreSearchTopResponseBody</p>
 */
public class GetStoreSearchTopResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessResponse")
    private Boolean successResponse;

    private GetStoreSearchTopResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStoreSearchTopResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successResponse
     */
    public Boolean getSuccessResponse() {
        return this.successResponse;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean successResponse; 

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
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessResponse.
         */
        public Builder successResponse(Boolean successResponse) {
            this.successResponse = successResponse;
            return this;
        }

        public GetStoreSearchTopResponseBody build() {
            return new GetStoreSearchTopResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CommodityQuantity")
        private Long commodityQuantity;

        @NameInMap("SalesVolume")
        private Long salesVolume;

        @NameInMap("SearchVolume")
        private Long searchVolume;

        @NameInMap("ShopId")
        private Long shopId;

        @NameInMap("ShopName")
        private String shopName;

        @NameInMap("TotalSales")
        private Double totalSales;

        private Data(Builder builder) {
            this.commodityQuantity = builder.commodityQuantity;
            this.salesVolume = builder.salesVolume;
            this.searchVolume = builder.searchVolume;
            this.shopId = builder.shopId;
            this.shopName = builder.shopName;
            this.totalSales = builder.totalSales;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return commodityQuantity
         */
        public Long getCommodityQuantity() {
            return this.commodityQuantity;
        }

        /**
         * @return salesVolume
         */
        public Long getSalesVolume() {
            return this.salesVolume;
        }

        /**
         * @return searchVolume
         */
        public Long getSearchVolume() {
            return this.searchVolume;
        }

        /**
         * @return shopId
         */
        public Long getShopId() {
            return this.shopId;
        }

        /**
         * @return shopName
         */
        public String getShopName() {
            return this.shopName;
        }

        /**
         * @return totalSales
         */
        public Double getTotalSales() {
            return this.totalSales;
        }

        public static final class Builder {
            private Long commodityQuantity; 
            private Long salesVolume; 
            private Long searchVolume; 
            private Long shopId; 
            private String shopName; 
            private Double totalSales; 

            /**
             * CommodityQuantity.
             */
            public Builder commodityQuantity(Long commodityQuantity) {
                this.commodityQuantity = commodityQuantity;
                return this;
            }

            /**
             * SalesVolume.
             */
            public Builder salesVolume(Long salesVolume) {
                this.salesVolume = salesVolume;
                return this;
            }

            /**
             * SearchVolume.
             */
            public Builder searchVolume(Long searchVolume) {
                this.searchVolume = searchVolume;
                return this;
            }

            /**
             * ShopId.
             */
            public Builder shopId(Long shopId) {
                this.shopId = shopId;
                return this;
            }

            /**
             * ShopName.
             */
            public Builder shopName(String shopName) {
                this.shopName = shopName;
                return this;
            }

            /**
             * TotalSales.
             */
            public Builder totalSales(Double totalSales) {
                this.totalSales = totalSales;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
