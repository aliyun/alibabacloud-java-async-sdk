// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendImageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrendImageDetailResponseBody</p>
 */
public class GetTrendImageDetailResponseBody extends TeaModel {
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

    private GetTrendImageDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrendImageDetailResponseBody create() {
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

        public GetTrendImageDetailResponseBody build() {
            return new GetTrendImageDetailResponseBody(this);
        } 

    } 

    public static class SimilarGoods extends TeaModel {
        @NameInMap("AiImgUrl")
        private String aiImgUrl;

        @NameInMap("GoodsSales")
        private Long goodsSales;

        @NameInMap("SearchVolume")
        private Long searchVolume;

        private SimilarGoods(Builder builder) {
            this.aiImgUrl = builder.aiImgUrl;
            this.goodsSales = builder.goodsSales;
            this.searchVolume = builder.searchVolume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimilarGoods create() {
            return builder().build();
        }

        /**
         * @return aiImgUrl
         */
        public String getAiImgUrl() {
            return this.aiImgUrl;
        }

        /**
         * @return goodsSales
         */
        public Long getGoodsSales() {
            return this.goodsSales;
        }

        /**
         * @return searchVolume
         */
        public Long getSearchVolume() {
            return this.searchVolume;
        }

        public static final class Builder {
            private String aiImgUrl; 
            private Long goodsSales; 
            private Long searchVolume; 

            /**
             * AiImgUrl.
             */
            public Builder aiImgUrl(String aiImgUrl) {
                this.aiImgUrl = aiImgUrl;
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
             * SearchVolume.
             */
            public Builder searchVolume(Long searchVolume) {
                this.searchVolume = searchVolume;
                return this;
            }

            public SimilarGoods build() {
                return new SimilarGoods(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AiImgId")
        private String aiImgId;

        @NameInMap("AiImgUrl")
        private String aiImgUrl;

        @NameInMap("MultiPictUrl")
        private String multiPictUrl;

        @NameInMap("Population")
        private String population;

        @NameInMap("PriceMax")
        private Long priceMax;

        @NameInMap("PriceMin")
        private Long priceMin;

        @NameInMap("SimilarGoods")
        private java.util.List < SimilarGoods> similarGoods;

        @NameInMap("Tags")
        private String tags;

        private Data(Builder builder) {
            this.aiImgId = builder.aiImgId;
            this.aiImgUrl = builder.aiImgUrl;
            this.multiPictUrl = builder.multiPictUrl;
            this.population = builder.population;
            this.priceMax = builder.priceMax;
            this.priceMin = builder.priceMin;
            this.similarGoods = builder.similarGoods;
            this.tags = builder.tags;
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
         * @return multiPictUrl
         */
        public String getMultiPictUrl() {
            return this.multiPictUrl;
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

        /**
         * @return similarGoods
         */
        public java.util.List < SimilarGoods> getSimilarGoods() {
            return this.similarGoods;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String aiImgId; 
            private String aiImgUrl; 
            private String multiPictUrl; 
            private String population; 
            private Long priceMax; 
            private Long priceMin; 
            private java.util.List < SimilarGoods> similarGoods; 
            private String tags; 

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
             * MultiPictUrl.
             */
            public Builder multiPictUrl(String multiPictUrl) {
                this.multiPictUrl = multiPictUrl;
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

            /**
             * SimilarGoods.
             */
            public Builder similarGoods(java.util.List < SimilarGoods> similarGoods) {
                this.similarGoods = similarGoods;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
