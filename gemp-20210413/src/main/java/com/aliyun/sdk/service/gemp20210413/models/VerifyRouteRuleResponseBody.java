// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyRouteRuleResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyRouteRuleResponseBody</p>
 */
public class VerifyRouteRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
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
         * data.
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
        @com.aliyun.core.annotation.NameInMap("escalationPlanId")
        private Long escalationPlanId;

        @com.aliyun.core.annotation.NameInMap("escalationPlanName")
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
             * escalationPlanId.
             */
            public Builder escalationPlanId(Long escalationPlanId) {
                this.escalationPlanId = escalationPlanId;
                return this;
            }

            /**
             * escalationPlanName.
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
        @com.aliyun.core.annotation.NameInMap("subscriptionId")
        private Long subscriptionId;

        @com.aliyun.core.annotation.NameInMap("title")
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
             * subscriptionId.
             */
            public Builder subscriptionId(Long subscriptionId) {
                this.subscriptionId = subscriptionId;
                return this;
            }

            /**
             * title.
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
        @com.aliyun.core.annotation.NameInMap("escalationPlans")
        private java.util.List < EscalationPlans> escalationPlans;

        @com.aliyun.core.annotation.NameInMap("isValidRule")
        private Boolean isValidRule;

        @com.aliyun.core.annotation.NameInMap("monitorSourceIds")
        private java.util.List < Long > monitorSourceIds;

        @com.aliyun.core.annotation.NameInMap("notifySubscriptionNames")
        private java.util.List < NotifySubscriptionNames> notifySubscriptionNames;

        @com.aliyun.core.annotation.NameInMap("routeRuleFailReason")
        private java.util.List < String > routeRuleFailReason;

        @com.aliyun.core.annotation.NameInMap("routeType")
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
             * escalationPlans.
             */
            public Builder escalationPlans(java.util.List < EscalationPlans> escalationPlans) {
                this.escalationPlans = escalationPlans;
                return this;
            }

            /**
             * isValidRule.
             */
            public Builder isValidRule(Boolean isValidRule) {
                this.isValidRule = isValidRule;
                return this;
            }

            /**
             * monitorSourceIds.
             */
            public Builder monitorSourceIds(java.util.List < Long > monitorSourceIds) {
                this.monitorSourceIds = monitorSourceIds;
                return this;
            }

            /**
             * notifySubscriptionNames.
             */
            public Builder notifySubscriptionNames(java.util.List < NotifySubscriptionNames> notifySubscriptionNames) {
                this.notifySubscriptionNames = notifySubscriptionNames;
                return this;
            }

            /**
             * routeRuleFailReason.
             */
            public Builder routeRuleFailReason(java.util.List < String > routeRuleFailReason) {
                this.routeRuleFailReason = routeRuleFailReason;
                return this;
            }

            /**
             * routeType.
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
