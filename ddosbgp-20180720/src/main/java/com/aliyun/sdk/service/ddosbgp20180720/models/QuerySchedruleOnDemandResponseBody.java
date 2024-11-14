// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the on-demand instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-z2q1qzxb****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A8F9980-5ACB-497F-9F15-48E9D6B29028</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations of the scheduling rule.</p>
         */
        public Builder ruleConfig(java.util.List < RuleConfig> ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * <p>The status of the scheduling rule.</p>
         */
        public Builder ruleStatus(java.util.List < RuleStatus> ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>171986973287****</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public QuerySchedruleOnDemandResponseBody build() {
            return new QuerySchedruleOnDemandResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySchedruleOnDemandResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySchedruleOnDemandResponseBody</p>
     */
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
             * <p>The scheduling action. The value is set to <strong>declare</strong>, which indicates that the route is advertised.</p>
             * 
             * <strong>example:</strong>
             * <p>declare</p>
             */
            public Builder ruleAction(String ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * <p>If the inbound bandwidth or packets consecutively exceed the threshold for the specified number of times, the scheduling rule is triggered and traffic is rerouted to the on-demand instance. The specified number of times is the value of this parameter.</p>
             * <blockquote>
             * <p> The threshold of inbound bandwidth is the value of <strong>RuleConditionMbps</strong>. The threshold of inbound packets is the value of <strong>RuleConditionKpps</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ruleConditionCnt(String ruleConditionCnt) {
                this.ruleConditionCnt = ruleConditionCnt;
                return this;
            }

            /**
             * <p>The threshold of inbound packets. Unit: kilo packets per second (Kpps). Minimum value: <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ruleConditionKpps(String ruleConditionKpps) {
                this.ruleConditionKpps = ruleConditionKpps;
                return this;
            }

            /**
             * <p>The threshold of inbound bandwidth. Unit: Mbit/s. Minimum value: <strong>100</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ruleConditionMbps(String ruleConditionMbps) {
                this.ruleConditionMbps = ruleConditionMbps;
                return this;
            }

            /**
             * <p>The name of the scheduling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ddosbgp-cn-z2q1qzxb****</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Indicates whether the scheduling rule is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: enabled.</li>
             * <li><strong>off</strong>: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder ruleSwitch(String ruleSwitch) {
                this.ruleSwitch = ruleSwitch;
                return this;
            }

            /**
             * <p>The start time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the <code>hh:mm</code> format.</p>
             * <p>If the system detects that DDoS attacks stop, the system no longer reroutes traffic to the on-demand instance from the time you specified. We recommend that you set this parameter to a value that is defined as off-peak hours.</p>
             * <blockquote>
             * <p> This parameter takes effect only when the value of <strong>RuleUndoMode</strong> is <strong>auto</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>03:00</p>
             */
            public Builder ruleUndoBeginTime(String ruleUndoBeginTime) {
                this.ruleUndoBeginTime = ruleUndoBeginTime;
                return this;
            }

            /**
             * <p>The end time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the <code>hh:mm</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>03:05</p>
             */
            public Builder ruleUndoEndTime(String ruleUndoEndTime) {
                this.ruleUndoEndTime = ruleUndoEndTime;
                return this;
            }

            /**
             * <p>The stop method of the scheduling rule. Valid values:</p>
             * <ul>
             * <li><strong>auto</strong></li>
             * <li><strong>manual</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder ruleUndoMode(String ruleUndoMode) {
                this.ruleUndoMode = ruleUndoMode;
                return this;
            }

            /**
             * <p>The time zone of the time when the scheduling rule automatically stops. The time zone must be in the <code>GMT-hh:mm</code> format.</p>
             * <p>For example, the value <code>GMT-08:00</code> indicates that the time zone is UTC+8.</p>
             * <blockquote>
             * <p> This parameter takes effect only when the value of <strong>RuleUndoMode</strong> is <strong>auto</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GMT-08:00</p>
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
    /**
     * 
     * {@link QuerySchedruleOnDemandResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySchedruleOnDemandResponseBody</p>
     */
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
             * <p>The CIDR block of the on-demand instance.</p>
             * 
             * <strong>example:</strong>
             * <p>47.<em><strong>.</strong></em>.0/24</p>
             */
            public Builder net(String net) {
                this.net = net;
                return this;
            }

            /**
             * <p>The scheduling status. Valid values:</p>
             * <ul>
             * <li><strong>scheduled</strong></li>
             * <li><strong>unscheduled</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>unscheduled</p>
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
