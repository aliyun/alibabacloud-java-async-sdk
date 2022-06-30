// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPriceRangeResponseBody} extends {@link TeaModel}
 *
 * <p>GetPriceRangeResponseBody</p>
 */
public class GetPriceRangeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessResponse")
    private String successResponse;

    private GetPriceRangeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPriceRangeResponseBody create() {
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
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private String successResponse; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessResponse.
         */
        public Builder successResponse(String successResponse) {
            this.successResponse = successResponse;
            return this;
        }

        public GetPriceRangeResponseBody build() {
            return new GetPriceRangeResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ClosingDate")
        private String closingDate;

        @NameInMap("GoodsSales")
        private Long goodsSales;

        @NameInMap("PriceRange")
        private String priceRange;

        @NameInMap("SalesVolume")
        private Double salesVolume;

        private Data(Builder builder) {
            this.closingDate = builder.closingDate;
            this.goodsSales = builder.goodsSales;
            this.priceRange = builder.priceRange;
            this.salesVolume = builder.salesVolume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return closingDate
         */
        public String getClosingDate() {
            return this.closingDate;
        }

        /**
         * @return goodsSales
         */
        public Long getGoodsSales() {
            return this.goodsSales;
        }

        /**
         * @return priceRange
         */
        public String getPriceRange() {
            return this.priceRange;
        }

        /**
         * @return salesVolume
         */
        public Double getSalesVolume() {
            return this.salesVolume;
        }

        public static final class Builder {
            private String closingDate; 
            private Long goodsSales; 
            private String priceRange; 
            private Double salesVolume; 

            /**
             * ClosingDate.
             */
            public Builder closingDate(String closingDate) {
                this.closingDate = closingDate;
                return this;
            }

            /**
             * GoodsSales.
             */
            public Builder goodsSales(Long goodsSales) {
                this.goodsSales = goodsSales;
                return this;
            }

            /**
             * PriceRange.
             */
            public Builder priceRange(String priceRange) {
                this.priceRange = priceRange;
                return this;
            }

            /**
             * SalesVolume.
             */
            public Builder salesVolume(Double salesVolume) {
                this.salesVolume = salesVolume;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
