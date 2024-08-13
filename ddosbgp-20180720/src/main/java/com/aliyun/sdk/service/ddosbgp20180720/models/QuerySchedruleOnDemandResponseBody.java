// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySchedruleOnDemandResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySchedruleOnDemandResponseBody</p>
 */
public class QuerySchedruleOnDemandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleConfig")
    private java.util.List < RuleConfig> ruleConfig;

    @com.aliyun.core.annotation.NameInMap("RuleStatus")
    private java.util.List < RuleStatus> ruleStatus;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private QuerySchedruleOnDemandResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.ruleConfig = builder.ruleConfig;
        this.ruleStatus = builder.ruleStatus;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySchedruleOnDemandResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleConfig
     */
    public java.util.List < RuleConfig> getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * @return ruleStatus
     */
    public java.util.List < RuleStatus> getRuleStatus() {
        return this.ruleStatus;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 
        private java.util.List < RuleConfig> ruleConfig; 
        private java.util.List < RuleStatus> ruleStatus; 
        private String userId; 

        /**
         * The ID of the on-demand instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
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
         * The configurations of the scheduling rule.
         */
        public Builder ruleConfig(java.util.List < RuleConfig> ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * The status of the scheduling rule.
         */
        public Builder ruleStatus(java.util.List < RuleStatus> ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public QuerySchedruleOnDemandResponseBody build() {
            return new QuerySchedruleOnDemandResponseBody(this);
        } 

    } 

    public static class RuleConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        @com.aliyun.core.annotation.NameInMap("RuleConditionCnt")
        private String ruleConditionCnt;

        @com.aliyun.core.annotation.NameInMap("RuleConditionKpps")
        private String ruleConditionKpps;

        @com.aliyun.core.annotation.NameInMap("RuleConditionMbps")
        private String ruleConditionMbps;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleSwitch")
        private String ruleSwitch;

        @com.aliyun.core.annotation.NameInMap("RuleUndoBeginTime")
        private String ruleUndoBeginTime;

        @com.aliyun.core.annotation.NameInMap("RuleUndoEndTime")
        private String ruleUndoEndTime;

        @com.aliyun.core.annotation.NameInMap("RuleUndoMode")
        private String ruleUndoMode;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private RuleConfig(Builder builder) {
            this.ruleAction = builder.ruleAction;
            this.ruleConditionCnt = builder.ruleConditionCnt;
            this.ruleConditionKpps = builder.ruleConditionKpps;
            this.ruleConditionMbps = builder.ruleConditionMbps;
            this.ruleName = builder.ruleName;
            this.ruleSwitch = builder.ruleSwitch;
            this.ruleUndoBeginTime = builder.ruleUndoBeginTime;
            this.ruleUndoEndTime = builder.ruleUndoEndTime;
            this.ruleUndoMode = builder.ruleUndoMode;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConfig create() {
            return builder().build();
        }

        /**
         * @return ruleAction
         */
        public String getRuleAction() {
            return this.ruleAction;
        }

        /**
         * @return ruleConditionCnt
         */
        public String getRuleConditionCnt() {
            return this.ruleConditionCnt;
        }

        /**
         * @return ruleConditionKpps
         */
        public String getRuleConditionKpps() {
            return this.ruleConditionKpps;
        }

        /**
         * @return ruleConditionMbps
         */
        public String getRuleConditionMbps() {
            return this.ruleConditionMbps;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleSwitch
         */
        public String getRuleSwitch() {
            return this.ruleSwitch;
        }

        /**
         * @return ruleUndoBeginTime
         */
        public String getRuleUndoBeginTime() {
            return this.ruleUndoBeginTime;
        }

        /**
         * @return ruleUndoEndTime
         */
        public String getRuleUndoEndTime() {
            return this.ruleUndoEndTime;
        }

        /**
         * @return ruleUndoMode
         */
        public String getRuleUndoMode() {
            return this.ruleUndoMode;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String ruleAction; 
            private String ruleConditionCnt; 
            private String ruleConditionKpps; 
            private String ruleConditionMbps; 
            private String ruleName; 
            private String ruleSwitch; 
            private String ruleUndoBeginTime; 
            private String ruleUndoEndTime; 
            private String ruleUndoMode; 
            private String timeZone; 

            /**
             * The scheduling action. The value is set to **declare**, which indicates that the route is advertised.
             */
            public Builder ruleAction(String ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * If the inbound bandwidth or packets consecutively exceed the threshold for the specified number of times, the scheduling rule is triggered and traffic is rerouted to the on-demand instance. The specified number of times is the value of this parameter.
             * <p>
             * 
             * >  The threshold of inbound bandwidth is the value of **RuleConditionMbps**. The threshold of inbound packets is the value of **RuleConditionKpps**.
             */
            public Builder ruleConditionCnt(String ruleConditionCnt) {
                this.ruleConditionCnt = ruleConditionCnt;
                return this;
            }

            /**
             * The threshold of inbound packets. Unit: kilo packets per second (Kpps). Minimum value: **10**.
             */
            public Builder ruleConditionKpps(String ruleConditionKpps) {
                this.ruleConditionKpps = ruleConditionKpps;
                return this;
            }

            /**
             * The threshold of inbound bandwidth. Unit: Mbit/s. Minimum value: **100**.
             */
            public Builder ruleConditionMbps(String ruleConditionMbps) {
                this.ruleConditionMbps = ruleConditionMbps;
                return this;
            }

            /**
             * The name of the scheduling rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Indicates whether the scheduling rule is enabled. Valid values:
             * <p>
             * 
             * *   **on**: enabled.
             * *   **off**: disabled.
             */
            public Builder ruleSwitch(String ruleSwitch) {
                this.ruleSwitch = ruleSwitch;
                return this;
            }

            /**
             * The start time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the `hh:mm` format.
             * <p>
             * 
             * If the system detects that DDoS attacks stop, the system no longer reroutes traffic to the on-demand instance from the time you specified. We recommend that you set this parameter to a value that is defined as off-peak hours.
             * 
             * >  This parameter takes effect only when the value of **RuleUndoMode** is **auto**.
             */
            public Builder ruleUndoBeginTime(String ruleUndoBeginTime) {
                this.ruleUndoBeginTime = ruleUndoBeginTime;
                return this;
            }

            /**
             * The end time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the `hh:mm` format.
             */
            public Builder ruleUndoEndTime(String ruleUndoEndTime) {
                this.ruleUndoEndTime = ruleUndoEndTime;
                return this;
            }

            /**
             * The stop method of the scheduling rule. Valid values:
             * <p>
             * 
             * *   **auto**
             * *   **manual**
             */
            public Builder ruleUndoMode(String ruleUndoMode) {
                this.ruleUndoMode = ruleUndoMode;
                return this;
            }

            /**
             * The time zone of the time when the scheduling rule automatically stops. The time zone must be in the `GMT-hh:mm` format.
             * <p>
             * 
             * For example, the value `GMT-08:00` indicates that the time zone is UTC+8.
             * 
             * >  This parameter takes effect only when the value of **RuleUndoMode** is **auto**.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public RuleConfig build() {
                return new RuleConfig(this);
            } 

        } 

    }
    public static class RuleStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Net")
        private String net;

        @com.aliyun.core.annotation.NameInMap("RuleSchedStatus")
        private String ruleSchedStatus;

        private RuleStatus(Builder builder) {
            this.net = builder.net;
            this.ruleSchedStatus = builder.ruleSchedStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleStatus create() {
            return builder().build();
        }

        /**
         * @return net
         */
        public String getNet() {
            return this.net;
        }

        /**
         * @return ruleSchedStatus
         */
        public String getRuleSchedStatus() {
            return this.ruleSchedStatus;
        }

        public static final class Builder {
            private String net; 
            private String ruleSchedStatus; 

            /**
             * The CIDR block of the on-demand instance.
             */
            public Builder net(String net) {
                this.net = net;
                return this;
            }

            /**
             * The scheduling status. Valid values:
             * <p>
             * 
             * *   **scheduled**
             * *   **unscheduled**
             */
            public Builder ruleSchedStatus(String ruleSchedStatus) {
                this.ruleSchedStatus = ruleSchedStatus;
                return this;
            }

            public RuleStatus build() {
                return new RuleStatus(this);
            } 

        } 

    }
}
