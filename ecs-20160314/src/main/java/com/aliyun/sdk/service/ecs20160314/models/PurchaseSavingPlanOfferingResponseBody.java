// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseSavingPlanOfferingResponseBody} extends {@link TeaModel}
 *
 * <p>PurchaseSavingPlanOfferingResponseBody</p>
 */
public class PurchaseSavingPlanOfferingResponseBody extends TeaModel {
    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SavingPlanIdSets")
    private java.util.List < String > savingPlanIdSets;

    private PurchaseSavingPlanOfferingResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.savingPlanIdSets = builder.savingPlanIdSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseSavingPlanOfferingResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return savingPlanIdSets
     */
    public java.util.List < String > getSavingPlanIdSets() {
        return this.savingPlanIdSets;
    }

    public static final class Builder {
        private String orderId; 
        private String requestId; 
        private java.util.List < String > savingPlanIdSets; 

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
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
         * SavingPlanIdSets.
         */
        public Builder savingPlanIdSets(java.util.List < String > savingPlanIdSets) {
            this.savingPlanIdSets = savingPlanIdSets;
            return this;
        }

        public PurchaseSavingPlanOfferingResponseBody build() {
            return new PurchaseSavingPlanOfferingResponseBody(this);
        } 

    } 

}
