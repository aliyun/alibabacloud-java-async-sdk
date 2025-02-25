// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelservice20220614.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonthAmountResponseBody} extends {@link TeaModel}
 *
 * <p>GetMonthAmountResponseBody</p>
 */
public class GetMonthAmountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackgroundAmount")
    private Integer backgroundAmount;

    @com.aliyun.core.annotation.NameInMap("PostpayAmount")
    private Integer postpayAmount;

    @com.aliyun.core.annotation.NameInMap("PrepayAmount")
    private Integer prepayAmount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalAmount")
    private Integer totalAmount;

    private GetMonthAmountResponseBody(Builder builder) {
        this.backgroundAmount = builder.backgroundAmount;
        this.postpayAmount = builder.postpayAmount;
        this.prepayAmount = builder.prepayAmount;
        this.requestId = builder.requestId;
        this.totalAmount = builder.totalAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonthAmountResponseBody create() {
        return builder().build();
    }

    /**
     * @return backgroundAmount
     */
    public Integer getBackgroundAmount() {
        return this.backgroundAmount;
    }

    /**
     * @return postpayAmount
     */
    public Integer getPostpayAmount() {
        return this.postpayAmount;
    }

    /**
     * @return prepayAmount
     */
    public Integer getPrepayAmount() {
        return this.prepayAmount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalAmount
     */
    public Integer getTotalAmount() {
        return this.totalAmount;
    }

    public static final class Builder {
        private Integer backgroundAmount; 
        private Integer postpayAmount; 
        private Integer prepayAmount; 
        private String requestId; 
        private Integer totalAmount; 

        /**
         * BackgroundAmount.
         */
        public Builder backgroundAmount(Integer backgroundAmount) {
            this.backgroundAmount = backgroundAmount;
            return this;
        }

        /**
         * PostpayAmount.
         */
        public Builder postpayAmount(Integer postpayAmount) {
            this.postpayAmount = postpayAmount;
            return this;
        }

        /**
         * PrepayAmount.
         */
        public Builder prepayAmount(Integer prepayAmount) {
            this.prepayAmount = prepayAmount;
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
         * TotalAmount.
         */
        public Builder totalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public GetMonthAmountResponseBody build() {
            return new GetMonthAmountResponseBody(this);
        } 

    } 

}
