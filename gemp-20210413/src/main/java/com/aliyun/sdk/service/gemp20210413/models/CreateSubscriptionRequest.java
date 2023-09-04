// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>CreateSubscriptionRequest</p>
 */
public class CreateSubscriptionRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("endTime")
    private String endTime;

    @Body
    @NameInMap("expiredType")
    @Validation(required = true)
    private Long expiredType;

    @Body
    @NameInMap("notifyObjectList")
    @Validation(required = true)
    private java.util.List < NotifyObjectList> notifyObjectList;

    @Body
    @NameInMap("notifyObjectType")
    @Validation(required = true)
    private Long notifyObjectType;

    @Body
    @NameInMap("notifyStrategyList")
    @Validation(required = true)
    private java.util.List < NotifyStrategyList> notifyStrategyList;

    @Body
    @NameInMap("period")
    private String period;

    @Body
    @NameInMap("scope")
    @Validation(required = true)
    private Long scope;

    @Body
    @NameInMap("scopeObjectList")
    @Validation(required = true)
    private java.util.List < ScopeObjectList> scopeObjectList;

    @Body
    @NameInMap("startTime")
    private String startTime;

    @Body
    @NameInMap("subscriptionTitle")
    @Validation(required = true)
    private String subscriptionTitle;

    private CreateSubscriptionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endTime = builder.endTime;
        this.expiredType = builder.expiredType;
        this.notifyObjectList = builder.notifyObjectList;
        this.notifyObjectType = builder.notifyObjectType;
        this.notifyStrategyList = builder.notifyStrategyList;
        this.period = builder.period;
        this.scope = builder.scope;
        this.scopeObjectList = builder.scopeObjectList;
        this.startTime = builder.startTime;
        this.subscriptionTitle = builder.subscriptionTitle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubscriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return expiredType
     */
    public Long getExpiredType() {
        return this.expiredType;
    }

    /**
     * @return notifyObjectList
     */
    public java.util.List < NotifyObjectList> getNotifyObjectList() {
        return this.notifyObjectList;
    }

    /**
     * @return notifyObjectType
     */
    public Long getNotifyObjectType() {
        return this.notifyObjectType;
    }

    /**
     * @return notifyStrategyList
     */
    public java.util.List < NotifyStrategyList> getNotifyStrategyList() {
        return this.notifyStrategyList;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return scope
     */
    public Long getScope() {
        return this.scope;
    }

    /**
     * @return scopeObjectList
     */
    public java.util.List < ScopeObjectList> getScopeObjectList() {
        return this.scopeObjectList;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return subscriptionTitle
     */
    public String getSubscriptionTitle() {
        return this.subscriptionTitle;
    }

    public static final class Builder extends Request.Builder<CreateSubscriptionRequest, Builder> {
        private String clientToken; 
        private String endTime; 
        private Long expiredType; 
        private java.util.List < NotifyObjectList> notifyObjectList; 
        private Long notifyObjectType; 
        private java.util.List < NotifyStrategyList> notifyStrategyList; 
        private String period; 
        private Long scope; 
        private java.util.List < ScopeObjectList> scopeObjectList; 
        private String startTime; 
        private String subscriptionTitle; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubscriptionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endTime = request.endTime;
            this.expiredType = request.expiredType;
            this.notifyObjectList = request.notifyObjectList;
            this.notifyObjectType = request.notifyObjectType;
            this.notifyStrategyList = request.notifyStrategyList;
            this.period = request.period;
            this.scope = request.scope;
            this.scopeObjectList = request.scopeObjectList;
            this.startTime = request.startTime;
            this.subscriptionTitle = request.subscriptionTitle;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * expiredType.
         */
        public Builder expiredType(Long expiredType) {
            this.putBodyParameter("expiredType", expiredType);
            this.expiredType = expiredType;
            return this;
        }

        /**
         * notifyObjectList.
         */
        public Builder notifyObjectList(java.util.List < NotifyObjectList> notifyObjectList) {
            this.putBodyParameter("notifyObjectList", notifyObjectList);
            this.notifyObjectList = notifyObjectList;
            return this;
        }

        /**
         * notifyObjectType.
         */
        public Builder notifyObjectType(Long notifyObjectType) {
            this.putBodyParameter("notifyObjectType", notifyObjectType);
            this.notifyObjectType = notifyObjectType;
            return this;
        }

        /**
         * notifyStrategyList.
         */
        public Builder notifyStrategyList(java.util.List < NotifyStrategyList> notifyStrategyList) {
            this.putBodyParameter("notifyStrategyList", notifyStrategyList);
            this.notifyStrategyList = notifyStrategyList;
            return this;
        }

        /**
         * period.
         */
        public Builder period(String period) {
            this.putBodyParameter("period", period);
            this.period = period;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(Long scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * scopeObjectList.
         */
        public Builder scopeObjectList(java.util.List < ScopeObjectList> scopeObjectList) {
            this.putBodyParameter("scopeObjectList", scopeObjectList);
            this.scopeObjectList = scopeObjectList;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * subscriptionTitle.
         */
        public Builder subscriptionTitle(String subscriptionTitle) {
            this.putBodyParameter("subscriptionTitle", subscriptionTitle);
            this.subscriptionTitle = subscriptionTitle;
            return this;
        }

        @Override
        public CreateSubscriptionRequest build() {
            return new CreateSubscriptionRequest(this);
        } 

    } 

    public static class NotifyObjectList extends TeaModel {
        @NameInMap("notifyObjectId")
        @Validation(required = true)
        private Long notifyObjectId;

        private NotifyObjectList(Builder builder) {
            this.notifyObjectId = builder.notifyObjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyObjectList create() {
            return builder().build();
        }

        /**
         * @return notifyObjectId
         */
        public Long getNotifyObjectId() {
            return this.notifyObjectId;
        }

        public static final class Builder {
            private Long notifyObjectId; 

            /**
             * notifyObjectId.
             */
            public Builder notifyObjectId(Long notifyObjectId) {
                this.notifyObjectId = notifyObjectId;
                return this;
            }

            public NotifyObjectList build() {
                return new NotifyObjectList(this);
            } 

        } 

    }
    public static class PeriodChannel extends TeaModel {
        @NameInMap("nonWorkday")
        private String nonWorkday;

        @NameInMap("workday")
        private String workday;

        private PeriodChannel(Builder builder) {
            this.nonWorkday = builder.nonWorkday;
            this.workday = builder.workday;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeriodChannel create() {
            return builder().build();
        }

        /**
         * @return nonWorkday
         */
        public String getNonWorkday() {
            return this.nonWorkday;
        }

        /**
         * @return workday
         */
        public String getWorkday() {
            return this.workday;
        }

        public static final class Builder {
            private String nonWorkday; 
            private String workday; 

            /**
             * nonWorkday.
             */
            public Builder nonWorkday(String nonWorkday) {
                this.nonWorkday = nonWorkday;
                return this;
            }

            /**
             * workday.
             */
            public Builder workday(String workday) {
                this.workday = workday;
                return this;
            }

            public PeriodChannel build() {
                return new PeriodChannel(this);
            } 

        } 

    }
    public static class Conditions extends TeaModel {
        @NameInMap("action")
        private String action;

        @NameInMap("effection")
        private String effection;

        @NameInMap("level")
        private String level;

        @NameInMap("problemNotifyType")
        private String problemNotifyType;

        private Conditions(Builder builder) {
            this.action = builder.action;
            this.effection = builder.effection;
            this.level = builder.level;
            this.problemNotifyType = builder.problemNotifyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return effection
         */
        public String getEffection() {
            return this.effection;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return problemNotifyType
         */
        public String getProblemNotifyType() {
            return this.problemNotifyType;
        }

        public static final class Builder {
            private String action; 
            private String effection; 
            private String level; 
            private String problemNotifyType; 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * effection.
             */
            public Builder effection(String effection) {
                this.effection = effection;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * problemNotifyType.
             */
            public Builder problemNotifyType(String problemNotifyType) {
                this.problemNotifyType = problemNotifyType;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    public static class Strategies extends TeaModel {
        @NameInMap("conditions")
        private java.util.List < Conditions> conditions;

        private Strategies(Builder builder) {
            this.conditions = builder.conditions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategies create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
        }

        public static final class Builder {
            private java.util.List < Conditions> conditions; 

            /**
             * conditions.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            public Strategies build() {
                return new Strategies(this);
            } 

        } 

    }
    public static class NotifyStrategyList extends TeaModel {
        @NameInMap("channels")
        @Validation(required = true)
        private String channels;

        @NameInMap("instanceType")
        @Validation(required = true)
        private Long instanceType;

        @NameInMap("periodChannel")
        private PeriodChannel periodChannel;

        @NameInMap("strategies")
        @Validation(required = true)
        private java.util.List < Strategies> strategies;

        private NotifyStrategyList(Builder builder) {
            this.channels = builder.channels;
            this.instanceType = builder.instanceType;
            this.periodChannel = builder.periodChannel;
            this.strategies = builder.strategies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyStrategyList create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public String getChannels() {
            return this.channels;
        }

        /**
         * @return instanceType
         */
        public Long getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return periodChannel
         */
        public PeriodChannel getPeriodChannel() {
            return this.periodChannel;
        }

        /**
         * @return strategies
         */
        public java.util.List < Strategies> getStrategies() {
            return this.strategies;
        }

        public static final class Builder {
            private String channels; 
            private Long instanceType; 
            private PeriodChannel periodChannel; 
            private java.util.List < Strategies> strategies; 

            /**
             * channels.
             */
            public Builder channels(String channels) {
                this.channels = channels;
                return this;
            }

            /**
             * instanceType.
             */
            public Builder instanceType(Long instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * periodChannel.
             */
            public Builder periodChannel(PeriodChannel periodChannel) {
                this.periodChannel = periodChannel;
                return this;
            }

            /**
             * strategies.
             */
            public Builder strategies(java.util.List < Strategies> strategies) {
                this.strategies = strategies;
                return this;
            }

            public NotifyStrategyList build() {
                return new NotifyStrategyList(this);
            } 

        } 

    }
    public static class ScopeObjectList extends TeaModel {
        @NameInMap("scopeObjectId")
        @Validation(required = true)
        private Long scopeObjectId;

        private ScopeObjectList(Builder builder) {
            this.scopeObjectId = builder.scopeObjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeObjectList create() {
            return builder().build();
        }

        /**
         * @return scopeObjectId
         */
        public Long getScopeObjectId() {
            return this.scopeObjectId;
        }

        public static final class Builder {
            private Long scopeObjectId; 

            /**
             * scopeObjectId.
             */
            public Builder scopeObjectId(Long scopeObjectId) {
                this.scopeObjectId = scopeObjectId;
                return this;
            }

            public ScopeObjectList build() {
                return new ScopeObjectList(this);
            } 

        } 

    }
}
