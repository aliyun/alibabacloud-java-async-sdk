// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCrowdLabelResponseBody} extends {@link TeaModel}
 *
 * <p>GetCrowdLabelResponseBody</p>
 */
public class GetCrowdLabelResponseBody extends TeaModel {
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

    private GetCrowdLabelResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrowdLabelResponseBody create() {
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

        public GetCrowdLabelResponseBody build() {
            return new GetCrowdLabelResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ClosingDate")
        private String closingDate;

        @NameInMap("LabelName")
        private String labelName;

        @NameInMap("OrderAmount")
        private Double orderAmount;

        @NameInMap("PurchaseAmount")
        private Double purchaseAmount;

        @NameInMap("SearchVolume")
        private Double searchVolume;

        private Data(Builder builder) {
            this.closingDate = builder.closingDate;
            this.labelName = builder.labelName;
            this.orderAmount = builder.orderAmount;
            this.purchaseAmount = builder.purchaseAmount;
            this.searchVolume = builder.searchVolume;
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
         * @return labelName
         */
        public String getLabelName() {
            return this.labelName;
        }

        /**
         * @return orderAmount
         */
        public Double getOrderAmount() {
            return this.orderAmount;
        }

        /**
         * @return purchaseAmount
         */
        public Double getPurchaseAmount() {
            return this.purchaseAmount;
        }

        /**
         * @return searchVolume
         */
        public Double getSearchVolume() {
            return this.searchVolume;
        }

        public static final class Builder {
            private String closingDate; 
            private String labelName; 
            private Double orderAmount; 
            private Double purchaseAmount; 
            private Double searchVolume; 

            /**
             * ClosingDate.
             */
            public Builder closingDate(String closingDate) {
                this.closingDate = closingDate;
                return this;
            }

            /**
             * LabelName.
             */
            public Builder labelName(String labelName) {
                this.labelName = labelName;
                return this;
            }

            /**
             * OrderAmount.
             */
            public Builder orderAmount(Double orderAmount) {
                this.orderAmount = orderAmount;
                return this;
            }

            /**
             * PurchaseAmount.
             */
            public Builder purchaseAmount(Double purchaseAmount) {
                this.purchaseAmount = purchaseAmount;
                return this;
            }

            /**
             * SearchVolume.
             */
            public Builder searchVolume(Double searchVolume) {
                this.searchVolume = searchVolume;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
