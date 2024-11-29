// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-2giu0a6vd5x0mv4700</p>
         */
        public Builder qosId(String qosId) {
            this.qosId = qosId;
            return this;
        }

        /**
         * <p>The ID of the QoS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-9nyx2u7n71s2rcy4n5</p>
         */
        public Builder queueId(String queueId) {
            this.queueId = queueId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>606998F0-B94D-48FE-8316-ACA81BB230DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the QoS rule.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-rule-iugg0l9x27f2nocouj</p>
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
