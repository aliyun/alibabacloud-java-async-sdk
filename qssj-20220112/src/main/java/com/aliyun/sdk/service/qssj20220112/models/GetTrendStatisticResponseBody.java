// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrendStatisticResponseBody</p>
 */
public class GetTrendStatisticResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessResponse")
    private Boolean successResponse;

    private GetTrendStatisticResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrendStatisticResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
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
        public Builder data(Data data) {
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

        public GetTrendStatisticResponseBody build() {
            return new GetTrendStatisticResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CommodityCount")
        private Long commodityCount;

        @NameInMap("Sales")
        private Double sales;

        @NameInMap("ShopCount")
        private Long shopCount;

        private Data(Builder builder) {
            this.commodityCount = builder.commodityCount;
            this.sales = builder.sales;
            this.shopCount = builder.shopCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return commodityCount
         */
        public Long getCommodityCount() {
            return this.commodityCount;
        }

        /**
         * @return sales
         */
        public Double getSales() {
            return this.sales;
        }

        /**
         * @return shopCount
         */
        public Long getShopCount() {
            return this.shopCount;
        }

        public static final class Builder {
            private Long commodityCount; 
            private Double sales; 
            private Long shopCount; 

            /**
             * CommodityCount.
             */
            public Builder commodityCount(Long commodityCount) {
                this.commodityCount = commodityCount;
                return this;
            }

            /**
             * Sales.
             */
            public Builder sales(Double sales) {
                this.sales = sales;
                return this;
            }

            /**
             * ShopCount.
             */
            public Builder shopCount(Long shopCount) {
                this.shopCount = shopCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
