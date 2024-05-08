// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSavingsPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSavingsPlanResponseBody</p>
 */
public class CreateSavingsPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SavingsPlanId")
    private String savingsPlanId;

    private CreateSavingsPlanResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.savingsPlanId = builder.savingsPlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSavingsPlanResponseBody create() {
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
     * @return savingsPlanId
     */
    public String getSavingsPlanId() {
        return this.savingsPlanId;
    }

    public static final class Builder {
        private String orderId; 
        private String requestId; 
        private String savingsPlanId; 

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
         * SavingsPlanId.
         */
        public Builder savingsPlanId(String savingsPlanId) {
            this.savingsPlanId = savingsPlanId;
            return this;
        }

        public CreateSavingsPlanResponseBody build() {
            return new CreateSavingsPlanResponseBody(this);
        } 

    } 

}
