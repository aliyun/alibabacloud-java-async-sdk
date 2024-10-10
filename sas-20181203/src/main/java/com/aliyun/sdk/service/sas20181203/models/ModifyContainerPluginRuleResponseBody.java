// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyContainerPluginRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyContainerPluginRuleResponseBody</p>
 */
public class ModifyContainerPluginRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyContainerPluginRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyContainerPluginRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The defense rule against container escapes.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D03DD0FD-6041-5107-AC00-383E28F1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyContainerPluginRuleResponseBody build() {
            return new ModifyContainerPluginRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyContainerPluginRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyContainerPluginRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        private Data(Builder builder) {
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.switchId = builder.switchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        public static final class Builder {
            private Long ruleId; 
            private String ruleName; 
            private String switchId; 

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>600640</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test555</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The switch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>USER-CONTAINER-RULE-SWITCH-TYPE_xxx</p>
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
