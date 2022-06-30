// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendImageListResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrendImageListResponseBody</p>
 */
public class GetTrendImageListResponseBody extends TeaModel {
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

    private GetTrendImageListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrendImageListResponseBody create() {
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

        public GetTrendImageListResponseBody build() {
            return new GetTrendImageListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AiImgId")
        private String aiImgId;

        @NameInMap("AiImgUrl")
        private String aiImgUrl;

        @NameInMap("Population")
        private String population;

        @NameInMap("PriceMax")
        private Long priceMax;

        @NameInMap("PriceMin")
        private Long priceMin;

        private Data(Builder builder) {
            this.aiImgId = builder.aiImgId;
            this.aiImgUrl = builder.aiImgUrl;
            this.population = builder.population;
            this.priceMax = builder.priceMax;
            this.priceMin = builder.priceMin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aiImgId
         */
        public String getAiImgId() {
            return this.aiImgId;
        }

        /**
         * @return aiImgUrl
         */
        public String getAiImgUrl() {
            return this.aiImgUrl;
        }

        /**
         * @return population
         */
        public String getPopulation() {
            return this.population;
        }

        /**
         * @return priceMax
         */
        public Long getPriceMax() {
            return this.priceMax;
        }

        /**
         * @return priceMin
         */
        public Long getPriceMin() {
            return this.priceMin;
        }

        public static final class Builder {
            private String aiImgId; 
            private String aiImgUrl; 
            private String population; 
            private Long priceMax; 
            private Long priceMin; 

            /**
             * AiImgId.
             */
            public Builder aiImgId(String aiImgId) {
                this.aiImgId = aiImgId;
                return this;
            }

            /**
             * AiImgUrl.
             */
            public Builder aiImgUrl(String aiImgUrl) {
                this.aiImgUrl = aiImgUrl;
                return this;
            }

            /**
             * Population.
             */
            public Builder population(String population) {
                this.population = population;
                return this;
            }

            /**
             * PriceMax.
             */
            public Builder priceMax(Long priceMax) {
                this.priceMax = priceMax;
                return this;
            }

            /**
             * PriceMin.
             */
            public Builder priceMin(Long priceMin) {
                this.priceMin = priceMin;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
