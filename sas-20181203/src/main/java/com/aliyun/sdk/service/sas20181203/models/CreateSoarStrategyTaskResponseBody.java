// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSoarStrategyTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSoarStrategyTaskResponseBody</p>
 */
public class CreateSoarStrategyTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StrategyTaskId")
    private Long strategyTaskId;

    private CreateSoarStrategyTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategyTaskId = builder.strategyTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSoarStrategyTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategyTaskId
     */
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

    public static final class Builder {
        private String requestId; 
        private Long strategyTaskId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the policy task.
         */
        public Builder strategyTaskId(Long strategyTaskId) {
            this.strategyTaskId = strategyTaskId;
            return this;
        }

        public CreateSoarStrategyTaskResponseBody build() {
            return new CreateSoarStrategyTaskResponseBody(this);
        } 

    } 

}
