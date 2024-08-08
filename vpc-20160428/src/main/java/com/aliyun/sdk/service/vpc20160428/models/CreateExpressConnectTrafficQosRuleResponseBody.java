// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressConnectTrafficQosRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExpressConnectTrafficQosRuleResponseBody</p>
 */
public class CreateExpressConnectTrafficQosRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QosId")
    private String qosId;

    @com.aliyun.core.annotation.NameInMap("QueueId")
    private String queueId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    private CreateExpressConnectTrafficQosRuleResponseBody(Builder builder) {
        this.qosId = builder.qosId;
        this.queueId = builder.queueId;
        this.requestId = builder.requestId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressConnectTrafficQosRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return qosId
     */
    public String getQosId() {
        return this.qosId;
    }

    /**
     * @return queueId
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder {
        private String qosId; 
        private String queueId; 
        private String requestId; 
        private String ruleId; 

        /**
         * The ID of the QoS policy.
         */
        public Builder qosId(String qosId) {
            this.qosId = qosId;
            return this;
        }

        /**
         * The ID of the QoS queue.
         */
        public Builder queueId(String queueId) {
            this.queueId = queueId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the QoS rule.
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public CreateExpressConnectTrafficQosRuleResponseBody build() {
            return new CreateExpressConnectTrafficQosRuleResponseBody(this);
        } 

    } 

}
