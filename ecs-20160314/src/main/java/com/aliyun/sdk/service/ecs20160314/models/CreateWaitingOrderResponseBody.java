// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWaitingOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWaitingOrderResponseBody</p>
 */
public class CreateWaitingOrderResponseBody extends TeaModel {
    @NameInMap("DryRunResult")
    private String dryRunResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WaitTimeCycle")
    private String waitTimeCycle;

    @NameInMap("WaitTimeValue")
    private Integer waitTimeValue;

    @NameInMap("WaitingOrderId")
    private String waitingOrderId;

    private CreateWaitingOrderResponseBody(Builder builder) {
        this.dryRunResult = builder.dryRunResult;
        this.requestId = builder.requestId;
        this.waitTimeCycle = builder.waitTimeCycle;
        this.waitTimeValue = builder.waitTimeValue;
        this.waitingOrderId = builder.waitingOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWaitingOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return dryRunResult
     */
    public String getDryRunResult() {
        return this.dryRunResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return waitTimeCycle
     */
    public String getWaitTimeCycle() {
        return this.waitTimeCycle;
    }

    /**
     * @return waitTimeValue
     */
    public Integer getWaitTimeValue() {
        return this.waitTimeValue;
    }

    /**
     * @return waitingOrderId
     */
    public String getWaitingOrderId() {
        return this.waitingOrderId;
    }

    public static final class Builder {
        private String dryRunResult; 
        private String requestId; 
        private String waitTimeCycle; 
        private Integer waitTimeValue; 
        private String waitingOrderId; 

        /**
         * DryRunResult.
         */
        public Builder dryRunResult(String dryRunResult) {
            this.dryRunResult = dryRunResult;
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
         * WaitTimeCycle.
         */
        public Builder waitTimeCycle(String waitTimeCycle) {
            this.waitTimeCycle = waitTimeCycle;
            return this;
        }

        /**
         * WaitTimeValue.
         */
        public Builder waitTimeValue(Integer waitTimeValue) {
            this.waitTimeValue = waitTimeValue;
            return this;
        }

        /**
         * WaitingOrderId.
         */
        public Builder waitingOrderId(String waitingOrderId) {
            this.waitingOrderId = waitingOrderId;
            return this;
        }

        public CreateWaitingOrderResponseBody build() {
            return new CreateWaitingOrderResponseBody(this);
        } 

    } 

}
