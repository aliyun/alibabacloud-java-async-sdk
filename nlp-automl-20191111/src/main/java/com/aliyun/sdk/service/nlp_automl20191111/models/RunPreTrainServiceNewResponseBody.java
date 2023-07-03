// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunPreTrainServiceNewResponseBody} extends {@link TeaModel}
 *
 * <p>RunPreTrainServiceNewResponseBody</p>
 */
public class RunPreTrainServiceNewResponseBody extends TeaModel {
    @NameInMap("BillingCount")
    private Integer billingCount;

    @NameInMap("PredictResult")
    private String predictResult;

    @NameInMap("RequestId")
    private String requestId;

    private RunPreTrainServiceNewResponseBody(Builder builder) {
        this.billingCount = builder.billingCount;
        this.predictResult = builder.predictResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunPreTrainServiceNewResponseBody create() {
        return builder().build();
    }

    /**
     * @return billingCount
     */
    public Integer getBillingCount() {
        return this.billingCount;
    }

    /**
     * @return predictResult
     */
    public String getPredictResult() {
        return this.predictResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer billingCount; 
        private String predictResult; 
        private String requestId; 

        /**
         * BillingCount.
         */
        public Builder billingCount(Integer billingCount) {
            this.billingCount = billingCount;
            return this;
        }

        /**
         * PredictResult.
         */
        public Builder predictResult(String predictResult) {
            this.predictResult = predictResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunPreTrainServiceNewResponseBody build() {
            return new RunPreTrainServiceNewResponseBody(this);
        } 

    } 

}
