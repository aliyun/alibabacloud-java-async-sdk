// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCalculationJobsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCalculationJobsResponseBody</p>
 */
public class CreateCalculationJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CalculationJobIds")
    private java.util.List < String > calculationJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCalculationJobsResponseBody(Builder builder) {
        this.calculationJobIds = builder.calculationJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCalculationJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return calculationJobIds
     */
    public java.util.List < String > getCalculationJobIds() {
        return this.calculationJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > calculationJobIds; 
        private String requestId; 

        /**
         * CalculationJobIds.
         */
        public Builder calculationJobIds(java.util.List < String > calculationJobIds) {
            this.calculationJobIds = calculationJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCalculationJobsResponseBody build() {
            return new CreateCalculationJobsResponseBody(this);
        } 

    } 

}
