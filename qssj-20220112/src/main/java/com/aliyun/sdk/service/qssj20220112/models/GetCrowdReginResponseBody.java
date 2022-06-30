// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCrowdReginResponseBody} extends {@link TeaModel}
 *
 * <p>GetCrowdReginResponseBody</p>
 */
public class GetCrowdReginResponseBody extends TeaModel {
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

    private GetCrowdReginResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrowdReginResponseBody create() {
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

        public GetCrowdReginResponseBody build() {
            return new GetCrowdReginResponseBody(this);
        } 

    } 

    public static class SaleNumbers extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private Long value;

        private SaleNumbers(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaleNumbers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Long value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public SaleNumbers build() {
                return new SaleNumbers(this);
            } 

        } 

    }
    public static class SearchNumbers extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private Long value;

        private SearchNumbers(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchNumbers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Long value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public SearchNumbers build() {
                return new SearchNumbers(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("SaleNumbers")
        private java.util.List < SaleNumbers> saleNumbers;

        @NameInMap("SearchNumbers")
        private java.util.List < SearchNumbers> searchNumbers;

        private Data(Builder builder) {
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
         * @return saleNumbers
         */
        public java.util.List < SaleNumbers> getSaleNumbers() {
            return this.saleNumbers;
        }

        /**
         * @return searchNumbers
         */
        public java.util.List < SearchNumbers> getSearchNumbers() {
            return this.searchNumbers;
        }

        public static final class Builder {
            private java.util.List < SaleNumbers> saleNumbers; 
            private java.util.List < SearchNumbers> searchNumbers; 

            /**
             * SaleNumbers.
             */
            public Builder saleNumbers(java.util.List < SaleNumbers> saleNumbers) {
                this.saleNumbers = saleNumbers;
                return this;
            }

            /**
             * SearchNumbers.
             */
            public Builder searchNumbers(java.util.List < SearchNumbers> searchNumbers) {
                this.searchNumbers = searchNumbers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
