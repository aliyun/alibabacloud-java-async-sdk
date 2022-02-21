// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyRouteRuleResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyRouteRuleResponseBody</p>
 */
public class VerifyRouteRuleResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private VerifyRouteRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyRouteRuleResponseBody create() {
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
         * 验证结果
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyRouteRuleResponseBody build() {
            return new VerifyRouteRuleResponseBody(this);
        } 

    } 

    public static class EscalationPlans extends TeaModel {
        @NameInMap("escalationPlanId")
        private Long escalationPlanId;

        @NameInMap("escalationPlanName")
        private String escalationPlanName;

        private EscalationPlans(Builder builder) {
            this.escalationPlanId = builder.escalationPlanId;
            this.escalationPlanName = builder.escalationPlanName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EscalationPlans create() {
            return builder().build();
        }

        /**
         * @return escalationPlanId
         */
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

        /**
         * @return escalationPlanName
         */
        public String getEscalationPlanName() {
            return this.escalationPlanName;
        }

        public static final class Builder {
            private Long escalationPlanId; 
            private String escalationPlanName; 

            /**
             * 升级计划ID
             */
            public Builder escalationPlanId(Long escalationPlanId) {
                this.escalationPlanId = escalationPlanId;
                return this;
            }

            /**
             * 升级计划名称
             */
            public Builder escalationPlanName(String escalationPlanName) {
                this.escalationPlanName = escalationPlanName;
                return this;
            }

            public EscalationPlans build() {
                return new EscalationPlans(this);
            } 

        } 

    }
    public static class NotifySubscriptionNames extends TeaModel {
        @NameInMap("subscriptionId")
        private Long subscriptionId;

        @NameInMap("title")
        private String title;

        private NotifySubscriptionNames(Builder builder) {
            this.subscriptionId = builder.subscriptionId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifySubscriptionNames create() {
            return builder().build();
        }

        /**
         * @return subscriptionId
         */
        public Long getSubscriptionId() {
            return this.subscriptionId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long subscriptionId; 
            private String title; 

            /**
             * 订阅ID
             */
            public Builder subscriptionId(Long subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            /**
             * 订阅名称
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public NotifySubscriptionNames build() {
                return new NotifySubscriptionNames(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("escalationPlans")
        private java.util.List < EscalationPlans> escalationPlans;

        @NameInMap("isValidRule")
        private Boolean isValidRule;

        @NameInMap("monitorSourceIds")
        private java.util.List < Long > monitorSourceIds;

        @NameInMap("notifySubscriptionNames")
        private java.util.List < NotifySubscriptionNames> notifySubscriptionNames;

        @NameInMap("routeRuleFailReason")
        private java.util.List < String > routeRuleFailReason;

        @NameInMap("routeType")
        private String routeType;

        private Data(Builder builder) {
            this.escalationPlans = builder.escalationPlans;
            this.isValidRule = builder.isValidRule;
            this.monitorSourceIds = builder.monitorSourceIds;
            this.notifySubscriptionNames = builder.notifySubscriptionNames;
            this.routeRuleFailReason = builder.routeRuleFailReason;
            this.routeType = builder.routeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return escalationPlans
         */
        public java.util.List < EscalationPlans> getEscalationPlans() {
            return this.escalationPlans;
        }

        /**
         * @return isValidRule
         */
        public Boolean getIsValidRule() {
            return this.isValidRule;
        }

        /**
         * @return monitorSourceIds
         */
        public java.util.List < Long > getMonitorSourceIds() {
            return this.monitorSourceIds;
        }

        /**
         * @return notifySubscriptionNames
         */
        public java.util.List < NotifySubscriptionNames> getNotifySubscriptionNames() {
            return this.notifySubscriptionNames;
        }

        /**
         * @return routeRuleFailReason
         */
        public java.util.List < String > getRouteRuleFailReason() {
            return this.routeRuleFailReason;
        }

        /**
         * @return routeType
         */
        public String getRouteType() {
            return this.routeType;
        }

        public static final class Builder {
            private java.util.List < EscalationPlans> escalationPlans; 
            private Boolean isValidRule; 
            private java.util.List < Long > monitorSourceIds; 
            private java.util.List < NotifySubscriptionNames> notifySubscriptionNames; 
            private java.util.List < String > routeRuleFailReason; 
            private String routeType; 

            /**
             * 升级策略名称
             */
            public Builder escalationPlans(java.util.List < EscalationPlans> escalationPlans) {
                this.escalationPlans = escalationPlans;
                return this;
            }

            /**
             * 验证是否成功
             */
            public Builder isValidRule(Boolean isValidRule) {
                this.isValidRule = isValidRule;
                return this;
            }

            /**
             * 验证失败监控源ID
             */
            public Builder monitorSourceIds(java.util.List < Long > monitorSourceIds) {
                this.monitorSourceIds = monitorSourceIds;
                return this;
            }

            /**
             * 订阅名称
             */
            public Builder notifySubscriptionNames(java.util.List < NotifySubscriptionNames> notifySubscriptionNames) {
                this.notifySubscriptionNames = notifySubscriptionNames;
                return this;
            }

            /**
             * 流转规则验证失败的原因
             */
            public Builder routeRuleFailReason(java.util.List < String > routeRuleFailReason) {
                this.routeRuleFailReason = routeRuleFailReason;
                return this;
            }

            /**
             * 事件或者报警
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
