// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartAggregateConfigRuleEvaluationResponseBody} extends {@link TeaModel}
 *
 * <p>StartAggregateConfigRuleEvaluationResponseBody</p>
 */
public class StartAggregateConfigRuleEvaluationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private StartAggregateConfigRuleEvaluationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAggregateConfigRuleEvaluationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the involved resources were evaluated. Valid values:
         * <p>
         * 
         * *   true: The involved resources were evaluated.
         * *   false: The involved resources were not evaluated
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public StartAggregateConfigRuleEvaluationResponseBody build() {
            return new StartAggregateConfigRuleEvaluationResponseBody(this);
        } 

    } 

}
