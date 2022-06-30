// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendIndexResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrendIndexResponseBody</p>
 */
public class GetTrendIndexResponseBody extends TeaModel {
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

    private GetTrendIndexResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrendIndexResponseBody create() {
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

        public GetTrendIndexResponseBody build() {
            return new GetTrendIndexResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BrandIndex")
        private Float brandIndex;

        @NameInMap("ECommerceIndex")
        private Float eCommerceIndex;

        @NameInMap("InstitutionalIndex")
        private Float institutionalIndex;

        @NameInMap("MediaIndex")
        private Float mediaIndex;

        @NameInMap("SocialIndex")
        private Float socialIndex;

        @NameInMap("TrendIndex")
        private Float trendIndex;

        @NameInMap("YearMonth")
        private String yearMonth;

        private Data(Builder builder) {
            this.brandIndex = builder.brandIndex;
            this.eCommerceIndex = builder.eCommerceIndex;
            this.institutionalIndex = builder.institutionalIndex;
            this.mediaIndex = builder.mediaIndex;
            this.socialIndex = builder.socialIndex;
            this.trendIndex = builder.trendIndex;
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
         * @return eCommerceIndex
         */
        public Float getECommerceIndex() {
            return this.eCommerceIndex;
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
         * @return yearMonth
         */
        public String getYearMonth() {
            return this.yearMonth;
        }

        public static final class Builder {
            private Float brandIndex; 
            private Float eCommerceIndex; 
            private Float institutionalIndex; 
            private Float mediaIndex; 
            private Float socialIndex; 
            private Float trendIndex; 
            private String yearMonth; 

            /**
             * BrandIndex.
             */
            public Builder brandIndex(Float brandIndex) {
                this.brandIndex = brandIndex;
                return this;
            }

            /**
             * ECommerceIndex.
             */
            public Builder eCommerceIndex(Float eCommerceIndex) {
                this.eCommerceIndex = eCommerceIndex;
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
