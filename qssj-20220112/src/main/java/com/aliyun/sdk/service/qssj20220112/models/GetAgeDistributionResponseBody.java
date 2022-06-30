// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgeDistributionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgeDistributionResponseBody</p>
 */
public class GetAgeDistributionResponseBody extends TeaModel {
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

    private GetAgeDistributionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgeDistributionResponseBody create() {
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
         * Id of the request
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

        public GetAgeDistributionResponseBody build() {
            return new GetAgeDistributionResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AgeRange")
        private String ageRange;

        @NameInMap("SaleNumbers")
        private Long saleNumbers;

        @NameInMap("SearchNumbers")
        private Long searchNumbers;

        private Data(Builder builder) {
            this.ageRange = builder.ageRange;
            this.saleNumbers = builder.saleNumbers;
            this.searchNumbers = builder.searchNumbers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ageRange
         */
        public String getAgeRange() {
            return this.ageRange;
        }

        /**
         * @return saleNumbers
         */
        public Long getSaleNumbers() {
            return this.saleNumbers;
        }

        /**
         * @return searchNumbers
         */
        public Long getSearchNumbers() {
            return this.searchNumbers;
        }

        public static final class Builder {
            private String ageRange; 
            private Long saleNumbers; 
            private Long searchNumbers; 

            /**
             * AgeRange.
             */
            public Builder ageRange(String ageRange) {
                this.ageRange = ageRange;
                return this;
            }

            /**
             * SaleNumbers.
             */
            public Builder saleNumbers(Long saleNumbers) {
                this.saleNumbers = saleNumbers;
                return this;
            }

            /**
             * SearchNumbers.
             */
            public Builder searchNumbers(Long searchNumbers) {
                this.searchNumbers = searchNumbers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
