// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendWordAndIndexResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrendWordAndIndexResponseBody</p>
 */
public class GetTrendWordAndIndexResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Massage")
    private String massage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessResponse")
    private String successResponse;

    private GetTrendWordAndIndexResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.massage = builder.massage;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrendWordAndIndexResponseBody create() {
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
     * @return massage
     */
    public String getMassage() {
        return this.massage;
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
        private String massage; 
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
         * Massage.
         */
        public Builder massage(String massage) {
            this.massage = massage;
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

        public GetTrendWordAndIndexResponseBody build() {
            return new GetTrendWordAndIndexResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BrandIndex")
        private Float brandIndex;

        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("EcommerceIndex")
        private Float ecommerceIndex;

        @NameInMap("InstitutionalIndex")
        private Float institutionalIndex;

        @NameInMap("MediaIndex")
        private Float mediaIndex;

        @NameInMap("SocialIndex")
        private Float socialIndex;

        @NameInMap("TrendIndex")
        private Float trendIndex;

        @NameInMap("TrendWord")
        private String trendWord;

        @NameInMap("YearMonth")
        private String yearMonth;

        private Data(Builder builder) {
            this.brandIndex = builder.brandIndex;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.ecommerceIndex = builder.ecommerceIndex;
            this.institutionalIndex = builder.institutionalIndex;
            this.mediaIndex = builder.mediaIndex;
            this.socialIndex = builder.socialIndex;
            this.trendIndex = builder.trendIndex;
            this.trendWord = builder.trendWord;
            this.yearMonth = builder.yearMonth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return brandIndex
         */
        public Float getBrandIndex() {
            return this.brandIndex;
        }

        /**
         * @return cateId
         */
        public Long getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return ecommerceIndex
         */
        public Float getEcommerceIndex() {
            return this.ecommerceIndex;
        }

        /**
         * @return institutionalIndex
         */
        public Float getInstitutionalIndex() {
            return this.institutionalIndex;
        }

        /**
         * @return mediaIndex
         */
        public Float getMediaIndex() {
            return this.mediaIndex;
        }

        /**
         * @return socialIndex
         */
        public Float getSocialIndex() {
            return this.socialIndex;
        }

        /**
         * @return trendIndex
         */
        public Float getTrendIndex() {
            return this.trendIndex;
        }

        /**
         * @return trendWord
         */
        public String getTrendWord() {
            return this.trendWord;
        }

        /**
         * @return yearMonth
         */
        public String getYearMonth() {
            return this.yearMonth;
        }

        public static final class Builder {
            private Float brandIndex; 
            private Long cateId; 
            private String cateName; 
            private Float ecommerceIndex; 
            private Float institutionalIndex; 
            private Float mediaIndex; 
            private Float socialIndex; 
            private Float trendIndex; 
            private String trendWord; 
            private String yearMonth; 

            /**
             * BrandIndex.
             */
            public Builder brandIndex(Float brandIndex) {
                this.brandIndex = brandIndex;
                return this;
            }

            /**
             * CateId.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * CateName.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * EcommerceIndex.
             */
            public Builder ecommerceIndex(Float ecommerceIndex) {
                this.ecommerceIndex = ecommerceIndex;
                return this;
            }

            /**
             * InstitutionalIndex.
             */
            public Builder institutionalIndex(Float institutionalIndex) {
                this.institutionalIndex = institutionalIndex;
                return this;
            }

            /**
             * MediaIndex.
             */
            public Builder mediaIndex(Float mediaIndex) {
                this.mediaIndex = mediaIndex;
                return this;
            }

            /**
             * SocialIndex.
             */
            public Builder socialIndex(Float socialIndex) {
                this.socialIndex = socialIndex;
                return this;
            }

            /**
             * TrendIndex.
             */
            public Builder trendIndex(Float trendIndex) {
                this.trendIndex = trendIndex;
                return this;
            }

            /**
             * TrendWord.
             */
            public Builder trendWord(String trendWord) {
                this.trendWord = trendWord;
                return this;
            }

            /**
             * YearMonth.
             */
            public Builder yearMonth(String yearMonth) {
                this.yearMonth = yearMonth;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
