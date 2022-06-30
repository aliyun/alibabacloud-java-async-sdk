// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpportunityMarketResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpportunityMarketResponseBody</p>
 */
public class GetOpportunityMarketResponseBody extends TeaModel {
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

    private GetOpportunityMarketResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpportunityMarketResponseBody create() {
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
         * RequestId.
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

        public GetOpportunityMarketResponseBody build() {
            return new GetOpportunityMarketResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CateName")
        private String cateName;

        @NameInMap("OpportunityIndex")
        private Double opportunityIndex;

        @NameInMap("RelativeCommodity")
        private Double relativeCommodity;

        @NameInMap("RelativeDischarge")
        private Double relativeDischarge;

        @NameInMap("TimeUnit")
        private String timeUnit;

        private Data(Builder builder) {
            this.cateName = builder.cateName;
            this.opportunityIndex = builder.opportunityIndex;
            this.relativeCommodity = builder.relativeCommodity;
            this.relativeDischarge = builder.relativeDischarge;
            this.timeUnit = builder.timeUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return opportunityIndex
         */
        public Double getOpportunityIndex() {
            return this.opportunityIndex;
        }

        /**
         * @return relativeCommodity
         */
        public Double getRelativeCommodity() {
            return this.relativeCommodity;
        }

        /**
         * @return relativeDischarge
         */
        public Double getRelativeDischarge() {
            return this.relativeDischarge;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public static final class Builder {
            private String cateName; 
            private Double opportunityIndex; 
            private Double relativeCommodity; 
            private Double relativeDischarge; 
            private String timeUnit; 

            /**
             * CateName.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * OpportunityIndex.
             */
            public Builder opportunityIndex(Double opportunityIndex) {
                this.opportunityIndex = opportunityIndex;
                return this;
            }

            /**
             * RelativeCommodity.
             */
            public Builder relativeCommodity(Double relativeCommodity) {
                this.relativeCommodity = relativeCommodity;
                return this;
            }

            /**
             * RelativeDischarge.
             */
            public Builder relativeDischarge(Double relativeDischarge) {
                this.relativeDischarge = relativeDischarge;
                return this;
            }

            /**
             * TimeUnit.
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
